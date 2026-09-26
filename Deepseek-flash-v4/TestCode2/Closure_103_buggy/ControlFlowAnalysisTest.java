package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * JUnit 4 tests for {@link ControlFlowAnalysis}.
 *
 * <p>The integration tests use {@link Compiler} to parse JavaScript snippets and verify that the
 * CFG builder can process common control-flow constructs without errors. Reflective tests are
 * used for methods that can be exercised independently of the {@link Compiler}.
 */
public class ControlFlowAnalysisTest {

  private static final String EXTERNAL_SOURCE =
      "var window;";

  /* ========== Integration tests using real Compiler ========== */

  @Test
  public void testProcessEmptyScript() throws Exception {
    ControlFlowGraph<Node> cfg = analyze("");
    assertValidCfg(cfg);
  }

  @Test
  public void testProcessFunction() throws Exception {
    ControlFlowGraph<Node> cfg = analyze("function f() {}");
    assertValidCfg(cfg);
  }

  @Test
  public void testProcessIfElse() throws Exception {
    ControlFlowGraph<Node> cfg = analyze("if (true) { a; } else { b; }");
    assertValidCfg(cfg);
  }

  @Test
  public void testProcessForLoop() throws Exception {
    ControlFlowGraph<Node> cfg = analyze("for (var i = 0; i < 10; i++) { a; }");
    assertValidCfg(cfg);
  }

  @Test
  public void testProcessWhileLoop() throws Exception {
    ControlFlowGraph<Node> cfg = analyze("while (true) { break; }");
    assertValidCfg(cfg);
  }

  @Test
  public void testProcessTryCatch() throws Exception {
    ControlFlowGraph<Node> cfg = analyze("try { throw 1; } catch (e) { e; }");
    assertValidCfg(cfg);
  }

  @Test
  public void testProcessSwitch() throws Exception {
    ControlFlowGraph<Node> cfg = analyze("switch (a) { case 1: a; break; default: b; }");
    assertValidCfg(cfg);
  }

  @Test(expected = NullPointerException.class)
  public void testProcessNullRoot() {
    new ControlFlowAnalysis(null, true).process(null, null);
  }

  /* ========== Direct tests for shouldTraverse (public method) ========== */

  @Test
  public void testShouldTraverseEmptyNode() throws Exception {
    ControlFlowAnalysis cfa = createCfaForShouldTraverse();
    Node n = new Node(Token.EMPTY);
    assertTrue(cfa.shouldTraverse(null, n, null));
  }

  @Test
  public void testShouldTraverseFunctionWithTraversal() throws Exception {
    // With shouldTraverseFunctions == true, traversing a FUNCTION node succeeds
    // without touching the cfg field.
    ControlFlowAnalysis cfa = createCfaForShouldTraverse();
    Node n = new Node(Token.FUNCTION);
    assertTrue(cfa.shouldTraverse(null, n, null));
  }

  @Test
  public void testShouldTraverseTryInsideIf() throws Exception {
    // try node that is not the first child of an IF should be traversed.
    ControlFlowAnalysis cfa = createCfaForShouldTraverse();

    Node condition = new Node(Token.NAME);
    Node body = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY);

    Node ifNode = new Node(Token.IF);
    ifNode.addChildToBack(condition);
    ifNode.addChildToBack(body);
    ifNode.addChildToBack(tryNode);

    assertTrue(cfa.shouldTraverse(null, tryNode, ifNode));
  }

  /* ========== Helpers ========== */

  private ControlFlowGraph<Node> analyze(String source) throws Exception {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.compile(
        SourceFile.fromCode("externs.js", EXTERNAL_SOURCE),
        SourceFile.fromCode("test.js", source),
        new CompilerOptions());

    Node root = compiler.getRoot().getLastChild();
    assertNotNull("Compiler produced no root node", root);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
    cfa.process(null, root);
    return getCfg(cfa);
  }

  private ControlFlowGraph<Node> getCfg(ControlFlowAnalysis cfa) throws Exception {
    Field f = ControlFlowAnalysis.class.getDeclaredField("cfg");
    f.setAccessible(true);
    @SuppressWarnings("unchecked")
    ControlFlowGraph<Node> cfg = (ControlFlowGraph<Node>) f.get(cfa);
    return cfg;
  }

  private void assertValidCfg(ControlFlowGraph<Node> cfg) {
    assertNotNull("CFG should not be null", cfg);
    assertNotNull("CFG entry point should not be null", cfg.getEntry());
    assertNotNull("CFG implicit return should not be null", cfg.getImplicitReturn());
  }

  private ControlFlowAnalysis createCfaForShouldTraverse() throws Exception {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(null, true);
    Map<Node, Integer> astPosition = new HashMap<>();
    ArrayDeque<Node> exceptionHandler = new ArrayDeque<>();

    setField(cfa, "astPosition", astPosition);
    setField(cfa, "astPositionCounter", 0);
    setField(cfa, "exceptionHandler", exceptionHandler);

    return cfa;
  }

  private void setField(Object target, String name, Object value) throws Exception {
    Field f = target.getClass().getDeclaredField(name);
    f.setAccessible(true);
    f.set(target, value);
  }
}