package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class ProcessClosurePrimitivesTest {

  private AbstractCompiler compiler;
  private ProcessClosurePrimitives pass;
  private Node root;
  private Node externs;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    root = new Node(Token.BLOCK);
    externs = new Node(Token.BLOCK);
    pass = new ProcessClosurePrimitives(compiler, CheckLevel.WARNING, false);
  }

  @Test
  public void testProcessDoesNotThrowWithNullRoot() {
    pass.process(externs, null);
  }

  @Test
  public void testProcessDoesNotThrowWithEmptyRoot() {
    pass.process(externs, root);
  }

  @Test
  public void testProcessWithGoogProvideAndRequire() {
    Node provideCall = createGoogProvideCall("ns1");
    root.addChildToBack(provideCall);
    Node requireCall = createGoogRequireCall("ns1");
    root.addChildToBack(requireCall);
    pass.process(externs, root);
    assertTrue(pass.getExportedVariableNames().isEmpty());
  }

  @Test
  public void testProcessMissingProvideReportsError() {
    Node requireCall = createGoogRequireCall("missing.ns");
    root.addChildToBack(requireCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_MISSING_PROVIDE_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testProcessLateProvideReportsError() {
    Node provideCall = createGoogProvideCall("late.ns");
    root.addChildToBack(provideCall);
    Node requireCall = createGoogRequireCall("late.ns");
    root.addChildToBack(requireCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_LATE_PROVIDE_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitGoogProvideAddsProvidedName() {
    Node provideCall = createGoogProvideCall("my.namespace");
    root.addChildToBack(provideCall);
    pass.process(externs, root);
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testVisitDuplicateProvideReportsError() {
    root.addChildToBack(createGoogProvideCall("dup.ns"));
    root.addChildToBack(createGoogProvideCall("dup.ns"));
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_DUPLICATE_NAMESPACE_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitInvalidProvideNameReportsError() {
    Node provideCall = createGoogProvideCall("invalid-name");
    root.addChildToBack(provideCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_INVALID_PROVIDE_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitGoogRequireRemovesNodeWhenProvidedExists() {
    root.addChildToBack(createGoogProvideCall("ns.to.remove"));
    Node requireCall = createGoogRequireCall("ns.to.remove");
    root.addChildToBack(requireCall);
    pass.process(externs, root);
    assertEquals(1, root.getChildCount());
  }

  @Test
  public void testVisitGoogRequireWithEmptyNamespaceReportsError() {
    Node requireCall = createGoogRequireCallWithNoArgs();
    root.addChildToBack(requireCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_NULL_ARGUMENT_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitGoogRequireWithNonStringArgReportsError() {
    Node requireCall = createGoogRequireCallWithNonStringArg();
    root.addChildToBack(requireCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_INVALID_ARGUMENT_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitGoogRequireWithMultipleArgsReportsError() {
    Node requireCall = createGoogRequireCallWithMultipleArgs();
    root.addChildToBack(requireCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_TOO_MANY_ARGUMENTS_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitGoogProvideWithMultipleArgsReportsError() {
    Node provideCall = createGoogProvideCallWithMultipleArgs();
    root.addChildToBack(provideCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_TOO_MANY_ARGUMENTS_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitGoogExportSymbolAddsExportedVariable() {
    Node exportCall = createGoogExportSymbolCall("exportedVar");
    root.addChildToBack(exportCall);
    pass.process(externs, root);
    Set<String> exported = pass.getExportedVariableNames();
    assertEquals(1, exported.size());
    assertTrue(exported.contains("exportedVar"));
  }

  @Test
  public void testVisitGoogExportSymbolWithDottedName() {
    Node exportCall = createGoogExportSymbolCall("a.b.c");
    root.addChildToBack(exportCall);
    pass.process(externs, root);
    Set<String> exported = pass.getExportedVariableNames();
    assertTrue(exported.contains("a"));
  }

  @Test
  public void testVisitFunctionDeclarationWithProvidedNameReportsError() {
    root.addChildToBack(createGoogProvideCall("fname"));
    Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "fname"));
    root.addChildToBack(func);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_FUNCTION_NAMESPACE_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testVisitNewDateGoogNowRewritesWhenEnabled() {
    ProcessClosurePrimitives passWithRewrite = new ProcessClosurePrimitives(
        compiler, CheckLevel.WARNING, true);
    Node newDate = new Node(Token.NEW, Node.newString(Token.NAME, "Date"));
    Node callGoogNow = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode("goog.now", newDate, "goog.now"));
    newDate.addChildToBack(callGoogNow);
    root.addChildToBack(new Node(Token.EXPR_RESULT, newDate));
    passWithRewrite.process(externs, root);
    assertEquals(1, root.getChildCount());
    Node result = root.getFirstChild();
    assertEquals(Token.NEW, result.getFirstChild().getType());
    assertEquals(1, result.getFirstChild().getChildCount());
  }

  @Test
  public void testVisitNewDateWithoutGoogNowDoesNotRewrite() {
    ProcessClosurePrimitives passWithRewrite = new ProcessClosurePrimitives(
        compiler, CheckLevel.WARNING, true);
    Node newDate = new Node(Token.NEW, Node.newString(Token.NAME, "Date"));
    root.addChildToBack(new Node(Token.EXPR_RESULT, newDate));
    passWithRewrite.process(externs, root);
    assertEquals(1, root.getChildCount());
    Node result = root.getFirstChild();
    assertNotNull(result);
  }

  @Test
  public void testVisitSetCssNameMappingWithValidArgProcesses() {
    Node setCall = createGoogSetCssNameMappingCall("a", "b");
    root.addChildToBack(setCall);
    pass.process(externs, root);
    assertNotNull(compiler.getCssRenamingMap());
    assertEquals("b", compiler.getCssRenamingMap().get("a"));
  }

  @Test
  public void testVisitSetCssNameMappingWithInvalidArgReportsError() {
    Node setCall = createGoogSetCssNameMappingCallWithInvalidArg();
    root.addChildToBack(setCall);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR",
        errors.get(0).getType().key);
  }

  @Test
  public void testVisitGetPropGoogBaseReportsErrorWhenNotCalled() {
    Node getProp = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "goog"),
        Node.newString(Token.STRING, "base"));
    root.addChildToBack(getProp);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_BASE_CLASS_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testProcessUpdatesExportedVariables() {
    root.addChildToBack(createGoogExportSymbolCall("var1"));
    root.addChildToBack(createGoogExportSymbolCall("var2"));
    pass.process(externs, root);
    assertEquals(2, pass.getExportedVariableNames().size());
  }

  @Test
  public void testVerifyArgumentReturnsFalseWhenArgIsNull() {
    Node methodName = new Node(Token.NAME, "goog.require");
    Node call = new Node(Token.CALL, methodName);
    root.addChildToBack(call);
    pass.process(externs, root);
    List<JSError> errors = compiler.getErrors();
    assertFalse(errors.isEmpty());
    assertEquals("JSC_NULL_ARGUMENT_ERROR", errors.get(0).getType().key);
  }

  @Test
  public void testParseSimpleGoogProvideThenRequire() {
    Node provide = createGoogProvideCall("simple");
    Node require = createGoogRequireCall("simple");
    root.addChildToBack(provide);
    root.addChildToBack(require);
    pass.process(externs, root);
    assertEquals(1, root.getChildCount());
    List<JSError> errors = compiler.getErrors();
    assertTrue(errors.toString(), errors.isEmpty());
  }

  @Test
  public void testHandleCandidateProvideDefinitionWithGlobalVar() {
    Node var = new Node(Token.VAR,
        Node.newString(Token.NAME, "myGlobal"));
    root.addChildToBack(var);
    pass.process(externs, root);
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testHandleCandidateProvideDefinitionWithAssignmentExpr() {
    Node assign = new Node(Token.ASSIGN,
        NodeUtil.newQualifiedNameNode("a.b.c", root, "a.b.c"),
        new Node(Token.OBJECTLIT));
    root.addChildToBack(new Node(Token.EXPR_RESULT, assign));
    pass.process(externs, root);
    assertTrue(compiler.getErrors().isEmpty());
  }

  private Node createGoogProvideCall(String ns) {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "provide");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node stringArg = Node.newString(Token.STRING, ns);
    Node call = new Node(Token.CALL, getProp, stringArg);
    return new Node(Token.EXPR_RESULT, call);
  }

  private Node createGoogRequireCall(String ns) {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "require");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node stringArg = Node.newString(Token.STRING, ns);
    Node call = new Node(Token.CALL, getProp, stringArg);
    return new Node(Token.EXPR_RESULT, call);
  }

  private Node createGoogRequireCallWithNoArgs() {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "require");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    return new Node(Token.EXPR_RESULT, new Node(Token.CALL, getProp));
  }

  private Node createGoogRequireCallWithNonStringArg() {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "require");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node numArg = Node.newNumber(42);
    return new Node(Token.EXPR_RESULT, new Node(Token.CALL, getProp, numArg));
  }

  private Node createGoogRequireCallWithMultipleArgs() {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "require");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node arg1 = Node.newString(Token.STRING, "ns");
    Node arg2 = Node.newString(Token.STRING, "extra");
    return new Node(Token.EXPR_RESULT, new Node(Token.CALL, getProp, arg1, arg2));
  }

  private Node createGoogProvideCallWithMultipleArgs() {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "provide");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node arg1 = Node.newString(Token.STRING, "ns1");
    Node arg2 = Node.newString(Token.STRING, "ns2");
    return new Node(Token.EXPR_RESULT, new Node(Token.CALL, getProp, arg1, arg2));
  }

  private Node createGoogExportSymbolCall(String symbol) {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "exportSymbol");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node stringArg = Node.newString(Token.STRING, symbol);
    return new Node(Token.EXPR_RESULT, new Node(Token.CALL, getProp, stringArg));
  }

  private Node createGoogSetCssNameMappingCall(String key, String value) {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "setCssNameMapping");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node objLit = new Node(Token.OBJECTLIT,
        Node.newString(Token.STRING, key),
        Node.newString(Token.STRING, value));
    return new Node(Token.EXPR_RESULT, new Node(Token.CALL, getProp, objLit));
  }

  private Node createGoogSetCssNameMappingCallWithInvalidArg() {
    Node nameNode = Node.newString(Token.NAME, "goog");
    Node propNode = Node.newString(Token.STRING, "setCssNameMapping");
    Node getProp = new Node(Token.GETPROP, nameNode, propNode);
    Node objLit = new Node(Token.OBJECTLIT,
        Node.newString(Token.STRING, "key"),
        Node.newNumber(42));
    return new Node(Token.EXPR_RESULT, new Node(Token.CALL, getProp, objLit));
  }
}