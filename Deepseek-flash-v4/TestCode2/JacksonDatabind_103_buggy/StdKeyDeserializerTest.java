package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StdKeyDeserializerTest {

    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        ctxt = new ObjectMapper().getDeserializationContext();
    }

    @After
    public void tearDown() {
        ctxt = null;
    }

    @Test
    public void testForTypeKnownTypes() {
        Class<?>[] knownTypes = new Class<?>[] {
                String.class, Object.class, CharSequence.class,
                UUID.class, Integer.class, Long.class, Date.class,
                Calendar.class, Boolean.class, Byte.class, Character.class,
                Short.class, Float.class, Double.class, URI.class,
                URL.class, Class.class, Locale.class, Currency.class,
                byte[].class
        };
        for (Class<?> type : knownTypes) {
            StdKeyDeserializer deser = StdKeyDeserializer.forType(type);
            assertNotNull("No key deserializer for " + type.getName(), deser);
            assertEquals(type, deser.getKeyClass());
        }
        assertNull(StdKeyDeserializer.forType(StringBuilder.class));
    }

    @Test
    public void testStringDeserializerReuse() throws Exception {
        assertSame(StdKeyDeserializer.forType(String.class), StdKeyDeserializer.forType(String.class));
        assertSame(StdKeyDeserializer.forType(Object.class), StdKeyDeserializer.forType(Object.class));
        assertNotSame(StdKeyDeserializer.forType(String.class), StdKeyDeserializer.forType(Object.class));
        assertNotSame(StdKeyDeserializer.forType(String.class), StdKeyDeserializer.forType(CharSequence.class));

        StdKeyDeserializer deser = StdKeyDeserializer.forType(String.class);
        assertEquals("key", deser.deserializeKey("key", null));
        assertEquals("key", StdKeyDeserializer.forType(Object.class).deserializeKey("key", null));
        assertEquals("key", StdKeyDeserializer.forType(CharSequence.class).deserializeKey("key", null));
    }

    @Test
    public void testNullKeyReturnsNull() throws Exception {
        assertNull(StdKeyDeserializer.forType(Integer.class).deserializeKey(null, ctxt));
        assertNull(StdKeyDeserializer.forType(String.class).deserializeKey(null, ctxt));
    }

    @Test
    public void testBooleanKeys() throws Exception {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(Boolean.TRUE, deser.deserializeKey("true", null));
        assertEquals(Boolean.FALSE, deser.deserializeKey("false", null));
    }

    @Test
    public void testNumberParsing() throws Exception {
        StdKeyDeserializer intDeser = StdKeyDeserializer.forType(Integer.class);
        assertEquals(Integer.valueOf(42), intDeser.deserializeKey("42", null));
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), intDeser.deserializeKey("-2147483648", null));
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), intDeser.deserializeKey("2147483647", null));

        StdKeyDeserializer longDeser = StdKeyDeserializer.forType(Long.class);
        assertEquals(Long.valueOf("123456789012345"), longDeser.deserializeKey("123456789012345", null));
        assertEquals(Long.valueOf(Long.MAX_VALUE), longDeser.deserializeKey("9223372036854775807", null));

        StdKeyDeserializer byteDeser = StdKeyDeserializer.forType(Byte.class);
        assertEquals(Byte.valueOf(Byte.MIN_VALUE), byteDeser.deserializeKey("-128", null));
        assertEquals(Byte.valueOf((byte) 127), byteDeser.deserializeKey("127", null));
        assertEquals(Byte.valueOf((byte) 255), byteDeser.deserializeKey("255", null));

        StdKeyDeserializer shortDeser = StdKeyDeserializer.forType(Short.class);
        assertEquals(Short.valueOf(Short.MIN_VALUE), shortDeser.deserializeKey("-32768", null));
        assertEquals(Short.valueOf(Short.MAX_VALUE), shortDeser.deserializeKey("32767", null));
    }

    @Test
    public void testCharacterAndFloatingPointParsing() throws Exception {
        assertEquals(Character.valueOf('Z'), StdKeyDeserializer.forType(Character.class).deserializeKey("Z", null));

        assertEquals(2.5f, ((Number) StdKeyDeserializer.forType(Float.class).deserializeKey("2.5", null)).floatValue(), 0.0f);
        assertEquals(1.25d, ((Number) StdKeyDeserializer.forType(Double.class).deserializeKey("1.25", null)).doubleValue(), 0.0d);
    }

    @Test
    public void testComplexKeyTypes() throws Exception {
        String uuidValue = "12345678-1234-1234-1234-123456789abc";
        assertEquals(UUID.fromString(uuidValue), StdKeyDeserializer.forType(UUID.class).deserializeKey(uuidValue, null));

        assertEquals(URI.create("http://example.org/a"), StdKeyDeserializer.forType(URI.class).deserializeKey("http://example.org/a", null));

        URL url = (URL) StdKeyDeserializer.forType(URL.class).deserializeKey("http://example.org/a", null);
        assertEquals("http://example.org/a", url.toString());

        assertNotNull(StdKeyDeserializer.forType(Date.class).deserializeKey("1970-01-01T00:00:00.000+0000", ctxt));
        assertNotNull(StdKeyDeserializer.forType(Calendar.class).deserializeKey("1970-01-01T00:00:00.000+0000", ctxt));

        assertSame(String.class, StdKeyDeserializer.forType(Class.class).deserializeKey("java.lang.String", ctxt));

        byte[] expectedBytes = new byte[] {1, 2, 3};
        assertArrayEquals(expectedBytes, (byte[]) StdKeyDeserializer.forType(byte[].class).deserializeKey("AQID", ctxt));

        assertEquals(Locale.US, StdKeyDeserializer.forType(Locale.class).deserializeKey("en_US", ctxt));

        Currency currency = (Currency) StdKeyDeserializer.forType(Currency.class).deserializeKey("USD", ctxt);
        assertEquals("USD", currency.getCurrencyCode());
    }

    @Test
    public void testInvalidKeysFail() throws Exception {
        assertInvalidKey(StdKeyDeserializer.forType(Boolean.class), "yes");
        assertInvalidKey(StdKeyDeserializer.forType(Byte.class), "256");
        assertInvalidKey(StdKeyDeserializer.forType(Short.class), "32768");
        assertInvalidKey(StdKeyDeserializer.forType(Character.class), "ab");
        assertInvalidKey(StdKeyDeserializer.forType(Integer.class), "2147483648");
        assertInvalidKey(StdKeyDeserializer.forType(Long.class), "9223372036854775808");
        assertInvalidKey(StdKeyDeserializer.forType(Float.class), "not-a-float");
        assertInvalidKey(StdKeyDeserializer.forType(Double.class), "not-a-double");
        assertInvalidKey(StdKeyDeserializer.forType(Date.class), "not-a-date");
        assertInvalidKey(StdKeyDeserializer.forType(UUID.class), "not-a-uuid");
        assertInvalidKey(StdKeyDeserializer.forType(URI.class), "http://exa mple.com");
        assertInvalidKey(StdKeyDeserializer.forType(URL.class), "http://exa mple.com");
        assertInvalidKey(StdKeyDeserializer.forType(Class.class), "no.such.Class");
        assertInvalidKey(StdKeyDeserializer.forType(Currency.class), "no-such-currency");
        assertInvalidKey(StdKeyDeserializer.forType(byte[].class), "!!!!");
    }

    @Test
    public void testUnknownKindThrowsIllegalState() throws Exception {
        StdKeyDeserializer unknown = new StdKeyDeserializer(999, String.class);
        try {
            unknown._parse("key", ctxt);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("unknown key type"));
        }
    }

    private void assertInvalidKey(StdKeyDeserializer deser, String key) throws Exception {
        try {
            deser.deserializeKey(key, ctxt);
            fail("Expected failure for key: " + key);
        } catch (JsonMappingException e) {
            // expected
        }
    }
}