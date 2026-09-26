package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JavaTypeTest {

    // ---- Helper subclass for testing abstract JavaType ----
    private static class SimpleJavaType extends JavaType {

        public SimpleJavaType(Class<?> raw, int additionalHash,
                Object valueHandler, Object typeHandler, boolean asStatic) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new SimpleJavaType(_class, _hash, _valueHandler, h, _asStatic);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this; // for simplicity
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new SimpleJavaType(_class, _hash, h, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withStaticTyping() {
            return new SimpleJavaType(_class, _hash, _valueHandler, _typeHandler, true);
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new SimpleJavaType(subclass, _hash, _valueHandler, _typeHandler, _asStatic);
        }

        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public JavaType widenContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public Class<?> getParameterSource() {
            return _class;
        }

        @Override
        public boolean isContainerType() {
            return false;
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            sb.append('L');
            sb.append(_class.getName());
            sb.append(';');
            return sb;
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            sb.append(_class.getName());
            return sb;
        }

        @Override
        public String toString() {
            return _class.getName();
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SimpleJavaType other = (SimpleJavaType) o;
            return _class.equals(other._class);
        }

        // Expose protected fields for verification (optional)
        public Object getValueHandler() { return _valueHandler; }
        public Object getTypeHandler() { return _typeHandler; }
        public boolean isStatic() { return _asStatic; }
    }

    // Exception classes for testing
    private static class MyException extends Throwable {}
    private static class MySubException extends MyException {}

    private static interface MyInterface {}
    private abstract static class MyAbstractClass {}
    private static class MyConcreteClass {}
    private static class MySubclass extends MyConcreteClass {}

    private SimpleJavaType typeString;
    private SimpleJavaType typeInt;
    private SimpleJavaType typeThrowable;
    private SimpleJavaType typeInterface;
    private SimpleJavaType typeAbstract;
    private SimpleJavaType typeConcrete;
    private SimpleJavaType typeWithHandlers;

    @Before
    public void setUp() throws Exception {
        typeString = new SimpleJavaType(String.class, 10, null, null, false);
        typeInt = new SimpleJavaType(Integer.TYPE, 20, null, null, false);
        typeThrowable = new SimpleJavaType(MyException.class, 30, null, null, false);
        typeInterface = new SimpleJavaType(MyInterface.class, 40, null, null, false);
        typeAbstract = new SimpleJavaType(MyAbstractClass.class, 50, null, null, false);
        typeConcrete = new SimpleJavaType(MyConcreteClass.class, 60, null, null, false);
        typeWithHandlers = new SimpleJavaType(String.class, 70, "valueHandler", "typeHandler", true);
    }

    @After
    public void tearDown() throws Exception {
        // no cleanup needed
    }

    // ---------------- Basic getters ----------------
    @Test
    public void testBasicGetters() {
        assertSame(String.class, typeString.getRawClass());
        assertTrue(typeString.hasRawClass(String.class));
        assertFalse(typeString.hasRawClass(Integer.class));

        assertTrue(typeInt.isPrimitive());
        assertFalse(typeString.isPrimitive());

        assertTrue(typeInterface.isInterface());
        assertTrue(typeInterface.isAbstract());
        assertFalse(typeInterface.isConcrete());

        assertTrue(typeAbstract.isAbstract());
        assertFalse(typeAbstract.isConcrete());

        assertTrue(typeConcrete.isConcrete());
        assertFalse(typeConcrete.isAbstract());
        assertFalse(typeConcrete.isInterface());

        assertTrue(typeThrowable.isThrowable());
        assertFalse(typeString.isThrowable());

        assertFalse(typeString.isArrayType());
        assertFalse(typeString.isEnumType());
        assertFalse(typeString.isFinal());
        assertTrue(new SimpleJavaType(String.class, 0, null, null, false).isFinal()); // String is final
        assertFalse(typeString.isContainerType());
        assertFalse(typeString.isCollectionLikeType());
        assertFalse(typeString.isMapLikeType());
    }

    // ---------------- useStaticType / _asStatic ----------------
    @Test
    public void testUseStaticType() {
        assertTrue(typeWithHandlers.useStaticType());
        assertFalse(typeString.useStaticType());
    }

    // ---------------- isConcrete branch coverage ----------------
    @Test
    public void testIsConcretePrimitive() {
        // primitive types have abstract flag set (see comment in source)
        // but isConcrete returns true because isPrimitive() is true
        assertTrue(typeInt.isConcrete());
    }

    @Test
    public void testIsConcreteConcreteClass() {
        assertTrue(typeConcrete.isConcrete());
    }

    // ---------------- getGenericSignature / getErasedSignature ----------------
    @Test
    public void testSignatures() {
        String generic = typeString.getGenericSignature();
        assertTrue(generic.startsWith("L"));
        assertTrue(generic.endsWith(";"));
        assertTrue(generic.contains("String"));

        String erased = typeString.getErasedSignature();
        assertEquals("java.lang.String", erased);
    }

    // ---------------- hashCode ----------------
    @Test
    public void testHashCode() {
        int expected = String.class.getName().hashCode() + 10;
        assertEquals(expected, typeString.hashCode());
    }

    // ---------------- equals / toString ----------------
    @Test
    public void testEqualsAndToString() {
        SimpleJavaType same = new SimpleJavaType(String.class, 10, null, null, false);
        SimpleJavaType different = new SimpleJavaType(Integer.class, 20, null, null, false);
        assertEquals(typeString, same);
        assertEquals(typeString.hashCode(), same.hashCode());
        assertNotEquals(typeString, different);
        assertNotEquals(null, typeString);
        assertEquals("java.lang.String", typeString.toString());
    }

    // ---------------- narrowBy ----------------
    @Test
    public void testNarrowBySameClass() {
        // same class returns this
        assertSame(typeConcrete, typeConcrete.narrowBy(MyConcreteClass.class));
    }

    @Test
    public void testNarrowByAssignable() {
        JavaType narrowed = typeConcrete.narrowBy(MySubclass.class);
        assertNotNull(narrowed);
        assertEquals(MySubclass.class, narrowed.getRawClass());
        // value and type handlers should be preserved
        assertNull(narrowed.getValueHandler());
        assertNull(narrowed.getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNarrowByNotAssignable() {
        typeConcrete.narrowBy(String.class);
    }

    // ---------------- forcedNarrowBy ----------------
    @Test
    public void testForcedNarrowBySameClass() {
        assertSame(typeConcrete, typeConcrete.forcedNarrowBy(MyConcreteClass.class));
    }

    @Test
    public void testForcedNarrowByDifferent() {
        JavaType result = typeConcrete.forcedNarrowBy(MySubclass.class);
        assertEquals(MySubclass.class, result.getRawClass());
    }

    // ---------------- widenBy ----------------
    @Test
    public void testWidenBySameClass() {
        assertSame(typeConcrete, typeConcrete.widenBy(MyConcreteClass.class));
    }

    @Test
    public void testWidenByAssignable() {
        JavaType widened = typeConcrete.widenBy(Object.class);
        assertEquals(Object.class, widened.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWidenByNotAssignable() {
        typeConcrete.widenBy(String.class);
    }

    // ---------------- _assertSubclass (helper) ----------------
    @Test
    public void test_assertSubclassPass() {
        // should not throw
        typeConcrete._assertSubclass(MySubclass.class, MyConcreteClass.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_assertSubclassFail() {
        typeConcrete._assertSubclass(String.class, MyConcreteClass.class);
    }

    // ---------------- handlers (getValueHandler/getTypeHandler) ----------------
    @Test
    public void testHandlers() {
        assertNull(typeString.getValueHandler());
        assertNull(typeString.getTypeHandler());
        assertEquals("valueHandler", typeWithHandlers.getValueHandler());
        assertEquals("typeHandler", typeWithHandlers.getTypeHandler());
    }

    // ---------------- containedTypeOrUnknown ----------------
    @Test
    public void testContainedTypeOrUnknownWithNull() {
        // default containedType returns null, so returns TypeFactory.unknownType()
        JavaType unknown = typeString.containedTypeOrUnknown(0);
        assertNotNull(unknown);
        // TypeFactory.unknownType() should return some type; we can only assert not null
        // We cannot assume equals(Object.class) because unknownType might be a special instance
    }

    @Test
    public void testContainedTypeOrUnknownWithNonNull() {
        // Override containedType to simulate non-null
        JavaType custom = new SimpleJavaType(String.class, 0, null, null, false) {
            @Override
            public JavaType containedType(int index) {
                if (index == 0) return new SimpleJavaType(Integer.class, 1, null, null, false);
                return null;
            }
        };
        JavaType result = custom.containedTypeOrUnknown(0);
        assertEquals(Integer.class, result.getRawClass());
    }

    // ---------------- hasGenericTypes (containedTypeCount > 0) ----------------
    @Test
    public void testHasGenericTypes() {
        assertFalse(typeString.hasGenericTypes()); // default count = 0
        JavaType withCount = new SimpleJavaType(String.class, 0, null, null, false) {
            @Override
            public int containedTypeCount() { return 1; }
        };
        assertTrue(withCount.hasGenericTypes());
    }

    // ---------------- withTypeHandler, withValueHandler, withStaticTyping factory methods ----------------
    @Test
    public void testWithTypeHandler() {
        Object handler = new Object();
        JavaType newType = typeString.withTypeHandler(handler);
        assertNotSame(typeString, newType);
        assertEquals(handler, newType.getTypeHandler());
        assertNull(newType.getValueHandler());
    }

    @Test
    public void testWithValueHandler() {
        Object handler = new Object();
        JavaType newType = typeString.withValueHandler(handler);
        assertNotSame(typeString, newType);
        assertEquals(handler, newType.getValueHandler());
        assertNull(newType.getTypeHandler());
    }

    @Test
    public void testWithStaticTyping() {
        JavaType newType = typeString.withStaticTyping();
        assertNotSame(typeString, newType);
        assertTrue(((SimpleJavaType)newType).isStatic());
    }
}