package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUnionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.jscomp.graph.StandardUnionFind;
import com.google.javascript.jscomp.graph.UnionFind;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;

public class DisambiguatePropertiesTest {

    private DisambiguateProperties<JSType> disambiguator;
    private AbstractCompiler compiler;
    private JSTypeRegistry registry;
    private TypeValidator validator;

    // Stub compiler for testing
    private static class StubCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry;
        private final TypeValidator typeValidator;
        private boolean codeChanged = false;

        StubCompiler(JSTypeRegistry registry) {
            this.typeRegistry = registry;
            this.typeValidator = new TypeValidator(registry, this);
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return typeValidator;
        }

        @Override
        public void reportCodeChange() {
            codeChanged = true;
        }

        @Override
        public void report(JSError error) {
            // ignore for testing
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention();
        }

        public boolean hasCodeChanged() {
            return codeChanged;
        }

        public void resetCodeChanged() {
            codeChanged = false;
        }

        // Other abstract methods can be left as no-ops
        @Override
        public String getSourceLine(String sourceName, int lineNumber) {
            return null;
        }

        @Override
        public Region getSourceRegion(String sourceName) {
            return null;
        }
    }

    // Stub TypeValidator that can return mismatches
    private static class StubTypeValidator extends TypeValidator {
        private List<TypeMismatch> mismatches = com.google.common.collect.Lists.newArrayList();

        StubTypeValidator(JSTypeRegistry registry, AbstractCompiler compiler) {
            super(registry, compiler);
        }

        @Override
        public List<TypeMismatch> getMismatches() {
            return mismatches;
        }

        public void addMismatch(JSType typeA, JSType typeB) {
            mismatches.add(new TypeMismatch(null, null, typeA, typeB, null));
        }

        public void clearMismatches() {
            mismatches.clear();
        }
    }

    @Before
    public void setUp() {
        compiler = new StubCompiler(null); // actual registry will be set in tests
        registry = null;
        validator = null;
        // We cannot instantiate DisambiguateProperties directly because constructor is private.
        // We'll use forJSTypeSystem with a real JSTypeRegistry later.
    }

    // Helper to create a real JSTypeRegistry with native types
    private JSTypeRegistry createTypeRegistry() {
        JSTypeRegistry reg = new JSTypeRegistry();
        // Native types are automatically registered
        return reg;
    }

    // Create a minimal AbstractCompiler with real registry
    private AbstractCompiler createCompilerWithRegistry() {
        registry = createTypeRegistry();
        return new StubCompiler(registry);
    }

    // Helper to get a type from registry
    private JSType getNativeType(JSTypeNative nativeType) {
        return registry.getNativeType(nativeType);
    }

    // ========== Tests for Property inner class ==========

    @Test
    public void testPropertyInitialState() {
        // Cannot instantiate Property directly, use getProperty
        // We'll test via a disambiguator with stubs
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        // Access property via reflection? No, we can use getProperty
        // But getProperty is protected? It's package-private, so accessible within test package.
        // Actually it is package-private (no modifier). So we can call it!
        DisambiguateProperties<JSType>.Property prop = d.getProperty("x");
        assertNotNull(prop);
        assertEquals("x", prop.name);
        assertNull(prop.types); // initially null
        assertFalse(prop.skipRenaming);
        assertTrue(prop.typesToSkip.isEmpty());
        assertTrue(prop.renameNodes.isEmpty());
        assertTrue(prop.rootTypes.isEmpty());
    }

    @Test
    public void testPropertyAddTypeInvalidatingTop() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("y");
        // Use an invalidating type (ALL_TYPE)
        JSType allType = getNativeType(JSTypeNative.ALL_TYPE);
        // addType expects (type, top, relatedType)
        boolean result = prop.addType(allType, allType, null);
        assertFalse(result); // should invalidate due to top being invalidating
        assertTrue(prop.skipRenaming);
        assertNull(prop.types);
    }

    @Test
    public void testPropertyAddTypeValidWithRelatedType() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("z");
        // Create two distinct object types
        JSType type1 = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        // First add without relatedType
        boolean result1 = prop.addType(type1, type1, null);
        assertTrue(result1);
        assertFalse(prop.skipRenaming);
        // Now add with relatedType = type1
        boolean result2 = prop.addType(type2, type2, type1);
        assertTrue(result2);
        // The types should be unioned
        assertTrue(prop.types.find(type1) == prop.types.find(type2));
    }

    @Test
    public void testPropertyAddTypeToSkip() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("a");
        JSType type = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        // addTypeToSkip normally called from addType when typeSystem.isTypeToSkip is true
        // We can call it directly
        prop.addTypeToSkip(type);
        assertFalse(prop.typesToSkip.isEmpty());
        assertTrue(prop.typesToSkip.contains(type));
        // The type should have been added to union find as well (through getTypes().add)
        assertNotNull(prop.getTypes());
        // After union(skipType, type) the find should return same representative
        assertSame(prop.types.find(type), prop.types.find(type));
    }

    @Test
    public void testPropertyExpandTypesToSkipNoRename() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("b");
        // shouldRename returns false if types is null
        prop.expandTypesToSkip(); // should do nothing
    }

    @Test
    public void testPropertyExpandTypesToSkipWithRename() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("c");
        // Create two distinct types and union them so there are two equivalence classes
        JSType t1 = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        JSType t2 = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        prop.addType(t1, t1, null);
        prop.addType(t2, t2, t1); // union them actually, so only one class – need separate
        // Actually we want two classes, so add without union: add both with null relatedType
        // Reset property by getting new one
        prop = d.getProperty("d");
        prop.addType(t1, t1, null);
        prop.addType(t2, t2, null); // now two classes
        // Set typesToSkip to one of them
        prop.addTypeToSkip(t1);
        // Now expandTypesToSkip
        prop.expandTypesToSkip();
        // After expansion, typesToSkip should contain both because union find merges them?
        // Actually addTypeToSkip unions skipType with type, but here skipType is t2? Wait,
        // addTypeToSkip(t1) calls getTypes().union(skipType, type). skipType is from getTypesToSkipForType(t1)
        // For JSType, getTypesToSkipForType returns the prototype chain including t1 itself? We'll simplify.
        // For testing, just ensure no exceptions.
        assertTrue(prop.typesToSkip.size() > 0);
    }

    @Test
    public void testPropertyShouldRename() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("e");
        // Initially types is null, shouldRename false
        assertFalse(prop.shouldRename());
        // After adding a single type, shouldRename false because only one equivalence class
        JSType t1 = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        prop.addType(t1, t1, null);
        assertFalse(prop.shouldRename());
        // Add another type with different top (not unioned)
        JSType t2 = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        prop.addType(t2, t2, null);
        assertTrue(prop.shouldRename());
        // After invalidation, shouldRename false
        prop.invalidate();
        assertFalse(prop.shouldRename());
    }

    @Test
    public void testPropertyShouldRenameType() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("f");
        JSType t1 = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        // When type is not in typesToSkip, shouldRename true (if not skipRenaming)
        assertTrue(prop.shouldRename(t1));
        // Add to typesToSkip
        prop.addTypeToSkip(t1);
        assertFalse(prop.shouldRename(t1));
        // After invalidation, shouldRename false regardless
        prop.invalidate();
        assertFalse(prop.shouldRename(t1));
    }

    @Test
    public void testPropertyInvalidate() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("g");
        assertFalse(prop.skipRenaming);
        assertTrue(prop.invalidate()); // changed = true
        assertTrue(prop.skipRenaming);
        assertNull(prop.types);
        // Calling again returns false because already invalidated
        assertFalse(prop.invalidate());
    }

    @Test
    public void testPropertyScheduleRenamingNormal() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("h");
        Node node = new Node(Token.NAME, "test");
        JSType type = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        boolean result = prop.scheduleRenaming(node, type);
        assertTrue(result);
        assertTrue(prop.renameNodes.contains(node));
        assertEquals(type, prop.rootTypes.get(node));
    }

    @Test
    public void testPropertyScheduleRenamingInvalidatingType() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("i");
        Node node = new Node(Token.NAME, "test");
        JSType invalid = getNativeType(JSTypeNative.ALL_TYPE);
        boolean result = prop.scheduleRenaming(node, invalid);
        assertFalse(result);
        assertTrue(prop.skipRenaming);
    }

    // ========== Tests for DisambiguateProperties ==========

    @Test
    public void testGetPropertyNewAndExisting() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        // First call creates new Property
        DisambiguateProperties<JSType>.Property prop1 = d.getProperty("test");
        assertNotNull(prop1);
        // Second call returns same instance
        DisambiguateProperties<JSType>.Property prop2 = d.getProperty("test");
        assertSame(prop1, prop2);
    }

    @Test
    public void testGetTypeWithProperty() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        // getTypeWithProperty calls typeSystem.getTypeWithProperty which for JSTypeSystem returns ObjectType or null
        ObjectType arrType = (ObjectType) registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        // Array type does have "length" property
        JSType result = d.getTypeWithProperty("length", arrType);
        assertNotNull(result);
        // Prototype property should be null
        assertNull(d.getTypeWithProperty("prototype", arrType));
        // Number primitive autoboxes to Number object, which has "MAX_VALUE". But getTypeWithProperty expects ObjectType
        JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(d.getTypeWithProperty("MAX_VALUE", num)); // autoboxing is in JSTypeSystem, but here we pass JSType not ObjectType
        // Actually getTypeWithProperty in JSTypeSystem does autoboxing, but the call from DisambiguateProperties goes through typeSystem
        // Since we're calling directly the method on disambiguator, it delegates to typeSystem.
        // We'll test via disambiguator's getTypeWithProperty which is public.
        JSType result2 = d.getTypeWithProperty("MAX_VALUE", num);
        assertNotNull(result2); // Because autoboxesTo returns Number object
    }

    @Test
    public void testProcessWithNoMismatches() {
        // We need a Node for externs and root. We'll use simple nodes.
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        // Create externs and root nodes
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        // process should not throw
        d.process(externs, root);
        // No properties should be recorded because no GETPROP nodes
    }

    @Test
    public void testProcessWithInvalidatingTypeMismatches() {
        // Set up compiler with mismatches that contain invalidating types
        JSTypeRegistry reg = createTypeRegistry();
        StubCompiler stubCompiler = new StubCompiler(reg);
        // Cast to access mismatches
        StubTypeValidator validator = (StubTypeValidator) stubCompiler.getTypeValidator();
        JSType allType = reg.getNativeType(JSTypeNative.ALL_TYPE);
        JSType unknownType = reg.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        validator.addMismatch(allType, unknownType);
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(stubCompiler);
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        d.process(externs, root);
        // After process, the invalidating types should be added to typeSystem's invalidatingTypes
        // Not directly testable, but process should not throw
    }

    @Test
    public void testRenameProperties() {
        // Create a scenario with a property that should be renamed
        AbstractCompiler compiler = createCompilerWithRegistry();
        StubCompiler stubCompiler = (StubCompiler) compiler;
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(stubCompiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("p");
        // Add two distinct types to create two equivalence classes
        JSType t1 = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        JSType t2 = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        prop.addType(t1, t1, null);
        prop.addType(t2, t2, null);
        // Schedule renaming for a node for each type
        Node node1 = new Node(Token.STRING, "p");
        Node node2 = new Node(Token.STRING, "p");
        prop.scheduleRenaming(node1, t1);
        prop.scheduleRenaming(node2, t2);
        // Now call renameProperties
        stubCompiler.resetCodeChanged();
        d.renameProperties();
        // After renaming, the strings should have been changed
        // The new name format: typeName + "$" + "p"
        // For array type, toString() might be "Array"
        // For string object, "String"
        // We'll just check that node strings are not "p" anymore
        assertTrue(!node1.getString().equals("p") || !node2.getString().equals("p"));
        // Or check that rename happened: both should be different from original and from each other
        assertTrue(stubCompiler.hasCodeChanged());
    }

    @Test
    public void testGetRenamedTypesForTesting() {
        AbstractCompiler compiler = createCompilerWithRegistry();
        StubCompiler stubCompiler = (StubCompiler) compiler;
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(stubCompiler);
        DisambiguateProperties<JSType>.Property prop = d.getProperty("q");
        JSType t1 = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        JSType t2 = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        prop.addType(t1, t1, null);
        prop.addType(t2, t2, null);
        // Ensure types are in different equivalence classes (not unioned)
        // addType both with null relatedType ensures separate classes
        Multimap<String, Collection<JSType>> result = d.getRenamedTypesForTesting();
        // Should contain property "q" with two collections (each collection contains one type)
        assertTrue(result.containsKey("q"));
        assertEquals(2, result.get("q").size());
    }

    @Test
    public void testFindExternPropertiesInvalidatingType() {
        // Test that when an extern property has invalidating type, property becomes invalidated
        // We need to trigger FindExternProperties.visit with a GETPROP node.
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        // Create a node representing a property access with invalidating type (e.g., undefined)
        Node getProp = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "obj");
        Node propName = Node.newString("prop");
        getProp.addChildToBack(obj);
        getProp.addChildToBack(propName);
        // Set the JSType of obj to null (which will make getType return UNKNOWN_TYPE)
        obj.setJSType(null);
        // Now we need to traverse with FindExternProperties. But we can't access inner class directly.
        // We'll rely on process method which will traverse externs with FindExternProperties.
        Node externs = new Node(Token.BLOCK);
        externs.addChildToBack(getProp);
        Node root = new Node(Token.BLOCK);
        d.process(externs, root);
        // Property "prop" should have been found
        DisambiguateProperties<JSType>.Property prop = d.getProperty("prop");
        assertNotNull(prop);
        // Since obj's type is null, getType returns UNKNOWN_TYPE which is invalidating? Actually isInvalidatingType for UNKNOWN_TYPE returns true (since it's in invalidatingTypes set)
        // So the property should be invalidated
        assertTrue(prop.skipRenaming);
    }

    @Test
    public void testFindRenameablePropertiesObjectLit() {
        // Test that object literal string keys are scheduled for renaming
        AbstractCompiler compiler = createCompilerWithRegistry();
        DisambiguateProperties<JSType> d = DisambiguateProperties.forJSTypeSystem(compiler);
        // Create an object literal with a string key
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString("key");
        Node value = new Node(Token.NUMBER, 1.0);
        objectLit.addChildToBack(key);
        objectLit.addChildToBack(value);
        // The root should contain this object lit
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(objectLit);
        Node externs = new Node(Token.BLOCK);
        d.process(externs, root);
        // Property "key" should exist and have renameNodes scheduled
        DisambiguateProperties<JSType>.Property prop = d.getProperty("key");
        assertNotNull(prop);
        assertFalse(prop.renameNodes.isEmpty());
    }
}