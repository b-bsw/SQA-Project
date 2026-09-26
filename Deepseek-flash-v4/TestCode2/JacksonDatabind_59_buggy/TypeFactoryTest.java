package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.type.*;

public class TypeFactoryTest {

    private TypeFactory tf;

    @Before
    public void setUp() {
        tf = TypeFactory.defaultInstance();
    }

    public static class MyList extends ArrayList<String> {}

    @Test
    public void testDefaultInstanceIsSingleton() {
        assertNotNull(TypeFactory.defaultInstance());
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void testConfigurationMethodsReturnNonNull() {
        assertNotNull(tf.withModifier(null));
        assertNotNull(tf.withClassLoader(null));
        assertNotNull(tf.withCache(null));
    }

    @Test
    public void testClassLoaderCanBeSet() {
        ClassLoader cl = getClass().getClassLoader();
        if (cl == null) {
            cl = ClassLoader.getSystemClassLoader();
        }
        TypeFactory custom = tf.withClassLoader(cl);
        assertSame(cl, custom.getClassLoader());
    }

    @Test
    public void testClearCache() {
        tf.clearCache();
    }

    @Test
    public void testUnknownType() {
        assertNotNull(TypeFactory.unknownType());
    }

    @Test
    public void testRawClass() {
        assertSame(String.class, TypeFactory.rawClass(String.class));
        assertSame(int.class, TypeFactory.rawClass(int.class));

        Type listType = new TypeReference<List<String>>() {}.getType();
        assertSame(List.class, TypeFactory.rawClass(listType));
    }

    @Test
    public void testFindClass() throws Exception {
        assertSame(String.class, tf.findClass("java.lang.String"));
        assertSame(int.class, tf.findClass("int"));
        assertSame(ArrayList.class, tf.findClass("java.util.ArrayList"));

        try {
            tf.findClass("no.such.Clazz");
            fail("Should have thrown ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            // expected
        }
    }

    @Test
    public void testConstructType() {
        JavaType stringType = tf.constructType(String.class);
        assertSame(String.class, stringType.getRawClass());

        JavaType listType = tf.constructType(new TypeReference<List<String>>() {});
        assertSame(List.class, listType.getRawClass());
        assertTrue(listType.isContainerType());
        assertEquals(String.class, listType.containedType(0).getRawClass());

        try {
            tf.constructType((Type) null);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructArrayType() {
        ArrayType arrayType = tf.constructArrayType(String.class);
        assertTrue(arrayType.isArrayType());
        assertSame(String[].class, arrayType.getRawClass());
        assertSame(String.class, arrayType.getContentType().getRawClass());

        ArrayType arrayType2 = tf.constructArrayType(tf.constructType(Integer.class));
        assertSame(Integer[].class, arrayType2.getRawClass());
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType ct = tf.constructCollectionType(List.class, String.class);
        assertSame(List.class, ct.getRawClass());
        assertTrue(ct.isContainerType());
        assertEquals(String.class, ct.getContentType().getRawClass());

        JavaType elem = tf.constructType(Integer.class);
        CollectionType ct2 = tf.constructCollectionType(Set.class, elem);
        assertEquals(Integer.class, ct2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() {
        CollectionLikeType clt = tf.constructCollectionLikeType(Queue.class, String.class);
        assertSame(Queue.class, clt.getRawClass());
        assertEquals(String.class, clt.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() {
        MapType mt = tf.constructMapType(Map.class, String.class, Integer.class);
        assertSame(Map.class, mt.getRawClass());
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(Integer.class, mt.getContentType().getRawClass());

        MapType props = tf.constructMapType(Properties.class, String.class, String.class);
        assertSame(Properties.class, props.getRawClass());
        assertEquals(String.class, props.getKeyType().getRawClass());
        assertEquals(String.class, props.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        MapLikeType mlt = tf.constructMapLikeType(Map.class, String.class, Integer.class);
        assertSame(Map.class, mlt.getRawClass());
        assertEquals(String.class, mlt.getKeyType().getRawClass());
        assertEquals(Integer.class, mlt.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleType() {
        JavaType jt = tf.constructSimpleType(String.class, new JavaType[0]);
        assertSame(String.class, jt.getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType jt = tf.uncheckedSimpleType(String.class);
        assertSame(String.class, jt.getRawClass());
    }

    @Test
    public void testConstructParametricType() {
        JavaType list = tf.constructParametricType(List.class, String.class);
        assertSame(List.class, list.getRawClass());
        assertTrue(list.isContainerType());
        assertEquals(String.class, list.containedType(0).getRawClass());

        JavaType map = tf.constructParametricType(Map.class, String.class, Integer.class);
        assertSame(Map.class, map.getRawClass());
        assertEquals(String.class, map.containedType(0).getRawClass());
        assertEquals(Integer.class, map.containedType(1).getRawClass());
    }

    @Test
    public void testConstructParametrizedType() {
        JavaType jt = tf.constructParametrizedType(MyList.class, ArrayList.class, String.class);
        assertSame(MyList.class, jt.getRawClass());
    }

    @Test
    public void testConstructRawCollectionType() {
        CollectionType ct = tf.constructRawCollectionType(ArrayList.class);
        assertSame(ArrayList.class, ct.getRawClass());
        assertTrue(ct.isContainerType());

        CollectionLikeType clt = tf.constructRawCollectionLikeType(ArrayList.class);
        assertSame(ArrayList.class, clt.getRawClass());

        MapType mt = tf.constructRawMapType(HashMap.class);
        assertSame(HashMap.class, mt.getRawClass());

        MapLikeType mlt = tf.constructRawMapLikeType(Properties.class);
        assertSame(Properties.class, mlt.getRawClass());
    }

    @Test
    public void testConstructSpecializedType() {
        JavaType base = tf.constructType(List.class);
        JavaType specialized = tf.constructSpecializedType(base, ArrayList.class);
        assertSame(ArrayList.class, specialized.getRawClass());

        JavaType same = tf.constructSpecializedType(specialized, ArrayList.class);
        assertSame(specialized, same);

        try {
            tf.constructSpecializedType(tf.constructType(String.class), List.class);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructGeneralizedType() {
        JavaType base = tf.constructType(ArrayList.class);
        JavaType generalized = tf.constructGeneralizedType(base, List.class);
        assertSame(List.class, generalized.getRawClass());

        JavaType same = tf.constructGeneralizedType(base, ArrayList.class);
        assertSame(base, same);

        try {
            tf.constructGeneralizedType(base, String.class);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType stringType = tf.constructFromCanonical("java.lang.String");
        assertSame(String.class, stringType.getRawClass());

        JavaType listType = tf.constructFromCanonical("java.util.List<java.lang.String>");
        assertSame(List.class, listType.getRawClass());
        assertEquals(String.class, listType.containedType(0).getRawClass());
    }

    @Test
    public void testFindTypeParameters() {
        JavaType mapType = tf.constructType(new TypeReference<Map<String, Integer>>() {});
        JavaType[] params = tf.findTypeParameters(mapType, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());
    }

    @Test
    public void testFindTypeParametersByClass() {
        JavaType[] params = tf.findTypeParameters(String.class, Comparable.class);
        assertNotNull(params);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testMoreSpecificType() {
        JavaType str = tf.constructType(String.class);
        JavaType obj = tf.constructType(Object.class);

        assertSame(str, tf.moreSpecificType(str, obj));
        assertSame(str, tf.moreSpecificType(obj, str));
        assertSame(str, tf.moreSpecificType(str, str));
    }

    @Test
    public void testMoreSpecificTypeHandlesNull() {
        JavaType str = tf.constructType(String.class);
        assertSame(str, tf.moreSpecificType(null, str));
        assertSame(str, tf.moreSpecificType(str, null));
    }

    @Test
    public void testConstructReferenceType() {
        JavaType ref = tf.constructReferenceType(
                AtomicReference.class, tf.constructType(String.class));
        assertSame(AtomicReference.class, ref.getRawClass());
    }
}