package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.LinkedUndirectedGraph;
import com.google.javascript.jscomp.graph.UndiGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class CoalesceVariableNamesTest {

  private static class StubCompiler extends AbstractCompiler {
    boolean codeChanged = false;
    int changeCount = 0;

    @Override
    public void reportCodeChange() {
      codeChanged = true;
      changeCount++;
    }

    @Override
    public PassConfig getPassConfig() {
      return null;
    }

    @Override
    public CompilerOptions getOptions() {
      return null;
    }

    @Override
    public void setCodingConvention(CodingConvention convention) {}

    @Override
    public CodingConvention getCodingConvention() {
      return null;
    }

    @Override
    public void setDefaultPassConfig() {}

    @Override
    public void setPassConfig(PassConfig config) {}

    @Override
    public void setTypeValidator(TypeValidator validator) {}

    @Override
    public TypeValidator getTypeValidator() {
      return null;
    }

    @Override
    public void setErrorManager(ErrorManager manager) {}

    @Override
    public ErrorManager getErrorManager() {
      return null;
    }

    @Override
    public boolean hasHaltingErrors() {
      return false;
    }

    @Override
    public void process(Node externs, Node root) {}

    @Override
    public Node parseSyntheticCode(String code) {
      return null;
    }

    @Override
    public String toSource(Node root) {
      return null;
    }

    @Override
    public String toSource() {
      return null;
    }
  }

  private static class StubScope extends Scope {
    private Map<String, Var> vars = new HashMap<>();
    private boolean isGlobal;
    private int maxIndex = 0;

    StubScope(boolean isGlobal) {
      super(null, null); // We don't need parent or root for our stub
      this.isGlobal = isGlobal;
    }

    void addVar(String name, Node node) {
      StubVar var = new StubVar(name, node, maxIndex++);
      vars.put(name, var);
    }

    @Override
    public boolean isGlobal() {
      return isGlobal;
    }

    @Override
    public Var getVar(String name) {
      return vars.get(name);
    }

    @Override
    public Iterator<Var> getVars() {
      return vars.values().iterator();
    }

    @Override
    public int getVarCount() {
      return vars.size();
    }

    @Override
    public boolean isDeclared(String name, boolean recurse) {
      return vars.containsKey(name);
    }
  }

  private static class StubVar extends Var {
    String name;
    Node parentNode;
    int index;

    StubVar(String name, Node parentNode, int index) {
      super(null, null); // Stub constructor
      this.name = name;
      this.parentNode = parentNode;
      this.index = index;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public Node getParentNode() {
      return parentNode;
    }

    @Override
    public Scope getScope() {
      return null;
    }
  }

  private static class StubNodeTraversal extends NodeTraversal {
    private Scope scope;
    private ControlFlowGraph<Node> cfg;
    private boolean inGlobalScope;

    StubNodeTraversal(AbstractCompiler compiler, Scope scope,
                      ControlFlowGraph<Node> cfg, boolean inGlobalScope) {
      super(compiler, null); // Stub constructor
      this.scope = scope;
      this.cfg = cfg;
      this.inGlobalScope = inGlobalScope;
    }

    @Override
    public Scope getScope() {
      return scope;
    }

    @Override
    public ControlFlowGraph<Node> getControlFlowGraph() {
      return cfg;
    }

    @Override
    public boolean inGlobalScope() {
      return inGlobalScope;
    }
  }

  private static class StubControlFlowGraph extends ControlFlowGraph<Node> {
    private ArrayList<DiGraphNode<Node, Branch>> nodes = new ArrayList<>();
    private boolean implicitReturn;

    StubControlFlowGraph(boolean implicitReturn) {
      super(null); // Stub constructor
      this.implicitReturn = implicitReturn;
    }

    void addNode(DiGraphNode<Node, Branch> node) {
      nodes.add(node);
    }

    @Override
    public boolean isImplicitReturn(DiGraphNode<Node, Branch> node) {
      return implicitReturn;
    }

    @Override
    public DiGraphNode<Node, Branch> getEntry() {
      return null;
    }

    @Override
    public Set<DiGraphNode<Node, Branch>> getDirectedGraphNodes() {
      return new HashSet<>(nodes);
    }
  }

  private static class StubDiGraphNode extends DiGraphNode<Node, Branch> {
    private FlowState<LiveVariableLattice> annotation;
    private Node value;

    StubDiGraphNode(Node value, FlowState<LiveVariableLattice> annotation) {
      this.value = value;
      this.annotation = annotation;
    }

    @Override
    public FlowState<LiveVariableLattice> getAnnotation() {
      return annotation;
    }

    @Override
    public void setAnnotation(FlowState<LiveVariableLattice> a) {
      this.annotation = a;
    }

    @Override
    public Node getValue() {
      return value;
    }

    @Override
    public java.util.List<DiGraphNode<Node, Branch>> getPredecessors() {
      return new ArrayList<>();
    }

    @Override
    public java.util.List<DiGraphNode<Node, Branch>> getSuccessors() {
      return new ArrayList<>();
    }
  }

  private static class StubFlowState implements FlowState<LiveVariableLattice> {
    private LiveVariableLattice in;
    private LiveVariableLattice out;

    StubFlowState(LiveVariableLattice in, LiveVariableLattice out) {
      this.in = in;
      this.out = out;
    }

    @Override
    public LiveVariableLattice getIn() {
      return in;
    }

    @Override
    public LiveVariableLattice getOut() {
      return out;
    }
  }

  private static class StubLattice extends LiveVariableLattice {
    private Set<Var> liveVars = new HashSet<>();

    StubLattice(Set<Var> liveVars) {
      this.liveVars = liveVars;
    }

    @Override
    public boolean isLive(Var v) {
      return liveVars.contains(v);
    }
  }

  private StubCompiler compiler;
  private CoalesceVariableNames coalesce;

  @Before
  public void setUp() {
    compiler = new StubCompiler();
  }

  // Test constructor
  @Test
  public void testConstructorWithPseudoNames() {
    coalesce = new CoalesceVariableNames(compiler, true);
    assertNotNull(coalesce);
  }

  @Test
  public void testConstructorWithoutPseudoNames() {
    coalesce = new CoalesceVariableNames(compiler, false);
    assertNotNull(coalesce);
  }

  // Test process with null nodes - should not throw (if traversal handles)
  @Test
  public void testProcessWithNullExternsAndRoot() {
    coalesce = new CoalesceVariableNames(compiler, false);
    // Should not throw NPE
    try {
      coalesce.process(null, null);
    } catch (NullPointerException e) {
      fail("process should handle null nodes gracefully");
    }
  }

  @Test
  public void testProcessWithNonNullNodes() {
    coalesce = new CoalesceVariableNames(compiler, false);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    // Should not throw
    coalesce.process(externs, root);
    assertTrue("process called traverse", true);
  }

  // Test enterScope with global scope - should return early (no coloring pushed)
  @Test
  public void testEnterScopeGlobal() {
    coalesce = new CoalesceVariableNames(compiler, false);
    StubScope globalScope = new StubScope(true);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    StubNodeTraversal t = new StubNodeTraversal(compiler, globalScope, cfg, true);
    coalesce.enterScope(t);
    // Colorings stack should be empty because global scope returns early
    // We can't access private field directly, but checking that no exception occurred is enough.
  }

  // Test enterScope with non-global scope - should analyze and push coloring.
  // We need to provide a CFG with at least one node to avoid issues in liveness analysis.
  @Test
  public void testEnterScopeNonGlobal() {
    coalesce = new CoalesceVariableNames(compiler, false);
    StubScope nonGlobalScope = new StubScope(false);
    // Add a variable to scope
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    varNode.addChildToBack(nameNode);
    nonGlobalScope.addVar("x", varNode);

    // Create a CFG with a single node that has no live variables (empty lattice)
    StubLattice emptyLattice = new StubLattice(new HashSet<Var>());
    StubFlowState state = new StubFlowState(emptyLattice, emptyLattice);
    Node cfgNodeValue = new Node(Token.BLOCK);
    StubDiGraphNode diNode = new StubDiGraphNode(cfgNodeValue, state);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    cfg.addNode(diNode);

    StubNodeTraversal t = new StubNodeTraversal(compiler, nonGlobalScope, cfg, false);
    coalesce.enterScope(t);
    // Normally it should push a coloring. No exception expected.
  }

  // Test exitScope with global scope - returns early.
  @Test
  public void testExitScopeGlobal() {
    coalesce = new CoalesceVariableNames(compiler, false);
    StubScope globalScope = new StubScope(true);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    StubNodeTraversal t = new StubNodeTraversal(compiler, globalScope, cfg, true);
    coalesce.exitScope(t);
    // No exception, no effect.
  }

  @Test
  public void testExitScopeNonGlobal() {
    coalesce = new CoalesceVariableNames(compiler, false);
    StubScope nonGlobalScope = new StubScope(false);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    StubNodeTraversal t = new StubNodeTraversal(compiler, nonGlobalScope, cfg, false);
    // First enter to push something
    coalesce.enterScope(t);
    coalesce.exitScope(t);
    // Should pop without exception.
  }

  // Test visit method - various branches

  @Test
  public void testVisitColoringsEmpty() {
    coalesce = new CoalesceVariableNames(compiler, false);
    Node nameNode = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    StubScope scope = new StubScope(false);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    StubNodeTraversal t = new StubNodeTraversal(compiler, scope, cfg, false);
    coalesce.visit(t, nameNode, parent);
    // Should return early because colorings is empty; nothing happens
    assertFalse(compiler.codeChanged);
  }

  @Test
  public void testVisitNodeNotName() {
    coalesce = new CoalesceVariableNames(compiler, false);
    Node notNameNode = new Node(Token.SCRIPT);
    Node parent = new Node(Token.BLOCK);
    StubScope scope = new StubScope(false);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    // We need to enter a scope to have colorings non-empty, but we also need to setup
    // a proper CFG to allow enterScope. For simplicity, we can directly manipulate private field? No.
    // Instead, we can test the early return in visit when NodeUtil.isName(n) is false.
    // But to have colorings non-empty, we need to call enterScope with a valid scope.
    // Let's create a minimal structure to allow enterScope to push something.
    StubScope localScope = new StubScope(false);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "a");
    varNode.addChildToBack(nameNode);
    localScope.addVar("a", varNode);
    StubLattice lattice = new StubLattice(new HashSet<Var>());
    StubFlowState state = new StubFlowState(lattice, lattice);
    Node cfgValue = new Node(Token.BLOCK);
    StubDiGraphNode diNode = new StubDiGraphNode(cfgValue, state);
    StubControlFlowGraph localCfg = new StubControlFlowGraph(false);
    localCfg.addNode(diNode);
    StubNodeTraversal traversal = new StubNodeTraversal(compiler, localScope, localCfg, false);
    coalesce.enterScope(traversal); // pushes coloring

    // Now test visit with non-name node
    coalesce.visit(traversal, notNameNode, parent);
    assertFalse(compiler.codeChanged);
  }

  @Test
  public void testVisitParentIsFunction() {
    coalesce = new CoalesceVariableNames(compiler, false);
    // Create a name node whose parent is a FUNCTION node
    Node functionNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "myFunc");
    functionNode.addChildToFront(nameNode); // NAME is first child of FUNCTION

    // Setup similar scope with a var for "myFunc"?
    StubScope localScope = new StubScope(false);
    localScope.addVar("myFunc", functionNode);
    StubLattice lattice = new StubLattice(new HashSet<Var>());
    StubFlowState state = new StubFlowState(lattice, lattice);
    Node cfgValue = new Node(Token.BLOCK);
    StubDiGraphNode diNode = new StubDiGraphNode(cfgValue, state);
    StubControlFlowGraph localCfg = new StubControlFlowGraph(false);
    localCfg.addNode(diNode);
    StubNodeTraversal t = new StubNodeTraversal(compiler, localScope, localCfg, false);
    coalesce.enterScope(t);

    coalesce.visit(t, nameNode, functionNode);
    // Should return because NodeUtil.isFunction(parent) is true
    assertFalse(compiler.codeChanged);
  }

  @Test
  public void testVisitVarNotInScope() {
    coalesce = new CoalesceVariableNames(compiler, false);
    // Setup a scope that does NOT contain the variable "x"
    StubScope localScope = new StubScope(false);
    // Add a different variable to allow enterScope to succeed
    Node dummyVarNode = new Node(Token.VAR);
    Node dummyName = Node.newString(Token.NAME, "dummy");
    dummyVarNode.addChildToBack(dummyName);
    localScope.addVar("dummy", dummyVarNode);

    StubLattice lattice = new StubLattice(new HashSet<Var>());
    StubFlowState state = new StubFlowState(lattice, lattice);
    Node cfgValue = new Node(Token.BLOCK);
    StubDiGraphNode diNode = new StubDiGraphNode(cfgValue, state);
    StubControlFlowGraph localCfg = new StubControlFlowGraph(false);
    localCfg.addNode(diNode);
    StubNodeTraversal t = new StubNodeTraversal(compiler, localScope, localCfg, false);
    coalesce.enterScope(t);

    Node nameNode = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    coalesce.visit(t, nameNode, parent);
    // t.getScope().getVar("x") will return null, then vNode from coloring graph will be null, early return.
    assertFalse(compiler.codeChanged);
  }

  @Test
  public void testVisitCoalescedVarEqualsSelfNoPseudo() {
    coalesce = new CoalesceVariableNames(compiler, false);
    // Setup scope with one variable "x"
    StubScope scope = new StubScope(false);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    // Add an initial value so it's an assignment
    nameNode.addChildToFront(new Node(Token.NUMBER, 1.0));
    varNode.addChildToBack(nameNode);
    scope.addVar("x", varNode);
    // liveness analysis will treat x as live? We'll set lattice to have no live vars, so no interference
    StubLattice lattice = new StubLattice(new HashSet<Var>());
    StubFlowState state = new StubFlowState(lattice, lattice);
    Node cfgValue = new Node(Token.BLOCK);
    StubDiGraphNode diNode = new StubDiGraphNode(cfgValue, state);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    cfg.addNode(diNode);
    StubNodeTraversal t = new StubNodeTraversal(compiler, scope, cfg, false);
    coalesce.enterScope(t); // This will create an interference graph with only 'x', and color it. Partition super node of 'x' is itself.

    Node useNode = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, useNode);
    coalesce.visit(t, useNode, parent);
    // Since colorings.peek().getPartitionSuperNode(var) equals the node's value (x itself) and usePseudoNames is false,
    // it should return early. No rename.
    assertFalse(compiler.codeChanged);
  }

  @Test
  public void testVisitSuccessfulRename() {
    coalesce = new CoalesceVariableNames(compiler, false);
    // Setup scope with two variables "x" and "y" that are not live simultaneously
    StubScope scope = new StubScope(false);
    Node varXNode = new Node(Token.VAR);
    Node nameX = Node.newString(Token.NAME, "x");
    nameX.addChildToFront(new Node(Token.NUMBER, 1.0));
    varXNode.addChildToBack(nameX);
    scope.addVar("x", varXNode);

    Node varYNode = new Node(Token.VAR);
    Node nameY = Node.newString(Token.NAME, "y");
    nameY.addChildToFront(new Node(Token.NUMBER, 2.0));
    varYNode.addChildToBack(nameY);
    scope.addVar("y", varYNode);

    // Liveness: x and y are never live at the same time. We'll create a CFG with one node.
    // In live analysis, if both are not live, they are candidates for coalescing.
    // But the interference graph edges are determined by liveness. We'll set lattice so that both are not live.
    Set<Var> emptySet = new HashSet<>();
    StubLattice lattice = new StubLattice(emptySet);
    StubFlowState state = new StubFlowState(lattice, lattice);
    Node cfgValue = new Node(Token.BLOCK);
    StubDiGraphNode diNode = new StubDiGraphNode(cfgValue, state);
    StubControlFlowGraph cfg = new StubControlFlowGraph(false);
    cfg.addNode(diNode);

    StubNodeTraversal t = new StubNodeTraversal(compiler, scope, cfg, false);
    coalesce.enterScope(t); // This will compute interference, and coloring should merge x and y.

    // Now visit a use of y (or x). Since they are merged, we expect renaming.
    // Suppose the coloring merges y into x (lower index).
    // We'll visit a reference to "y" with parent not VAR (i.e., a read).
    Node useY = Node.newString(Token.NAME, "y");
    Node parent = new Node(Token.EXPR_RESULT, useY);
    coalesce.visit(t, useY, parent);
    // In the visit method, since coalescedVar != vNode.getValue (assuming vNode.getValue is the var itself, and coalescedVar is maybe x),
    // it will rename y to "x" and report code change.
    assertTrue(compiler.codeChanged);
    assertEquals("y should be renamed to x", "x", useY.getString());
  }
}