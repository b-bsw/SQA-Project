package com.google.javascript.rhino;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IRTest {

  @Test
  public void testLeafLiterals() {
    assertEquals(Token.EMPTY, IR.empty().getType());
    assertEquals(Token.THIS, IR.thisNode().getType());
    assertEquals(Token.TRUE, IR.trueNode().getType());
    assertEquals(Token.FALSE, IR.falseNode().getType());
    assertEquals(Token.NULL, IR.nullNode().getType());
    assertEquals(Token.BREAK, IR.breakNode().getType());
    assertEquals(Token.CONTINUE, IR.continueNode().getType());
    assertEquals(Token.RETURN, IR.returnNode().getType());
  }

  @Test
  public void testNameStringNumberAndLabel() {
    Node name = IR.name("x");
    assertEquals(Token.NAME, name.getType());
    assertEquals("x", name.getString());

    Node str = IR.string("s");
    assertEquals(Token.STRING, str.getType());
    assertEquals("s", str.getString());

    Node key = IR.stringKey("k");
    assertEquals(Token.STRING_KEY, key.getType());
    assertEquals("k", key.getString());

    Node num = IR.number(1.5);
    assertEquals(Token.NUMBER, num.getType());
    assertEquals(1.5, num.getDouble(), 0.0);

    Node label = IR.labelName("loop");
    assertEquals(Token.LABEL_NAME, label.getType());
    assertEquals("loop", label.getString());
  }

  @Test
  public void testParamList() {
    Node empty = IR.paramList();
    assertEquals(Token.PARAM_LIST, empty.getType());
    assertEquals(0, empty.getChildCount());

    Node one = IR.paramList(IR.name("a"));
    assertEquals(1, one.getChildCount());
    assertEquals(Token.NAME, one.getFirstChild().getType());

    Node many = IR.paramList(IR.name("a"), IR.name("b"), IR.name("c"));
    assertEquals(3, many.getChildCount());

    Node fromList = IR.paramList(Arrays.asList(IR.name("x"), IR.name("y")));
    assertEquals(2, fromList.getChildCount());

    Node fromEmptyList = IR.paramList(Collections.<Node>emptyList());
    assertEquals(0, fromEmptyList.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testParamListRejectsNonName() {
    IR.paramList(IR.block());
  }

  @Test
  public void testBlockAndScript() {
    Node block = IR.block();
    assertEquals(Token.BLOCK, block.getType());
    assertEquals(0, block.getChildCount());

    Node stmt = IR.exprResult(IR.number(1));
    Node withStmt = IR.block(stmt);
    assertEquals(1, withStmt.getChildCount());
    assertSame(stmt, withStmt.getFirstChild());

    Node three = IR.block(stmt, stmt, stmt);
    assertEquals(3, three.getChildCount());

    Node emptyVarargs = IR.block(new Node[0]);
    assertEquals(Token.BLOCK, emptyVarargs.getType());
    assertEquals(0, emptyVarargs.getChildCount());

    Node script = IR.script(stmt);
    assertEquals(Token.SCRIPT, script.getType());
    assertEquals(1, script.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testBlockRejectsExpression() {
    IR.block(IR.number(1));
  }

  @Test
  public void testVar() {
    Node simple = IR.var(IR.name("x"));
    assertEquals(Token.VAR, simple.getType());
    assertEquals(1, simple.getChildCount());
    assertEquals(Token.NAME, simple.getFirstChild().getType());

    Node name = IR.name("y");
    Node value = IR.number(2);
    Node withValue = IR.var(name, value);
    assertEquals(Token.VAR, withValue.getType());
    assertSame(name, withValue.getFirstChild());
    assertTrue(name.hasChildren());
    assertSame(value, name.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testVarRejectsBlockValue() {
    IR.var(IR.name("x"), IR.block());
  }

  @Test
  public void testFunction() {
    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals(3, fn.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionRejectsInvalidName() {
    IR.function(IR.number(1), IR.paramList(), IR.block());
  }

  @Test
  public void testReturnThrowExprResult() {
    Node ret = IR.returnNode(IR.name("x"));
    assertEquals(Token.RETURN, ret.getType());
    assertEquals(1, ret.getChildCount());

    Node thr = IR.throwNode(IR.name("e"));
    assertEquals(Token.THROW, thr.getType());

    Node expr = IR.exprResult(IR.number(1));
    assertEquals(Token.EXPR_RESULT, expr.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testReturnRejectsBlock() {
    IR.returnNode(IR.block());
  }

  @Test
  public void testIf() {
    Node cond = IR.trueNode();
    Node thenBlock = IR.block();
    Node simple = IR.ifNode(cond, thenBlock);
    assertEquals(Token.IF, simple.getType());
    assertEquals(2, simple.getChildCount());

    Node elseBlock = IR.block();
    Node withElse = IR.ifNode(cond, thenBlock, elseBlock);
    assertEquals(Token.IF, withElse.getType());
    assertEquals(3, withElse.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testIfRejectsNonBlockThen() {
    IR.ifNode(IR.trueNode(), IR.empty());
  }

  @Test
  public void testDoAndForIn() {
    Node doNode = IR.doNode(IR.block(), IR.trueNode());
    assertEquals(Token.DO, doNode.getType());
    assertEquals(2, doNode.getChildCount());

    Node forIn = IR.forIn(IR.name("x"), IR.name("obj"), IR.block());
    assertEquals(Token.FOR, forIn.getType());
    assertEquals(3, forIn.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testForInRejectsBlockTarget() {
    IR.forIn(IR.block(), IR.name("obj"), IR.block());
  }

  @Test
  public void testFor() {
    Node init = IR.var(IR.name("i"), IR.number(0));
    Node cond = IR.name("i");
    Node incr = IR.number(1);
    Node body = IR.block();
    Node forNode = IR.forNode(init, cond, incr, body);
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(4, forNode.getChildCount());

    Node emptyFor = IR.forNode(IR.empty(), IR.empty(), IR.empty(), IR.block());
    assertEquals(Token.FOR, emptyFor.getType());
    assertEquals(4, emptyFor.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testForRejectsNonBlockBody() {
    IR.forNode(IR.empty(), IR.empty(), IR.empty(), IR.empty());
  }

  @Test
  public void testSwitchCaseAndDefault() {
    Node caseNode = IR.caseNode(IR.number(1), IR.block());
    assertEquals(Token.CASE, caseNode.getType());
    assertEquals(2, caseNode.getChildCount());

    Node defaultNode = IR.defaultCase(IR.block());
    assertEquals(Token.DEFAULT_CASE, defaultNode.getType());

    Node switchNode = IR.switchNode(IR.name("x"), caseNode, defaultNode);
    assertEquals(Token.SWITCH, switchNode.getType());
    assertEquals(3, switchNode.getChildCount());
  }

  @Test
  public void testLabelAndBranches() {
    Node labelName = IR.labelName("loop");
    Node label = IR.label(labelName, IR.block());
    assertEquals(Token.LABEL, label.getType());
    assertEquals(2, label.getChildCount());

    Node br = IR.breakNode(labelName);
    assertEquals(Token.BREAK, br.getType());
    assertSame(labelName, br.getFirstChild());

    Node cont = IR.continueNode(labelName);
    assertEquals(Token.CONTINUE, cont.getType());
    assertSame(labelName, cont.getFirstChild());
  }

  @Test
  public void testGetPropGetElemAssignHook() {
    Node target = IR.name("obj");
    Node prop = IR.name("prop");
    Node getProp = IR.getprop(target, prop);
    assertEquals(Token.GETPROP, getProp.getType());
    assertEquals(2, getProp.getChildCount());

    Node getElem = IR.getelem(target, prop);
    assertEquals(Token.GETELEM, getElem.getType());
    assertEquals(2, getElem.getChildCount());

    Node assign = IR.assign(target, prop);
    assertEquals(Token.ASSIGN, assign.getType());

    Node hook = IR.hook(IR.trueNode(), target, prop);
    assertEquals(Token.HOOK, hook.getType());
    assertEquals(3, hook.getChildCount());
  }

  @Test
  public void testBinaryOperators() {
    Node a = IR.name("a");
    Node b = IR.name("b");

    assertEquals(Token.ADD, IR.add(a, b).getType());
    assertEquals(Token.SUB, IR.sub(a, b).getType());
    assertEquals(Token.AND, IR.and(a, b).getType());
    assertEquals(Token.OR, IR.or(a, b).getType());
    assertEquals(Token.EQ, IR.eq(a, b).getType());
    assertEquals(Token.SHEQ, IR.sheq(a, b).getType());
    assertEquals(Token.COMMA, IR.comma(a, b).getType());
  }

  @Test
  public void testUnaryOperators() {
    Node value = IR.name("x");

    assertEquals(Token.NOT, IR.not(value).getType());
    assertEquals(Token.NEG, IR.neg(value).getType());
    assertEquals(Token.POS, IR.pos(value).getType());
    assertEquals(Token.VOID, IR.voidNode(value).getType());
  }

  @Test
  public void testCallAndNew() {
    Node target = IR.name("f");
    Node arg = IR.name("x");

    Node call = IR.call(target, arg);
    assertEquals(Token.CALL, call.getType());
    assertEquals(2, call.getChildCount());

    Node newNode = IR.newNode(target, arg);
    assertEquals(Token.NEW, newNode.getType());
    assertEquals(2, newNode.getChildCount());
  }

  @Test
  public void testArrayObjectAndRegexp() {
    Node key = IR.propdef(IR.stringKey("a"), IR.number(1));
    assertEquals(Token.STRING_KEY, key.getType());
    assertTrue(key.hasChildren());

    Node object = IR.objectlit(key);
    assertEquals(Token.OBJECTLIT, object.getType());
    assertEquals(1, object.getChildCount());

    Node array = IR.arraylit(IR.number(1), IR.number(2));
    assertEquals(Token.ARRAYLIT, array.getType());
    assertEquals(2, array.getChildCount());

    Node regexp = IR.regexp(IR.string("a"));
    assertEquals(Token.REGEXP, regexp.getType());
    assertEquals(1, regexp.getChildCount());

    Node regexpWithFlags = IR.regexp(IR.string("a"), IR.string("g"));
    assertEquals(Token.REGEXP, regexpWithFlags.getType());
    assertEquals(2, regexpWithFlags.getChildCount());
  }
}