package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.Annotations;

public class FieldPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyAnnotation {
        String value() default "x";
    }

    static class Target {
        public String value = "old";
        @MyAnnotation("abc") public String annotated;
        private String hidden = "hidden";
    }

    /*
     * ===================== Stub classes =====================
     */

    static class TestAnnotations implements Annotations {
        @Override
        public <A extends Annotation> A get(Class<A> cls) { return null; }
        @Override
        public int size() { return 0; }
        @Override
        public Iterator<Annotation> annotations() {
            return Collections.emptyIterator();
        }
    }

    static class TestBeanPropertyDefinition extends BeanPropertyDefinition {
        @Override public String getName() { return "test"; }
        @Override public PropertyName getFullName() { return new PropertyName("test"); }
        @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(String.class); }
        @Override public Class<?> getRawPrimaryType() { return String.class; }
        @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_OPTIONAL; }
        @Override public boolean hasConstructorParameter() { return false; }
        @Override public AnnotatedParameter getConstructorParameter() { return null; }
        @Override public boolean hasField() { return true; }
        @Override public AnnotatedField getField() { return null; }
        @Override public boolean hasGetter() { return false; }
        @Override public AnnotatedMethod getGetter() { return null; }
        @Override public boolean hasSetter() { return false; }
        @Override public AnnotatedMethod getSetter() { return null; }
        @Override public AnnotatedMember getPrimaryMember() { return null; }
        @Override public AnnotatedMember getAccessor() { return null; }
        @Override public AnnotatedMember getMutator() { return null; }
        @Override public BeanPropertyDefinition withName(String newName) { return this; }
        @Override public BeanPropertyDefinition withFullName(PropertyName newName) { return this; }
        @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
        @Override public BeanPropertyDefinition withMetadata(PropertyMetadata newMetadata) { return this; }
    }

    static class TestAnnotatedField extends AnnotatedField {
        private final Field _field;
        public TestAnnotatedField(Field f) {
            super(f, null);
            _field = f;
        }
        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return _field == null ? null : _field.getAnnotation(acls);
        }
        @Override
        public Field getAnnotated() {
            return _field;
        }
    }

    static class TestNullValueProvider implements NullValueProvider {
        private final Object _nullValue;
        public TestNullValueProvider(Object v) { _nullValue = v; }
        @Override
        public Object getNullValue(DeserializationContext ctxt) { return _nullValue; }
    }

    static class TestJsonDeserializer extends JsonDeserializer<Object> {
        private final Object _value;
        private final Object _typedValue;
        public TestJsonDeserializer(Object value) { this(value, value); }
        public TestJsonDeserializer(Object value, Object typedValue) {
            _value = value;
            _typedValue = typedValue;
        }
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _value;
        }
        @Override
        public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException {
            return _typedValue;
        }
    }

    static class TestTypeDeserializer extends TypeDeserializer {
        @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
        @Override public JsonTypeInfo.As getTypeInclusion() { return JsonTypeInfo.As.PROPERTY; }
        @Override public String getPropertyName() { return "@class"; }
        @Override public TypeIdResolver getTypeIdResolver() { return null; }
        @Override public Class<?> getDefaultImpl() { return null; }
        @Override public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) { return null; }
    }

    /*
     * ===================== Helper methods =====================
     */

    private FieldProperty createBaseProperty(Field field, TypeDeserializer typeDeser) {
        BeanPropertyDefinition propDef = new TestBeanPropertyDefinition();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        Annotations annotations = new TestAnnotations();
        AnnotatedField annotated = new TestAnnotatedField(field);
        return new FieldProperty(propDef, type, typeDeser, annotations, annotated);
    }

    private FieldProperty createBaseProperty(Field field) {
        return createBaseProperty(field, null);
    }

    private JsonParser createTokenParser(String json) throws IOException {
        JsonParser p = new JsonFactory().createParser(json);
        p.nextToken();
        return p;
    }

    /*
     * ===================== Tests =====================
     */

    @Test
    public void testWithNameReturnsNewInstance() {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        PropertyName newName = new PropertyName("renamed");
        SettableBeanProperty result = prop.withName(newName);
        assertNotNull(result);
        assertNotSame(prop, result);
    }

    @Test
    public void testWithValueDeserializerSameReturnsSame() {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        TestJsonDeserializer deser = new TestJsonDeserializer("x");
        FieldProperty base = (FieldProperty) prop.withValueDeserializer(deser);
        SettableBeanProperty result = base.withValueDeserializer(deser);
        assertSame(base, result);
    }

    @Test
    public void testWithNullProviderReturnsNewInstanceAndAffectsSkipNulls() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        NullValueProvider nvp = NullsConstantProvider.skipper();
        FieldProperty updated = (FieldProperty) prop.withNullProvider(nvp);
        assertNotSame(prop, updated);

        Target target = new Target();
        JsonParser p = createTokenParser("null");
        updated.deserializeAndSet(p, null, target);
        assertEquals("old", target.value); // skipped
    }

    @Test
    public void testDeserializeAndSetNullWithSkip() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        Target target = new Target();
        JsonParser p = createTokenParser("null");
        prop.deserializeAndSet(p, null, target);
        assertEquals("old", target.value);
    }

    @Test
    public void testDeserializeAndSetNullNoSkip() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        prop = (FieldProperty) prop.withNullProvider(new TestNullValueProvider("DEFAULT"));

        Target target = new Target();
        JsonParser p = createTokenParser("null");
        prop.deserializeAndSet(p, null, target);
        assertEquals("DEFAULT", target.value);
    }

    @Test
    public void testDeserializeAndSetValue() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        prop = (FieldProperty) prop.withValueDeserializer(new TestJsonDeserializer("newValue"));

        Target target = new Target();
        JsonParser p = createTokenParser("\"anything\"");
        prop.deserializeAndSet(p, null, target);
        assertEquals("newValue", target.value);
    }

    @Test
    public void testDeserializeAndSetNullDeserializedSkip() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());
        prop = (FieldProperty) prop.withValueDeserializer(new TestJsonDeserializer(null));

        Target target = new Target();
        JsonParser p = createTokenParser("\"anything\"");
        prop.deserializeAndSet(p, null, target);
        assertEquals("old", target.value);
    }

    @Test
    public void testDeserializeAndSetNullDeserializedNoSkip() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        prop = (FieldProperty) prop.withNullProvider(new TestNullValueProvider("DEFAULT"));
        prop = (FieldProperty) prop.withValueDeserializer(new TestJsonDeserializer(null));

        Target target = new Target();
        JsonParser p = createTokenParser("\"anything\"");
        prop.deserializeAndSet(p, null, target);
        assertEquals("DEFAULT", target.value);
    }

    @Test
    public void testDeserializeAndSetWithTypeDeserializer() throws Exception {
        Field f = Target.class.getField("value");
        TypeDeserializer typeDeser = new TestTypeDeserializer();
        FieldProperty prop = createBaseProperty(f, typeDeser);
        TestJsonDeserializer deser = new TestJsonDeserializer("plain", "typed");
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        Target target = new Target();
        JsonParser p = createTokenParser("\"anything\"");
        prop.deserializeAndSet(p, null, target);
        assertEquals("typed", target.value);
    }

    @Test
    public void testDeserializeSetAndReturnNullSkip() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        Target target = new Target();
        JsonParser p = createTokenParser("null");
        Object result = prop.deserializeSetAndReturn(p, null, target);
        assertSame(target, result);
        assertEquals("old", target.value);
    }

    @Test
    public void testDeserializeSetAndReturnValue() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);
        prop = (FieldProperty) prop.withValueDeserializer(new TestJsonDeserializer("newValue"));

        Target target = new Target();
        JsonParser p = createTokenParser("\"anything\"");
        Object result = prop.deserializeSetAndReturn(p, null, target);
        assertSame(target, result);
        assertEquals("newValue", target.value);
    }

    @Test
    public void testSet() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);

        Target target = new Target();
        prop.set(target, "changed");
        assertEquals("changed", target.value);
    }

    @Test
    public void testSetIllegalAccess() throws Exception {
        Field hidden = Target.class.getDeclaredField("hidden");
        hidden.setAccessible(false);
        FieldProperty prop = createBaseProperty(hidden);

        try {
            prop.set(new Target(), "x");
            fail("Expected IOException");
        } catch (IOException expected) {
            // expected
        }
    }

    @Test
    public void testSetAndReturn() throws Exception {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);

        Target target = new Target();
        Object result = prop.setAndReturn(target, "changed");
        assertSame(target, result);
        assertEquals("changed", target.value);
    }

    @Test
    public void testFixAccess() throws Exception {
        Field hidden = Target.class.getDeclaredField("hidden");
        hidden.setAccessible(false);
        FieldProperty prop = createBaseProperty(hidden);

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        prop.fixAccess(config);
        assertTrue(hidden.isAccessible());
    }

    @Test
    public void testGetAnnotation() {
        Field f = Target.class.getField("annotated");
        FieldProperty prop = createBaseProperty(f);

        MyAnnotation annotation = prop.getAnnotation(MyAnnotation.class);
        assertNotNull(annotation);
        assertEquals("abc", annotation.value());
    }

    @Test
    public void testGetAnnotationNull() {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);

        MyAnnotation annotation = prop.getAnnotation(MyAnnotation.class);
        assertNull(annotation);
    }

    @Test
    public void testGetMember() {
        Field f = Target.class.getField("value");
        FieldProperty prop = createBaseProperty(f);

        AnnotatedMember member = prop.getMember();
        assertNotNull(member);
        assertTrue(member instanceof AnnotatedField);
        assertEquals(f, member.getAnnotated());
    }
}