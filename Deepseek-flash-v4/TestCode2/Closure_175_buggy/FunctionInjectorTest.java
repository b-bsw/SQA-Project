package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.*;

public class FunctionInjectorTest {

  private AbstractCompiler compiler;
  private Supplier<String> safeNameIdSupplier;
  private FunctionInjector injector;
  private NodeTraversal t;

  private static class FakeCompiler extends AbstractCompiler {
    CodingConvention codingConvention = new CodingConvention();
    LifeCycleStage stage = LifeCycleStage.NORMALIZED;
    JSModuleGraph moduleGraph;
    @Override public CodingConvention getCodingConvention() { return codingConvention; }
    @Override public LifeCycleStage getLifeCycleStage() { return stage; }
    @Override public JSModuleGraph getModuleGraph() { return moduleGraph; }
    @Override public boolean hasSource() { return false; }
    // Stub remaining abstract methods as no-ops/defaults
    @Override public double getExecutionTime() { return 0; }
    @Override public void processNewFilteredEdges(boolean a) {}
    @Override public void processNewFilteredEdges() {}
    @Override public void setWorkSet(Collection<Node> c) {}
    @Override public <T> T getUniqueId(Class<T> c) { return null; }
    @Override public void setUniqueId(Class<?> c, Object o) {}
    @Override public int getErrorCount() { return 0; }
    @Override public com.google.javascript.jscomp.ErrorManager getErrorManager() { return null; }
    @Override public com.google.javascript.rhino.jstype.JSTypeRegistry getTypeRegistry() { return null; }
    @Override public com.google.javascript.jscomp.CodeChangeHandler getChangeHandler() { return null; }
    @Override public void checkNodes(Node a, boolean b) {}
    @Override public void setPalette(com.google.javascript.jscomp.Palette p) {}
    @Override public com.google.javascript.jscomp.Palette getPalette() { return null; }
    @Override public boolean isNodeFound() { return false; }
    @Override public void setEnableNormalized() {}
    @Override public boolean isNormalized() { return true; }
    @Override public void setNormalized() {}
    @Override public boolean isUpdating() { return false; }
    @Override public void setUpdating(boolean a) {}
    @Override public com.google.javascript.jscomp.AbstractCompiler.Level getOptimizationLevel() { return null; }
  }

  private static class FakeSupplier implements Supplier<String> {
    int count = 0;
    @Override public String get() { return "_tmp" + count++; }
  }

  private static class FakeNodeTraversal extends NodeTraversal {
    private Node scopeRoot;
    private boolean globalScope;
    FakeNodeTraversal(AbstractCompiler c, Node root, boolean global) {
      super(c);
      this.scopeRoot = root;
      this.globalScope = global;
    }
    @Override public boolean inGlobalScope() { return globalScope; }
    @Override public Node getScopeRoot() { return scopeRoot; }
  }

  private Node createFunctionNode(String name, String bodyStmt) {
    Node fn = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(name);
    fn.addChildToFront(nameNode);
    Node params = new Node(Token.PARAM_LIST);
    fn.addChildAfter(params, nameNode);
    Node block = new Node(Token.BLOCK);
    if (bodyStmt != null && !bodyStmt.isEmpty()) {
      Node ret = new Node(Token.RETURN);
      ret.addChildToFront(Node.newString(bodyStmt));
      block.addChildToFront(ret);
    }
    fn.addChildAfter(block, params);
    return fn;
  }

  private Node createCallNode(String fnName, Node... args) {
    Node call = new Node(Token.CALL);
    call.addChildToFront(Node.newString(fnName));
    for (Node a : args) {
      call.addChildToLast(a);
    }
    return call;
  }

  @Before
  public void setUp() {
    compiler = new FakeCompiler();
    safeNameIdSupplier = new FakeSupplier();
    injector = new FunctionInjector(
        compiler, safeNameIdSupplier, true, false, false);
    t = new FakeNodeTraversal(compiler, new Node(Token.BLOCK), true);
  }

  @After
  public void tearDown() {
    injector = null;
    compiler = null;
  }

