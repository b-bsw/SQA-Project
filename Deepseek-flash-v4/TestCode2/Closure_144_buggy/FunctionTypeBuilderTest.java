package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.FunctionTypeBuilder;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.InstanceObjectType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FunctionTypeBuilderTest {

    private MockCompiler compiler;
    private MockTypeRegistry typeRegistry;
    private MockScope scope;
    private Node errorRoot;
    private String sourceName;
    private String fnName;
    private FunctionTypeBuilder builder;

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        typeRegistry = new MockTypeRegistry();
        compiler.typeRegistry = typeRegistry;
        compiler.codingConvention = new MockCodingConvention();
        scope = new MockScope();
        errorRoot = new Node(Token.NAME, "errorRoot");
        sourceName = "test.js";
        fnName = "myFunction";
        builder = new FunctionTypeBuilder(fnName, compiler, errorRoot, sourceName, scope);
    }

    @After
    public void tearDown() {
        compiler = null;
        typeRegistry = null;
        scope = null;
        errorRoot = null;
        fnName = null;
        builder = null;
    }

    // ========== Constructor ==========
    @Test
    public void testConstructorSetsFields() {
        FunctionTypeBuilder b = new FunctionTypeBuilder("foo", compiler, errorRoot, "bar", scope);
        // No direct getters; check that buildAndRegister works later
        assertNotNull(b);
    }

    @Test
    public void testConstructorWithNullFnName() {
        FunctionTypeBuilder b = new FunctionTypeBuilder(null, compiler, errorRoot, sourceName, scope);
        assertNotNull(b);
    }

    // ========== setSourceNode ==========
    @Test
    public void testSetSourceNode() {
        Node source = new Node(Token.FUNCTION);
        assertSame(builder, builder.setSourceNode(source));
    }

    @Test
    public void testSetSourceNodeNull() {
        assertSame(builder, builder.setSourceNode(null));
    }

    // ========== inferFromOverriddenFunction ==========
    @Test
    public void testInferFromOverriddenFunction_WithParamsParentNull() {
        FunctionType oldType = createMockFunctionType();
        FunctionTypeBuilder result = builder.inferFromOverriddenFunction(oldType, null);
        assertSame(builder, result);
        // parametersNode should be set from oldType
        assertNotNull(builder.parametersNode);
    }

    @Test
    public void testInferFromOverriddenFunction_WithParamsParent() {
        FunctionType oldType = createMockFunctionType();
        Node paramsParent = new Node(Token.LP);
        paramsParent.addChildToBack(new Node(Token.NAME, "a"));
        paramsParent.addChildToBack(new Node(Token.NAME, "b"));
        FunctionTypeBuilder result = builder.inferFromOverriddenFunction(oldType, paramsParent);
        assertSame(builder, result);
    }

    @Test
    public void testInferFromOverriddenFunction_NoOldParams() {
        FunctionType oldType = createMockFunctionType(); // empty params
        Node paramsParent = new Node(Token.LP);
        paramsParent.addChildToBack(new Node(Token.NAME, "a"));
        builder.inferFromOverriddenFunction(oldType, paramsParent);
        // should add unknown type for extra param
    }

    // ========== inferReturnType ==========
    @Test
    public void testInferReturnType_WithInfoAndReturnType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasReturnType = true;
        info.returnType = new MockJSTypeExpression(typeRegistry.getNativeType(JSTypeRegistry.UNKNOWN_TYPE));
        builder.templateTypeName = null;
        builder.inferReturnType(info);
        assertNotNull(builder.returnType);
    }

    @Test
    public void testInferReturnType_NoInfo() {
        builder.inferReturnType(null);
        assertNotNull(builder.returnType);
        assertSame(typeRegistry.getNativeType(JSTypeRegistry.UNKNOWN_TYPE), builder.returnType);
    }

    @Test
    public void testInferReturnType_TemplateTypeMismatch() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasReturnType = true;
        // returnType that is template type
        JSType templateType = typeRegistry.createTemplateType("T");
        info.returnType = new MockJSTypeExpression(templateType);
        builder.templateTypeName = "T";
        builder.inferReturnType(info);
        assertTrue(compiler.lastError != null);
    }

    @Test
    public void testInferReturnType_TemplateTypeNotTemplate() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasReturnType = true;
        info.returnType = new MockJSTypeExpression(typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE));
        builder.templateTypeName = "T";
        builder.inferReturnType(info);
        // no error
        assertNull(compiler.lastError);
    }

    // ========== inferInheritance ==========
    @Test
    public void testInferInheritance_ConstructorWithBaseType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.isConstructor = true;
        info.hasBaseType = true;
        info.baseType = new MockJSTypeExpression(new MockObjectType("Base"));
        builder.inferInheritance(info);
        assertNotNull(builder.baseType);
        assertTrue(builder.isConstructor);
    }

    @Test
    public void testInferInheritance_InterfaceWithBaseType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.isInterface = true;
        info.hasBaseType = true;
        info.baseType = new MockJSTypeExpression(new MockObjectType("Base"));
        builder.inferInheritance(info);
        assertNotNull(builder.baseType);
        assertTrue(builder.isInterface);
    }

    @Test
    public void testInferInheritance_NoConstructorOrInterface_WithBaseType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasBaseType = true;
        info.baseType = new MockJSTypeExpression(new MockObjectType("Base"));
        builder.inferInheritance(info);
        // should report EXTENDS_WITHOUT_TYPEDEF
        assertTrue(compiler.lastWarning != null);
    }

    @Test
    public void testInferInheritance_BaseTypeNull() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.isConstructor = true;
        info.hasBaseType = true;
        info.baseType = new MockJSTypeExpression(null); // evaluates to null
        builder.inferInheritance(info);
        // should report EXTENDS_NON_OBJECT
        assertTrue(compiler.lastWarning != null);
    }

    @Test
    public void testInferInheritance_ImplementedInterfaces() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.isConstructor = true;
        info.implementedInterfaces = new ArrayList<JSTypeExpression>();
        info.implementedInterfaces.add(new MockJSTypeExpression(new MockObjectType("IFace")));
        builder.inferInheritance(info);
        assertNotNull(builder.implementedInterfaces);
        assertEquals(1, builder.implementedInterfaces.size());
    }

    @Test
    public void testInferInheritance_ImplementedInterfaces_withBadType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.isConstructor = true;
        info.implementedInterfaces = new ArrayList<JSTypeExpression>();
        info.implementedInterfaces.add(new MockJSTypeExpression(null)); // evaluates to null
        builder.inferInheritance(info);
        // should report BAD_IMPLEMENTED_TYPE
        assertTrue(compiler.lastError != null);
    }

    @Test
    public void testInferInheritance_ImplementsWithoutConstructor() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.implementedInterfaces = new ArrayList<JSTypeExpression>();
        info.implementedInterfaces.add(new MockJSTypeExpression(new MockObjectType("IFace")));
        builder.inferInheritance(info);
        // should report IMPLEMENTS_WITHOUT_CONSTRUCTOR
        assertTrue(compiler.lastWarning != null);
    }

    // ========== inferThisType(JSDocInfo, JSType) ==========
    @Test
    public void testInferThisType_WithInfoAndType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasType = false;
        ObjectType objType = new MockObjectType("ThisType");
        builder.inferThisType(info, (JSType) objType);
        assertEquals(objType, builder.thisType);
    }

    @Test
    public void testInferThisType_WithInfoHasType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasType = true;
        ObjectType objType = new MockObjectType("ThisType");
        builder.inferThisType(info, (JSType) objType);
        // thisType should not be set because info.hasType is true
        assertNull(builder.thisType);
    }

    @Test
    public void testInferThisType_NonObjectType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasType = false;
        JSType nonObject = typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE);
        builder.inferThisType(info, nonObject);
        assertNull(builder.thisType);
    }

    // ========== inferThisType(JSDocInfo, Node) ==========
    @Test
    public void testInferThisType_WithInfoThisType() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasThisType = true;
        info.thisType = new MockJSTypeExpression(new MockObjectType("ThisTypeFromDoc"));
        builder.inferThisType(info, (Node) null);
        assertNotNull(builder.thisType);
    }

    @Test
    public void testInferThisType_WithOwner() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasType = false;
        Node owner = new Node(Token.NAME, "MyClass");
        owner.setQualifiedName("MyClass");
        // register type in registry
        ObjectType ownerType = new MockObjectType("MyClass");
        typeRegistry.registeredTypes.put("MyClass", ownerType);
        builder.inferThisType(info, owner);
        assertEquals(ownerType, builder.thisType);
    }

    @Test
    public void testInferThisType_OwnerNotInRegistry() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.hasType = false;
        Node owner = new Node(Token.NAME, "NonExistent");
        owner.setQualifiedName("NonExistent");
        builder.inferThisType(info, owner);
        assertNull(builder.thisType);
    }

    // ========== inferParameterTypes from JSDocInfo ==========
    @Test
    public void testInferParameterTypes_FromInfoOnly() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"x", "y"};
        info.hasParameterType = true;
        info.parameterTypes.put("x", new MockJSTypeExpression(typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE)));
        info.parameterTypes.put("y", new MockJSTypeExpression(typeRegistry.getNativeType(JSTypeRegistry.STRING_TYPE)));
        builder.inferParameterTypes(info);
        assertNotNull(builder.parametersNode);
    }

    @Test
    public void testInferParameterTypes_FromInfoOnly_EmptyNames() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[0];
        builder.inferParameterTypes(info);
        assertNotNull(builder.parametersNode);
    }

    // ========== inferParameterTypes(Node, JSDocInfo) ==========
    @Test
    public void testInferParameterTypes_WithArgsParentAndInfo() {
        Node lp = new Node(Token.LP);
        lp.addChildToBack(new Node(Token.NAME, "a"));
        lp.addChildToBack(new Node(Token.NAME, "b"));
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"a", "b"};
        info.hasParameterType = true;
        info.parameterTypes.put("a", new MockJSTypeExpression(typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE)));
        info.parameterTypes.put("b", new MockJSTypeExpression(typeRegistry.getNativeType(JSTypeRegistry.STRING_TYPE)));
        builder.inferParameterTypes(lp, info);
        assertNotNull(builder.parametersNode);
    }

    @Test
    public void testInferParameterTypes_ArgsParentNull_InfoNull() {
        builder.inferParameterTypes(null, null);
        assertNull(builder.parametersNode);
    }

    @Test
    public void testInferParameterTypes_ArgsParentNull_InfoNotNull() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"x"};
        builder.inferParameterTypes(null, info);
        assertNotNull(builder.parametersNode);
    }

    @Test
    public void testInferParameterTypes_NonExistentParamsWarning() {
        Node lp = new Node(Token.LP);
        lp.addChildToBack(new Node(Token.NAME, "a"));
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"b"}; // extra param in doc not in args
        builder.inferParameterTypes(lp, info);
        // should report INEXISTANT_PARAM
        assertTrue(compiler.lastWarning != null);
    }

    @Test
    public void testInferParameterTypes_TemplateTypeFound() {
        builder.templateTypeName = "T";
        Node lp = new Node(Token.LP);
        Node param = new Node(Token.NAME, "a");
        lp.addChildToBack(param);
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"a"};
        info.hasParameterType = true;
        JSType templateType = typeRegistry.createTemplateType("T");
        info.parameterTypes.put("a", new MockJSTypeExpression(templateType));
        builder.inferParameterTypes(lp, info);
        // no error for template type duplicated
        assertNull(compiler.lastError);
    }

    @Test
    public void testInferParameterTypes_TemplateTypeDuplicated() {
        builder.templateTypeName = "T";
        Node lp = new Node(Token.LP);
        Node param1 = new Node(Token.NAME, "a");
        Node param2 = new Node(Token.NAME, "b");
        lp.addChildToBack(param1);
        lp.addChildToBack(param2);
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"a", "b"};
        info.hasParameterType = true;
        JSType templateType = typeRegistry.createTemplateType("T");
        info.parameterTypes.put("a", new MockJSTypeExpression(templateType));
        info.parameterTypes.put("b", new MockJSTypeExpression(templateType));
        builder.inferParameterTypes(lp, info);
        // should report TEMPLATE_TYPE_DUPLICATED
        assertTrue(compiler.lastError != null);
    }

    @Test
    public void testInferParameterTypes_TemplateTypeNotFound() {
        builder.templateTypeName = "T";
        Node lp = new Node(Token.LP);
        Node param = new Node(Token.NAME, "a");
        lp.addChildToBack(param);
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"a"};
        info.hasParameterType = true;
        info.parameterTypes.put("a", new MockJSTypeExpression(typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE)));
        builder.inferParameterTypes(lp, info);
        // should report TEMPLATE_TYPE_EXPECTED
        assertTrue(compiler.lastError != null);
    }

    // ========== addParameter (indirectly through inferParameterTypes) ==========
    @Test
    public void testAddParameter_OptionalArgAtEnd() {
        Node lp = new Node(Token.LP);
        Node required = new Node(Token.NAME, "a");
        Node optional = new Node(Token.NAME, "b");
        lp.addChildToBack(required);
        lp.addChildToBack(optional);
        // Make optional param appear after required: default behavior is required then optional
        // To trigger warning we need to simulate that the second param is optional but first is required.
        // We can set codingConvention to mark second as optional.
        MockCodingConvention conv = (MockCodingConvention) compiler.codingConvention;
        conv.optionalParamNames.add("b");
        MockJSDocInfo info = null;
        builder.inferParameterTypes(lp, info); // info null -> all known types are UNKNOWN
        // Required param added first, then optional => no warning about optional at end because optional after required is fine.
        // To test OPTIONAL_ARG_AT_END, we need optional before required. 
        // Let's create another test.
    }

    @Test
    public void testAddParameter_OptionalBeforeRequiredWarning() {
        Node lp = new Node(Token.LP);
        Node optional = new Node(Token.NAME, "a");
        Node required = new Node(Token.NAME, "b");
        lp.addChildToBack(optional);
        lp.addChildToBack(required);
        MockCodingConvention conv = (MockCodingConvention) compiler.codingConvention;
        conv.optionalParamNames.add("a");
        MockJSDocInfo info = null;
        builder.inferParameterTypes(lp, info);
        // should report OPTIONAL_ARG_AT_END because optional first, then required
        assertTrue(compiler.lastWarning != null);
    }

    @Test
    public void testAddParameter_VarArgsNotLastWarning() {
        Node lp = new Node(Token.LP);
        Node varArg = new Node(Token.NAME, "a");
        Node another = new Node(Token.NAME, "b");
        lp.addChildToBack(varArg);
        lp.addChildToBack(another);
        MockCodingConvention conv = (MockCodingConvention) compiler.codingConvention;
        conv.varArgsParamNames.add("a");
        MockJSDocInfo info = null;
        builder.inferParameterTypes(lp, info);
        // should report VAR_ARGS_MUST_BE_LAST because vararg not last
        assertTrue(compiler.lastWarning != null);
    }

    // ========== inferTemplateTypeName ==========
    @Test
    public void testInferTemplateTypeName() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.templateTypeName = "T";
        builder.inferTemplateTypeName(info);
        assertEquals("T", typeRegistry.lastSetTemplateTypeName);
    }

    @Test
    public void testInferTemplateTypeName_NullInfo() {
        builder.inferTemplateTypeName(null);
        assertNull(typeRegistry.lastSetTemplateTypeName);
    }

    // ========== buildAndRegister ==========
    @Test
    public void testBuildAndRegister_NonConstructorNonInterface() {
        builder.returnType = typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE);
        builder.parametersNode = new FunctionParamBuilder(typeRegistry).build();
        FunctionType ft = builder.buildAndRegister();
        assertNotNull(ft);
    }

    @Test
    public void testBuildAndRegister_Constructor() {
        builder.isConstructor = true;
        builder.returnType = typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE);
        builder.parametersNode = new FunctionParamBuilder(typeRegistry).build();
        FunctionType ft = builder.buildAndRegister();
        assertNotNull(ft);
    }

    @Test
    public void testBuildAndRegister_Interface() {
        builder.isInterface = true;
        builder.returnType = typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE);
        builder.parametersNode = new FunctionParamBuilder(typeRegistry).build();
        builder.fnName = "MyInterface";
        builder.scope.isGlobal = true;
        FunctionType ft = builder.buildAndRegister();
        assertNotNull(ft);
    }

    @Test
    public void testBuildAndRegister_ParametersNodeNull_Throws() {
        builder.returnType = typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE);
        try {
            builder.buildAndRegister();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testBuildAndRegister_ReturnTypeNull() {
        builder.returnType = null;
        builder.parametersNode = new FunctionParamBuilder(typeRegistry).build();
        FunctionType ft = builder.buildAndRegister();
        assertNotNull(ft);
    }

    @Test
    public void testBuildAndRegister_ImplementedInterfacesSet() {
        builder.isConstructor = true;
        builder.parametersNode = new FunctionParamBuilder(typeRegistry).build();
        builder.returnType = typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE);
        List<ObjectType> ifaces = new ArrayList<ObjectType>();
        ifaces.add(new MockObjectType("Iface"));
        builder.implementedInterfaces = ifaces;
        FunctionType ft = builder.buildAndRegister();
        assertNotNull(ft);
        // Verify that setImplementedInterfaces was called
        assertTrue(((MockFunctionType)ft).implementedInterfaces == ifaces);
    }

    @Test
    public void testBuildAndRegister_ConstructorGetExistingType() {
        // Pre-register a constructor type
        typeRegistry.registeredTypes.put("ExistingCtor", new MockInstanceObjectType());
        builder.isConstructor = true;
        builder.fnName = "ExistingCtor";
        builder.parametersNode = new FunctionParamBuilder(typeRegistry).build();
        builder.returnType = typeRegistry.getNativeType(JSTypeRegistry.NUMBER_TYPE);
        FunctionType ft = builder.buildAndRegister();
        assertNotNull(ft);
        // Should have used existing type
    }

    // ========== isFunctionTypeDeclaration ==========
    @Test
    public void testIsFunctionTypeDeclaration_True() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[]{"a"};
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testIsFunctionTypeDeclaration_False() {
        MockJSDocInfo info = new MockJSDocInfo();
        info.parameterNames = new String[0];
        info.hasReturnType = false;
        info.hasThisType = false;
        info.isConstructor = false;
        info.isInterface = false;
        assertTrue(!FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    // ==================== Helper Classes ====================
    static class MockCompiler extends AbstractCompiler {
        JSTypeRegistry typeRegistry;
        CodingConvention codingConvention;
        JSError lastWarning;
        JSError lastError;

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return codingConvention;
        }

        @Override
        public void report(JSError error) {
            if (error.getType() != null && error.getType().equals(DiagnosticType.warning("", ""))) {
                // crude distinction: store as warning if it's warning level
                // in real code we check severity, but for testing we just store both
                lastWarning = error;
            } else {
                lastError = error;
            }
        }

        // Other abstract methods stub
        @Override
        public void reportCodeChange() {}
        @Override
        public void reportChange() {}
        @Override
        public void reportChange(Node n) {}
        @Override
        public void reportChange(Node n, Node parent) {}
        @Override
        public void reportChangeInEnclosingScope(Node n) {}
        @Override
        public void reportChangeInScope(Scope s) {}
        @Override
        public Scope getTopScope() { return null; }
        @Override
        public Scope getScope(Node n) { return null; }
        @Override
        public boolean hasCompileFunctions() { return false; }
        @Override
        public boolean processRuntimeFunctions() { return false; }
        @Override
        public boolean processDefines() { return false; }
        @Override
        public boolean processProvidesAndRequires() { return false; }
        @Override
        public boolean processTypeCheck() { return false; }
        @Override
        public boolean processTypeInference() { return false; }
        @Override
        public boolean processChecks() { return false; }
        @Override
        public boolean processOptimizations() { return false; }
        @Override
        public boolean process() { return false; }
        @Override
        public CompilerOptions getOptions() { return null; }
        @Override
        public void setOptions(CompilerOptions options) {}
        @Override
        public void addChangeHandler(CodeChangeHandler handler) {}
        @Override
        public void removeChangeHandler(CodeChangeHandler handler) {}
        @Override
        public boolean hasErrors() { return false; }
        @Override
        public boolean hasWarnings() { return false; }
        @Override
        public boolean isTypeCheckingEnabled() { return false; }
    }

    static class MockTypeRegistry extends JSTypeRegistry {
        String lastSetTemplateTypeName;
        java.util.Map<String, JSType> registeredTypes = new java.util.HashMap<String, JSType>();
        int nextTemplateId = 0;

        public JSType getNativeType(int type) {
            // Return a simple object type for each
            return new MockObjectType("native" + type);
        }

        @Override
        public void setTemplateTypeName(String name) {
            lastSetTemplateTypeName = name;
        }

        @Override
        public void clearTemplateTypeName() {
            lastSetTemplateTypeName = null;
        }

        @Override
        public FunctionType createConstructorType(String name, Node source, Node params, JSType returnType) {
            return new MockFunctionType(name, true);
        }

        @Override
        public FunctionType createInterfaceType(String name, Node source) {
            return new MockFunctionType(name, false);
        }

        @Override
        public void declareType(String name, JSType type) {
            registeredTypes.put(name, type);
        }

        @Override
        public JSType getType(String name) {
            return registeredTypes.get(name);
        }

        @Override
        public JSType getType(Scope scope, String name, String sourceName, int lineno, int charno) {
            return getType(name);
        }

        public JSType createTemplateType(String name) {
            return new MockTemplateType(name);
        }

        @Override
        public FunctionType getNativeFunctionType(int type) {
            return new MockFunctionType("Function", true);
        }
    }

    static class MockScope extends Scope {
        boolean isGlobal = false;

        @Override
        public boolean isGlobal() {
            return isGlobal;
        }

        // other methods stub
        @Override
        public boolean isLocal() { return !isGlobal; }
        @Override
        public Var getVar(String name) { return null; }
        @Override
        public Var getSlot(String name) { return null; }
        @Override
        public Var getOwnSlot(String name) { return null; }
        @Override
        public void declare(String name, Node n, JSType type, boolean isExtern, boolean isImplicit) {}
        @Override
        public void undeclare(String name) {}
        @Override
        public void clearVars() {}
        @Override
        public Scope getParent() { return null; }
        @Override
        public Scope getGlobalScope() { return null; }
        @Override
        public Node getRootNode() { return null; }
        @Override
        public boolean isBlockScope() { return false; }
        @Override
        public boolean isFunctionScope() { return false; }
        @Override
        public boolean isLoopScope() { return false; }
        @Override
        public boolean isSwitchScope() { return false; }
        @Override
        public boolean isCatchScope() { return false; }
        @Override
        public boolean isWithScope() { return false; }
        @Override
        public boolean isModuleScope() { return false; }
        @Override
        public boolean isGlobalScope() { return isGlobal; }
        @Override
        public boolean isTopLevel() { return isGlobal; }
        @Override
        public Node getBodyNode() { return null; }
        @Override
        public Node getVarNode(String name) { return null; }
        @Override
        public String getSourceName() { return null; }
        @Override
        public boolean isDeclared(String name, boolean recurse) { return false; }
        @Override
        public boolean isOwnDeclared(String name) { return false; }
        @Override
        public int getDepth() { return 0; }
        @Override
        public Node getBlockNode() { return null; }
        @Override
        public Scope getFunctionScope() { return null; }
        @Override
        public Iterator<Var> getVars() { return null; }
    }

    static class MockCodingConvention extends CodingConvention {
        List<String> optionalParamNames = new ArrayList<String>();
        List<String> varArgsParamNames = new ArrayList<String>();

        @Override
        public boolean isOptionalParameter(Node param) {
            return optionalParamNames.contains(param.getString());
        }

        @Override
        public boolean isVarArgsParameter(Node param) {
            return varArgsParamNames.contains(param.getString());
        }
    }

    static class MockJSDocInfo extends JSDocInfo {
        boolean hasReturnType = false;
        JSTypeExpression returnType;
        boolean isConstructor = false;
        boolean isInterface = false;
        boolean hasBaseType = false;
        JSTypeExpression baseType;
        List<JSTypeExpression> implementedInterfaces;
        boolean hasThisType = false;
        JSTypeExpression thisType;
        boolean hasType = false;
        String templateTypeName;
        String[] parameterNames = new String[0];
        java.util.Map<String, JSTypeExpression> parameterTypes = new java.util.HashMap<String, JSTypeExpression>();
        boolean hasParameterType = false;
        int parameterCount = 0;

        @Override
        public boolean hasReturnType() { return hasReturnType; }

        @Override
        public JSTypeExpression getReturnType() { return returnType; }

        @Override
        public boolean isConstructor() { return isConstructor; }

        @Override
        public boolean isInterface() { return isInterface; }

        @Override
        public boolean hasBaseType() { return hasBaseType; }

        @Override
        public JSTypeExpression getBaseType() { return baseType; }

        @Override
        public Iterable<JSTypeExpression> getImplementedInterfaces() {
            return implementedInterfaces != null ? implementedInterfaces : new ArrayList<JSTypeExpression>();
        }

        @Override
        public int getImplementedInterfaceCount() {
            return implementedInterfaces != null ? implementedInterfaces.size() : 0;
        }

        @Override
        public boolean hasThisType() { return hasThisType; }

        @Override
        public JSTypeExpression getThisType() { return thisType; }

        @Override
        public boolean hasType() { return hasType; }

        @Override
        public String getTemplateTypeName() { return templateTypeName; }

        @Override
        public Iterable<String> getParameterNames() {
            List<String> list = new ArrayList<String>();
            for (String s : parameterNames) list.add(s);
            return list;
        }

        @Override
        public int getParameterCount() {
            return parameterNames.length;
        }

        @Override
        public boolean hasParameterType(String name) {
            return hasParameterType && parameterTypes.containsKey(name);
        }

        @Override
        public JSTypeExpression getParameterType(String name) {
            return parameterTypes.get(name);
        }
    }

    static class MockJSTypeExpression extends JSTypeExpression {
        private JSType evaluatedType;

        MockJSTypeExpression(JSType evaluatedType) {
            super(null, null); // dummy
            this.evaluatedType = evaluatedType;
        }

        @Override
        public JSType evaluate(Scope scope, JSTypeRegistry registry) {
            return evaluatedType;
        }

        @Override
        public boolean isOptionalArg() { return false; }

        @Override
        public boolean isVarArgs() { return false; }
    }

    static class MockObjectType extends ObjectType {
        String name;

        MockObjectType(String name) {
            super(null);
            this.name = name;
        }

        @Override
        public String toString() { return name; }

        @Override
        public boolean isObjectType() { return true; }

        @Override
        public boolean isFunctionType() { return false; }

        @Override
        public FunctionType getConstructor() {
            return null;
        }

        @Override
        public JSType getImplicitPrototype() { return null; }

        @Override
        public Property getSlot(String name) { return null; }

        @Override
        public boolean hasProperty(String name) { return false; }

        @Override
        public JSType getPropertyType(String name) { return null; }

        @Override
        public boolean isPropertyTypeDeclared(String name) { return false; }

        @Override
        public boolean isPropertyTypeInferred(String name) { return false; }

        @Override
        public void setPropertyJSType(String name, JSType type) {}

        @Override
        public boolean isNativeObjectType() { return false; }

        @Override
        public boolean isRecordType() { return false; }

        @Override
        public boolean isStructuralType() { return false; }

        @Override
        public boolean isStructuralInterface() { return false; }

        @Override
        public Iterable<String> getOwnPropertyNames() { return null; }

        @Override
        public JSType getLeastSupertype(JSType that) { return null; }

        @Override
        public JSType getGreatestSubtype(JSType that) { return null; }

        @Override
        public boolean isSubtype(JSType other) { return false; }

        @Override
        public boolean isEquivalentTo(JSType other) { return false; }

        @Override
        public boolean isUnknownType() { return false; }

        @Override
        public boolean isCheckedUnknownType() { return false; }

        @Override
        public boolean isUnionType() { return false; }

        @Override
        public boolean isIntersectionType() { return false; }

        @Override
        public JSType restrictByNotNullOrUndefined() { return this; }

        @Override
        public boolean canBeCalled() { return false; }

        @Override
        public boolean isNoType() { return false; }

        @Override
        public boolean isNoResolvedType() { return false; }

        @Override
        public boolean areObjectsEqual() { return false; }

        @Override
        public boolean isTemplateType() { return false; }

        @Override
        public ObjectType cloneObjectType() { return null; }

        @Override
        public boolean hasCachedValues() { return false; }

        @Override
        public JSType getPropertyValueType(String name) { return null; }

        @Override
        public boolean isSubtypeOf(ObjectType other) { return false; }

        @Override
        public boolean isSupersetOf(ObjectType other) { return false; }

        @Override
        public boolean isStructuralMatch(ObjectType other) { return false; }

        @Override
        public ObjectType toMaybeObjectType() { return this; }

        @Override
        public boolean defineProperty(String name, JSType type, Node propertyNode) { return false; }
    }

    static class MockTemplateType extends JSType {
        String name;

        MockTemplateType(String name) {
            super(null);
            this.name = name;
        }

        @Override
        public boolean isTemplateType() { return true; }

        @Override
        public String toString() { return name; }

        @Override
        public JSType restrictByNotNullOrUndefined() { return this; }

        @Override
        public boolean isUnknownType() { return false; }

        @Override
        public boolean isCheckedUnknownType() { return false; }

        @Override
        public boolean isUnionType() { return false; }

        @Override
        public boolean isIntersectionType() { return false; }

        @Override
        public boolean canBeCalled() { return false; }

        @Override
        public boolean isNoType() { return false; }

        @Override
        public boolean isNoResolvedType() { return false; }

        @Override
        public boolean areObjectsEqual() { return false; }

        @Override
        public JSType getLeastSupertype(JSType that) { return null; }

        @Override
        public JSType getGreatestSubtype(JSType that) { return null; }

        @Override
        public boolean isSubtype(JSType other) { return false; }

        @Override
        public boolean isEquivalentTo(JSType other) { return false; }

        @Override
        public boolean isObjectType() { return false; }

        @Override
        public boolean isFunctionType() { return false; }

        @Override
        public ObjectType toMaybeObjectType() { return null; }
    }

    static class MockInstanceObjectType extends InstanceObjectType {
        MockInstanceObjectType() {
            super(null, null);
        }
    }

    static class MockFunctionType extends FunctionType {
        String name;
        boolean isConstructor;
        List<ObjectType> implementedInterfaces;

        MockFunctionType(String name, boolean isConstructor) {
            super(null, null, null, null, null, null, null);
            this.name = name;
            this.isConstructor = isConstructor;
        }

        @Override
        public String toString() { return name; }

        @Override
        public boolean isConstructor() { return isConstructor; }

        @Override
        public boolean isInterface() { return !isConstructor; }

        @Override
        public void setImplementedInterfaces(List<ObjectType> interfaces) {
            this.implementedInterfaces = interfaces;
        }

        @Override
        public JSType getReturnType() {
            return null;
        }

        @Override
        public Node getParametersNode() {
            return null;
        }

        @Override
        public Iterable<Node> getParameters() {
            return new ArrayList<Node>();
        }

        @Override
        public boolean hasEqualCallType(FunctionType other) {
            return true;
        }

        @Override
        public Node getSource() {
            return null;
        }

        @Override
        public void setSource(Node source) {}

        @Override
        public InstanceObjectType getInstanceType() {
            return new MockInstanceObjectType();
        }

        @Override
        public ObjectType getPrototype() { return null; }

        @Override
        public void setPrototypeBasedOn(ObjectType base) {}

        @Override
        public List<ObjectType> getImplementedInterfaces() {
            return implementedInterfaces;
        }
    }

    // Helper to create a mock FunctionType with empty params
    private FunctionType createMockFunctionType() {
        return new MockFunctionType("old", false);
    }
}