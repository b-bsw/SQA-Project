package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

public class TypeFactoryTest {

    private TypeFactory f;

    @Before
    public void setUp() {
        f = TypeFactory.defaultInstance();
    }

    @Test
    public void testDefaultInstanceIsSingleton() {
        assertNotNull(TypeFactory.defaultInstance());
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void testConstructTypeFromClass() {
        JavaType t = f.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructTypeFromPrimitiveClass() {
        JavaType t = f.constructType(int.class);
        assertEquals(int.class, t.getRawClass());
        assertTrue(t.isPrimitive());
    }

    @Test
    public void testConstructTypeFromTypeReference() {
        JavaType t = f.constructType(new TypeReference<List<String>>() {});
        assertEquals(List.class, t.getRawClass());
        assertTrue(t.isCollectionLikeType());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructTypeFromJavaType() {
        JavaType base = f.constructType(String.class);
        assertSame(base, f.constructType(base));
    }

    @Test
    public void testConstructArrayType() {
        ArrayType t = f.constructArrayType(Integer.class);
        assertEquals(Integer[].class, t.getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType t = f.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() {
        MapType t = f.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, t.getRawClass());
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricType() {
        JavaType t = f.constructParametricType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testMoreSpecificTypeWithAssignable() {
        JavaType number = f.constructType(Number.class);
        JavaType integer = f.constructType(Integer.class);
        assertSame(integer, f.moreSpecificType(number, integer));
        assertSame(integer, f.moreSpecificType(integer, number));
    }

    @Test
    public void testMoreSpecificTypeWithNulls() {
        JavaType string = f.constructType(String.class);
        assertNull(f.moreSpecificType(null, null));
        assertSame(string, f.moreSpecificType(string, null));
        assertSame(string, f.moreSpecificType(null, string));
    }

    @Test
    public void testFindClassObject() throws Exception {
        assertEquals(String.class, f.findClass("java.lang.String"));
    }

    @Test
    public void testFindClassPrimitive() throws Exception {
        assertEquals(int.class, f.findClass("int"));
        assertEquals(void.class, f.findClass("void"));
    }

    @Test
    public void testRawClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        assertEquals(String.class, TypeFactory.rawClass(f.constructType(String.class)));
    }

    @Test
    public void testUnknownType() {
        JavaType t = TypeFactory.unknownType();
        assertNotNull(t);
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType t = f.constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testClearCacheDoesNotThrow() {
        f.clearCache();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeWithNonAssignable() {
        JavaType base = f.constructType(Number.class);
        f.constructSpecializedType(base, String.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedTypeWithNonAssignable() {
        JavaType base = f.constructType(String.class);
        f.constructGeneralizedType(base, Number.class);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassNotFound() throws Exception {
        f.findClass("no.such.Class");
    }
}