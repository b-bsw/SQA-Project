package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReferenceTypeTest {
    
    private static class MockJavaType extends SimpleType {
        private static final long serialVersionUID = 1L;
        private final String canonical;
        
        public MockJavaType(Class<?> raw, String canonical, Object typeHandler, Object valueHandler) {
            super(raw, raw.hashCode(), valueHandler, typeHandler, false);
            this.canonical = canonical;
        }
        
        @Override
        public String toCanonical() {
            return canonical;
        }
        
        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            sb.append('L').append(_class.getName()).append('<').append(canonical).append('>');
            return sb;
        }
        
        @Override
        public JavaType withTypeHandler(Object h) {
            if (h == _typeHandler) return this;
            return new MockJavaType(_class, canonical, h, _valueHandler);
        }
        
        @Override
        public JavaType withValueHandler(Object h) {
            if (h == _valueHandler) return this;
            return new MockJavaType(_class, canonical, _typeHandler, h);
        }
        
        @Override
        public JavaType withStaticTyping() {
            return this;
        }
        
        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MockJavaType other = (MockJavaType) o;
            return (canonical == null ? other.canonical == null : canonical.equals(other.canonical))
                && (_typeHandler == null ? other._typeHandler == null : _typeHandler.equals(other._typeHandler))
                && (_valueHandler == null ? other._valueHandler == null : _valueHandler.equals(other._valueHandler));
        }
        
        @Override
        public int hashCode() {
            return _class.hashCode();
        }
        
        @Override
        public String toString() {
            return canonical;
        }
    }
    
    private ReferenceType createRefType(Class<?> cls, JavaType refType) {
        return ReferenceType.construct(cls, refType, null, null);
    }
    
    private MockJavaType mockType(String canonical, Object typeHandler, Object valueHandler) {
        return new MockJavaType(String.class, canonical, typeHandler, valueHandler);
    }
    
    @Test
    public void testConstructNormal() {
        MockJavaType ref = mockType("java.lang.String", null, null);
        ReferenceType rt = createRefType(String.class, ref);
        assertNotNull(rt);
        assertEquals(String.class, rt._class);
        assertSame(ref, rt.getReferencedType());
        assertTrue(rt.isReferenceType());
        assertEquals(1, rt.containedTypeCount());
        assertSame(ref, rt.containedType(0));
        assertNull(rt.containedType(1));
        assertEquals("T", rt.containedTypeName(0));
        assertNull(rt.containedTypeName(1));
        assertEquals(String.class, rt.getParameterSource());
    }
    
    @Test(expected = NullPointerException.class)
    public void testConstructWithNullRefType() {
        ReferenceType.construct(String.class, null, null, null);
    }
    
    @Test
    public void testWithTypeHandler() {
        MockJavaType ref = mockType("A", null, null);
        ReferenceType rt = createRefType(String.class, ref);
        assertSame(rt, rt.withTypeHandler(null));  // same null handler -> this
        Object h = new Object();
        ReferenceType rt2 = rt.withTypeHandler(h);
        assertNotSame(rt, rt2);
        assertEquals(h, rt2._typeHandler);
        assertSame(rt2, rt2.withTypeHandler(h));  // same handler -> this
    }
    
    @Test
    public void testWithValueHandler() {
        MockJavaType ref = mockType("A", null, null);
        ReferenceType rt = createRefType(String.class, ref);
        assertSame(rt, rt.withValueHandler(null));
        Object vh = new Object();
        ReferenceType rt2 = rt.withValueHandler(vh);
        assertNotSame(rt, rt2);
        assertEquals(vh, rt2._valueHandler);
        assertSame(rt2, rt2.withValueHandler(vh));
    }
    
    @Test
    public void testWithContentTypeHandler() {
        Object th = new Object();
        MockJavaType ref = mockType("A", th, null);
        ReferenceType rt = createRefType(String.class, ref);
        // same handler
        assertSame(rt, rt.withContentTypeHandler(th));
        // different handler
        Object th2 = new Object();
        ReferenceType rt2 = rt.withContentTypeHandler(th2);
        assertNotSame(rt, rt2);
        assertEquals(th2, rt2._referencedType.getTypeHandler());
    }
    
    @Test
    public void testWithContentValueHandler() {
        Object vh = new Object();
        MockJavaType ref = mockType("A", null, vh);
        ReferenceType rt = createRefType(String.class, ref);
        assertSame(rt, rt.withContentValueHandler(vh));
        Object vh2 = new Object();
        ReferenceType rt2 = rt.withContentValueHandler(vh2);
        assertNotSame(rt, rt2);
        assertEquals(vh2, rt2._referencedType.getValueHandler());
    }
    
    @Test
    public void testWithStaticTyping() {
        MockJavaType ref = mockType("A", null, null);
        ReferenceType rt = createRefType(String.class, ref);
        assertFalse(rt._asStatic);
        ReferenceType rt2 = rt.withStaticTyping();
        assertNotSame(rt, rt2);
        assertTrue(rt2._asStatic);
        assertSame(rt2, rt2.withStaticTyping());
    }
    
    @Test
    public void testToStringAndBuildCanonicalName() {
        MockJavaType ref = mockType("B", null, null);
        ReferenceType rt = createRefType(Integer.class, ref);
        String expected = "[reference type, class java.lang.Integer<B<B>]";
        assertEquals(expected, rt.toString());
    }
    
    @Test
    public void testEquals() {
        MockJavaType refA = mockType("A", null, null);
        MockJavaType refA2 = mockType("A", null, null);
        MockJavaType refB = mockType("B", null, null);
        ReferenceType rt1 = createRefType(String.class, refA);
        ReferenceType rt1Copy = createRefType(String.class, refA2);
        ReferenceType rt2 = createRefType(String.class, refB);
        ReferenceType rt3 = createRefType(Integer.class, refA);
        assertTrue(rt1.equals(rt1));
        assertTrue(rt1.equals(rt1Copy));
        assertFalse(rt1.equals(null));
        assertFalse(rt1.equals(new Object()));
        assertFalse(rt1.equals(rt2));
        assertFalse(rt1.equals(rt3));
    }
    
    @Test
    public void testGetErasedSignature() {
        MockJavaType ref = mockType("A", null, null);
        ReferenceType rt = createRefType(String.class, ref);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = rt.getErasedSignature(sb);
        assertSame(sb, result);
        assertTrue(result.length() > 0);
    }
    
    @Test
    public void testGetGenericSignature() {
        MockJavaType ref = mockType("A", null, null);
        ReferenceType rt = createRefType(String.class, ref);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = rt.getGenericSignature(sb);
        assertSame(sb, result);
        assertTrue(result.toString().contains("Ljava/lang/String;"));
        assertTrue(result.toString().contains("A"));
    }
}