package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class PeepholeSubstituteAlternateSyntaxTest {

  private PeepholeSubstituteAlternateSyntax optimization;
  private Node dummyParent;

  @Before
  public void setUp() {
    optimization = new PeepholeSubstituteAlternateSyntax();
    dummyParent = new Node(Token.SCRIPT);
  }

  @Test
  public void testOptimizeSubtreeReturnWithVoidAndNoSideEffect() {
    Node returnNode = new Node(Token.RETURN);
    Node voidNode = new Node(Token.VOID);
    voidNode.addChildToFront(Node.newString("test"));
    returnNode.addChildToFront(voidNode);
    Node result = optimization.optimizeSubtree(returnNode);
    assertNotNull(result);
    assertEquals(Token.RETURN, result.getType());
    assertNull(result.getFirstChild());
  }

  @Test
  public void testOptimizeSubtreeReturnWithUndefinedName() {
    Node returnNode = new Node(Token.RETURN);
    Node nameNode = Node.newString(Token.NAME, "undefined");
    returnNode.addChildToFront(nameNode);
    Node result = optimization.optimizeSubtree(returnNode);
    assertEquals(Token.RETURN, result.getType());
    assertNull(result.getFirstChild());
  }

  @Test
  public void testOptimizeSubtreeNotWithEq() {
    Node notNode = new Node(Token.NOT);
    Node eqNode = new Node(Token.EQ);
    eqNode.addChildToFront(Node.newString("a"));
    eqNode.addChildToFront(Node.newString("b"));
    notNode.addChildToFront(eqNode);
    dummyParent.addChildToBack(notNode);
    Node result = optimization.optimizeSubtree(notNode);
    assertNotNull(result);
    assertEquals(Token.NE, result.getType());
  }

  @Test
  public void testOptimizeSubtreeNotWithNe() {
    Node notNode = new Node(Token.NOT);
    Node neNode = new Node(Token.NE);
    neNode.addChildToFront(Node.newString("a"));
    neNode.addChildToFront(Node.newString("b"));
    notNode.addChildToFront(neNode);
    dummyParent.addChildToBack(notNode);
    Node result = optimization.optimizeSubtree(notNode);
    assertEquals(Token.EQ, result.getType());
  }

  @Test
  public void testOptimizeSubtreeNotWithSheq() {
    Node notNode = new Node(Token.NOT);
    Node sheqNode = new Node(Token.SHEQ);
    sheqNode.addChildToFront(Node.newString("a"));
    sheqNode.addChildToFront(Node.newString("b"));
    notNode.addChildToFront(sheqNode);
    dummyParent.addChildToBack(notNode);
    Node result = optimization.optimizeSubtree(notNode);
    assertEquals(Token.SHNE, result.getType());
  }

  @Test
  public void testOptimizeSubtreeNotWithShne() {
    Node notNode = new Node(Token.NOT);
    Node shneNode = new Node(Token.SHNE);
    shneNode.addChildToFront(Node.newString("a"));
    shneNode.addChildToFront(Node.newString("b"));
    notNode.addChildToFront(shneNode);
    dummyParent.addChildToBack(notNode);
    Node result = optimization.optimizeSubtree(notNode);
    assertEquals(Token.SHEQ, result.getType());
  }

  @Test
  public void testOptimizeSubtreeNotDefault() {
    Node notNode = new Node(Token.NOT);
    Node nameNode = Node.newString(Token.NAME, "x");
    notNode.addChildToFront(nameNode);
    Node result = optimization.optimizeSubtree(notNode);
    assertSame(notNode, result);
  }

  @Test
  public void testOptimizeSubtreeIfFoldableExpressBlockWithoutNot() {
    Node ifNode = new Node(Token.IF);
    Node cond = Node.newString(Token.NAME, "a");
    Node thenBlock = new Node(Token.BLOCK);
    Node thenExpr = NodeUtil.newExpr(Node.newString("b"));
    thenBlock.addChildToFront(thenExpr);
    ifNode.addChildToFront(cond);
    ifNode.addChildToFront(thenBlock);
    dummyParent.addChildToBack(ifNode);
    Node result = optimization.optimizeSubtree(ifNode);
    assertNotNull(result);
    assertEquals(Token.EXPR_RESULT, result.getType());
    Node andNode = result.getFirstChild();
    assertEquals(Token.AND, andNode.getType());
  }

  @Test
  public void testOptimizeSubtreeIfFoldableExpressBlockWithNot() {
    Node ifNode = new Node(Token.IF);
    Node notCond = new Node(Token.NOT);
    notCond.addChildToFront(Node.newString(Token.NAME, "a"));
    Node thenBlock = new Node(Token.BLOCK);
    Node thenExpr = NodeUtil.newExpr(Node.newString("b"));
    thenBlock.addChildToFront(thenExpr);
    ifNode.addChildToFront(notCond);
    ifNode.addChildToFront(thenBlock);
    dummyParent.addChildToBack(ifNode);
    Node result = optimization.optimizeSubtree(ifNode);
    assertNotNull(result);
    assertEquals(Token.EXPR_RESULT, result.getType());
    Node orNode = result.getFirstChild();
    assertEquals(Token.OR, orNode.getType());
  }

  @Test
  public void testOptimizeSubtreeIfLiteralCondition() {
    Node ifNode = new Node(Token.IF);
    Node trueNode = Node.newNumber(1);
    Node thenBlock = new Node(Token.BLOCK);
    thenBlock.addChildToFront(NodeUtil.newExpr(Node.newString("a")));
    ifNode.addChildToFront(trueNode);
    ifNode.addChildToFront(thenBlock);
    Node result = optimization.optimizeSubtree(ifNode);
    assertSame(ifNode, result);
  }

  @Test
  public void testOptimizeSubtreeIfNotFoldableBlock() {
    Node ifNode = new Node(Token.IF);
    Node cond = Node.newString(Token.NAME, "a");
    Node thenBlock = new Node(Token.BLOCK);
    thenBlock.addChildToFront(new Node(Token.RETURN));
    ifNode.addChildToFront(cond);
    ifNode.addChildToFront(thenBlock);
    Node result = optimization.optimizeSubtree(ifNode);
    assertSame(ifNode, result);
  }

  @Test
  public void testOptimizeSubtreeExprResult() {
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node cond = Node.newString(Token.NAME, "x");
    exprResult.addChildToFront(cond);
    Node result = optimization.optimizeSubtree(exprResult);
    assertSame(exprResult, result);
  }

  @Test
  public void testOptimizeSubtreeHook() {
    Node hookNode = new Node(Token.HOOK);
    Node cond = Node.newString(Token.NAME, "x");
    Node trueNode = Node.newString("y");
    Node falseNode = Node.newString("z");
    hookNode.addChildToFront(cond);
    hookNode.addChildToFront(trueNode);
    hookNode.addChildToFront(falseNode);
    Node result = optimization.optimizeSubtree(hookNode);
    assertSame(hookNode, result);
  }

  @Test
  public void testOptimizeSubtreeWhile() {
    Node whileNode = new Node(Token.WHILE);
    Node cond = Node.newString(Token.NAME, "a");
    whileNode.addChildToFront(cond);
    whileNode.addChildToFront(new Node(Token.BLOCK));
    Node result = optimization.optimizeSubtree(whileNode);
    assertSame(whileNode, result);
  }

  @Test
  public void testOptimizeSubtreeDo() {
    Node doNode = new Node(Token.DO);
    Node cond = Node.newString(Token.NAME, "a");
    doNode.addChildToFront(new Node(Token.BLOCK));
    doNode.addChildToFront(cond);
    Node result = optimization.optimizeSubtree(doNode);
    assertSame(doNode, result);
  }

  @Test
  public void testOptimizeSubtreeForNotForIn() {
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.NAME, "i");
    Node cond = Node.newString(Token.NAME, "a");
    Node incr = new Node(Token.INC);
    forNode.addChildToFront(init);
    forNode.addChildToFront(cond);
    forNode.addChildToFront(incr);
    forNode.addChildToFront(new Node(Token.BLOCK));
    Node result = optimization.optimizeSubtree(forNode);
    assertSame(forNode, result);
  }

  @Test
  public void testOptimizeSubtreeNewStandardObject() {
    Node newNode = new Node(Token.NEW);
    Node name = Node.newString(Token.NAME, "Object");
    newNode.addChildToFront(name);
    Node result = optimization.optimizeSubtree(newNode);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testOptimizeSubtreeCallRegExp() {
    Node callNode = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "RegExp");
    Node pattern = Node.newString(Token.STRING, "test");
    callNode.addChildToFront(name);
    callNode.addChildToFront(pattern);
    Node result = optimization.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.REGEXP, result.getType());
  }

  @Test
  public void testOptimizeSubtreeCallObjectNoArgs() {
    Node callNode = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "Object");
    callNode.addChildToFront(name);
    Node result = optimization.optimizeSubtree(callNode);
    assertEquals(Token.OBJECTLIT, result.getType());
  }

  @Test
  public void testOptimizeSubtreeCallArrayNoArg() {
    Node callNode = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "Array");
    callNode.addChildToFront(name);
    Node result = optimization.optimizeSubtree(callNode);
    assertEquals(Token.ARRAYLIT, result.getType());
    assertEquals(0, result.getChildCount());
  }

  @Test
  public void testOptimizeSubtreeCallArrayWithStringArg() {
    Node callNode = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "Array");
    Node arg = Node.newString(Token.STRING, "a");
    callNode.addChildToFront(name);
    callNode.addChildToFront(arg);
    Node result = optimization.optimizeSubtree(callNode);
    assertEquals(Token.ARRAYLIT, result.getType());
    assertEquals(1, result.getChildCount());
  }

  @Test
  public void testOptimizeSubtreeCallArrayWithZeroArg() {
    Node callNode = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "Array");
    Node arg = Node.newNumber(0);
    callNode.addChildToFront(name);
    callNode.addChildToFront(arg);
    Node result = optimization.optimizeSubtree(callNode);
    assertEquals(Token.ARRAYLIT, result.getType());
    assertEquals(0, result.getChildCount());
  }

  @Test
  public void testOptimizeSubtreeCallArrayWithPositiveNumberArg() {
    Node callNode = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "Array");
    Node arg = Node.newNumber(5);
    callNode.addChildToFront(name);
    callNode.addChildToFront(arg);
    Node result = optimization.optimizeSubtree(callNode);
    assertSame(callNode, result);
  }

  @Test
  public void testOptimizeSubtreeDefault() {
    Node defaultNode = new Node(Token.BREAK);
    Node result = optimization.optimizeSubtree(defaultNode);
    assertSame(defaultNode, result);
  }

  @Test
  public void testTryReduceReturnResultNullSafe() {
    Node returnNode = new Node(Token.RETURN);
    Node result = optimization.optimizeSubtree(returnNode);
    assertNotNull(result);
    assertEquals(Token.RETURN, result.getType());
  }

  @Test
  public void testTryMinimizeConditionNotNot() {
    Node notNode = new Node(Token.NOT);
    Node innerNot = new Node(Token.NOT);
    innerNot.addChildToFront(Node.newString(Token.NAME, "a"));
    notNode.addChildToFront(innerNot);
    dummyParent.addChildToBack(notNode);
    Node result = optimization.optimizeSubtree(notNode);
    assertNotNull(result);
    assertEquals(Token.NAME, result.getType());
  }

  @Test
  public void testTryMinimizeConditionNotAnd() {
    Node notNode = new Node(Token.NOT);
    Node andNode = new Node(Token.AND);
    Node notLeft = new Node(Token.NOT);
    notLeft.addChildToFront(Node.newString(Token.NAME, "a"));
    Node notRight = new Node(Token.NOT);
    notRight.addChildToFront(Node.newString(Token.NAME, "b"));
    andNode.addChildToFront(notLeft);
    andNode.addChildToFront(notRight);
    notNode.addChildToFront(andNode);
    dummyParent.addChildToBack(notNode);
    Node result = optimization.optimizeSubtree(notNode);
    assertNotNull(result);
    assertEquals(Token.OR, result.getType());
  }

  @Test
  public void testTryMinimizeConditionAndShortCircuitLeft() {
    Node andNode = new Node(Token.AND);
    Node left = Node.newString(Token.NAME, "a");
    Node trueNode = Node.newNumber(1);
    andNode.addChildToFront(left);
    andNode.addChildToFront(trueNode);
    dummyParent.addChildToBack(andNode);
    Node result = optimization.optimizeSubtree(andNode);
    assertSame(left, result);
  }

  @Test
  public void testTryMinimizeConditionAndShortCircuitRight() {
    Node andNode = new Node(Token.AND);
    Node falseNode = Node.newNumber(0);
    Node right = Node.newString(Token.NAME, "b");
    andNode.addChildToFront(falseNode);
    andNode.addChildToFront(right);
    dummyParent.addChildToBack(andNode);
    Node result = optimization.optimizeSubtree(andNode);
    assertSame(right, result);
  }

  @Test
  public void testTryMinimizeConditionOrShortCircuitLeft() {
    Node orNode = new Node(Token.OR);
    Node left = Node.newString(Token.NAME, "a");
    Node falseNode = Node.newNumber(0);
    orNode.addChildToFront(left);
    orNode.addChildToFront(falseNode);
    dummyParent.addChildToBack(orNode);
    Node result = optimization.optimizeSubtree(orNode);
    assertSame(left, result);
  }

  @Test
  public void testTryMinimizeConditionOrShortCircuitRight() {
    Node orNode = new Node(Token.OR);
    Node trueNode = Node.newNumber(1);
    Node right = Node.newString(Token.NAME, "b");
    orNode.addChildToFront(trueNode);
    orNode.addChildToFront(right);
    dummyParent.addChildToBack(orNode);
    Node result = optimization.optimizeSubtree(orNode);
    assertSame(right, result);
  }

  @Test
  public void testTryMinimizeConditionHookBothTrueFalse() {
    Node hookNode = new Node(Token.HOOK);
    Node cond = Node.newString(Token.NAME, "a");
    Node trueNode = Node.newNumber(1);
    Node falseNode = Node.newNumber(0);
    hookNode.addChildToFront(cond);
    hookNode.addChildToFront(trueNode);
    hookNode.addChildToFront(falseNode);
    dummyParent.addChildToBack(hookNode);
    Node result = optimization.optimizeSubtree(hookNode);
    assertSame(cond, result);
  }

  @Test
  public void testTryMinimizeConditionHookBothFalseTrue() {
    Node hookNode = new Node(Token.HOOK);
    Node cond = Node.newString(Token.NAME, "a");
    Node trueNode = Node.newNumber(0);
    Node falseNode = Node.newNumber(1);
    hookNode.addChildToFront(cond);
    hookNode.addChildToFront(trueNode);
    hookNode.addChildToFront(falseNode);
    dummyParent.addChildToBack(hookNode);
    Node result = optimization.optimizeSubtree(hookNode);
    assertEquals(Token.NOT, result.getType());
  }

  @Test
  public void testTryMinimizeConditionHookTrueOnly() {
    Node hookNode = new Node(Token.HOOK);
    Node cond = Node.newString(Token.NAME, "a");
    Node trueNode = Node.newNumber(1);
    Node falseNode = Node.newString(Token.NAME, "b");
    hookNode.addChildToFront(cond);
    hookNode.addChildToFront(trueNode);
    hookNode.addChildToFront(falseNode);
    dummyParent.addChildToBack(hookNode);
    Node result = optimization.optimizeSubtree(hookNode);
    assertEquals(Token.OR, result.getType());
  }

  @Test
  public void testTryMinimizeConditionHookFalseOnly() {
    Node hookNode = new Node(Token.HOOK);
    Node cond = Node.newString(Token.NAME, "a");
    Node trueNode = Node.newString(Token.NAME, "b");
    Node falseNode = Node.newNumber(0);
    hookNode.addChildToFront(cond);
    hookNode.addChildToFront(trueNode);
    hookNode.addChildToFront(falseNode);
    dummyParent.addChildToBack(hookNode);
    Node result = optimization.optimizeSubtree(hookNode);
    assertEquals(Token.AND, result.getType());
  }

  @Test
  public void testTryMinimizeConditionDefaultBoolean() {
    Node trueNode = Node.newNumber(1);
    dummyParent.addChildToBack(trueNode);
    Node result = optimization.optimizeSubtree(trueNode);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(1.0, result.getDouble(), 0.0);
  }
}