package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.type.TypeBindings;

import org.junit.Test;

public class JavaTypeTest {

    private static class TestJavaType extends JavaType {
        private static final long serialVersionUID = 1L;

        private final int additionalHash;
        private final JavaType[] contents;
        private final String[] contentNames;
        private final JavaType keyType;
        private final JavaType contentType;
        private final JavaType referencedType;
        private final JavaType superClass;
        private final List<JavaType> interfaces;
        private final Object contentValueHandler;
        private final Object contentTypeHandler;
        private final boolean containerType;

        TestJavaType(Class<?> raw, int additionalHash, Object valueHandler,
                     Object typeHandler, boolean asStatic) {
            this(raw, additionalHash, valueHandler, typeHandler, asStatic,
                 new JavaType[0], new String[0], null, null, null, null,
                 Collections.<JavaType>emptyList(), null, null, false);
        }

        private TestJavaType(Class<?> raw, int additionalHash,
                             Object valueHandler, Object typeHandler,
                             boolean asStatic, JavaType[] contents,
                             String[] contentNames, JavaType keyType,
                             JavaType contentType, JavaType referencedType,
                             JavaType superClass, List<JavaType> interfaces,
                             Object contentValueHandler,
                             Object contentTypeHandler,
                             boolean containerType) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            this.additionalHash = additionalHash;
            this.contents = contents == null ? new JavaType[0] : contents;
            this.contentNames = contentNames == null ? new String[0] : contentNames;
            this.keyType = keyType;
            this.contentType = contentType;
            this.referencedType = referencedType;
            this.superClass = superClass;
            this.interfaces = interfaces == null
                    ? Collections.<JavaType>emptyList()
                    : interfaces;
            this.contentValueHandler = contentValueHandler;
            this.contentTypeHandler = contentTypeHandler;
            this.containerType = containerType;
        }

        @Override
        public TestJavaType withTypeHandler(Object h) {
            return new TestJavaType(_class, additionalHash, _valueHandler, h,
                    _asStatic, contents, contentNames, keyType, contentType,
                    referencedType, superClass, interfaces,
                    contentValueHandler, contentTypeHandler, containerType);
        }

        @Override
        public TestJavaType withContentTypeHandler(Object h) {
            return new TestJavaType(_class, additionalHash, _valueHandler,
                    _typeHandler, _asStatic, contents, contentNames, keyType,
                    contentType, referencedType, superClass, interfaces,
                    contentValueHandler, h, containerType);
        }

        @Override
        public TestJavaType withValueHandler(Object h) {
            return new TestJavaType(_class, additionalHash, h, _typeHandler,
                    _asStatic, contents, contentNames, keyType, contentType,
                    referencedType, superClass, interfaces,
                    contentValueHandler, contentTypeHandler, containerType);
        }

        @Override
        public TestJavaType withContentValueHandler(Object h) {
            return new TestJavaType(_class, additionalHash, _valueHandler,
                    _typeHandler, _asStatic, contents, contentNames, keyType,
                    contentType, referencedType, superClass, interfaces,
                    h, contentTypeHandler, containerType);
        }

        @Override
        public TestJavaType withContentType(JavaType ct) {
            return new TestJavaType(_class, additionalHash, _valueHandler,
                    _typeHandler, _asStatic, contents, contentNames, keyType,
                    ct, referencedType, superClass, interfaces,
                    contentValueHandler, contentTypeHandler, containerType);
        }

        @Override
        public TestJavaType withStaticTyping() {
            return new TestJavaType(_class, additionalHash, _valueHandler,
                    _typeHandler, true, contents, contentNames, keyType,
                    contentType, referencedType, superClass, interfaces,
                    contentValueHandler, contentTypeHandler, containerType);
        }

        @Override
        public TestJavaType refine(Class<?> rawType, TypeBindings bindings,
                                   JavaType superClass,
                                   JavaType[] superInterfaces) {
            List<JavaType> supers = Collections.emptyList();
            if (superInterfaces != null) {
                supers = Arrays.asList(superInterfaces);
            }
            return new TestJavaType(rawType, 0, _valueHandler, _typeHandler,
                    _asStatic, contents, contentNames, keyType, contentType,
                    referencedType, superClass, supers,
                    contentValueHandler, contentTypeHandler, containerType);
        }

