package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.Annotations;

public class SetterlessPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Marker {}

    public static class ValuesBean {
        private List<String> values = new ArrayList<String>();

        @Marker
        public List<String> getValues() {
            return values;
        }
    }

    public static class NullGetterBean {
        public List<String> getValues() {
            return null;
        }
    }

    private SetterlessProperty property(Class<?> beanClass, String propertyName) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription beanDesc = mapper.getSerializationConfig()
                .introspect(mapper.constructType(beanClass));

        for (BeanPropertyDefinition def : beanDesc.findProperties()) {
            if (propertyName.equals(def.getName())) {
                AnnotatedMethod getter = def.getGetter();
                return new SetterlessProperty(
                        def,
                        def.getPrimaryType(),
                        null,
                        getter.getAnnotations(),
                        getter);
            }
        }

        throw new IllegalStateException("Property not found: " + propertyName);
    }

    private JsonDeserializer<Object> listDeserializer() {
        return new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt, Object intoValue)
                    throws IOException {
                @SuppressWarnings("unchecked")
                List<String> list = (List<String>) intoValue;
                while (p.nextToken() != JsonToken.END_ARRAY) {
                    list.add(p.getText());
                }
                return intoValue;
            }
        };
    }

    @Test
    public void withNameReturnsNewProperty() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");
        SetterlessProperty renamed = prop.withName(new PropertyName("renamed"));

        assertNotSame(prop, renamed);
    }

    @Test
    public void withValueDeserializerReturnsSameForNullDeserializer() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");

        assertSame(prop, prop.withValueDeserializer(null));
    }

    @Test
    public void withValueDeserializerReturnsNewPropertyForNewDeserializer() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");
        JsonDeserializer<Object> deserializer = listDeserializer();

        SetterlessProperty changed = (SetterlessProperty) prop.withValueDeserializer(deserializer);

        assertNotSame(prop, changed);
        assertSame(changed, changed.withValueDeserializer(deserializer));
    }

    @Test
    public void withNullProviderReturnsNewProperty() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");

        SetterlessProperty changed = prop.withNullProvider((NullValueProvider) null);

        assertNotSame(prop, changed);
    }

    @Test
    public void getMemberExposesAnnotatedMethod() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");

        assertTrue(prop.getMember() instanceof AnnotatedMethod);
    }

    @Test
    public void getAnnotationReturnsMethodAnnotation() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");

        assertNotNull(prop.getAnnotation(Marker.class));
    }

    @Test
    public void fixAccessDoesNotFail() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");

        prop.fixAccess(new ObjectMapper().getDeserializationConfig());
    }

    @Test
    public void deserializeAndSetSkipsOnNullToken() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = property(ValuesBean.class, "values");

        ValuesBean bean = new ValuesBean();
        bean.getValues().add("x");

        try (JsonParser p = mapper.getFactory().createParser("null")) {
            assertEquals(JsonToken.VALUE_NULL, p.nextToken());
            prop.deserializeAndSet(p, mapper.getDeserializationContext(), bean);
        }

        assertEquals(Collections.singletonList("x"), bean.getValues());
    }

    @Test
    public void deserializeAndSetUsesReturnedValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = property(ValuesBean.class, "values");
        SetterlessProperty propWithDeser = (SetterlessProperty) prop.withValueDeserializer(listDeserializer());

        ValuesBean bean = new ValuesBean();
        bean.getValues().add("x");

        try (JsonParser p = mapper.getFactory().createParser("[\"a\",\"b\"]")) {
            assertEquals(JsonToken.START_ARRAY, p.nextToken());
            propWithDeser.deserializeAndSet(p, mapper.getDeserializationContext(), bean);
        }

        List<String> expected = new ArrayList<String>();
        expected.add("x");
        expected.add("a");
        expected.add("b");

        assertEquals(expected, bean.getValues());
    }

    @Test
    public void deserializeSetAndReturnReturnsSameInstance() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = property(ValuesBean.class, "values");
        SetterlessProperty propWithDeser = (SetterlessProperty) prop.withValueDeserializer(listDeserializer());

        ValuesBean bean = new ValuesBean();

        try (JsonParser p = mapper.getFactory().createParser("[\"a\"]")) {
            assertEquals(JsonToken.START_ARRAY, p.nextToken());
            Object result = propWithDeser.deserializeSetAndReturn(p, mapper.getDeserializationContext(), bean);

            assertSame(bean, result);
        }

        assertEquals(Collections.singletonList("a"), bean.getValues());
    }

    @Test(expected = JsonMappingException.class)
    public void deserializeAndSetWithNullCurrentValueThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = property(NullGetterBean.class, "values");

        try (JsonParser p = mapper.getFactory().createParser("[\"a\"]")) {
            assertEquals(JsonToken.START_ARRAY, p.nextToken());
            prop.deserializeAndSet(p, mapper.getDeserializationContext(), new NullGetterBean());
        }
    }

    @Test
    public void setThrowsUnsupportedOperation() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");

        try {
            prop.set(new ValuesBean(), null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void setAndReturnThrowsUnsupportedOperation() throws Exception {
        SetterlessProperty prop = property(ValuesBean.class, "values");

        try {
            prop.setAndReturn(new ValuesBean(), null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }
}