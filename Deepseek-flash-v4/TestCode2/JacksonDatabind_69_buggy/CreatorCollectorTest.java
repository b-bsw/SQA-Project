package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.util.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.*;

public class CreatorCollectorTest {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static class CreatorBean {
        public CreatorBean() { }
        public CreatorBean(String ignored) { }
        public static CreatorBean fromString(String value) { return new CreatorBean(); }
        public static CreatorBean fromInt(int value) { return new CreatorBean(); }
        public static CreatorBean fromLong(long value) { return new CreatorBean(); }
        public static CreatorBean fromDouble(double value) { return new CreatorBean(); }
        public static CreatorBean fromBoolean(boolean value) { return new CreatorBean(); }
        public static CreatorBean fromObject(Object value) { return new CreatorBean(); }
        public static CreatorBean fromList(List<String> value) { return new CreatorBean(); }
    }

    public static class DupCreator {
        public static DupCreator first(String value) { return new DupCreator(); }
        public static DupCreator second(String value) { return new DupCreator(); }
    }

    private static CreatorCollector collector(Class<?> beanClass) {
        DeserializationConfig config = MAPPER.getDeserializationConfig();
        BeanDescription desc = config.introspect(MAPPER.getTypeFactory().constructType(beanClass));
        return new CreatorCollector(desc, config);
    }

    private static AnnotatedWithParams defaultCtor(Class<?> beanClass) {
        BeanDescription desc = MAPPER.getDeserializationConfig()
                .introspect(MAPPER.getTypeFactory().constructType(beanClass));
        return desc.findDefaultConstructor();
    }

    private static AnnotatedWithParams method(Class<?> beanClass, String name) {
        BeanDescription desc = MAPPER.getDeserializationConfig()
                .introspect(MAPPER.getTypeFactory().constructType(beanClass));
        for (AnnotatedMethod m : desc.getClassInfo().getStaticMethods()) {
            if (name.equals(m.getName())) {
                return m;
            }
        }
        throw new AssertionError("No static method " + name + " in " + beanClass.getName());
    }

    private static SettableBeanProperty property(String name, AnnotatedParameter param) {
        return new CreatorProperty(new PropertyName(name),
                MAPPER.getTypeFactory().constructType(String.class),
                null, param, null, 0, null, false);
    }

    private void assertVanilla(Class<?> beanClass, String expectedDesc) throws Exception {
        CreatorCollector c = collector(beanClass);
        ValueInstantiator vi = c.constructValueInstantiator(MAPPER.getDeserializationConfig());
        assertEquals(expectedDesc, vi.getValueTypeDesc());
        assertTrue(vi.canInstantiate());
        assertTrue(vi.canCreateUsingDefault());
        assertNotNull(vi.createUsingDefault(null));
    }

    @Test
    public void testVanillaInstantiators() throws Exception {
        assertVanilla(Collection.class, "java.util.ArrayList");
        assertVanilla(List.class, "java.util.ArrayList");
        assertVanilla(ArrayList.class, "java.util.ArrayList");
        assertVanilla(Map.class, "java.util.LinkedHashMap");
        assertVanilla(LinkedHashMap.class, "java.util.LinkedHashMap");
        assertVanilla(HashMap.class, "java.util.HashMap");
    }

    @Test
    public void testDefaultCreator() throws Exception {
        CreatorCollector c = collector(CreatorBean.class);
        c.setDefaultCreator(defaultCtor(CreatorBean.class));
        assertTrue(c.hasDefaultCreator());

        ValueInstantiator vi = c.constructValueInstantiator(MAPPER.getDeserializationConfig());
        assertTrue(vi.canCreateUsingDefault());
        assertFalse(vi.canCreateFromString());
    }