        @Override
        protected TestJavaType _narrow(Class<?> subclass) {
            return new TestJavaType(subclass, additionalHash, null, null,
                    _asStatic, contents, contentNames, keyType, contentType,
                    referencedType, superClass, interfaces,
                    null, null, containerType);
        }

        @Override
        public JavaType findSuperType(Class<?> erasedTarget) {
            return null;
        }

        @Override
        public JavaType getSuperClass() {
            return superClass;
        }

        @Override
        public List<JavaType> getInterfaces() {
            return interfaces;
        }

        @Override
        public JavaType[] findTypeParameters(Class<?> expType) {
            return new JavaType[0];
        }

        @Override
        public boolean isContainerType() {
            return containerType;
        }

        @Override
        public int containedTypeCount() {
            return contents.length;
        }

        @Override
        public JavaType containedType(int index) {
            if (index >= 0 && index < contents.length) {
                return contents[index];
            }
            return null;
        }

        @Override
        public String containedTypeName(int index) {
            if (index >= 0 && index < contentNames.length) {
                return contentNames[index];
            }
            return null;
        }

        @Override
        public JavaType getKeyType() {
            return keyType;
        }

        @Override
        public JavaType getContentType() {
            return contentType;
        }

        @Override
        public JavaType getReferencedType() {
            return referencedType;
        }

        @Override
        public Object getContentValueHandler() {
            return contentValueHandler;
        }

