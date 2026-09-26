package com.google.javascript.rhino.jstype;

import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import static org.junit.Assert.*;

public class JSTypeRegistryTest {
    private JSTypeRegistry registry;
    private ErrorReporter reporter;

    @Before
    public void setUp() {
        reporter = new ErrorReporter() {
            @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(reporter);
    }

    @Test
    public void testConstructorDefault() {
        assertNotNull(registry);
        assertFalse(registry.shouldTolerateUndefinedValues());
    }

    @Test
    public void testConstructorWithTolerateTrue() {
        JSTypeRegistry reg = new JSTypeRegistry(reporter, true);
        assertTrue(reg.shouldTolerateUndefinedValues());
    }

    @Test
    public void testSetResolveMode() {
        assertEquals(JSTypeRegistry.ResolveMode.LAZY_NAMES, registry.getResolveMode());
        registry.setResolveMode(JSTypeRegistry.ResolveMode.IMMEDIATE);
        assertEquals(JSTypeRegistry.ResolveMode.IMMEDIATE, registry.getResolveMode());
    }

    @Test
    public void testRegisterAndGetProperty() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        registry.registerPropertyOnType("length", objectType);
        Iterable<JSType> types = registry.getTypesWithProperty("length");
        assertNotNull(types);
        boolean found = false;
        for (JSType t : types) {
            if (t.equals(objectType)) found = true;
        }
        assertTrue(found);
    }

    @Test
    public void testGetTypesWithProperty_none() {
        Iterable<JSType> types = registry.getTypesWithProperty("nonExistent");
        assertNotNull(types);
        assertFalse(types.iterator().hasNext());
    }

