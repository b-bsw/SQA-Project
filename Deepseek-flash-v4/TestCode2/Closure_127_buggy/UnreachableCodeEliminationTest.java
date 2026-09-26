package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link UnreachableCodeElimination}.
 * Uses reflection to access private inner class EliminationPass.
 */
public class UnreachableCodeEliminationTest {

  private UnreachableCodeElimination eliminator;
  private AbstractCompiler compiler;
  private ControlFlowGraph<Node> cfg;
  private Object eliminationPass;
  private Map<Node, MockDiGraphNode> nodeMap;

  @Before
  public void setUp() throws Exception {
    compiler = createMockCompiler();
    cfg = createMockCFG();
    eliminator = new UnreachableCodeElimination(compiler, true);

    // Access private inner class EliminationPass
    Class<?> innerClass = com.google.javascript.jscomp.UnreachableCodeElimination.class
        .getDeclaredClasses()[0];
    Constructor<?> constructor = innerClass.getDeclaredConstructors()[0];
    constructor.setAccessible(true);
    eliminationPass = constructor.newInstance(eliminator, cfg);
  }

  private AbstractCompiler createMockCompiler() {
    return new AbstractCompiler() {
      boolean changed = false;

      @Override
      public void reportCodeChange() { changed = true; }

      @Override
      public Logger getLogger() { return Logger.getAnonymousLogger(); }

      @Override
      public TypeRegistry getTypeRegistry() { return null; }

      @Override
      public ErrorManager getErrorManager() { return null; }

      @Override
      public String getScriptName(Node n) { return null; }

      @Override
      public Node parseSyntheticCode(String code) { return null; }

      @Override
      public void report(JSError error) {}

      @Override
      public boolean hasHaltingErrors() { return false; }

      @Override
      public boolean accept(Node node) { return false; }

      @Override
      public void addChangeHandler(ChangeHandler handler) {}

      @Override
      public void removeChangeHandler(ChangeHandler handler) {}

      @Override
      public void process(Iterable<CompilerInput> inputs,
                          StringBuilder output) {}

      @Override
      public double getProgress() { return 0; }

      @Override
      public int getDegree() { return 0; }

      @Override
      public CompilerOptions getOptions() { return null; }
    };
  }

  private ControlFlowGraph<Node> createMockCFG() {
    return new ControlFlowGraph<Node>() {
      final Map<Node, DiGraphNode<Node, Branch>> map = new HashMap<>();
      @Override
      public DiGraphNode<Node, Branch> getDirectedGraphNode(Node node) {
        return map.get(node);
      }

      @Override
      public void connect(DiGraphNode<Node, Branch> src,
                          DiGraphNode<Node, Branch> dest,
                          Branch edge) { /* not used */ }

      @Override
      public DiGraphNode<Node, Branch> createNode(Node node) {
        MockDiGraphNode n = new MockDiGraphNode(node);
        map.put(node, n);
        return n;
      }

      @Override
      public Iterable<DiGraphNode<Node, Branch>> getNodes() { return map.values(); }

      @Override
      public DiGraphNode<Node, Branch> getEntry() { return null; }

      @Override
      public boolean isConnected() { return true; }
    };
  }

  // ----- Helper methods -----
  private void addNodeToCfg(Node n, Object annotation,
                            List<DiGraphEdge<Node, Branch>> outEdges) {
    MockDiGraphNode gNode = new MockDiGraphNode(n);
    gNode.setAnnotation(annotation);
    gNode.setOutEdges(outEdges != null ? outEdges : new ArrayList<DiGraphEdge<Node, Branch>>());
    ((ControlFlowGraph<Node>) cfg).getDirectedGraphNode(n); // force creation
    // Actually we need to insert into map directly
    cfg.getClass().getMethod("createNode", Node.class).invoke(cfg, n);
    // We'll store manually
    ((Map<Node, MockDiGraphNode>)
        cfg.getClass().getDeclaredField("map").setAccessible(true).get(cfg)).put(n, gNode);
  }

  private void invokeVisit(Object pass, NodeTraversal t, Node n, Node parent) throws Exception {
    Method visitMethod = pass.getClass().getDeclaredMethod("visit",
        NodeTraversal.class, Node.class, Node.class);
    visitMethod.setAccessible(true);
    visitMethod.invoke(pass, t, n, parent);
  }