        @Override
        public Object getContentTypeHandler() {
            return contentTypeHandler;
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            return sb.append("G").append(_class.getName());
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            return sb.append("E").append(_class.getName());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof TestJavaType)) {
                return false;
            }
            TestJavaType other = (TestJavaType) o;
            return _class == other._class
                    && _hash == other._hash
                    && additionalHash == other.additionalHash;
        }

        @Override
        public String toString() {
            return "TestJavaType[" + _class.getName() + "]";
        }
    }

    @Test
    public void testRawClassAndBasicFlags() {
        TestJavaType stringType =
                new TestJavaType(String.class, 0, null, null, false);

        assertEquals(String.class, stringType.getRawClass());
        assertTrue(stringType.hasRawClass(String.class));
        assertFalse(stringType.hasRawClass(Integer.class));

        assertFalse(stringType.isAbstract());
        assertTrue(stringType.isConcrete());
        assertFalse(stringType.isInterface());
        assertFalse(stringType.isPrimitive());
        assertFalse(stringType.isArrayType());
        assertFalse(stringType.isEnumType());
        assertFalse(stringType.isThrowable());
    }

    @Test
    public void testTypeHierarchyChecks() {
        TestJavaType list =
                new TestJavaType(ArrayList.class, 0, null, null, false);

        assertTrue(list.isTypeOrSubTypeOf(ArrayList.class));
        assertTrue(list.isTypeOrSubTypeOf(List.class));
        assertTrue(list.isTypeOrSubTypeOf(Collection.class));
        assertTrue(list.isTypeOrSubTypeOf(Object.class));
        assertFalse(list.isTypeOrSubTypeOf(String.class));
    }

    @Test
    public void testInterfaceAndAbstractFlags() {
        TestJavaType list =
                new TestJavaType(List.class, 0, null, null, false);
        assertTrue(list.isInterface());
        assertTrue(list.isAbstract());
        assertFalse(list.isConcrete());

        TestJavaType abstractList =
                new TestJavaType(AbstractList.class, 0, null, null, false);
        assertTrue(abstractList.isAbstract());
        assertFalse(abstractList.isConcrete());

        TestJavaType primitive =
                new TestJavaType(int.class, 0, null, null, false);
        assertTrue(primitive.isPrimitive());
    }

    @Test
    public void testEnumAndThrowable() {
        TestJavaType enumType =
                new TestJavaType(TimeUnit.class, 0, null, null, false);
        assertTrue(enumType.isEnumType());

        TestJavaType exception =
                new TestJavaType(RuntimeException.class, 0, null, null, false);
        assertTrue(exception.isThrowable());
    }

    @Test
    public void testDefaultMethods() {
        TestJavaType stringType =
                new TestJavaType(String.class, 0, null, null, false);

        assertNull(stringType.getKeyType());
        assertNull(stringType.getContentType());
        assertNull(stringType.getReferencedType());
        assertNull(stringType.getParameterSource());
        assertFalse(stringType.isContainerType());
        assertFalse(stringType.isCollectionLikeType());
        assertFalse(stringType.isMapLikeType());
    }

    @Test
    public void testHandlersAndStaticTyping() {
        TestJavaType type =
                new TestJavaType(String.class, 0, "vh", "th", true);

        assertEquals("vh", type.getValueHandler());
        assertEquals("th", type.getTypeHandler());
        assertTrue(type.hasValueHandler());
        assertTrue(type.hasHandlers());
        assertTrue(type.useStaticType());

        TestJavaType noValue =
                new TestJavaType(String.class, 0, null, "th", false);
        assertFalse(noValue.hasValueHandler());
        assertTrue(noValue.hasHandlers());
        assertFalse(noValue.useStaticType());
    }

    @Test
    public void testWithMethods() {
        TestJavaType base =
                new TestJavaType(String.class, 0, null, null, false);

        JavaType withValue = base.withValueHandler("vh");
        assertEquals("vh", withValue.getValueHandler());

        JavaType withType = base.withTypeHandler("th");
        assertEquals("th", withType.getTypeHandler());

        JavaType withContentValue = base.withContentValueHandler("cvh");
        assertEquals("cvh", withContentValue.getContentValueHandler());

        JavaType withContentType = base.withContentTypeHandler("cth");
        assertEquals("cth", withContentType.getContentTypeHandler());

        JavaType withStatic = base.withStaticTyping();
        assertTrue(withStatic.useStaticType());

        TestJavaType integerType =
                new TestJavaType(Integer.class, 0, null, null, false);
        JavaType withContent = base.withContentType(integerType);
        assertEquals(Integer.class, withContent.getContentType().getRawClass());
    }

    @Test
    public void testContainedTypes() {
        TestJavaType stringType =
                new TestJavaType(String.class, 0, null, null, false);
        TestJavaType integerType =
                new TestJavaType(Integer.class, 0, null, null, false);

        TestJavaType list = new TestJavaType(
                List.class, 0, null, null, false,
                new JavaType[] {stringType, integerType},
                new String[] {"K", "V"},
                null, null, null, null,
                Collections.<JavaType>emptyList(),
                null, null, false);

        assertEquals(2, list.containedTypeCount());
        assertSame(stringType, list.containedType(0));
        assertSame(integerType, list.containedType(1));
        assertNull(list.containedType(2));
        assertEquals("K", list.containedTypeName(0));
        assertEquals("V", list.containedTypeName(1));

        assertSame(stringType, list.containedTypeOrUnknown(0));
        assertNotNull(list.containedTypeOrUnknown(2));
    }

    @Test
    public void testForcedNarrowBySameClass() {
        TestJavaType number =
                new TestJavaType(Number.class, 0, null, null, false);

        assertSame(number, number.forcedNarrowBy(Number.class));
    }

    @Test
    public void testForcedNarrowByCopiesHandlers() {
        TestJavaType number =
                new TestJavaType(Number.class, 0, "vh", "th", false);

        JavaType integer = number.forcedNarrowBy(Integer.class);

        assertEquals(Integer.class, integer.getRawClass());
        assertEquals("vh", integer.getValueHandler());
        assertEquals("th", integer.getTypeHandler());
    }

    @Test
    public void testSignatureMethods() {
        TestJavaType stringType =
                new TestJavaType(String.class, 0, null, null, false);

        assertEquals("Gjava.lang.String", stringType.getGenericSignature());
        assertEquals("Ejava.lang.String", stringType.getErasedSignature());
    }
}