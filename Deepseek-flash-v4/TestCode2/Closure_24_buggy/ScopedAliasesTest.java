package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import java.util.Arrays;
import org.junit.Test;

public class ScopedAliasesTest {

  private static final AliasTransformationHandler NULL_HANDLER =
      new AliasTransformationHandler() {
        @Override
        public AliasTransformation logAliasTransformation(
            String sourceFile, SourcePosition<AliasTransformation> position) {
          return new AliasTransformation() {
            @Override
            public void addAlias(String alias, String definition) {}
          };
        }
      };

  @Test
  public void testEmptyGoogScope() {
    String output = process("goog.scope(function () {});");
    assertFalse("Expected empty output but was: " + output, output.contains("goog.scope"));
    assertTrue("Expected no code remaining but was: " + output, output.trim().isEmpty());
  }

  @Test
  public void testSingleAlias() {
    String output = process(
        "goog.scope(function () {"
        + "  var x = goog.x;"
        + "  x();"
        + "});");

    assertTrue("Expected goog.x() call but was: " + output, output.contains("goog.x();"));
    assertFalse("Alias declaration should be removed but was: " + output, output.contains("var x"));
    assertFalse("goog.scope should be removed but was: " + output, output.contains("goog.scope"));
  }

  @Test
  public void testMultipleAliases() {
    String output = process(
        "goog.scope(function () {"
        + "  var a = goog.a;"
        + "  var b = goog.b;"
        + "  a();"
        + "  b();"
        + "});");

    assertTrue("Expected a() and b() calls but was: " + output,
        output.contains("goog.a();") && output.contains("goog.b();"));
    assertFalse("Alias definitions should be removed but was: " + output,
        output.contains("var a") || output.contains("var b"));
  }

  @Test
  public void testNonAliasLocalVariableReportsError() {
    assertError(
        "goog.scope(function () { var x = 1; });",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testAliasRedefinitionReportsError() {
    assertError(
        "goog.scope(function () {"
        + "  var x = goog.a;"
        + "  var x = goog.b;"
        + "});",
        ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testReturnInsideGoogScopeReportsError() {
    assertError(
        "goog.scope(function () { return; });",
        ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testThisInsideGoogScopeReportsError() {
    assertError(
        "goog.scope(function () { this; });",
        ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testThrowInsideGoogScopeReportsError() {
    assertError(
        "goog.scope(function () { throw 1; });",
        ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testWrongParameterCountReportsError() {
    assertError(
        "goog.scope(function () {}, 1);",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeNotUsedAsExpressionStatementReportsError() {
    String code = "goog.scope(function () {});"
        + "if (goog.scope(function () {})) {}";
    assertError(code, ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  private static String process(String code) {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(SourceFile.fromCode("test.js", code));
    assertNotNull("Failed to parse: " + code, root);

    ScopedAliases scopedAliases = new ScopedAliases(compiler, null, NULL_HANDLER);
    scopedAliases.process(null, root);

    return compiler.toSource();
  }

  private static void assertError(String code, DiagnosticType expectedType) {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(SourceFile.fromCode("test.js", code));
    assertNotNull("Failed to parse: " + code, root);

    ScopedAliases scopedAliases = new ScopedAliases(compiler, null, NULL_HANDLER);
    scopedAliases.process(null, root);

    for (JSError error : compiler.getErrors()) {
      if (expectedType.equals(error.getType())) {
        return;
      }
    }

    fail(
        "Expected " + expectedType + " for code: "
            + code
            + " but got errors: "
            + Arrays.toString(compiler.getErrors()));
  }
}