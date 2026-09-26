package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

    private static final String SCRIPT_SOURCE = "test.js";
    private FakeCompiler compiler;
    private FakeCodingConvention convention;
    private TypedScopeCreator creator;

    @Before
    public void setUp() {
        compiler = new FakeCompiler();
        convention = new FakeCodingConvention();
        creator = new TypedScopeCreator(compiler, convention);
    }

    @After
    public void tearDown() {
        compiler = null;
        convention = null;
        creator = null;
    }

    @Test
    public void testCreateScope_global_noParent() {
        Node root = createScriptNode();
        Scope scope = creator.createScope(root, null);
        assertNotNull("Global scope should not be null", scope);
        assertTrue("Scope should be global", scope.isGlobal());
        // verify built-in types are present
        assertNotNull(scope.getVar("Array"));
        assertNotNull(scope.getVar("Object"));
        assertNotNull(scope.getVar("undefined"));
    }

    @Test
    public void testCreateScope_local_withParent() {
        Node root = createScriptNode();
        Scope global = creator.createScope(root, null);
        // create a function node inside the script to simulate local scope
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setInputId(new InputId(SCRIPT_SOURCE));
        // add child for name (empty string)
        functionNode.addChildToFront(new Node(Token.NAME, "myFunc"));
        // LP for params
        Node lp = new Node(Token.LP);
        functionNode.addChildAfter(lp, functionNode.getFirstChild());
        // block
        Node block = new Node(Token.BLOCK);
        functionNode.addChildAfter(block, lp);
        // add function to root
        root.addChildToFront(functionNode);
        root.setType(Token.BLOCK);
        Scope local = creator.createScope(functionNode, global);
        assertNotNull("Local scope should not be null", local);
        assertTrue("Scope should be local", !local.isGlobal());
        assertEquals("Parent scope should be global", global, local.getParent());
    }

    @Test
    public void testPatchGlobalScope_removesVarFromScript() {
        Node scriptRoot = createScriptNode();
        Scope globalBefore = creator.createScope(scriptRoot, null);
        // declare a variable in global scope that belongs to this script
        Node varNode = new Node(Token.NAME, "toBeRemoved");
        varNode.setInputId(new InputId(SCRIPT_SOURCE));
        globalBefore.declare("toBeRemoved", varNode, null, new CompilerInput(SCRIPT_SOURCE), false);
        assertNotNull(globalBefore.getVar("toBeRemoved"));

        // now patch
        creator.patchGlobalScope(globalBefore, scriptRoot);
        assertNull("Variable should be removed by patch", globalBefore.getVar("toBeRemoved"));
    }

    @Test
    public void testCreateInitialScope_containsNativeTypes() {
        Node root = createScriptNode();
        Scope initial = creator.createInitialScope(root);
        assertNotNull("Initial scope", initial);
        assertNotNull("Array type", initial.getVar("Array"));
        assertNotNull("Object type", initial.getVar("Object"));
        assertNotNull("Function type", initial.getVar("Function"));
        assertEquals("undefined type", JSTypeNative.VOID_TYPE, 
            initial.getVar("undefined").getType().getJSTypeNative());
    }

    @Test
    public void testCreateScope_withParent_traversesLocalScope() {
        Node root = new Node(Token.SCRIPT);
        root.setType(Token.SCRIPT);
        root.setInputId(new InputId(SCRIPT_SOURCE));
        // add a function
        Node fn = new Node(Token.FUNCTION);
        fn.setInputId(new InputId(SCRIPT_SOURCE));
        Node fnName = new Node(Token.NAME, "f");
        Node lp = new Node(Token.LP);
        Node block = new Node(Token.BLOCK);
        fn.addChildToFront(fnName);
        fn.addChildAfter(lp, fnName);
        fn.addChildAfter(block, lp);
        root.addChildToFront(fn);

        Scope global = creator.createScope(root, null);
        Scope local = creator.createScope(fn, global);
        assertNotNull("Local scope", local);
        // should have declared 'f' inside local scope
        assertNotNull("Function name 'f' should be in local scope", local.getVar("f"));
    }

    // ----- helper methods -----

    private Node createScriptNode() {
        Node script = new Node(Token.SCRIPT);
        script.setType(Token.SCRIPT);
        script.setInputId(new InputId(SCRIPT_SOURCE));
        script.putProp(Node.SOURCENAME_PROP, SCRIPT_SOURCE);
        return script;
    }

    // ----- Fake implementations -----

    private static class FakeCompiler extends AbstractCompiler {
        private final FakeTypeRegistry typeRegistry = new FakeTypeRegistry();
        private final TypeValidator validator = new TypeValidator(null, null, null) {
            @Override
            public void expectUndeclaredVariable(String sourceName, Node n, Node parent,
                                                  Var oldVar, String variableName, JSType type) {
                // no-op
            }
            @Override
            public void expectSuperType(NodeTraversal t, Node n, ObjectType superClass, ObjectType subClass) {
                // no-op
            }
        };

        @Override
        public CodingConvention getCodingConvention() {
            return new FakeCodingConvention();
        }

        @Override
        public TypeValidator getTypeValidator() {
            return validator;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public CompilerInput getInput(InputId inputId) {
            return new CompilerInput(inputId.getIdName());
        }

        @Override
        public void report(JSError error) {
            // ignore
        }

        @Override
        public boolean isIdeMode() { return false; }
        // other abstract methods with no-op
        @Override protected Node parseInputs() { return null; }
        @Override protected Node parseInputsForOneFile(CompilerInput input, JSModule module) { return null; }
        @Override public void processInputs() { }
        @Override public JSModuleGraph getModuleGraph() { return null; }
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public void setErrorManager(ErrorManager manager) { }
        @Override public String getSourceLine(String sourceName, int lineNumber) { return null; }
        @Override public Region getSourceRegion(String sourceName) { return null; }
        @Override public List<CompilerInput> getInputsForTesting() { return Collections.emptyList(); }
    }

    private static class FakeCodingConvention extends CodingConvention {
        @Override
        public void defineDelegateProxyPrototypeProperties(
                JSTypeRegistry registry, Scope scope,
                List<ObjectType> delegateProxyPrototypes,
                Map<String, String> delegateCallingConventions) {
            // no-op
        }

        @Override
        public void checkForCallingConventionDefiningCalls(
                Node n, Map<String, String> delegateCallingConventions) {
            // no-op
        }

        @Override
        public SubclassRelationship getClassesDefinedByCall(Node n) {
            return null;
        }

        @Override
        public String getSingletonGetterClassName(Node n) {
            return null;
        }

        @Override
        public DelegateRelationship getDelegateRelationship(Node n) {
            return null;
        }

        @Override
        public ObjectLiteralCast getObjectLiteralCast(NodeTraversal t, Node n) {
            return null;
        }

        @Override
        public void applyDelegateRelationship(
                ObjectType delegateSuperObject, ObjectType delegateBaseObject,
                ObjectType delegatorObject, FunctionType delegateProxy,
                FunctionType findDelegate) {
            // no-op
        }

        @Override
        public String getDelegateSuperclassName() {
            return null;
        }

        @Override
        public void applySubclassRelationship(
                FunctionType superCtor, FunctionType subCtor, SubclassType type) {
            // no-op
        }

        @Override
        public void applySingletonGetter(FunctionType functionType,
                                          FunctionType getterType, ObjectType objectType) {
            // no-op
        }

        @Override
        public boolean isValidEnumKey(String key) {
            return true;
        }
    }

    private static class FakeTypeRegistry extends JSTypeRegistry {
        public FakeTypeRegistry() {
            super(null, null); // minimal constructor
        }

        @Override
        public void identifyNonNullableName(String name) {
            // no-op
        }

        @Override
        public void declareType(String name, JSType type) {
            // no-op
        }

        @Override
        public void overwriteDeclaredType(String name, JSType type) {
            // no-op
        }

        @Override
        public JSType getType(String name) {
            return null;
        }

        @Override
        public JSType getNativeType(JSTypeNative nativeType) {
            return new FakeJSType(nativeType);
        }

        @Override
        public FunctionType getNativeFunctionType(JSTypeNative nativeType) {
            return new FakeFunctionType();
        }

        @Override
        public ObjectType getNativeObjectType(JSTypeNative nativeType) {
            return new FakeObjectType(nativeType);
        }

        @Override
        public ObjectType createAnonymousObjectType() {
            return new FakeObjectType(JSTypeNative.OBJECT_TYPE);
        }

        @Override
        public EnumType createEnumType(String name, JSType elementsType) {
            return null;
        }

        @Override
        public FunctionType createFunctionType(
                JSType returnType, Node parametersNode) {
            return new FakeFunctionType();
        }

        @Override
        public FunctionType createConstructorType(
                String name, Node source, Node parameters, JSType returnType) {
            return new FakeFunctionType();
        }

        @Override
        public JSType createDefaultObjectUnion(ObjectType objType) {
            return objType;
        }

        @Override
        public void registerPropertyOnType(String prop, JSType type) {
            // no-op
        }

        @Override
        public ErrorReporter getErrorReporter() {
            return null;
        }

        @Override
        public void resolveTypesInScope(Scope scope) {
            // no-op
        }
    }

    private static class FakeJSType extends JSType {
        private final JSTypeNative nativeType;
        FakeJSType(JSTypeNative nativeType) {
            super(null, null);
            this.nativeType = nativeType;
        }

        @Override
        public JSTypeNative getJSTypeNative() {
            return nativeType;
        }

        @Override
        public boolean isUnknownType() { return false; }
        @Override
        public boolean isEmptyType() { return false; }
        @Override
        public boolean isFunctionType() { return false; }
        @Override
        public boolean isConstructor() { return false; }
        @Override
        public boolean isInterface() { return false; }
        @Override
        public boolean isSubtype(JSType that) { return false; }
        @Override
        public ObjectType toObjectType() { return null; }
        @Override
        public FunctionType toMaybeFunctionType() { return null; }
        @Override
        public JSType restrictByNotNullOrUndefined() { return this; }
        @Override
        public JSType getLeastSupertype(JSType that) { return this; }
        @Override
        public JSType getGreatestSubtype(JSType that) { return this; }
        @Override
        public String toString() { return nativeType.toString(); }
        @Override
        public boolean isNoType() { return false; }
        @Override
        public boolean isNoObjectType() { return false; }
        @Override
        public boolean isOrdinaryFunction() { return false; }
        @Override
        public boolean isInstanceType() { return false; }
        @Override public boolean isArrayType() { return false; }
        @Override public boolean isVoidType() { return false; }
        @Override public boolean isNominalType() { return false; }
        @Override public boolean isEnumElementType() { return false; }
        @Override public boolean isEnumType() { return false; }
        @Override public boolean isNativeObjectType() { return false; }
        @Override public JSType resolve(ErrorReporter reporter, Scope scope) { return this; }
        @Override public ObjectType dereference() { return null; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override public boolean isTheObjectType() { return false; }
        @Override public boolean isStringType() { return false; }
        @Override public boolean isNumberType() { return false; }
        @Override public boolean isBooleanType() { return false; }
    }

    private static class FakeFunctionType extends FunctionType {
        FakeFunctionType() {
            super(null, null, null, null, null);
        }

        @Override public FunctionType getPrototype() { return this; }
        @Override public FunctionType getInstanceType() { return this; }
        @Override public ObjectType getTypeOfThis() { return new FakeObjectType(JSTypeNative.UNKNOWN_TYPE); }
        @Override public Node getParametersNode() { return null; }
        @Override public boolean isConstructor() { return false; }
        @Override public boolean isInterface() { return false; }
        @Override public boolean isNativeObjectType() { return false; }
        @Override public FunctionType getSuperClassConstructor() { return null; }
        @Override public JSType getReturnType() { return null; }
        @Override public boolean isReturnTypeInferred() { return false; }
        @Override public void setJSDocInfo(JSDocInfo info) { }
        @Override public JSDocInfo getJSDocInfo() { return null; }
        @Override public void setPrototypeBasedOn(ObjectType baseType) { }
    }

    private static class FakeObjectType extends ObjectType {
        private final JSTypeNative nativeType;
        FakeObjectType(JSTypeNative nativeType) {
            super(null, null, null);
            this.nativeType = nativeType;
        }
        @Override public String getReferenceName() { return nativeType.toString(); }
        @Override public boolean hasOwnProperty(String propertyName) { return false; }
        @Override public boolean isPropertyTypeInferred(String propertyName) { return false; }
        @Override public void defineDeclaredProperty(String propertyName, JSType type, Node node) { }
        @Override public void defineInferredProperty(String propertyName, JSType type, Node node) { }
        @Override public JSType getPropertyType(String propertyName) { return null; }
        @Override public boolean isFunctionPrototypeType() { return false; }
        @Override public FunctionType getOwnerFunction() { return null; }
        @Override public FunctionType getConstructor() { return null; }
        @Override public ObjectType getImplicitPrototype() { return null; }
        @Override public List<ObjectType> getCtorImplementedInterfaces() { return Collections.emptyList(); }
        @Override public boolean isInstanceType() { return false; }
        @Override public void clearCachedValues() { }
        @Override public JSType resolve(ErrorReporter reporter, Scope scope) { return this; }
        @Override public boolean isUnknownType() { return false; }
        @Override public JSType getLeastSupertype(JSType that) { return that; }
        @Override public JSType getGreatestSubtype(JSType that) { return that; }
        @Override public String toString() { return getReferenceName(); }
        @Override public boolean isNominalType() { return false; }
        @Override public boolean isNativeObjectType() { return false; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
    }

    // Additional inner class for CompilerInput (used in patch test)
    private static class CompilerInput extends com.google.javascript.jscomp.CompilerInput {
        private final String name;
        CompilerInput(String name) {
            super(name);
            this.name = name;
        }
        @Override public String getName() { return name; }
        @Override public boolean isExtern() { return false; }
        // other abstract methods minimal
        @Override public Node getAstRoot(AbstractCompiler compiler) { return null; }
        @Override public void setAst(Node astRoot) { }
        @Override public void setIsExtern(boolean isExtern) { }
        @Override public SourceFile getSourceFile() { return null; }
        @Override public String getCode() { return ""; }
    }

    // need a concrete SourceFile for CompilerInput - dummy
    private static class SourceFile {
        SourceFile(String name) {}
    }
}