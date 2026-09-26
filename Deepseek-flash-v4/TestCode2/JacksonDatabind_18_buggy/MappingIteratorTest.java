package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import org.junit.*;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class MappingIteratorTest {

    private JsonFactory jsonFactory;

    @Before
    public void setUp() {
        jsonFactory = new JsonFactory();
    }

    @After
    public void tearDown() {
        jsonFactory = null;
    }

    // ----------------------------------------------------------------------
    // Deserializer stubs
    // ----------------------------------------------------------------------

    private static class StringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return p.getText();
        }
    }

    private static class ThrowingMappingDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new JsonMappingException(p, "mapping");
        }
    }

    private static class ThrowingIoDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new IOException("io");
        }
    }

    private static class StringBuilderDeserializer extends JsonDeserializer<StringBuilder> {
        @Override
        public StringBuilder deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return new StringBuilder(p.getText());
        }

        @Override
        public StringBuilder deserialize(JsonParser p, DeserializationContext ctxt, StringBuilder intoValue)
                throws IOException {
            return intoValue.append(p.getText());
        }
    }

    // ----------------------------------------------------------------------
    // Helpers
    // ----------------------------------------------------------------------

    private MappingIterator<String> managedArray(String json, JsonDeserializer<String> deser,
                                                 boolean managed, Object update) throws IOException {
        JsonParser p = jsonFactory.createParser(json);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        return new MappingIterator<>(null, p, null, deser, managed, update);
    }

    // ----------------------------------------------------------------------
    // Tests
    // ----------------------------------------------------------------------

    @Test
    public void testEmptyIterator() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
        assertFalse(it.hasNextValue());
        assertEquals(0, it.readAll().size());
        it.close();  // should not throw
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextOnEmptyIteratorThrows() throws Exception {
        MappingIterator.emptyIterator().next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextValueOnEmptyIteratorThrows() throws Exception {
        MappingIterator.emptyIterator().nextValue();
    }

    @Test
    public void testManagedArrayReadAll() throws Exception {
        MappingIterator<String> it = managedArray("[\"a\",\"b\"]", new StringDeserializer(), true, null);
        assertEquals(Arrays.asList("a", "b"), it.readAll());
        assertNull(it.getParser());
    }

    @Test
    public void testNextSequenceForManagedArray() throws Exception {
        MappingIterator<String> it = managedArray("[\"a\",\"b\"]", new StringDeserializer(), true, null);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
        assertNull(it.getParser());
    }

    @Test
    public void testNextValueDirectly() throws Exception {
        MappingIterator<String> it = managedArray("[\"a\",\"b\"]", new StringDeserializer(), true, null);
        assertEquals("a", it.nextValue());
        assertEquals("b", it.nextValue());
        assertFalse(it.hasNextValue());
    }

    @Test
    public void testReadAllIntoList() throws Exception {
        List<String> list = new ArrayList<>();
        MappingIterator<String> it = managedArray("[\"a\",\"b\"]", new StringDeserializer(), true, null);
        assertSame(list, it.readAll(list));
        assertEquals(Arrays.asList("a", "b"), list);
    }

    @Test
    public void testReadAllIntoCollection() throws Exception {
        Set<String> set = new HashSet<>();
        MappingIterator<String> it = managedArray("[\"a\",\"a\"]", new StringDeserializer(), true, null);
        Collection<String> result = it.readAll(set);
        assertSame(set, result);
        assertEquals(Collections.singleton("a"), set);
    }

    @Test
    public void testManagedEmptyArrayClosesParser() throws Exception {
        JsonParser p = jsonFactory.createParser("[]");
        p.nextToken(); // START_ARRAY
        MappingIterator<String> it = new MappingIterator<>(null, p, null, new StringDeserializer(), true, null);
        assertFalse(it.hasNextValue());
        assertNull(it.getParser());
        assertTrue(p.isClosed());
    }

    @Test
    public void testNonManagedParserNotClosedOnEof() throws Exception {
        JsonParser p = jsonFactory.createParser("\"a\"");
        p.nextToken(); // VALUE_STRING
        MappingIterator<String> it = new MappingIterator<>(null, p, null, new StringDeserializer(), false, null);
        assertEquals("a", it.nextValue());
        assertFalse(it.hasNextValue());
        assertNull(it.getParser());
        assertFalse(p.isClosed());
    }

    @Test
    public void testUpdateValueReusesObject() throws Exception {
        JsonParser p = jsonFactory.createParser("[\"a\",\"b\"]");
        p.nextToken(); // START_ARRAY
        StringBuilder sb = new StringBuilder("prefix-");
        MappingIterator<StringBuilder> it =
                new MappingIterator<>(null, p, null, new StringBuilderDeserializer(), true, sb);

        assertSame(sb, it.nextValue());
        assertEquals("prefix-a", sb.toString());
        assertSame(sb, it.nextValue());
        assertEquals("prefix-ab", sb.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveThrows() throws Exception {
        MappingIterator<String> it = managedArray("[\"a\"]", new StringDeserializer(), true, null);
        it.remove();
    }

    @Test
    public void testCloseClosesParser() throws Exception {
        JsonParser p = jsonFactory.createParser("[1]");
        p.nextToken(); // START_ARRAY
        MappingIterator<String> it = new MappingIterator<>(null, p, null, new StringDeserializer(), false, null);
        it.close();
        assertTrue(p.isClosed());
        it.close(); // closing twice is fine
    }

    @Test
    public void testGetParserDelegates() throws Exception {
        JsonParser p = jsonFactory.createParser("\"a\"");
        p.nextToken();
        MappingIterator<String> it = new MappingIterator<>(null, p, null, new StringDeserializer(), false, null);
        assertSame(p, it.getParser());
        assertNull(it.getParserSchema());
        assertNotNull(it.getCurrentLocation());
    }

    @Test(expected = RuntimeJsonMappingException.class)
    public void testNextWrapsJsonMappingException() throws Exception {
        MappingIterator<String> it = managedArray("[\"a\"]", new ThrowingMappingDeserializer(), true, null);
        it.next();
    }

    @Test(expected = RuntimeException.class)
    public void testNextWrapsIOException() throws Exception {
        MappingIterator<String> it = managedArray("[\"a\"]", new ThrowingIoDeserializer(), true, null);
        it.next();
    }

    @Test
    public void testReadAllPropagatesIOException() throws Exception {
        MappingIterator<String> it = managedArray("[\"a\"]", new ThrowingIoDeserializer(), true, null);
        try {
            it.readAll();
            fail("Should have thrown IOException");
        } catch (IOException e) {
            assertEquals("io", e.getMessage());
        }
    }

    @Test
    public void testHasNextCatchesIOException() throws Exception {
        JsonParser p = jsonFactory.createParser("[1]");
        p.nextToken(); // START_ARRAY
        MappingIterator<String> it = new MappingIterator<>(null, p, null, new StringDeserializer(), true, null);
        p.close(); // force IOException on nextToken
        try {
            it.hasNext();
            fail("Should have thrown RuntimeException");
        } catch (RuntimeException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testNextValueNoSuchElementAfterFalseHasNextValue() throws Exception {
        MappingIterator<String> it = managedArray("[]", new StringDeserializer(), true, null);
        assertFalse(it.hasNextValue());
        try {
            it.nextValue();
            fail("Should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // expected
        }
    }
}