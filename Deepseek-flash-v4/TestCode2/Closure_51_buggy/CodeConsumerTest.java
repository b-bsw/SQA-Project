package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

public class CodeConsumerTest {

  private TestCodeConsumer consumer;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
  }

  private static class TestCodeConsumer extends CodeConsumer {
    private final StringBuilder code = new StringBuilder();
    private char lastChar = ' ';
    private int lineBreaks = 0;
    private boolean cutLineCalled = false;
    private boolean newLineCalled = false;
    private boolean endLineCalled = false;

    @Override
    char getLastChar() {
      return lastChar;
    }

    @Override
    void append(String str) {
      code.append(str);
      if (str.length() > 0) {
        lastChar = str.charAt(str.length() - 1);
      }
    }

    @Override
    void maybeCutLine() {
      cutLineCalled = true;
    }

    @Override
    void startNewLine() {
      newLineCalled = true;
    }

    @Override
    void endLine() {
      endLineCalled = true;
    }

    String getCode() {
      return code.toString();
    }

    void resetCalls() {
      cutLineCalled = false;
      newLineCalled = false;
      endLineCalled = false;
    }
  }

  @Test
  public void testAddIdentifier_callsAdd() {
    consumer.addIdentifier("foo");
    assertEquals("foo", consumer.getCode());
  }

  @Test
  public void testAppendBlockStartAndEnd() {
    consumer.appendBlockStart();
    consumer.appendBlockEnd();
    assertEquals("{}", consumer.getCode());
    assertEquals('}', consumer.getLastChar());
  }

  @Test
  public void testBeginBlock_statementNeedsEnded_false() {
    consumer.statementNeedsEnded = false;
    consumer.beginBlock();
    assertEquals("{", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
    assertTrue(consumer.endLineCalled);
  }

  @Test
  public void testBeginBlock_statementNeedsEnded_true() {
    consumer.statementStarted = true;
    consumer.statementNeedsEnded = true;
    consumer.resetCalls();
    consumer.beginBlock();
    assertEquals(";{", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
    assertTrue(consumer.cutLineCalled);
    assertTrue(consumer.endLineCalled);
  }

  @Test
  public void testEndBlock_default() {
    consumer.beginBlock();
    consumer.endBlock();
    assertEquals("{}", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
    assertFalse(consumer.endLineCalled);
  }

  @Test
  public void testEndBlock_shouldEndLine_true() {
    consumer.beginBlock();
    consumer.resetCalls();
    consumer.endBlock(true);
    assertEquals("{}", consumer.getCode());
    assertTrue(consumer.endLineCalled);
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testListSeparator() {
    consumer.listSeparator();
    assertEquals(",", consumer.getCode());
    assertTrue(consumer.cutLineCalled);
  }

  @Test
  public void testEndStatement_needSemiColon_true() {
    consumer.statementNeedsEnded = true;
    consumer.endStatement(true);
    assertEquals(";", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
    assertTrue(consumer.cutLineCalled);
  }

  @Test
  public void testEndStatement_needSemiColon_false_statementStarted_true() {
    consumer.statementStarted = true;
    consumer.statementNeedsEnded = false;
    consumer.endStatement(false);
    assertTrue(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_needSemiColon_false_statementStarted_false() {
    consumer.statementStarted = false;
    consumer.statementNeedsEnded = false;
    consumer.endStatement(false);
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testMaybeEndStatement_statementNeedsEnded_true() {
    consumer.statementStarted = true;
    consumer.statementNeedsEnded = true;
    consumer.resetCalls();
    consumer.maybeEndStatement();
    assertEquals(";", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
    assertTrue(consumer.statementStarted);
    assertTrue(consumer.cutLineCalled);
    assertTrue(consumer.endLineCalled);
  }

  @Test
  public void testMaybeEndStatement_statementNeedsEnded_false() {
    consumer.statementNeedsEnded = false;
    consumer.statementStarted = false;
    consumer.resetCalls();
    consumer.maybeEndStatement();
    assertEquals("", consumer.getCode());
    assertTrue(consumer.statementStarted);
    assertFalse(consumer.cutLineCalled);
  }

  @Test
  public void testEndFunction_default() {
    consumer.endFunction();
    assertTrue(consumer.sawFunction);
    assertFalse(consumer.endLineCalled);
  }

  @Test
  public void testEndFunction_statementContext_true() {
    consumer.resetCalls();
    consumer.endFunction(true);
    assertTrue(consumer.sawFunction);
    assertTrue(consumer.endLineCalled);
  }

  @Test
  public void testBeginCaseBody() {
    consumer.beginCaseBody();
    assertEquals(":", consumer.getCode());
  }

  @Test
  public void testAdd_emptyString_doesNothing() {
    consumer.add("");
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testAdd_wordCharBothSides_addsSpace() {
    consumer.lastChar = 'a';
    consumer.add("b");
    assertEquals(" b", consumer.getCode());
    assertEquals('b', consumer.getLastChar());
  }

  @Test
  public void testAdd_wordCharAndBackslash_addsSpace() {
    consumer.lastChar = 'a';
    consumer.add("\\b");
    assertEquals(" \\b", consumer.getCode());
    assertEquals('b', consumer.getLastChar());
  }

  @Test
  public void testAdd_nonWordCharAfterWordChar_noSpace() {
    consumer.lastChar = 'a';
    consumer.add("(");
    assertEquals("(", consumer.getCode());
    assertEquals('(', consumer.getLastChar());
  }

  @Test
  public void testAddOp_plusPlus_prevPlus_addsSpaceBefore() {
    consumer.lastChar = '+';
    consumer.addOp("+", false);
    assertEquals(" +", consumer.getCode());
  }

  @Test
  public void testAddOp_minusMinus_prevMinus_addsSpaceBefore() {
    consumer.lastChar = '-';
    consumer.addOp("-", false);
    assertEquals(" -", consumer.getCode());
  }

  @Test
  public void testAddOp_letterFirst_wordCharPrev_addsSpaceBefore() {
    consumer.lastChar = 'a';
    consumer.addOp("instanceof", false);
    assertEquals(" instanceof", consumer.getCode());
  }

  @Test
  public void testAddOp_arrow_prevMinus_addsSpaceBefore() {
    consumer.lastChar = '-';
    consumer.addOp(">", false);
    assertEquals(" ->", consumer.getCode());
  }

  @Test
  public void testAddOp_otherOp_noSpaceBefore() {
    consumer.lastChar = 'a';
    consumer.addOp("+", false);
    assertEquals("+", consumer.getCode());
  }

  @Test
  public void testAddOp_binOp_True_maybeCutLineCalled() {
    consumer.resetCalls();
    consumer.lastChar = 'a';
    consumer.addOp("+", true);
    assertTrue(consumer.cutLineCalled);
  }

  @Test
  public void testAddOp_binOp_False_maybeCutLineNotCalled() {
    consumer.resetCalls();
    consumer.lastChar = 'a';
    consumer.addOp("+", false);
    assertFalse(consumer.cutLineCalled);
  }

  @Test
  public void testAddNumber_negativeWithMinusPrev_addsSpace() {
    consumer.lastChar = '-';
    consumer.addNumber(-4);
    assertEquals(" -4", consumer.getCode());
  }

  @Test
  public void testAddNumber_positiveInteger() {
    consumer.addNumber(42);
    assertEquals("42", consumer.getCode());
  }

  @Test
  public void testAddNumber_negativeNoMinusPrev() {
    consumer.lastChar = 'x';
    consumer.addNumber(-4);
    assertEquals("-4", consumer.getCode());
  }

  @Test
  public void testAddNumber_largeIntegerScientificNotation() {
    consumer.addNumber(1000000);
    assertEquals("1E6", consumer.getCode());
  }

  @Test
  public void testAddNumber_double() {
    consumer.addNumber(3.14);
    assertEquals("3.14", consumer.getCode());
  }

  @Test
  public void testAddNumber_largeDoubleScientificNotation() {
    consumer.addNumber(1.0e6);
    assertEquals("1.0E6", consumer.getCode());
  }

  @Test
  public void testIsWordChar_underscore_true() {
    assertTrue(CodeConsumer.isWordChar('_'));
  }

  @Test
  public void testIsWordChar_dollar_true() {
    assertTrue(CodeConsumer.isWordChar('$'));
  }

  @Test
  public void testIsWordChar_letter_true() {
    assertTrue(CodeConsumer.isWordChar('a'));
  }

  @Test
  public void testIsWordChar_digit_true() {
    assertTrue(CodeConsumer.isWordChar('1'));
  }

  @Test
  public void testIsWordChar_symbol_false() {
    assertFalse(CodeConsumer.isWordChar('+'));
  }

  @Test
  public void testShouldPreserveExtraBlocks_defaultFalse() {
    assertFalse(consumer.shouldPreserveExtraBlocks());
  }

  @Test
  public void testBreakAfterBlockFor_statementContextTrue() {
    assertTrue(consumer.breakAfterBlockFor(new Node(1), true));
  }

  @Test
  public void testBreakAfterBlockFor_statementContextFalse() {
    assertFalse(consumer.breakAfterBlockFor(new Node(1), false));
  }

  @Test
  public void testStartSourceMapping_noOp() {
    consumer.startSourceMapping(new Node(1));
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testEndSourceMapping_noOp() {
    consumer.endSourceMapping(new Node(1));
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testContinueProcessing_returnsTrue() {
    assertTrue(consumer.continueProcessing());
  }

  @Test
  public void testStartNewLine_noOp() {
    consumer.startNewLine();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testEndFile_noOp() {
    consumer.endFile();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testNotePreferredLineBreak_noOp() {
    consumer.notePreferredLineBreak();
    assertEquals("", consumer.getCode());
  }
}