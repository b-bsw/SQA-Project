package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

public class ClassUtilTest {
    private List<JavaType> result;
    
    @Before
    public void setUp() {
        result = new ArrayList<JavaType>();
    }
    
    @Test
    public void testEmptyIterator() {
        assertNotNull(ClassUtil.emptyIterator());
        assertFalse(ClassUtil.emptyIterator().hasNext());
    }
    
    @Test
    public void testFindSuperTypesNull() {
        List<JavaType> types = ClassUtil.findSuperTypes(null, Object.class, true);
        assertTrue(types.isEmpty());
    }
    
    @Test
    public void testFindSuperTypesEndBefore() {
        List<JavaType> types = ClassUtil.findSuperTypes(null, String.class, true);
        assertTrue(types.isEmpty());
    }
    
    @Test
    public void testFindRawSuperTypesNull() {
        List<Class<?>> types = ClassUtil.findRawSuperTypes(null, Object.class, true);
        assertTrue(types.isEmpty());
    }
    
    @Test
    public void testFindSuperClassesNull() {
        List<Class<?>> result = ClassUtil.findSuperClasses(null, Object.class, true);
        assertTrue(result.isEmpty());
    }
    
    @Test
    public void testFindSuperClassesEndBefore() {
        List<Class<?>> result = ClassUtil.findSuperClasses(String.class, String.class, true);
        assertTrue(result.isEmpty());
    }
    
    @Test
    public void testCanBeABeanTypeAnnotation() {
        assertEquals("annotation", ClassUtil.canBeABeanType(Override.class));
    }
    
    @Test
    public void testCanBeABeanTypeArray() {
        assertEquals("array", ClassUtil.canBeABeanType(String[].class));
    }
    
    @Test
    public void testCanBeABeanTypeEnum() {
        assertEquals("enum", ClassUtil.canBeABeanType(Thread.State.class));
    }
    
    @Test
    public void testCanBeABeanTypePrimitive() {
        assertEquals("primitive", ClassUtil.canBeABeanType(int.class));
    }
    
    @Test
    public void testCanBeABeanTypeNull() {
        assertNull(ClassUtil.canBeABeanType(String.class));
    }
    
    @Test
    public void testIsLocalTypeLocal() {
        assertNotNull(ClassUtil.isLocalType(getClass(), true));
    }
    
    @Test
    public void testGetOuterClass() {
        assertNull(ClassUtil.getOuterClass(String.class));
    }
    
    @Test
    public void testIsProxyTypeCglib() {
        assertTrue(ClassUtil.isProxyType(net.sf.cglib.proxy.Enhancer.class));
    }
    
    @Test
    public void testIsProxyTypeNonProxy() {
        assertFalse(ClassUtil.isProxyType(String.class));
    }
    
    @Test
    public void testIsConcreteClass() {
        assertTrue(ClassUtil.isConcrete(String.class));
        assertFalse(ClassUtil.isConcrete(List.class));
    }
    
    @Test
    public void testIsConcreteMember() throws Exception {
        assertTrue(ClassUtil.isConcrete(String.class.getMethod("toString")));
    }
    
    @Test
    public void testIsCollectionMapOrArrayArray() {
        assertTrue(ClassUtil.isCollectionMapOrArray(String[].class));
    }
    
    @Test
    public void testIsCollectionMapOrArrayCollection() {
        assertTrue(ClassUtil.isCollectionMapOrArray(List.class));
    }
    
    @Test
    public void testIsCollectionMapOrArrayMap() {
        assertTrue(ClassUtil.isCollectionMapOrArray(Map.class));
    }
    
    @Test
    public void testIsCollectionMapOrArrayNon() {
        assertFalse(ClassUtil.isCollectionMapOrArray(String.class));
    }
    
    @Test
    public void testIsBogusClassVoid() {
        assertTrue(ClassUtil.isBogusClass(Void.class));
    }
    
    @Test
    public void testIsNonStaticInnerClass() {
        assertFalse(ClassUtil.isNonStaticInnerClass(String.class));
    }
    
    @Test
    public void testIsObjectOrPrimitiveObject() {
        assertTrue(ClassUtil.isObjectOrPrimitive(Object.class));
    }
    
    @Test
    public void testIsObjectOrPrimitivePrimitive() {
        assertTrue(ClassUtil.isObjectOrPrimitive(int.class));
    }
    
    @Test
    public void testHasClass() {
        assertTrue(ClassUtil.hasClass("test", String.class));
        assertFalse(ClassUtil.hasClass(null, String.class));
    }
    
    @Test(expected = IllegalStateException.class)
    public void testVerifyMustOverride() {
        ClassUtil.verifyMustOverride(String.class, new Object(), "test");
    }
    
