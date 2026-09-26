package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompilerTest {

  private CompilerOptions options;

  @Before
  public void setUp() {
    options = new CompilerOptions();
  }

  @After
  public void tearDown() {
  }

  private static SourceFile source(String name, String code) {
    return SourceFile.fromCode(name, code);
  }

  private static List<SourceFile> externs() {
    return Collections.singletonList(source("externs.js", "var extern;"));
  }

  private Compiler compile(String code) {
    return compile(source("test.js", code));
  }

  private Compiler compile(SourceFile... inputFiles) {
    Compiler compiler = new Compiler();
    Result result = compiler.compile(externs(), Arrays.asList(inputFiles), options);
    assertNotNull(result);
    return compiler;
  }

  @Test
  public void testDefaultState() {
    Compiler compiler = new Compiler();
    assertNotNull(compiler.getErrorManager());
    assertNotNull(compiler.getSourceMap());
    assertNotNull(compiler.getErrors());
    assertNotNull(compiler.getWarnings());
    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
    assertFalse(compiler.hasErrors());
    assertTrue(compiler.getProgress() >= 0.0);
  }

  @Test
  public void testCompileEmptySource() {
    Compiler compiler = compile("");
    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
    assertFalse(compiler.hasErrors());
    assertNotNull(compiler.getRoot());
    assertNotNull(compiler.toSource());
    assertSame(options, compiler.getOptions());
  }

  @Test
  public void testCompileSimpleCode() {
    Compiler compiler = compile("var x = 1;");
    assertEquals(0, compiler.getErrorCount());
    assertFalse(compiler.hasErrors());
    assertEquals(1, compiler.toSourceArray().length);
    assertTrue(compiler.toSourceArray()[0].contains("var x"));
  }

  @Test
  public void testCompileMultipleInputs() {
    Compiler compiler = compile(
        source("a.js", "var a = 1;"),
        source("b.js", "var b = 2;"),
        source("c.js", "var c = 3;"));

    String[] sources = compiler.toSourceArray();
    assertEquals(3, sources.length);
    assertTrue(sources[0].contains("var a"));
    assertTrue(sources[2].contains("var c"));
  }

  @Test
  public void testParseErrorReportsError() {
    Compiler compiler = compile("var x = ;");

    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrorCount() > 0);
    assertEquals(0, compiler.getWarningCount());
    assertTrue(compiler.getErrors().length > 0);
    assertTrue(compiler.getMessages().length >= compiler.getErrors().length);
  }

  @Test
  public void testGetResultIsStable() {
    Compiler compiler = compile("var x = 1;");
    assertNotNull(compiler.getResult());
    assertSame(compiler.getResult(), compiler.getResult());
  }

  @Test
  public void testDisableThreadsDoesNotThrow() {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testSetProgressClampsValues() {
    Compiler compiler = new Compiler();

    compiler.setProgress(0.5);
    assertEquals(0.5, compiler.getProgress(), 0.0);

    compiler.setProgress(2.0);
    assertEquals(1.0, compiler.getProgress(), 0.0);

    compiler.setProgress(-1.0);
    assertEquals(0.0, compiler.getProgress(), 0.0);
  }

  @Test
  public void testNullOptionsRejected() {
    Compiler compiler = new Compiler();

    try {
      compiler.compile(
          externs(),
          Collections.singletonList(source("test.js", "var x = 1;")),
          null);
      fail("Expected runtime exception for null options");
    } catch (RuntimeException expected) {
      assertNotNull(expected);
    }
  }
}