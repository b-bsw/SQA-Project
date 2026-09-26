package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PeepholeSubstituteAlternateSyntaxTest {

  private PeepholeSubstituteAlternateSyntax optimizer;
  private PeepholeSubstituteAlternateSyntax lateOptimizer;

  @Before
  public void setUp() {
    optimizer = new PeepholeSubstituteAlternateSyntax(false);
    lateOptimizer = new PeepholeSubstituteAlternateSyntax(true);
  }

  @After
  public void tearDown() {
    optimizer = null;
    lateOptimizer = null;
  }

  @Test(expected = NullPointerException.class)
  public void testOptimizeSubtreeNull() {
    optimizer.optimizeSubtree(null);
  }

  @Test
  public void testFoldStringCallWithLiteral() {
    Node call = IR.call(IR.name("String"), IR.string("x"));
    Node parent = IR.exprResult(call);

    Node result = optimizer.optimizeSubtree(call);

    assertEquals(Token.ADD, parent.getFirstChild().getType());
    assertSame(parent.getFirstChild(), result);
    assertEquals("", result.getFirstChild().getString());
    assertEquals("x", result.getLastChild().getString());
  }

  @Test
  public void testDoNotFoldStringCallWithNonLiteral() {
    Node arg = IR.name("x");
    Node call = IR.call(IR.name("String"), arg);
    Node parent = IR.exprResult(call);

    Node result = optimizer.optimizeSubtree(call);

    assertSame(call, result);
    assertEquals(Token.CALL, parent.getFirstChild().getType());
  }

  @Test
  public void testDoNotFoldStringCallWithMultipleArgs() {
    Node call = IR.call(IR.name("String"), IR.string("a"), IR.string("b"));
    Node parent = IR.exprResult(call);

    Node result = optimizer.optimizeSubtree(call);

    assertSame(call, result);
    assertEquals(Token.CALL, parent.getFirstChild().getType());
  }

  @Test
  public void testReduceReturnUndefined() {
    Node ret = new Node(Token.RETURN, IR.name("undefined"));

    optimizer.optimizeSubtree(ret);

    assertFalse(ret.hasChildren());
  }

  @Test
  public void testReduceReturnVoidZero() {
    Node voidNode = new Node(Token.VOID, IR.number(0));
    Node ret = new Node(Token.RETURN, voidNode);

    optimizer.optimizeSubtree(ret);

    assertFalse(ret.hasChildren());
  }

  @Test
  public void testEmptyReturnUnchanged() {
    Node ret = new Node(Token.RETURN);

    optimizer.optimizeSubtree(ret);

    assertFalse(ret.hasChildren());
  }

  @Test
  public void testSplitCommaWhenLateTrue() {
    Node left = IR.name("a");
    Node right = IR.name("b");
    Node comma = new Node(Token.COMMA, left, right);
    Node expr = IR.exprResult(comma);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(expr);

    Node result = lateOptimizer.optimizeSubtree(comma);

    assertEquals(2, script.getChildCount());
    assertSame(expr, script.getFirstChild());
    assertSame(left, expr.getFirstChild());
    assertSame(right, script.getLastChild().getFirstChild());
    assertSame(left, result);
  }

  @Test
  public void testSplitCommaWhenLateFalse() {
    Node left = IR.name("a");
    Node right = IR.name("b");
    Node comma = new Node(Token.COMMA, left, right);
    Node expr = IR.exprResult(comma);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(expr);

    Node result = optimizer.optimizeSubtree(comma);

    assertEquals(1, script.getChildCount());
    assertSame(comma, expr.getFirstChild());
    assertSame(comma, result);
  }

  @Test
  public void testCallToUnknownFunctionUnchanged() {
    Node call = IR.call(IR.name("foo"), IR.name("a"));
    Node parent = IR.exprResult(call);

    Node result = optimizer.optimizeSubtree(call);

    assertSame(call, result);
    assertEquals(Token.CALL, parent.getFirstChild().getType());
  }

  @Test
  public void testNewArrayUnchangedWithoutAstNormalization() {
    Node target = IR.name("Array");
    Node newExpr = new Node(Token.NEW, target);
    Node parent = IR.exprResult(newExpr);

    Node result = optimizer.optimizeSubtree(newExpr);

    assertNotNull(result);
    assertEquals(Token.NEW, result.getType());
  }

  @Test
  public void testUndefinedNameNotReplacedWhenNotNormalized() {
    Node n = IR.name("undefined");
    Node parent = IR.exprResult(n);

    Node result = optimizer.optimizeSubtree(n);

    assertSame(n, result);
    assertEquals(Token.NAME, parent.getFirstChild().getType());
  }
}