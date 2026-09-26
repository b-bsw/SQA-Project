package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ScopedAliasesTest {

    private Compiler compiler;
    private ScopedAliases scopedAliases;
    private AliasTransformationHandler handler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        handler = new AliasTransformationHandler() {
            @Override
            public AliasTransformation logAliasTransformation(
                    String sourceFile, SourcePosition<AliasTransformation> position) {
                return new AliasTransformation() {
                    @Override
                    public void addAlias(String alias, String definition) {
                        // no-op
                    }
                };
            }
        };
        scopedAliases = new ScopedAliases(compiler, null, handler);
    }

    // Helper to create a NAME node for a variable usage
    private Node createNameNode(String name) {
        return Node.newString(Token.NAME, name);
    }

    // Helper to create a qualified name chain (e.g., goog.b)
    private Node createQualifiedName(String qualifiedName) {
        return Node.newQualifiedName(qualifiedName);
    }

    // Helper to create a simple CALL: aliasName.methodName()
    private Node createAliasCall(String aliasName, String methodName) {
        Node aliasNode = createNameNode(aliasName);
        Node methodNode = Node.newString(methodName);
        Node getprop = new Node(Token.GETPROP, aliasNode, methodNode);
        Node call = new Node(Token.CALL, getprop);
        return new Node(Token.EXPR_RESULT, call);
    }

    // Helper to create var aliasName = qualifiedName;
    private Node createAliasDefinition(String aliasName, String qualifiedName) {
        Node nameNode = createNameNode(aliasName);
        Node initNode = createQualifiedName(qualifiedName);
        nameNode.addChildToFront(initNode);
        return new Node(Token.VAR, nameNode);
    }

    // Helper to create anonymous function block with given statements
    private Node createFunctionBlock(Node... statements) {
        Node block = new Node(Token.BLOCK);
        for (Node stmt : statements) {
            block.addChildToBack(stmt);
        }
        return block;
    }

    // Helper to create a goog.scope(function(){...}) expression statement
    private Node createGoogScopeCall(Node bodyBlock) {
        Node goog = createNameNode("goog");
        Node scope = Node.newString("scope");
        Node getprop = new Node(Token.GETPROP, goog, scope);
        Node funcName = new Node(Token.NAME, "");
        Node paramList = new Node(Token.PARAM_LIST);
        Node func = new Node(Token.FUNCTION, funcName, paramList, bodyBlock);
        Node call = new Node(Token.CALL, getprop, func);
        return new Node(Token.EXPR_RESULT, call);
    }

    // Helper to create a script with a single statement
    private Node createScript(Node statement) {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(statement);
        return script;
    }

    // Helper to run process and return compilation errors
    private List<JSError> runProcess(Node root) {
        scopedAliases.process(new Node(Token.SCRIPT), root);
        return compiler.getErrors();
    }

    // Helper to check single error type
    private void assertSingleError(DiagnosticType expected, List<JSError> errors) {
        assertEquals(1, errors.size());
        assertEquals(expected, errors.get(0).getType());
    }

    // --------------- Test Cases ---------------

    @Test
    public void testNoGoogScope() {
        Node simple = new Node(Token.EXPR_RESULT, createNameNode("x"));
        Node root = createScript(simple);
        List<JSError> errors = runProcess(root);
        assertTrue("Expected no errors", errors.isEmpty());
    }

    @Test
    public void testSimpleAlias() {
        Node aliasDef = createAliasDefinition("a", "goog.b");
        Node usage = createAliasCall("a", "c");
        Node body = createFunctionBlock(aliasDef, usage);
        Node scopeCall = createGoogScopeCall(body);
        Node root = createScript(scopeCall);

        // Keep references to nodes that should be detached
        Node aliasNameNode = aliasDef.getLastChild(); // the NAME node "a"
        Node usageNameNode = ((Node) usage.getFirstChild().getFirstChild().getFirstChild()); // the NAME "a" inside usage

        List<JSError> errors = runProcess(root);
        assertTrue("Expected no errors", errors.isEmpty());

        // Alias definition should be detached from parent
        assertNull("Alias definition var node should be detached", aliasDef.getParent());
        assertNull("Alias definition name node should be detached", aliasNameNode.getParent());

        // Alias usage should be replaced (original usageNameNode detached)
        assertNull("Alias usage name node should be detached", usageNameNode.getParent());

        // Code change should have been reported (we can't check directly, but no errors indicates transformation happened)
    }

    @Test
    public void testImproperUsage() {
        // goog.scope call not wrapped in EXPR_RESULT
        Node body = createFunctionBlock();
        Node goog = createNameNode("goog");
        Node scope = Node.newString("scope");
        Node getprop = new Node(Token.GETPROP, goog, scope);
        Node funcName = new Node(Token.NAME, "");
        Node paramList = new Node(Token.PARAM_LIST);
        Node func = new Node(Token.FUNCTION, funcName, paramList, body);
        Node call = new Node(Token.CALL, getprop, func);
        // Directly under BLOCK, not EXPR_RESULT
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(call);
        Node root = createScript(block);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY, errors);
    }

    @Test
    public void testBadParametersNoArg() {
        // goog.scope() with no argument (only goog.scope)
        Node goog = createNameNode("goog");
        Node scope = Node.newString("scope");
        Node getprop = new Node(Token.GETPROP, goog, scope);
        Node call = new Node(Token.CALL, getprop); // no second child
        Node expr = new Node(Token.EXPR_RESULT, call);
        Node root = createScript(expr);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS, errors);
    }

    @Test
    public void testBadParametersMultipleArgs() {
        // goog.scope(fn, extra)
        Node body = createFunctionBlock();
        Node goog = createNameNode("goog");
        Node scope = Node.newString("scope");
        Node getprop = new Node(Token.GETPROP, goog, scope);
        Node funcName = new Node(Token.NAME, "");
        Node paramList = new Node(Token.PARAM_LIST);
        Node func = new Node(Token.FUNCTION, funcName, paramList, body);
        Node extra = new Node(Token.NUMBER, 1.0); // extra parameter
        Node call = new Node(Token.CALL, getprop, func, extra);
        Node expr = new Node(Token.EXPR_RESULT, call);
        Node root = createScript(expr);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS, errors);
    }

    @Test
    public void testThisInScope() {
        Node thisNode = new Node(Token.THIS);
        Node body = createFunctionBlock(thisNode);
        Node scopeCall = createGoogScopeCall(body);
        Node root = createScript(scopeCall);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS, errors);
    }

    @Test
    public void testReturnInScope() {
        Node returnNode = new Node(Token.RETURN);
        Node body = createFunctionBlock(returnNode);
        Node scopeCall = createGoogScopeCall(body);
        Node root = createScript(scopeCall);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_USES_RETURN, errors);
    }

    @Test
    public void testThrowInScope() {
        Node throwNode = new Node(Token.THROW, new Node(Token.NAME, "e"));
        Node body = createFunctionBlock(throwNode);
        Node scopeCall = createGoogScopeCall(body);
        Node root = createScript(scopeCall);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_USES_THROW, errors);
    }

    @Test
    public void testAliasRedefined() {
        // var a = goog.b; then a = something (assignment)
        Node def = createAliasDefinition("a", "goog.b");
        Node assignment = new Node(Token.ASSIGN, createNameNode("a"), Node.newString("x"));
        // wrapping assignment in expression
        Node assignExpr = new Node(Token.EXPR_RESULT, assignment);
        Node body = createFunctionBlock(def, assignExpr);
        Node scopeCall = createGoogScopeCall(body);
        Node root = createScript(scopeCall);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED, errors);
    }

    @Test
    public void testNonAliasLocal() {
        // var a = 5; (not a qualified name)
        Node nameNode = createNameNode("a");
        Node initNode = Node.newNumber(5);
        nameNode.addChildToFront(initNode);
        Node varNode = new Node(Token.VAR, nameNode);

        Node body = createFunctionBlock(varNode);
        Node scopeCall = createGoogScopeCall(body);
        Node root = createScript(scopeCall);

        List<JSError> errors = runProcess(root);
        assertSingleError(ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL, errors);
    }
}