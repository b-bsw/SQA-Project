package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

public class $Gson$TypesTest {

    private Type createListStringType() {
        return $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    }

    private Type createMapStringIntegerType() {
        return $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    }

    @Test
    public void testNewParameterizedTypeWithOwner() {
        ParameterizedType pt = (ParameterizedType) $Gson$Types.newParameterizedTypeWithOwner(
                null, List.class, String.class);
        assertNull(pt.getOwnerType());
        assertEquals(List.class, pt.getRawType());
        assertArrayEquals(new Type[]{String.class}, pt.getActualTypeArguments());

        ParameterizedType pt2 = (ParameterizedType) $Gson$Types.newParameterizedTypeWithOwner(
                Map.class, Map.Entry.class, String.class, Integer.class);
        assertEquals(Map.class, pt2.getOwnerType());
        assertEquals(Map.Entry.class, pt2.getRawType());
        assertArrayEquals(new Type[]{String.class, Integer.class}, pt2.getActualTypeArguments());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewParameterizedTypeWithOwner_nullOwnerRequired() {
        class LocalClass {}
        $Gson$Types.newParameterizedTypeWithOwner(null, LocalClass.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewParameterizedTypeWithOwner_primitiveArg() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
    }

    @Test
    public void testArrayOf() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, arrayType.getGenericComponentType());

        GenericArrayType arrayOfArray = $Gson$Types.arrayOf(arrayType);
        assertEquals(arrayType, arrayOfArray.getGenericComponentType());
    }

