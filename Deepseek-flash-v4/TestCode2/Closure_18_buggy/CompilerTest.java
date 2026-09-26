package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompilerTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  @After
  public void tearDown() {
    compiler = null;
  }

  private void compile(String... inputSources) {
    List<SourceFile> inputs = new ArrayList<>();
    for (int i = 0; i < inputSources.length; i++) {
      inputs.add(SourceFile.fromCode("input" + i + ".js", inputSources[i]));
    }
    compiler.compile(Collections.<SourceFile>emptyList(), inputs, new CompilerOptions());
  }

  @Test
  public void testInitialState() {
    assertFalse(compiler.isIdeMode());
    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
    assertFalse(compiler.hasErrors());
    assertNotNull(compiler.getCodingConvention());
    assertNotNull(compiler.getErrorManager());
    assertNotNull(compiler.getErrors());
    assertNotNull(compiler.getWarnings());
  }

  @Test
  public void testSimpleCompile() {
    compile("var x = 1;");
    assertFalse(compiler.hasErrors());
    assertEquals(0, compiler.getErrorCount());
    assertNotNull(compiler.getRoot());
    assertNotNull(compiler.getResult());

    String source = compiler.toSource();
    assertNotNull(source);
    assertTrue(source.contains("x"));
  }

  @Test
  public void testToSourceArray() {
    compile("var a = 1;", "var b = 2;");
    String[] sources = compiler.toSourceArray();
    assertNotNull(sources);
    assertTrue(sources.length > 0);
  }

  @Test
  public void testSyntaxError() {
    compile("var x = ;");
    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrorCount() > 0);
    assertTrue(compiler.getErrors().length > 0);
  }

  @Test
  public void testDuplicateInputs() {
    List<SourceFile> inputs = Arrays.asList(
        SourceFile.fromCode("dup.js", "var a = 1;"),
        SourceFile.fromCode("dup.js", "var b = 2;"));

    compiler.compile(Collections.<SourceFile>emptyList(), inputs, new CompilerOptions());

    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testGetSourceFileByName() {
    compiler.compile(
        Collections.<SourceFile>emptyList(),
        Arrays.asList(SourceFile.fromCode("foo.js", "var a = 1;")),
        new CompilerOptions());

    assertNotNull(compiler.getSourceFileByName("foo.js"));
    assertNull(compiler.getSourceFileByName("missing.js"));
  }

  @Test
  public void testDisableThreads() {
    compiler.disableThreads();
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCodeBuilderAppend() {
    Compiler.CodeBuilder builder = new Compiler.CodeBuilder();
    assertSame(builder, builder.append("line1\nline2"));
    assertEquals("line1\nline2", builder.toString());
  }

  @Test
  public void testCodeBuilderAppendMultipleCalls() {
    Compiler.CodeBuilder builder = new Compiler.CodeBuilder();
    builder.append("a").append("b");
    assertEquals("ab", builder.toString());
  }
}