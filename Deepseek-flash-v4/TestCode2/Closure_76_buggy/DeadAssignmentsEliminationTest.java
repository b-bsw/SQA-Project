package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;

public class DeadAssignmentsEliminationTest {

  private Compiler compiler;
  private DeadAssignmentsElimination pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    pass = new DeadAssignmentsElimination(compiler);
  }

  @Test
  public void testSimpleDeadAssignment() {
    String code = "function f() { var x = 1; x = 2; return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("x = 2"));
    assertFalse(result.contains("x = 1"));
  }

  @Test
  public void testNoDeadAssignmentLiveVariable() {
    String code = "function f() { var x = 1; return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("var x = 1"));
  }

  @Test
  public void testDeadAssignmentAfterReturn() {
    String code = "function f() { var x = 1; return x; x = 2; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("return x"));
    assertFalse(result.contains("x = 2"));
  }

  @Test
  public void testDeadAssignmentWithClosure() {
    String code = "function f() { var x = 1; function inner() { return x; } return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("var x = 1"));
  }

  @Test
  public void testIdentityAssignmentRemoved() {
    String code = "function f() { var x = 1; x = x; return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("return x"));
    assertFalse(result.contains("x = x"));
  }

  @Test
  public void testDeadAssignmentInIfBranch() {
    String code = "function f(b) { var x = 1; if (b) { x = 2; } else { x = 3; } return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("if"));
    assertTrue(result.contains("x = 2") || result.contains("x = 3"));
  }

  @Test
  public void testDeadAssignmentInWhileLoop() {
    String code = "function f() { var x = 1; while (x) { x = 2; } return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("while"));
  }

  @Test
  public void testDeadAssignmentInForLoop() {
    String code = "function f() { var x = 1; for (var i = 0; i < 10; i++) { x = 2; } return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("for"));
  }

  @Test
  public void testDeadAssignmentWithIncrement() {
    String code = "function f() { var x = 1; x++; return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("x++"));
  }

  @Test
  public void testDeadAssignmentWithDecrement() {
    String code = "function f() { var x = 1; x--; return x; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("x--"));
  }

  @Test
  public void testDeadAssignmentInCommaExpression() {
    String code = "function f() { var x = 1; return (x = 2, x = 3, x); }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("x = 3"));
    assertFalse(result.contains("x = 2"));
  }

  @Test
  public void testProcessWithNullExterns() {
    String code = "function f() { var x = 1; x = 2; }";
    Node ast = parse(code);
    pass.process(null, ast);
    String result = compiler.toSource();
    assertTrue(result.contains("x = 2"));
  }

  @Test(expected = NullPointerException.class)
  public void testProcessWithNullRoot() {
    pass.process(null, null);
  }

  private Node parse(String code) {
    com.google.javascript.jscomp.CompilerInput input = 
        new com.google.javascript.jscomp.CompilerInput(
            com.google.javascript.rhino.SourceFile.fromCode("test.js", code));
    return compiler.parse(input);
  }
}