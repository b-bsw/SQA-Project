package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.junit.Test;

public class NodeTraversalTest {

  private static class NoOpCallback implements NodeTraversal.Callback {
    @Override
    public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
      return true;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
    }
  }

  private static class RecordingCallback implements NodeTraversal.Callback {
    final boolean pruneBlocks;
    final List<Node> visited = new ArrayList<>();

    RecordingCallback(boolean pruneBlocks) {
      this.pruneBlocks = pruneBlocks;
    }

    @Override
    public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
      return !(pruneBlocks && n.getType() == Token.BLOCK);
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      visited.add(n);
    }
  }

  private static Compiler newCompiler() {
    return new Compiler();
  }

  private static void set(Object target, String name, Object value) {
    try {
      Field f = NodeTraversal.class.getDeclaredField(name);
      f.setAccessible(true);
      f.set(target, value);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("unchecked")
  private static <T> Deque<T> getDeque(Object target, String name) {
    try {
      Field f = NodeTraversal.class.getDeclaredField(name);
      f.setAccessible(true);
      return (Deque<T>) f.get(target);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static Scope createScriptScope() {
    Node script = new Node(Token.SCRIPT);
    return new SyntacticScopeCreator(newCompiler()).createScope(script, null);
  }

  private static Node createSimpleTree() {
    Node root = new Node(Token.SCRIPT);
    Node block = new Node(Token.BLOCK);
    Node leaf = new Node(Token.EXPR_RESULT);
    root.addChildToBack(block);
    block.addChildToBack(leaf);
    return root;
  }

  @Test
  public void testTraverseVisitsAllNodesInPostOrder() {
    Node root = createSimpleTree();
    Node block = root.getFirstChild();
    Node leaf = block.getFirstChild();

    RecordingCallback cb = new RecordingCallback(false);
    NodeTraversal t = new NodeTraversal(newCompiler(), cb);

    t.traverse(root);

    assertEquals(3, cb.visited.size());
    assertSame(leaf, cb.visited.get(0));
    assertSame(block, cb.visited.get(1));
    assertSame(root, cb.visited.get(2));
  }

  @Test
  public void testTraverseShouldTraverseFalsePrunesSubtree() {
    Node root = createSimpleTree();
    Node block = root.getFirstChild();
    Node leaf = block.getFirstChild();

    RecordingCallback cb = new RecordingCallback(true);
    NodeTraversal t = new NodeTraversal(newCompiler(), cb);

    t.traverse(root);

    assertEquals(1, cb.visited.size());
    assertSame(root, cb.visited.get(0));
    assertFalse(cb.visited.contains(block));
    assertFalse(cb.visited.contains(leaf));
  }

  @Test
  public void testTraverseRootsVisitsEachRoot() {
    Node script = new Node(Token.SCRIPT);
    Node first = new Node(Token.EXPR_RESULT);
    Node second = new Node(Token.EXPR_RESULT);
    script.addChildToBack(first);
    script.addChildToBack(second);

    final List<Node> visited = new ArrayList<>();
    NodeTraversal.Callback cb = new NoOpCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    };

    new NodeTraversal(newCompiler(), cb).traverseRoots(first, second);

    assertEquals(2, visited.size());
    assertSame(first, visited.get(0));
    assertSame(second, visited.get(1));
  }

  @Test
  public void testTraverseRootsWithEmptyVarargsDoesNotThrow() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());
    t.traverseRoots(new Node[0]);
  }

  @Test
  public void testGetSourceName() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());
    set(t, "sourceName", "input.js");
    assertEquals("input.js", t.getSourceName());
  }

  @Test
  public void testGetCompiler() {
    Compiler compiler = newCompiler();
    NodeTraversal t = new NodeTraversal(compiler, new NoOpCallback());
    assertSame(compiler, t.getCompiler());
  }

  @Test
  public void testGetLineNumber() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());

    set(t, "curNode", new Node(Token.EMPTY, 42, -1));
    assertEquals(42, t.getLineNumber());

    set(t, "curNode", new Node(Token.EMPTY, -1, -1));
    assertEquals(0, t.getLineNumber());
  }

  @Test
  public void testGetInputAndModuleForUnknownInput() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());
    set(t, "inputId", new InputId("unknown"));
    assertNull(t.getInput());
    assertNull(t.getModule());
  }

  @Test
  public void testHasScopeAndScopeDepth() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());

    assertFalse(t.hasScope());
    assertEquals(0, t.getScopeDepth());

    Deque<Node> scopeRoots = getDeque(t, "scopeRoots");
    scopeRoots.addFirst(new Node(Token.FUNCTION));

    assertTrue(t.hasScope());
    assertEquals(1, t.getScopeDepth());
  }

  @Test
  public void testGetEnclosingFunctionWhenSizeLessThanTwo() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());
    getDeque(t, "scopeRoots").addFirst(new Node(Token.FUNCTION));
    assertNull(t.getEnclosingFunction());
  }

  @Test
  public void testGetEnclosingFunctionUsesScopeRoots() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());

    Deque<Node> scopeRoots = getDeque(t, "scopeRoots");
    scopeRoots.addLast(new Node(Token.EMPTY));

    Node function = new Node(Token.FUNCTION);
    scopeRoots.addFirst(function);

    assertSame(function, t.getEnclosingFunction());
  }

  @Test
  public void testGetEnclosingFunctionUsesScopes() {
    NodeTraversal t = new NodeTraversal(newCompiler(), new NoOpCallback());

    Scope first = createScriptScope();
    Scope second = createScriptScope();

    Deque<Scope> scopes = getDeque(t, "scopes");
    scopes.addFirst(first);
    scopes.addFirst(second);

    assertSame(second.getRootNode(), t.getEnclosingFunction());
  }
}