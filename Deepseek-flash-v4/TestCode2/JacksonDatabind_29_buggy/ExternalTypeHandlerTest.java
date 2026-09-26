package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class ExternalTypeHandlerTest {

    private static class TestBean {
        public String value;
        public String type;
    }

    private static class MockSettableBeanProperty extends SettableBeanProperty {
        private final String name;
        private final JavaType type;
        public Object setValue;

        public MockSettableBeanProperty(String name, JavaType type) {
            super(null, null, null, null, null);
            this.name = name;
            this.type = type;
        }

        @Override
        public String getName() { return name; }

        @Override
        public JavaType getType() { return type; }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            setValue = p.getText(); // simplified
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return p.getText(); // simplified
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            if (instance instanceof TestBean) {
                ((TestBean)instance).value = (String)value;
            }
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        @Override
        public SettableBeanProperty withName(String simpleName) { return this; }
        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override
        public <A extends Annotation> A getContextAnnotation(Class<A> acls) { return null; }
    }

    private static class MockTypeDeserializer extends TypeDeserializer {
        private final String propertyName;
        private final Class<?> defaultImpl;
        private final TypeIdResolver idResolver;

        public MockTypeDeserializer(String propertyName, Class<?> defaultImpl) {
            this.propertyName = propertyName;
            this.defaultImpl = defaultImpl;
            this.idResolver = new MockTypeIdResolver();
        }

        @Override
        public String getPropertyName() { return propertyName; }
        @Override
        public Class<?> getDefaultImpl() { return defaultImpl; }
        @Override
        public TypeIdResolver getTypeIdResolver() { return idResolver; }
        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public TypeDeserializer forProperty(BeanProperty prop) { return this; }
    }

    private static class MockTypeIdResolver implements TypeIdResolver {
        @Override
        public String idFromValue(Object value) { return "mockType"; }
        @Override
        public String idFromValueAndType(Object value, Class<?> type) { return "mockType"; }
        @Override
        public String idFromBaseType() { return "mockType"; }
        @Override
        public JavaType typeFromId(DeserializationContext ctxt, String id) throws IOException { return null; }
        @Override
        public void init(JavaType baseType) {}
    }

    private static class MockJsonParser extends JsonParser {
        private String text;
        private JsonToken currentToken;
        private boolean skipChildrenCalled;

        public MockJsonParser(String text, JsonToken token) {
            super(0);
            this.text = text;
            this.currentToken = token;
        }

        @Override
        public String getText() throws IOException { return text; }
        @Override
        public JsonToken getCurrentToken() throws IOException { return currentToken; }
        @Override
        public void skipChildren() throws IOException { skipChildrenCalled = true; }
        @Override public void clearCurrentToken() {}
        @Override public JsonParser skipChildren(DeserializationContext ctxt) { return this; }
        @Override public void close() {}
        @Override public boolean isClosed() { return false; }
        @Override public JsonToken nextToken() throws IOException { return null; }
        @Override public JsonParser overrideCurrentName(String name) { return this; }
        @Override public String getCurrentName() throws IOException { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public int getCurrentTokenId() { return 0; }
        @Override public boolean hasCurrentToken() { return false; }
        @Override public boolean hasToken(JsonToken t) { return false; }
        @Override public Object getEmbeddedObject() throws IOException { return null; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
        @Override public String getValueAsString(String def) throws IOException { return text; }
        @Override public int getValueAsInt(int def) throws IOException { return 0; }
        @Override public long getValueAsLong(long def) throws IOException { return 0; }
        @Override public double getValueAsDouble(double def) throws IOException { return 0.0; }
        @Override public boolean getValueAsBoolean(boolean def) throws IOException { return false; }
    }

    private static class MockDeserializationContext extends DeserializationContext {
        public MockDeserializationContext() {
            super(null, null, null, null, null, null, null, null);
        }
        @Override
        public JsonMappingException mappingException(String message, Object... args) {
            return new JsonMappingException(this, String.format(message, args));
        }
        // other abstract methods stubbed
        @Override public JsonParser getParser() { return null; }
        @Override public JsonDeserializer<Object> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
        @Override public Object deserializerInstance(DeserializationConfig config, Annotated annotated, Object value) { return null; }
        @Override public JsonDeserializer<?> findRootValueDeserializer(JavaType type) { return null; }
        @Override public Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance) { return null; }
        @Override public int getActiveView() { return 0; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override public boolean isEnabled(DeserializationFeature feature) { return false; }
        @Override public boolean isEnabled(MapperFeature feature) { return false; }
        @Override public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return null; }
        @Override public Locale getLocale() { return null; }
        @Override public TimeZone getTimeZone() { return null; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public void setAttribute(Object key, Object value) {}
    }

    private static class MockPropertyValueBuffer extends PropertyValueBuffer {
        private final Map<String, Object> params = new HashMap<>();
        public MockPropertyValueBuffer() { super(null, null, null); }
        @Override
        public void assignParameter(SettableBeanProperty prop, Object value) {
            params.put(prop.getName(), value);
        }
        public Object getParameter(String name) { return params.get(name); }
    }

    private static class MockPropertyBasedCreator extends PropertyBasedCreator {
        private final Set<String> creatorProps = new HashSet<>();
        public MockPropertyBasedCreator() {
            super(null, null, null, null);
        }
        public void addCreatorProperty(String name) { creatorProps.add(name); }
        @Override
        public SettableBeanProperty findCreatorProperty(String name) {
            return creatorProps.contains(name) ? new MockSettableBeanProperty(name, null) : null;
        }
        @Override
        public Object build(DeserializationContext ctxt, PropertyValueBuffer buffer) throws IOException {
            TestBean bean = new TestBean();
            // creator properties already assigned via buffer; we handle them separately
            return bean;
        }
    }

    private ExternalTypeHandler.Builder builder;
    private ExternalTypeHandler handler;
    private MockDeserializationContext ctxt;
    private MockJsonParser parser;
    private TestBean bean;

    @Before
    public void setUp() throws Exception {
        builder = new ExternalTypeHandler.Builder();
        ctxt = new MockDeserializationContext();
        bean = new TestBean();
    }

    @Test
    public void testBuilderAddExternal() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler h = builder.build();
        assertNotNull(h);
    }

    @Test
    public void testStartWithProperties() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler orig = builder.build();
        ExternalTypeHandler copy = orig.start();
        assertNotNull(copy);
        // verify copy has same length properties
    }

    @Test
    public void testHandleTypePropertyValue_NotMatch() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        parser = new MockJsonParser("someType", JsonToken.VALUE_STRING);
        boolean result = handler.handleTypePropertyValue(parser, ctxt, "other", bean);
        assertFalse(result);
    }

    @Test
    public void testHandleTypePropertyValue_MatchedWithBothPresent() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        parser = new MockJsonParser("someType", JsonToken.VALUE_STRING);
        // first call to set token via handlePropertyValue to have token present
        handler.handlePropertyValue(parser, ctxt, "value", null); // sets _tokens[0]
        // now handleTypePropertyValue should deserialize and set
        boolean result = handler.handleTypePropertyValue(parser, ctxt, "@type", bean);
        assertTrue(result);
        // verify bean value set
        assertNotNull(bean.value);
        // also _tokens[0] should be null after
    }

    @Test
    public void testHandlePropertyValue_TypePropertyName() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        parser = new MockJsonParser("myType", JsonToken.VALUE_STRING);
        boolean result = handler.handlePropertyValue(parser, ctxt, "@type", null);
        assertTrue(result);
        // _typeIds[0] set, still not deserialized
    }

    @Test
    public void testHandlePropertyValue_NotTypeProperty() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        parser = new MockJsonParser("valueData", JsonToken.VALUE_STRING);
        boolean result = handler.handlePropertyValue(parser, ctxt, "value", null);
        assertTrue(result);
    }

    @Test
    public void testHandlePropertyValue_NotMatch() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        parser = new MockJsonParser("data", JsonToken.VALUE_STRING);
        boolean result = handler.handlePropertyValue(parser, ctxt, "unknown", bean);
        assertFalse(result);
    }

    @Test(expected = IOException.class)
    public void testComplete_TypeIdWithoutToken() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        // set typeId but no token -> exception
        handler.handlePropertyValue(parser, ctxt, "@type", null); // sets _typeIds[0] = null? Actually sets to "mock" from parser
        // Actually parser is null; we need to set up manually
        // Simulate direct manipulation? Use reflection? Better to use start() and set via handlePropertyValue
        MockJsonParser parser2 = new MockJsonParser("typeVal", JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser2, ctxt, "@type", null);
        // No token for value property -> exception
        Object result = handler.complete(parser2, ctxt, bean);
        fail("Expected IOException");
    }

    @Test
    public void testComplete_Success() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        // set both type and token
        MockJsonParser parser1 = new MockJsonParser("typeVal", JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser1, ctxt, "@type", null);
        MockJsonParser parser2 = new MockJsonParser("valueData", JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser2, ctxt, "value", null);
        // now complete should deserialize
        Object result = handler.complete(parser1, ctxt, bean);
        assertSame(bean, result);
        assertNotNull(bean.value);
    }

    @Test
    public void testComplete_withDefaultType() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", TestBean.class); // defaultImpl
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        // set only value token, type missing but natural type? value is scalar, so should get default type
        MockJsonParser parser = new MockJsonParser("scalar", JsonToken.VALUE_STRING);
        // set token via handlePropertyValue
        handler.handlePropertyValue(parser, ctxt, "value", null);
        // Now complete should see missing type but has default
        Object result = handler.complete(parser, ctxt, bean);
        assertNotNull(bean.value);
    }

    @Test
    public void testComplete_withBufferAndCreator() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        MockJsonParser parser1 = new MockJsonParser("typeVal", JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser1, ctxt, "@type", null);
        MockJsonParser parser2 = new MockJsonParser("valueData", JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser2, ctxt, "value", null);

        PropertyValueBuffer buffer = new MockPropertyValueBuffer();
        MockPropertyBasedCreator creator = new MockPropertyBasedCreator();
        creator.addCreatorProperty("value");
        Object result = handler.complete(parser1, ctxt, buffer, creator);
        assertNotNull(result);
        assertTrue(result instanceof TestBean);
        TestBean b = (TestBean) result;
        assertEquals("valueData", b.value);
    }

    @Test(expected = IOException.class)
    public void testComplete_withBufferMissingType() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        // set token only, no type and no defaultImpl -> exception
        MockJsonParser parser = new MockJsonParser("scalar", JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser, ctxt, "value", null);
        PropertyValueBuffer buffer = new MockPropertyValueBuffer();
        MockPropertyBasedCreator creator = new MockPropertyBasedCreator();
        Object result = handler.complete(parser, ctxt, buffer, creator);
        fail("Expected IOException");
    }

    @Test
    public void testHandleTypePropertyValue_NoTokenBuffered() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        // handle type property without prior token -> should set _typeIds only
        MockJsonParser parser = new MockJsonParser("myType", JsonToken.VALUE_STRING);
        boolean result = handler.handleTypePropertyValue(parser, ctxt, "@type", null);
        assertTrue(result);
        // token still null, but typeId stored
        // now handle value token
        MockJsonParser parser2 = new MockJsonParser("valueData", JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser2, ctxt, "value", bean);
        // verify bean is set because both present?
        // Actually handlePropertyValue will check bean!=null and _typeIds not null => deserialize
        assertNotNull(bean.value);
    }

    @Test
    public void testComplete_NullTokensAndTypeIds_AllNull() throws Exception {
        MockSettableBeanProperty prop = new MockSettableBeanProperty("value", null);
        MockTypeDeserializer typeDeser = new MockTypeDeserializer("@type", null);
        builder.addExternal(prop, typeDeser);
        handler = builder.build();
        // complete with no data
        Object result = handler.complete(null, ctxt, bean);
        assertSame(bean, result);
    }
}