package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.common.collect.ImmutableList;
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
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {

    private TypedScopeCreator creator;
    private StubErrorReporter errorReporter;
    private MockJSTypeRegistry typeRegistry;
    private MockCodingConvention codingConvention;
    private MockTypeValidator validator;
    private MockAbstractCompiler compiler;

    @Before
    public void setUp() {
        errorReporter = new StubErrorReporter();
        typeRegistry = new MockJSTypeRegistry(errorReporter);
        codingConvention = new MockCodingConvention();
        validator = new MockTypeValidator();
        compiler = new MockAbstractCompiler();
        compiler.typeRegistry = typeRegistry;
        compiler.codingConvention = codingConvention;
        compiler.validator = validator;
        compiler.errorReporter = errorReporter;
        creator = new TypedScopeCreator(compiler, codingConvention);
    }

    // ===== Mock classes =====

    private static class StubErrorReporter implements ErrorReporter {
        @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
        @Override public void error(String message, String sourceName, int line, int lineOffset) {}
    }

    private static class MockJSTypeRegistry extends JSTypeRegistry {
        MockJSTypeRegistry(ErrorReporter errorReporter) {
            super(errorReporter);
        }
        // Override if needed
    }

    private static class MockCodingConvention extends CodingConvention {
        @Override
        public SubclassRelationship getClassesDefinedByCall(Node callNode) {
            return null;
        }
        @Override
        public String getSingletonGetterClassName(Node callNode) {
            return null;
        }
        @Override
        public DelegateRelationship getDelegateRelationship(Node callNode) {
            return null;
        }
        @Override
        public ObjectLiteralCast getObjectLiteralCast(Node callNode) {
            return null;
        }
        @Override
        public void checkForCallingConventionDefiningCalls(Node n, Map<String, String> map) {}
        @Override
        public void applySubclassRelationship(FunctionType superCtor, FunctionType subCtor, SubclassType type) {}
        @Override
        public void applySingletonGetter(FunctionType getterType, FunctionType functionType, ObjectType objectType) {}
        @Override
        public void applyDelegateRelationship(ObjectType delegateSuper, ObjectType delegateBase,
                ObjectType delegator, FunctionType delegateProxy, FunctionType findDelegate) {}
        @Override
        public String getDelegateSuperclassName() { return null; }
        @Override
        public void defineDelegateProxyPrototypeProperties(JSTypeRegistry registry, Scope scope,
                List<ObjectType> delegateProxyPrototypes, Map<String, String> delegateCallingConventions) {}
        @Override
        public boolean isExported(String name) { return false; }
        @Override
        public boolean isConstant(String name) { return false; }
        @Override
        public boolean isValidEnumKey(String key) { return true; }
        @Override
        public boolean isOptionalParameter(Node parameter) { return false; }
        @Override
        public boolean isVarArgsParameter(Node parameter) { return false; }
        @Override
        public String identifyTypeDeclarationCall(Node n) { return null; }
        @Override
        public String identifyTypeAssign(Token t, Node n) { return null; }
    }

    private static class MockTypeValidator extends TypeValidator {
        @Override
        public Var expectUndeclaredVariable(String sourceName, com.google.javascript.jscomp.CompilerInput input,
                Node n, Node parent, Var oldVar, String variableName, JSType type) {
            return oldVar;
        }
        @Override
        public void expectSuperType(NodeTraversal t, Node n, ObjectType superClass, ObjectType subClass) {}
    }

    private static class MockAbstractCompiler extends AbstractCompiler {
        JSTypeRegistry typeRegistry;
        CodingConvention codingConvention;
        TypeValidator validator;
        ErrorReporter errorReporter;

        @Override public JSTypeRegistry getTypeRegistry() { return typeRegistry; }
        @Override public CodingConvention getCodingConvention() { return codingConvention; }
        @Override public TypeValidator getTypeValidator() { return validator; }
        @Override public ErrorReporter getErrorReporter() { return errorReporter; }
        @Override public CompilerInput getInput(InputId id) { return null; }
        @Override public CompilerOutput getOutput(String module) { return null; }
        @Override public SourceFile getSourceFileBySourceName(String sourceName) { return null; }
        @Override public SourceAst getSourceAst(SourceFile file) { return null; }
        @Override public SourceMap getSourceMap() { return null; }
        @Override public String getUniqueID() { return "test"; }
        @Override public JSChunk getModuleByName(String name) { return null; }
        @Override public SourceAst getModuleOutput(JSChunk module) { return null; }
        @Override public boolean hasHaltingErrors() { return false; }
        @Override public int getErrorsCount() { return 0; }
        @Override public int getWarningsCount() { return 0; }
        @Override void addChangeHandler(CodeChangeHandler handler) {}
        @Override void removeChangeHandler(CodeChangeHandler handler) {}
        @Override public void report(JSError error) {}
        @Override public void report(JSError error, int line, int level) {}
    }

    // ===== Tests =====

    @Test
    public void testCreateScope_global() {
        Node root = createScriptNode("test.js");
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "x");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        Var xVar = scope.getVar("x");
        assertNotNull(xVar);
        assertEquals("x", xVar.getName());
    }

    @Test
    public void testCreateScope_local() {
        Node root = createScriptNode("test.js");
        Node functionNode = new Node(Token.FUNCTION);
        Node fnName = new Node(Token.NAME, "f");
        functionNode.addChildToFront(fnName);
        Node params = new Node(Token.PARAM_LIST);
        functionNode.addChildAfter(params, fnName);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildAfter(body, params);
        root.addChildToBack(functionNode);

        Scope globalScope = creator.createScope(root, null);
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());

        Scope localScope = creator.createScope(functionNode, globalScope);
        assertNotNull(localScope);
        assertFalse(localScope.isGlobal());
    }

    @Test
    public void testCreateInitialScope() {
        Node root = createScriptNode("test.js");
        Scope s = creator.createInitialScope(root);
        assertNotNull(s);
        assertNotNull(s.getVar("undefined"));
        assertNotNull(s.getVar("ActiveXObject"));
    }

    @Test
    public void testPatchGlobalScope() {
        Node globalRoot = createScriptNode("test.js");
        Scope globalScope = new Scope(globalRoot, compiler);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "oldVar");
        nameNode.setSourceName("test.js");
        varNode.addChildToBack(nameNode);
        globalRoot.addChildToBack(varNode);
        globalScope.declare("oldVar", nameNode, typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), false);

        Node scriptRoot = createScriptNode("new.js");
        creator.patchGlobalScope(globalScope, scriptRoot);
        assertNotNull(globalScope);
        // The old var is from different script, so should remain
        assertNotNull(globalScope.getVar("oldVar"));
    }

    @Test
    public void testCreateScope_objectLiteralNoKeys() {
        Node root = createScriptNode("test.js");
        Node objLit = new Node(Token.OBJECTLIT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "obj");
        nameNode.addChildToFront(objLit);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        Var objVar = scope.getVar("obj");
        assertNotNull(objVar);
    }

    @Test
    public void testCreateScope_objectLiteralMultipleKeys() {
        Node root = createScriptNode("test.js");
        Node objLit = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING_KEY, "a");
        key1.addChildToBack(Node.newNumber(1.0));
        objLit.addChildToBack(key1);
        Node key2 = Node.newString(Token.STRING_KEY, "b");
        key2.addChildToBack(Node.newNumber(2.0));
        objLit.addChildToBack(key2);

        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "obj");
        nameNode.addChildToFront(objLit);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        Var objVar = scope.getVar("obj");
        assertNotNull(objVar);
    }

    // Helper method to create a script node with source name and input id
    private Node createScriptNode(String sourceName) {
        Node node = new Node(Token.SCRIPT);
        node.setSourceName(sourceName);
        node.setInputId(new InputId(sourceName));
        return node;
    }
}