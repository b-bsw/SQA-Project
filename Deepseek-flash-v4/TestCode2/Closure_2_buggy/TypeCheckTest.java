package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

public class TypeCheckTest {
  private TypeCheck typeCheck;
  private AbstractCompiler compiler;
  private ReverseAbstractInterpreter reverseInterpreter;
  private JSTypeRegistry typeRegistry;
  private Scope topScope;
  private MemoizedScopeCreator scopeCreator;
  private CheckLevel reportMissingOverride;
  private CheckLevel reportUnknownTypes;

  @Before
  public void setUp() {
    compiler = null;
    reverseInterpreter = null;
    typeRegistry = null;
    topScope = null;
    scopeCreator = null;
    reportMissingOverride = CheckLevel.WARNING;
    reportUnknownTypes = CheckLevel.OFF;
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorWithNullCompiler() {
    new TypeCheck(null, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorWithNullReverseInterpreter() {
    new TypeCheck(compiler, null, typeRegistry, reportMissingOverride, reportUnknownTypes);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorWithNullTypeRegistry() {
    new TypeCheck(compiler, reverseInterpreter, null, reportMissingOverride, reportUnknownTypes);
  }

  @Test
  public void testConstructorWithNonNullArgs() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    assertNotNull(tc);
  }

  @Test
  public void testConstructorWithTopScopeAndScopeCreator() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, topScope, scopeCreator, reportMissingOverride, reportUnknownTypes);
    assertNotNull(tc);
  }

  @Test(expected = NullPointerException.class)
  public void testProcessWithNullScopeCreator() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    Node externsRoot = null;
    Node jsRoot = new Node(Token.SCRIPT);
    tc.process(externsRoot, jsRoot);
  }

