package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

/**
 * JUnit 4 tests for {@link RemoveUnusedVars}.
 *
 * <p>Tests are written against a real {@link Compiler} so that the pass is
 * tested end-to-end. Expected output is normalized before comparison so
 * formatting differences do not make the tests brittle.
 */
public class RemoveUnusedVarsTest {

  @Test
  public void removesUnusedLocalVariable() {
    String result = removeUnusedVars(
        "function f(a) { var x = 1; return a; }",
        false, true, false);
    assertEquals(
        normalize("function f(a) { return a; }"),
        normalize(result));
  }

  @Test
  public void removesUnusedTrailingFunctionArgument() {
    String result = removeUnusedVars(
        "function f(a, b) { return a; }",
        false, true, false);
    assertEquals(
        normalize("function f(a) { return a; }"),
        normalize(result));
  }

  @Test
  public void removesUnusedGlobalVariable() {
    String result = removeUnusedVars(
        "var x = 1;",
        true, true, false);
    assertEquals(
        normalize(""),
        normalize(result));
  }

  @Test
  public void preservesFunctionExpressionNameWhenConfigured() {
    String result = removeUnusedVars(
        "var x = function foo() {};",
        false, true, false);
    assertTrue(result.contains("foo"));
  }

  @Test
  public void removesFunctionExpressionNameWhenRequested() {
    String result = removeUnusedVars(
        "var x = function foo() {};",
        false, false, false);
    assertFalse(result.contains("foo"));
  }

  @Test
  public void stillRunsWithoutThrowingWhenCallSiteOptIsEnabled() {
    String result = removeUnusedVars(
        "function f(a) { return 1; } f(0);",
        false, true, true);
    // The important part for this test is that the pass does not throw and
    // that the unused parameter "a" is removed from the declaration.
    assertFalse(result.contains("function f(a)"));
  }

  private static String removeUnusedVars(
      String code,
      boolean removeGlobals,
      boolean preserveFunctionExpressionNames,
      boolean modifyCallSites) {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());

    Node externs = new Node(Token.SCRIPT);
    Node root = compiler.parseInputs(
        ImmutableList.of(SourceFile.fromCode("test", code)));

    RemoveUnusedVars pass = new RemoveUnusedVars(
        compiler,
        removeGlobals,
        preserveFunctionExpressionNames,
        modifyCallSites);
    pass.process(externs, root);

    return compiler.toSource(root);
  }

  private static String normalize(String code) {
    return code
        .replaceAll("[\\s;]", "")
        .trim();
  }
}