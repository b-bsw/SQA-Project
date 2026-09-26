package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeserializationContextTest {

    private ObjectMapper mapper;
    private DeserializationConfig config;
    private JsonParser parser;
    private DeserializationContext ctx;

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
        parser = mapper.getFactory().createParser("{}");
        DefaultDeserializationContext template = new DefaultDeserializationContext(BeanDeserializerFactory.instance);
        ctx = template.createInstance(config, parser, null);
    }

    @After
    public void tearDown() throws Exception {
        if (parser != null) {
            parser.close();
        }
    }

    @Test
    public void testGetConfig() {
        assertSame(config, ctx.getConfig());
    }

    @Test
    public void testGetParser() {
        assertSame(parser, ctx.getParser());
    }

    @Test
    public void testGetFactory() {
        assertSame(BeanDeserializerFactory.instance, ctx.getFactory());
    }

    @Test
    public void testActiveViewIsNullByDefault() {
        assertNull(ctx.getActiveView());
    }

    @Test
    public void testAttributeRoundTrip() {
        assertNull(ctx.getAttribute("key"));
        assertSame(ctx, ctx.setAttribute("key", "value"));
        assertEquals("value", ctx.getAttribute("key"));
    }

    @Test
    public void testConstructType() {
        JavaType type = ctx.constructType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeNull() {
        assertNull(ctx.constructType((Class<?>) null));
    }

    @Test
    public void testFindClass() throws Exception {
        assertEquals(String.class, ctx.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassNotFound() throws Exception {
        ctx.findClass("no.such.Class");
    }

    @Test
    public void testIsEnabled() {
        assertTrue(ctx.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(ctx.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS));
    }

    @Test
    public void testCanOverrideAccessModifiers() {
        assertEquals(config.canOverrideAccessModifiers(), ctx.canOverrideAccessModifiers());
    }

    @Test
    public void testLocaleAndTimeZone() {
        assertNotNull(ctx.getLocale());
        assertEquals(config.getLocale(), ctx.getLocale());
        assertNotNull(ctx.getTimeZone());
        assertEquals(config.getTimeZone(), ctx.getTimeZone());
    }

    @Test
    public void testDefaultPropertyFormat() {
        assertEquals(config.getDefaultPropertyFormat(String.class),
                ctx.getDefaultPropertyFormat(String.class));
    }

    @Test
    public void testAnnotationIntrospectorAndTypeFactory() {
        assertNotNull(ctx.getAnnotationIntrospector());
        assertNotNull(ctx.getTypeFactory());
    }

    @Test
    public void testFindValueDeserializer() {
        JavaType type = ctx.constructType(String.class);
        assertNotNull(ctx.findValueDeserializer(type));
    }

    @Test
    public void testReadValueString() throws Exception {
        String json = "\"hello\"";
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            assertEquals("hello", ctx.readValue(p, String.class));
        }
    }

    @Test(expected = InvalidFormatException.class)
    public void testHandleWeirdStringValueWithoutHandler() {
        ctx.handleWeirdStringValue(String.class, "abc", "bad value");
    }

    @Test
    public void testHandleWeirdStringValueWithHandler() throws Exception {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdStringValue(DeserializationContext c, Class<?> targetType,
                    String value, String msg) {
                return "handled";
            }
        };
        ObjectMapper mapper2 = new ObjectMapper();
        mapper2.addHandler(handler);
        DeserializationConfig config2 = mapper2.getDeserializationConfig();
        try (JsonParser p2 = mapper2.getFactory().createParser("{}")) {
            DefaultDeserializationContext template2 = new DefaultDeserializationContext(BeanDeserializerFactory.instance);
            DeserializationContext ctx2 = template2.createInstance(config2, p2, null);
            Object result = ctx2.handleWeirdStringValue(String.class, "abc", "bad");
            assertEquals("handled", result);
        }
    }
}