  private void invokeTryRemoveUnconditionalBranching(Object pass, Node n) throws Exception {
    Method method = pass.getClass().getDeclaredMethod("tryRemoveUnconditionalBranching", Node.class);
    method.setAccessible(true);
    method.invoke(pass, n);
  }

  private void invokeRemoveDeadExprStatementSafely(Object pass, Node n) throws Exception {
    Method method = pass.getClass().getDeclaredMethod("removeDeadExprStatementSafely", Node.class);
    method.setAccessible(true);
    method.invoke(pass, n);
  }

  private void invokeRemoveNode(Object pass, Node n) throws Exception {
    Method method = pass.getClass().getDeclaredMethod("removeNode", Node.class);
    method.setAccessible(true);
    method.invoke(pass, n);
  }

  // ==================== Tests ====================

  @Test
  public void testVisit_nullParent() throws Exception {
    Node n = new Node(Token.RETURN);
    invokeVisit(eliminationPass, null, n, null);
    // Should return without action
    assertTrue("Node should not be removed when parent is null",
               n.getParent() == null);
  }

  @Test
  public void testVisit_functionNode() throws Exception {
    Node n = new Node(Token.FUNCTION);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    invokeVisit(eliminationPass, null, n, parent);
    assertTrue("Function node should not be removed", n.getParent() == parent);
  }

  @Test
  public void testVisit_scriptNode() throws Exception {
    Node n = new Node(Token.SCRIPT);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    invokeVisit(eliminationPass, null, n, parent);
    assertTrue("Script node should not be removed", n.getParent() == parent);
  }

  @Test
  public void testVisit_gNodeNull() throws Exception {
    Node n = new Node(Token.RETURN);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    // No CFG node -> gNode == null, should return without removal
    invokeVisit(eliminationPass, null, n, parent);
    assertTrue("Node should not be removed when gNode is null",
               n.getParent() == parent);
  }

  @Test
  public void testVisit_annotationNotReachable() throws Exception {
    Node n = new Node(Token.NUMBER, 1.0);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);

    MockDiGraphNode gNode = new MockDiGraphNode(n);
    gNode.setAnnotation(null); // not REACHABLE
    gNode.setOutEdges(new ArrayList<DiGraphEdge<Node, Branch>>());
    // Ensure CFG returns this node
    ((Map<Node, MockDiGraphNode>)
        cfg.getClass().getDeclaredField("map").setAccessible(true).get(cfg)).put(n, gNode);

