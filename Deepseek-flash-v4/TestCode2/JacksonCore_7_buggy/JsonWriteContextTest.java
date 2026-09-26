package com.fasterxml.jackson.core.json;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.DupDetector;

public class JsonWriteContextTest {

    private JsonWriteContext rootContext;

    @Before
    public void setUp() {
        rootContext = JsonWriteContext.createRootContext();
    }

    @Test
    public void testCreateRootContext() {
        assertNotNull(rootContext);
        assertEquals(JsonStreamContext.TYPE_ROOT, rootContext._type);
        assertNull(rootContext._parent);
    }

    @Test
    public void testCreateRootContextWithDupDetector() {
        DupDetector dd = DupDetector.rootDetector(null);
        JsonWriteContext ctx = JsonWriteContext.createRootContext(dd);
        assertNotNull(ctx);
        assertSame(dd, ctx._dups);
    }

    @Test
    public void testCreateChildArrayContextFirstTime() {
        JsonWriteContext child = rootContext.createChildArrayContext();
        assertNotNull(child);
        assertEquals(JsonStreamContext.TYPE_ARRAY, child._type);
        assertSame(rootContext, child._parent);
        assertSame(child, rootContext._child);
    }

    @Test
    public void testCreateChildObjectContextFirstTime() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        assertNotNull(child);
        assertEquals(JsonStreamContext.TYPE_OBJECT, child._type);
        assertSame(rootContext, child._parent);
        assertSame(child, rootContext._child);
    }

    @Test
    public void testCreateChildArrayContextReuse() {
        JsonWriteContext child1 = rootContext.createChildArrayContext();
        JsonWriteContext child2 = rootContext.createChildArrayContext();
        assertSame(child1, child2);
        assertEquals(-1, child2._index);
        assertNull(child2._currentName);
        assertFalse(child2._gotName);
    }

    @Test
    public void testGetParent() {
        assertNull(rootContext.getParent());
        JsonWriteContext child = rootContext.createChildArrayContext();
        assertSame(rootContext, child.getParent());
    }

    @Test
    public void testGetCurrentNameInitiallyNull() {
        assertNull(rootContext.getCurrentName());
    }

    @Test
    public void testGetDupDetector() {
        assertNull(rootContext.getDupDetector());
        DupDetector dd = DupDetector.rootDetector(null);
        rootContext.withDupDetector(dd);
        assertSame(dd, rootContext.getDupDetector());
    }

    @Test
    public void testWithDupDetector() {
        assertNull(rootContext._dups);
        DupDetector dd = DupDetector.rootDetector(null);
        JsonWriteContext result = rootContext.withDupDetector(dd);
        assertSame(rootContext, result);
        assertSame(dd, rootContext._dups);
    }

    @Test
    public void testGetCurrentValueDefaultNull() {
        assertNull(rootContext.getCurrentValue());
    }

    @Test
    public void testSetGetCurrentValue() {
        Object val = "testValue";
        rootContext.setCurrentValue(val);
        assertSame(val, rootContext.getCurrentValue());
    }

    @Test
    public void testWriteFieldNameInArrayContext() {
        JsonWriteContext arrayCtx = rootContext.createChildArrayContext();
        int result = arrayCtx.writeFieldName("field");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, result);
        assertEquals("field", arrayCtx._currentName);
        assertTrue(arrayCtx._gotName);
    }

    @Test
    public void testWriteFieldNameTwiceReturnsExpectValue() {
        JsonWriteContext arrayCtx = rootContext.createChildArrayContext();
        arrayCtx.writeFieldName("first");
        int result = arrayCtx.writeFieldName("second");
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, result);
        assertEquals("second", arrayCtx._currentName);
        assertTrue(arrayCtx._gotName);
    }

    @Test
    public void testWriteFieldNameWithDupDetector() throws JsonProcessingException {
        DupDetector dd = new DupDetector(null) {
            private boolean already = false;
            @Override
            public boolean isDup(String name) {
                if (already) return true;
                already = true;
                return false;
            }
        };
        JsonWriteContext ctx = JsonWriteContext.createRootContext(dd);
        ctx.writeFieldName("first");
        try {
            ctx.writeFieldName("second");
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("Duplicate field"));
        }
    }

    @Test
    public void testWriteValueInObjectContext() {
        JsonWriteContext objCtx = rootContext.createChildObjectContext();
        int result = objCtx.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, result);
        assertEquals(0, objCtx._index);
        assertFalse(objCtx._gotName);
    }

    @Test
    public void testWriteValueInArrayContextFirst() {
        JsonWriteContext arrayCtx = rootContext.createChildArrayContext();
        int result = arrayCtx.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, result);
        assertEquals(0, arrayCtx._index);
    }

    @Test
    public void testWriteValueInArrayContextSecond() {
        JsonWriteContext arrayCtx = rootContext.createChildArrayContext();
        arrayCtx.writeValue();
        int result = arrayCtx.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, result);
        assertEquals(1, arrayCtx._index);
    }

    @Test
    public void testWriteValueInRootContextFirst() {
        int result = rootContext.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, result);
        assertEquals(0, rootContext._index);
    }

    @Test
    public void testWriteValueInRootContextSecond() {
        rootContext.writeValue();
        int result = rootContext.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, result);
        assertEquals(1, rootContext._index);
    }

    @Test
    public void testWriteFieldNameAfterWriteValueInObject() {
        JsonWriteContext objCtx = rootContext.createChildObjectContext();
        objCtx.writeFieldName("name");
        objCtx.writeValue();
        int result = objCtx.writeFieldName("next");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, result);
        assertEquals("next", objCtx._currentName);
        assertTrue(objCtx._gotName);
    }

    @Test
    public void testAppendDescRoot() {
        StringBuilder sb = new StringBuilder();
        rootContext.appendDesc(sb);
        assertEquals("/", sb.toString());
    }

    @Test
    public void testAppendDescArray() {
        JsonWriteContext arrayCtx = rootContext.createChildArrayContext();
        arrayCtx.writeValue();
        StringBuilder sb = new StringBuilder();
        arrayCtx.appendDesc(sb);
        assertEquals("[0]", sb.toString());
    }

    @Test
    public void testAppendDescObjectWithName() {
        JsonWriteContext objCtx = rootContext.createChildObjectContext();
        objCtx.writeFieldName("foo");
        StringBuilder sb = new StringBuilder();
        objCtx.appendDesc(sb);
        assertEquals("{\"foo\"}", sb.toString());
    }

    @Test
    public void testAppendDescObjectWithoutName() {
        JsonWriteContext objCtx = rootContext.createChildObjectContext();
        StringBuilder sb = new StringBuilder();
        objCtx.appendDesc(sb);
        assertEquals("{?}", sb.toString());
    }

    @Test
    public void testToStringRoot() {
        assertEquals("/", rootContext.toString());
    }

    @Test
    public void testToStringArray() {
        JsonWriteContext arrayCtx = rootContext.createChildArrayContext();
        arrayCtx.writeValue();
        arrayCtx.writeValue();
        assertEquals("[1]", arrayCtx.toString());
    }

    @Test
    public void testToStringObjectWithName() {
        JsonWriteContext objCtx = rootContext.createChildObjectContext();
        objCtx.writeFieldName("bar");
        assertEquals("{\"bar\"}", objCtx.toString());
    }
}