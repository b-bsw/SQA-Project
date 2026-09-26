package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CollapseVariableDeclarationsTest {

  private Compiler compiler;
  private CollapseVariableDeclarations pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCodingConvention(new GoogleCodingConvention());
    compiler.initOptions(options);
    pass = new CollapseVariableDeclarations(compiler);
  }

  @After
  public void tearDown() {
    compiler = null;
    pass = null;
  }

  private Node parseAndRun(String code) {
    SourceFile input = SourceFile.fromCode("test", code);
    compiler.compile(
        List.of(SourceFile.fromCode("externs", "function alert(x) {}")),
        List.of(input),
        new CompilerOptions());
    Node root = compiler.getRoot().getLastChild();
    pass.process(null, root);
    return root;
  }

  @Test
  public void testSimpleCollapse() {
    Node root = parseAndRun("var a = 1; var b = 2; var c = 3;");
    Node script = root.getFirstChild();
    assertNotNull(script);
    Node varNode = script.getFirstChild();
    assertTrue(varNode.isVar());
    int childCount = 0;
    Node child = varNode.getFirstChild();
    while (child != null) {
      childCount++;
      child = child.getNext();
    }
    assertEquals(3, childCount);
  }

  @Test
  public void testCollapseWithInitializedVars() {
    Node root = parseAndRun("var a; var b = 1; var c = 2;");
    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    assertTrue(varNode.isVar());
    int count = 0;
    for (Node child = varNode.getFirstChild(); child != null; child = child.getNext()) {
      count++;
    }
    assertEquals(3, count);
  }

  @Test
  public void testCollapseAssigns() {
    Node root = parseAndRun("a = 1; b = 2; var c = 3;");
    Node script = root.getFirstChild();
    Node first = script.getFirstChild();
    assertTrue(first.isVar());
    int count = 0;
    for (Node child = first.getFirstChild(); child != null; child = child.getNext()) {
      count++;
    }
    assertEquals(3, count);
  }

  @Test
  public void testNoCollapseWhenNoVar() {
    Node root = parseAndRun("a = 1; b = 2;");
    Node script = root.getFirstChild();
    Node first = script.getFirstChild();
    assertTrue(first.isExprResult());
  }

  @Test
  public void testNoCollapseAcrossIf() {
    Node root = parseAndRun("if (true) { var a = 1; } else { var b = 2; }");
    Node script = root.getFirstChild();
    Node ifNode = script.getFirstChild();
    assertTrue(ifNode.isIf());
    Node thenBlock = ifNode.getFirstChild().getNext();
    Node elseBlock = thenBlock.getNext();
    assertTrue(thenBlock.getFirstChild().isVar());
    assertTrue(elseBlock.getFirstChild().isVar());
  }

  @Test
  public void testNoCollapseForSeparateVars() {
    Node root = parseAndRun("var a = 1; someFunc(); var b = 2;");
    Node script = root.getFirstChild();
    Node first = script.getFirstChild();
    assertTrue(first.isVar());
    Node second = first.getNext();
    assertTrue(second.isCall());
    Node third = second.getNext();
    assertTrue(third.isVar());
  }

  @Test
  public void testAdjacentOnly() {
    Node root = parseAndRun("var a = 1; var b = 2; var c = 3; var d = 4;");
    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    assertTrue(varNode.isVar());
    int count = 0;
    for (Node child = varNode.getFirstChild(); child != null; child = child.getNext()) {
      count++;
    }
    assertEquals(4, count);
  }

  @Test
  public void testEmptyInput() {
    Node root = parseAndRun("");
    Node script = root.getFirstChild();
    assertEquals(0, script.getChildCount());
  }

  @Test
  public void testNoVarAtAll() {
    Node root = parseAndRun("function f() {}");
    Node script = root.getFirstChild();
    Node func = script.getFirstChild();
    assertTrue(func.isFunction());
  }

  @Test
  public void testRedeclarationJSDoc() {
    Node root = parseAndRun("a = 1; b = 2; var c = 3;");
    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    assertTrue(varNode.isVar());
    assertNotNull(varNode.getJSDocInfo());
    assertTrue(varNode.getJSDocInfo().isSuppress("duplicate"));
  }

  @Test
  public void testNoRedeclarationJSDocForPureVar() {
    Node root = parseAndRun("var a = 1; var b = 2;");
    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    assertTrue(varNode.isVar());
    assertEquals(null, varNode.getJSDocInfo());
  }

  @Test
  public void testExceptionOnNullExterns() {
    try {
      pass.process(null, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }
}