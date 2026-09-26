package com.google.gson.internal;

import org.junit.Test;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class $Gson$TypesTest {

  private static class HasInner {
    class Inner {}
  }

  private static class HasTypeVariable {
    <T> T method() { return null; }
  }

  private static TypeVariable<?> typeVariable() throws Exception {
    return HasTypeVariable.class.getDeclaredMethod("method").getTypeParameters()[0];
  }

  private static void assertMapTypes(Type context, Class<?> rawType, Type key, Type value) {
    assertArrayEquals(new Type[] { key, value },
        $Gson$Types.getMapKeyAndValueTypes(context, rawType));
  }

  @Test
  public void testNewParameterizedTypeWithOwner() {
    ParameterizedType type =
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertNull(type.getOwnerType());
    assertEquals(List.class, type.getRawType());
    assertArrayEquals(new Type[] { String.class }, type.getActualTypeArguments());
    assertEquals("java.util.List<java.lang.String>", type.toString());

    ParameterizedType noArgs = $Gson$Types.newParameterizedTypeWithOwner(null, List.class);
    assertEquals(0, noArgs.getActualTypeArguments().length);

    ParameterizedType innerType =
        $Gson$Types.newParameterizedTypeWithOwner(HasInner.class, HasInner.Inner.class, String.class);
    assertSame(HasInner.class, innerType.getOwnerType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeRejectsMissingOwner() {
    $Gson$Types.newParameterizedTypeWithOwner(null, HasInner.Inner.class, String.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeRejectsPrimitiveTypeArgument() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test(expected = NullPointerException.class)
  public void testNewParameterizedTypeRejectsNullTypeArgument() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { null });
  }

  @Test
  public void testArrayOf() {
    GenericArrayType array = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, array.getGenericComponentType());
    assertEquals("java.lang.String[]", array.toString());
    assertTrue($Gson$Types.equals(array, $Gson$Types.arrayOf(String.class)));
  }

  @Test
  public void testSubtypeOf() {
    WildcardType wildcard = $Gson$Types.subtypeOf(CharSequence.class);
    assertArrayEquals(new Type[] { CharSequence.class }, wildcard.getUpperBounds());
    assertArrayEquals(new Type[] {}, wildcard.getLowerBounds());
    assertEquals("? extends java.lang.CharSequence", wildcard.toString());
    assertEquals("?", $Gson$Types.subtypeOf(Object.class).toString());
  }

  @Test(expected = NullPointerException.class)
  public void testSubtypeOfRejectsNull() {
    $Gson$Types.subtypeOf(null);
  }

  @Test
  public void testSupertypeOf() {
    WildcardType wildcard = $Gson$Types.supertypeOf(String.class);
    assertArrayEquals(new Type[] { String.class }, wildcard.getLowerBounds());
    assertArrayEquals(new Type[] { Object.class }, wildcard.getUpperBounds());
    assertEquals("? super java.lang.String", wildcard.toString());
  }

  @Test
  public void testCanonicalize() {
    assertSame(String.class, $Gson$Types.canonicalize(String.class));

    Type arrayType = $Gson$Types.canonicalize(String[].class);
    assertTrue(arrayType instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) arrayType).getGenericComponentType());

    ParameterizedType original = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertTrue($Gson$Types.equals(original, $Gson$Types.canonicalize(original)));
    assertTrue($Gson$Types.equals($Gson$Types.arrayOf(String.class),
        $Gson$Types.canonicalize($Gson$Types.arrayOf(String.class))));
    assertTrue($Gson$Types.equals($Gson$Types.subtypeOf(String.class),
        $Gson$Types.canonicalize($Gson$Types.subtypeOf(String.class))));

    TypeVariable<?> tv = List.class.getTypeParameters()[0];
    assertSame(tv, $Gson$Types.canonicalize(tv));
  }

  @Test
  public void testGetRawType() throws Exception {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));
    assertEquals(String.class,
        $Gson$Types.getRawType($Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class)));
    assertEquals(String[].class,
        $Gson$Types.getRawType($Gson$Types.arrayOf(String.class)));
    assertEquals(Object.class, $Gson$Types.getRawType(typeVariable()));
    assertEquals(List.class, $Gson$Types.getRawType($Gson$Types.subtypeOf(List.class)));
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

    ParameterizedType listOfString =
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType listOfString2 =
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType listOfInteger =
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);

    assertTrue($Gson$Types.equals(listOfString, listOfString2));
    assertFalse($Gson$Types.equals(listOfString, listOfInteger));
    assertFalse($Gson$Types.equals(listOfString, String.class));

    assertTrue($Gson$Types.equals($Gson$Types.arrayOf(String.class),
        $Gson$Types.arrayOf(String.class)));
    assertFalse($Gson$Types.equals($Gson$Types.arrayOf(String.class),
        $Gson$Types.arrayOf(Integer.class)));

    assertTrue($Gson$Types.equals($Gson$Types.subtypeOf(String.class),
        $Gson$Types.subtypeOf(String.class)));
    assertFalse($Gson$Types.equals($Gson$Types.subtypeOf(String.class),
        $Gson$Types.subtypeOf(Integer.class)));
  }

  @Test
  public void testTypeToString() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    assertEquals("java.util.List<java.lang.String>",
        $Gson$Types.typeToString($Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class)));
    assertEquals("?", $Gson$Types.typeToString($Gson$Types.subtypeOf(Object.class)));
  }

  @Test
  public void testGetArrayComponentType() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    assertEquals(String.class, $Gson$Types.getArrayComponentType($Gson$Types.arrayOf(String.class)));
  }

  @Test(expected = ClassCastException.class)
  public void testGetArrayComponentTypeRejectsParameterizedType() {
    $Gson$Types.getArrayComponentType(
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class));
  }

  @Test
  public void testGetCollectionElementType() {
    ParameterizedType stringList =
        $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
    assertEquals(String.class, $Gson$Types.getCollectionElementType(stringList, ArrayList.class));

    assertEquals(Object.class,
        $Gson$Types.getCollectionElementType(Collection.class, Collection.class));

    Type wildcardCollection = $Gson$Types.subtypeOf(
        $Gson$Types.newParameterizedTypeWithOwner(null, Collection.class, String.class));
    assertEquals(String.class,
        $Gson$Types.getCollectionElementType(wildcardCollection, Collection.class));
  }

  @Test
  public void testGetMapKeyAndValueTypes() {
    assertMapTypes(Properties.class, Properties.class, String.class, String.class);
    assertMapTypes($Gson$Types.newParameterizedTypeWithOwner(
            null, HashMap.class, String.class, Integer.class),
        HashMap.class, String.class, Integer.class);
    assertMapTypes(Map.class, Map.class, Object.class, Object.class);
  }

  @Test
  public void testResolve() {
    ParameterizedType stringList =
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    TypeVariable<?> e = List.class.getTypeParameters()[0];

    assertEquals(String.class, $Gson$Types.resolve(stringList, List.class, e));
    assertSame(String[].class, $Gson$Types.resolve(stringList, List.class, String[].class));

    GenericArrayType array = $Gson$Types.arrayOf(String.class);
    assertSame(array, $Gson$Types.resolve(stringList, List.class, array));

    WildcardType wildcard = $Gson$Types.subtypeOf(String.class);
    assertSame(wildcard, $Gson$Types.resolve(stringList, List.class, wildcard));

    ParameterizedType arrayListOfString =
        $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
    Type listOfE =
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, List.class.getTypeParameters()[0]);
    Type resolvedList = $Gson$Types.resolve(arrayListOfString, ArrayList.class, listOfE);
    assertTrue($Gson$Types.equals(
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class), resolvedList));

    Type resolvedArray = $Gson$Types.resolve(
        arrayListOfString, ArrayList.class, $Gson$Types.arrayOf(List.class.getTypeParameters()[0]));
    assertTrue($Gson$Types.equals($Gson$Types.arrayOf(String.class), resolvedArray));
  }
}