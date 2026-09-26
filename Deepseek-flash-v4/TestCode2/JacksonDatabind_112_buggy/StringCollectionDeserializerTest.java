package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.*;

public class StringCollectionDeserializerTest {

    // ----- Stub classes -----

    static class MyValueInstantiator extends ValueInstantiator {
        @Override public String getValueTypeDesc() { return "Collection"; }
        @Override public boolean canCreateUsingDefault() { return true; }
        @Override public Collection<String> createUsingDefault(DeserializationContext ctxt) throws IOException { return new ArrayList<String>(); }
        @Override public boolean canCreateUsingDelegate() { return true; }
        @Override public Collection<String> createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return new ArrayList<String>((Collection<String>)delegate); }
        @Override public AnnotatedWithParams getDelegateCreator() { return null; }
        @Override public JavaType getDelegateType(DeserializationConfig config) { return null; }
    }

    static class MyNullProvider implements NullValueProvider {
        private final String nullValue;
        MyNullProvider(String nv) { nullValue = nv; }
        @Override public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException { return nullValue; }
    }

    static class MyStringDeserializer extends JsonDeserializer<String> {
        @Override public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (p.getCurrentToken() == JsonToken.VALUE_NULL) return null;
            return p.getValueAsString();
        }
    }

    static class MyDelegateDeserializer extends JsonDeserializer<Object> {
        private final Collection<String> result;
        MyDelegateDeserializer(Collection<String> r) { result = r; }
        @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return result; }
    }

    static class MyTypeDeserializer extends TypeDeserializer {
        boolean invoked = false;
        @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { invoked = true; return new ArrayList<String>(Arrays.asList("typed")); }
        @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { throw new UnsupportedOperationException(); }
        @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { throw new UnsupportedOperationException(); }
        @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { throw new UnsupportedOperationException(); }
        @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
        @Override public String getTypeIdResolver() { return null; }
        @Override public String getPropertyName() { return null; }
        @Override public TypeIdResolver getTypeIdResolver(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    static class MyDeserializationContext extends DeserializationContext {
        private boolean acceptSingle;
        private boolean rejectSingle;

        MyDeserializationContext(DeserializationConfig config, int type, Object rootObject, boolean acceptSingle) {
            super(config, type, rootObject);
            this.acceptSingle = acceptSingle;
            this.rejectSingle = !acceptSingle;
        }

        @Override public DeserializationConfig getConfig() { return _config; }
        @Override public JsonParser getParser() { return null; }
        @Override public JsonFactory getFactory() { return null; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
        @Override public ClassIntrospector getClassIntrospector() { return null; }
        @Override public Object getActiveView() { return null; }
        @Override public void setActiveView(Object view) {}
        @Override public Object getAttribute(Object key) { return null; }
        @Override public Object setAttribute(Object key, Object value) { return null; }
        @Override public boolean hasDeserializationFeatures(int features) { return false; }
        @Override public boolean hasSomeOfFeatures(int features) { return false; }
        @Override public boolean isEnabled(DeserializationFeature feature) { return feature == DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY && acceptSingle; }
        @Override public int getDeserializationFeatures() { return 0; }
        @Override public DeserializationView getView() { return null; }
        @Override public Object handleUnexpectedToken(Class<?> targetType, JsonParser p) throws IOException { throw new JsonMappingException("Unexpected token"); }
        @Override public Object handleWeirdStringValue(Class<?> targetType, String value, String msg, Object... args) throws IOException { throw new JsonMappingException("Weird string"); }
        @Override public Object handleWeirdNumberValue(Class<?> targetType, Number value, String msg, Object... args) throws IOException { throw new JsonMappingException("Weird number"); }
        @Override public Object handleWeirdKey(Class<?> targetType, String key, String msg, Object... args) throws IOException { throw new JsonMappingException("Weird key"); }
        @Override public void handleUnknownProperty(Object beanOrClass, JsonParser p, Object value) throws IOException {}
        @Override public Object handleMissingInstantiator(Class<?> instClass, ValueInstantiator inst, JsonParser p, String msg, Object... args) throws IOException { throw new JsonMappingException("Missing instantiator"); }
        @Override public Object reportInputMismatch(BeanProperty prop, String msg, Object... args) throws JsonMappingException { throw new JsonMappingException("Input mismatch"); }
        @Override public Object reportMappingException(String msg, Object... args) throws JsonMappingException { throw new JsonMappingException("Mapping"); }
        @Override public <T> T findContextualValueDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override public <T> T findRootValueDeserializer(JavaType type) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<Object> findKeyDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override public boolean checkUnresolvedObjectId() { return false; }
        @Override public void clearUnresolvedObjectId() {}
        @Override public JavaType getTypeFor(Class<?> cls) { return TypeFactory.defaultInstance().constructType(cls); }
        @Override public void reportUnknownProperty(Object bean, JsonParser p, Object value) throws IOException {}
        @Override public Base64Variant getBase64Variant() { return Base64Variants.MIME; }
    }

    // ----- Helper methods -----

    private StringCollectionDeserializer createDeserializer(JavaType collectionType,
            ValueInstantiator vi, JsonDeserializer<?> delegate,
            JsonDeserializer<?> valueDeser, NullValueProvider nuller, Boolean unwrapSingle) {
        return new StringCollectionDeserializer(collectionType, vi, delegate, valueDeser, nuller, unwrapSingle);
    }

    // ----- Tests -----

    @Test
    public void testIsCachable() {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        StringCollectionDeserializer d1 = new StringCollectionDeserializer(ct, null, null);
        assertTrue(d1.isCachable());

        StringCollectionDeserializer d2 = createDeserializer(ct, new MyValueInstantiator(), null, null, null, null);
        assertTrue(d2.isCachable());

        // valueDeser != null => not cachable
        StringCollectionDeserializer d3 = createDeserializer(ct, new MyValueInstantiator(), null, new MyStringDeserializer(), null, null);
        assertFalse(d3.isCachable());

        // delegateDeser != null => not cachable
        StringCollectionDeserializer d4 = createDeserializer(ct, new MyValueInstantiator(), new MyDelegateDeserializer(new ArrayList<String>()), null, null, null);
        assertFalse(d4.isCachable());
    }

    @Test
    public void testDeserializeDefaultNormalArray() throws IOException {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyValueInstantiator vi = new MyValueInstantiator();
        StringCollectionDeserializer d = createDeserializer(ct, vi, null, null, null, null);

        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[\"a\", \"b\", \"c\"]");
        p.nextToken(); // START_ARRAY
        Collection<String> result = d.deserialize(p, (DeserializationContext)null);
        assertArrayEquals(new String[]{"a", "b", "c"}, result.toArray());
    }

    @Test
    public void testDeserializeDefaultWithNullAndEmpty() throws IOException {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyNullProvider np = new MyNullProvider("__null__");
        MyValueInstantiator vi = new MyValueInstantiator();
        // _skipNullValues = false (nuller provided)
        StringCollectionDeserializer d = createDeserializer(ct, vi, null, null, np, null);

        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[\"x\", null, \"y\"]");
        p.nextToken();
        Collection<String> result = d.deserialize(p, (DeserializationContext)null);
        assertArrayEquals(new String[]{"x", "__null__", "y"}, result.toArray());
    }

    @Test
    public void testDeserializeWithCustomValueDeser() throws IOException {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyValueInstantiator vi = new MyValueInstantiator();
        MyStringDeserializer vd = new MyStringDeserializer();
        StringCollectionDeserializer d = createDeserializer(ct, vi, null, vd, null, null);

        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[\"hello\", \"world\"]");
        p.nextToken();
        Collection<String> result = d.deserialize(p, (DeserializationContext)null);
        assertArrayEquals(new String[]{"hello", "world"}, result.toArray());
    }

    @Test
    public void testDeserializeUsingDelegate() throws IOException {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyValueInstantiator vi = new MyValueInstantiator();
        Collection<String> delegateResult = new ArrayList<String>(Arrays.asList("from", "delegate"));
        MyDelegateDeserializer dd = new MyDelegateDeserializer(delegateResult);
        StringCollectionDeserializer d = createDeserializer(ct, vi, dd, null, null, null);

        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("null"); // token doesn't matter; delegate is used
        p.nextToken(); // VALUE_NULL
        Collection<String> result = d.deserialize(p, (DeserializationContext)null);
        assertArrayEquals(new String[]{"from", "delegate"}, result.toArray());
    }

    @Test
    public void testDeserializeNonArrayAcceptSingle() throws IOException {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyValueInstantiator vi = new MyValueInstantiator();
        Boolean unwrapSingle = null; // will rely on feature enabled
        StringCollectionDeserializer d = createDeserializer(ct, vi, null, null, null, unwrapSingle);

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        MyDeserializationContext ctx = new MyDeserializationContext(config, 0, null, true); // acceptSingle true

        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"single\"");
        p.nextToken(); // VALUE_STRING
        Collection<String> result = d.deserialize(p, ctx);
        assertArrayEquals(new String[]{"single"}, result.toArray());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNonArrayRejectSingle() throws IOException {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyValueInstantiator vi = new MyValueInstantiator();
        Boolean unwrapSingle = null;
        StringCollectionDeserializer d = createDeserializer(ct, vi, null, null, null, unwrapSingle);

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        MyDeserializationContext ctx = new MyDeserializationContext(config, 0, null, false); // acceptSingle false

        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"single\"");
        p.nextToken();
        d.deserialize(p, ctx);
    }

    @Test
    public void testDeserializeWithType() throws IOException {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyValueInstantiator vi = new MyValueInstantiator();
        StringCollectionDeserializer d = createDeserializer(ct, vi, null, null, null, null);
        MyTypeDeserializer td = new MyTypeDeserializer();

        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[]");
        p.nextToken();
        Object result = d.deserializeWithType(p, (DeserializationContext)null, td);
        assertNotNull(result);
        assertTrue(td.invoked);
        @SuppressWarnings("unchecked")
        Collection<String> col = (Collection<String>) result;
        assertEquals(1, col.size());
        assertEquals("typed", col.iterator().next());
    }

    @Test
    public void testGetContentDeserializer() {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        StringCollectionDeserializer d = createDeserializer(ct, new MyValueInstantiator(), null, new MyStringDeserializer(), null, null);
        assertNotNull(d.getContentDeserializer());
    }

    @Test
    public void testGetContentDeserializerNull() {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        StringCollectionDeserializer d = createDeserializer(ct, new MyValueInstantiator(), null, null, null, null);
        assertNull(d.getContentDeserializer());
    }

    @Test
    public void testGetValueInstantiator() {
        JavaType ct = TypeFactory.defaultInstance().constructCollectionType(Collection.class, String.class);
        MyValueInstantiator vi = new MyValueInstantiator();
        StringCollectionDeserializer d = createDeserializer(ct, vi, null, null, null, null);
        assertSame(vi, d.getValueInstantiator());
    }
}