package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.*;

public class BeanDeserializerFactoryTest {

    static class NotABeanSubFactory extends BeanDeserializerFactory {
        NotABeanSubFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    public static class SimpleBean {
        public String name;
        public int count;
    }

    @JsonDeserialize(builder = BuilderBean.Builder.class)
    public static class BuilderBean {
        private final String value;

        private BuilderBean(String v) {
            value = v;
        }

        public String getValue() {
            return value;
        }

        @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "build")
        public static class Builder {
            private String value;

            public Builder withValue(String v) {
                this.value = v;
                return this;
            }

            public BuilderBean build() {
                return new BuilderBean(value);
            }
        }
    }

    public static class MyException extends Exception {
        private String detail;

        public MyException() {
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }
    }

    @JsonIgnoreType
    public static class IgnoredValue {
        public int x;
    }

    public static class IgnoredTypeBean {
        public String name;
        public IgnoredValue ignored;
    }

    public static class AnySetterBean {
        private Map<String, Object> extras = new HashMap<String, Object>();

        @JsonAnySetter
        public void add(String key, Object value) {
            extras.put(key, value);
        }

        public Map<String, Object> getExtras() {
            return extras;
        }
    }

    public static class InjectableBean {
        @JacksonInject
        public String injected;
        public String normal;
    }

    public static class CollectionHolder {
        private List<String> items = new ArrayList<String>();

        @JsonProperty("items")
        public List<String> getItems() {
            return items;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class ObjectIdBean {
        public int id;
        public String name;
    }

    @Test
    public void testWithConfigSameConfigReturnsThis() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg);
        assertSame(factory, factory.withConfig(cfg));
    }

    @Test
    public void testWithConfigDifferentConfigCreatesNewInstance() {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory result = factory.withConfig(new DeserializerFactoryConfig());
        assertNotNull(result);
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigSubclassSameConfigReturnsThis() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        NotABeanSubFactory factory = new NotABeanSubFactory(cfg);
        assertSame(factory, factory.withConfig(cfg));
    }

    @Test
    public void testWithConfigSubclassRejectsNewConfig() {
        NotABeanSubFactory factory = new NotABeanSubFactory(new DeserializerFactoryConfig());
        try {
            factory.withConfig(new DeserializerFactoryConfig());
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSimpleBeanDeserialization() throws Exception {
        SimpleBean bean = new ObjectMapper().readValue("{\"name\":\"x\",\"count\":2}", SimpleBean.class);
        assertEquals("x", bean.name);
        assertEquals(2, bean.count);
    }

    @Test
    public void testBuilderBasedDeserialization() throws Exception {
        BuilderBean bean = new ObjectMapper().readValue("{\"value\":\"abc\"}", BuilderBean.class);
        assertEquals("abc", bean.getValue());
    }

    @Test
    public void testThrowableDeserialization() throws Exception {
        MyException ex = new ObjectMapper().readValue("{\"detail\":\"oops\"}", MyException.class);
        assertEquals("oops", ex.getDetail());
    }

    @Test
    public void testIgnoredTypePropertyIsSkipped() throws Exception {
        IgnoredTypeBean bean = new ObjectMapper()
                .readValue("{\"name\":\"n\",\"ignored\":{\"x\":1}}", IgnoredTypeBean.class);
        assertEquals("n", bean.name);
        assertNull(bean.ignored);
    }

    @Test
    public void testAnySetterReceivesUnknownProperties() throws Exception {
        AnySetterBean bean = new ObjectMapper().readValue("{\"a\":1,\"b\":\"two\"}", AnySetterBean.class);
        assertEquals(2, bean.getExtras().size());
        assertEquals(1, bean.getExtras().get("a"));
        assertEquals("two", bean.getExtras().get("b"));
    }

    @Test
    public void testInjectableValueIsInjected() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setInjectableValues(new InjectableValues.Std().addValue("injected", "injected-value"));
        InjectableBean bean = mapper.readValue("{\"normal\":\"n\"}", InjectableBean.class);
        assertEquals("injected-value", bean.injected);
        assertEquals("n", bean.normal);
    }

    @Test
    public void testSetterlessCollectionPropertyIsPopulated() throws Exception {
        CollectionHolder holder = new ObjectMapper().readValue("{\"items\":[\"a\",\"b\"]}", CollectionHolder.class);
        assertEquals(Arrays.asList("a", "b"), holder.getItems());
    }

    @Test
    public void testObjectIdReaderIsConstructed() throws Exception {
        ObjectIdBean bean = new ObjectMapper().readValue("{\"id\":1,\"name\":\"x\"}", ObjectIdBean.class);
        assertEquals(1, bean.id);
        assertEquals("x", bean.name);
    }

    @Test
    public void testLocalClassIsRejectedAsBeanType() throws Exception {
        class LocalBean {
            public int x;
        }
        try {
            new ObjectMapper().readValue("{\"x\":1}", LocalBean.class);
            fail("Expected IllegalArgumentException for local class");
        } catch (Exception e) {
            Throwable t = e;
            while (t != null) {
                if (t instanceof IllegalArgumentException) {
                    return;
                }
                t = t.getCause();
            }
            fail("Expected IllegalArgumentException but got " + e);
        }
    }
}