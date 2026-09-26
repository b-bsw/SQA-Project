package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PrepareAstTest {

  private AbstractCompiler compiler;
  private PrepareAst checkOnly;
  private PrepareAst normal;

  @Before
  public void setUp() {
    compiler = new Compiler();
    checkOnly = new PrepareAst(compiler, true);
    normal = new PrepareAst(compiler, false);
  }

  // ------------------------------------------------------------
  // checkOnly = true : normalizeBlocks and normalizeNodeTypes
  // ------------------------------------------------------------

  @Test
  public void testNormalizeBlocksIfWithoutBlock() {
    Node cond = IR.number(0);
    Node body = IR.empty();
    Node ifNode = IR.ifNode(cond, body);

    assertFalse(ifNode.getSecondChild().isBlock());

    try {
      checkOnly.process(null, ifNode);
      fail("Expected IllegalStateException from reportChange");
    } catch (IllegalStateException e) {
      // expected
    }

    Node newBody = ifNode.getSecondChild();
    assertTrue("Body should be replaced by a BLOCK node", newBody.isBlock());
    assertTrue("Block should contain the original body", newBody.hasChildren());
    assertSame("Original body should be inside the new block", body, newBody.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocksWhileWithoutBlock() {
    Node cond = IR.number(1);
    Node body = IR.empty();
    Node whileNode = IR.whileNode(cond, body);
    checkOnly.process(null, whileNode);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocksDoWithoutBlock() {
    Node body = IR.empty();
    Node cond = IR.number(0);
    Node doNode = IR.doNode(body, cond);
    checkOnly.process(null, doNode);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocksForWithoutBlock() {
    Node init = IR.name("i");
    Node cond = IR.number(0);
    Node inc = IR.name("i");
    Node body = IR.empty();
    Node forNode = IR.forNode(init, cond, inc, body);
    checkOnly.process(null, forNode);
  }

  @Test
  public void testNormalizeBlocksIfAlreadyWithBlock() {
    Node cond = IR.number(0);
    Node block = IR.block();
    Node ifNode = IR.ifNode(cond, block);
    checkOnly.process(null, ifNode);
    assertTrue("Existing block should remain", ifNode.getSecondChild().isBlock());
    assertSame("Block object should be unchanged", block, ifNode.getSecondChild());
  }

  @Test
  public void testNormalizeBlocksLabelNoChange() {
    Node label = IR.label(IR.name("mylabel"), IR.block());
    checkOnly.process(null, label);
    // label node should not be modified
    assertTrue(label.isLabel());
  }

  @Test
  public void testNormalizeBlocksSwitchNoChange() {
    Node switchNode = IR.switchNode(IR.number(1), IR.caseNode(IR.number(1), IR.block()));
    checkOnly.process(null, switchNode);
    assertTrue(switchNode.isSwitch());
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocksNestedControlStructure() {
    Node cond = IR.number(0);
    Node innerBody = IR.empty();
    Node innerIf = IR.ifNode(cond, innerBody);
    Node outerCond = IR.number(1);
    Node outerIf = IR.ifNode(outerCond, innerIf);
    checkOnly.process(null, outerIf);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeNodeTypesParentMismatch() {
    Node root = new Node(Token.EXPR_RESULT);
    Node child = new Node(Token.NAME, "x");
    root.addChildToFront(child);
    // corrupt parent pointer
    child.setParent(new Node(Token.EMPTY));
    checkOnly.process(null, root);
  }

  // ------------------------------------------------------------
  // checkOnly = false : annotations
  // ------------------------------------------------------------

  @Test
  public void testAnnotateCallsFreeCall() {
    Node call = IR.call(IR.name("foo"), IR.number(1));
    normal.process(null, call);
    assertTrue("Call with name callee should be FREE_CALL", call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCallsNotFreeCall() {
    Node get = IR.getprop(IR.name("obj"), IR.string("method"));
    Node call = IR.call(get);
    normal.process(null, call);
    assertFalse("Call with GET callee should NOT be FREE_CALL", call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCallsDirectEval() {
    Node call = IR.call(IR.name("eval"), IR.number(1));
    normal.process(null, call);
    Node nameNode = call.getFirstChild();
    assertTrue("eval name should have DIRECT_EVAL", nameNode.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateCallsNotDirectEval() {
    Node call = IR.call(IR.name("foo"), IR.number(1));
    normal.process(null, call);
    assertFalse("Non‑eval name should NOT have DIRECT_EVAL",
        call.getFirstChild().getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateDispatchersWithJavaDispatch() {
    Node func = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("target"), func);
    JSDocInfo info = new JSDocInfo();
    info.setJavaDispatch(true);
    assign.setJSDocInfo(info);
    normal.process(null, assign);
    assertTrue("Function inside java dispatch assign should have IS_DISPATCHER",
        func.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchersWithoutJavaDispatch() {
    Node func = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("target"), func);
    JSDocInfo info = new JSDocInfo();
    // info does not set javaDispatch
    assign.setJSDocInfo(info);
    normal.process(null, assign);
    assertFalse("Function without java dispatch should NOT have IS_DISPATCHER",
        func.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchersParentNotAssign() {
    Node parent = IR.name("p");
    Node func = IR.function(IR.name(""), IR.paramList(), IR.block());
    parent.addChildToBack(func);
    normal.process(null, parent);
    assertFalse("Function whose parent is not ASSIGN should NOT have IS_DISPATCHER",
        func.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testNormalizeObjectLiteralAnnotationsFunctionValue() {
    Node objlit = IR.objectlit();
    Node key = IR.stringKey("a");
    Node value = IR.function(IR.name(""), IR.paramList(), IR.block());
    objlit.addChildToBack(key);
    key.addChildToFront(value);
    JSDocInfo info = new JSDocInfo();
    key.setJSDocInfo(info);
    normal.process(null, objlit);
    assertSame("JSDocInfo should be transferred from key to function value",
        info, value.getJSDocInfo());
    assertSame("Key should still retain its JSDocInfo", info, key.getJSDocInfo());
  }

  @Test
  public void testNormalizeObjectLiteralAnnotationsNonFunctionValue() {
    Node objlit = IR.objectlit();
    Node key = IR.stringKey("a");
    Node value = IR.number(5);
    objlit.addChildToBack(key);
    key.addChildToFront(value);
    JSDocInfo info = new JSDocInfo();
    key.setJSDocInfo(info);
    normal.process(null, objlit);
    assertNotNull("Key should keep JSDocInfo for non‑function value", key.getJSDocInfo());
    assertNull("Non‑function value should not receive JSDocInfo", value.getJSDocInfo());
  }

  // ------------------------------------------------------------
  // Miscellaneous / boundary tests
  // ------------------------------------------------------------

  @Test
  public void testProcessWithNullExternsAndNullRoot() {
    normal.process(null, null);
    // no exception expected
  }

  @Test
  public void testProcessWithNonNullExterns() {
    Node externs = IR.script();
    Node root = IR.script();
    normal.process(externs, root);
    // no exception expected
  }

  @Test(expected = IllegalStateException.class)
  public void testReportChangeThrowsWhenCheckOnlyAndNormalizationOccurs() {
    Node cond = IR.number(0);
    Node body = IR.empty();
    Node ifNode = IR.ifNode(cond, body);
    checkOnly.process(null, ifNode);
  }
}