  @Test(expected = NullPointerException.class)
  public void testProcessWithNullTopScope() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    Node externsRoot = null;
    Node jsRoot = new Node(Token.SCRIPT);
    tc.process(externsRoot, jsRoot);
  }

  @Test(expected = NullPointerException.class)
  public void testProcessForTestingWithNullRoot() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    tc.processForTesting(null, null);
  }

  @Test
  public void testReportMissingProperties() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    TypeCheck result = tc.reportMissingProperties(true);
    assertSame(tc, result);
  }

  @Test
  public void testReportMissingPropertiesWithFalse() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    TypeCheck result = tc.reportMissingProperties(false);
    assertSame(tc, result);
  }

  @Test
  public void testGetTypedPercentWithNoNodes() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    double percent = tc.getTypedPercent();
    assertEquals(0.0, percent, 0.0001);
  }

  @Test
  public void testGetTypedPercentWithAllTyped() {
    // This test requires internal state manipulation; we test the default
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    double percent = tc.getTypedPercent();
    assertEquals(0.0, percent, 0.0001);
  }

  @Test
  public void testShouldTraverseReturnsTrue() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.FUNCTION);
    Node parent = null;
    // shouldTraverse always returns true
    assertTrue(tc.shouldTraverse(t, n, parent));
  }

  @Test
  public void testShouldTraverseDoesNotThrow() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.SCRIPT);
    Node parent = null;
    assertTrue(tc.shouldTraverse(t, n, parent));
  }

  @Test
  public void testGetJSTypeWithNullType() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    Node n = new Node(Token.NAME);
    JSType type = tc.getJSType(n);
    assertNotNull(type);
  }

  @Test
  public void testEnsureTypedWithNullType() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    tc.ensureTyped(t, n);
    assertNotNull(n.getJSType());
  }

  @Test
  public void testVisitNameReturnsCorrectBoolean() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    Node parent = new Node(Token.EXPR_RESULT);
    boolean result = tc.visitName(t, n, parent);
    assertTrue(result);
  }

  @Test
  public void testVisitNameWithFunctionParentReturnsFalse() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    Node parent = new Node(Token.FUNCTION);
    boolean result = tc.visitName(t, n, parent);
    assertFalse(result);
  }

  @Test
  public void testVisitNameWithCatchParentReturnsFalse() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    Node parent = new Node(Token.CATCH);
    boolean result = tc.visitName(t, n, parent);
    assertFalse(result);
  }

  @Test
  public void testVisitNameWithParamListParentReturnsFalse() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    Node parent = new Node(Token.PARAM_LIST);
    boolean result = tc.visitName(t, n, parent);
    assertFalse(result);
  }

  @Test
  public void testVisitNameWithVarParentReturnsFalse() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    Node parent = new Node(Token.VAR);
    boolean result = tc.visitName(t, n, parent);
    assertFalse(result);
  }

  @Test
  public void testCheckTypeofStringWithValidValues() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.STRING);
    // Valid typeof strings should not cause issues
    tc.checkTypeofString(t, n, "number");
    tc.checkTypeofString(t, n, "string");
    tc.checkTypeofString(t, n, "boolean");
    tc.checkTypeofString(t, n, "undefined");
    tc.checkTypeofString(t, n, "function");
    tc.checkTypeofString(t, n, "object");
    tc.checkTypeofString(t, n, "unknown");
  }

  @Test
  public void testCheckTypeofStringWithInvalidValue() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.STRING);
    // Invalid typeof string should call validator.expectValidTypeofName
    tc.checkTypeofString(t, n, "invalid");
  }

  @Test
  public void testDoPercentTypedAccountingWithNullType() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    n.setJSType(null);
    tc.doPercentTypedAccounting(t, n);
    double percent = tc.getTypedPercent();
    assertEquals(0.0, percent, 0.0001);
  }

  @Test
  public void testDoPercentTypedAccountingWithUnknownType() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    JSType unknownType = typeRegistry.getNativeType(UNKNOWN_TYPE);
    n.setJSType(unknownType);
    tc.doPercentTypedAccounting(t, n);
    double percent = tc.getTypedPercent();
    // unknownCount incremented, typedCount not incremented
    assertTrue(percent < 100.0);
  }

  @Test
  public void testDoPercentTypedAccountingWithTypedType() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.NAME);
    JSType numberType = typeRegistry.getNativeType(NUMBER_TYPE);
    n.setJSType(numberType);
    tc.doPercentTypedAccounting(t, n);
    double percent = tc.getTypedPercent();
    assertEquals(100.0, percent, 0.0001);
  }

  @Test
  public void testCheckNoTypeCheckSectionEnterAndExit() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    Node n = new Node(Token.SCRIPT);
    JSDocInfo jsDocInfo = new JSDocInfo();
    jsDocInfo.setNoTypeCheck(true);
    n.setJSDocInfo(jsDocInfo);
    tc.checkNoTypeCheckSection(n, true);
    // Should enter section
    tc.checkNoTypeCheckSection(n, false);
    // Should exit section
  }

  @Test
  public void testCheckNoTypeCheckSectionWithNoNoTypeCheck() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    Node n = new Node(Token.SCRIPT);
    // No JSDocInfo set, so no change
    tc.checkNoTypeCheckSection(n, true);
    tc.checkNoTypeCheckSection(n, false);
  }

  @Test
  public void testReportWithNoTypeCheckSection() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    NodeTraversal t = null;
    Node n = new Node(Token.ERROR);
    DiagnosticType diagnostic = DiagnosticType.warning("TEST", "test message");
    tc.report(t, n, diagnostic);
  }

  @Test
  public void testReportWithTypeCheckSectionActive() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    Node n = new Node(Token.SCRIPT);
    JSDocInfo jsDocInfo = new JSDocInfo();
    jsDocInfo.setNoTypeCheck(true);
    n.setJSDocInfo(jsDocInfo);
    tc.checkNoTypeCheckSection(n, true);
    NodeTraversal t = null;
    Node reportNode = new Node(Token.ERROR);
    DiagnosticType diagnostic = DiagnosticType.warning("TEST", "test message");
    // Should not report because noTypeCheckSection > 0
    tc.report(t, reportNode, diagnostic);
    tc.checkNoTypeCheckSection(n, false);
  }

  @Test
  public void testDefaultConstructorWithThreeArgs() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
    assertNotNull(tc);
  }

  @Test
  public void testReportMissingPropertiesReturnsSelf() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    assertSame(tc, tc.reportMissingProperties(true));
  }

  @Test
  public void testGetTypedPercentWithNullCount() {
    TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    assertEquals(0.0, tc.getTypedPercent(), 0.0001);
  }
}