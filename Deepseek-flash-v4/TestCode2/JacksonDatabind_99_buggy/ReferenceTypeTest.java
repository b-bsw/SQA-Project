package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.util.List;

public class ReferenceTypeTest {

    private static class MockJavaType extends JavaType {
        private static final long serialVersionUID = 1L;
        private final String typeName;
        private final int hashCodeValue;

        MockJavaType(Class<?> rawType, String typeName, int hashCodeValue) {
            super(rawType, TypeBindings.emptyBindings(), null, null, 0, null, null, false);
            this.typeName = typeName;
            this.hashCodeValue = hashCodeValue;
        }

        @Override
        public JavaType withTypeHandler(Object h) { return this; }
        @Override
        public JavaType withContentTypeHandler(Object h) { return this; }
        @Override
        public JavaType withValueHandler(Object h) { return this; }
        @Override
        public JavaType withContentValueHandler(Object h) { return this; }
        @Override
        public JavaType withStaticTyping() { return this; }
        @Override
        public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) { return this; }
        @Override
        protected String buildCanonicalName() { return typeName; }
        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) { return sb.append(typeName); }
        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) { return sb.append(typeName); }
        @Override
        public boolean isContainerType() { return false; }
        @Override
        public JavaType getContentType() { return null; }
        @Override
        public int containedTypeCount() { return 0; }
        @Override
        public JavaType containedType(int index) { return null; }
        @Override
        public String containedTypeName(int index) { return null; }
        @Override
        public boolean equals(Object o) { return o instanceof MockJavaType && ((MockJavaType)o).typeName.equals(typeName); }
        @Override
        public int hashCode() { return hashCodeValue; }
        @Override
        public String toString() { return typeName; }
    }

    private MockJavaType baseType;
    private MockJavaType refType;
    private MockJavaType otherRefType;
    private TypeBindings bindings;
    private JavaType superClass;
    private JavaType[] superInts;

    @Before
    public void setUp() {
        baseType = new MockJavaType(String.class, "String", 42);
        refType = new MockJavaType(Integer.class, "Integer", 100);
        otherRefType = new MockJavaType(Double.class, "Double", 200);
        bindings = TypeBindings.emptyBindings();
        superClass = null;
        superInts = new JavaType[0];
    }

    @Test
    public void testUpgradeFromNormalCase() {
        ReferenceType result = ReferenceType.upgradeFrom(baseType, refType);
        assertNotNull(result);
        assertTrue(result.isReferenceType());
        assertEquals(refType, result.getContentType());
        assertEquals(refType, result.getReferencedType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFromNullRefdType() {
        ReferenceType.upgradeFrom(baseType, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFromNonTypeBase() {
        JavaType nonTypeBase = new MockJavaType(Object.class, "Object", 0) {
            private static final long serialVersionUID = 1L;
            // simulate non-TypeBase by not extending TypeBase
        };
        ReferenceType.upgradeFrom(nonTypeBase, refType);
    }

    @Test
    public void testConstructWithBindings() {
        ReferenceType result = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        assertNotNull(result);
        assertEquals(refType, result.getContentType());
        assertTrue(result.hasContentType());
        assertTrue(result.isReferenceType());
    }

    @Test
    public void testConstructDeprecated() {
        ReferenceType result = ReferenceType.construct(String.class, refType);
        assertNotNull(result);
        assertEquals(refType, result.getContentType());
    }

    @Test
    public void testWithContentTypeSame() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        assertSame(ref, ref.withContentType(refType));
    }

    @Test
    public void testWithContentTypeDifferent() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType changed = ref.withContentType(otherRefType);
        assertNotSame(ref, changed);
        assertEquals(otherRefType, changed.getContentType());
    }

    @Test
    public void testWithTypeHandlerSame() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        Object handler = new Object();
        ref = ref.withTypeHandler(handler);
        assertSame(ref, ref.withTypeHandler(handler));
    }

    @Test
    public void testWithTypeHandlerDifferent() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType changed = ref.withTypeHandler(new Object());
        assertNotSame(ref, changed);
    }

    @Test
    public void testWithContentTypeHandlerSame() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        Object h = refType.getTypeHandler();
        assertSame(ref, ref.withContentTypeHandler(h));
    }

    @Test
    public void testWithContentTypeHandlerDifferent() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType changed = ref.withContentTypeHandler(new Object());
        assertNotNull(changed);
    }

    @Test
    public void testWithValueHandlerSame() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        Object h = new Object();
        ref = ref.withValueHandler(h);
        assertSame(ref, ref.withValueHandler(h));
    }

    @Test
    public void testWithValueHandlerDifferent() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType changed = ref.withValueHandler(new Object());
        assertNotSame(ref, changed);
    }

    @Test
    public void testWithContentValueHandlerSame() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        Object h = refType.getValueHandler();
        assertSame(ref, ref.withContentValueHandler(h));
    }

    @Test
    public void testWithContentValueHandlerDifferent() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        Object h = new Object();
        ReferenceType changed = ref.withContentValueHandler(h);
        assertNotNull(changed);
    }

    @Test
    public void testWithStaticTypingAlreadyStatic() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType staticTyped = ref.withStaticTyping();
        assertSame(staticTyped, staticTyped.withStaticTyping());
    }

    @Test
    public void testWithStaticTypingNotStatic() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType staticTyped = ref.withStaticTyping();
        assertNotSame(ref, staticTyped);
    }

    @Test
    public void testRefine() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        JavaType refined = ref.refine(Integer.class, bindings, superClass, superInts);
        assertTrue(refined instanceof ReferenceType);
        assertEquals(refType, refined.getContentType());
    }

    @Test
    public void testGetAnchorTypeDefault() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        assertEquals(ref, ref.getAnchorType());
        assertTrue(ref.isAnchorType());
    }

    @Test
    public void testGetAnchorTypeFromUpgrade() {
        ReferenceType ref = ReferenceType.upgradeFrom(baseType, refType);
        assertEquals(ref, ref.getAnchorType());
        assertTrue(ref.isAnchorType());
    }

    @Test
    public void testEqualsSameObject() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        assertTrue(ref.equals(ref));
    }

    @Test
    public void testEqualsNull() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        assertFalse(ref.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        assertFalse(ref.equals("string"));
    }

    @Test
    public void testEqualsDifferentClassType() {
        ReferenceType ref1 = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType ref2 = ReferenceType.construct(Integer.class, bindings, superClass, superInts, refType);
        assertFalse(ref1.equals(ref2));
    }

    @Test
    public void testEqualsDifferentReferencedType() {
        ReferenceType ref1 = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType ref2 = ReferenceType.construct(String.class, bindings, superClass, superInts, otherRefType);
        assertFalse(ref1.equals(ref2));
    }

    @Test
    public void testEqualsSameValues() {
        ReferenceType ref1 = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        ReferenceType ref2 = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        assertTrue(ref1.equals(ref2));
    }

    @Test
    public void testGetErasedSignature() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        StringBuilder sb = new StringBuilder();
        assertNotNull(ref.getErasedSignature(sb));
    }

    @Test
    public void testGetGenericSignature() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = ref.getGenericSignature(sb);
        assertTrue(result.indexOf("<") > 0);
        assertTrue(result.indexOf(">;") > 0);
    }

    @Test
    public void testToString() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        String str = ref.toString();
        assertTrue(str.startsWith("[reference type"));
        assertTrue(str.contains(refType.toString()));
    }

    @Test
    public void testBuildCanonicalName() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        String name = ref.buildCanonicalName();
        assertTrue(name.contains(String.class.getName()));
        assertTrue(name.contains("<"));
    }

    @Test
    public void testNarrowDeprecated() {
        ReferenceType ref = ReferenceType.construct(String.class, bindings, superClass, superInts, refType);
        JavaType narrowed = ref._narrow(Integer.class);
        assertTrue(narrowed instanceof ReferenceType);
    }
}