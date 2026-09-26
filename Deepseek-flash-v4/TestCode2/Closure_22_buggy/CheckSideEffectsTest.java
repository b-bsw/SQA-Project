package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckSideEffectsTest {

  private TestCompiler compiler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    compiler.initOptions(new CompilerOptions());
  }

  /** A small Compiler subclass that records reports instead of routing them onward. */
  private static class TestCompiler extends Compiler {
    final List<JSError> reported = new ArrayList<>();
    int codeChanges = 0;

    @Override
    public void report(JSError error) {
      reported.add(error);
    }

    @Override
    public void reportCodeChange() {
      codeChanges++;
    }
  }

  private static Node createScriptWithExpression(Node expr) {
    Node exprResult = new Node(Token.EXPR_RESULT, expr);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(exprResult);
    return script;
  }

  private static CheckSideEffects newCheck(boolean protect) {
    return new CheckSideEffects(new TestCompiler(), CheckLevel.WARNING, protect) {};
  }

  @Test
  public void testStringLiteralExpressionReportsMissingPlus() {
    Node str = IR.string("test");
    Node script = createScriptWithExpression(str);
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    check.process(null, script);

    assertEquals(1, compiler.reported.size());
    assertTrue(
        compiler.reported.get(0).getDescription(),
        compiler.reported.get(0).getDescription().contains("missing '+'"));
  }

  @Test
  public void testBinaryOperatorResultNotUsed() {
    Node add = new Node(Token.ADD, IR.name("a"), IR.name("b"));
    Node script = createScriptWithExpression(add);
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    check.process(null, script);

    assertEquals(1, compiler.reported.size());
    assertTrue(
        compiler.reported.get(0).getDescription(),
        compiler.reported.get(0)
            .getDescription()
            .contains("The result of the '+' operator is not being used."));
  }

  @Test
  public void testAssignmentDoesNotReport() {
    Node assign = new Node(Token.ASSIGN, IR.name("x"), IR.string("value"));
    Node script = createScriptWithExpression(assign);
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    check.process(null, script);

    assertTrue(compiler.reported.isEmpty());
  }

  @Test
  public void testEmptyScriptDoesNotReportAndDoesNotChangeExterns() {
    Node script = new Node(Token.SCRIPT);
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, true);

    compiler.codeChanges = 0;
    check.process(null, script);

    assertTrue(compiler.reported.isEmpty());
    assertEquals(0, compiler.codeChanges);
  }

  @Test
  public void testProtectSideEffectFreeNodesReplacesProblemNodes() {
    Node str1 = IR.string("a");
    Node str2 = IR.string("b");

    Node expr1 = new Node(Token.EXPR_RESULT, str1);
    Node expr2 = new Node(Token.EXPR_RESULT, str2);

    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(expr1);
    script.addChildToBack(expr2);

    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
    check.process(null, script);

    assertEquals(2, compiler.reported.size());
    assertTrue(compiler.codeChanges > 0);

    assertEquals(Token.CALL, str1.getParent().getType());
    assertEquals(Token.NAME, str1.getParent().getFirstChild().getType());
    assertEquals(CheckSideEffects.PROTECTOR_FN, str1.getParent().getFirstChild().getString());
    assertEquals(str1, str1.getParent().getLastChild());

    assertEquals(Token.CALL, str2.getParent().getType());
    assertEquals(CheckSideEffects.PROTECTOR_FN, str2.getParent().getFirstChild().getString());
    assertEquals(str2, str2.getParent().getLastChild());
  }

  @Test
  public void testVisitWithNullParentReturnsWithoutReporting() {
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    check.visit(null, IR.name("x"), null);
    assertTrue(compiler.reported.isEmpty());
  }

  @Test
  public void testStripProtectionRemovesProtectorCall() {
    Node expr = IR.string("foo");
    Node call = IR.call(IR.name(CheckSideEffects.PROTECTOR_FN), expr);
    Node exprResult = new Node(Token.EXPR_RESULT, call);

    CheckSideEffects.StripProtection strip =
        new CheckSideEffects.StripProtection(compiler);
    strip.visit(null, call, exprResult);

    assertEquals(expr, exprResult.getFirstChild());
    assertEquals(exprResult, expr.getParent());
    assertEquals(0, call.getChildCount());
  }

  @Test
  public void testStripProtectionLeavesNonProtectorCallAlone() {
    Node expr = IR.string("foo");
    Node call = IR.call(IR.name("console"), expr);
    Node exprResult = new Node(Token.EXPR_RESULT, call);

    CheckSideEffects.StripProtection strip =
        new CheckSideEffects.StripProtection(compiler);
    strip.visit(null, call, exprResult);

    assertEquals(call, exprResult.getFirstChild());
    assertEquals(1, call.getChildCount());
  }
}