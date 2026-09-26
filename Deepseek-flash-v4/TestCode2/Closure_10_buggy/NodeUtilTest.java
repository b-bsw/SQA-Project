package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.lang.reflect.Method;
import org.junit.Test;

public class NodeUtilTest {

  @Test
  public void testIsAssignmentOp() {
    Node assign = new Node(Token.ASSIGN, IR.name("x"), IR.number(1));
    Node add = new Node(Token.ADD, IR.name("a"), IR.name("b"));

    assertTrue(NodeUtil.isAssignmentOp(assign));
    assertFalse(NodeUtil.isAssignmentOp(add));
    assertFalse(NodeUtil.isAssignmentOp(IR.number(0)));
  }

  @Test
  public void testIsLValue() {
    Node assign = new Node(Token.ASSIGN, IR.name("x"), IR.number(1));
    assertTrue(NodeUtil.isLValue(assign.getFirstChild()));
    assertFalse(NodeUtil.isLValue(assign.getLastChild()));

    Node varName = IR.name("y");
    new Node(Token.VAR, varName);
    assertTrue(NodeUtil.isLValue(varName));

    assertFalse(NodeUtil.isLValue(IR.name("z")));
  }

  @Test
  public void testNewVarNode() {
    Node withValue = NodeUtil.newVarNode("x", IR.number(1.5));
    assertEquals(Token.NAME, withValue.getType());
    assertEquals("x", withValue.getString());
    assertNotNull(withValue.getFirstChild());
    assertEquals(1.5, withValue.getFirstChild().getDouble(), 0.0);

    Node withoutValue = NodeUtil.newVarNode("y", null);
    assertEquals("y", withoutValue.getString());
    assertNull(withoutValue.getFirstChild());
  }

  @Test
  public void testIsValidQualifiedName() {
    assertTrue(NodeUtil.isValidQualifiedName("a"));
    assertTrue(NodeUtil.isValidQualifiedName("a.b"));

    assertFalse(NodeUtil.isValidQualifiedName(""));
    assertFalse(NodeUtil.isValidQualifiedName(null));
    assertFalse(NodeUtil.isValidQualifiedName("."));
    assertFalse(NodeUtil.isValidQualifiedName("a..b"));
    assertFalse(NodeUtil.isValidQualifiedName("a."));
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(IR.string("s")));
    assertTrue(NodeUtil.isImmutableValue(IR.number(1)));
    assertTrue(NodeUtil.isImmutableValue(IR.trueNode()));
    assertTrue(NodeUtil.isImmutableValue(IR.name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(IR.name("x")));
  }

  @Test
  public void testFunctionNodeHelpers() {
    Node fn = IR.function(
        IR.name("foo"),
        IR.paramList(IR.name("a")),
        IR.block());

    assertEquals("foo", NodeUtil.getNearestFunctionName(fn));
    assertNull(NodeUtil.getNearestFunctionName(IR.name("x")));

    Node params = NodeUtil.getFunctionParameters(fn);
    assertNotNull(params);
    assertEquals(1, params.getChildCount());
    assertEquals("a", params.getFirstChild().getString());
  }

  @Test
  public void testSourceMethodsWithoutSourceInfo() {
    Node n = IR.name("x");

    assertNull(NodeUtil.getSourceName(n));
    assertNull(NodeUtil.getSourceFile(n));
    assertNull(NodeUtil.getInputId(n));
  }

  @Test
  public void testStrWhiteSpaceCharViaReflection() throws Exception {
    assertTrue(isWhiteSpace(' '));
    assertTrue(isWhiteSpace('\n'));
    assertTrue(isWhiteSpace('\t'));
    assertFalse(isWhiteSpace('a'));
  }

  private static boolean isWhiteSpace(int c) throws Exception {
    Method method = NodeUtil.class.getDeclaredMethod("isStrWhiteSpaceChar", int.class);
    method.setAccessible(true);
    Object result = method.invoke(null, c);

    if (result instanceof Boolean) {
      return ((Boolean) result).booleanValue();
    }

    // Supports versions where the method returns TernaryValue.
    return result == TernaryValue.TRUE;
  }
}