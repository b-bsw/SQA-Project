package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import org.junit.Test;

public class TypeFactoryTest {

    public static class Animal {}
    public static class Dog extends Animal {}
    public static class Simple {}

    private final TypeFactory tf = TypeFactory.defaultInstance();

    @Test
    public void clearCacheDoesNotThrow() {
        JavaType t = tf.constructType(String.class);
        assertNotNull(t);
        tf.clearCache();
        assertNotNull(tf.constructType(String.class));
    }

    @Test
    public void rawClassHandlesClassAndParameterized() {
        assertEquals(String.class, tf.rawClass(String.class));

        Type listType = new TypeReference<List<String>>() {}.getType();
        assertEquals(List.class, tf.rawClass(listType));
    }

    @Test
    public void constructFromCanonical() {
        JavaType type = tf.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void constructSpecializedTypeSameRawReturnsSame() {
        JavaType base = tf.constructSimpleType(Animal.class, new JavaType[0]);
        assertSame(base, tf.constructSpecializedType(base, Animal.class));
    }

    @Test
    public void constructSpecializedTypeNarrowsSimpleType() {
        JavaType base = tf.constructSimpleType(Animal.class, new JavaType[0]);
        JavaType dog = tf.constructSpecializedType(base, Dog.class);
        assertEquals(Dog.class, dog.getRawClass());
    }

    @Test
    public void findTypeParametersFromClass() {
        JavaType[] params = tf.findTypeParameters(String.class, Comparable.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void findTypeParametersFromJavaType() {
        JavaType stringType = tf.constructType(String.class);
        JavaType[] params = tf.findTypeParameters(stringType, Comparable.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void findTypeParametersForMap() {
        JavaType[] params = tf.findTypeParameters(HashMap.class, Map.class);
        assertEquals(2, params.length);
    }

    @Test
    public void moreSpecificTypePrefersSpecific() {
        JavaType number = tf.constructType(Number.class);
        JavaType integer = tf.constructType(Integer.class);

        assertSame(integer, tf.moreSpecificType(number, integer));
        assertSame(integer, tf.moreSpecificType(integer, number));
        assertSame(number, tf.moreSpecificType(null, number));
        assertSame(number, tf.moreSpecificType(number, null));
    }

    @Test
    public void constructTypeFromClassAndReference() {
        JavaType stringType = tf.constructType(String.class);
        assertEquals(String.class, stringType.getRawClass());

        TypeReference<Map<String, Integer>> reference =
                new TypeReference<Map<String, Integer>>() {};

        JavaType mapType = tf.constructType(reference);
        assertEquals(Map.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapType.getContentType().getRawClass());
    }

    @Test
    public void constructArrayType() {
        JavaType arrayType = tf.constructArrayType(String.class);
        assertEquals(String[].class, arrayType.getRawClass());
        assertEquals(String.class, arrayType.getContentType().getRawClass());
    }

    @Test
    public void constructCollectionType() {
        JavaType listType = tf.constructCollectionType(List.class, String.class);
        assertEquals(List.class, listType.getRawClass());
        assertEquals(String.class, listType.getContentType().getRawClass());
    }

    @Test
    public void constructCollectionLikeType() {
        JavaType iterableType = tf.constructCollectionLikeType(Iterable.class, String.class);
        assertEquals(Iterable.class, iterableType.getRawClass());
        assertEquals(String.class, iterableType.getContentType().getRawClass());
    }

    @Test
    public void constructMapType() {
        JavaType mapType = tf.constructMapType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapType.getContentType().getRawClass());
    }

    @Test
    public void constructMapLikeType() {
        JavaType mapLikeType = tf.constructMapLikeType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, mapLikeType.getRawClass());
        assertEquals(String.class, mapLikeType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapLikeType.getContentType().getRawClass());
    }

    @Test
    public void constructSimpleAndUnchecked() {
        JavaType simple = tf.constructSimpleType(Simple.class, new JavaType[0]);
        assertEquals(Simple.class, simple.getRawClass());

        JavaType unchecked = tf.uncheckedSimpleType(String.class);
        assertEquals(String.class, unchecked.getRawClass());
    }

    @Test
    public void constructParametrizedCollectionAndMap() {
        JavaType key = tf.constructType(String.class);
        JavaType value = tf.constructType(Integer.class);

        JavaType listType = tf.constructParametrizedType(
                List.class, List.class, tf.constructType(String.class));
        assertEquals(List.class, listType.getRawClass());
        assertEquals(String.class, listType.getContentType().getRawClass());

        JavaType mapType = tf.constructParametrizedType(Map.class, Map.class, key, value);
        assertEquals(Map.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapType.getContentType().getRawClass());
    }

    @Test
    public void constructParametricConvenienceMethods() {
        JavaType listType = tf.constructParametricType(List.class, String.class);
        assertEquals(List.class, listType.getRawClass());
        assertEquals(String.class, listType.getContentType().getRawClass());

        JavaType mapType = tf.constructParametricType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapType.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructParametricTypeRejectsWrongMapParamCount() {
        tf.constructParametricType(Map.class, String.class);
    }

    @Test
    public void constructRawCollectionAndMapTypes() {
        JavaType rawList = tf.constructRawCollectionType(ArrayList.class);
        assertEquals(ArrayList.class, rawList.getRawClass());
        assertEquals(Object.class, rawList.getContentType().getRawClass());

        JavaType rawMap = tf.constructRawMapType(HashMap.class);
        assertEquals(HashMap.class, rawMap.getRawClass());
        assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        assertEquals(Object.class, rawMap.getContentType().getRawClass());
    }
}