package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

  private RecordingCodeConsumer consumer;
  private CodeGenerator generator;

  @Before
  public void setUp() {
    consumer = new RecordingCodeConsumer();
    generator = new CodeGenerator(consumer);
  }

  @Test
  public void tagAsStrict_addsStrictDirective() {
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.getCode());
  }

  @Test
  public void addNumberLiteral() {
    generator.add(Node.newNumber(42));
    assertEquals("42", consumer.getCode());
  }

  @Test
  public void addNegativeNumberLiteral() {
    generator.add(new Node(Token.NEG, Node.newNumber(5)));
    assertEquals("-5", consumer.getCode());
  }

  @Test
  public void addThisNode() {
    generator.add(new Node(Token.THIS));
    assertEquals("this", consumer.getCode());
  }

  @Test
  public void addName() {
    generator.add(Node.newString(Token.NAME, "foo"));
    assertEquals("foo", consumer.getCode());
  }

  @Test
  public void addStringLiteral() {
    generator.add(Node.newString("hello"));
    assertEquals("\"hello\"", consumer.getCode());
  }

  @Test
  public void addNullLiteral() {
    generator.add(new Node(Token.NULL));
    assertEquals("null", consumer.getCode());
  }

  @Test
  public void addEmptyNode() {
    generator.add(new Node(Token.EMPTY));
    assertEquals("", consumer.getCode());
  }

  @Test
  public void continueProcessing_false_writesNothing() {
    consumer.setContinueProcessing(false);
    generator.add(Node.newNumber(42));
    assertEquals("", consumer.getCode());
  }

  @Test(expected = IllegalStateException.class)
  public void addBinaryOperatorWithWrongChildCount_throws() {
    Node binary = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    binary.addChildToBack(Node.newNumber(3));
    generator.add(binary);
  }

  @Test
  public void constructorWithCharset_doesNotThrow() {
    CodeGenerator g = new CodeGenerator(consumer, Charset.forName("UTF-8"));
    assertNotNull(g);
  }

  private static final class RecordingCodeConsumer extends CodeConsumer {
    private final StringBuilder code = new StringBuilder();
    private boolean continueProcessing = true;

    public void add(String str) {
      code.append(str);
    }

    public void addIdentifier(String identifier) {
      code.append(identifier);
    }

    public void addOp(String op, boolean binPreservesGroup) {
      code.append(op);
    }

    public void addNumber(double number) {
      code.append(formatNumber(number));
    }

    public void startSourceMapping(Node node) {
    }

    public void endSourceMapping(Node node) {
    }

    public void beginBlock() {
      code.append('{');
    }

    public void endBlock() {
      code.append('}');
    }

    public void endStatement() {
      code.append(';');
    }

    public void endStatement(boolean needSemiColon) {
      code.append(';');
    }

    public void beginCaseBody() {
      code.append(':');
    }

    public void endCaseBody() {
    }

    public boolean shouldPreserveExtraBlocks() {
      return false;
    }

    public boolean continueProcessing() {
      return continueProcessing;
    }

    void setContinueProcessing(boolean value) {
      this.continueProcessing = value;
    }

    String getCode() {
      return code.toString();
    }

    private static String formatNumber(double d) {
      if (d == Math.rint(d) && !Double.isInfinite(d) && Math.abs(d) < 1e15) {
        return String.valueOf((long) d);
      }
      return Double.toString(d);
    }
  }
}