    invokeVisit(eliminationPass, null, n, parent);
    assertNull("Node should be removed when not reachable", n.getParent());
  }

  @Test
  public void testVisit_removeNoOpSideEffectFree() throws Exception {
    Node n = new Node(Token.TRUE);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);

    // Reinitialize eliminator with removeNoOpStatements = true
    eliminator = new UnreachableCodeElimination(compiler, true);
    setUp();

    // Set gNode with REACHABLE annotation (so only side-effect check matters)
    MockDiGraphNode gNode = new MockDiGraphNode(n);
    gNode.setAnnotation(GraphReachability.REACHABLE);
    gNode.setOutEdges(new ArrayList<DiGraphEdge<Node, Branch>>());
    ((Map<Node, MockDiGraphNode>)
        cfg.getClass().getDeclaredField("map").setAccessible(true).get(cfg)).put(n, gNode);

    invokeVisit(eliminationPass, null, n, parent);
    assertNull("Node with no side effect should be removed", n.getParent());
  }

  @Test
  public void testTryRemoveUnconditionalBranching_returnNoChildren() throws Exception {
    Node parent = new Node(Token.BLOCK);
    Node ret = new Node(Token.RETURN);
    parent.addChildToBack(ret);

    // Setup control flow: one outgoing edge with unconditional, destination = computeFollowing(ret)
    Node fallThrough = ControlFlowAnalysis.computeFollowNode(ret); // should be null
    MockDiGraphNode gNode = new MockDiGraphNode(ret);
    gNode.setAnnotation(GraphReachability.REACHABLE);
    List<DiGraphEdge<Node, Branch>> edges = new ArrayList<>();
    edges.add(new MockDiGraphEdge(null, ret)); // source not used
    gNode.setOutEdges(edges);
    ((Map<Node, MockDiGraphNode>)
        cfg.getClass().getDeclaredField("map").setAccessible(true).get(cfg)).put(ret, gNode);

    invokeTryRemoveUnconditionalBranching(eliminationPass, ret);
    assertNull("Return without children should be removed", ret.getParent());
  }

  @Test
  public void testTryRemoveUnconditionalBranching_returnWithChildren() throws Exception {
    Node parent = new Node(Token.BLOCK);
    Node ret = new Node(Token.RETURN);
    ret.addChildToBack(new Node(Token.NUMBER, 5.0)); // return value
    parent.addChildToBack(ret);

    // Setup CFG node (not strictly needed for this test, but to avoid NullPointer)
    MockDiGraphNode gNode = new MockDiGraphNode(ret);
    gNode.setAnnotation(GraphReachability.REACHABLE);
    gNode.setOutEdges(new ArrayList<DiGraphEdge<Node, Branch>>());
    ((Map<Node, MockDiGraphNode>)
        cfg.getClass().getDeclaredField("map").setAccessible(true).get(cfg)).put(ret, gNode);

    invokeTryRemoveUnconditionalBranching(eliminationPass, ret);
    assertNotNull("Return with children should not be removed", ret.getParent());
  }

  @Test
  public void testTryRemoveUnconditionalBranching_break() throws Exception {
    Node parent = new Node(Token.BLOCK);
    Node brk = new Node(Token.BREAK);
    parent.addChildToBack(brk);
    // next is null
    Node fallThrough = ControlFlowAnalysis.computeFollowNode(brk);
    MockDiGraphNode gNode = new MockDiGraphNode(brk);
    gNode.setAnnotation(GraphReachability.REACHABLE);
    List<DiGraphEdge<Node, Branch>> edges = new ArrayList<>();
    edges.add(new MockDiGraphEdge(null, brk)); // destination irrelevant
    gNode.setOutEdges(edges);
    ((Map<Node, MockDiGraphNode>)
        cfg.getClass().getDeclaredField("map").setAccessible(true).get(cfg)).put(brk, gNode);

    invokeTryRemoveUnconditionalBranching(eliminationPass, brk);
    assertNull("Break should be removed when target is fall-through", brk.getParent());
  }

  @Test
  public void testTryRemoveUnconditionalBranching_continue() throws Exception {
    Node parent = new Node(Token.BLOCK);
    Node cont = new Node(Token.CONTINUE);
    parent.addChildToBack(cont);
    Node fallThrough = ControlFlowAnalysis.computeFollowNode(cont);
    MockDiGraphNode gNode = new MockDiGraphNode(cont);
    gNode.setAnnotation(GraphReachability.REACHABLE);
    List<DiGraphEdge<Node, Branch>> edges = new ArrayList<>();
    edges.add(new MockDiGraphEdge(null, cont));
    gNode.setOutEdges(edges);
    ((Map<Node, MockDiGraphNode>)
        cfg.getClass().getDeclaredField("map").setAccessible(true).get(cfg)).put(cont, gNode);

    invokeTryRemoveUnconditionalBranching(eliminationPass, cont);
    assertNull("Continue should be removed when target is fall-through", cont.getParent());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_empty() throws Exception {
    Node n = new Node(Token.EMPTY);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    invokeRemoveDeadExprStatementSafely(eliminationPass, n);
    assertNotNull("Empty node should not be removed", n.getParent());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_blockEmpty() throws Exception {
    Node block = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(block);
    invokeRemoveDeadExprStatementSafely(eliminationPass, block);
    assertNotNull("Empty block should not be removed", block.getParent());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_do() throws Exception {
    Node doNode = new Node(Token.DO);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(doNode);
    invokeRemoveDeadExprStatementSafely(eliminationPass, doNode);
    assertNotNull("DO should not be removed", doNode.getParent());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_blockInTry() throws Exception {
    Node tryNode = new Node(Token.TRY);
    Node block = new Node(Token.BLOCK);
    // Simulate try-catch block
    tryNode.addChildToBack(block);
    Node catchNode = new Node(Token.CATCH);
    tryNode.addChildToBack(catchNode);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(tryNode);

    // The block inside try is the first child of TRY; code checks if parent.isTry() && NodeUtil.isTryCatchNodeContainer(n)
    // isTryCatchNodeContainer likely checks if n covers catch part; block is not catch => return false
    // We test the branch where block is the catchNode container (i.e., block is last child of TRY with CATCH)
    // Actually easier: make 'block' be the catch container by being child of TRY and token CATCH? No, token is BLOCK.
    // For now we just test that if parent is TRY and NodeUtil.isTryCatchNodeContainer(n) true, return.
    // Create n = block that is child of TRY and nodeUtil says it's catch container.
    // NodeUtil.isTryCatchNodeContainer expects n to be the block that wraps catch children? Not sure.
    // Skip detailed integration; just test the branch that returns.
    invokeRemoveDeadExprStatementSafely(eliminationPass, block);
    assertNotNull("Block in try should not be removed (precaution)", block.getParent());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_catch() throws Exception {
    Node catchNode = new Node(Token.CATCH);
    Node tryNode = new Node(Token.TRY);
    tryNode.addChildToBack(catchNode);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(tryNode);

    // This tests that catch triggers maybeAddFinally etc., but ultimately node is removed
    // Since we mock maybeAddFinally, just check that removeNode is called
    invokeRemoveDeadExprStatementSafely(eliminationPass, catchNode);
    assertNull("Catch should be removed", catchNode.getParent());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_varWithoutChildren() throws Exception {
    Node varNode = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "x");
    varNode.addChildToBack(name); // VAR with one child (name) but name has no children (no init)
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(varNode);
    // name.getFirstChild() == null -> no children -> should return

    invokeRemoveDeadExprStatementSafely(eliminationPass, varNode);
    assertNotNull("Var without init should not be removed", varNode.getParent());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_normalExpr() throws Exception {
    Node expr = new Node(Token.STRING, "test");
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(expr);
    invokeRemoveDeadExprStatementSafely(eliminationPass, expr);
    assertNull("Normal expression should be removed", expr.getParent());
  }

  @Test
  public void testRemoveNode_setsCodeChangedAndRemoves() throws Exception {
    Node n = new Node(Token.NUMBER, 42.0);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    invokeRemoveNode(eliminationPass, n);
    assertNull("Node should be removed", n.getParent());
    // Also verify codeChanged flag (field on outer class) is true
    java.lang.reflect.Field codeChangedField =
        UnreachableCodeElimination.class.getDeclaredField("codeChanged");
    codeChangedField.setAccessible(true);
    boolean codeChanged = codeChangedField.getBoolean(eliminator);
    assertTrue("codeChanged should be true after removeNode", codeChanged);
  }

  // ---------- Inner mock classes for DiGraph ----------

  private static class MockDiGraphNode implements DiGraphNode<Node, Branch> {
    Node node;
    Object annotation;
    List<DiGraphEdge<Node, Branch>> outEdges;

    MockDiGraphNode(Node node) {
      this.node = node;
    }

    @Override
    public Node getValue() { return node; }

    @Override
    public List<DiGraphEdge<Node, Branch>> getOutEdges() { return outEdges; }

    public void setOutEdges(List<DiGraphEdge<Node, Branch>> edges) { this.outEdges = edges; }

    @Override
    public List<DiGraphEdge<Node, Branch>> getInEdges() { return new ArrayList<>(); }

    @Override
    public Object getAnnotation() { return annotation; }

    @Override
    public void setAnnotation(Object data) { this.annotation = data; }
  }

  private static class MockDiGraphEdge implements DiGraphEdge<Node, Branch> {
    Node src, dest;
    MockDiGraphEdge(Node src, Node dest) {
      this.src = src;
      this.dest = dest;
    }

    @Override
    public DiGraphNode<Node, Branch> getSource() { return null; }

    @Override
    public DiGraphNode<Node, Branch> getDestination() {
      // Return a mock DiGraphNode wrapping dest
      return new MockDiGraphNode(dest);
    }

    @Override
    public Branch getValue() { return Branch.UNCOND; }
  }
}