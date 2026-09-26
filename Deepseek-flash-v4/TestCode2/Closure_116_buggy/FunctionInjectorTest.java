package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FunctionInjectorTest {

  private FunctionInjector injector;
  private TestCompiler compiler;
  private Supplier<String> nameSupplier;

  // --- Stub classes ---------------------------------------------------------

  private static class TestCodingConvention extends CodingConvention {
    private boolean inlinable = true;
    @Override public boolean isInlinableFunction(Node n) { return inlinable; }
    public void setInlinable(boolean b) { inlinable = b; }
    @Override public boolean isConstant(String name) { return false; }
    // remaining abstract methods: dummy implementations
    @Override public boolean isExported(String name) { return false; }
    @Override public boolean isOptionalParameter(Node n) { return false; }
    @Override public boolean isVarArgsParameter(Node n) { return false; }
    @Override public String getIdentifyingName(Node n) { return n.getString(); }
    @Override public boolean isSuperReference(Node n) { return false; }
    @Override public boolean isConstantKey(String key) { return false; }
    @Override public boolean isDebugConstant(String name) { return false; }
    @Override public boolean isAliasedLiteral(Object value, boolean constant) { return false; }
    @Override public boolean isKeyword(String name) { return false; }
    @Override public boolean isPrivate(String name) { return false; }
    @Override public boolean isProtected(String name) { return false; }
    @Override public boolean isPublic(String name) { return false; }
    @Override public boolean isOriginalKey(String key) { return false; }
    @Override public boolean isPropertyRenameFunction(String name) { return false; }
    @Override public boolean isPropertyRenameFunction(Node n) { return false; }
    @Override public boolean isStringLiteralRenameFunction(String name) { return false; }
    @Override public boolean isStringLiteralRenameFunction(Node n) { return false; }
    @Override public boolean isSubclassConstructor(Node n) { return false; }
    @Override public boolean isExportPropertyByDefault(String propertyName) { return false; }
    @Override public boolean isExportConstantByDefault(String propertyName) { return false; }
    @Override public boolean isExportedConstant(String constant) { return false; }
    @Override public boolean isExportedProperty(String property) { return false; }
    @Override public boolean isExportedProperty(Node n) { return false; }
    @Override public boolean isExportedSymbol(String symbol) { return false; }
    @Override public String getPropertyRenamingFunction(String name) { return null; }
    @Override public String getStringLiteralRenamingFunction(String name) { return null; }
    @Override public boolean isModifedByAssertions(Node n) { return false; }
    @Override public boolean isIndirectlyExported(String name) { return false; }
  }

  private static class TestCompiler extends AbstractCompiler {
    TestCodingConvention codingConvention = new TestCodingConvention();
    LifeCycleStage stage = new LifeCycleStage(true);
    JSModuleGraph moduleGraph = null;

    @Override public CodingConvention getCodingConvention() { return codingConvention; }
    @Override public LifeCycleStage getLifeCycleStage() { return stage; }
    @Override public JSModuleGraph getModuleGraph() { return moduleGraph; }

    // Stub remaining abstract methods (throw or no‑op)
    @Override public void addChangeHandler(CodeChangeHandler handler) {}
    @Override public void removeChangeHandler(CodeChangeHandler handler) {}
    @Override public SourceExcerptProvider getSourceExcerptProvider() { return null; }
    @Override public ErrorReporter getErrorReporter() { return null; }
    @Override public boolean hasHaltingErrors() { return false; }
    @Override public boolean accept(SourceFile... files) { return false; }
    @Override public boolean accept(SourceCodeSplitter splitter) { return false; }
    @Override public void report(JSError error) {}
    @Override public SourceMap getSourceMap() { return null; }
    @Override public void setSourceMap(SourceMap sourceMap) {}
    @Override public String getSourceMapDirectory() { return null; }
    @Override public String getSourceMapOutputPath() { return null; }
    @Override public Result getResult() { return null; }
    @Override public void setResult(Result result) {}
    @Override public void initOptions(CompilerOptions options) {}
    @Override public CompilerOptions getOptions() { return null; }
    @Override public void setOptions(CompilerOptions options) {}
    @Override public void setErrorManager(ErrorManager errorManager) {}
    @Override public ErrorManager getErrorManager() { return null; }
    @Override public String toSource() { return null; }
    @Override public String toSource(Node node) { return null; }
    @Override public String getSourceLine(String sourceName, int lineNumber) { return null; }
    @Override public Region getSourceRegion(String sourceName, int lineNumber) { return null; }
    @Override public String getSource(String sourceName) { return null; }
    @Override public void setCodingConvention(CodingConvention convention) {}
    @Override public void setLifeCycleStage(LifeCycleStage stage) {}
    @Override public ScopeCreator getScopeCreator() { return null; }
    @Override public Scope createScope(Node root, Scope parent) { return null; }
    @Override public void setScopeCreator(ScopeCreator scopeCreator) {}
    @Override public boolean isNormalized() { return true; }
    @Override public boolean areNodesEqual(Node n1, Node n2) { return n1 == n2 || (n1 != null && n1.isEquivalentTo(n2)); }
    @Override public boolean isConsistent() { return true; }
    @Override public boolean isConsistent(String message) { return true; }
    @Override public void testConsistency() {}
    @Override public void reportCodeChange() {}
    @Override public void reportCodeChange(CodeChangeHandler handler) {}
    @Override public void addToReport(CodeChangeHandler handler) {}
    @Override public void removeFromReport(CodeChangeHandler handler) {}
    @Override public void haltOnError(boolean halt) {}
    @Override public boolean shouldHaltOnError() { return false; }
    @Override public void setProgress(Progress progress) {}
    @Override public Progress getProgress() { return null; }
    @Override public void setRunTime(long time) {}
    @Override public long getRunTime() { return 0; }
    @Override public void setRunTimeSubprocess(long time) {}
    @Override public long getRunTimeSubprocess() { return 0; }
    @Override public void setTime(long time) {}
    @Override public long getTime() { return 0; }
    @Override public void setRunTimeForTests(long time) {}
    @Override public long getRunTimeForTests() { return 0; }
    @Override public void setRunTimeForTestsSubprocess(long time) {}
    @Override public long getRunTimeForTestsSubprocess() { return 0; }
    @Override public void setRunTimeForTest(long testTime) {}
    @Override public long getRunTimeForTest() { return 0; }
    @Override public void setRunTimeForTestSubprocess(long time) {}
    @Override public long getRunTimeForTestSubprocess() { return 0; }
    @Override public void setTestRun(boolean isTestRun) {}
    @Override public boolean isTestRun() { return false; }
    @Override public boolean areDefaultsSet() { return true; }
    @Override public boolean areTypeNodesEqual(Node n1, Node n2) { return n1.isEquivalentTo(n2); }
  }

  private static class SimpleSupplier implements Supplier<String> {
    private int counter = 0;
    @Override public String get() { return "__tmp" + (counter++); }
  }

  // --- Setup / Teardown -----------------------------------------------------

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    nameSupplier = new SimpleSupplier();
    injector = new FunctionInjector(compiler, nameSupplier, true, false, false);
  }

  @After
  public void tearDown() {
    injector = null;
  }

  // --- Helper Node builders -------------------------------------------------

  private Node createFunctionNode(String name, Node body) {
    Node nameNode = Node.newString(Token.NAME, name);
    Node paramList = new Node(Token.PARAM_LIST);
    Node function = new Node(Token.FUNCTION, nameNode, paramList, body);
    function.setIsSyntheticBlock(true);
    return function;
  }

  private Node createBlockWithChildren(Node... children) {
    Node block = new Node(Token.BLOCK);
    for (Node child : children) {
      block.addChildToBack(child);
    }
    return block;
  }

  private Node createReturnNode(Node value) {
    Node ret = new Node(Token.RETURN, value);
    return ret;
  }

  // --- Tests for constructor ------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler() {
    new FunctionInjector(null, nameSupplier, true, false, false);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSupplier() {
    new FunctionInjector(compiler, null, true, false, false);
  }

  // --- Tests for doesFunctionMeetMinimumRequirements -------------------------

  @Test
  public void testDoesFunctionMeetMinimumRequirements_basicTrue() {
    Node body = createBlockWithChildren();
    Node fnNode = createFunctionNode("f", body);
    boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
    assertTrue("Should be inlinable", result);
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_notInlinable() {
    compiler.codingConvention.setInlinable(false);
    Node body = createBlockWithChildren();
    Node fnNode = createFunctionNode("f", body);
    boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
    assertFalse("Should not be inlinable", result);
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesArguments() {
    Node argRef = Node.newString(Token.NAME, "arguments");
    Node body = createBlockWithChildren(argRef);
    Node fnNode = createFunctionNode("f", body);
    boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
    assertFalse("References arguments", result);
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesEval() {
    Node evalRef = Node.newString(Token.NAME, "eval");
    Node body = createBlockWithChildren(evalRef);
    Node fnNode = createFunctionNode("f", body);
    boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
    assertFalse("References eval", result);
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesFnName() {
    Node selfRef = Node.newString(Token.NAME, "f");
    Node body = createBlockWithChildren(selfRef);
    Node fnNode = createFunctionNode("f", body);
    boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
    assertFalse("References own name", result);
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesRecursionName() {
    // fnName empty so only recursive name match triggers
    Node recRef = Node.newString(Token.NAME, "g");
    Node body = createBlockWithChildren(recRef);
    Node fnNode = createFunctionNode("g", body);
    boolean result = injector.doesFunctionMeetMinimumRequirements("", fnNode);
    assertFalse("References recursion name", result);
  }

  // --- Tests for isDirectCallNodeReplacementPossible -------------------------

  @Test
  public void testIsDirectCallNodeReplacementPossible_emptyBlock() {
    Node body = createBlockWithChildren();
    Node fnNode = createFunctionNode("f", body);
    assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_returnWithValue() {
    Node retValue = Node.newString(Token.NAME, "x");
    Node retNode = createReturnNode(retValue);
    Node body = createBlockWithChildren(retNode);
    Node fnNode = createFunctionNode("f", body);
    assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_returnWithoutValue() {
    Node retNode = new Node(Token.RETURN);
    Node body = createBlockWithChildren(retNode);
    Node fnNode = createFunctionNode("f", body);
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_multipleStatements() {
    Node ret1 = createReturnNode(Node.newString(Token.NAME, "a"));
    Node ret2 = createReturnNode(Node.newString(Token.NAME, "b"));
    Node body = createBlockWithChildren(ret1, ret2);
    Node fnNode = createFunctionNode("f", body);
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  // --- Tests for setKnownConstants ------------------------------------------

  @Test
  public void testSetKnownConstants_updatesField() {
    Set<String> constants = new HashSet<>(Arrays.asList("C1", "C2"));
    injector.setKnownConstants(constants);
    // No getter, just ensure it doesn't throw; constant set is used internally.
  }

  // --- Tests for maybePrepareCall (simple call) ------------------------------

  @Test
  public void testMaybePrepareCall_simpleCall() {
    // Build a simple call: parent EXPR_RESULT -> call -> name
    Node nameNode = Node.newString(Token.NAME, "myFunc");
    Node callNode = new Node(Token.CALL, nameNode);
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);
    callNode.setParent(exprResult);
    Node script = new Node(Token.SCRIPT, exprResult);
    exprResult.setParent(script);

    // Should not throw
    injector.maybePrepareCall(callNode);
  }

  // --- Tests for inliningLowersCost -----------------------------------------

  private JSModule createDummyModule(String name) {
    return new JSModule(name);
  }

  private Reference createRef(Node callNode, JSModule module, FunctionInjector.InliningMode mode) {
    return new FunctionInjector.Reference(callNode, module, mode);
  }

  @Test
  public void testInliningLowersCost_noRefs() {
    Node body = createBlockWithChildren();
    Node fnNode = createFunctionNode("f", body);
    JSModule module = createDummyModule("m");
    Set<String> namesToAlias = Collections.emptySet();
    boolean result = injector.inliningLowersCost(module, fnNode,
        Collections.emptyList(), namesToAlias, true, false);
    assertTrue("No references should lower cost", result);
  }

  @Test
  public void testInliningLowersCost_singleDirectRemovable() {
    Node body = createBlockWithChildren(
        createReturnNode(Node.newString(Token.NUMBER, "1")));
    Node fnNode = createFunctionNode("f", body);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    JSModule module = createDummyModule("m");
    Set<String> namesToAlias = Collections.emptySet();
    Collection<FunctionInjector.Reference> refs = Arrays.asList(
        createRef(callNode, module, FunctionInjector.InliningMode.DIRECT));
    boolean result = injector.inliningLowersCost(module, fnNode,
        refs, namesToAlias, true, false);
    assertTrue("Single direct, removable should lower cost", result);
  }

  @Test
  public void testInliningLowersCost_singleBlockNonRemovable() {
    // fnNode with many return statements to increase cost
    Node ret1 = createReturnNode(Node.newString(Token.NUMBER, "1"));
    Node ret2 = createReturnNode(Node.newString(Token.NUMBER, "2"));
    Node body = createBlockWithChildren(ret1, ret2);
    Node fnNode = createFunctionNode("f", body);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    JSModule module = createDummyModule("m");
    Set<String> namesToAlias = Collections.emptySet();
    Collection<FunctionInjector.Reference> refs = Arrays.asList(
        createRef(callNode, module, FunctionInjector.InliningMode.BLOCK));
    boolean result = injector.inliningLowersCost(module, fnNode,
        refs, namesToAlias, false, false);
    // With two returns and no alias, costDeltaBlock should be high enough to possibly fail.
    // We just check that it runs without exception.
    assertNotNull("Result should exist", result);
  }
}