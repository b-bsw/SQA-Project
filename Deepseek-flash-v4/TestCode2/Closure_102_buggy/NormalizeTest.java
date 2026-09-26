package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Tests for {@link Normalize}.
 *
 * <p>This test suite covers available public methods and important branches:
 * normal processing, var declaration splitting, null input, empty AST nodes,
 * and assertion-on-change exception paths.
 */
public class NormalizeTest {

  private Compiler compiler;
  private Node externs;
  private Node root;

  @Before
  public void setUp() {
    compiler = new Compiler();
    externs = new Node(Token.SCRIPT);
    root = new Node(Token.SCRIPT);
  }

  private Normalize createNormalize(boolean assertOnChange) {
    return new Normalize(compiler, assertOnChange);
  }

  @Test
  public void testProcessWithEmptyRoots() {
    createNormalize(false).process(externs, root);
    assertTrue(root.getChildCount() == 0);
  }

  @Test
  public void testProcessSplitsVarDeclarations() {
    Node nameA = Node.newString(Token.NAME, "a");
    nameA.addChildToFront(Node.newNumber(0.0));
    Node nameB = Node.newString(Token.NAME, "b");
    nameB.addChildToFront(Node.newNumber(1.0));
    Node var = new Node(Token.VAR, nameA, nameB);
    root.addChildToBack(var);

    createNormalize(false).process(externs, root);

    assertEquals(2, root.getChildCount());
    Node var1 = root.getFirstChild();
    assertEquals(Token.VAR, var1.getType());
    assertEquals(1, var1.getChildCount());
    Node first = var1.getFirstChild();
    assertEquals(Token.NAME, first.getType());
    assertEquals("a", first.getString());

    Node var2 = root.getLastChild();
    assertEquals(Token.VAR, var2.getType());
    assertEquals(1, var2.getChildCount());
    Node second = var2.getFirstChild();
    assertEquals(Token.NAME, second.getType());
    assertEquals("b", second.getString());
  }

  @Test
  public void testShouldTraverseReturnsTrue() {
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal callbackT, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal callbackT, Node n, Node parent) {
      }
    });
    Node node = new Node(Token.EMPTY);
    assertTrue(createNormalize(false).shouldTraverse(t, node, null));
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessWhileWithAssertOnChangeThrows() {
    Node cond = new Node(Token.EMPTY);
    Node body = new Node(Token.EMPTY);
    root.addChildToBack(new Node(Token.WHILE, cond, body));
    createNormalize(true).process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessEmptyVarWithAssertOnChangeThrows() {
    root.addChildToBack(new Node(Token.VAR));
    createNormalize(true).process(externs, root);
  }

  @Test
  public void testProcessEmptyVarWithoutAssertOnChangeDoesNotThrow() {
    root.addChildToBack(new Node(Token.VAR));
    createNormalize(false).process(externs, root);
  }

  @Test(expected = NullPointerException.class)
  public void testProcessNullRootThrows() {
    createNormalize(false).process(externs, null);
  }
}