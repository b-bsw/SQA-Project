package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class DatabindContextTest {

    private ObjectMapper mapper;
    private TestableDatabindContext context;
    private TypeFactory typeFactory;
    private MapperConfig<?> config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        typeFactory = mapper.getTypeFactory();
        config = mapper.getDeserializationConfig();
        context = new TestableDatabindContext(typeFactory, config);
    }

    // --- constructType ------------------------------------------------------------------

    @Test
    public void testConstructTypeNull() {
        assertNull(context.constructType((Type) null));
    }

    @Test
    public void testConstructTypeValid() {
        JavaType type = context.constructType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    // --- constructSpecializedType -------------------------------------------------------

    @Test
    public void testConstructSpecializedTypeSameClass() {
        JavaType base = typeFactory.constructType(Number.class);
        JavaType result = context.constructSpecializedType(base, Number.class);
        assertSame(base, result);
    }

    @Test
    public void testConstructSpecializedTypeSubClass() {
        JavaType base = typeFactory.constructType(Number.class);
        JavaType result = context.constructSpecializedType(base, Integer.class);
        assertNotNull(result);
        assertEquals(Integer.class, result.getRawClass());
    }

    // --- resolveSubType -----------------------------------------------------------------

    @Test
    public void testResolveSubTypeGeneric() throws Exception {
        JavaType base = typeFactory.constructType(List.class);
        JavaType result = context.resolveSubType(base, "java.util.ArrayList<java.lang.String>");
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testResolveSubTypeSimple() throws Exception {
        JavaType base = typeFactory.constructType(Number.class);
        JavaType result = context.resolveSubType(base, "java.lang.Integer");
        assertNotNull(result);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testResolveSubTypeNotSubType() throws Exception {
        JavaType base = typeFactory.constructType(String.class);
        context.resolveSubType(base, "java.lang.Integer");
    }

    // --- converterInstance --------------------------------------------------------------

    @Test
    public void testConverterInstanceNull() {
        assertNull(context.converterInstance(null, null));
    }

    @Test
    public void testConverterInstanceConverterInstance() {
        Converter<Object, Object> converter = new TestConverter();
        assertSame(converter, context.converterInstance(null, converter));
    }

    @Test
    public void testConverterInstanceNoneClass() {
        assertNull(context.converterInstance(null, Converter.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testConverterInstanceInvalidType() {
        context.converterInstance(null, "not a converter");
    }

    @Test
    public void testConverterInstanceValidClass() {
        Converter<Object, Object> converter = context.converterInstance(null, TestConverter.class);
        assertNotNull(converter);
        assertTrue(converter instanceof TestConverter);
    }

    // --- reportBadDefinition (delegation) ----------------------------------------------

    @Test
    public void testReportBadDefinitionClassDelegation() throws Exception {
        try {
            context.reportBadDefinition(String.class, "boom");
            fail("Should have thrown JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(context.reportBadDefinitionCalled);
            assertEquals(String.class, context.reportedType.getRawClass());
            assertEquals("boom", context.reportedMessage);
        }
    }

    @Test
    public void testReportBadDefinitionJavaTypeDirect() throws Exception {
        JavaType type = typeFactory.constructType(Integer.class);
        try {
            context.reportBadDefinition(type, "bad");
            fail("Should have thrown JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(context.reportBadDefinitionCalled);
            assertSame(type, context.reportedType);
            assertEquals("bad", context.reportedMessage);
        }
    }

    // --- helper converter ----------------------------------------------------------------

    public static class TestConverter implements Converter<Object, Object> {
        public TestConverter() {
        }

        @Override
        public Object convert(Object value) {
            return value;
        }

        @Override
        public JavaType getOutputType(TypeFactory typeFactory) {
            return null;
        }

        @Override
        public JavaType getInputType(TypeFactory typeFactory) {
            return null;
        }
    }

    // --- testable context ----------------------------------------------------------------

    private static class TestableDatabindContext extends DatabindContext {

        private final TypeFactory typeFactory;
        private final MapperConfig<?> config;

        private boolean reportBadDefinitionCalled;
        private JavaType reportedType;
        private String reportedMessage;

        TestableDatabindContext(TypeFactory typeFactory, MapperConfig<?> config) {
            this.typeFactory = typeFactory;
            this.config = config;
        }

        @Override
        public MapperConfig<?> getConfig() {
            return config;
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return (config == null) ? null : config.getAnnotationIntrospector();
        }

        @Override
        public boolean isEnabled(MapperFeature feature) {
            return config != null && config.isEnabled(feature);
        }

        @Override
        public boolean canOverrideAccessModifiers() {
            return true;
        }

        @Override
        public Class<?> getActiveView() {
            return null;
        }

        @Override
        public Locale getLocale() {
            return Locale.getDefault();
        }

        @Override
        public TimeZone getTimeZone() {
            return TimeZone.getDefault();
        }

        @Override
        public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) {
            return null;
        }

        @Override
        public Object getAttribute(Object key) {
            return null;
        }

        @Override
        public DatabindContext setAttribute(Object key, Object value) {
            return this;
        }

        @Override
        public TypeFactory getTypeFactory() {
            return typeFactory;
        }

        @Override
        public <T> T reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
            this.reportBadDefinitionCalled = true;
            this.reportedType = type;
            this.reportedMessage = msg;
            throw new JsonMappingException(msg);
        }

        @Override
        protected JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String extraDesc) {
            String msg = "Invalid type id '" + typeId + "' for base type " + baseType;
            if (extraDesc != null) {
                msg += ": " + extraDesc;
            }
            return new JsonMappingException(msg);
        }
    }
}