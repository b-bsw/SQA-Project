package org.apache.commons.lang;

import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class ClassUtilsTest {

    // ==================== getShortClassName ====================

    @Test
    public void testGetShortClassNameObjectNull() {
        assertEquals("nullValue", ClassUtils.getShortClassName((Object) null, "nullValue"));
    }

    @Test
    public void testGetShortClassNameObjectNonNull() {
        assertEquals("String", ClassUtils.getShortClassName("hello", "fail"));
    }

    @Test
    public void testGetShortClassNameClassNull() {
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
    }

    @Test
    public void testGetShortClassNameClass() {
        assertEquals("String", ClassUtils.getShortClassName(String.class));
    }

    @Test
    public void testGetShortClassNameStringNull() {
        assertEquals("", ClassUtils.getShortClassName((String) null));
    }

    @Test
    public void testGetShortClassNameStringEmpty() {
        assertEquals("", ClassUtils.getShortClassName(""));
    }

    @Test
    public void testGetShortClassNameStringWithPackage() {
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
    }

    @Test
    public void testGetShortClassNameStringInnerClass() {
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
    }

    // ==================== getPackageName ====================

    @Test
    public void testGetPackageNameObjectNull() {
        assertEquals("pkg", ClassUtils.getPackageName((Object) null, "pkg"));
    }

    @Test
    public void testGetPackageNameObjectNonNull() {
        assertEquals("java.lang", ClassUtils.getPackageName("test"));
    }

    @Test
    public void testGetPackageNameClassNull() {
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
    }

    @Test
    public void testGetPackageNameClass() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
    }

    @Test
    public void testGetPackageNameStringNull() {
        assertEquals("", ClassUtils.getPackageName((String) null));
    }

    @Test
    public void testGetPackageNameStringNoPackage() {
        assertEquals("", ClassUtils.getPackageName("NoPackage"));
    }

    @Test
    public void testGetPackageNameStringWithPackage() {
        assertEquals("java.util", ClassUtils.getPackageName("java.util.List"));
    }

    // ==================== getAllSuperclasses ====================

    @Test
    public void testGetAllSuperclassesNull() {
        assertNull(ClassUtils.getAllSuperclasses(null));
    }

    @Test
    public void testGetAllSuperclassesObject() {
        List<Class<?>> supers = ClassUtils.getAllSuperclasses(Object.class);
        assertNotNull(supers);
        assertTrue(supers.isEmpty());
    }

    @Test
    public void testGetAllSuperclassesArrayList() {
        List<Class<?>> supers = ClassUtils.getAllSuperclasses(ArrayList.class);
        assertNotNull(supers);
        assertTrue(supers.size() >= 3); // AbstractList, AbstractCollection, Object
        assertEquals(AbstractList.class, supers.get(0));
    }

    // ==================== getAllInterfaces ====================

    @Test
    public void testGetAllInterfacesNull() {
        assertNull(ClassUtils.getAllInterfaces(null));
    }

    @Test
    public void testGetAllInterfacesObject() {
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(Object.class);
        assertNotNull(interfaces);
        assertTrue(interfaces.isEmpty());
    }

    @Test
    public void testGetAllInterfacesArrayList() {
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(ArrayList.class);
        assertNotNull(interfaces);
        assertTrue(interfaces.contains(List.class));
        assertTrue(interfaces.contains(RandomAccess.class));
        assertTrue(interfaces.contains(Cloneable.class));
        assertTrue(interfaces.contains(java.io.Serializable.class));
    }

    // ==================== convertClassNamesToClasses ====================

    @Test
    public void testConvertClassNamesToClassesNull() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
    }

    @Test
    public void testConvertClassNamesToClassesEmpty() {
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(new ArrayList<String>());
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testConvertClassNamesToClassesValid() {
        List<String> names = Arrays.asList("java.lang.String", "java.util.List");
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(2, classes.size());
        assertEquals(String.class, classes.get(0));
        assertEquals(List.class, classes.get(1));
    }

    @Test
    public void testConvertClassNamesToClassesInvalid() {
        List<String> names = Arrays.asList("java.lang.NonExistentClass");
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(1, classes.size());
        assertNull(classes.get(0));
    }

    // ==================== convertClassesToClassNames ====================

    @Test
    public void testConvertClassesToClassNamesNull() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
    }

    @Test
    public void testConvertClassesToClassNamesEmpty() {
        List<String> result = ClassUtils.convertClassesToClassNames(new ArrayList<Class<?>>());
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testConvertClassesToClassNamesWithNull() {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(null);
        classes.add(Integer.class);
        List<String> names = ClassUtils.convertClassesToClassNames(classes);
        assertEquals(3, names.size());
        assertEquals("java.lang.String", names.get(0));
        assertNull(names.get(1));
        assertEquals("java.lang.Integer", names.get(2));
    }

    // ==================== isAssignable (array) ====================

    @Test
    public void testIsAssignableArraysNullLength() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{Object.class, Integer.class}));
    }

    @Test
    public void testIsAssignableArraysNullArray() {
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
    }

    @Test
    public void testIsAssignableArraysEmpty() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[0], new Class<?>[0]));
    }

    @Test
    public void testIsAssignableArraysMatch() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{String.class, Integer.class}, new Class<?>[]{Object.class, Object.class}));
    }

    @Test
    public void testIsAssignableArraysNoMatch() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{Integer.class}, new Class<?>[]{String.class}));
    }

    @Test
    public void testIsAssignableArraysWithAutoboxingTrue() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{int.class}, new Class<?>[]{Object.class}, true));
    }

    @Test
    public void testIsAssignableArraysWithAutoboxingFalse() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{int.class}, new Class<?>[]{Object.class}, false));
    }

    // ==================== isAssignable (single) ====================

    @Test
    public void testIsAssignableSingleNullToClass() {
        assertFalse(ClassUtils.isAssignable(String.class, null));
    }

    @Test
    public void testIsAssignableSingleNullClsPrimitive() {
        assertFalse(ClassUtils.isAssignable(null, int.class));
    }

    @Test
    public void testIsAssignableSingleNullClsNonPrimitive() {
        assertTrue(ClassUtils.isAssignable(null, String.class));
    }

    @Test
    public void testIsAssignableSingleSame() {
        assertTrue(ClassUtils.isAssignable(String.class, String.class));
    }

    @Test
    public void testIsAssignableSingleAssignable() {
        assertTrue(ClassUtils.isAssignable(Integer.class, Object.class));
    }

    @Test
    public void testIsAssignableSingleNotAssignable() {
        assertFalse(ClassUtils.isAssignable(Object.class, String.class));
    }

    @Test
    public void testIsAssignableSinglePrimitiveWidening() {
        // int -> long with autoboxing false
        assertTrue(ClassUtils.isAssignable(int.class, long.class));
    }

    @Test
    public void testIsAssignableSinglePrimitiveWideningNot() {
        // boolean -> int not possible
        assertFalse(ClassUtils.isAssignable(boolean.class, int.class));
    }

    @Test
    public void testIsAssignableSingleAutoboxingWrapperToPrimitive() {
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, true));
    }

    @Test
    public void testIsAssignableSingleAutoboxingPrimitiveToWrapper() {
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, true));
    }

    @Test
    public void testIsAssignableSingleAutoboxingNoConversion() {
        // int -> String with autoboxing true -> false because Integer is not assignable to String
        assertFalse(ClassUtils.isAssignable(int.class, String.class, true));
    }

    // ==================== primitiveToWrapper / wrapperToPrimitive ====================

    @Test
    public void testPrimitiveToWrapperNull() {
        assertNull(ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitiveToWrapperInt() {
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
    }

    @Test
    public void testPrimitiveToWrapperAlreadyWrapper() {
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
    }

    @Test
    public void testWrapperToPrimitiveNull() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
    }

    @Test
    public void testWrapperToPrimitiveInteger() {
        assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
    }

    @Test
    public void testWrapperToPrimitiveNotMapped() {
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
    }

    // ==================== primitivesToWrappers / wrappersToPrimitives ====================

    @Test
    public void testPrimitivesToWrappersNull() {
        assertNull(ClassUtils.primitivesToWrappers(null));
    }

    @Test
    public void testPrimitivesToWrappersEmpty() {
        Class<?>[] input = new Class<?>[0];
        Class<?>[] result = ClassUtils.primitivesToWrappers(input);
        assertSame(input, result);
    }

    @Test
    public void testPrimitivesToWrappersMixed() {
        Class<?>[] input = new Class<?>[]{int.class, String.class, boolean.class};
        Class<?>[] result = ClassUtils.primitivesToWrappers(input);
        assertEquals(Integer.class, result[0]);
        assertEquals(String.class, result[1]); // unchanged
        assertEquals(Boolean.class, result[2]);
    }

    @Test
    public void testWrappersToPrimitivesNull() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
    }

    @Test
    public void testWrappersToPrimitivesEmpty() {
        Class<?>[] input = new Class<?>[0];
        Class<?>[] result = ClassUtils.wrappersToPrimitives(input);
        assertSame(input, result);
    }

    @Test
    public void testWrappersToPrimitivesMixed() {
        Class<?>[] input = new Class<?>[]{Integer.class, String.class, Boolean.class};
        Class<?>[] result = ClassUtils.wrappersToPrimitives(input);
        assertEquals(int.class, result[0]);
        assertNull(result[1]); // String has no primitive
        assertEquals(boolean.class, result[2]);
    }

    // ==================== isInnerClass ====================

    @Test
    public void testIsInnerClassNull() {
        assertFalse(ClassUtils.isInnerClass(null));
    }

    @Test
    public void testIsInnerClassFalse() {
        assertFalse(ClassUtils.isInnerClass(String.class));
    }

    @Test
    public void testIsInnerClassTrue() {
        assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
    }

    // ==================== getClass (abbreviation) ====================

    @Test
    public void testGetClassAbbreviation() throws Exception {
        assertEquals(int.class, ClassUtils.getClass("int"));
    }

    @Test
    public void testGetClassCanonicalName() throws Exception {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClassNotFound() throws Exception {
        ClassUtils.getClass("does.not.Exist");
    }

    // ==================== getPublicMethod ====================

    @Test
    public void testGetPublicMethodFound() throws Exception {
        Method m = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(m);
        assertEquals("length", m.getName());
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethodNotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistent", new Class<?>[0]);
    }

    // ==================== toClass ====================

    @Test
    public void testToClassNull() {
        assertNull(ClassUtils.toClass(null));
    }

    @Test
    public void testToClassEmpty() {
        Object[] arr = new Object[0];
        assertEquals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.toClass(arr));
    }

    @Test
    public void testToClass() {
        Object[] arr = {"hello", 123};
        Class<?>[] classes = ClassUtils.toClass(arr);
        assertEquals(String.class, classes[0]);
        assertEquals(Integer.class, classes[1]);
    }

    @Test(expected = NullPointerException.class)
    public void testToClassWithNullElement() {
        Object[] arr = {"test", null};
        ClassUtils.toClass(arr);
    }

    // ==================== getShortCanonicalName ====================

    @Test
    public void testGetShortCanonicalNameObjectNull() {
        assertEquals("default", ClassUtils.getShortCanonicalName(null, "default"));
    }

    @Test
    public void testGetShortCanonicalNameClass() {
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
    }

    @Test
    public void testGetShortCanonicalNameString() {
        // "java.lang.String" -> "String"
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
    }

    @Test
    public void testGetShortCanonicalNameArray() {
        // "[[I" -> "int[][]"
        assertEquals("int[][]", ClassUtils.getShortCanonicalName("[[I"));
    }

    // ==================== getPackageCanonicalName ====================

    @Test
    public void testGetPackageCanonicalNameObjectNull() {
        assertEquals("pkg", ClassUtils.getPackageCanonicalName(null, "pkg"));
    }

    @Test
    public void testGetPackageCanonicalNameClass() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
    }

    @Test
    public void testGetPackageCanonicalNameString() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String"));
    }

    @Test
    public void testGetPackageCanonicalNameArray() {
        // "[[Ljava.lang.String;" -> "java.lang"
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[[Ljava.lang.String;"));
    }
}