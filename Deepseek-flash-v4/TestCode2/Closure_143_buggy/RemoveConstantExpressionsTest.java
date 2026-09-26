package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class RemoveConstantExpressionsTest {

  // ---------------------------------------------------------------------------
  // Tests for RemoveConstantExpressions.process()
  // ---------------------------------------------------------------------------

  @Test
  public void testProcessRemovesConstantExpression() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    Node root = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(Node.newNumber(1.0));
    root.addChildToBack(exprResult);
    pass.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessKeepsExpressionWithSideEffect() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    Node root = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node call = new Node(Token.CALL);
    call.addChildToBack(new Node(Token.NAME, "foo"));
    exprResult.addChildToBack(call);
    root.addChildToBack(exprResult);
    pass.process(null, root);
    assertEquals(1, root.getChildCount());
    assertSame(exprResult, root.getFirstChild());
  }

  @Test
  public void testProcessReplacesExpressionWithSideEffectSubexpression() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    Node root = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node add = new Node(Token.ADD);
    Node number = Node.newNumber(1);
    Node call = new Node(Token.CALL);
    call.addChildToBack(new Node(Token.NAME, "foo"));
    add.addChildToBack(number);
    add.addChildToBack(call);
    exprResult.addChildToBack(add);
    root.addChildToBack(exprResult);
    pass.process(null, root);
    // Should be replaced with one EXPR_RESULT containing the call
    assertEquals(1, root.getChildCount());
    Node newExpr = root.getFirstChild();
    assertEquals(Token.EXPR_RESULT, newExpr.getType());
    assertEquals(Token.CALL, newExpr.getFirstChild().getType());
  }

  @Test
  public void testProcessIgnoresNonExpressionResult() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    Node root = new Node(Token.SCRIPT);
    Node varDecl = new Node(Token.VAR);
    varDecl.addChildToBack(new Node(Token.NAME, "x"));
    root.addChildToBack(varDecl);
    pass.process(null, root);
    assertEquals(1, root.getChildCount());
    assertSame(varDecl, root.getFirstChild());
  }

  // ---------------------------------------------------------------------------
  // Tests for RemoveConstantRValuesCallback
  // ---------------------------------------------------------------------------

  @Test
  public void testVisitNonExprResultDoesNothing() {
    RemoveConstantRValuesCallback cb = new RemoveConstantRValuesCallback();
    Node parent = new Node(Token.SCRIPT);
    Node node = new Node(Token.NAME, "x");
    parent.addChildToBack(node);
    cb.visit(null, node, parent);
    assertSame(node, parent.getFirstChild());
    assertFalse(cb.getResult().changed);
  }

  @Test
  public void testVisitExprResultWithoutSideEffectReplaces() {
    RemoveConstantRValuesCallback cb = new RemoveConstantRValuesCallback();
    Node parent = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(Node.newNumber(1.0));
    parent.addChildToBack(exprResult);
    cb.visit(null, exprResult, parent);
    // node removed (no side effect subexpression)
    assertNull(parent.getFirstChild());
    assertTrue(cb.getResult().changed);
  }

  @Test
  public void testVisitExprResultWithSideEffectDoesNothing() {
    RemoveConstantRValuesCallback cb = new RemoveConstantRValuesCallback();
    Node parent = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node call = new Node(Token.CALL);
    call.addChildToBack(new Node(Token.NAME, "foo"));
    exprResult.addChildToBack(call);
    parent.addChildToBack(exprResult);
    cb.visit(null, exprResult, parent);
    assertSame(exprResult, parent.getFirstChild());
    assertFalse(cb.getResult().changed);
  }

  @Test
  public void testVisitExprResultWithSideEffectSubexpressionReplaces() {
    RemoveConstantRValuesCallback cb = new RemoveConstantRValuesCallback();
    Node parent = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node add = new Node(Token.ADD);
    Node number = Node.newNumber(1);
    Node call = new Node(Token.CALL);
    call.addChildToBack(new Node(Token.NAME, "foo"));
    add.addChildToBack(number);
    add.addChildToBack(call);
    exprResult.addChildToBack(add);
    parent.addChildToBack(exprResult);
    cb.visit(null, exprResult, parent);
    // Should be replaced with one EXPR_RESULT containing the call
    assertEquals(1, parent.getChildCount());
    Node newExpr = parent.getFirstChild();
    assertEquals(Token.EXPR_RESULT, newExpr.getType());
    assertEquals(Token.CALL, newExpr.getFirstChild().getType());
    assertTrue(cb.getResult().changed);
  }

  @Test
  public void testGetResultInitiallyFalse() {
    RemoveConstantRValuesCallback cb = new RemoveConstantRValuesCallback();
    assertFalse(cb.getResult().changed);
  }
}