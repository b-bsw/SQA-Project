package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

public class NodeUtilTest {

  private Node createFunction(String name, String... params) {
    Node nameNode = name == null ? IR.empty() : IR.name(name);
    Node paramList = new Node(Token.PARAM_LIST);
    for (String param : params) {
      paramList.addChildToBack(new Node(Token.NAME, param));
    }
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(nameNode);
    fn.addChildToBack(paramList);
    fn.addChildToBack(body);
    return fn;
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar(-1));
  }

  @Test
  public void testIsValidQualifiedName() {
    assertTrue(NodeUtil.isValidQualifiedName("a"));
    assertTrue(NodeUtil.isValidQualifiedName("a.b"));
    assertTrue(NodeUtil.isValidQualifiedName("$_.abc"));
    assertFalse(NodeUtil.isValidQualifiedName(""));
    assertFalse(NodeUtil.isValidQualifiedName(".a"));
    assertFalse(NodeUtil.isValidQualifiedName("a."));
    assertFalse(NodeUtil.isValidQualifiedName("a..b"));
  }

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_LSH)));
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.EQ)));
  }

  @Test
  public void testIsSimpleOperator() {
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.MUL)));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.CALL)));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.NAME)));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("1", NodeUtil.getStringValue(1.0));
    assertEquals("1.5", NodeUtil.getStringValue(1.5));
    assertEquals("NaN", NodeUtil.getStringValue(Double.NaN));
    assertEquals("Infinity", NodeUtil.getStringValue(Double.POSITIVE_INFINITY));
    assertEquals("-Infinity", NodeUtil.getStringValue(Double.NEGATIVE_INFINITY));
  }

  @Test
  public void testGetNearestFunctionName() {
    Node named = createFunction("foo");
    assertEquals("foo", NodeUtil.getNearestFunctionName(named));

    Node anonymous = createFunction(null);
    assertNull(NodeUtil.getNearestFunctionName(anonymous));
  }

  @Test
  public void testGetFunctionParameters() {
    Node fn = createFunction("f", "a", "b");
    Node params = NodeUtil.getFunctionParameters(fn);
    assertNotNull(params);
    assertEquals(2, params.getChildCount());
    assertEquals("a", params.getFirstChild().getString());
    assertEquals("b", params.getLastChild().getString());
  }

  @Test
  public void testIsLValue() {
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(IR.name("x"));
    assign.addChildToBack(IR.number(0));

    assertTrue(NodeUtil.isLValue(assign.getFirstChild()));
    assertFalse(NodeUtil.isLValue(IR.name("x")));
  }

  @Test
  public void testGetSourceName() {
    Node n = IR.name("x");
    n.setSourceName("test.js");
    assertEquals("test.js", NodeUtil.getSourceName(n));
  }

  @Test
  public void testGetInputId() {
    Node n = IR.name("x");
    assertNull(NodeUtil.getInputId(n));
  }

  @Test
  public void testGetFunctionJSDocInfo() {
    Node fn = createFunction("foo");
    JSDocInfo info = NodeUtil.getFunctionJSDocInfo(fn);
    assertNull(info);
  }

  @Test
  public void testEvaluatesToLocalValueForImmutableNodes() {
    assertTrue(NodeUtil.evaluatesToLocalValue(IR.number(1)));
    assertTrue(NodeUtil.evaluatesToLocalValue(IR.string("foo")));
    assertFalse(NodeUtil.evaluatesToLocalValue(IR.name("x")));
  }
}