    @Test
    public void testScalarCreators() throws Exception {
        CreatorCollector c = collector(CreatorBean.class);
        c.addStringCreator(method(CreatorBean.class, "fromString"), true);
        c.addIntCreator(method(CreatorBean.class, "fromInt"), true);
        c.addLongCreator(method(CreatorBean.class, "fromLong"), true);
        c.addDoubleCreator(method(CreatorBean.class, "fromDouble"), true);
        c.addBooleanCreator(method(CreatorBean.class, "fromBoolean"), true);

        ValueInstantiator vi = c.constructValueInstantiator(MAPPER.getDeserializationConfig());
        assertTrue(vi.canCreateFromString());
        assertTrue(vi.canCreateFromInt());
        assertTrue(vi.canCreateFromLong());
        assertTrue(vi.canCreateFromDouble());
        assertTrue(vi.canCreateFromBoolean());
    }

    @Test
    public void testDelegatingCreators() throws Exception {
        CreatorCollector c = collector(CreatorBean.class);
        c.addDelegatingCreator(method(CreatorBean.class, "fromObject"), true, null);
        assertTrue(c.hasDelegatingCreator());

        ValueInstantiator vi = c.constructValueInstantiator(MAPPER.getDeserializationConfig());
        assertTrue(vi.canCreateUsingDelegate());

        CreatorCollector array = collector(CreatorBean.class);
        array.addDelegatingCreator(method(CreatorBean.class, "fromList"), true, null);
        assertFalse(array.hasDelegatingCreator());

        ValueInstantiator arrayVi = array.constructValueInstantiator(MAPPER.getDeserializationConfig());
        assertTrue(arrayVi.canCreateUsingArrayDelegate());
    }

    @Test
    public void testPropertyBasedCreatorAndDuplicatePropertyCheck() throws Exception {
        AnnotatedWithParams ctor = defaultCtor(CreatorBean.class);
        AnnotatedParameter param = method(CreatorBean.class, "fromString").getParameter(0);

        CreatorCollector c = collector(CreatorBean.class);
        c.addPropertyCreator(ctor, true,
                new SettableBeanProperty[] { property("a", param), property("b", param) });
        assertTrue(c.hasPropertyBasedCreator());

        ValueInstantiator vi = c.constructValueInstantiator(MAPPER.getDeserializationConfig());
        assertTrue(vi.canCreateFromObjectWith());

        CreatorCollector dup = collector(CreatorBean.class);
        try {
            dup.addPropertyCreator(ctor, true,
                    new SettableBeanProperty[] { property("a", param), property("a", param) });
            fail("Should detect duplicate creator property");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Duplicate creator property"));
        }
    }

    @Test
    public void testCreatorConflictsAndExplicitOverride() throws Exception {
        CreatorCollector explicitReplacesAuto = collector(DupCreator.class);
        explicitReplacesAuto.addStringCreator(method(DupCreator.class, "first"), false);
        explicitReplacesAuto.addStringCreator(method(DupCreator.class, "second"), true);

        CreatorCollector explicitRetained = collector(DupCreator.class);
        explicitRetained.addStringCreator(method(DupCreator.class, "first"), true);
        explicitRetained.addStringCreator(method(DupCreator.class, "second"), false);

        CreatorCollector explicitConflict = collector(DupCreator.class);
        explicitConflict.addStringCreator(method(DupCreator.class, "first"), true);
        try {
            explicitConflict.addStringCreator(method(DupCreator.class, "second"), true);
            fail("Should detect duplicate explicit creators");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Conflicting String creators"));
        }

        CreatorCollector autoConflict = collector(DupCreator.class);
        autoConflict.addStringCreator(method(DupCreator.class, "first"), false);
        try {
            autoConflict.addStringCreator(method(DupCreator.class, "second"), false);
            fail("Should detect duplicate non-explicit creators");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Conflicting String creators"));
        }
    }

    @Test
    public void testIncompleteParameter() throws Exception {
        CreatorCollector c = collector(CreatorBean.class);
        AnnotatedWithParams stringMethod = method(CreatorBean.class, "fromString");
        c.addStringCreator(stringMethod, true);
        c.addIncompeteParameter(stringMethod.getParameter(0));

        ValueInstantiator vi = c.constructValueInstantiator(MAPPER.getDeserializationConfig());
        assertTrue(vi.canCreateFromString());
    }
}