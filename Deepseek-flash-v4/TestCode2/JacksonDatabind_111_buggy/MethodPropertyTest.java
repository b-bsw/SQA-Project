package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperFeature;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodPropertyTest {

    private static final JsonFactory JSON_FACTORY = new JsonFactory();

    // ---------- Test beans ----------
    public static class TestBean {
        public String value;

        public void setValue(String v) { this.value = v; }

        public Object setValueReturn(String v) {
            this.value = v;
            return "returned";
        }

        public Object setValueReturnNull(String v) {
            this.value = v;
            return null;
        }

        public String getValue() { return value; }
    }

    public static class ThrowingBean {
        public void setValue(String v) {
            throw new IllegalStateException("boom");
        }
    }

    // ---------- Stubs / helpers ----------
    static class SimpleAnnotations implements Annotations {
        @Override
        @SuppressWarnings("unchecked")
        public <A extends Annotation> A getAnnotation(Class<A> annoClass) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }

    static class SimplePropDef extends BeanPropertyDefinition {
        private final String name;

        SimplePropDef(String name) {
            this.name = name;
        }

        @Override public String getName() { return name; }
        @Override public PropertyName getFullName() { return new PropertyName(name); }
        @Override public String getInternalName() { return name; }
        @Override public PropertyName getWrapperName() { return null; }
        @Override public boolean isExplicitlyIncluded() { return false; }
        @Override public boolean isExplicitlyNamed() { return false; }
        @Override public boolean isRequired() { return false; }
        @Override public boolean couldSerialize() { return true; }
        @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(String.class); }
        @Override public AnnotatedMember getPrimaryMember() { return null; }
        @Override public AnnotatedMember getGetter() { return null; }
        @Override public AnnotatedMember getSetter() { return null; }
        @Override public AnnotatedMember getField() { return null; }
        @Override public AnnotatedMember getConstructorParameter() { return null; }
    }

    static class RecorderAnnotatedMethod extends AnnotatedMethod {
        boolean fixed;
        Object annotationResult;

        RecorderAnnotatedMethod(Method m) {
            super(m, null, null);
        }

        @Override
        public void fixAccess(boolean force) {
            this.fixed = force;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> annoClass) {
            return (A) annotationResult;
        }
    }

    static class FixedDeserializer extends JsonDeserializer<Object> {
        private final Object value;
        private final Object typedValue;

        FixedDeserializer(Object value) {
            this(value, null);
        }

        FixedDeserializer(Object value, Object typedValue) {
            this.value = value;
            this.typedValue = typedValue;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return value;
        }

        @Override
        public Object deserializeWithType(JsonParser p, DeserializationContext ctxt,
                                          TypeDeserializer typeDeserializer) {
            return typedValue;
        }
    }

    static class FixedNullProvider implements NullValueProvider {
        private final Object nullValue;

        FixedNullProvider(Object nullValue) {
            this.nullValue = nullValue;
        }

        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return nullValue;
        }
    }

    static class SimpleTypeDeserializer extends TypeDeserializer {
        @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
        @Override public JsonToken getStyle() { return JsonToken.VALUE_STRING; }
        @Override public JavaType getTypeIdType() { return null; }
        @Override public String getTypeId() { return null; }
        @Override public String getTypeId(Object value) { return null; }
        @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    private MethodProperty createProperty(Method m, JsonDeserializer<Object> deser,
                                          NullValueProvider nva,
                                          TypeDeserializer typeDeser) {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMethod annotated = new RecorderAnnotatedMethod(m);
        BeanPropertyDefinition propDef = new SimplePropDef("value");

        MethodProperty mp = new MethodProperty(
                propDef, stringType, typeDeser, new SimpleAnnotations(), annotated);

        if (deser != null) {
            mp = (MethodProperty) mp.withValueDeserializer(deser);
        }
        if (nva != null) {
            mp = (MethodProperty) mp.withNullProvider(nva);
        }
        return mp;
    }

    private JsonParser parserFor(String json) throws IOException {
        JsonParser p = JSON_FACTORY.createParser(json);
        p.nextToken();
        return p;
    }

    // ---------- Tests ----------
    @Test
    public void testWithValueDeserializerSameInstance() throws Exception {
        Method setter = TestBean.class.getMethod("setValue", String.class);
        MethodProperty mp = createProperty(setter, new FixedDeserializer("x"), null, null);

        assertSame(mp, mp.withValueDeserializer(new FixedDeserializer("x")));
    }

    @Test
    public void testWithNullProviderUpdatesSkip() throws Exception {
        Method setter = TestBean.class.getMethod("setValue", String.class);
        MethodProperty mp = createProperty(setter, new FixedDeserializer("x"), null, null);
        assertFalse(mp.withNullProvider(new FixedNullProvider("null")).toString().isEmpty());
    }

    @Test
    public void testDeserializeNonNullValue() throws Exception {
        Method setter = TestBean.class.getMethod("setValue", String.class);
        MethodProperty mp = createProperty(setter, new FixedDeserializer("foo"), null, null);

        TestBean bean = new TestBean();
        mp.deserializeAndSet(parserFor("\"ignored\""), null, bean);

        assertEquals("foo", bean.value);
    }

    @Test
    public void testDeserializeNullTokenUsesNullProvider() throws Exception {
        Method setter = TestBean.class.getMethod("setValue", String.class);
        MethodProperty mp = createProperty(
                setter,
                new FixedDeserializer("shouldNotBeUsed"),
                new FixedNullProvider("fromProvider"),
                null);

        TestBean bean = new TestBean();
        mp.deserializeAndSet(parserFor("null"), null, bean);

        assertEquals("fromProvider", bean.value);
    }

    @Test
    public void testDeserializeWithTypeDeserializer() throws Exception {
        Method setter = TestBean.class.getMethod("setValue", String.class);
        MethodProperty mp = createProperty(
                setter,
                new FixedDeserializer("plain", "typedValue"),
                null,
                new SimpleTypeDeserializer());

        TestBean bean = new TestBean();
        mp.deserializeAndSet(parserFor("\"anything\""), null, bean);

        assertEquals("typedValue", bean.value);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithThrowingSetter() throws Exception {
        Method setter = ThrowingBean.class.getMethod("setValue", String.class);
        MethodProperty mp = createProperty(setter, new FixedDeserializer("x"), null, null);

        mp.deserializeAndSet(parserFor("\"anything\""), null, new ThrowingBean());
    }

    @Test
    public void testSetAndReturn() throws Exception {
        Method setter = TestBean.class.getMethod("setValueReturn", String.class);
        MethodProperty mp = createProperty(setter, new FixedDeserializer("foo"), null, null);

        TestBean bean = new TestBean();
        Object result = mp.setAndReturn(parserFor("\"raw\""), null, bean, "foo");

        assertEquals("returned", result);
        assertEquals("foo", bean.value);
    }

    @Test
    public void testFixAccess() throws Exception {
        Method setter = TestBean.class.getMethod("setValue", String.class);
        RecorderAnnotatedMethod annotated = new RecorderAnnotatedMethod(setter);

        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        MethodProperty mp = new MethodProperty(
                new SimplePropDef("value"), stringType, null, new SimpleAnnotations(), annotated);

        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        mp.fixAccess(config);

        assertTrue(annotated.fixed ==
                config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }
}