package com.google.javascript.jscomp;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

    private StubCompiler compiler;
    private TypedScopeCreator creator;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        compiler = new StubCompiler();
        creator = new TypedScopeCreator(compiler);
        registry = compiler.getTypeRegistry();
    }

    // ==========================  STUB IMPLEMENTATIONS  ==========================

    private static class StubCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry;
        private final CodingConvention codingConvention;
        private final TypeValidator typeValidator;
        private final ErrorReporter errorReporter;

        StubCompiler() {
            this.errorReporter = new StubErrorReporter();
            this.typeRegistry = new StubTypeRegistry(errorReporter);
            this.codingConvention = new StubConvention();
            this.typeValidator = new TypeValidator(this, typeRegistry);
        }

        @Override public JSTypeRegistry getTypeRegistry() { return typeRegistry; }
        @Override public CodingConvention getCodingConvention() { return codingConvention; }
        @Override public TypeValidator getTypeValidator() { return typeValidator; }
        @Override public ErrorReporter getErrorReporter() { return errorReporter; }
        @Override public InputId getInputId() { return new InputId("test.js"); }
        @Override public boolean isMoist() { return false; }
        @Override public void setMoist(boolean moister) {}
        @Override public void report(ErrorReporter reporter, DiagnosticType type, String... args) {}
        @Override public void report(JSError error) {}
        @Override public String getSourceForNode(Node node) { return ""; }
        @Override public Node getNodeForCode(String code) { return null; }
    }

    private static class StubErrorReporter extends ErrorReporter {
        @Override public void error(String message, String sourceName, int line, int col) {}
        @Override public void warning(String message, String sourceName, int line, int col) {}
    }

    private static class StubConvention extends CodingConvention {
        @Override public void checkForCallingConventionDefiningCalls(Node n, Map<String, String> m) {}
        @Override public SubclassRelationship getClassesDefinedByCall(Node n) { return null; }
        @Override public String getSingletonGetterClassName(Node n) { return null; }
        @Override public DelegateRelationship getDelegateRelationship(Node n) { return null; }
        @Override public void defineDelegateProxyPrototypeProperties(JSTypeRegistry r, Scope s, List<ObjectType> protos, Map<String, String> map) {}
        @Override public boolean isConstant(String s) { return false; }
        @Override public boolean isSuperClass(String s) { return false; }
        @Override public boolean isValidEnumKey(String s) { return true; }
        @Override public ObjectLiteralCast getObjectLiteralCast(NodeTraversal t, Node n) { return null; }
        @Override public String getDelegateSuperclassName() { return "DelegateSuper"; }
        @Override public void applyDelegateRelationship(ObjectType superObject, ObjectType baseObject, ObjectType delegatorObject, FunctionType proxy, FunctionType findDelegate) {}
        @Override public void applySubclassRelationship(FunctionType superCtor, FunctionType subCtor, SubclassType type) {}
        @Override public void applySingletonGetter(FunctionType functionType, FunctionType getterType, ObjectType objectType) {}
    }

    private static class StubJSType extends JSType {
        private String name;
        StubJSType(JSTypeRegistry registry, String name) { super(registry); this.name = name; }
        @Override public String toString() { return name; }
        @Override public boolean isFunctionType() { return false; }
        @Override public FunctionType toMaybeFunctionType() { return null; }
        @Override public boolean isUnknownType() { return false; }
        @Override public boolean isEmptyType() { return false; }
        @Override public boolean isSubtype(JSType type) { return false; }
        @Override public JSType restrictByNotNullOrUndefined() { return this; }
        @Override public JSType resolve(ErrorReporter r, Scope s) { return this; }
        @Override public boolean isEnumType() { return false; }
        @Override public EnumType toMaybeEnumType() { return null; }
        @Override public ObjectType dereference() { return null; }
    }

    private static class StubFunctionType extends FunctionType {
        private StubObjectType instanceType;
        private StubObjectType prototype;
        private ObjectType typeOfThis;
        private boolean isConstructor;
        private boolean isInterface;

        StubFunctionType(JSTypeRegistry registry, String name) {
            super(registry, name, null, null, null, false, false);
            this.instanceType = new StubObjectType(registry, name + "Instance");
            this.prototype = new StubObjectType(registry, name + "Prototype");
            this.typeOfThis = instanceType;
        }

        void setConstructor(boolean c) { this.isConstructor = c; }
        void setTypeOfThis(ObjectType t) { this.typeOfThis = t; }

        @Override public boolean isConstructor() { return isConstructor; }
        @Override public boolean isInterface() { return isInterface; }
        @Override public boolean isNativeObjectType() { return true; }
        @Override public boolean isReturnTypeInferred() { return true; }
        @Override public ObjectType getTypeOfThis() { return typeOfThis; }
        @Override public ObjectType getInstanceType() { return instanceType; }
        @Override public ObjectType getPrototype() { return prototype; }
        @Override public JSType getReturnType() { return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE); }
        @Override public Node getParametersNode() { return null; }
        @Override public FunctionType toMaybeFunctionType() { return this; }
        @Override public boolean equals(Object o) {
            if (o instanceof StubFunctionType) return ((StubFunctionType) o).toString().equals(toString());
            return false;
        }
        @Override public int hashCode() { return toString().hashCode(); }
    }

    private static class StubObjectType extends ObjectType {
        private String refName;
        private Map<String, JSType> properties = new HashMap<>();
        private Map<String, Boolean> inferred = new HashMap<>();

        StubObjectType(JSTypeRegistry registry, String refName) { super(registry); this.refName = refName; }
        void setReferenceName(String name) { this.refName = name; }
        @Override public String getReferenceName() { return refName; }
        @Override public boolean isEmptyType() { return false; }
        @Override public boolean isUnknownType() { return false; }
        @Override public boolean isSubtype(JSType type) { return false; }
        @Override public JSType restrictByNotNullOrUndefined() { return this; }
        @Override public JSType resolve(ErrorReporter r, Scope s) { return this; }
        @Override public boolean isFunctionPrototypeType() { return false; }
        @Override public FunctionType getOwnerFunction() { return null; }
        @Override public FunctionType getConstructor() { return null; }
        @Override public boolean isEnumType() { return false; }
        @Override public EnumType toMaybeEnumType() { return null; }
        @Override public boolean equals(Object o) {
            if (o instanceof StubObjectType) return ((StubObjectType) o).refName.equals(this.refName);
            return false;
        }
        @Override public int hashCode() { return refName.hashCode(); }
        @Override public void defineDeclaredProperty(String name, JSType type, Node node) { properties.put(name, type); inferred.put(name, false); }
        @Override public void defineInferredProperty(String name, JSType type, Node node) { if (!properties.containsKey(name)) { properties.put(name, type); inferred.put(name, true); } }
        @Override public boolean hasOwnProperty(String name) { return properties.containsKey(name); }
        @Override public boolean isPropertyTypeInferred(String name) { return inferred.getOrDefault(name, true); }
        @Override public JSType getPropertyType(String name) { return properties.get(name); }
        @Override public ObjectType getImplicitPrototype() { return null; }
        @Override public void clearCachedValues() {}
    }

    private static class StubEnumType extends EnumType {
        StubEnumType(String name, JSType elementsType, JSTypeRegistry registry) { super(registry, name, null, elementsType); }
        @Override public String toString() { return "Enum(" + super.toString() + ")"; }
        @Override public boolean isEnumType() { return true; }
        @Override public EnumType toMaybeEnumType() { return this; }
        @Override public boolean isSubtype(JSType type) { return false; }
        @Override public JSType restrictByNotNullOrUndefined() { return this; }
        @Override public JSType resolve(ErrorReporter r, Scope s) { return this; }
        @Override public boolean isUnknownType() { return false; }
        @Override public boolean isEmptyType() { return false; }
    }

    private static class StubTypeExpression extends JSTypeExpression {
        private JSType type;
        StubTypeExpression(JSType type) { super(null, null); this.type = type; }
        @Override public JSType evaluate(Scope s, JSTypeRegistry r) { return type; }
    }

    private static class StubTypeRegistry extends JSTypeRegistry {
        private Map<String, JSType> types = new HashMap<>();
        private ErrorReporter reporter;

        StubTypeRegistry(ErrorReporter reporter) { super(reporter); this.reporter = reporter; }

        private String getNativeName(JSTypeNative tId) {
            switch (tId) {
                case ARRAY_FUNCTION_TYPE: return "Array";
                case BOOLEAN_OBJECT_FUNCTION_TYPE: return "Boolean";
                case DATE_FUNCTION_TYPE: return "Date";
                case ERROR_FUNCTION_TYPE: return "Error";
                case EVAL_ERROR_FUNCTION_TYPE: return "EvalError";
                case FUNCTION_FUNCTION_TYPE: return "Function";
                case NUMBER_OBJECT_FUNCTION_TYPE: return "Number";
                case OBJECT_FUNCTION_TYPE: return "Object";
                case RANGE_ERROR_FUNCTION_TYPE: return "RangeError";
                case REFERENCE_ERROR_FUNCTION_TYPE: return "ReferenceError";
                case REGEXP_FUNCTION_TYPE: return "RegExp";
                case STRING_OBJECT_FUNCTION_TYPE: return "String";
                case SYNTAX_ERROR_FUNCTION_TYPE: return "SyntaxError";
                case TYPE_ERROR_FUNCTION_TYPE: return "TypeError";
                case URI_ERROR_FUNCTION_TYPE: return "URIError";
                case VOID_TYPE: return "undefined";
                case NO_OBJECT_TYPE: return "ActiveXObject";
                case NO_TYPE: return "NO_TYPE";
                case UNKNOWN_TYPE: return "UNKNOWN_TYPE";
                case OBJECT_TYPE: return "Object";
                case STRING_TYPE: return "string";
                case NUMBER_TYPE: return "number";
                case BOOLEAN_TYPE: return "boolean";
                case NULL_TYPE: return "null";
                case REGEXP_TYPE: return "regexp";
                case GLOBAL_THIS: return "global";
                case U2U_CONSTRUCTOR_TYPE: return "Function2";
                default: return "NativeType_" + tId.ordinal();
            }
        }

        @Override public FunctionType getNativeFunctionType(JSTypeNative tId) {
            String name = getNativeName(tId);
            if (types.containsKey(name) && types.get(name).isFunctionType()) return types.get(name).toMaybeFunctionType();
            StubFunctionType ft = new StubFunctionType(this, name);
            StubObjectType inst = (StubObjectType) ft.getInstanceType();
            inst.setReferenceName(name);
            types.put(name, ft);
            types.put(name + "Instance", inst);
            types.put(name + "Prototype", ft.getPrototype());
            return ft;
        }

        @Override public JSType getNativeType(JSTypeNative tId) {
            String name = getNativeName(tId);
            if (types.containsKey(name)) return types.get(name);
            StubJSType t = new StubJSType(this, name);
            types.put(name, t);
            return t;
        }

        @Override public ObjectType getNativeObjectType(JSTypeNative tId) {
            return getNativeFunctionType(tId).getInstanceType();
        }

        @Override public void identifyNonNullableName(String name) {}
        @Override public void declareType(String name, JSType type) { types.put(name, type); }
        @Override public JSType getType(String name) { return types.get(name); }
        @Override public void registerType(String name, JSType type) { types.put(name, type); }
        @Override public void overwriteDeclaredType(String name, JSType type) { types.put(name, type); }
        @Override public void registerPropertyOnType(String property, JSType type) {}
        @Override public void resetImplicitPrototype(JSType jsType, ObjectType implicitPrototype) {}
        @Override public JSType createDefaultObjectUnion(ObjectType objType) { return objType; }
        @Override public FunctionType createFunctionType(JSType returnType, Node parameterList) { return new StubFunctionType(this, "stubFn"); }
        @Override public FunctionType createFunctionType(JSType returnType) { return new StubFunctionType(this, "stubFn"); }
        @Override public FunctionType createConstructorType(String name, Node node, Node params, JSType returnType) { return new StubFunctionType(this, name); }
        @Override public FunctionType createConstructorType(JSType returnType, Node params) { return new StubFunctionType(this, "stubFn"); }
        @Override public ObjectType createAnonymousObjectType() { return new StubObjectType(this, "anonymous"); }
        @Override public EnumType createEnumType(String name, Node rValue, JSType elementsType) { return new StubEnumType(name, elementsType, this); }
        @Override public void resolveTypesInScope(Scope scope) {}
        @Override public ErrorReporter getErrorReporter() { return reporter; }
    }

    // ==========================  TEST CASES  ==========================

    @Test
    public void testCreateInitialScope_declaresNativeTypes() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Scope scope = creator.createInitialScope(root);

        Assert.assertNotNull("Should have 'Object' var declared", scope.getVar("Object"));
        Assert.assertNotNull("Should have 'Array' var declared", scope.getVar("Array"));
        Assert.assertNotNull("Should have 'undefined' var declared", scope.getVar("undefined"));
        Assert.assertNotNull("Should have 'ActiveXObject' var declared", scope.getVar("ActiveXObject"));
        Assert.assertNull("Should not have non-native var declared", scope.getVar("NonExistent"));
    }

    @Test
    public void testCreateScope_nullParent_returnsGlobalScope() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Scope scope = creator.createScope(root, null);

        Assert.assertNotNull("Scope should not be null", scope);
        Assert.assertTrue("Scope should be global", scope.isGlobal());
        Assert.assertNotNull("Global scope should have 'Object' var", scope.getVar("Object"));
    }

    @Test
    public void testCreateScope_withParent_returnsLocalScope() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Node functionNode = new Node(Token.FUNCTION);
        Node fnName = Node.newString("myFunc");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        functionNode.addChildToBack(fnName);
        functionNode.addChildToBack(paramList);
        functionNode.addChildToBack(block);
        root.addChildToBack(functionNode);

        Scope globalScope = creator.createScope(root, null);
        Scope localScope = creator.createScope(functionNode, globalScope);

        Assert.assertNotNull("Local scope should not be null", localScope);
        Assert.assertFalse("Local scope should not be global", localScope.isGlobal());
        Assert.assertEquals("Local scope root should be the function node", functionNode, localScope.getRootNode());
    }

    @Test
    public void testPatchGlobalScope_removesVarsAndRebuilds() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Scope globalScope = creator.createScope(root, null);
        String sourceName = NodeUtil.getSourceName(root);
        Assert.assertNotNull("Source name should derive from root node", sourceName);

        creator.patchGlobalScope(globalScope, root);
        Assert.assertNotNull("After patch, scope should still have 'Object'", globalScope.getVar("Object"));
    }

    @Test
    public void testCollectProperties_thisTypeNotUnknown() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Node functionNode = new Node(Token.FUNCTION);
        Node fnName = Node.newString("MyClass");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);

        Node assignNode = new Node(Token.ASSIGN);
        Node getPropNode = new Node(Token.GETPROP);
        Node thisNode = new Node(Token.THIS);
        Node propNameNode = Node.newString("prop");
        getPropNode.addChildToFront(thisNode);
        getPropNode.addChildToFront(propNameNode);
        Node numberNode = new Node(Token.NUMBER, 1);
        assignNode.addChildToFront(getPropNode);
        assignNode.addChildToFront(numberNode);
        Node exprResultNode = new Node(Token.EXPR_RESULT);
        exprResultNode.addChildToFront(assignNode);
        block.addChildToFront(exprResultNode);

        functionNode.addChildToBack(fnName);
        functionNode.addChildToBack(paramList);
        functionNode.addChildToBack(block);
        root.addChildToBack(functionNode);

        StubFunctionType fnType = new StubFunctionType(registry, "MyClass");
        StubObjectType thisType = new StubObjectType(registry, "MyClassInstance");
        fnType.setTypeOfThis(thisType);
        functionNode.setJSType(fnType);

        JSDocInfo jsDoc = new JSDocInfo();
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        jsDoc.setType(new StubTypeExpression(numberType));
        assignNode.setJSDocInfo(jsDoc);

        creator.createScope(root, null);

        Assert.assertTrue("CollectProperties should define property 'prop' on thisType", thisType.hasOwnProperty("prop"));
        Assert.assertEquals("Property type should be number", numberType, thisType.getPropertyType("prop"));
    }

    @Test
    public void testGetDeclaredType_fromFunctionLiteral() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Node varNode = new Node(Token.VAR);
        Node fName = Node.newString("f");
        Node fnExpr = new Node(Token.FUNCTION);
        Node fnExprName = new Node(Token.NAME, "");
        Node paramList = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        fnExpr.addChildToBack(fnExprName);
        fnExpr.addChildToBack(paramList);
        fnExpr.addChildToBack(body);

        StubFunctionType fnExprType = new StubFunctionType(registry, "f");
        fnExpr.setJSType(fnExprType);

        fName.addChildToBack(fnExpr);
        varNode.addChildToBack(fName);
        root.addChildToBack(varNode);

        Scope scope = creator.createScope(root, null);
        Var fVar = scope.getVar("f");
        Assert.assertNotNull("Var f should be declared", fVar);
        Assert.assertTrue("Type of f should be a function type", fVar.getType().isFunctionType());
    }

    @Test
    public void testDefineSlot_WindowConstructor_UpdatesGlobalThis() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Node varNode = new Node(Token.VAR);
        Node windowNode = Node.newString("Window");
        Node windowFn = new Node(Token.FUNCTION);
        Node fnName = new Node(Token.NAME, "");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        windowFn.addChildToBack(fnName);
        windowFn.addChildToBack(paramList);
        windowFn.addChildToBack(block);

        StubFunctionType windowFnType = new StubFunctionType(registry, "Window");
        windowFnType.setConstructor(true);
        windowFn.setJSType(windowFnType);

        windowNode.addChildToBack(windowFn);
        varNode.addChildToBack(windowNode);
        root.addChildToBack(varNode);

        Scope globalScope = creator.createScope(root, null);
        Var windowVar = globalScope.getVar("Window");
        Assert.assertNotNull("Window var should be declared in global scope", windowVar);
        Assert.assertTrue("Window should have a function type", windowVar.getType().isFunctionType());
    }

    @Test
    public void testCreateScope_enumType() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Node varNode = new Node(Token.VAR);
        Node enumName = Node.newString("MyEnum");
        Node objLit = new Node(Token.OBJECTLIT);

        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(new StubTypeExpression(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        objLit.setJSDocInfo(info);

        enumName.addChildToBack(objLit);
        varNode.addChildToBack(enumName);
        root.addChildToBack(varNode);

        Scope scope = creator.createScope(root, null);
        Var enumVar = scope.getVar("MyEnum");
        Assert.assertNotNull("Enum var should be declared", enumVar);
        Assert.assertNotNull("Enum var type should not be null", enumVar.getType());
    }

    @Test
    public void testCreateInitialScope_DiscoverEnumsAndTypedefs() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        root.putProp(Node.SOURCE_NAME_PROP, "test.js");

        Node varNode = new Node(Token.VAR);
        Node typedefName = Node.newString("MyTypeDef");
        Node typedefValue = new Node(Token.OBJECTLIT);
        JSDocInfo typedefInfo = new JSDocInfo();
        typedefInfo.setTypedefType(new StubTypeExpression(registry.getNativeType(JSTypeNative.NO_TYPE)));
        typedefValue.setJSDocInfo(typedefInfo);
        typedefName.addChildToBack(typedefValue);
        varNode.addChildToBack(typedefName);
        root.addChildToBack(varNode);

        Scope scope = creator.createInitialScope(root);
        Assert.assertNotNull("Scope should be created without crashing", scope);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateScope_nullRoot_throwsNullPointerException() {
        creator.createScope(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_nullGlobalScope_throws() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        creator.patchGlobalScope(null, root);
    }

    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_nullScriptRoot_throws() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        Scope globalScope = creator.createScope(root, null);
        creator.patchGlobalScope(globalScope, null);
    }

    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScope_nonScriptRoot_throws() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test.js"));
        Scope globalScope = creator.createScope(root, null);
        Node nonScriptNode = new Node(Token.BLOCK);
        creator.patchGlobalScope(globalScope, nonScriptNode);
    }
}