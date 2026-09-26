package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class FromStringDeserializerTest {

    @Test
    public void testTypes() {
        assertArrayEquals(new Class<?>[] {
            File.class, URL.class, URI.class, Class.class, JavaType.class,
            Currency.class, Pattern.class, Locale.class, Charset.class,
            TimeZone.class, InetAddress.class, InetSocketAddress.class
        }, FromStringDeserializer.types());
    }

    @Test
    public void testFindDeserializer() {
        assertNotNull(FromStringDeserializer.findDeserializer(File.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URL.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URI.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Class.class));
        assertNotNull(FromStringDeserializer.findDeserializer(JavaType.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Currency.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Pattern.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Locale.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Charset.class));
        assertNotNull(FromStringDeserializer.findDeserializer(TimeZone.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetAddress.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetSocketAddress.class));
        assertNull(FromStringDeserializer.findDeserializer(String.class));
        assertNull(FromStringDeserializer.findDeserializer(null));
    }

    private Object deserialize(Class<?> rawType, String value) throws Exception {
        return FromStringDeserializer.findDeserializer(rawType)._deserialize(value, null);
    }

    @Test
    public void testDeserializeSimpleTypes() throws Exception {
        File file = (File) deserialize(File.class, "tmp");
        assertEquals(new File("tmp"), file);

        URL url = (URL) deserialize(URL.class, "http://example.com");
        assertEquals("http://example.com", url.toExternalForm());

        URI uri = (URI) deserialize(URI.class, "http://example.com/");
        assertEquals("http://example.com/", uri.toString());

        Currency currency = (Currency) deserialize(Currency.class, "USD");
        assertEquals("USD", currency.getCurrencyCode());

        Pattern pattern = (Pattern) deserialize(Pattern.class, "[a-z]+");
        assertEquals("[a-z]+", pattern.pattern());

        Charset charset = (Charset) deserialize(Charset.class, "UTF-8");
        assertEquals("UTF-8", charset.name());

        TimeZone tz = (TimeZone) deserialize(TimeZone.class, "GMT");
        assertEquals("GMT", tz.getID());

        InetAddress addr = (InetAddress) deserialize(InetAddress.class, "127.0.0.1");
        assertEquals("127.0.0.1", addr.getHostAddress());
    }

    @Test
    public void testDeserializeLocale() throws Exception {
        Locale locale = (Locale) deserialize(Locale.class, "en");
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());

        locale = (Locale) deserialize(Locale.class, "en_US");
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("", locale.getVariant());

        locale = (Locale) deserialize(Locale.class, "en_US_POSIX");
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());
    }

    @Test
    public void testDeserializeInetSocketAddress() throws Exception {
        InetSocketAddress sa = (InetSocketAddress) deserialize(InetSocketAddress.class, "localhost:80");
        assertEquals("localhost", sa.getHostString());
        assertEquals(80, sa.getPort());

        sa = (InetSocketAddress) deserialize(InetSocketAddress.class, "[::1]:80");
        assertEquals(80, sa.getPort());

        sa = (InetSocketAddress) deserialize(InetSocketAddress.class, "::1");
        assertEquals(0, sa.getPort());
    }

    @Test
    public void testDeserializeClassAndJavaType() throws Exception {
        ObjectMapper classMapper = mapperWithDeserializer(Class.class);
        Class<?> cls = classMapper.readValue("\"java.lang.String\"", Class.class);
        assertSame(String.class, cls);

        ObjectMapper javaTypeMapper = mapperWithDeserializer(JavaType.class);
        JavaType javaType = javaTypeMapper.readValue("\"java.lang.String\"", JavaType.class);
        assertSame(String.class, javaType.getRawClass());
    }

    @Test
    public void testDeserializeFromEmptyString() throws Exception {
        assertNull(FromStringDeserializer.findDeserializer(Currency.class)._deserializeFromEmptyString());
        assertEquals(URI.create(""), FromStringDeserializer.findDeserializer(URI.class)._deserializeFromEmptyString());
    }

    @Test(expected = MalformedURLException.class)
    public void testInvalidUrl() throws Exception {
        deserialize(URL.class, "not a url");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidUri() throws Exception {
        deserialize(URI.class, "http://exa mple.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCurrency() throws Exception {
        deserialize(Currency.class, "XYZ");
    }

    @Test(expected = PatternSyntaxException.class)
    public void testInvalidPattern() throws Exception {
        deserialize(Pattern.class, "[");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCharset() throws Exception {
        deserialize(Charset.class, "NO-SUCH-CHARSET");
    }

    @Test(expected = UnknownHostException.class)
    public void testInvalidInetAddress() throws Exception {
        deserialize(InetAddress.class, "not a host");
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidSocketPort() throws Exception {
        deserialize(InetSocketAddress.class, "localhost:notaport");
    }

    @Test(expected = InvalidFormatException.class)
    public void testInvalidBracketedSocketAddress() throws Exception {
        deserialize(InetSocketAddress.class, "[::1");
    }

    @Test
    public void testDeserializeStringValue() throws Exception {
        ObjectMapper mapper = mapperWithDeserializer(URI.class);
        URI result = mapper.readValue("\"http://example.com\"", URI.class);
        assertEquals(URI.create("http://example.com"), result);
    }

    @Test
    public void testDeserializeEmptyStringValue() throws Exception {
        ObjectMapper fileMapper = mapperWithDeserializer(File.class);
        assertNull(fileMapper.readValue("\"  \"", File.class));

        ObjectMapper uriMapper = mapperWithDeserializer(URI.class);
        assertEquals(URI.create(""), uriMapper.readValue("\"\"", URI.class));
    }

    @Test
    public void testDeserializeInvalidStringValue() throws Exception {
        ObjectMapper mapper = mapperWithDeserializer(Currency.class);
        try {
            mapper.readValue("\"XYZ\"", Currency.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getCause() instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testDeserializeNullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(URI.class);
        try (JsonParser jp = mapper.getFactory().createParser("null")) {
            jp.nextToken();
            try {
                std.deserialize(jp, mapper.getDeserializationContext());
                fail("Expected JsonMappingException");
            } catch (JsonMappingException e) {
                // expected
            }
        }
    }

    @Test
    public void testDeserializeUnwrapSingleValueArray() throws Exception {
        ObjectMapper mapper = mapperWithDeserializer(URI.class);
        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        URI result = mapper.readValue("[\"http://example.com\"]", URI.class);
        assertEquals(URI.create("http://example.com"), result);
    }

    @Test
    public void testDeserializeUnwrapSingleValueArrayTooMany() throws Exception {
        ObjectMapper mapper = mapperWithDeserializer(URI.class);
        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        try {
            mapper.readValue("[\"http://example.com\",\"http://example.org\"]", URI.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @SuppressWarnings("unchecked")
    private <T> ObjectMapper mapperWithDeserializer(Class<T> rawType) {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule("test");
        JsonDeserializer<T> deser = (JsonDeserializer<T>) (JsonDeserializer<?>)
                FromStringDeserializer.findDeserializer(rawType);
        module.addDeserializer(rawType, deser);
        mapper.registerModule(module);
        return mapper;
    }
}