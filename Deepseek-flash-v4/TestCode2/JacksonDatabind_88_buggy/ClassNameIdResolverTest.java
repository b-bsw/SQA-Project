package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

public class ClassNameIdResolverTest {

    private TypeFactory tf;

    @Before
    public void setUp() {
        tf = TypeFactory.defaultInstance();
    }

    private ClassNameIdResolver resolver(Class<?> cls) {
        return new ClassNameIdResolver(tf.constructType(cls), tf);
    }

    private DatabindContext dummyContext() {
        return new DummyContext(tf);
    }

    enum TestEnum { A, B }

    enum Color {
        RED {
            @Override public String toString() { return "red"; }
        }
    }

    class InnerNonStatic { }

    @Test
    public void testGetMechanism() {
        assertEquals(JsonTypeInfo.Id.CLASS, resolver(Object.class).getMechanism());
    }

    @Test
    public void testRegisterSubtypeIsNoOp() {
        ClassNameIdResolver resolver = resolver(Object.class);
        resolver.registerSubtype(String.class, "custom");
        assertEquals("java.lang.String", resolver.idFromValue("abc"));
    }

    @Test
    public void testIdFromValueRegularClass() {
        assertEquals("java.lang.String", resolver(Object.class).idFromValue("abc"));
    }

    @Test
    public void testIdFromValueEnumSubtypeUsesEnumSuperclass() {
        ClassNameIdResolver resolver = resolver(Color.class);
        assertEquals(Color.class.getName(), resolver.idFromValue(Color.RED));
    }

    @Test
    public void testIdFromValueEnumSet() {
        ClassNameIdResolver resolver = resolver(Object.class);
        EnumSet<TestEnum> set = EnumSet.of(TestEnum.A);
        String expected = tf.constructCollectionType(EnumSet.class, TestEnum.class).toCanonical();
        assertEquals(expected, resolver.idFromValue(set));
    }

    @Test
    public void testIdFromValueEnumMap() {
        ClassNameIdResolver resolver = resolver(Object.class);
        EnumMap<TestEnum, Object> map = new EnumMap<TestEnum, Object>(TestEnum.class);
        map.put(TestEnum.A, "x");
        String expected = tf.constructMapType(EnumMap.class, TestEnum.class, Object.class).toCanonical();
        assertEquals(expected, resolver.idFromValue(map));
    }

    @Test
    public void testIdFromValueCollectionsSingletonListMapsToArrayList() {
        assertEquals("java.util.ArrayList", resolver(Object.class).idFromValue(Collections.singletonList("x")));
    }

    @Test
    public void testIdFromValueInnerClassWithTopLevelBaseTypeUsesBaseType() {
        ClassNameIdResolver resolver = resolver(String.class);
        assertEquals("java.lang.String", resolver.idFromValue(new InnerNonStatic()));
    }

    @Test
    public void testIdFromValueAndTypeUsesGivenType() {
        assertEquals("java.lang.StringBuilder", resolver(Object.class).idFromValueAndType(new Object(), StringBuilder.class));
    }

    @Test
    public void testIdFromValueAndTypeNullValueUsesGivenType() {
        assertEquals("java.lang.String", resolver(Object.class).idFromValueAndType(null, String.class));
    }

    @Test
    public void testTypeFromIdWithGenericType() throws Exception {
        JavaType result = resolver(Object.class).typeFromId(dummyContext(), "java.util.List<java.lang.String>");
        assertEquals(List.class, result.getRawClass());
    }

    @Test
    public void testTypeFromIdSimpleClass() throws Exception {
        ClassNameIdResolver resolver = resolver(String.class);
        JavaType result = resolver.typeFromId(dummyContext(), "java.lang.String");
        assertSame(String.class, result.getRawClass());
    }

    @Test
    public void testTypeFromIdEmptyStringReturnsNull() throws Exception {
        assertNull(resolver(Object.class).typeFromId(dummyContext(), ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromIdMalformedGenericIdThrows() throws Exception {
        resolver(Object.class).typeFromId(dummyContext(), "java.util.List<java.lang.String");
    }

    @Test
    public void testGetDescForKnownTypeIds() {
        assertEquals("class name used as type id", resolver(Object.class).getDescForKnownTypeIds());
    }

    private static class DummyContext extends DatabindContext {
        private final TypeFactory typeFactory;

        DummyContext(TypeFactory typeFactory) {
            this.typeFactory = typeFactory;
        }

        @Override
        public TypeFactory getTypeFactory() {
            return typeFactory;
        }

        @Override
        public MapperConfig<?> getConfig() {
            return null;
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return null;
        }
    }
}