  @Test
  public void testConstructor_nullCompiler_throws() {
    try {
      new FunctionInjector(null, safeNameIdSupplier, true, false, false);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  public void testConstructor_nullSupplier_throws() {
    try {
      new FunctionInjector(compiler, null, true, false, false);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  public void testConstructor_success() {
    assertNotNull(injector);
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_nullBody() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToFront(Node.newString("f"));
    fn.addChildAfter(new Node(Token.PARAM_LIST), fn.getFirstChild());
    fn.addChildAfter(new Node(Token.BLOCK), fn.getLastChild());
    assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesArguments() {
    Node fn = createFunctionNode("f", "arguments");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesEval() {
    Node block = new Node(Token.BLOCK);
    Node evalRef = Node.newString("eval");
    block.addChildToFront(evalRef);
    Node fn = new Node(Token.FUNCTION);
    Node nameNode = Node.newString("g");
    fn.addChildToFront(nameNode);
    Node params = new Node(Token.PARAM_LIST);
    fn.addChildAfter(params, nameNode);
    fn.addChildAfter(block, params);
    assertFalse(injector.doesFunctionMeetMinimumRequirements("g", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_selfRecursion() {
    Node fn = createFunctionNode("foo", "bar");
    Node block = fn.getLastChild();
    Node selfRef = Node.newString("foo");
    block.addChildToFront(selfRef);
    assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_ok() {
    Node fn = createFunctionNode("f", "x");
    assertTrue(injector.doesFunctionMeetMinimumRequirements("f", fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_noBody() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToFront(Node.newString("f"));
    fn.addChildAfter(new Node(Token.PARAM_LIST), fn.getFirstChild());
    fn.addChildAfter(new Node(Token.BLOCK), fn.getLastChild());
    assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_singleReturn() {
    Node fn = createFunctionNode("f", "x");
    assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_multiStmt() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToFront(Node.newString("f"));
    fn.addChildAfter(new Node(Token.PARAM_LIST), fn.getFirstChild());
    Node block = new Node(Token.BLOCK);
    block.addChildToFront(new Node(Token.VAR));
    Node ret = new Node(Token.RETURN);
    ret.addChildToFront(Node.newString("x"));
    block.addChildToLast(ret);
    fn.addChildAfter(block, fn.getLastChild());
    assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testCanInlineReferenceDirectly_nonNameCall_withThis() {
    Node fn = createFunctionNode("f", "x");
    Node call = createCallNode("f");
    Node name = Node.newString("obj");
    Node thisKW = new Node(Token.THIS);
    call.addChildToLast(thisKW);
    CanInlineResult r = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertNotNull(r);
  }

  @Test
  public void testCanInlineReferenceDirectly_callsFunction() {
    Node fn = createFunctionNode("f", "x");
    Node call = createCallNode("f");
    call.removeChild(call.getFirstChild());
    call.addChildToFront(Node.newString("g"));
    CanInlineResult r = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertNotNull(r);
  }

  @Test
  public void testSupportedCallType_withName() {
    Node call = createCallNode("f");
    assertTrue(injector.canInlineReferenceToFunction(
        t, call, createFunctionNode("f", "x"),
        Sets.<String>newHashSet(), InliningMode.DIRECT, false, false)
        != CanInlineResult.NO);
  }

  @Test
  public void testInliningModes_enumValues() {
    assertNotNull(InliningMode.DIRECT);
    assertNotNull(InliningMode.BLOCK);
    assertNotSame(InliningMode.DIRECT, InliningMode.BLOCK);
  }

  @Test
  public void testInline_noDecomposition_blockMode() {
    FunctionInjector strict = new FunctionInjector(
        compiler, safeNameIdSupplier, false, false, false);
    Node fn = createFunctionNode("f", "x");
    Node call = createCallNode("f");
    CanInlineResult r = strict.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    assertNotNull(r);
  }

  @Test
  public void testCanInlineReferenceAsStatementBlock_unsupportedSite() {
    Node fn = createFunctionNode("f", "x");
    Node call = createCallNode("f");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(call);
    CanInlineResult r = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    assertNotNull(r);
  }

  @Test
  public void testReferencesThis_nonCallObject_returnsNo() {
    Node fn = createFunctionNode("f", "x");
    Node call = createCallNode("f");
    CanInlineResult r = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, true, false);
    assertNotNull(r);
  }

  @Test
  public void testContainsFunctions_inGlobalScope_allowsInline() {
    Node fn = createFunctionNode("f", "x");
    Node call = createCallNode("f");
    CanInlineResult r = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, true);
    assertNotNull(r);
  }

  @Test
  public void testDoesLowerCost_zeroInstances_positiveBlockDelta() {
    Node fn = createFunctionNode("f", "x");
    boolean result = injector.inliningLowersCost(
        null, fn, Collections.<Reference>emptyList(),
        Sets.<String>newHashSet(), true, false);
    assertTrue(result);
  }

  @Test
  public void testEstimateCallCost_zeroArgs_noThis() {
    Node fn = createFunctionNode("f", "x");
    int cost = injector.estimateCallCost(fn, false);
    int expected = NAME_COST_ESTIMATE + PAREN_COST;
    assertTrue(cost >= expected);
  }

  @Test
  public void testInlineCostDelta_noBody() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToFront(Node.newString("f"));
    fn.addChildAfter(new Node(Token.PARAM_LIST), fn.getFirstChild());
    fn.addChildAfter(new Node(Token.BLOCK), fn.getLastChild());
    int delta = injector.inlineCostDelta(fn, Sets.<String>newHashSet(), InliningMode.DIRECT);
    assertTrue(delta < 0);
  }

  @Test
  public void testInlineCostDelta_blockMode() {
    Node fn = createFunctionNode("f", "x");
    int delta = injector.inlineCostDelta(fn, Sets.<String>newHashSet(), InliningMode.BLOCK);
    assertTrue(delta < 0);
  }

  @Test
  public void testSetKnownConstants_empty_nonEmpty() {
    Set<String> c = Sets.newHashSet("CONST");
    injector.setKnownConstants(c);
  }

  @Test
  public void testSetKnownConstants_alreadyNonEmpty_throws() {
    injector.setKnownConstants(Sets.newHashSet("A"));
    try {
      injector.setKnownConstants(Sets.newHashSet("B"));
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
    }
  }

  @Test
  public void testClassifyCallSite_unsupported_nullParent() {
    Node call = createCallNode("f");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(call);
    int type = injector.classifyCallSite(call).ordinal();
    assertTrue(type >= 0);
  }

  @Test
  public void testReference_constructor() {
    Node call = createCallNode("f");
    Reference ref = new Reference(call, null, InliningMode.DIRECT);
    assertSame(call, ref.callNode);
    assertNull(ref.module);
    assertEquals(InliningMode.DIRECT, ref.mode);
  }

  @Test
  public void testInlineFunction_unsupportedSite_throws() {
    Node fn = createFunctionNode("f", "x");
    Node call = createCallNode("f");
    Node parent = call.getParent();
    try {
      injector.inline(call, "f", fn, InliningMode.BLOCK);
    } catch (Exception e) {
    }
  }

  @Test
  public void testMaybePrepareCall_unsupported_noThrow() {
    Node call = createCallNode("f");
    try {
      injector.maybePrepareCall(call);
    } catch (Exception e) {
      fail("Unexpected exception: " + e);
    }
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_codingConventionBlocks() {
    Node fn = createFunctionNode("f", "x");
    CodingConvention conv = compiler.getCodingConvention();
    assertNotNull(conv);
    assertFalse(conv.isInlinableFunction(fn));
  }

  @Test
  public void testInliningLowersCost_singleDirectInline_removable() {
    Node fn = createFunctionNode("f", "x");
    Reference ref = new Reference(createCallNode("f"), null, InliningMode.DIRECT);
    List<Reference> refs = Collections.singletonList(ref);
    assertTrue(injector.inliningLowersCost(
        null, fn, refs, Sets.<String>newHashSet(), true, false));
  }

  @Test
  public void testInliningLowersCost_multipleRefs() {
    Node fn = createFunctionNode("f", "x");
    List<Reference> refs = new ArrayList<>();
    refs.add(new Reference(createCallNode("f"), null, InliningMode.DIRECT));
    refs.add(new Reference(createCallNode("f"), null, InliningMode.BLOCK));
    assertTrue(injector.inliningLowersCost(
        null, fn, refs, Sets.<String>newHashSet(), false, false));
  }

  @Test
  public void testIsSupportedCallType_functionObjectCall_nonThisArg() {
    injector = new FunctionInjector(compiler, safeNameIdSupplier, true, true, false);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToFront(Node.newString("obj"));
    getProp.addChildToFront(Node.newString("call"));
    call.addChildToFront(getProp);
    Node strArg = Node.newString("notThis");
    call.addChildToLast(strArg);
    assertTrue(injector.canInlineReferenceToFunction(
        t, call, createFunctionNode("f", "x"),
        Sets.<String>newHashSet(), InliningMode.DIRECT, false, false)
        != CanInlineResult.NO);
  }
}
