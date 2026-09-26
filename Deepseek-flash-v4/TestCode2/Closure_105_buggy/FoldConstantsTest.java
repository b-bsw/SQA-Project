package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

/**
 * End-to-end tests for {@link FoldConstants}.
 *
 * <p>These tests parse a small JavaScript program, run {@link FoldConstants}
 * over the AST, and then verify the resulting constant-folded AST.
 */
public class FoldConstantsTest {

  private static final double DELTA = 0.0;

  private Node fold(String js) {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());

    Node root = compiler.parse(SourceFile.fromCode("input", js));
    if (root == null) {
      fail("Unable to parse: " + js);
    }

    new FoldConstants(compiler).process(null, root);
    return root;
  }

  private Node valueOfVar(String js) {
    Node stmt = fold(js).getFirstChild();
    if (stmt == null) {
      fail("Expected a var statement but program was empty: " + js);
    }
    if (stmt.getType() != Token.VAR) {
      fail("Expected a var statement but found node type " + stmt.getType());
    }
    return stmt.getLastChild();
  }

  @Test
  public void foldsNumericAddition() {
    Node value = valueOfVar("var x = 1 + 2;");
    assertEquals(Token.NUMBER, value.getType());
    assertEquals(3.0, value.getDouble(), DELTA);
  }

  @Test
  public void foldsStringConcatenation() {
    Node value = valueOfVar("var x = 'a' + 'b';");
    assertEquals(Token.STRING, value.getType());
    assertEquals("ab", value.getString());
  }

  @Test
  public void foldsComparisonToBooleanConstant() {
    Node value = valueOfVar("var x = 1 < 2;");
    assertEquals(Token.TRUE, value.getType());
  }

  @Test
  public void foldsTypeofConstant() {
    Node value = valueOfVar("var x = typeof 'x';");
    assertEquals(Token.STRING, value.getType());
    assertEquals("string", value.getString());
  }

  @Test
  public void foldsLogicalNot() {
    Node value = valueOfVar("var x = !true;");
    assertEquals(Token.FALSE, value.getType());
  }

  @Test
  public void foldsConstantHook() {
    Node value = valueOfVar("var x = true ? 1 : 2;");
    assertEquals(Token.NUMBER, value.getType());
    assertEquals(1.0, value.getDouble(), DELTA);
  }

  @Test
  public void foldsConstantArrayAccess() {
    Node value = valueOfVar("var x = [1, 2][0];");
    assertEquals(Token.NUMBER, value.getType());
    assertEquals(1.0, value.getDouble(), DELTA);
  }

  @Test
  public void foldsSafeRegExpConstructor() {
    Node value = valueOfVar("var x = new RegExp('a');");
    assertEquals(Token.REGEXP, value.getType());
  }

  @Test
  public void doesNotFoldRegExpWithInvalidFlags() {
    Node value = valueOfVar("var x = new RegExp('a', 'invalid');");
    assertEquals(Token.NEW, value.getType());
  }

  @Test
  public void doesNotFoldRegExpWithUnsafeGlobalFlag() {
    Node value = valueOfVar("var x = new RegExp('a', 'g');");
    assertEquals(Token.NEW, value.getType());
  }

  @Test
  public void doesNotFoldNonLiteralNegation() {
    Node value = valueOfVar("var x = -y;");
    assertEquals(Token.NEG, value.getType());
  }

  @Test
  public void emptyProgramFoldsWithoutError() {
    Node root = fold("");
    assertNotNull(root);
    assertFalse(root.hasChildren());
  }
}