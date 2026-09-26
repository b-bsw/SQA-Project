package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import java.util.Collections;
import org.junit.Test;

/**
 * Tests for the main functionality of {@link ScopedAliases}.
 */
public class ScopedAliasesTest {

  private static final class NoOpAliasTransformationHandler
      implements AliasTransformationHandler {
    @Override
    public AliasTransformation logAliasTransformation(
        String alias, Node definition) {
      return new AliasTransformation() {
        @Override
        public void addAlias(String alias, String expanded) {
          // no-op test handler
        }
      };
    }
  }

  private Compiler process(String code) throws Exception {
    return process(code, new NoOpAliasTransformationHandler());
  }

  private Compiler process(
      String code, AliasTransformationHandler transformationHandler) throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    compiler.init(
        Collections.<SourceFile>emptyList(),
        Collections.singletonList(SourceFile.fromCode("testcode", code)),
        options);

    Node root = compiler.getRoot();
    new ScopedAliases(compiler, null, transformationHandler).process(null, root);
    return compiler;
  }

  private JSError[] errors(Compiler compiler) {
    return compiler.getErrorManager().getErrors();
  }

  private void assertNoErrors(Compiler compiler) {
    assertEquals(
        "Expected no compiler errors, but got: " + java.util.Arrays.toString(errors(compiler)),
        0,
        errors(compiler).length);
  }

  @Test
  public void testEmptyScriptHasNoErrors() throws Exception {
    Compiler compiler = process("");
    assertNoErrors(compiler);
  }

  @Test
  public void testSimpleAliasIsExpanded() throws Exception {
    Compiler compiler =
        process("goog.scope(function () { var x = foo.bar; x.baz(); });");

    assertNoErrors(compiler);

    String source = compiler.toSource();
    assertTrue(
        "Expected alias expansion in: " + source,
        source.contains("foo.bar.baz()"));
  }

  @Test
  public void testAliasCycleIsReported() throws Exception {
    Compiler compiler =
        process("goog.scope(function () { var a = b; var b = a; });");

    JSError[] compilerErrors = errors(compiler);
    assertEquals(
        "Expected exactly one compilation error for an alias cycle.",
        1,
        compilerErrors.length);
    assertEquals(
        ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE,
        compilerErrors[0].getType());
  }

  @Test
  public void testReturnInsideGoogScopeIsReported() throws Exception {
    Compiler compiler =
        process("goog.scope(function () { var x = foo.bar; return x; });");

    JSError[] compilerErrors = errors(compiler);
    assertEquals(1, compilerErrors.length);
    assertEquals(
        ScopedAliases.GOOG_SCOPE_USES_RETURN,
        compilerErrors[0].getType());
  }

  @Test
  public void testThisReferenceInsideGoogScopeIsReported() throws Exception {
    Compiler compiler =
        process("goog.scope(function () { var x = foo.bar; this.foo; });");

    JSError[] compilerErrors = errors(compiler);
    assertEquals(1, compilerErrors.length);
    assertEquals(
        ScopedAliases.GOOG_SCOPE_REFERENCES_THIS,
        compilerErrors[0].getType());
  }

  @Test
  public void testThrowInsideGoogScopeIsReported() throws Exception {
    Compiler compiler =
        process("goog.scope(function () { var x = foo.bar; throw new Error('x'); });");

    JSError[] compilerErrors = errors(compiler);
    assertEquals(1, compilerErrors.length);
    assertEquals(
        ScopedAliases.GOOG_SCOPE_USES_THROW,
        compilerErrors[0].getType());
  }

  @Test
  public void testGoogScopeUsedAsExpressionIsReported() throws Exception {
    Compiler compiler =
        process("var f = goog.scope(function () {});");

    JSError[] compilerErrors = errors(compiler);
    assertEquals(1, compilerErrors.length);
    assertEquals(
        ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY,
        compilerErrors[0].getType());
  }
}