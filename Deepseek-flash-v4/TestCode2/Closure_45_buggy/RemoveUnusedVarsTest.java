package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RemoveUnusedVarsTest {

  private Compiler compiler;
  private Node externs;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    externs = new Node(Token.SCRIPT);
  }

  private String remove(
      String code, boolean removeGlobals, boolean preserveFunctionExpressionNames) {
    Node root = compiler.parseSyntheticCode(code);
    assertNotNull("Failed to parse JavaScript", root);

    RemoveUnusedVars pass =
        new RemoveUnusedVars(compiler, removeGlobals, preserveFunctionExpressionNames);
    pass.process(externs, root);

    return compiler.toSource(root);
  }

  private static String normalize(String source) {
    return source.replaceAll("\\s+", "");
  }

  private static void assertSourceEquals(String expected, String actual) {
    assertEquals(normalize(expected), normalize(actual));
  }

  private static void assertSourceContains(String expected, String actual) {
    assertTrue(
        "Expected source containing \"" + expected + "\", but got: " + actual,
        normalize(actual).contains(normalize(expected)));
  }

  private static void assertSourceNotContains(String unexpected, String actual) {
    assertFalse(
        "Did not expect source containing \"" + unexpected + "\", but got: " + actual,
        normalize(actual).contains(normalize(unexpected)));
  }

  @Test
  public void emptyScriptProcessesWithoutError() {
    String result = remove("", true, true);
    assertSourceEquals("", result);
  }

  @Test
  public void removesUnreferencedGlobalVarWhenEnabled() {
    String result = remove("var a = 1; var b = 2; b;", true, true);

    assertSourceNotContains("var a", result);
    assertSourceContains("var b", result);
  }

  @Test
  public void keepsUnreferencedGlobalVarWhenDisabled() {
    String result = remove("var a = 1; var b = 2; b;", false, true);

    assertSourceContains("var a", result);
    assertSourceContains("var b", result);
  }

  @Test
  public void removesUnusedFunctionArgFromSignatureAndCallSite() {
    String result = remove("function f(a) { return 1; } var x = f(2);", true, true);

    assertSourceNotContains("function f(a", result);
    assertSourceContains("function f() { return 1; }", result);
    assertSourceContains("var x = f();", result);
  }

  @Test
  public void preservesCallArgumentWithSideEffects() {
    String result = remove("function f(a) {} f(console.log(1));", true, true);

    assertSourceContains("f(console.log(1))", result);
  }

  @Test
  public void preservesFunctionArgumentWhenArgumentsObjectIsUsed() {
    String result =
        remove("function f(a) { return arguments[0]; } f(2);", true, true);

    assertSourceContains("function f(a)", result);
    assertSourceContains("f(2)", result);
  }

  @Test
  public void removesFunctionExpressionNameWhenNotPreserved() {
    String source = "var f = function foo() { return 1; }; f();";
    String result = remove(source, true, false);

    assertSourceNotContains("foo", result);
  }

  @Test
  public void preservesFunctionExpressionNameWhenRequested() {
    String source = "var f = function foo() { return 1; }; f();";
    String result = remove(source, true, true);

    assertSourceContains("foo", result);
  }

  @Test(expected = NullPointerException.class)
  public void processWithNullDefFinderRejectsNull() {
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, true);
    pass.process(externs, new Node(Token.SCRIPT), null);
  }
}