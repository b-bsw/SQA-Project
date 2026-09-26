package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import org.junit.Test;

public class InlineObjectLiteralsTest {

  private static class SequentialIdSupplier implements Supplier<String> {
    private int id = 0;

    @Override
    public String get() {
      return String.valueOf(id++);
    }
  }

  private String run(String code) {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());

    Node externs = compiler.parse(SourceFile.fromCode("externs", ""));
    Node root = compiler.parse(SourceFile.fromCode("test", code));

    new InlineObjectLiterals(compiler, new SequentialIdSupplier())
        .process(externs, root);

    return compiler.toSource();
  }

  @Test
  public void inlinesLocalObjectWithOnlyPropertyReads() {
    String result = run(
        "function f() { var x = {a:1, b:2}; return x.a + x.b; }");

    assertTrue(result.contains("JSCompiler_object_inline_a_0"));
    assertTrue(result.contains("JSCompiler_object_inline_b_1"));
  }

  @Test
  public void doesNotInlineGlobalObject() {
    String result = run("var x = {a:1, b:2}; x.a;");

    assertFalse(result.contains("JSCompiler_object_inline_"));
  }

  @Test
  public void doesNotInlineWhenObjectIsUsedDirectly() {
    String result = run("function f() { var x = {a:1,b:2}; return x; }");

    assertFalse(result.contains("JSCompiler_object_inline_"));
  }

  @Test
  public void doesNotInlineWhenReferencedPropertyIsMissing() {
    String result = run("function f() { var x = {a:1,b:2}; return x.c; }");

    assertFalse(result.contains("JSCompiler_object_inline_"));
  }

  @Test
  public void doesNotInlineWhenMethodIsCalledOnObject() {
    String result = run("function f() { var x = {a:1,b:2}; return x.foo(); }");

    assertFalse(result.contains("JSCompiler_object_inline_"));
  }

  @Test
  public void doesNotInlineSelfReferencingInitializer() {
    String result = run(
        "function f() { var x = {a:1, b:x.a}; return x.b; }");

    assertFalse(result.contains("JSCompiler_object_inline_"));
  }

  @Test
  public void leavesNonObjectVariablesAlone() {
    String result = run("function f() { var n = 0; return n + 1; }");

    assertFalse(result.contains("JSCompiler_object_inline_"));
  }
}