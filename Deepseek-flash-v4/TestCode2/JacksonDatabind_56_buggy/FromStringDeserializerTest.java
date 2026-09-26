package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.POJONode;

public class FromStringDeserializerTest {

    private static class TestValue {
        final String value;
        TestValue(String v) {
            value = v;
        }
    }

    private <T> ObjectMapper mapperFor(FromStringDeserializer<T> deser, Class<T> type) {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(type, deser);
        mapper.registerModule(module);
        return mapper;
    }

    @Test
    public void testTypesAndFindDeserializer() {
        Class<?>[] types = FromStringDeserializer.types();
        assertNotNull(types);
        assertEquals(12, types.length);

        int[] expectedKinds = {
            FromStringDeserializer.Std.STD_FILE,
            FromStringDeserializer.Std.STD_URL,
            FromStringDeserializer.Std.STD_URI,
            FromStringDeserializer.Std.STD_CLASS,
            FromStringDeserializer.Std.STD_JAVA_TYPE,
            FromStringDeserializer.Std.STD_CURRENCY,
            FromStringDeserializer.Std.STD_PATTERN,
            FromStringDeserializer.Std.STD_LOCALE,
            FromStringDeserializer.Std.STD_CHARSET,
            FromStringDeserializer.Std.STD_TIME_ZONE,
            FromStringDeserializer.Std.STD_INET_ADDRESS,
            FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS
        };

        for (int i = 0; i < types.length; i++) {
            FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(types[i]);
            assertNotNull("No Std for " + types[i], std);
            assertEquals(expectedKinds[i], std._kind);
        }

        assertNull(FromStringDeserializer.findDeserializer(Object.class));
        assertNull(FromStringDeserializer.findDeserializer(String.class));
    }

    @Test
    public void testStdDeserializesSupportedTypes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        File file = mapper.readValue("\"/tmp/foo\"", File.class);
        assertEquals(new File("/tmp/foo"), file);

        URL url = mapper.readValue("\"http://example.com\"", URL.class);
        assertEquals("http", url.getProtocol());

        assertEquals(URI.create("http://example.com"),
                mapper.readValue("\"http://example.com\"", URI.class));

        assertEquals(String.class, mapper.readValue("\"java.lang.String\"", Class.class));

        JavaType javaType = mapper.readValue("\"java.lang.String\"", JavaType.class);
        assertEquals(String.class, javaType.getRawClass());

        assertEquals(Currency.getInstance("USD"), mapper.readValue("\"USD\"", Currency.class));

        Pattern pattern = mapper.readValue("\"a.c\"", Pattern.class);
        assertTrue(pattern.matcher("abc").matches());

        assertEquals(new Locale("en", "US"), mapper.readValue("\"en_US\"", Locale.class));

        Charset charset = mapper.readValue("\"UTF-8\"", Charset.class);
        assertEquals("UTF-8", charset.name());

        TimeZone timeZone = mapper.readValue("\"America/New_York\"", TimeZone.class);
        assertEquals("America/New_York", timeZone.getID());

        assertEquals(InetAddress.getByName("127.0.0.1"),
                mapper.readValue("\"127.0.0.1\"", InetAddress.class));

        InetSocketAddress hostPort = mapper.readValue("\"localhost:8080\"", InetSocketAddress.class);
        assertEquals(8080, hostPort.getPort());
        assertEquals("localhost", hostPort.getHostString());

        InetSocketAddress ipv6NoPort = mapper.readValue("\"::1\"", InetSocketAddress.class);
        assertEquals(0, ipv6NoPort.getPort());

