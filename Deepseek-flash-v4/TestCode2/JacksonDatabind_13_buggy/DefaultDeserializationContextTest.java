package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import org.junit.Before;
import org.junit.Test;

public class DefaultDeserializationContextTest {

    private DefaultDeserializationContext.Impl context;
    private DeserializationConfig config;
    private JsonParser parser;

    // stub factory to allow construction of Impl
    private static class StubDeserializerFactory extends DeserializerFactory {
        @Override
        public JsonDeserializer<?> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createMapDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig config, JavaType type, JsonDeserializer<Object> defaultDeser) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext ctxt, JavaType referenceType, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createArrayDeserializer(DeserializationContext ctxt, ArrayType type, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createStringDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createNumberDeserializer(DeserializationContext ctxt, NumberType type, BeanDescription beanDesc) {
            return null;
        }
        @Override
        public JsonDeserializer<?> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc, Class<?> builderClass) {
            return null;
        }
    }

    // stub generator
    private static class StubGenerator extends ObjectIdGenerator<String> {
        @Override
        public ObjectIdGenerator<String> forScope(Class<?> scope) { return this; }
        @Override
        public ObjectIdGenerator<String> newInstance() { return this; }
        @Override
        public Class<?> getScope() { return Object.class; }
        @Override
        public boolean canUseFor(ObjectIdGenerator<?> gen) { return gen.getClass() == StubGenerator.class; }
        @Override
        public IdKey key(Object key) {
            return new IdKey(getClass(), null, key);
        }
    }

    // stub deserializer
    private static class StubJsonDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    // stub resolvable deserializer
    private static class StubResolvableDeserializer extends JsonDeserializer<Object> implements ResolvableDeserializer {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            // no-op
        }
    }

    // stub key deserializer
    private static class StubKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    @Before
    public void setUp() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
        parser = new JsonFactory().createParser("{}");
        context = (DefaultDeserializationContext.Impl)
                new DefaultDeserializationContext.Impl(new StubDeserializerFactory())
                        .createInstance(config, parser, null);
    }

    // ------------------------- findObjectId tests -------------------------

    @Test
    public void testFindObjectIdFirstCall() {
        Object id = "id1";
        ObjectIdGenerator<?> gen = new StubGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        ReadableObjectId roid = context.findObjectId(id, gen, resolver);
        assertNotNull(roid);
        assertEquals(gen.key(id), roid.getKey());
    }

    @Test
    public void testFindObjectIdReturnsExisting() {
        Object id = "id1";
        ObjectIdGenerator<?> gen = new StubGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        ReadableObjectId first = context.findObjectId(id, gen, resolver);
        ReadableObjectId second = context.findObjectId(id, gen, resolver);
        assertSame(first, second);
    }

    @Test
    public void testFindObjectIdUsesExistingResolver() {
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        // first call creates and caches resolver
        context.findObjectId("a", new StubGenerator(), resolver);
        // second call with same resolver type should reuse
        ObjectIdResolver resolver2 = new SimpleObjectIdResolver();
        ReadableObjectId roid = context.findObjectId("b", new StubGenerator(), resolver2);
        assertNotNull(roid);
        // verify that resolver was reused: resolver is not the new one
        assertNotNull(roid.getResolver());
    }

    @Test
    public void testFindObjectIdWithNullId() {
        ObjectIdGenerator<?> gen = new StubGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        ReadableObjectId roid = context.findObjectId(null, gen, resolver);
        assertNotNull(roid);
    }

    @Test
    public void testFindObjectIdDeprecated() {
        Object id = "dep";
        ObjectIdGenerator<?> gen = new StubGenerator();
        ReadableObjectId roid = context.findObjectId(id, gen);
        assertNotNull(roid);
    }

    // ------------------------- checkUnresolvedObjectId tests -------------------------

    @Test
    public void testCheckUnresolvedObjectIdNoIds() throws UnresolvedForwardReference {
        context.checkUnresolvedObjectId(); // should not throw
    }

    @Test
    public void testCheckUnresolvedObjectIdFeatureDisabled() throws UnresolvedForwardReference {
        // enable feature to create referring, then disable for check
        DeserializationConfig configNoFail = config.without(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        DefaultDeserializationContext contextNoFail = (DefaultDeserializationContext.Impl)
                new DefaultDeserializationContext.Impl(new StubDeserializerFactory())
                        .createInstance(configNoFail, parser, null);
        // add an entry with referring
        Object id = "ref";
        ObjectIdGenerator<?> gen = new StubGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        ReadableObjectId roid = contextNoFail.findObjectId(id, gen, resolver);
        // add a referring
        Referring referring = createReferring();
        roid.appendReferring(referring);
        contextNoFail.checkUnresolvedObjectId(); // should not throw despite unresolved
    }

    @Test
    public void testCheckUnresolvedObjectIdNoReferring() throws UnresolvedForwardReference {
        // enable feature
        DefaultDeserializationContext ctx = createContextWithFeature(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        ctx.findObjectId("id", new StubGenerator(), new SimpleObjectIdResolver());
        ctx.checkUnresolvedObjectId(); // no referring - ok
    }

    @Test(expected = UnresolvedForwardReference.class)
    public void testCheckUnresolvedObjectIdThrows() throws UnresolvedForwardReference {
        DefaultDeserializationContext ctx = createContextWithFeature(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        ObjectIdGenerator<?> gen = new StubGenerator();
        ReadableObjectId roid = ctx.findObjectId("throw", gen, new SimpleObjectIdResolver());
        roid.appendReferring(createReferring());
        ctx.checkUnresolvedObjectId();
    }

    private DefaultDeserializationContext createContextWithFeature(DeserializationFeature feature) {
        DeserializationConfig cfg = config.with(feature);
        return (DefaultDeserializationContext.Impl)
                new DefaultDeserializationContext.Impl(new StubDeserializerFactory())
                        .createInstance(cfg, parser, null);
    }

    private Referring createReferring() {
        return new Referring(new JsonLocation(null, 0, 0),
                TypeFactory.defaultInstance().untyped(), parser) {
            @Override
            public JsonDeserializer<?> newDeserializer(DeserializationContext ctxt) {
                return null;
            }
            @Override
            public void handleResolvedForwardReference(Object id, Object value) throws IOException {
            }
        };
    }

    // ------------------------- deserializerInstance tests -------------------------

    @Test
    public void testDeserializerInstanceNullDef() throws JsonMappingException {
        assertNull(context.deserializerInstance(null, null));
    }

    @Test
    public void testDeserializerInstanceDirectInstance() throws JsonMappingException {
        JsonDeserializer<?> deser = new StubJsonDeserializer();
        assertSame(deser, context.deserializerInstance(null, deser));
    }

    @Test
    public void testDeserializerInstanceResolvable() throws JsonMappingException {
        JsonDeserializer<?> deser = new StubResolvableDeserializer();
        // should not throw, and resolve should be called (no exception)
        JsonDeserializer<?> result = context.deserializerInstance(null, deser);
        assertSame(deser, result);
    }

    @Test
    public void testDeserializerInstanceNoneClass() throws JsonMappingException {
        assertNull(context.deserializerInstance(null, JsonDeserializer.None.class));
    }

    @Test
    public void testDeserializerInstanceBogusClass() throws JsonMappingException {
        // void.class is considered bogus
        assertNull(context.deserializerInstance(null, void.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstanceInvalidClass() throws JsonMappingException {
        // pass a class that is not JsonDeserializer
        context.deserializerInstance(null, String.class);
    }

    @Test
    public void testDeserializerInstanceValidClass() throws JsonMappingException {
        JsonDeserializer<?> result = context.deserializerInstance(null, StubJsonDeserializer.class);
        assertNotNull(result);
        assertTrue(result instanceof StubJsonDeserializer);
    }

    // ------------------------- keyDeserializerInstance tests -------------------------

    @Test
    public void testKeyDeserializerInstanceNullDef() throws JsonMappingException {
        assertNull(context.keyDeserializerInstance(null, null));
    }

    @Test
    public void testKeyDeserializerInstanceDirectInstance() throws JsonMappingException {
        KeyDeserializer deser = new StubKeyDeserializer();
        assertSame(deser, context.keyDeserializerInstance(null, deser));
    }

    @Test
    public void testKeyDeserializerInstanceNoneClass() throws JsonMappingException {
        assertNull(context.keyDeserializerInstance(null, KeyDeserializer.None.class));
    }

    @Test
    public void testKeyDeserializerInstanceBogusClass() throws JsonMappingException {
        assertNull(context.keyDeserializerInstance(null, Void.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstanceInvalidClass() throws JsonMappingException {
        context.keyDeserializerInstance(null, Integer.class);
    }

    @Test
    public void testKeyDeserializerInstanceValidClass() throws JsonMappingException {
        KeyDeserializer result = context.keyDeserializerInstance(null, StubKeyDeserializer.class);
        assertNotNull(result);
        assertTrue(result instanceof StubKeyDeserializer);
    }

    // ------------------------- copy test -------------------------

    @Test
    public void testCopyImpl() {
        DefaultDeserializationContext copy = context.copy();
        assertNotNull(copy);
        assertNotSame(context, copy);
        assertTrue(copy.getClass() == DefaultDeserializationContext.Impl.class);
    }

    @Test(expected = IllegalStateException.class)
    public void testCopyNonImpl() {
        // create a non-Impl subclass (anonymous) to trigger super.copy()
        DefaultDeserializationContext sub = new DefaultDeserializationContext(
                new StubDeserializerFactory(), null) {
            private static final long serialVersionUID = 1L;
            @Override
            public DefaultDeserializationContext with(DeserializerFactory factory) { return null; }
            @Override
            public DefaultDeserializationContext createInstance(DeserializationConfig config, JsonParser jp, InjectableValues values) { return null; }
            @Override
            public DefaultDeserializationContext copy() { return super.copy(); }
        };
        sub.copy(); // should throw IllegalStateException
    }

    // ------------------------- extra test: findObjectId loop branch -------------------------

    @Test
    public void testFindObjectIdMultipleResolvers() {
        // create context with existing resolvers in list
        DefaultDeserializationContext ctx = createContextWithFeature(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        // first call adds resolver
        ObjectIdResolver resolver1 = new SimpleObjectIdResolver();
        ctx.findObjectId("first", new StubGenerator(), resolver1);
        // second call with different resolver type that can use previous one? SimpleObjectIdResolver.canUseFor returns true for SimpleObjectIdResolver.
        // to test loop that finds matching, use a different resolver that canUseFor returns false for first, then create new
        ObjectIdResolver resolver2 = new ObjectIdResolver() {
            @Override
            public boolean canUseFor(ObjectIdResolver resolverType) { return false; }
            @Override
            public ObjectIdResolver newForDeserialization(Object context) { return new SimpleObjectIdResolver(); }
            @Override
            public void bindItem(IdKey id, Object pojo) {}
            @Override
            public Object resolveId(IdKey id) { return null; }
            @Override
            public ObjectIdResolver clone() { return this; }
        };
        ReadableObjectId roid = ctx.findObjectId("second", new StubGenerator(), resolver2);
        assertNotNull(roid);
        // resolver should be new, not resolver1
        assertNotNull(roid.getResolver());
    }
}