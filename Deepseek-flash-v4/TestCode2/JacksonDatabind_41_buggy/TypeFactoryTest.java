package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.*;
import java.lang.reflect.Type;
import com.fasterxml.jackson.core.type.TypeReference;

public class TypeFactoryTest {

    private TypeFactory factory;

    @Before
    public void setUp() {
        factory = TypeFactory.defaultInstance();
    }

    @Test
    public void testDefaultInstance() {
        assertNotNull(TypeFactory.defaultInstance());
        assertSame(factory, TypeFactory.defaultInstance());
    }

    @Test
    public void testUnknownType() {
        JavaType unknown = TypeFactory.unknownType();
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testFindClassPrimitive() throws Exception {
        Class<?> intType = factory.findClass("int");
        assertEquals(Integer.TYPE, intType);
        Class<?> longType = factory.findClass("long");
        assertEquals(Long.TYPE, longType);
        Class<?> boolType = factory.findClass("boolean");
        assertEquals(Boolean.TYPE, boolType);
        Class<?> voidType = factory.findClass("void");
        assertEquals(Void.TYPE, voidType);
    }

    @Test
    public void testFindClassObject() throws Exception {
        Class<?> objClass = factory.findClass("java.lang.Object");
        assertEquals(Object.class, objClass);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassNotFound() throws Exception {
        factory.findClass("nonexistent.ClassName");
    }

    @Test
    public void testConstructTypeFromClass() {
        JavaType stringType = factory.constructType(String.class);
        assertNotNull(stringType);
        assertEquals(String.class, stringType.getRawClass());
    }

    @Test
    public void testConstructTypeFromParameterizedType() {
        Type type = new TypeReference<List<String>>() {}.getType();
        JavaType listType = factory.constructType(type);
        assertNotNull(listType);
        assertTrue(listType.isContainerType());
        JavaType contentType = listType.getContentType();
        assertNotNull(contentType);
        assertEquals(String.class, contentType.getRawClass());
    }

    @Test
    public void testConstructArrayTypeFromClass() {
        ArrayType arrayType = factory.constructArrayType(Integer.TYPE);
        assertNotNull(arrayType);
        assertTrue(arrayType.isArrayType());
        assertEquals(Integer.TYPE, arrayType.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeFromJavaType() {
        JavaType elementType = factory.constructType(String.class);
        ArrayType arrayType = factory.constructArrayType(elementType);
        assertNotNull(arrayType);
        assertEquals(String.class, arrayType.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeWithClass() {
        CollectionType colType = factory.constructCollectionType(ArrayList.class, String.class);
        assertNotNull(colType);
        assertEquals(ArrayList.class, colType.getRawClass());
        assertTrue(colType.isCollectionLikeType());
        assertEquals(String.class, colType.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeWithJavaType() {
        JavaType elementType = factory.constructType(Integer.class);
        CollectionType colType = factory.constructCollectionType(LinkedList.class, elementType);
        assertNotNull(colType);
        assertEquals(LinkedList.class, colType.getRawClass());
        assertEquals(Integer.class, colType.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapTypeWithClass() {
        MapType mapType = factory.constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(mapType);
        assertEquals(HashMap.class, mapType.getRawClass());
        assertTrue(mapType.isMapLikeType());
        JavaType keyType = mapType.getKeyType();
        JavaType valueType = mapType.getContentType();
        assertEquals(String.class, keyType.getRawClass());
        assertEquals(Integer.class, valueType.getRawClass());
    }

    @Test
    public void testConstructMapTypeWithJavaType() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valueType = factory.constructType(Object.class);
        MapType mapType = factory.constructMapType(TreeMap.class, keyType, valueType);
        assertNotNull(mapType);
        assertEquals(TreeMap.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Object.class, mapType.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricTypeWithClasses() {
        JavaType listType = factory.constructParametricType(ArrayList.class, String.class);
        assertNotNull(listType);
        assertTrue(listType.isContainerType());
        assertEquals(String.class, listType.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricTypeWithJavaTypes() {
        JavaType strType = factory.constructType(String.class);
        JavaType listType = factory.constructParametricType(LinkedList.class, strType);
        assertEquals(LinkedList.class, listType.getRawClass());
        assertEquals(String.class, listType.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeSameClass() {
        JavaType base = factory.constructType(ArrayList.class);
        JavaType specialized = factory.constructSpecializedType(base, ArrayList.class);
        assertSame(base, specialized);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeNotSubtype() {
        JavaType base = factory.constructType(ArrayList.class);
        factory.constructSpecializedType(base, HashMap.class);
    }

    @Test
    public void testConstructSpecializedTypeObjectSubclass() {
        JavaType base = factory.constructType(Object.class);
        JavaType specialized = factory.constructSpecializedType(base, String.class);
        assertNotNull(specialized);
        assertEquals(String.class, specialized.getRawClass());
    }

    @Test
    public void testConstructGeneralizedType() {
        JavaType subType = factory.constructType(ArrayList.class);
        JavaType superType = factory.constructGeneralizedType(subType, List.class);
        assertNotNull(superType);
        assertEquals(List.class, superType.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedTypeNotSupertype() {
        JavaType base = factory.constructType(ArrayList.class);
        factory.constructGeneralizedType(base, String.class);
    }

    @Test
    public void testClearCache() {
        factory.clearCache();
        // no exception, just ensure it runs
    }

    @Test
    public void testMoreSpecificTypeFirstNull() {
        JavaType type2 = factory.constructType(String.class);
        assertSame(type2, factory.moreSpecificType(null, type2));
    }

    @Test
    public void testMoreSpecificTypeSecondNull() {
        JavaType type1 = factory.constructType(String.class);
        assertSame(type1, factory.moreSpecificType(type1, null));
    }

    @Test
    public void testMoreSpecificTypeAssignable() {
        JavaType type1 = factory.constructType(Object.class);
        JavaType type2 = factory.constructType(String.class);
        JavaType result = factory.moreSpecificType(type1, type2);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testMoreSpecificTypeNotAssignable() {
        JavaType type1 = factory.constructType(String.class);
        JavaType type2 = factory.constructType(Integer.class);
        JavaType result = factory.moreSpecificType(type1, type2);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType type = factory.constructFromCanonical("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonicalInvalid() {
        factory.constructFromCanonical("invalid");
    }

    @Test
    public void testConstructSimpleType() {
        JavaType simpleType = factory.constructSimpleType(String.class, new JavaType[0]);
        assertNotNull(simpleType);
        assertEquals(String.class, simpleType.getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType type = factory.uncheckedSimpleType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testFindTypeParameters() {
        JavaType listString = factory.constructType(new TypeReference<List<String>>() {}.getType());
        JavaType[] params = factory.findTypeParameters(listString, List.class);
        assertNotNull(params);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParametersNoMatch() {
        JavaType type = factory.constructType(String.class);
        JavaType[] params = factory.findTypeParameters(type, List.class);
        assertNotNull(params);
        assertEquals(0, params.length);
    }

    @Test
    public void testWithModifierNull() {
        TypeFactory newFactory = factory.withModifier(null);
        assertNotNull(newFactory);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testWithClassLoader() {
        ClassLoader cl = getClass().getClassLoader();
        TypeFactory newFactory = factory.withClassLoader(cl);
        assertNotNull(newFactory);
        assertEquals(cl, newFactory.getClassLoader());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType refType = factory.constructReferenceType(AtomicReference.class, factory.constructType(String.class));
        assertNotNull(refType);
        assertEquals(AtomicReference.class, refType.getRawClass());
    }

    @Test
    public void testRawClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        assertEquals(String.class, TypeFactory.rawClass(factory.constructType(String.class)));
    }
}