    @Test
    public void testHasGetterSignature() throws Exception {
        assertTrue(ClassUtil.hasGetterSignature(String.class.getMethod("toString")));
    }
    
    @Test(expected = Error.class)
    public void testThrowIfError() {
        ClassUtil.throwIfError(new Error());
    }
    
    @Test(expected = RuntimeException.class)
    public void testThrowIfRTE() {
        ClassUtil.throwIfRTE(new RuntimeException());
    }
    
    @Test(expected = IOException.class)
    public void testThrowIfIOE() throws IOException {
        ClassUtil.throwIfIOE(new IOException());
    }
    
    @Test
    public void testGetRootCause() {
        Throwable cause = new Throwable();
        Throwable wrapper = new Throwable(cause);
        assertSame(cause, ClassUtil.getRootCause(wrapper));
    }
    
    @Test(expected = IOException.class)
    public void testThrowRootCauseIfIOE() throws IOException {
        ClassUtil.throwRootCauseIfIOE(new IOException());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testThrowAsIAE() {
        ClassUtil.throwAsIAE(new Exception("test"));
    }
    
    @Test(expected = JsonMappingException.class)
    public void testThrowAsMappingException() throws JsonMappingException {
        ClassUtil.throwAsMappingException(null, new IOException("test"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapAndThrowAsIAE() {
        ClassUtil.unwrapAndThrowAsIAE(new Exception(new Exception("root")));
    }
    
    @Test(expected = RuntimeException.class)
    public void testCloseOnFailAndThrowAsIOEGen() throws IOException {
        JsonGenerator g = null;
        ClassUtil.closeOnFailAndThrowAsIOE(g, new Exception("test"));
    }
    
    @Test(expected = RuntimeException.class)
    public void testCloseOnFailAndThrowAsIOEGenCloseable() throws IOException {
        ClassUtil.closeOnFailAndThrowAsIOE(null, null, new Exception("test"));
    }
    
    @Test
    public void testCreateInstance() {
        String s = ClassUtil.createInstance(String.class, true);
        assertNotNull(s);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateInstanceNoDefaultConstructor() {
        ClassUtil.createInstance(NoDefaultConstructor.class, true);
    }
    
    @Test
    public void testFindConstructor() {
        assertNotNull(ClassUtil.findConstructor(String.class, true));
    }
    
    @Test
    public void testFindConstructorNullForceAccess() {
        assertNotNull(ClassUtil.findConstructor(String.class, false));
    }
    
    @Test
    public void testClassOfNull() {
        assertNull(ClassUtil.classOf(null));
    }
    
    @Test
    public void testClassOfObject() {
        assertEquals(String.class, ClassUtil.classOf("test"));
    }
    
    @Test
    public void testRawClassNull() {
        assertNull(ClassUtil.rawClass(null));
    }
    
    @Test
    public void testNonNullNull() {
        assertEquals("default", ClassUtil.nonNull(null, "default"));
    }
    
    @Test
    public void testNonNullNonNull() {
        assertEquals("value", ClassUtil.nonNull("value", "default"));
    }
    
    @Test
    public void testNullOrToStringNull() {
        assertNull(ClassUtil.nullOrToString(null));
    }
    
    @Test
    public void testNullOrToStringNonNull() {
        assertEquals("test", ClassUtil.nullOrToString("test"));
    }
    
    @Test
    public void testNonNullStringNull() {
        assertEquals("", ClassUtil.nonNullString(null));
    }
    
    @Test
    public void testNonNullStringNonNull() {
        assertEquals("test", ClassUtil.nonNullString("test"));
    }
    
    @Test
    public void testQuotedOrNull() {
        assertEquals("\"test\"", ClassUtil.quotedOr("test", "null"));
    }
    
    @Test
    public void testQuotedOrForNull() {
        assertEquals("null", ClassUtil.quotedOr(null, "null"));
    }
    
    @Test
    public void testGetClassDescriptionNull() {
        assertEquals("unknown", ClassUtil.getClassDescription(null));
    }
    
    @Test
    public void testClassNameOfNull() {
        assertEquals("[null]", ClassUtil.classNameOf(null));
    }
    
    @Test
    public void testNameOfNull() {
        assertEquals("[null]", ClassUtil.nameOf(null));
    }
    
    @Test
    public void testNameOfNonArray() {
        assertTrue(ClassUtil.nameOf(String.class).startsWith("`"));
    }
    
    @Test
    public void testNameOfArray() {
        assertTrue(ClassUtil.nameOf(String[].class).contains("[]"));
    }
    
    @Test
    public void testNameOfPrimitive() {
        assertTrue(ClassUtil.nameOf(int.class).contains("int"));
    }
    
    @Test
    public void testNameOfNamedNull() {
        assertEquals("[null]", ClassUtil.nameOf((Named) null));
    }
    
    @Test
    public void testBacktickedNull() {
        assertEquals("[null]", ClassUtil.backticked(null));
    }
    
    @Test
    public void testBacktickedNonNull() {
        assertEquals("`test`", ClassUtil.backticked("test"));
    }
    
    @Test
    public void testDefaultValueInt() {
        assertEquals(Integer.valueOf(0), ClassUtil.defaultValue(Integer.TYPE));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDefaultValueNonPrimitive() {
        ClassUtil.defaultValue(String.class);
    }
    
    @Test
    public void testWrapperTypeInt() {
        assertEquals(Integer.class, ClassUtil.wrapperType(Integer.TYPE));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWrapperTypeNonPrimitive() {
        ClassUtil.wrapperType(String.class);
    }
    
    @Test
    public void testPrimitiveTypeInt() {
        assertEquals(Integer.TYPE, ClassUtil.primitiveType(Integer.class));
    }
    
    @Test
    public void testPrimitiveTypeNonWrapper() {
        assertNull(ClassUtil.primitiveType(String.class));
    }
    
    @Test
    public void testPrimitiveTypePrimitive() {
        assertEquals(Integer.TYPE, ClassUtil.primitiveType(Integer.TYPE));
    }
    
    @Test
    public void testCheckAndFixAccess() throws Exception {
        java.lang.reflect.Field f = String.class.getDeclaredField("value");
        ClassUtil.checkAndFixAccess(f, true);
    }
    
    @Test
    public void testFindEnumTypeEnum() {
        assertEquals(Thread.State.class, ClassUtil.findEnumType(Thread.State.RUNNABLE));
    }
    
    @Test
    public void testFindEnumTypeClass() {
        assertEquals(Thread.State.class, ClassUtil.findEnumType(Thread.State.class));
    }
    
    @Test
    public void testFindEnumTypeEnumSet() {
        EnumSet<Thread.State> set = EnumSet.of(Thread.State.RUNNABLE);
        assertEquals(Thread.State.class, ClassUtil.findEnumType(set));
    }
    
    @Test
    public void testFindEnumTypeEnumMap() {
        EnumMap<Thread.State, String> map = new EnumMap<Thread.State, String>(Thread.State.class);
        map.put(Thread.State.RUNNABLE, "test");
        assertEquals(Thread.State.class, ClassUtil.findEnumType(map));
    }
    
    @Test
    public void testIsJacksonStdImplObject() {
        assertTrue(ClassUtil.isJacksonStdImpl((Object) null));
    }
    
    @Test
    public void testIsJacksonStdImplClass() {
        assertFalse(ClassUtil.isJacksonStdImpl(String.class));
    }
    
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", ClassUtil.getPackageName(String.class));
    }
    
    @Test
    public void testHasEnclosingMethod() {
        assertFalse(ClassUtil.hasEnclosingMethod(String.class));
    }
    
    @Test
    public void testGetDeclaredFields() {
        assertNotNull(ClassUtil.getDeclaredFields(String.class));
    }
    
    @Test
    public void testGetDeclaredMethods() {
        assertNotNull(ClassUtil.getDeclaredMethods(String.class));
    }
    
    @Test
    public void testFindClassAnnotationsObject() {
        assertEquals(0, ClassUtil.findClassAnnotations(Object.class).length);
    }
    
    @Test
    public void testFindClassAnnotationsNonObject() {
        assertNotNull(ClassUtil.findClassAnnotations(Override.class));
    }
    
    @Test
    public void testGetClassMethods() {
        assertNotNull(ClassUtil.getClassMethods(String.class));
    }
    
    @Test
    public void testGetConstructorsInterface() {
        assertEquals(0, ClassUtil.getConstructors(List.class).length);
    }
    
    @Test
    public void testGetConstructorsObject() {
        assertEquals(0, ClassUtil.getConstructors(Object.class).length);
    }
    
    @Test
    public void testGetConstructorsNormal() {
        assertTrue(ClassUtil.getConstructors(String.class).length > 0);
    }
    
    @Test
    public void testGetDeclaringClass() {
        assertNull(ClassUtil.getDeclaringClass(String.class));
    }
    
    @Test
    public void testGetGenericSuperclass() {
        assertNotNull(ClassUtil.getGenericSuperclass(String.class));
    }
    
    @Test
    public void testGetGenericInterfaces() {
        assertNotNull(ClassUtil.getGenericInterfaces(String.class));
    }
    
    @Test
    public void testGetEnclosingClass() {
        assertNull(ClassUtil.getEnclosingClass(String.class));
    }
    
    @Test
    public void testCtorGetParamCount() throws Exception {
        ClassUtil.Ctor ctor = new ClassUtil.Ctor(String.class.getDeclaredConstructor());
        assertEquals(0, ctor.getParamCount());
    }
    
    @Test
    public void testCtorGetDeclaringClass() throws Exception {
        ClassUtil.Ctor ctor = new ClassUtil.Ctor(String.class.getDeclaredConstructor());
        assertEquals(String.class, ctor.getDeclaringClass());
    }
    
    @Test
    public void testCtorGetDeclaredAnnotations() throws Exception {
        ClassUtil.Ctor ctor = new ClassUtil.Ctor(String.class.getDeclaredConstructor());
        assertNotNull(ctor.getDeclaredAnnotations());
    }
    
    @Test
    public void testCtorGetParameterAnnotations() throws Exception {
        ClassUtil.Ctor ctor = new ClassUtil.Ctor(String.class.getDeclaredConstructor());
        assertNotNull(ctor.getParameterAnnotations());
    }
    
    @Test
    public void testIsLocalTypeNonStatic() {
        assertNotNull(ClassUtil.isLocalType(getClass(), false));
    }
    
    @Test
    public void testIsBogusClassVoidType() {
        assertTrue(ClassUtil.isBogusClass(Void.TYPE));
    }
    
    @Test
    public void testIsConcreteNonAbstractInterface() {
        assertFalse(ClassUtil.isConcrete(List.class));
    }
    
    @Test
    public void testIsCollectionMapOrArrayFalse() {
        assertFalse(ClassUtil.isCollectionMapOrArray(Integer.class));
    }
    
    @Test
    public void testThrowAsIAEMessage() {
        try {
            ClassUtil.throwAsIAE(new Exception("custom message"), "custom message");
        } catch (IllegalArgumentException e) {
            assertEquals("custom message", e.getMessage());
        }
    }
    
    @Test
    public void testUnwrapAndThrowAsIAEMessage() {
        try {
            ClassUtil.unwrapAndThrowAsIAE(new Exception(new Exception("root cause")), "wrapper message");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("wrapper"));
        }
    }
    
    @Test
    public void testCreateInstanceWithForceAccess() {
        assertNotNull(ClassUtil.createInstance(String.class, true));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindConstructorNoDefaultConstructor() {
        ClassUtil.findConstructor(NoDefaultConstructor.class, true);
    }
    
    @Test
    public void testDefaultValueLong() {
        assertEquals(Long.valueOf(0L), ClassUtil.defaultValue(Long.TYPE));
    }
    
    @Test
    public void testDefaultValueBoolean() {
        assertEquals(Boolean.FALSE, ClassUtil.defaultValue(Boolean.TYPE));
    }
    
    @Test
    public void testDefaultValueDouble() {
        assertEquals(Double.valueOf(0.0), ClassUtil.defaultValue(Double.TYPE));
    }
    
    @Test
    public void testWrapperTypeLong() {
        assertEquals(Long.class, ClassUtil.wrapperType(Long.TYPE));
    }
    
    @Test
    public void testPrimitiveTypeLong() {
        assertEquals(Long.TYPE, ClassUtil.primitiveType(Long.class));
    }
    
    @Test
    public void testFindEnumTypeNullEnumSet() {
        EnumSet<Thread.State> set = EnumSet.noneOf(Thread.State.class);
        try {
            ClassUtil.findEnumType(set);
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testFindEnumTypeNullEnumMap() {
        EnumMap<Thread.State, String> map = new EnumMap<Thread.State, String>(Thread.State.class);
        try {
            ClassUtil.findEnumType(map);
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testFindFirstAnnotatedEnumValue() throws Exception {
        assertNull(ClassUtil.findFirstAnnotatedEnumValue((Class) Thread.State.class, Deprecated.class));
    }
    
    @Test
    public void testHasGetterSignatureStatic() throws Exception {
        assertFalse(ClassUtil.hasGetterSignature(Thread.class.getMethod("activeCount")));
    }
    
    @Test
    public void testGetClassMethodsNoClassDefFoundError() throws ClassNotFoundException {
        assertTrue(ClassUtil.getClassMethods(String.class).length > 0);
    }
    
    @Test
    public void testCheckAndFixAccessForceFalse() throws Exception {
        java.lang.reflect.Field f = String.class.getDeclaredField("value");
        ClassUtil.checkAndFixAccess(f, false);
    }
    
    static class NoDefaultConstructor {
        public NoDefaultConstructor(String arg) {}
    }
}