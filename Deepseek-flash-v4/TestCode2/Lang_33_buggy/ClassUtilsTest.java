package org.apache.commons.lang3;

import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ClassUtilsTest {

    @Test
    public void testGetShortClassName() {
        assertEquals("default", ClassUtils.getShortClassName((Object) null, "default"));
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
        assertEquals("", ClassUtils.getShortClassName((String) null));
        assertEquals("", ClassUtils.getShortClassName(""));
        assertEquals("String", ClassUtils.getShortClassName(String.class));
        assertEquals("int", ClassUtils.getShortClassName("int"));
        assertEquals("String[]", ClassUtils.getShortClassName("[Ljava.lang.String;"));
        assertEquals("int[][]", ClassUtils.getShortClassName("[[I"));
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
    }

    @Test
    public void testGetPackageName() {
        assertEquals("default", ClassUtils.getPackageName((Object) null, "default"));
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
        assertEquals("", ClassUtils.getPackageName(""));
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("java.lang", ClassUtils.getPackageName("[Ljava.lang.String;"));
        assertEquals("", ClassUtils.getPackageName("int"));
        assertEquals("", ClassUtils.getPackageName("[[I"));
    }

    @Test
    public void testGetAllSuperclasses() {
        assertNull(ClassUtils.getAllSuperclasses(null));
        assertTrue(ClassUtils.getAllSuperclasses(Object.class).isEmpty());
        List<Class<?>> supers = ClassUtils.getAllSuperclasses(String.class);
        assertTrue(supers.contains(Object.class));
        assertEquals(Object.class, supers.get(supers.size() - 1));
    }

    @Test
    public void testGetAllInterfaces() {
        assertNull(ClassUtils.getAllInterfaces(null));
        assertTrue(ClassUtils.getAllInterfaces(Object.class).isEmpty());
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(String.class);
        assertTrue(interfaces.contains(Serializable.class));
    }

    @Test
    public void testConvertClassNamesToClasses() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
        assertTrue(ClassUtils.convertClassNamesToClasses(new ArrayList<String>()).isEmpty());
        List<String> names = Arrays.asList("java.lang.String", "invalid");
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(String.class, classes.get(0));
        assertNull(classes.get(1));
    }

    @Test
    public void testConvertClassesToClassNames() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
        assertTrue(ClassUtils.convertClassesToClassNames(new ArrayList<Class<?>>()).isEmpty());
        List<Class<?>> classes = Arrays.asList(String.class, null, Integer.class);
        List<String> names = ClassUtils.convertClassesToClassNames(classes);
        assertEquals("java.lang.String", names.get(0));
        assertNull(names.get(1));
        assertEquals("java.lang.Integer", names.get(2));
    }

    @Test
    public void testIsAssignableSingle() {
        assertFalse(ClassUtils.isAssignable((Class<?>) null, (Class<?>) null));
        assertTrue(ClassUtils.isAssignable((Class<?>) null, Object.class));
        assertFalse(ClassUtils.isAssignable((Class<?>) null, int.class));
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, true));
        assertFalse(ClassUtils.isAssignable(int.class, Integer.class, false));
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, true));
        assertFalse(ClassUtils.isAssignable(Integer.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, short.class, true));
        assertTrue(ClassUtils.isAssignable(byte.class, short.class, false));
        assertFalse(ClassUtils.isAssignable(boolean.class, int.class, true));
        assertTrue(ClassUtils.isAssignable(String.class, Object.class));
        assertFalse(ClassUtils.isAssignable(Object.class, String.class));
    }

    @Test
    public void testIsAssignableArray() {
        assertFalse(ClassUtils.isAssignable(new Class[]{int.class}, new Class[]{int.class, double.class}));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
        assertTrue(ClassUtils.isAssignable(null, new Class<?>[0]));
        assertTrue(ClassUtils.isAssignable(new Class[]{int.class}, new Class[]{Integer.class}, true));
        assertFalse(ClassUtils.isAssignable(new Class[]{int.class}, new Class[]{Integer.class}, false));
    }

    @Test
    public void testPrimitiveToWrapper() {
        assertNull(ClassUtils.primitiveToWrapper(null));
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
        assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
    }

    @Test
    public void testWrapperToPrimitive() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
        assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
    }

    @Test
    public void testPrimitivesToWrappers() {
        assertNull(ClassUtils.primitivesToWrappers(null));
        Class<?>[] empty = new Class<?>[0];
        assertSame(empty, ClassUtils.primitivesToWrappers(empty));
        Class<?>[] primitives = new Class[]{int.class, boolean.class};
        Class<?>[] wrappers = ClassUtils.primitivesToWrappers(primitives);
        assertEquals(Integer.class, wrappers[0]);
        assertEquals(Boolean.class, wrappers[1]);
    }

    @Test
    public void testWrappersToPrimitives() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        Class<?>[] empty = new Class<?>[0];
        assertSame(empty, ClassUtils.wrappersToPrimitives(empty));
        Class<?>[] wrappers = new Class[]{Integer.class, Boolean.class};
        Class<?>[] primitives = ClassUtils.wrappersToPrimitives(wrappers);
        assertEquals(Integer.TYPE, primitives[0]);
        assertEquals(Boolean.TYPE, primitives[1]);
    }

    @Test
    public void testIsInnerClass() {
        assertFalse(ClassUtils.isInnerClass(null));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertTrue(ClassUtils.isInnerClass(java.util.Map.Entry.class));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClassInvalid() throws ClassNotFoundException {
        ClassUtils.getClass("non.existent.Class");
    }

    @Test
    public void testGetClassValid() throws ClassNotFoundException {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
        assertEquals(int.class, ClassUtils.getClass("int"));
        assertEquals(int[].class, ClassUtils.getClass("[I"));
        assertEquals(int[].class, ClassUtils.getClass("int[]"));
    }

    @Test
    public void testGetPublicMethod() throws Exception {
        Method m = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(m);
        assertEquals("length", m.getName());
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethodNotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonexistent", new Class<?>[0]);
    }

    @Test
    public void testToClass() {
        assertNull(ClassUtils.toClass(null));
        assertArrayEquals(new Class<?>[0], ClassUtils.toClass(new Object[0]));
        Object[] array = new Object[]{"hello", 123};
        Class<?>[] classes = ClassUtils.toClass(array);
        assertArrayEquals(new Class<?>[]{String.class, Integer.class}, classes);
    }

    @Test
    public void testGetShortCanonicalName() {
        assertEquals("default", ClassUtils.getShortCanonicalName((Object) null, "default"));
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
        assertEquals("String[]", ClassUtils.getShortCanonicalName(String[].class));
    }

    @Test
    public void testGetPackageCanonicalName() {
        assertEquals("default", ClassUtils.getPackageCanonicalName((Object) null, "default"));
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String[].class));
    }
}