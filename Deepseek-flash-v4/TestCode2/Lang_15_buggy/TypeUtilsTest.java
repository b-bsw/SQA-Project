package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;

public class TypeUtilsTest {

    public static class TypeExamples {
        public List<String> stringList;
        public List<Integer> integerList;
        public Map<String, Integer> map;
        public ArrayList<String> arrayList;
        public Number[] numberArray;

        public List<String>[] getListArray() { return null; }
        public <T> T identity(T t) { return t; }
        public <T> T[] identityArray(T[] t) { return t; }
        public <T extends Number> T getNumber() { return null; }
        public List<? extends Number> getWildcardList() { return null; }
        public void consumeWildcardList(List<? extends Number> list) {}
    }

    private Type createUnhandledType() {
        return new Type() {};
    }

    // ---------- isAssignable ----------

    @Test
    public void testIsAssignableNullType() {
        assertTrue(TypeUtils.isAssignable(null, Object.class));
        assertFalse(TypeUtils.isAssignable(null, int.class));
        assertFalse(TypeUtils.isAssignable(null, null));
    }

    @Test
    public void testIsAssignableNullToType() {
        assertFalse(TypeUtils.isAssignable(String.class, null));
    }

    @Test
    public void testIsAssignableSameClass() {
        assertTrue(TypeUtils.isAssignable(String.class, String.class));
        assertTrue(TypeUtils.isAssignable(int.class, int.class));
    }

    @Test
    public void testIsAssignableSubtype() {
        assertTrue(TypeUtils.isAssignable(String.class, Object.class));
        assertTrue(TypeUtils.isAssignable(Integer.class, Number.class));
        assertFalse(TypeUtils.isAssignable(Object.class, String.class));
    }

    @Test
    public void testIsAssignableArray() {
        assertTrue(TypeUtils.isAssignable(String[].class, Object.class));
        assertTrue(TypeUtils.isAssignable(String[].class, Object[].class));
        assertTrue(TypeUtils.isAssignable(int[].class, Object.class));
    }

    @Test
    public void testIsAssignableParameterizedTypeToType() throws Exception {
        Field listField = TypeExamples.class.getField("stringList");
        Type listStringType = listField.getGenericType();
        assertFalse(TypeUtils.isAssignable(String.class, listStringType));
        assertTrue(TypeUtils.isAssignable(List.class, listStringType));
        assertTrue(TypeUtils.isAssignable(listStringType, List.class));
        assertTrue(TypeUtils.isAssignable(listStringType, Object.class));
        assertTrue(TypeUtils.isAssignable(listStringType, listStringType));
    }

    @Test
    public void testIsAssignableParameterizedTypeWithWildcard() throws Exception {
        Field integerListField = TypeExamples.class.getField("integerList");
        Type listIntegerType = integerListField.getGenericType();
        Method wildcardListMethod = TypeExamples.class.getMethod("getWildcardList");
        Type listWildcardType = wildcardListMethod.getGenericReturnType();
        assertTrue(TypeUtils.isAssignable(listIntegerType, listWildcardType));
        Field listField = TypeExamples.class.getField("stringList");
        Type listStringType = listField.getGenericType();
        assertFalse(TypeUtils.isAssignable(listStringType, listWildcardType));
        assertTrue(TypeUtils.isAssignable(listIntegerType, listIntegerType));
    }

    @Test
    public void testIsAssignableGenericArrayType() throws Exception {
        Method identityArrayMethod = TypeExamples.class.getMethod("identityArray", Object[].class);
        Type genericArrayType = identityArrayMethod.getGenericReturnType();
        assertTrue(TypeUtils.isAssignable(null, genericArrayType));
        assertFalse(TypeUtils.isAssignable(String.class, genericArrayType));
        assertFalse(TypeUtils.isAssignable(String[].class, genericArrayType));
        assertTrue(TypeUtils.isAssignable(genericArrayType, genericArrayType));
    }

