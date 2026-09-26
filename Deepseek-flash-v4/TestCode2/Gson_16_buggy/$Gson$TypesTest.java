package com.google.gson.internal;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;

public final class $Gson$TypesTest {

    private static class HasType<T> {
    }

    private static class OtherType<X> {
    }

    private static class Wrap {
        class Inner {
        }
    }

    @Test
    public void testNewParameterizedTypeWithOwner() {
        ParameterizedType type = (ParameterizedType) $Gson$Types.newParameterizedTypeWithOwner(
                null, List.class, String.class);
        assertEquals(List.class, type.getRawType());
        assertNull(type.getOwnerType());
        assertArrayEquals(new Type[] { String.class }, type.getActualTypeArguments());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewParameterizedTypeWithOwnerRejectsNonStaticInnerWithNullOwner() {
        $Gson$Types.newParameterizedTypeWithOwner(null, Wrap.Inner.class, String.class);
    }

    @Test(expected = NullPointerException.class)
    public void testNewParameterizedTypeWithOwnerRejectsNullTypeArgument() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, (Type) null);
    }

    @Test
    public void testArrayOf() {
        GenericArrayType array = (GenericArrayType) $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, array.getGenericComponentType());
        assertEquals("java.lang.String[]", array.toString());
    }

    @Test
    public void testSubtypeOf() {
        WildcardType wildcard = $Gson$Types.subtypeOf(String.class);
        assertArrayEquals(new Type[] { String.class }, wildcard.getUpperBounds());
        assertArrayEquals(new Type[0], wildcard.getLowerBounds());
        assertEquals("? extends java.lang.String", wildcard.toString());

        WildcardType fromWildcard = $Gson$Types.subtypeOf($Gson$Types.supertypeOf(String.class));
        assertArrayEquals(new Type[] { Object.class }, fromWildcard.getUpperBounds());
    }

    @Test
    public void testSupertypeOf() {
        WildcardType wildcard = $Gson$Types.supertypeOf(String.class);
        assertArrayEquals(new Type[] { Object.class }, wildcard.getUpperBounds());
        assertArrayEquals(new Type[] { String.class }, wildcard.getLowerBounds());
        assertEquals("? super java.lang.String", wildcard.toString());

        WildcardType fromWildcard = $Gson$Types.supertypeOf($Gson$Types.subtypeOf(String.class));
        assertArrayEquals(new Type[0], fromWildcard.getLowerBounds());
    }

    @Test
    public void testCanonicalize() {
        assertSame(String.class, $Gson$Types.canonicalize(String.class));
        assertEquals($Gson$Types.arrayOf(String.class), $Gson$Types.canonicalize(String[].class));
        assertNull($Gson$Types.canonicalize(null));

        Type parameterized = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(parameterized, $Gson$Types.canonicalize(parameterized));

        WildcardType wildcard = $Gson$Types.supertypeOf(String.class);
        assertEquals(wildcard, $Gson$Types.canonicalize(wildcard));
    }

    @Test
    public void testGetRawType() {
        assertEquals(String.class, $Gson$Types.getRawType(String.class));
        assertEquals(List.class,
                $Gson$Types.getRawType($Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class)));
        assertEquals(String[].class, $Gson$Types.getRawType($Gson$Types.arrayOf(String.class)));
        assertEquals(Object.class, $Gson$Types.getRawType($Gson$Types.supertypeOf(String.class)));
        assertEquals(Object.class, $Gson$Types.getRawType(HasType.class.getTypeParameters()[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawTypeRejectsNull() {
        $Gson$Types.getRawType(null);
    }

    @Test
    public void testEquals() {
        assertTrue($Gson$Types.equals(null, null));
        assertFalse($Gson$Types.equals(null, String.class));
        assertTrue($Gson$Types.equals(String.class, String.class));
        assertFalse($Gson$Types.equals(String.class, Integer.class));

        Type listOfString = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Type listOfInteger = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
        assertTrue($Gson$Types.equals(listOfString, listOfString));
        assertFalse($Gson$Types.equals(listOfString, listOfInteger));

        assertTrue($Gson$Types.equals($Gson$Types.arrayOf(String.class), $Gson$Types.arrayOf(String.class)));
        assertTrue($Gson$Types.equals($Gson$Types.subtypeOf(String.class), $Gson$Types.subtypeOf(String.class)));
        assertTrue($Gson$Types.equals($Gson$Types.supertypeOf(String.class), $Gson$Types.supertypeOf(String.class)));

        assertTrue($Gson$Types.equals(
                HasType.class.getTypeParameters()[0], HasType.class.getTypeParameters()[0]));
        assertFalse($Gson$Types.equals(
                HasType.class.getTypeParameters()[0], OtherType.class.getTypeParameters()[0]));

        assertFalse($Gson$Types.equals(String.class, $Gson$Types.arrayOf(String.class)));
    }

    @Test
    public void testTypeToString() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
        assertEquals("java.lang.String[]", $Gson$Types.typeToString($Gson$Types.arrayOf(String.class)));

        Type listOfString = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals("java.util.List<java.lang.String>", $Gson$Types.typeToString(listOfString));
    }

    @Test
    public void testGetArrayComponentType() {
        assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
        assertEquals(String.class, $Gson$Types.getArrayComponentType($Gson$Types.arrayOf(String.class)));
    }

    @Test
    public void testGetCollectionElementType() {
        Type arrayListOfString = $Gson$Types.newParameterizedTypeWithOwner(
                null, ArrayList.class, String.class);
        assertEquals(String.class,
                $Gson$Types.getCollectionElementType(arrayListOfString, ArrayList.class));
        assertEquals(Object.class,
                $Gson$Types.getCollectionElementType(Collection.class, Collection.class));
    }

    @Test
    public void testGetMapKeyAndValueTypes() {
        Type map = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
        assertArrayEquals(new Type[] { String.class, Integer.class },
                $Gson$Types.getMapKeyAndValueTypes(map, Map.class));
        assertArrayEquals(new Type[] { String.class, String.class },
                $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class));
        assertArrayEquals(new Type[] { Object.class, Object.class },
                $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class));
    }

    @Test
    public void testResolveTypeVariable() {
        TypeVariable<?> tv = HasType.class.getTypeParameters()[0];
        Type context = $Gson$Types.newParameterizedTypeWithOwner(null, HasType.class, String.class);
        assertEquals(String.class, $Gson$Types.resolve(context, HasType.class, tv));
    }

    @Test
    public void testResolveGenericArrayParameterizedAndWildcard() {
        TypeVariable<?> tv = HasType.class.getTypeParameters()[0];
        Type context = $Gson$Types.newParameterizedTypeWithOwner(null, HasType.class, String.class);

        assertEquals(String[].class, $Gson$Types.resolve(context, HasType.class, String[].class));

        Type array = $Gson$Types.resolve(context, HasType.class, $Gson$Types.arrayOf(tv));
        assertTrue(array instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType) array).getGenericComponentType());

        Type parameterized = $Gson$Types.resolve(context, HasType.class,
                $Gson$Types.newParameterizedTypeWithOwner(null, List.class, tv));
        assertTrue(parameterized instanceof ParameterizedType);
        assertArrayEquals(new Type[] { String.class },
                ((ParameterizedType) parameterized).getActualTypeArguments());

        Type wildcard = $Gson$Types.resolve(context, HasType.class, $Gson$Types.subtypeOf(tv));
        assertTrue(wildcard instanceof WildcardType);
        assertArrayEquals(new Type[] { String.class },
                ((WildcardType) wildcard).getUpperBounds());
    }
}