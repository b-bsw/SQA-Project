package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.SourcePosition;

import java.util.List;

public class ScopedAliasesTest {

  private TestCompiler compiler;
  private ScopedAliases scopedAliases;
  private AliasTransformationHandler transformationHandler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    transformationHandler = new AliasTransformationHandler() {
      @Override
      public AliasTransformation logAliasTransformation(
          SourcePosition<AliasTransformation> sourcePosition) {
        return new AliasTransformation() {
          @Override
          public void addAlias(String alias, String definition) {
            // no-op stub
          }
        };
      }
    };
    scopedAliases = new ScopedAliases(compiler, null, transformationHandler);
  }

  private Node createScriptWithStatement(Node stmt) {
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(stmt);
    return script;
  }

  private Node createGoogScopeCall(Node... bodyStatements) {
    Node body = new Node(Token.BLOCK);
    for (Node stmt : bodyStatements) {
      body.addChildToBack(stmt);
    }
    Node nameNode = new Node(Token.EMPTY);
    Node params = new Node(Token.PARAM_LIST);
    Node fn = new Node(Token.FUNCTION, nameNode, params, body);
    Node getprop = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "goog"),
        Node.newString(Token.STRING, "scope"));
    Node call = new Node(Token.CALL, getprop, fn);
    return call;
  }

  @Test
  public void testNoGoogScope() {
    Node root = new Node(Token.SCRIPT);
    scopedAliases.hotSwapScript(root, null);
    assertFalse(compiler.hasErrors());
    assertFalse(compiler.codeChangeReported);
  }

  @Test
  public void testValidGoogScope() {
    Node varDom = new Node(Token.VAR,
        Node.newString(Token.NAME, "dom"),
        new Node(Token.GETPROP,
            Node.newString(Token.NAME, "goog"),
            Node.newString(Token.STRING, "dom")));
    Node callCreateElement = new Node(Token.CALL,
        new Node(Token.GETPROP,
            Node.newString(Token.NAME, "dom"),
            Node.newString(Token.STRING, "createElement")),
        Node.newString(Token.STRING, "DIV"));
    Node exprResult = new Node(Token.EXPR_RESULT, callCreateElement);
    Node googScopeCall = createGoogScopeCall(varDom, exprResult);
    Node scriptStmt = new Node(Token.EXPR_RESULT, googScopeCall);
    Node root = createScriptWithStatement(scriptStmt);

    scopedAliases.hotSwapScript(root, null);
    assertFalse(compiler.hasErrors());
    assertTrue(compiler.codeChangeReported);
  }

  @Test
  public void testGoogScopeUsedImproperly() {
    Node googScopeCall = createGoogScopeCall();
    Node root = new Node(Token.SCRIPT);
    root.addChildToBack(googScopeCall);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testGoogScopeBadParametersZero() {
    Node getprop = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "goog"),
        Node.newString(Token.STRING, "scope"));
    Node call = new Node(Token.CALL, getprop);
    Node exprResult = new Node(Token.EXPR_RESULT, call);
    Node root = createScriptWithStatement(exprResult);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeBadParametersNonFunction() {
    Node getprop = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "goog"),
        Node.newString(Token.STRING, "scope"));
    Node call = new Node(Token.CALL, getprop, Node.newString(Token.STRING, "notAFunc"));
    Node exprResult = new Node(Token.EXPR_RESULT, call);
    Node root = createScriptWithStatement(exprResult);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeReferencesThis() {
    Node thisNode = new Node(Token.THIS);
    Node exprResultThis = new Node(Token.EXPR_RESULT, thisNode);
    Node googScopeCall = createGoogScopeCall(exprResultThis);
    Node scriptStmt = new Node(Token.EXPR_RESULT, googScopeCall);
    Node root = createScriptWithStatement(scriptStmt);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testGoogScopeUsesReturn() {
    Node returnNode = new Node(Token.RETURN, Node.newNumber(1));
    Node exprResultRet = new Node(Token.EXPR_RESULT, returnNode);
    Node googScopeCall = createGoogScopeCall(exprResultRet);
    Node scriptStmt = new Node(Token.EXPR_RESULT, googScopeCall);
    Node root = createScriptWithStatement(scriptStmt);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testGoogScopeUsesThrow() {
    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "e"));
    Node exprResultThrow = new Node(Token.EXPR_RESULT, throwNode);
    Node googScopeCall = createGoogScopeCall(exprResultThrow);
    Node scriptStmt = new Node(Token.EXPR_RESULT, googScopeCall);
    Node root = createScriptWithStatement(scriptStmt);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testAliasRedefined() {
    Node var1 = new Node(Token.VAR,
        Node.newString(Token.NAME, "dom"),
        new Node(Token.GETPROP,
            Node.newString(Token.NAME, "goog"),
            Node.newString(Token.STRING, "dom")));
    Node var2 = new Node(Token.VAR,
        Node.newString(Token.NAME, "dom"),
        new Node(Token.GETPROP,
            Node.newString(Token.NAME, "goog"),
            Node.newString(Token.STRING, "window")));
    Node googScopeCall = createGoogScopeCall(var1, var2);
    Node scriptStmt = new Node(Token.EXPR_RESULT, googScopeCall);
    Node root = createScriptWithStatement(scriptStmt);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testNonAliasLocal() {
    Node varX = new Node(Token.VAR,
        Node.newString(Token.NAME, "x"),
        Node.newNumber(5));
    Node googScopeCall = createGoogScopeCall(varX);
    Node scriptStmt = new Node(Token.EXPR_RESULT, googScopeCall);
    Node root = createScriptWithStatement(scriptStmt);
    scopedAliases.hotSwapScript(root, null);
    assertTrue(compiler.hasErrors());
    assertErrorPresent(ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  private void assertErrorPresent(DiagnosticType type) {
    for (JSError err : compiler.errors) {
      if (err.getType() == type) {
        return;
      }
    }
    fail("Expected error " + type.getKey() + " not found");
  }

  private static class TestCompiler extends Compiler {
    List<JSError> errors = Lists.newArrayList();
    boolean codeChangeReported = false;

    TestCompiler() {
      super();
    }

    @Override
    public void report(JSError error) {
      errors.add(error);
    }

    @Override
    public void reportCodeChange() {
      codeChangeReported = true;
    }

    @Override
    public void ensureLibraryInjected(String name) {
      // no-op
    }

    public boolean hasErrors() {
      return !errors.isEmpty();
    }
  }
}