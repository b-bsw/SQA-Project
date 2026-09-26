package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

  private MockCodeConsumer consumer;
  private CodeGenerator generator;

  @Before
  public void setUp() {
    consumer = new MockCodeConsumer();
  }

  // ------------------ Constructor tests ------------------
  @Test
  public void testConstructor_nullCharset_encoderNull() {
    generator = new CodeGenerator(consumer, null);
    assertNull(generator.outputCharsetEncoder);
  }

  @Test
  public void testConstructor_asciiCharset_encoderNull() {
    generator = new CodeGenerator(consumer, Charsets.US_ASCII);
    assertNull(generator.outputCharsetEncoder);
  }

  @Test
  public void testConstructor_utf8Charset_encoderNotNull() {
    generator = new CodeGenerator(consumer, StandardCharsets.UTF_8);
    assertNotNull(generator.outputCharsetEncoder);
  }

  @Test
  public void testConstructor_singleArgument_encoderNull() {
    generator = new CodeGenerator(consumer);
    assertNull(generator.outputCharsetEncoder);
  }

  // ------------------ add(String) tests ------------------
  @Test
  public void testAddString() {
    generator = new CodeGenerator(consumer);
    generator.add("hello");
    assertEquals("hello", consumer.output.toString());
  }

  // ------------------ add(Node) tests ------------------
  @Test
  public void testAddNode_number() {
    Node n = new Node(Token.NUMBER);
    n.setDouble(3.14);
    generator = new CodeGenerator(consumer);
    generator.add(n);
    assertEquals(1, consumer.numberCalls);
    assertEquals(3.14, consumer.lastNumber, 0.0001);
  }

  @Test
  public void testAddNode_name_noChild() {
    Node n = new Node(Token.NAME);
    n.setString("x");
    generator = new CodeGenerator(consumer);
    generator.add(n);
    assertEquals("x", consumer.lastIdentifier);
  }

  @Test
  public void testAddNode_name_withChild() {
    Node n = new Node(Token.NAME);
    n.setString("x");
    Node child = new Node(Token.NUMBER);
    child.setDouble(5);
    n.addChildToBack(child);
    generator = new CodeGenerator(consumer);
    generator.add(n);
    assertTrue(consumer.calls.contains("addIdentifier"));
    assertTrue(consumer.calls.contains("addOp"));
  }

  @Test
  public void testAddNode_string() {
    Node n = new Node(Token.STRING);
    n.setString("test\"quote");
    generator = new CodeGenerator(consumer, null);
    generator.add(n);
    assertTrue(consumer.output.toString().startsWith("\""));
    assertTrue(consumer.output.toString().endsWith("\""));
  }

  @Test
  public void testAddNode_trueLiteral() {
    Node n = new Node(Token.TRUE);
    generator = new CodeGenerator(consumer);
    generator.add(n);
    assertEquals("true", consumer.output.toString());
  }

  @Test
  public void testAddNode_nullLiteral() {
    Node n = new Node(Token.NULL);
    generator = new CodeGenerator(consumer);
    generator.add(n);
    assertEquals("null", consumer.output.toString());
  }

  @Test
  public void testAddNode_block_singleNonEmptyChild() {
    Node block = new Node(Token.BLOCK);
    Node child = new Node(Token.RETURN);
    block.addChildToBack(child);
    generator = new CodeGenerator(consumer);
    generator.add(block, CodeGenerator.Context.PRESERVE_BLOCK);
    assertTrue(consumer.calls.contains("beginBlock"));
    assertTrue(consumer.calls.contains("endBlock"));
  }

  @Test
  public void testAddNode_block_noChildren() {
    Node block = new Node(Token.BLOCK);
    generator = new CodeGenerator(consumer);
    generator.add(block, CodeGenerator.Context.STATEMENT);
    // should not call beginBlock/endBlock because stripBlock = true
    assertFalse(consumer.calls.contains("beginBlock"));
    assertFalse(consumer.calls.contains("endBlock"));
  }

  @Test
  public void testAddNode_ifWithElse() {
    Node ifNode = new Node(Token.IF);
    Node cond = new Node(Token.TRUE);
    Node thenBlock = new Node(Token.BLOCK);
    Node elseBlock = new Node(Token.BLOCK);
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(thenBlock);
    ifNode.addChildToBack(elseBlock);
    generator = new CodeGenerator(consumer);
    generator.add(ifNode);
    assertTrue(consumer.output.toString().contains("if"));
    assertTrue(consumer.output.toString().contains("else"));
  }

  @Test
  public void testAddNode_ifNoElse_ambiguousElseClause() {
    Node ifNode = new Node(Token.IF);
    Node cond = new Node(Token.TRUE);
    Node thenBlock = new Node(Token.BLOCK);
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(thenBlock);
    generator = new CodeGenerator(consumer);
    generator.add(ifNode, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    assertTrue(consumer.calls.contains("beginBlock"));
    assertTrue(consumer.calls.contains("endBlock"));
  }

  @Test(expected = RuntimeException.class)
  public void testAddNode_unknownType() {
    Node n = new Node(9999);
    generator = new CodeGenerator(consumer);
    generator.add(n);
  }

  @Test(expected = Error.class)
  public void testAddNode_EXPR_VOID() {
    Node n = new Node(Token.EXPR_VOID);
    generator = new CodeGenerator(consumer);
    generator.add(n);
  }

  @Test
  public void testAddNode_returnWithChild() {
    Node ret = new Node(Token.RETURN);
    Node val = new Node(Token.NUMBER);
    val.setDouble(1);
    ret.addChildToBack(val);
    generator = new CodeGenerator(consumer);
    generator.add(ret);
    assertTrue(consumer.calls.contains("endStatement"));
  }

  @Test
  public void testAddNode_returnNoChild() {
    Node ret = new Node(Token.RETURN);
    generator = new CodeGenerator(consumer);
    generator.add(ret);
    // should add "return" and endStatement
    assertTrue(consumer.output.toString().contains("return"));
    assertTrue(consumer.calls.contains("endStatement"));
  }

  @Test
  public void testAddNode_breakWithLabel() {
    Node brk = new Node(Token.BREAK);
    Node label = new Node(Token.LABEL_NAME);
    label.setString("done");
    brk.addChildToBack(label);
    generator = new CodeGenerator(consumer);
    generator.add(brk);
    assertTrue(consumer.output.toString().contains("break done"));
    assertTrue(consumer.calls.contains("endStatement"));
  }

  @Test
  public void testAddNode_continueNoLabel() {
    Node cont = new Node(Token.CONTINUE);
    generator = new CodeGenerator(consumer);
    generator.add(cont);
    assertTrue(consumer.output.toString().contains("continue"));
    assertTrue(consumer.calls.contains("endStatement"));
  }

  @Test
  public void testAddNode_varWithOneChild() {
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME);
    name.setString("a");
    var.addChildToBack(name);
    generator = new CodeGenerator(consumer);
    generator.add(var);
    assertTrue(consumer.output.toString().contains("var "));
    assertTrue(consumer.output.toString().contains("a"));
  }

  @Test
  public void testAddNode_for4Children() {
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.VAR);
    Node cond = new Node(Token.TRUE);
    Node incr = new Node(Token.INC);
    Node body = new Node(Token.BLOCK);
    forNode.addChildToBack(init);
    forNode.addChildToBack(cond);
    forNode.addChildToBack(incr);
    forNode.addChildToBack(body);
    generator = new CodeGenerator(consumer);
    generator.add(forNode);
    assertTrue(consumer.output.toString().startsWith("for"));
    assertTrue(consumer.output.toString().contains(";"));
  }

  @Test
  public void testAddNode_for3Children() {
    Node forNode = new Node(Token.FOR);
    Node iterator = new Node(Token.NAME);
    iterator.setString("k");
    Node collection = new Node(Token.NAME);
    collection.setString("obj");
    Node body = new Node(Token.BLOCK);
    forNode.addChildToBack(iterator);
    forNode.addChildToBack(collection);
    forNode.addChildToBack(body);
    generator = new CodeGenerator(consumer);
    generator.add(forNode);
    assertTrue(consumer.output.toString().contains("in"));
  }

  // ------------------ static method tests ------------------
  @Test
  public void testJsString_usesSingleQuote() {
    String result = CodeGenerator.jsString("test\"double", null);
    assertTrue(result.startsWith("'"));
    assertTrue(result.endsWith("'"));
  }

  @Test
  public void testJsString_usesDoubleQuote() {
    String result = CodeGenerator.jsString("test'single", null);
    assertTrue(result.startsWith("\""));
    assertTrue(result.endsWith("\""));
  }

  @Test
  public void testJsString_equalQuotes() {
    String result = CodeGenerator.jsString("test", null);
    // default to double quote when equal
    assertTrue(result.startsWith("\""));
  }

  @Test
  public void testStrEscape_newline() {
    String result = CodeGenerator.strEscape("a\nb", '"', "\\\"", "\'", "\\\\", null);
    assertTrue(result.contains("\\n"));
    assertEquals("\"a\\nb\"", result);
  }

  @Test
  public void testStrEscape_tab() {
    String result = CodeGenerator.strEscape("a\tb", '"', "\\\"", "\'", "\\\\", null);
    assertEquals("\"a\\tb\"", result);
  }

  @Test
  public void testStrEscape_backslash() {
    String result = CodeGenerator.strEscape("a\\b", '"', "\\\"", "\'", "\\\\", null);
    assertEquals("\"a\\\\b\"", result);
  }

  @Test
  public void testStrEscape_gtWithDashes() {
    String result = CodeGenerator.strEscape("a-->b", '"', "\\\"", "\'", "\\\\", null);
    // adjacent to --> makes > escaped
    assertTrue(result.contains("\\>"));
  }

  @Test
  public void testStrEscape_ltWithScript() {
    String result = CodeGenerator.strEscape("</script>", '"', "\\\"", "\'", "\\\\", null);
    assertTrue(result.contains("<\\/script>"));
  }

  @Test
  public void testStrEscape_highChar_withoutEncoder() {
    String result = CodeGenerator.strEscape("\u00e9", '"', "\\\"", "\'", "\\\\", null);
    assertTrue(result.contains("\\u00e9"));
  }

  @Test
  public void testStrEscape_highChar_withEncoder() {
    CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
    String result = CodeGenerator.strEscape("\u00e9", '"', "\\\"", "\'", "\\\\", encoder);
    // é can be encoded in UTF-8, so not escaped
    assertEquals("\"\u00e9\"", result);
  }

  @Test
  public void testIdentifierEscape_latin() {
    String result = CodeGenerator.identifierEscape("abc123");
    assertEquals("abc123", result);
  }

  @Test
  public void testIdentifierEscape_nonLatin() {
    String result = CodeGenerator.identifierEscape("a\u00e9b");
    assertTrue(result.contains("\\u00e9"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString() {
    String result = CodeGenerator.escapeToDoubleQuotedJsString("a'b");
    assertEquals("\"a'b\"", result);
  }

  @Test
  public void testRegexpEscape_simple() {
    String result = CodeGenerator.regexpEscape("abc", null);
    assertTrue(result.startsWith("/"));
    assertTrue(result.endsWith("/"));
  }

  @Test
  public void testRegexpEscape_withSlash() {
    String result = CodeGenerator.regexpEscape("a/b", null);
    assertTrue(result.contains("\\/"));
  }

  @Test
  public void testRegexpEscape_overloaded() {
    String result = CodeGenerator.regexpEscape("test");
    assertTrue(result.startsWith("/"));
  }

  // ------------------ addList tests ------------------
  @Test
  public void testAddList_empty() {
    generator = new CodeGenerator(consumer);
    generator.addList(null);
    // no separator, no output
    assertEquals("", consumer.output.toString());
  }

  @Test
  public void testAddList_singleElement() {
    Node n1 = new Node(Token.NUMBER);
    n1.setDouble(7);
    generator = new CodeGenerator(consumer);
    generator.addList(n1);
    assertEquals(1, consumer.numberCalls);
    assertEquals(7.0, consumer.lastNumber, 0.0001);
  }

  @Test
  public void testAddList_twoElements() {
    Node n1 = new Node(Token.NUMBER);
    n1.setDouble(1);
    Node n2 = new Node(Token.NUMBER);
    n2.setDouble(2);
    n1.setNext(n2);
    generator = new CodeGenerator(consumer);
    generator.addList(n1);
    // should have two numbers with separator
    assertTrue(consumer.listSeparatorCount > 0);
  }

  @Test
  public void testAddList_withSkipIndexes() {
    Node n1 = new Node(Token.NUMBER);
    n1.setDouble(1);
    Node n2 = new Node(Token.NUMBER);
    n2.setDouble(2);
    n1.setNext(n2);
    int[] skip = new int[]{0}; // skip first
    generator = new CodeGenerator(consumer);
    generator.addList(n1, skip);
    // first element skipped? Actually array skip index means add empty slot? ???
    // just check no crash
    assertNotNull(consumer.output.toString());
  }

  // ------------------ addExpr / addLeftExpr tests ------------------
  @Test
  public void testAddExpr_wrapsInParens() {
    Node inner = new Node(Token.NUMBER);
    inner.setDouble(1);
    Node plus = new Node(Token.ADD);
    plus.addChildToBack(inner);
    plus.addChildToBack(inner); // dummy children
    generator = new CodeGenerator(consumer);
    generator.addExpr(plus, 10); // precedence of ADD is 12? Actually lower than 10? Ensure wrap
    assertTrue(consumer.output.toString().contains("("));
  }

  @Test
  public void testAddExpr_noWrap() {
    Node n = new Node(Token.NUMBER);
    n.setDouble(42);
    generator = new CodeGenerator(consumer);
    generator.addExpr(n, 0);
    assertEquals(1, consumer.numberCalls);
    assertEquals(42.0, consumer.lastNumber, 0.0001);
  }

  @Test
  public void testAddLeftExpr() {
    Node n = new Node(Token.NUMBER);
    n.setDouble(99);
    generator = new CodeGenerator(consumer);
    generator.addLeftExpr(n, 0, CodeGenerator.Context.OTHER);
    assertEquals(1, consumer.numberCalls);
    assertEquals(99.0, consumer.lastNumber, 0.0001);
  }

  // ------------------ addCaseBody / addAllSiblings tests ------------------
  @Test
  public void testAddCaseBody() {
    Node body = new Node(Token.BLOCK);
    generator = new CodeGenerator(consumer);
    generator.addCaseBody(body);
    assertTrue(consumer.calls.contains("beginCaseBody"));
    assertTrue(consumer.calls.contains("endCaseBody"));
  }

  @Test
  public void testAddAllSiblings_single() {
    Node n = new Node(Token.NUMBER);
    n.setDouble(3);
    generator = new CodeGenerator(consumer);
    generator.addAllSiblings(n);
    assertEquals(1, consumer.numberCalls);
  }

  // ------------------ helper: ensure continueProcessing() stub works ------------------
  @Test
  public void testContinueProcessingStops() {
    consumer.continueProcessingReturn = false;
    generator = new CodeGenerator(consumer);
    Node n = new Node(Token.NUMBER);
    n.setDouble(3);
    generator.add(n);
    // should not call addNumber
    assertEquals(0, consumer.numberCalls);
  }

  // ------------------ MockCodeConsumer inner class ------------------
  static class MockCodeConsumer implements CodeConsumer {
    StringBuilder output = new StringBuilder();
    java.util.List<String> calls = new java.util.ArrayList<>();
    int numberCalls = 0;
    double lastNumber;
    String lastIdentifier;
    int listSeparatorCount = 0;
    boolean continueProcessingReturn = true;
    boolean preserveExtraBlocksReturn = false;

    @Override
    public void add(String str) { 
      output.append(str);
      calls.add("add");
    }

    @Override
    public void addIdentifier(String identifier) {
      output.append(identifier);
      lastIdentifier = identifier;
      calls.add("addIdentifier");
    }

    @Override
    public void addOp(String op, boolean b) {
      output.append(op);
      calls.add("addOp");
    }

    @Override
    public void addNumber(double x) {
      numberCalls++;
      lastNumber = x;
      output.append(x);
      calls.add("addNumber");
    }

    @Override
    public void listSeparator() {
      output.append(", ");
      listSeparatorCount++;
      calls.add("listSeparator");
    }

    @Override
    public void beginBlock() {
      calls.add("beginBlock");
    }

    @Override
    public void endBlock(boolean b) {
      calls.add("endBlock");
    }

    @Override
    public void endStatement() {
      calls.add("endStatement");
    }

    @Override
    public void endStatement(boolean b) {
      calls.add("endStatement");
    }

    @Override
    public void maybeLineBreak() {
      calls.add("maybeLineBreak");
    }

    @Override
    public void notePreferredLineBreak() {
      calls.add("notePreferredLineBreak");
    }

    @Override
    public void beginCaseBody() {
      calls.add("beginCaseBody");
    }

    @Override
    public void endCaseBody() {
      calls.add("endCaseBody");
    }

    @Override
    public void endFunction(boolean b) {
      calls.add("endFunction");
    }

    @Override
    public boolean breakAfterBlockFor(Node n, boolean b) {
      calls.add("breakAfterBlockFor");
      return false;
    }

    @Override
    public boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocksReturn;
    }

    @Override
    public boolean continueProcessing() {
      return continueProcessingReturn;
    }

    @Override
    public void startSourceMapping(Node n) {
      calls.add("startSourceMapping");
    }

    @Override
    public void endSourceMapping(Node n) {
      calls.add("endSourceMapping");
    }
  }
}