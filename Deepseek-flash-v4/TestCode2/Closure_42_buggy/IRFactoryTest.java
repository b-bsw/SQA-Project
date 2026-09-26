package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import java.lang.reflect.Method;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the public transformation entry points of {@link IRFactory}.
 */
public class IRFactoryTest {

  private Config config;
  private ErrorReporter errorReporter;

  @Before
  public void setUp() {
    config = new Config(Config.LanguageMode.ECMASCRIPT5, false, false);
    errorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line,
          String lineSource, int lineOffset) {
      }

      @Override
      public void error(String message, String sourceName, int line,
          String lineSource, int lineOffset) {
      }

      @Override
      public com.google.javascript.rhino.head.EvaluatorException runtimeError(
          String message, String sourceName, int line,
          String lineSource, int lineOffset) {
        return null;
      }
    };
  }

  private Node transform(String js) {
    Parser parser = new Parser();
    AstRoot ast = parser.parse(js, "test.js", 0);
    return IRFactory.transformTree(ast, config, errorReporter, null, js);
  }

  @Test
  public void testTransformEmptyScript() {
    Node root = transform("");

    assertNotNull(root);
    assertEquals(Token.SCRIPT, root.getType());
    assertNull(root.getFirstChild());
  }

  @Test
  public void testTransformVarDeclaration() {
    Node root = transform("var x = 1;");

    assertEquals(Token.SCRIPT, root.getType());

    Node varNode = root.getFirstChild();
    assertNotNull(varNode);
    assertEquals(Token.VAR, varNode.getType());

    Node nameNode = varNode.getFirstChild();
    assertNotNull(nameNode);
    assertEquals(Token.NAME, nameNode.getType());
    assertEquals("x", nameNode.getString());

    Node initNode = nameNode.getFirstChild();
    assertNotNull(initNode);
    assertEquals(Token.NUMBER, initNode.getType());
    assertEquals(1.0, initNode.getDouble(), 0.0);
  }

  @Test
  public void testTransformFunctionDeclaration() {
    Node root = transform("function f(a) { return a; }");

    Node functionNode = root.getFirstChild();
    assertNotNull(functionNode);
    assertEquals(Token.FUNCTION, functionNode.getType());

    Node nameNode = functionNode.getFirstChild();
    assertNotNull(nameNode);
    assertEquals(Token.NAME, nameNode.getType());
    assertEquals("f", nameNode.getString());

    Node paramsNode = nameNode.getNext();
    assertNotNull(paramsNode);
    assertEquals(Token.PARAM_LIST, paramsNode.getType());

    Node paramNode = paramsNode.getFirstChild();
    assertNotNull(paramNode);
    assertEquals(Token.NAME, paramNode.getType());
    assertEquals("a", paramNode.getString());

    Node bodyNode = paramsNode.getNext();
    assertNotNull(bodyNode);
    assertEquals(Token.BLOCK, bodyNode.getType());
  }

  @Test
  public void testTransformIfElse() {
    Node root = transform("if (a) { b; } else { c; }");

    Node ifNode = root.getFirstChild();
    assertNotNull(ifNode);
    assertEquals(Token.IF, ifNode.getType());

    Node condition = ifNode.getFirstChild();
    assertNotNull(condition);
    assertEquals(Token.NAME, condition.getType());

    Node thenBlock = condition.getNext();
    assertNotNull(thenBlock);
    assertEquals(Token.BLOCK, thenBlock.getType());

    Node elseBlock = thenBlock.getNext();
    assertNotNull(elseBlock);
    assertEquals(Token.BLOCK, elseBlock.getType());
  }

  @Test
  public void testGetStringValueIntegralValue() throws Exception {
    Method method = IRFactory.class.getDeclaredMethod("getStringValue", double.class);
    method.setAccessible(true);

    assertEquals("1", method.invoke(null, 1.0));
  }

  @Test
  public void testGetStringValueNonIntegralValue() throws Exception {
    Method method = IRFactory.class.getDeclaredMethod("getStringValue", double.class);
    method.setAccessible(true);

    assertEquals("1.5", method.invoke(null, 1.5));
  }
}