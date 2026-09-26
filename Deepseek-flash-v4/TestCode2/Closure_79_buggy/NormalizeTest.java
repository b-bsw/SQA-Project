package com.google.javascript.jscomp;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class NormalizeTest {
  private AbstractCompiler compiler;
  private Normalize normalize;
  private Node root;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    root = IR.root();
    normalize = new Normalize(compiler, false);
  }

  @Test
  public void testProcessNormalized() {
    Node externs = IR.root();
    Node root = IR.root();
    Node script = IR.script();
    root.addChildToBack(script);
    normalize.process(externs, root);
    assertTrue(compiler.getLifeCycleStage().isNormalized());
  }

  @Test
  public void testProcessWithWhileLoop() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node whileNode = new Node(Token.WHILE);
    Node cond = new Node(Token.TRUE);
    Node body = new Node(Token.BLOCK);
    whileNode.addChildToBack(cond);
    whileNode.addChildToBack(body);
    script.addChildToBack(whileNode);
    root.addChildToBack(script);
    normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
    assertEquals(Token.FOR, whileNode.getType());
  }

  @Test
  public void testProcessWithVarDeclarations() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node name1 = new Node(Token.NAME, "a");
    Node name2 = new Node(Token.NAME, "b");
    varNode.addChildToBack(name1);
    varNode.addChildToBack(name2);
    script.addChildToBack(varNode);
    root.addChildToBack(script);
    normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
    assertEquals(2, script.getChildCount());
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(Token.VAR, script.getLastChild().getType());
  }

  @Test
  public void testProcessWithConstAnnotation() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node nameNode = new Node(Token.NAME, "x");
    exprResult.addChildToBack(nameNode);
    script.addChildToBack(exprResult);
    root.addChildToBack(script);
    normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
  }

  @Test
  public void testProcessWithDuplicateDeclaration() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "a");
    nameNode.addChildToBack(new Node(Token.NUMBER, 1.0));
    varNode.addChildToBack(nameNode);
    script.addChildToBack(varNode);
    Node varNode2 = new Node(Token.VAR);
    Node nameNode2 = new Node(Token.NAME, "a");
    varNode2.addChildToBack(nameNode2);
    script.addChildToBack(varNode2);
    root.addChildToBack(script);
    normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
    assertEquals(2, script.getChildCount());
  }

  @Test
  public void testProcessWithChangeAssertion() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node whileNode = new Node(Token.WHILE);
    Node cond = new Node(Token.TRUE);
    Node body = new Node(Token.BLOCK);
    whileNode.addChildToBack(cond);
    whileNode.addChildToBack(body);
    script.addChildToBack(whileNode);
    root.addChildToBack(script);
    Normalize assertNormalize = new Normalize(compiler, true);
    try {
      assertNormalize.process(new Node(Token.ROOT), root);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("WHILE node"));
    }
  }

  @Test
  public void testParseAndNormalizeSyntheticCode() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node result = Normalize.parseAndNormalizeSyntheticCode(compiler, "var x = 1;", "test");
    assertNotNull(result);
  }

  @Test
  public void testParseAndNormalizeTestCode() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node result = Normalize.parseAndNormalizeTestCode(compiler, "var y = 2;", "test");
    assertNotNull(result);
  }

  @Test
  public void testNormalizeStatementsNormalization() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "loop");
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(new Node(Token.STRING, "hello"));
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(exprResult);
    script.addChildToBack(labelNode);
    root.addChildToBack(script);
    normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
    assertEquals(Token.BLOCK, labelNode.getLastChild().getType());
  }

  @Test
  public void testPropagateConstantAnnotations() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "c");
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    varNode.addChildToBack(nameNode);
    script.addChildToBack(varNode);
    root.addChildToBack(script);
    normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
  }

  @Test
  public void testVerifyConstants() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node externs = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(externs);
    root.addChildToBack(script);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "k");
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    varNode.addChildToBack(nameNode);
    script.addChildToBack(varNode);
    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, true);
    vc.process(externs, root);
  }

  @Test
  public void testDuplicateDeclarationHandler() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "d");
    varNode.addChildToBack(nameNode);
    script.addChildToBack(varNode);
    Node varNode2 = new Node(Token.VAR);
    Node nameNode2 = new Node(Token.NAME, "d");
    varNode2.addChildToBack(nameNode2);
    script.addChildToBack(varNode2);
    root.addChildToBack(script);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
    assertTrue(compiler.getLifeCycleStage().isNormalized());
  }

  @Test
  public void testProcessWithFunctionDeclaration() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node functionNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "f");
    Node paramNode = new Node(Token.PARAM_LIST);
    Node bodyNode = new Node(Token.BLOCK);
    functionNode.addChildToBack(nameNode);
    functionNode.addChildToBack(paramNode);
    functionNode.addChildToBack(bodyNode);
    script.addChildToBack(functionNode);
    root.addChildToBack(script);
    Node externs = new Node(Token.ROOT);
    normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testProcessWithForInVar() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    Node forIn = new Node(Token.FOR);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "i");
    var.addChildToBack(name);
    Node inExpr = new Node(Token.IN);
    Node obj = new Node(Token.NAME, "obj");
    Node body = new Node(Token.BLOCK);
    forIn.addChildToBack(var);
    forIn.addChildToBack(inExpr);
    forIn.addChildToBack(body);
    script.addChildToBack(forIn);
    root.addChildToBack(script);
    normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
    assertEquals(2, script.getChildCount());
  }

  @Test
  public void testEmptyRoot() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = new Node(Token.ROOT);
    Node externs = new Node(Token.ROOT);
    normalize.process(externs, root);
    assertTrue(compiler.getLifeCycleStage().isNormalized());
  }
}