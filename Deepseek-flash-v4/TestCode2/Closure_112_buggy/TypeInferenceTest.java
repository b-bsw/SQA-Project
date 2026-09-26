package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class TypeInferenceTest {

  private AbstractCompiler compiler;
  private ControlFlowGraph<Node> cfg;
  private ReverseAbstractInterpreter reverseInterpreter;
  private Scope functionScope;
  private Map<String, CodingConvention.AssertionFunctionSpec> assertionFunctionsMap;
  private TypeInference inference;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // Create minimal stubs
    compiler = new MockCompiler();
    cfg = new MockControlFlowGraph();
    reverseInterpreter = new MockReverseAbstractInterpreter();
    functionScope = createMockScope();
    assertionFunctionsMap = Collections.emptyMap();
    inference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope, assertionFunctionsMap);
    registry = compiler.getTypeRegistry();
  }

  @Test
  public void testCreateInitialEstimateLattice() {
    FlowScope lattice = inference.createInitialEstimateLattice();
    assertNotNull(lattice);
    // Should be the bottomScope, which we can compare via identity or a known property
    // We'll check that it's not the same as entry lattice
    FlowScope entry = inference.createEntryLattice();
    // bottomScope and entryScope are different, so assertNotSame
    org.junit.Assert.assertNotSame(entry, lattice);
  }

  @Test
  public void testCreateEntryLattice() {
    FlowScope entry = inference.createEntryLattice();
    assertNotNull(entry);
  }

  @Test
  public void testFlowThroughWithBottomScope() {
    // When input is bottomScope, should return input unchanged
    FlowScope bottom = inference.createInitialEstimateLattice();
    Node dummyNode = new Node(Token.NUMBER, 0, 0);
    FlowScope result = inference.flowThrough(dummyNode, bottom);
    assertSame(bottom, result);
  }

  @Test
  public void testFlowThroughWithNormalScope() {
    FlowScope input = inference.createEntryLattice();
    Node exprNode = new Node(Token.NUMBER, 0, 0);
    FlowScope output = inference.flowThrough(exprNode, input);
    assertNotNull(output);
    // output should be a child scope of input
    // We'll just check it's not same as input
    org.junit.Assert.assertNotSame(input, output);
  }

  @Test
  public void testBranchedFlowThroughForNumberNode() {
    FlowScope input = inference.createEntryLattice();
    Node source = new Node(Token.NUMBER, 0, 0);
    List<FlowScope> branches = inference.branchedFlowThrough(source, input);
    assertEquals(1, branches.size()); // no branch edges? Actually depends on cfg, but we have one out edge
    // In our mock cfg, we return one edge with Branch.UNCOND
    assertNotNull(branches.get(0));
  }

  @Test
  public void testBranchedFlowThroughForForIn() {
    // Simulate for-in: node type FOR_IN, with two children: item and obj
    Node forIn = new Node(Token.FOR_IN);
    Node item = Node.newString(Token.NAME, "i");
    Node obj = Node.newString(Token.NAME, "arr");
    forIn.addChildToFront(item);
    forIn.addChildToFront(obj); // order: first child is item? Actually Node: for( item in obj ) => first child is the item, second is obj
    // Reset children correctly: for-in's first child is the iterator variable, second is the object
    // We'll adjust:
    forIn = new Node(Token.FOR_IN);
    forIn.addChildToFront(obj);
    forIn.addChildToFront(item);
    // Now set up cfg edges: we need one edge with Branch.ON_TRUE for the for-in body
    // Our mock will return one edge with Branch.ON_TRUE
    FlowScope input = inference.createEntryLattice();
    List<FlowScope> branches = inference.branchedFlowThrough(forIn, input);
    assertEquals(1, branches.size());
    assertNotNull(branches.get(0));
    // The scope should have inferred the iterator variable type to string
    // We can check by querying the scope for the variable "i"
    // But scope internals are complex; just check no exception
  }

  @Test
  public void testBranchedFlowThroughConditionExpressionAndOr() {
    // Create an AND node
    Node andNode = new Node(Token.AND);
    Node left = Node.newString(Token.NAME, "a");
    Node right = Node.newString(Token.NAME, "b");
    andNode.addChildToFront(right);
    andNode.addChildToFront(left);
    // We need a cfg that has two out edges: ON_TRUE and ON_FALSE
    // Our mock will provide both
    FlowScope input = inference.createEntryLattice();
    List<FlowScope> branches = inference.branchedFlowThrough(andNode, input);
    assertEquals(2, branches.size());
    assertNotNull(branches.get(0));
    assertNotNull(branches.get(1));
  }

  @Test
  public void testConstructorSetsFunctionScopeAndBottomScope() {
    assertNotNull(inference.createEntryLattice());
    assertNotNull(inference.createInitialEstimateLattice());
    // Check that inference is not null
    assertNotNull(inference);
  }

  // -------- Mock classes --------
  private static class MockCompiler extends AbstractCompiler {
    private JSTypeRegistry typeRegistry = new JSTypeRegistry(null);
    @Override
    public JSTypeRegistry getTypeRegistry() {
      return typeRegistry;
    }
    // Implement other abstract methods with stubs
    @Override
    public CodingConvention getCodingConvention() { return new MockCodingConvention(); }
    // Remaining abstract methods: just default stubs
    @Override
    public void report(JSError error) {}
    @Override
    public String getSourceLine(String sourceName, int lineNumber) { return null; }
    @Override
    public Region getSourceRegion(String sourceName, int lineNumber) { return null; }
    @Override
    public CheckLevel getErrorLevel(JSError error) { return null; }
    @Override
    public void setErrorLevel(DiagnosticType type, CheckLevel level) {}
    @Override
    public boolean hasHaltingErrors() { return false; }
    @Override
    public Node getRoot() { return null; }
  }

  private static class MockCodingConvention extends CodingConvention {
    @Override
    public Bind describeFunctionBind(Node n, boolean checkParams) { return null; }
  }

  private static class MockControlFlowGraph extends ControlFlowGraph<Node> {
    public MockControlFlowGraph() {
      super(null, null); // dummy
    }
    @Override
    public List<DiGraphEdge<Node, Branch>> getOutEdges(Node node) {
      // Return a single edge with UNCOND for most nodes; for AND/OR/FOR_IN return two/appropriate edges
      DiGraphEdge<Node, Branch> edge = new DiGraphEdge<Node, Branch>() {
        @Override
        public Node getSource() { return node; }
        @Override
        public Node getDestination() { return null; }
        @Override
        public Branch getValue() {
          // Determine branch based on node type
          int type = node.getType();
          if (type == Token.AND || type == Token.OR || type == Token.HOOK) {
            // We'll return ON_TRUE for first, ON_FALSE for second? Actually getOutEdges is called once and returns list of all edges.
            // Since we need two edges for those, we'll override this method fully.
            return Branch.ON_TRUE;
          } else if (type == Token.FOR_IN) {
            return Branch.ON_TRUE;
          }
          return Branch.UNCOND;
        }
        @Override
        public void setValue(Branch value) {}
      };
      // For AND/OR/FOR_IN, we need two edges. Override the method to return appropriate list.
      // We'll create a subclass that overrides getOutEdges completely.
      // For simplicity, we'll return a list with one edge for now, but tests that need two edges will fail.
      // Let's implement a full override inside this class.
      return getOutEdgesOverride(node);
    }
    private List<DiGraphEdge<Node, Branch>> getOutEdgesOverride(Node node) {
      int type = node.getType();
      if (type == Token.AND || type == Token.OR) {
        DiGraphEdge<Node, Branch> edge1 = new DiGraphEdge<Node, Branch>() {
          @Override public Node getSource() { return node; }
          @Override public Node getDestination() { return null; }
          @Override public Branch getValue() { return Branch.ON_TRUE; }
          @Override public void setValue(Branch v) {}
        };
        DiGraphEdge<Node, Branch> edge2 = new DiGraphEdge<Node, Branch>() {
          @Override public Node getSource() { return node; }
          @Override public Node getDestination() { return null; }
          @Override public Branch getValue() { return Branch.ON_FALSE; }
          @Override public void setValue(Branch v) {}
        };
        return com.google.common.collect.Lists.newArrayList(edge1, edge2);
      } else if (type == Token.FOR_IN) {
        DiGraphEdge<Node, Branch> edge = new DiGraphEdge<Node, Branch>() {
          @Override public Node getSource() { return node; }
          @Override public Node getDestination() { return null; }
          @Override public Branch getValue() { return Branch.ON_TRUE; }
          @Override public void setValue(Branch v) {}
        };
        return com.google.common.collect.Lists.newArrayList(edge);
      } else {
        DiGraphEdge<Node, Branch> edge = new DiGraphEdge<Node, Branch>() {
          @Override public Node getSource() { return node; }
          @Override public Node getDestination() { return null; }
          @Override public Branch getValue() { return Branch.UNCOND; }
          @Override public void setValue(Branch v) {}
        };
        return com.google.common.collect.Lists.newArrayList(edge);
      }
    }
    @Override
    public boolean isConnected(Node n1, Node n2) { return false; }
    @Override
    public boolean isForward() { return true; }
  }

  private static class MockReverseAbstractInterpreter extends ReverseAbstractInterpreter {
    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(Node condition, FlowScope scope, boolean outcome) {
      return scope.createChildFlowScope();
    }
  }

  private Scope createMockScope() {
    // Create a minimal Scope with root node
    Node root = new Node(Token.BLOCK);
    root.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    Scope scope = new Scope(root, null); // parent null
    // Add a simple variable
    Node varNode = Node.newString(Token.NAME, "x");
    Var var = new Var("x", null, scope, null, varNode, null, null);
    scope.declare("x", var, true);
    // Ensure getDeclarativelyUnboundVarsWithoutTypes returns empty
    return scope;
  }
}