package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticSlot;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ObjectTypeTest {

    private JSTypeRegistry registry;
    private TestObjectType objType;

    @Before
    public void setUp() {
        ErrorReporter reporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, String lineSource) {}
            @Override
            public void error(String message, String sourceName, int line, String lineSource) {}
        };
        registry = new JSTypeRegistry(reporter);
        objType = new TestObjectType(registry);
    }

    private static class TestObjectType extends ObjectType {
        private String referenceName;
        private ObjectType implicitPrototype;
        private final Map<String, Property> properties = new HashMap<>();

        TestObjectType(JSTypeRegistry registry) {
            super(registry);
        }

        void setReferenceName(String name) { this.referenceName = name; }
        void setImplicitPrototype(ObjectType proto) { this.implicitPrototype = proto; }

        @Override
        public Property getSlot(String name) {
            return properties.get(name);
        }

        @Override
        public JSType getPropertyType(String propertyName) {
            Property p = properties.get(propertyName);
            return p != null ? p.getType() : registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        }

        @Override
        public boolean hasProperty(String propertyName) {
            return properties.containsKey(propertyName);
        }

        @Override
        public boolean isPropertyTypeInferred(String propertyName) {
            Property p = properties.get(propertyName);
            return p != null && p.isTypeInferred();
        }

        @Override
        public boolean isPropertyTypeDeclared(String propertyName) {
            Property p = properties.get(propertyName);
            return p != null && !p.isTypeInferred();
        }

        @Override
        public int getPropertiesCount() {
            return properties.size();
        }

        @Override
        void collectPropertyNames(Set<String> props) {
            props.addAll(properties.keySet());
        }

        @Override
        public String getReferenceName() {
            return referenceName;
        }

        @Override
        public FunctionType getConstructor() {
            return null;
        }

        @Override
        public ObjectType getImplicitPrototype() {
            return implicitPrototype;
        }

        @Override
        boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) {
            if (properties.containsKey(propertyName)) {
                return false;
            }
            Property p = new Property(propertyName, type, inferred, propertyNode);
            properties.put(propertyName, p);
            return true;
        }
    }

    @Test
    public void testJSDocInfo_withDocInfo() {
        JSDocInfo info = new JSDocInfo();
        objType.setJSDocInfo(info);
        assertSame(info, objType.getJSDocInfo());
    }

    @Test
    public void testJSDocInfo_fromPrototype() {
        JSDocInfo info = new JSDocInfo();
        TestObjectType proto = new TestObjectType(registry);
        proto.setJSDocInfo(info);
        objType.setImplicitPrototype(proto);
        assertSame(info, objType.getJSDocInfo());
    }

    @Test
    public void testJSDocInfo_fallbackToSuper() {
        assertNull(objType.getJSDocInfo());
    }

    @Test
    public void testDetectImplicitPrototypeCycle() {
        TestObjectType a = new TestObjectType(registry);
        TestObjectType b = new TestObjectType(registry);
        a.setImplicitPrototype(b);
        b.setImplicitPrototype(a);
        assertTrue(a.detectImplicitPrototypeCycle());
        assertFalse(a.visited);
        assertFalse(b.visited);
    }

    @Test
    public void testDetectImplicitPrototypeNoCycle() {
        TestObjectType a = new TestObjectType(registry);
        TestObjectType b = new TestObjectType(registry);
        a.setImplicitPrototype(b);
        b.setImplicitPrototype(null);
        assertFalse(a.detectImplicitPrototypeCycle());
        assertFalse(a.visited);
        assertFalse(b.visited);
    }

    @Test
    public void testNormalizedReferenceName() {
        objType.setReferenceName(null);
        assertNull(objType.getNormalizedReferenceName());

        objType.setReferenceName("foo");
        assertEquals("foo", objType.getNormalizedReferenceName());

        objType.setReferenceName("foo(bar)");
        assertEquals("foo", objType.getNormalizedReferenceName());
    }

    @Test
    public void testTestForEquality() {
        JSType obj = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertEquals(UNKNOWN, objType.testForEquality(obj));

        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        assertEquals(FALSE, objType.testForEquality(nullType));
    }

    @Test
    public void testDefineDeclaredProperty() {
        Node node = new Node(1);
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(objType.defineDeclaredProperty("x", numType, node));
        assertTrue(objType.hasProperty("x"));
        assertEquals(numType, objType.getPropertyType("x"));
        assertFalse(objType.isPropertyTypeInferred("x"));

        // Redefinition with declared should fail
        assertFalse(objType.defineDeclaredProperty("x", numType, node));
    }

    @Test
    public void testDefineInferredProperty() {
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        objType.defineInferredProperty("y", numType, null);
        assertEquals(numType, objType.getPropertyType("y"));
        assertTrue(objType.isPropertyTypeInferred("y"));

        objType.defineInferredProperty("y", strType, null);
        assertNotNull(objType.getPropertyType("y"));
    }

    @Test
    public void testIsUnknownType() {
        assertTrue(objType.isUnknownType());
        ObjectType proto = registry.getNativeType(JSTypeNative.OBJECT_TYPE).toObjectType();
        objType.setImplicitPrototype(proto);
        assertFalse(objType.isUnknownType());
    }

    @Test
    public void testIsImplicitPrototype() {
        TestObjectType proto = new TestObjectType(registry);
        objType.setImplicitPrototype(proto);
        assertTrue(objType.isImplicitPrototype(proto));
        assertFalse(objType.isImplicitPrototype(objType));
        assertFalse(objType.isImplicitPrototype(new TestObjectType(registry)));
    }

    @Test
    public void testHasOwnProperty() {
        assertFalse(objType.hasOwnProperty("nonexistent"));
        objType.defineDeclaredProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        assertTrue(objType.hasOwnProperty("p"));
    }

    @Test
    public void testGetPropertyNames() {
        objType.defineDeclaredProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        objType.defineInferredProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        Set<String> names = objType.getPropertyNames();
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
        assertEquals(2, names.size());
    }

    @Test
    public void testRemoveProperty() {
        assertFalse(objType.removeProperty("anything"));
    }

    @Test
    public void testCast() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        ObjectType casted = ObjectType.cast(type);
        assertNotNull(casted);
        assertSame(type, casted);

        assertNull(ObjectType.cast(null));
    }

    @Test
    public void testHasCachedValuesAndClear() {
        assertFalse(objType.hasCachedValues());
        objType.defineDeclaredProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        assertTrue(objType.hasCachedValues());
        objType.clearCachedValues();
        assertFalse(objType.hasCachedValues());
    }

    @Test
    public void testIsFunctionPrototypeType() {
        assertFalse(objType.isFunctionPrototypeType());
        // getOwnerFunction returns null by default
    }

    @Test
    public void testPropertyInnerClass() {
        Node node = new Node(1);
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType.Property prop = new ObjectType.Property("p", numType, false, node);
        assertEquals("p", prop.getName());
        assertSame(node, prop.getNode());
        assertSame(numType, prop.getType());
        assertFalse(prop.isTypeInferred());
        assertFalse(prop.isFromExterns());
        assertNull(prop.getDeclaration());
        assertNotNull(prop.getSymbol());
        assertSame(prop, prop.getSymbol());

        // Test null propertyNode
        ObjectType.Property prop2 = new ObjectType.Property("q", null, true, null);
        assertNull(prop2.getNode());
        assertNull(prop2.getDeclaration());
        assertNull(prop2.getSourceFile());
        assertTrue(prop2.isTypeInferred());

        // Test setType and JSDocInfo
        JSDocInfo info = new JSDocInfo();
        prop2.setJSDocInfo(info);
        assertSame(info, prop2.getJSDocInfo());
        prop2.setType(numType);
        assertSame(numType, prop2.getType());

        // Test setNode
        prop2.setNode(node);
        assertSame(node, prop2.getNode());
    }

    @Test
    public void testGetOwnPropertyJSDocInfo() {
        assertNull(objType.getOwnPropertyJSDocInfo("any"));
    }

    @Test
    public void testFindPropertyType() {
        assertNull(objType.findPropertyType("nonexistent"));
        objType.defineDeclaredProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        assertNotNull(objType.findPropertyType("x"));
    }
}