    @Test
    public void testIsAssignableWildcardType() throws Exception {
        Method wildcardListMethod = TypeExamples.class.getMethod("getWildcardList");
        Type listWildcardType = wildcardListMethod.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) listWildcardType).getActualTypeArguments()[0];
        assertTrue(TypeUtils.isAssignable(Integer.class, wildcardType));
        assertTrue(TypeUtils.isAssignable(Number.class, wildcardType));
        assertFalse(TypeUtils.isAssignable(Object.class, wildcardType));
        assertTrue(TypeUtils.isAssignable(wildcardType, wildcardType));
    }

    @Test
    public void testIsAssignableTypeVariable() throws Exception {
        Method identityMethod = TypeExamples.class.getMethod("identity", Object.class);
        Type typeVariableT = identityMethod.getGenericReturnType();
        assertTrue(TypeUtils.isAssignable(null, typeVariableT));
        assertFalse(TypeUtils.isAssignable(String.class, typeVariableT));
        assertTrue(TypeUtils.isAssignable(typeVariableT, typeVariableT));
    }

    @Test(expected = IllegalStateException.class)
    public void testIsAssignableUnhandledTypeAsType() {
        TypeUtils.isAssignable(createUnhandledType(), Object.class);
    }

    @Test(expected = IllegalStateException.class)
    public void testIsAssignableUnhandledTypeAsToType() {
        TypeUtils.isAssignable(Object.class, createUnhandledType());
    }

    // ---------- isInstance ----------

    @Test
    public void testIsInstance() {
        assertTrue(TypeUtils.isInstance("hello", String.class));
        assertTrue(TypeUtils.isInstance(null, Object.class));
        assertFalse(TypeUtils.isInstance(null, int.class));
        assertFalse(TypeUtils.isInstance("hello", null));
        assertTrue(TypeUtils.isInstance(123, Integer.class));
    }

    // ---------- getTypeArguments ----------

    @Test
    public void testGetTypeArgumentsFromParameterizedType() throws Exception {
        Field listField = TypeExamples.class.getField("stringList");
        Type listStringType = listField.getGenericType();
        ParameterizedType pType = (ParameterizedType) listStringType;
        Map<TypeVariable<?>, Type> args = TypeUtils.getTypeArguments(pType);
        assertNotNull(args);
        assertEquals(1, args.size());
        TypeVariable<?> tv = args.keySet().iterator().next();
        assertEquals("E", tv.getName());
        assertEquals(String.class, args.get(tv));
    }

    @Test
    public void testGetTypeArgumentsTypeWithClass() throws Exception {
        Field listField = TypeExamples.class.getField("stringList");
        Type listStringType = listField.getGenericType();
        Map<TypeVariable<?>, Type> args = TypeUtils.getTypeArguments(listStringType, List.class);
        assertNotNull(args);
        assertEquals(1, args.size());
        assertEquals(String.class, args.values().iterator().next());
    }

    @Test
    public void testGetTypeArgumentsNotAssignable() throws Exception {
        Field listField = TypeExamples.class.getField("stringList");
        Type listStringType = listField.getGenericType();
        assertNull(TypeUtils.getTypeArguments(listStringType, Map.class));
    }

    // ---------- determineTypeArguments ----------

    @Test
    public void testDetermineTypeArguments() throws Exception {
        class MyStringList extends ArrayList<String> {}
        Field arrayListField = TypeExamples.class.getField("arrayList");
        ParameterizedType arrayListType = (ParameterizedType) arrayListField.getGenericType();
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(MyStringList.class, arrayListType);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(String.class, result.values().iterator().next());
    }

    // ---------- normalizeUpperBounds ----------

    @Test
    public void testNormalizeUpperBounds() {
        Type[] input = new Type[] { String.class, Object.class };
        Type[] result = TypeUtils.normalizeUpperBounds(input);
        assertEquals(1, result.length);
        assertEquals(String.class, result[0]);

        Type[] input2 = new Type[] { Integer.class, Number.class };
        Type[] result2 = TypeUtils.normalizeUpperBounds(input2);
        assertEquals(1, result2.length);
        assertEquals(Integer.class, result2[0]);
    }

    // ---------- implicit bounds ----------

    @Test
    public void testGetImplicitBounds() throws Exception {
        Method identityMethod = TypeExamples.class.getMethod("identity", Object.class);
        Type typeVariableT = identityMethod.getGenericReturnType();
        Type[] bounds = TypeUtils.getImplicitBounds((TypeVariable<?>) typeVariableT);
        assertEquals(1, bounds.length);
        assertEquals(Object.class, bounds[0]);
    }

    @Test
    public void testGetImplicitUpperBoundsWildcard() throws Exception {
        Method wildcardListMethod = TypeExamples.class.getMethod("getWildcardList");
        Type listWildcardType = wildcardListMethod.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) listWildcardType).getActualTypeArguments()[0];
        Type[] upperBounds = TypeUtils.getImplicitUpperBounds(wildcardType);
        assertEquals(1, upperBounds.length);
        assertEquals(Number.class, upperBounds[0]);
    }

    @Test
    public void testGetImplicitLowerBoundsWildcard() throws Exception {
        Method wildcardListMethod = TypeExamples.class.getMethod("getWildcardList");
        Type listWildcardType = wildcardListMethod.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) listWildcardType).getActualTypeArguments()[0];
        Type[] lowerBounds = TypeUtils.getImplicitLowerBounds(wildcardType);
        assertEquals(1, lowerBounds.length);
        assertNull(lowerBounds[0]);
    }

    // ---------- typesSatisfyVariables ----------

    @Test
    public void testTypesSatisfyVariables() throws Exception {
        Method identityMethod = TypeExamples.class.getMethod("identity", Object.class);
        Type typeVariableT = identityMethod.getGenericReturnType();
        Map<TypeVariable<?>, Type> map = new HashMap<>();
        map.put((TypeVariable<?>) typeVariableT, String.class);
        assertTrue(TypeUtils.typesSatisfyVariables(map));

        // type variable with bound Number
        Method getNumberMethod = TypeExamples.class.getMethod("getNumber");
        Type typeVariableN = getNumberMethod.getGenericReturnType();
        map.clear();
        map.put((TypeVariable<?>) typeVariableN, Integer.class);
        assertTrue(TypeUtils.typesSatisfyVariables(map));
        map.put((TypeVariable<?>) typeVariableN, Object.class);
        assertFalse(TypeUtils.typesSatisfyVariables(map));
    }

    // ---------- getRawType ----------

    @Test
    public void testGetRawTypeClass() {
        assertEquals(String.class, TypeUtils.getRawType(String.class, null));
    }

    @Test
    public void testGetRawTypeParameterizedType() throws Exception {
        Field listField = TypeExamples.class.getField("stringList");
        Type listStringType = listField.getGenericType();
        assertEquals(List.class, TypeUtils.getRawType(listStringType, null));
    }

    @Test
    public void testGetRawTypeWildcardReturnsNull() throws Exception {
        Method wildcardListMethod = TypeExamples.class.getMethod("getWildcardList");
        Type listWildcardType = wildcardListMethod.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) listWildcardType).getActualTypeArguments()[0];
        assertNull(TypeUtils.getRawType(wildcardType, null));
    }

    // ---------- isArrayType ----------

    @Test
    public void testIsArrayType() throws Exception {
        assertTrue(TypeUtils.isArrayType(String[].class));
        assertFalse(TypeUtils.isArrayType(String.class));
        Method identityArrayMethod = TypeExamples.class.getMethod("identityArray", Object[].class);
        Type genericArrayType = identityArrayMethod.getGenericReturnType();
        assertTrue(TypeUtils.isArrayType(genericArrayType));
    }

    // ---------- getArrayComponentType ----------

    @Test
    public void testGetArrayComponentType() throws Exception {
        assertEquals(String.class, TypeUtils.getArrayComponentType(String[].class));
        assertNull(TypeUtils.getArrayComponentType(String.class));
        Method identityArrayMethod = TypeExamples.class.getMethod("identityArray", Object[].class);
        Type genericArrayType = identityArrayMethod.getGenericReturnType();
        assertNotNull(TypeUtils.getArrayComponentType(genericArrayType));
        assertTrue(TypeUtils.getArrayComponentType(genericArrayType) instanceof TypeVariable);
    }
}