        InetSocketAddress bracketedIpv6 = mapper.readValue("\"[::1]:8080\"", InetSocketAddress.class);
        assertEquals(8080, bracketedIpv6.getPort());
    }

    @Test
    public void testStdDeserializeEmptyStringSpecialCases() throws Exception {
        FromStringDeserializer.Std uri = new FromStringDeserializer.Std(URI.class,
                FromStringDeserializer.Std.STD_URI);
        assertEquals(URI.create(""), uri._deserializeFromEmptyString());

        FromStringDeserializer.Std locale = new FromStringDeserializer.Std(Locale.class,
                FromStringDeserializer.Std.STD_LOCALE);
        assertEquals(Locale.ROOT, locale._deserializeFromEmptyString());

        FromStringDeserializer.Std file = new FromStringDeserializer.Std(File.class,
                FromStringDeserializer.Std.STD_FILE);
        assertNull(file._deserializeFromEmptyString());
    }

    @Test(expected = IOException.class)
    public void testStdInvalidUrlThrowsIOException() throws Exception {
        new FromStringDeserializer.Std(URL.class, FromStringDeserializer.Std.STD_URL)
                ._deserialize("not-a-url", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStdInvalidCurrencyThrowsIllegalArgumentException() throws Exception {
        new FromStringDeserializer.Std(Currency.class, FromStringDeserializer.Std.STD_CURRENCY)
                ._deserialize("NOPE", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStdUnknownKindThrowsIllegalArgumentException() throws Exception {
        new FromStringDeserializer.Std(String.class, 99)._deserialize("x", null);
    }

    @Test
    public void testDeserializeTextAndEmptyString() throws Exception {
        ObjectMapper mapper = mapperFor(new FromStringDeserializer<TestValue>(TestValue.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected TestValue _deserialize(String value, DeserializationContext ctxt) {
                return new TestValue("ok:" + value);
            }

            @Override
            protected TestValue _deserializeFromEmptyString() throws IOException {
                return new TestValue("empty");
            }
        }, TestValue.class);

        assertEquals("ok:abc", mapper.readValue("\"abc\"", TestValue.class).value);
        assertEquals("empty", mapper.readValue("\"\"", TestValue.class).value);
        assertEquals("empty", mapper.readValue("\"   \"", TestValue.class).value);
    }

    @Test
    public void testDeserializeUnwrapSingleValueArray() throws Exception {
        ObjectMapper mapper = mapperFor(new FromStringDeserializer<TestValue>(TestValue.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected TestValue _deserialize(String value, DeserializationContext ctxt) {
                return new TestValue(value);
            }
        }, TestValue.class);

        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        assertEquals("abc", mapper.readValue("[\"abc\"]", TestValue.class).value);

        try {
            mapper.readValue("[\"abc\",\"def\"]", TestValue.class);
            fail("Expected JsonMappingException for array with multiple values");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("more than a single value"));
        }
    }

    @Test
    public void testDeserializeNullResultThrowsMappingException() throws Exception {
        ObjectMapper mapper = mapperFor(new FromStringDeserializer<TestValue>(TestValue.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected TestValue _deserialize(String value, DeserializationContext ctxt) {
                return null;
            }
        }, TestValue.class);

        try {
            mapper.readValue("\"abc\"", TestValue.class);
            fail("Expected JsonMappingException when _deserialize returns null");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
        }
    }

    @Test
    public void testDeserializeIllegalArgumentExceptionWrapped() throws Exception {
        ObjectMapper mapper = mapperFor(new FromStringDeserializer<TestValue>(TestValue.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected TestValue _deserialize(String value, DeserializationContext ctxt) {
                throw new IllegalArgumentException("boom");
            }
        }, TestValue.class);

        try {
            mapper.readValue("\"abc\"", TestValue.class);
            fail("Expected JsonMappingException wrapping IllegalArgumentException");
        } catch (JsonMappingException e) {
            boolean found = false;
            Throwable t = e;
            while (t != null) {
                if (t instanceof IllegalArgumentException) {
                    found = true;
                    break;
                }
                t = t.getCause();
            }
            assertTrue("Expected IllegalArgumentException in cause chain", found);
        }
    }

    @Test
    public void testDeserializeEmbeddedObject() throws Exception {
        ObjectMapper mapper = mapperFor(new FromStringDeserializer<TestValue>(TestValue.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected TestValue _deserialize(String value, DeserializationContext ctxt) {
                return new TestValue(value);
            }
        }, TestValue.class);

        TestValue embedded = new TestValue("embedded");
        assertSame(embedded,
                mapper.readValue(new POJONode(embedded).traverse(), TestValue.class));

        assertNull(mapper.readValue(new POJONode(null).traverse(), TestValue.class));

        try {
            mapper.readValue(new POJONode("not-an-embedded-test-value").traverse(), TestValue.class);
            fail("Expected JsonMappingException for non-assignable embedded object");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Don't know how to convert embedded Object"));
        }
    }

    @Test
    public void testDeserializeNullTokenThrowsMappingException() throws Exception {
        FromStringDeserializer<TestValue> deser = new FromStringDeserializer<TestValue>(TestValue.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected TestValue _deserialize(String value, DeserializationContext ctxt) {
                return new TestValue(value);
            }
        };

        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("null");
        p.nextToken();
        try {
            deser.deserialize(p, mapper.getDeserializationContext());
            fail("Expected JsonMappingException for null token");
        } catch (JsonMappingException e) {
            // expected
        } finally {
            p.close();
        }
    }
}