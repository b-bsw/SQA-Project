package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import org.junit.Test;

import static org.junit.Assert.*;

public class IRFactoryTest {

  private static class TestErrorReporter implements ErrorReporter {
    @Override
    public void warning(String message, String sourceName, int line, int column) {
      // ignore warnings
    }

    @Override
    public void error(String message, String sourceName, int line, int column) {
      fail("Unexpected parser error: " + message);
    }
  }

  private static final ErrorReporter REPORTER = new TestErrorReporter();

  private static Node transform(String code, Config config) throws Exception {
    JSDocInfoParser jsDocParser = new JSDocInfoParser("", config, REPORTER);
    AstRoot root = new Parser(REPORTER, "").parse(code, "", 0);
    return IRFactory.transformTree(root, config, REPORTER, jsDocParser);
  }

  private static Config es5() {
    return new Config(LanguageMode.ECMASCRIPT5, false, false);
  }

  private static void assertFirstChildType(String code, int type, Config config) throws Exception {
    Node script = transform(code, config);
    assertNotNull("Result is null", script);
    Node first = script.getFirstChild();
    assertNotNull("Expected statement for: " + code, first);
    assertEquals("Unexpected node type for: " + code, type, first.getType());
  }

  @Test
  public void testEmptyScript() throws Exception {
    Node node = transform("", es5());
    assertNotNull(node);
    assertEquals(Token.SCRIPT, node.getType());
  }

  @Test
  public void testVariableDeclaration() throws Exception {
    assertFirstChildType("var x = 1;", Token.VAR, es5());
  }

  @Test
  public void testIfElse() throws Exception {
    assertFirstChildType("if (a) b; else c;", Token.IF, es5());
  }

  @Test
  public void testSwitchWithDefault() throws Exception {
    assertFirstChildType("switch(a){ case 1: break; default: break; }", Token.SWITCH, es5());
  }

  @Test
  public void testWhileLoop() throws Exception {
    assertFirstChildType("while (a) b;", Token.WHILE, es5());
  }

  @Test
  public void testDoWhileLoop() throws Exception {
    assertFirstChildType("do { } while (false);", Token.DO, es5());
  }

  @Test
  public void testForLoop() throws Exception {
    assertFirstChildType("for (;;);", Token.FOR, es5());
  }

  @Test
  public void testTryCatchFinally() throws Exception {
    assertFirstChildType("try { } catch (e) { } finally { }", Token.TRY, es5());
  }

  @Test
  public void testFunctionDeclaration() throws Exception {
    assertFirstChildType("function f() { }", Token.FUNCTION, es5());
  }

  @Test
  public void testThrowStatement() throws Exception {
    assertFirstChildType("throw a;", Token.THROW, es5());
  }

  @Test
  public void testConstKeyword() throws Exception {
    Config cfg = new Config(LanguageMode.ECMASCRIPT5, false, true);
    assertFirstChildType("const x = 1;", Token.CONST, cfg);
  }

  @Test
  public void testStringLiteralValue() throws Exception {
    Node script = transform("var s = 'hi';", es5());
    Node varNode = script.getFirstChild();
    Node str = varNode.getFirstChild().getNext();
    assertEquals(Token.STRING, str.getType());
    assertEquals("hi", str.getString());
  }

  @Test
  public void testUnaryMinusFolding() throws Exception {
    Node script = transform("var x = -42;", es5());
    Node varNode = script.getFirstChild();
    Node num = varNode.getFirstChild().getNext();
    assertEquals(Token.NUMBER, num.getType());
    assertEquals(-42.0, num.getDouble(), 0.0);
  }

  @Test
  public void testIncrement() throws Exception {
    Node script = transform("x++;", es5());
    Node expr = script.getFirstChild();
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(Token.INC, expr.getFirstChild().getType());
  }

  @Test
  public void testCall() throws Exception {
    Node script = transform("foo();", es5());
    Node expr = script.getFirstChild();
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(Token.CALL, expr.getFirstChild().getType());
  }

  @Test
  public void testNew() throws Exception {
    Node script = transform("new Foo();", es5());
    Node expr = script.getFirstChild();
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(Token.NEW, expr.getFirstChild().getType());
  }

  @Test
  public void testPropertyAccess() throws Exception {
    Node script = transform("a.b;", es5());
    Node expr = script.getFirstChild();
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(Token.GETPROP, expr.getFirstChild().getType());
  }

  @Test
  public void testElementAccess() throws Exception {
    Node script = transform("a['b'];", es5());
    Node expr = script.getFirstChild();
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(Token.GETELEM, expr.getFirstChild().getType());
  }

  @Test
  public void testIdeMode() throws Exception {
    Config ideCfg = new Config(LanguageMode.ECMASCRIPT5, true, false);
    assertFirstChildType("var x = 1;", Token.VAR, ideCfg);
  }
}