    @Test
    public void testCanPropertyBeDefined_true() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        registry.registerPropertyOnType("foo", objectType);
        assertTrue(registry.canPropertyBeDefined(objectType, "foo"));
    }

    @Test
    public void testCanPropertyBeDefined_false() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(registry.canPropertyBeDefined(objectType, "bar"));
    }

    @Test
    public void testGetGreatestSubtypeWithProperty_match() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        registry.registerPropertyOnType("prop", objectType);
        registry.registerPropertyOnType("prop", arrayType);
        JSType result = registry.getGreatestSubtypeWithProperty(arrayType, "prop");
        assertNotNull(result);
        assertFalse(result.isEmptyType());
    }

    @Test
    public void testGetGreatestSubtypeWithProperty_noMatch() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType noType = registry.getGreatestSubtypeWithProperty(objectType, "nonexistent");
        assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), noType);
    }

    @Test
    public void testGetEachReferenceTypeWithProperty_present() {
        JSType boolObjType = registry.getNativeType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
        registry.registerPropertyOnType("refProp", boolObjType);
        Iterable<ObjectType> refTypes = registry.getEachReferenceTypeWithProperty("refProp");
        assertNotNull(refTypes);
        boolean found = false;
        for (ObjectType ot : refTypes) {
            if (ot.equals(boolObjType)) found = true;
        }
        assertTrue(found);
    }

    @Test
    public void testGetEachReferenceTypeWithProperty_none() {
        Iterable<ObjectType> refTypes = registry.getEachReferenceTypeWithProperty("noRef");
        assertNotNull(refTypes);
        assertFalse(refTypes.iterator().hasNext());
    }

    @Test
    public void testDeclareType_new() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(registry.declareType("MyString", stringType));
        assertEquals(stringType, registry.getType("MyString"));
    }

    @Test
    public void testDeclareType_existing() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(registry.declareType("MyString", stringType));
        assertFalse(registry.declareType("MyString", stringType));
    }

    @Test(expected = IllegalStateException.class)
    public void testOverwriteDeclaredType_nonExistent() {
        registry.overwriteDeclaredType("notexist", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    }

    @Test
    public void testOverwriteDeclaredType_existing() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        registry.declareType("OverwriteMe", stringType);
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        registry.overwriteDeclaredType("OverwriteMe", numType);
        assertEquals(numType, registry.getType("OverwriteMe"));
    }

    @Test
    public void testForwardDeclareType() {
        assertFalse(registry.isForwardDeclaredType("FutureType"));
        registry.forwardDeclareType("FutureType");
        assertTrue(registry.isForwardDeclaredType("FutureType"));
    }

    @Test
    public void testHasNamespace() {
        assertFalse(registry.hasNamespace("com.example"));
        registry.declareType("com.example.MyType", registry.getNativeType(JSTypeNative.NO_TYPE));
        assertTrue(registry.hasNamespace("com.example"));
    }

    @Test
    public void testHasNamespace_false() {
        assertFalse(registry.hasNamespace("nonexistent.namespace"));
    }

    @Test
    public void testGetType_registered() {
        JSType t = registry.getType("number");
        assertNotNull(t);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), t);
    }

    @Test
    public void testGetType_unregistered() {
        assertNull(registry.getType("NonExistentType12345"));
    }

    @Test
    public void testGetNativeType() {
        assertNotNull(registry.getNativeType(JSTypeNative.ALL_TYPE));
    }

    @Test
    public void testGetNativeObjectType() {
        ObjectType ot = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertNotNull(ot);
    }

    @Test
    public void testGetNativeFunctionType() {
        FunctionType ft = registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        assertNotNull(ft);
    }

    @Test
    public void testCreateOptionalType_known() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType optional = registry.createOptionalType(stringType);
        assertTrue(optional.isUnionType());
    }

    @Test
    public void testCreateOptionalType_unknown() {
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertSame(unknown, registry.createOptionalType(unknown));
    }

    @Test
    public void testCreateOptionalType_all() {
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        assertSame(all, registry.createOptionalType(all));
    }

    @Test
    public void testCreateNullableType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType nullable = registry.createNullableType(stringType);
        assertTrue(nullable.isUnionType());
        assertTrue(nullable.isNullable());
    }

    @Test
    public void testCreateDefaultObjectUnion_notTolerate() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType defaultUnion = registry.createDefaultObjectUnion(stringType);
        assertTrue(defaultUnion.isUnionType());
        assertTrue(defaultUnion.isNullable());
    }

    @Test
    public void testCreateDefaultObjectUnion_tolerate() {
        JSTypeRegistry regTol = new JSTypeRegistry(reporter, true);
        JSType stringType = regTol.getNativeType(JSTypeNative.STRING_TYPE);
        JSType defaultUnion = regTol.createDefaultObjectUnion(stringType);
        assertTrue(defaultUnion.isUnionType());
    }

    @Test
    public void testCreateUnionType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType union = registry.createUnionType(stringType, numberType);
        assertTrue(union.isUnionType());
    }

    @Test
    public void testCreateUnionType_singleType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType union = registry.createUnionType(stringType);
        assertSame(stringType, union);
    }

    @Test
    public void testCreateFunctionType_withParams() {
        JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType paramType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType ft = registry.createFunctionType(returnType, paramType);
        assertNotNull(ft);
    }

    @Test
    public void testFindCommonSuperObject() {
        ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
        ObjectType common = registry.findCommonSuperObject(objectType, arrayType);
        assertNotNull(common);
        assertEquals(objectType, common);
    }

    @Test
    public void testFindCommonSuperObject_sameType() {
        ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ObjectType common = registry.findCommonSuperObject(objectType, objectType);
        assertEquals(objectType, common);
    }

    @Test
    public void testLastGeneration() {
        assertTrue(registry.isLastGeneration());
        registry.setLastGeneration(false);
        assertFalse(registry.isLastGeneration());
    }

    @Test
    public void testClearNamedTypes() {
        registry.createNamedType("TestType", "test.js", 1, 0);
        registry.clearNamedTypes();
        registry.incrementGeneration();
    }

    @Test
    public void testRegisterTypeImplementingInterface() {
        FunctionType func = registry.createFunctionType(registry.getNativeType(JSTypeNative.NO_TYPE));
        ObjectType errorType = registry.getNativeObjectType(JSTypeNative.ERROR_TYPE);
        registry.registerTypeImplementingInterface(func, errorType);
        Collection<FunctionType> implementors = registry.getDirectImplementors(errorType);
        assertTrue(implementors.contains(func));
    }

    @Test
    public void testIdentifyNonNullableName() {
        registry.identifyNonNullableName("NonNull");
    }

    @Test
    public void testTemplateType() {
        registry.setTemplateTypeName("T");
        JSType t = registry.getType("T");
        assertNotNull(t);
        registry.clearTemplateTypeName();
        assertNull(registry.getType("T"));
    }

    @Test
    public void testResetForTypeCheck() {
        registry.resetForTypeCheck();
        assertNotNull(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterPropertyOnType_nullProperty() {
        registry.registerPropertyOnType(null, registry.getNativeType(JSTypeNative.STRING_TYPE));
    }
}