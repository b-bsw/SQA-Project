package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlowSensitiveInlineVariablesTest {

  private Compiler compiler;
  private FlowSensitiveInlineVariables pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    pass = new FlowSensitiveInlineVariables(compiler);
  }

  @After
  public void tearDown() {
    pass = null;
    compiler = null;
  }

  private Node parse(String code) {
    Node node = compiler.parseSyntheticCode(code);
    assertNotNull("parseSyntheticCode should return a node", node);
    return node;
  }

  private void assertProcessed(String externsCode, String rootCode) {
    Node externs = parse(externsCode);
    Node root = parse(rootCode);
    pass.process(externs, root);
    assertFalse("Compiler should not report errors after inlining pass", compiler.hasErrors());
  }

  @Test
  public void testProcessEmptyExternAndRoot() {
    assertProcessed("", "");
  }

  @Test
  public void testProcessGlobalScopeIsIgnored() {
    assertProcessed("", "var x = 1;");
  }

  @Test
  public void testProcessEmptyFunction() {
    assertProcessed("", "function f(){}");
  }

  @Test
  public void testProcessInlineCandidate() {
    assertProcessed("", "function f(){ var x = 1; print(x); }");
  }

  @Test
  public void testProcessAssignmentCandidate() {
    assertProcessed("", "function f(){ var x; x = 1; print(x); }");
  }

  @Test
  public void testProcessUseInsideLoop() {
    assertProcessed("", "function f(){ var x = 1; while(cond){ print(x); x = 2; } }");
  }

  @Test
  public void testProcessMultipleCandidates() {
    assertProcessed("", "function f(){ var a = 1; print(a); var b = 2; print(b); }");
  }

  @Test
  public void testExitScopeIsNoOp() {
    pass.exitScope(null);
    assertFalse(compiler.hasErrors());
  }
}