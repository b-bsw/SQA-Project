package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class CreatorCollectorTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testVanillaCollection() {
        CreatorCollector cc = collector(ArrayList.class);
        ValueInstantiator vi = valueInstantiator(cc);
        assertEquals(ArrayList.class.getName(), vi.getValueTypeDesc());
        assertTrue(vi.canCreateUsingDefault());
    }

    @Test
    public void testVanillaListInterface() {
        CreatorCollector cc = collector(List.class);
        ValueInstantiator vi = valueInstantiator(cc);
        assertEquals(ArrayList.class.getName(), vi.getValueTypeDesc());
        assertTrue(vi.canCreateUsingDefault());
    }

    @Test
    public void testVanillaMapAndHashMap() {
        CreatorCollector ccMap = collector(LinkedHashMap.class);
        assertEquals(LinkedHashMap.class.getName(), valueInstantiator(ccMap).getValueTypeDesc());

        CreatorCollector ccHashMap = collector(HashMap.class);
        assertEquals(HashMap.class.getName(), valueInstantiator(ccHashMap).getValueTypeDesc());
    }

    @Test
    public void testUnknownTypeUsesStdValueInstantiator() {
        CreatorCollector cc = collector(Object.class);
        ValueInstantiator vi = valueInstantiator(cc);
        assertTrue(vi instanceof StdValueInstantiator);
        assertFalse(vi.canCreateUsingDefault());
    }

    @Test
    public void testNullDefaultCreatorIsNotRegistered() {
        CreatorCollector cc = collector(Object.class);
        cc.setDefaultCreator(null);
        assertFalse(cc.hasDefaultCreator());
        assertTrue(valueInstantiator(cc) instanceof StdValueInstantiator);
    }

    @Test
    public void testDefaultCreator() throws Exception {
        CreatorCollector cc = collector(Object.class);
        cc.setDefaultCreator(creatorFor("noArgsHelper"));
        assertTrue(cc.hasDefaultCreator());
        ValueInstantiator vi = valueInstantiator(cc);
        assertTrue(vi instanceof StdValueInstantiator);
        assertTrue(vi.canCreateUsingDefault());
    }

    @Test
    public void testNonDefaultCreatorPreventsVanilla() throws Exception {
        CreatorCollector cc = collector(ArrayList.class);
        cc.addStringCreator(creatorFor("stringHelper", String.class), true);
        assertTrue(valueInstantiator(cc) instanceof StdValueInstantiator);
    }

    @Test
    public void testDelegatingCreator() throws Exception {
        CreatorCollector cc = collector(Object.class);
        cc.addDelegatingCreator(creatorFor("stringHelper", String.class), true, null);
        assertTrue(valueInstantiator(cc) instanceof StdValueInstantiator);
    }

    @Test
    public void testPropertyCreatorWithUniqueNames() throws Exception {
        CreatorCollector cc = collector(Object.class);
        cc.addPropertyCreator(creatorFor("noArgsHelper"), true,
                new CreatorProperty[] { creatorProperty("a"), creatorProperty("b") });
        assertTrue(valueInstantiator(cc) instanceof StdValueInstantiator);
    }

    @Test
    public void testPropertyCreatorWithEmptyArray() throws Exception {
        CreatorCollector cc = collector(Object.class);
        cc.addPropertyCreator(creatorFor("noArgsHelper"), true, new CreatorProperty[0]);
        assertTrue(valueInstantiator(cc) instanceof StdValueInstantiator);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateExplicitStringCreatorFails() throws Exception {
        CreatorCollector cc = collector(Object.class);
        cc.addStringCreator(creatorFor("stringHelper", String.class), true);
        cc.addStringCreator(creatorFor("stringHelper2", String.class), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicatePropertyNameFails() throws Exception {
        CreatorCollector cc = collector(Object.class);
        cc.addPropertyCreator(creatorFor("noArgsHelper"), true,
                new CreatorProperty[] { creatorProperty("dup"), creatorProperty("dup") });
    }

    private ValueInstantiator valueInstantiator(CreatorCollector cc) {
        return cc.constructValueInstantiator(mapper.getDeserializationConfig());
    }

    private CreatorCollector collector(Class<?> raw) {
        JavaType type = TypeFactory.defaultInstance().constructType(raw);
        BasicBeanDescription beanDesc = new BasicBeanDescription(new TypeBindings(raw), type, null);
        return new CreatorCollector(beanDesc, false);
    }

    private static AnnotatedWithParams creatorFor(String name, Class<?>... params) throws Exception {
        Method method = CreatorCollectorTest.class.getDeclaredMethod(name, params);
        return new AnnotatedMethod(null, method, null, null);
    }

    private static CreatorProperty creatorProperty(String name) throws Exception {
        for (Constructor<?> ctor : CreatorProperty.class.getDeclaredConstructors()) {
            Class<?>[] p = ctor.getParameterTypes();
            if (p.length >= 8 && p[0] == String.class) {
                Object[] args = new Object[p.length];
                args[0] = name;
                for (int i = 1; i < p.length; i++) {
                    if (p[i] == JavaType.class) {
                        args[i] = TypeFactory.defaultInstance().constructType(Object.class);
                    } else if (p[i] == int.class || p[i] == Integer.class) {
                        args[i] = i;
                    } else if (p[i] == boolean.class || p[i] == Boolean.class) {
                        args[i] = Boolean.FALSE;
                    } else {
                        args[i] = null;
                    }
                }
                ctor.setAccessible(true);
                return (CreatorProperty) ctor.newInstance(args);
            }
        }
        throw new IllegalStateException("No compatible CreatorProperty constructor found");
    }

    private static Object noArgsHelper() {
        return null;
    }

    private static Object stringHelper(String value) {
        return null;
    }

    private static Object stringHelper2(String value) {
        return null;
    }
}