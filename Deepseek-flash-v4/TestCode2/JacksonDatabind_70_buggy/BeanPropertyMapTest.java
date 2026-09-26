package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyMapTest {

    private static SettableBeanProperty prop(String name) {
        return new MockBeanProperty(name);
    }

    private static BeanPropertyMap map(boolean ci, SettableBeanProperty... props) {
        return new BeanPropertyMap(ci, Arrays.asList(props));
    }

    @Test
    public void testConstructSizes() {
        int[] sizes = new int[] { 0, 1, 5, 6, 12, 13 };
        for (int n : sizes) {
            List<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>();
            for (int i = 0; i < n; ++i) {
                props.add(prop("p" + i));
            }
            BeanPropertyMap m = new BeanPropertyMap(false, props);
            assertEquals(n, m.size());
            if (n > 0) {
                assertNotNull(m.find("p0"));
                assertNotNull(m.find("p" + (n - 1)));
            } else {
                assertFalse(m.iterator().hasNext());
                assertEquals(0, m.getPropertiesInInsertionOrder().length);
            }
        }
    }

    @Test
    public void testCaseSensitiveFind() {
        BeanPropertyMap m = map(false, prop("Name"));
        assertNull(m.find("name"));
        assertNotNull(m.find("Name"));
    }

    @Test
    public void testCaseInsensitiveFind() {
        BeanPropertyMap m = map(true, prop("Name"));
        assertNotNull(m.find("name"));
        assertNotNull(m.find("NAME"));
        assertNotNull(m.find("Name"));
    }

    @Test
    public void testWithCaseInsensitivity() {
        BeanPropertyMap cs = map(false, prop("Name"));
        BeanPropertyMap ci = cs.withCaseInsensitivity(true);
        assertNotSame(cs, ci);
        assertNotNull(ci.find("name"));
        assertSame(cs, cs.withCaseInsensitivity(false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindNullThrows() {
        map(false).find(null);
    }

    @Test
    public void testFindNotFoundReturnsNull() {
        BeanPropertyMap m = map(false, prop("a"));
        assertNull(m.find("b"));
        assertNull(m.find(99));
    }

    @Test
    public void testWithPropertyReplace() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"));
        MockBeanProperty newA = new MockBeanProperty("a");
        assertSame(m, m.withProperty(newA));
        assertSame(newA, m.find("a"));
        assertNotNull(m.find("b"));
        assertEquals(2, m.getPropertiesInInsertionOrder().length);
    }

    @Test
    public void testWithPropertyAdd() {
        BeanPropertyMap m = map(false, prop("a"));
        assertSame(m, m.withProperty(prop("b")));
        assertNotNull(m.find("a"));
        assertNotNull(m.find("b"));
        assertEquals(2, m.getPropertiesInInsertionOrder().length);
    }

    @Test
    public void testAssignIndexes() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"), prop("c"));
        m.assignIndexes();
        Set<Integer> indexes = new HashSet<Integer>();
        for (int i = 0; i < 3; ++i) {
            SettableBeanProperty p = m.find(i);
            assertNotNull("index " + i, p);
            indexes.add(p.getPropertyIndex());
        }
        assertEquals(3, indexes.size());
        assertTrue(indexes.contains(0));
        assertTrue(indexes.contains(1));
        assertTrue(indexes.contains(2));
    }

    @Test
    public void testRenameAll() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"), prop("c"));
        assertSame(m, m.renameAll(null));
        assertSame(m, m.renameAll(NameTransformer.NOP));

        NameTransformer xf = new NameTransformer() {
            @Override
            public String transform(String name) {
                return "x" + name;
            }
        };
        BeanPropertyMap renamed = m.renameAll(xf);
        assertNotSame(m, renamed);
        assertNull(renamed.find("a"));
        assertNotNull(renamed.find("xa"));
        assertNotNull(renamed.find("xb"));
        assertNotNull(renamed.find("xc"));
    }

    @Test
    public void testWithoutProperties() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"), prop("c"));
        assertSame(m, m.withoutProperties(Collections.<String>emptySet()));

        Set<String> ex = new HashSet<String>();
        ex.add("b");
        BeanPropertyMap reduced = m.withoutProperties(ex);
        assertNotSame(m, reduced);
        assertEquals(2, reduced.size());
        assertNull(reduced.find("b"));
        assertNotNull(reduced.find("a"));
        assertNotNull(reduced.find("c"));
        assertNotNull(m.find("b"));
    }

    @Test
    public void testWithoutPropertiesRemovesAll() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"));
        Set<String> all = new HashSet<String>(Arrays.asList("a", "b"));
        BeanPropertyMap empty = m.withoutProperties(all);
        assertEquals(0, empty.size());
    }

    @Test
    public void testReplace() {
        BeanPropertyMap m = map(false, prop("a"));
        MockBeanProperty newA = new MockBeanProperty("a");
        m.replace(newA);
        assertSame(newA, m.find("a"));
        try {
            m.replace(prop("b"));
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testRemove() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"), prop("c"));
        m.remove(m.find("b"));
        assertEquals(2, m.size());
        assertNull(m.find("b"));
        assertNotNull(m.find("a"));
        assertNotNull(m.find("c"));

        try {
            m.remove(prop("b"));
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testGetPropertiesInInsertionOrder() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"), prop("c"));
        SettableBeanProperty[] ordered = m.getPropertiesInInsertionOrder();
        assertEquals(3, ordered.length);
        assertEquals("a", ordered[0].getName());
        assertEquals("b", ordered[1].getName());
        assertEquals("c", ordered[2].getName());

        m.remove(m.find("b"));
        ordered = m.getPropertiesInInsertionOrder();
        assertEquals(3, ordered.length);
        assertNull(ordered[1]);
    }

    @Test
    public void testIteratorAfterRemove() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"), prop("c"));
        m.remove(m.find("b"));
        Iterator<SettableBeanProperty> it = m.iterator();
        Set<String> names = new HashSet<String>();
        while (it.hasNext()) {
            names.add(it.next().getName());
        }
        assertEquals(new HashSet<String>(Arrays.asList("a", "c")), names);
    }

    @Test
    public void testSpillOverCollisions() {
        BeanPropertyMap m = map(false, prop("a"), prop("q"), prop("1"), prop("A"));
        assertNotNull(m.find("a"));
        assertNotNull(m.find("q"));
        assertNotNull(m.find("1"));
        assertNotNull(m.find("A"));
        assertEquals(4, m.getPropertiesInInsertionOrder().length);
    }

    @Test
    public void testFindDeserializeAndSet() throws Exception {
        BeanPropertyMap m = map(false, prop("a"));
        MockBeanProperty p = (MockBeanProperty) m.find("a");
        assertFalse(p.wasDeserializeCalled());
        assertTrue(m.findDeserializeAndSet(null, null, new Object(), "a"));
        assertTrue(p.wasDeserializeCalled());
        assertFalse(m.findDeserializeAndSet(null, null, new Object(), "none"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDeserializeAndSetNullKey() throws Exception {
        map(false).findDeserializeAndSet(null, null, new Object(), null);
    }

    @Test(expected = IOException.class)
    public void testFindDeserializeAndSetWrapsException() throws Exception {
        BeanPropertyMap m = map(false);
        MockBeanProperty p = new MockBeanProperty("bad");
        p.setThrowOnDeserialize(true);
        m.withProperty(p);
        m.findDeserializeAndSet(null, null, new Object(), "bad");
    }

    @Test
    public void testToString() {
        BeanPropertyMap m = map(false, prop("a"), prop("b"));
        String s = m.toString();
        assertTrue(s.startsWith("Properties=["));
        assertTrue(s.contains("a"));
        assertTrue(s.contains("b"));
    }

    private static class MockBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private final String name;
        private final JavaType type;
        private int index;
        private boolean throwOnDeserialize;
        private boolean deserializeCalled;

        public MockBeanProperty(String name) {
            this(name, TypeFactory.defaultInstance().constructType(String.class));
        }

        public MockBeanProperty(String name, JavaType type) {
            super(name, type, null, null, -1);
            this.name = name;
            this.type = type;
        }

        public void setThrowOnDeserialize(boolean b) {
            throwOnDeserialize = b;
        }

        public boolean wasDeserializeCalled() {
            return deserializeCalled;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public PropertyName getFullName() {
            return new PropertyName(name);
        }

        @Override
        public JavaType getType() {
            return type;
        }

        @Override
        public int getPropertyIndex() {
            return index;
        }

        @Override
        public void assignIndex(int index) {
            this.index = index;
        }

        @Override
        public SettableBeanProperty withName(String name) {
            return new MockBeanProperty(name, type);
        }

        @Override
        public SettableBeanProperty withSimpleName(String simpleName) {
            return new MockBeanProperty(simpleName, type);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            MockBeanProperty p = new MockBeanProperty(name, type);
            p.index = index;
            p.throwOnDeserialize = throwOnDeserialize;
            return p;
        }

        @Override
        public SettableBeanProperty withIndex(int index) {
            MockBeanProperty p = new MockBeanProperty(name, type);
            p.index = index;
            p.throwOnDeserialize = throwOnDeserialize;
            return p;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            deserializeCalled = true;
            if (throwOnDeserialize) {
                throw new IllegalArgumentException("boom");
            }
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            deserializeCalled = true;
            if (throwOnDeserialize) {
                throw new IllegalArgumentException("boom");
            }
            return instance;
        }

        @Override
        public void fixAccess(DeserializationConfig config) { }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public <A extends Annotation> A getContextAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }
    }
}