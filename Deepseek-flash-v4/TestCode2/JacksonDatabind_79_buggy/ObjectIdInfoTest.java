package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;

public class ObjectIdInfoTest {

    static class TestObjectIdGenerator extends ObjectIdGenerator<Object> {
        private static final long serialVersionUID = 1L;

        @Override
        public Class<Object> getScope() {
            return Object.class;
        }

        @Override
        public boolean canUseFor(ObjectIdGenerator<?> generator) {
            return false;
        }

        @Override
        public ObjectIdGenerator<Object> forScope(Class<?> scope) {
            return this;
        }

        @Override
        public ObjectIdGenerator<Object> newForSerialization(Object context) {
            return this;
        }

        @Override
        public ObjectIdGenerator.IdKey key(Object key) {
            return null;
        }
    }

    static class TestObjectIdResolver implements ObjectIdResolver {
        @Override
        public Object resolveId(ObjectIdGenerator.IdKey idKey) {
            return null;
        }

        @Override
        public void bindItem(ObjectIdGenerator.IdKey idKey, Object ob) {
        }

        @Override
        public ObjectIdResolver newForDeserialization(Object context) {
            return this;
        }

        @Override
        public boolean canUseFor(ObjectIdResolver resolverType) {
            return false;
        }
    }

    @Test
    public void testPublicConstructorAndGetters() {
        PropertyName name = new PropertyName("id");
        Class<String> scope = String.class;
        ObjectIdInfo info = new ObjectIdInfo(name, scope, TestObjectIdGenerator.class,
                TestObjectIdResolver.class);

        assertSame(name, info.getPropertyName());
        assertSame(scope, info.getScope());
        assertEquals(TestObjectIdGenerator.class, info.getGeneratorType());
        assertEquals(TestObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testNullResolverDefaultsToSimpleObjectIdResolver() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("id"), Object.class,
                TestObjectIdGenerator.class, null);

        assertNotNull(info.getResolverType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    @Test
    public void testDeprecatedStringConstructor() {
        ObjectIdInfo info = new ObjectIdInfo("id", Integer.class, TestObjectIdGenerator.class);

        assertEquals(new PropertyName("id"), info.getPropertyName());
        assertEquals(Integer.class, info.getScope());
        assertEquals(TestObjectIdGenerator.class, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testWithAlwaysAsIdBranches() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("id"), Object.class,
                TestObjectIdGenerator.class, TestObjectIdResolver.class);

        assertSame(info, info.withAlwaysAsId(false));

        ObjectIdInfo changed = info.withAlwaysAsId(true);
        assertNotSame(info, changed);
        assertFalse(info.getAlwaysAsId());
        assertTrue(changed.getAlwaysAsId());
        assertSame(info.getPropertyName(), changed.getPropertyName());
        assertSame(info.getScope(), changed.getScope());
        assertSame(info.getGeneratorType(), changed.getGeneratorType());
        assertSame(info.getResolverType(), changed.getResolverType());

        assertSame(changed, changed.withAlwaysAsId(true));
    }

    @Test
    public void testToStringUsesNameAndNullHandling() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("id"), Object.class,
                TestObjectIdGenerator.class, TestObjectIdResolver.class);
        String expected = "ObjectIdInfo: propName=id"
                + ", scope=java.lang.Object"
                + ", generatorType=" + TestObjectIdGenerator.class.getName()
                + ", alwaysAsId=false";
        assertEquals(expected, info.toString());

        ObjectIdInfo nullInfo = new ObjectIdInfo(new PropertyName("x"), null,
                (Class<? extends ObjectIdGenerator<?>>) null, SimpleObjectIdResolver.class);
        String nullString = nullInfo.toString();
        assertTrue(nullString.contains("scope=null"));
        assertTrue(nullString.contains("generatorType=null"));
    }
}