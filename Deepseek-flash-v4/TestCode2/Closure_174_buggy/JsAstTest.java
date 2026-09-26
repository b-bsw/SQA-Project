package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;

public class JsAstTest {
  private Compiler compiler;
  private SourceFile sourceFile;
  private JsAst ast;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    ast = new JsAst(sourceFile);
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testGetAstRootSetsInputId() {
    Node root = ast.getAstRoot(compiler);
    assertNotNull(root);
    assertTrue(root.isScript());
    assertNotNull(root.getInputId());
    assertSame(ast.getInputId(), root.getInputId());
  }

  @Test
  public void testGetAstRootCachesResult() {
    Node first = ast.getAstRoot(compiler);
    Node second = ast.getAstRoot(compiler);
    assertSame(first, second);
  }

  @Test
  public void testClearAstClearsRoot() {
    Node first = ast.getAstRoot(compiler);
    ast.clearAst();
    Node second = ast.getAstRoot(compiler);
    assertNotSame(first, second);
  }

  @Test
  public void testClearAstOnFreshInstanceDoesNotThrow() {
    ast.clearAst();
  }

  @Test
  public void testGetInputId() {
    InputId id = ast.getInputId();
    assertNotNull(id);
    assertEquals("test.js", id.getId());
    assertSame(id, ast.getInputId());
  }

  @Test
  public void testGetSourceFile() {
    assertSame(sourceFile, ast.getSourceFile());
  }

  @Test
  public void testSetSourceFileUpdatesSourceFile() {
    SourceFile newFile = SourceFile.fromCode("test.js", "var y = 2;");
    ast.setSourceFile(newFile);
    assertSame(newFile, ast.getSourceFile());
  }

  @Test(expected = IllegalStateException.class)
  public void testSetSourceFileWithDifferentNameThrows() {
    SourceFile newFile = SourceFile.fromCode("other.js", "var y = 2;");
    ast.setSourceFile(newFile);
  }

  @Test
  public void testGetAstRootWithIOExceptionUsesScript() {
    SourceFile badFile = SourceFile.fromFile("/nonexistent/path/definitely/missing.js");
    JsAst badAst = new JsAst(badFile);
    Node root = badAst.getAstRoot(compiler);
    assertNotNull(root);
    assertTrue(root.isScript());
    assertTrue(compiler.getErrors().length > 0);
  }

  @Test
  public void testGetAstRootUsesScriptWhenCompilerHasHaltingErrors() {
    Compiler errorCompiler = new Compiler() {
      @Override
      public boolean hasHaltingErrors() {
        return true;
      }
    };
    errorCompiler.initOptions(new CompilerOptions());
    JsAst haltingAst = new JsAst(sourceFile);
    Node root = haltingAst.getAstRoot(errorCompiler);
    assertTrue(root.isScript());
  }

  @Test
  public void testEmptyCodeParse() {
    JsAst emptyAst = new JsAst(SourceFile.fromCode("empty.js", ""));
    Node root = emptyAst.getAstRoot(compiler);
    assertNotNull(root);
    assertTrue(root.isScript());
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorWithNullSourceFileThrowsNPE() {
    new JsAst(null);
  }
}