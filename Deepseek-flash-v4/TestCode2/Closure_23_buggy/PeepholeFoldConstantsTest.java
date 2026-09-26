package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

  private PeepholeFoldConstants peephole;

  @Before
  public void setUp() {
    peephole = new PeepholeFoldConstants();
  }

  @Test
  public void testTypeofStringLiteral() {
    Node n = new Node(Token.TYPEOF, IR.string("hello"));
    assertStringNode("string", peephole.optimizeSubgraph(n));

    Node empty = new Node(Token.TYPEOF, IR.string(""));
    assertStringNode("string", peephole.optimizeSubgraph(empty));
  }

  @Test
  public void testTypeofNumberLiteral() {
    Node n = new Node(Token.TYPEOF, IR.number(0));
    assertStringNode("number", peephole.optimizeSubgraph(n));
  }

  @Test
  public void testTypeofNameIsNotFolded() {
    Node n = new Node(Token.TYPEOF, IR.name("x"));
    assertSame(n, peephole.optimizeSubgraph(n));
  }

  @Test
  public void testFoldStringAddition() {
    Node n = new Node(Token.ADD, IR.string("a"), IR.string("b"));
    assertStringNode("ab", peephole.optimizeSubgraph(n));

    Node emptyLeft = new Node(Token.ADD, IR.string(""), IR.string("x"));
    assertStringNode("x", peephole.optimizeSubgraph(emptyLeft));
  }

  @Test
  public void testFoldNumericAddition() {
    Node n = new Node(Token.ADD, IR.number(1), IR.number(2));
    assertNumberNode(3, peephole.optimizeSubgraph(n));
  }

  @Test
  public void testFoldArithmeticOp() {
    Node n = new Node(Token.SUB, IR.number(5), IR.number(2));
    assertNumberNode(3, peephole.optimizeSubgraph(n));
  }

  @Test
  public void testFoldComparison() {
    Node lt = new Node(Token.LT, IR.number(1), IR.number(2));
    assertBooleanNode(true, peephole.optimizeSubgraph(lt));

    Node gt = new Node(Token.GT, IR.number(1), IR.number(2));
    assertBooleanNode(false, peephole.optimizeSubgraph(gt));
  }

  @Test
  public void testFoldStrictEqualityDifferentTypes() {
    Node n = new Node(Token.SHEQ, IR.number(1), IR.string("1"));
    assertBooleanNode(false, peephole.optimizeSubgraph(n));
  }

  @Test
  public void testFoldLeftShift() {
    Node n = new Node(Token.LSH, IR.number(2), IR.number(3));
    assertNumberNode(16, peephole.optimizeSubgraph(n));

    Node zeroShift = new Node(Token.LSH, IR.number(1), IR.number(0));
    assertNumberNode(1, peephole.optimizeSubgraph(zeroShift));
  }

  private void assertNumberNode(double expected, Node actual) {
    assertNotNull(actual);
    assertEquals("Expected number node", Token.NUMBER, actual.getType());
    assertEquals(expected, actual.getDouble(), 0.0);
  }

  private void assertStringNode(String expected, Node actual) {
    assertNotNull(actual);
    assertEquals("Expected string node", Token.STRING, actual.getType());
    assertEquals(expected, actual.getString());
  }

  private void assertBooleanNode(boolean expected, Node actual) {
    assertNotNull(actual);
    assertTrue(
        "Expected boolean node but was type " + actual.getType(),
        actual.getType() == Token.TRUE || actual.getType() == Token.FALSE);

    int expectedType = expected ? Token.TRUE : Token.FALSE;
    assertEquals("Unexpected boolean node", expectedType, actual.getType());
  }
}