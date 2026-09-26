package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class InlineVariablesTest {

  private static String inline(String js, InlineVariables.Mode mode,
      boolean inlineAllStrings) throws Exception {
    CompilerOptions options = new CompilerOptions();
    Compiler compiler = new Compiler();
    List<SourceFile> externs = Arrays.asList(
        SourceFile.fromCode("externs", ""));
    List<SourceFile> inputs = Arrays.asList(
        SourceFile.fromCode("input", js));
    compiler.init(externs, inputs, options);
    InlineVariables pass = new InlineVariables(compiler, mode, inlineAllStrings);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    return compiler.toSource();
  }

  @Test
  public void testAllModeInlinesImmutableValue() throws Exception {
    String out = inline("var x = 1; foo(x);", InlineVariables.Mode.ALL, false);
    assertTrue(out, out.contains("foo(1)"));
    assertFalse(out, out.contains("var x"));
  }

  @Test
  public void testLocalsOnlyDoesNotInlineGlobal() throws Exception {
    String out = inline("var x = 1; foo(x);", InlineVariables.Mode.LOCALS_ONLY, false);
    assertTrue(out, out.contains("foo(x)"));
    assertFalse(out, out.contains("foo(1)"));
  }

  @Test
  public void testConstantsOnlyDoesNotInlineUnannotatedVar() throws Exception {
    String out = inline("var x = 1; foo(x);", InlineVariables.Mode.CONSTANTS_ONLY, false);
    assertTrue(out, out.contains("var x"));
    assertTrue(out, out.contains("foo(x)"));
  }

  @Test
  public void testInlinesMultipleReferences() throws Exception {
    String out = inline("var x = 1; foo(x); bar(x);", InlineVariables.Mode.ALL, false);
    assertTrue(out, out.contains("foo(1)"));
    assertTrue(out, out.contains("bar(1)"));
  }

  @Test
  public void testDoesNotInlineReassignedVariable() throws Exception {
    String out = inline("var x = 1; x = 2; foo(x);", InlineVariables.Mode.ALL, false);
    assertTrue(out, out.contains("x = 2"));
    assertTrue(out, out.contains("foo(x)"));
  }

  @Test
  public void testEmptySourceIsUnchanged() throws Exception {
    String out = inline("", InlineVariables.Mode.ALL, false);
    assertTrue(out.trim().isEmpty());
  }

  @Test(expected = NullPointerException.class)
  public void testProcessNullJsRootThrows() throws Exception {
    CompilerOptions options = new CompilerOptions();
    Compiler compiler = new Compiler();
    List<SourceFile> externs = Arrays.asList(
        SourceFile.fromCode("externs", ""));
    List<SourceFile> inputs = Arrays.asList(
        SourceFile.fromCode("input", "var x = 1;"));
    compiler.init(externs, inputs, options);
    InlineVariables pass = new InlineVariables(
        compiler, InlineVariables.Mode.ALL, false);
    pass.process(compiler.getExternsRoot(), null);
  }
}