    @Test
    public void testArrayOf_null() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(null);
        assertNull(arrayType.getGenericComponentType());
    }

    @Test
    public void testSubtypeOf() {
        WildcardType w = $Gson$Types.subtypeOf(String.class);
        assertArrayEquals(new Type[]{String.class}, w.getUpperBounds());
        assertArrayEquals(new Type[]{}, w.getLowerBounds());

        WildcardType w2 = $Gson$Types.subtypeOf(Object.class);
        assertArrayEquals(new Type[]{Object.class}, w2.getUpperBounds());
    }

    @Test
    public void testSubtypeOf_wildcardBound() {
        WildcardType input = $Gson$Types.subtypeOf(String.class);
        WildcardType result = $Gson$Types.subtypeOf(input);
        assertArrayEquals(new Type[]{String.class}, result.getUpperBounds());
        assertArrayEquals(new Type[]{}, result.getLowerBounds());
    }

    @Test
    public void testSupertypeOf() {
        WildcardType w = $Gson$Types.supertypeOf(String.class);
        assertArrayEquals(new Type[]{Object.class}, w.getUpperBounds());
        assertArrayEquals(new Type[]{String.class}, w.getLowerBounds());

        WildcardType w2 = $Gson$Types.supertypeOf(Object.class);
        assertArrayEquals(new Type[]{Object.class}, w2.getUpperBounds());
        assertArrayEquals(new Type[]{Object.class}, w2.getLowerBounds());
    }

    @Test
    public void testSupertypeOf_wildcardBound() {
        WildcardType input = $Gson$Types.supertypeOf(String.class);
        WildcardType result = $Gson$Types.supertypeOf(input);
        assertArrayEquals(new Type[]{Object.class}, result.getUpperBounds());
        assertArrayEquals(new Type[]{String.class}, result.getLowerBounds());
    }

    @Test
    public void testCanonicalize() {
        assertEquals(String.class, $Gson$Types.canonicalize(String.class));

        Type canonicalArray = $Gson$Types.canonicalize(String[].class);
        assertTrue(canonicalArray instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType)canonicalArray).getGenericComponentType());

        ParameterizedType pt = (ParameterizedType) createListStringType();
        Type canonicalPT = $Gson$Types.canonicalize(pt);
        assertEquals(pt, canonicalPT);

        WildcardType w = $Gson$Types.subtypeOf(String.class);
        Type canonicalW = $Gson$Types.canonicalize(w);
        assertEquals(w, canonicalW);

        GenericArrayType ga = $Gson$Types.arrayOf(String.class);
        Type canonicalGA = $Gson$Types.canonicalize(ga);
        assertTrue(canonicalGA instanceof GenericArrayType);
        assertEquals(ga, canonicalGA);

        assertNull($Gson$Types.canonicalize(null));
    }

    @Test
    public void testGetRawType() {
        assertEquals(String.class, $Gson$Types.getRawType(String.class));
        assertEquals(List.class, $Gson$Types.getRawType(createListStringType()));
        assertEquals(String[].class, $Gson$Types.getRawType($Gson$Types.arrayOf(String.class)));

        TypeVariable<?> tv = List.class.getTypeParameters()[0];
        assertEquals(Object.class, $Gson$Types.getRawType(tv));

        assertEquals(String.class, $Gson$Types.getRawType($Gson$Types.subtypeOf(String.class)));
        assertEquals(Object.class, $Gson$Types.getRawType($Gson$Types.supertypeOf(String.class)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawType_invalidType() {
        $Gson$Types.getRawType(null);
    }

    @Test
    public void testEquals() {
        assertTrue($Gson$Types.equals(String.class, String.class));
        assertFalse($Gson$Types.equals(String.class, Integer.class));

        Type pt1 = createListStringType();
        Type pt2 = createListStringType();
        assertTrue($Gson$Types.equals(pt1, pt2));
        Type pt3 = createMapStringIntegerType();
        assertFalse($Gson$Types.equals(pt1, pt3));
        assertFalse($Gson$Types.equals(pt1, String.class));

        Type ga1 = $Gson$Types.arrayOf(String.class);
        Type ga2 = $Gson$Types.arrayOf(String.class);
        assertTrue($Gson$Types.equals(ga1, ga2));
        Type ga3 = $Gson$Types.arrayOf(Integer.class);
        assertFalse($Gson$Types.equals(ga1, ga3));
        assertFalse($Gson$Types.equals(ga1, String.class));

        WildcardType w1 = $Gson$Types.subtypeOf(String.class);
        WildcardType w2 = $Gson$Types.subtypeOf(String.class);
        assertTrue($Gson$Types.equals(w1, w2));
        WildcardType w3 = $Gson$Types.subtypeOf(Integer.class);
        assertFalse($Gson$Types.equals(w1, w3));
        assertFalse($Gson$Types.equals(w1, String.class));

        TypeVariable<?> tv1 = List.class.getTypeParameters()[0];
        TypeVariable<?> tv2 = List.class.getTypeParameters()[0];
        assertTrue($Gson$Types.equals(tv1, tv2));
        TypeVariable<?> tv3 = Map.class.getTypeParameters()[0];
        assertFalse($Gson$Types.equals(tv1, tv3));

        assertFalse($Gson$Types.equals(new Object(), String.class));
        assertFalse($Gson$Types.equals(null, String.class));
        assertFalse($Gson$Types.equals(String.class, null));
        assertTrue($Gson$Types.equals(null, null));
    }

    @Test
    public void testTypeToString() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));

        ParameterizedType pt = (ParameterizedType) createListStringType();
        String str = $Gson$Types.typeToString(pt);
        assertNotNull(str);
        assertTrue(str.contains("java.util.List"));
    }

    @Test
    public void testGetArrayComponentType() {
        assertEquals(String.class, $Gson$Types.getArrayComponentType($Gson$Types.arrayOf(String.class)));
        assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    }

    @Test(expected = ClassCastException.class)
    public void testGetArrayComponentType_nonArray() {
        $Gson$Types.getArrayComponentType(String.class);
    }

    @Test
    public void testGetCollectionElementType() {
        Type elementType = $Gson$Types.getCollectionElementType(createListStringType(), List.class);
        assertEquals(String.class, elementType);

        elementType = $Gson$Types.getCollectionElementType(List.class, List.class);
        assertEquals(Object.class, elementType);
    }

    @Test
    public void testGetMapKeyAndValueTypes() {
        Type[] types = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        assertArrayEquals(new Type[]{String.class, String.class}, types);

        types = $Gson$Types.getMapKeyAndValueTypes(createMapStringIntegerType(), Map.class);
        assertArrayEquals(new Type[]{String.class, Integer.class}, types);

        types = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);
        assertArrayEquals(new Type[]{Object.class, Object.class}, types);
    }

    @Test
    public void testResolve() {
        Type context = createListStringType();
        Type resolved = $Gson$Types.resolve(context, List.class, List.class.getTypeParameters()[0]);
        assertEquals(String.class, resolved);

        Type arrayType = $Gson$Types.arrayOf(List.class.getTypeParameters()[0]);
        resolved = $Gson$Types.resolve(context, List.class, arrayType);
        assertTrue(resolved instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType)resolved).getGenericComponentType());
    }

    @Test
    public void testWildcardTypeImpl() {
        WildcardType w = $Gson$Types.supertypeOf(String.class);
        assertArrayEquals(new Type[]{Object.class}, w.getUpperBounds());
        assertArrayEquals(new Type[]{String.class}, w.getLowerBounds());
        assertEquals("? super java.lang.String", w.toString());

        WildcardType w2 = $Gson$Types.supertypeOf(String.class);
        assertEquals(w, w2);
        assertFalse(w.equals($Gson$Types.supertypeOf(Integer.class)));
    }

    @Test
    public void testWildcardTypeImpl_upper() {
        WildcardType w = $Gson$Types.subtypeOf(String.class);
        assertArrayEquals(new Type[]{String.class}, w.getUpperBounds());
        assertArrayEquals(new Type[]{}, w.getLowerBounds());
        assertEquals("? extends java.lang.String", w.toString());

        WildcardType w2 = $Gson$Types.subtypeOf(Object.class);
        assertEquals("?", w2.toString());
    }

    @Test
    public void testParameterizedTypeImpl_toString() {
        ParameterizedType pt = (ParameterizedType) $Gson$Types.newParameterizedTypeWithOwner(
                null, List.class, String.class);
        assertEquals("java.util.List<java.lang.String>", pt.toString());
    }
}