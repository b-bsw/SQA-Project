package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class CheckGlobalThisTest {

  private Compiler compiler;
  private CheckGlobalThis check;
  private NodeTraversal t;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node root = new Node(Token.SCRIPT);
    root.setSourceFileName("test.js");
    root.setLineno(0);
    root.setCharno(0);
    t = new NodeTraversal(compiler, root);
    check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
  }

  @Test
  public void testShouldTraverseFunctionWithConstructorJSDoc() {
    Node funcNode = new Node(Token.FUNCTION);
    JSDocInfo jsDoc = new JSDocInfo();
    jsDoc.setConstructor(true);
    funcNode.setJSDocInfo(jsDoc);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToFront(funcNode);
    assertFalse("should not traverse constructor function", check.shouldTraverse(t, funcNode, parent));
  }

  @Test
  public void testShouldTraverseFunctionNoAnnotationAndNameParent() {
    Node funcNode = new Node(Token.FUNCTION);
    Node parent = new Node(Token.NAME);
    parent.setString("a");
    parent.addChildToFront(funcNode);
    assertTrue("should traverse function with NAME parent", check.shouldTraverse(t, funcNode, parent));
  }

  @Test
  public void testShouldTraverseFunctionNoAnnotationAndBlockParent() {
    Node funcNode = new Node(Token.FUNCTION);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToFront(funcNode);
    assertTrue("should traverse function with BLOCK parent", check.shouldTraverse(t, funcNode, parent));
  }

  @Test
  public void testShouldTraverseFunctionUnsupportedParent() {
    Node funcNode = new Node(Token.FUNCTION);
    Node parent = new Node(Token.VAR);
    parent.addChildToFront(funcNode);
    assertFalse("should not traverse function with VAR parent", check.shouldTraverse(t, funcNode, parent));
  }

  @Test
  public void testShouldTraverseAssignLhsSetsAssignLhsChild() {
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME);
    lhs.setString("a");
    Node rhs = Node.newNumber(0);
    assignNode.addChildToFront(lhs);
    assignNode.addChildToBack(rhs);
    lhs = assignNode.getFirstChild();
    rhs = lhs.getNext();
    // n is lhs should set assignLhsChild
    assertTrue("should traverse lhs of assign", check.shouldTraverse(t, lhs, assignNode));
    // assignLhsChild is set; will be verified through visit tests
  }

  @Test
  public void testShouldTraverseAssignRhsPrototypeReturnsFalse() {
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.GETPROP);
    Node target = new Node(Token.NAME);
    target.setString("Foo");
    Node prop = Node.newString("prototype");
    lhs.addChildToFront(target);
    lhs.addChildToBack(prop);
    Node rhs = Node.newNumber(0);
    assignNode.addChildToFront(lhs);
    assignNode.addChildToBack(rhs);
    lhs = assignNode.getFirstChild();
    rhs = lhs.getNext();
    assertFalse("should not traverse rhs when lhs is prototype getprop", check.shouldTraverse(t, rhs, assignNode));
  }

  @Test
  public void testShouldTraverseAssignRhsNestedPrototypeReturnsFalse() {
    Node outerAssign = new Node(Token.ASSIGN);
    Node innerGetProp = new Node(Token.GETPROP);
    Node innerTarget = new Node(Token.NAME);
    innerTarget.setString("A");
    innerGetProp.addChildToFront(innerTarget);
    innerGetProp.addChildToBack(Node.newString("prototype"));
    Node outerGetProp = new Node(Token.GETPROP);
    outerGetProp.addChildToFront(innerGetProp);
    outerGetProp.addChildToBack(Node.newString("method"));
    Node rhs = Node.newNumber(0);
    outerAssign.addChildToFront(outerGetProp);
    outerAssign.addChildToBack(rhs);
    outerGetProp = outerAssign.getFirstChild();
    rhs = outerGetProp.getNext();
    assertFalse("should not traverse rhs when lhs has nested prototype", check.shouldTraverse(t, rhs, outerAssign));
  }

  @Test
  public void testShouldTraverseAssignRhsNonPrototypeReturnsTrue() {
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.GETPROP);
    Node target = new Node(Token.NAME);
    target.setString("Foo");
    Node prop = Node.newString("other");
    lhs.addChildToFront(target);
    lhs.addChildToBack(prop);
    Node rhs = Node.newNumber(0);
    assignNode.addChildToFront(lhs);
    assignNode.addChildToBack(rhs);
    lhs = assignNode.getFirstChild();
    rhs = lhs.getNext();
    assertTrue("should traverse rhs if lhs is not prototype", check.shouldTraverse(t, rhs, assignNode));
  }

  @Test
  public void testShouldTraverseNormalNodeReturnsTrue() {
    Node n = new Node(Token.NUMBER, 0);
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(n);
    assertTrue("should traverse normal node", check.shouldTraverse(t, n, parent));
  }

  @Test
  public void testShouldTraverseNullParentReturnsTrue() {
    Node n = new Node(Token.NUMBER, 1);
    assertTrue("should traverse with null parent", check.shouldTraverse(t, n, null));
  }

  // ======================== visit tests ========================

  @Test
  public void testVisitThisWithGetPropReportsError() {
    Node thisNode = new Node(Token.THIS);
    thisNode.setSourceFileName("test.js");
    thisNode.setLineno(1);
    thisNode.setCharno(0);
    Node getPropParent = new Node(Token.GETPROP);
    Node property = Node.newString("x");
    getPropParent.addChildToFront(thisNode);
    getPropParent.addChildToBack(property);
    check.visit(t, thisNode, getPropParent);
    assertEquals(1, compiler.getErrorManager().getWarningCount());
  }

  @Test
  public void testVisitThisWithoutGetPropNoAssignLhsNoError() {
    Node thisNode = new Node(Token.THIS);
    thisNode.setSourceFileName("test.js");
    thisNode.setLineno(1);
    thisNode.setCharno(0);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToFront(thisNode);
    check.visit(t, thisNode, parent);
    assertEquals(0, compiler.getErrorManager().getWarningCount());
  }

  @Test
  public void testVisitThisNullParentNoError() {
    Node thisNode = new Node(Token.THIS);
    thisNode.setSourceFileName("test.js");
    thisNode.setLineno(1);
    thisNode.setCharno(0);
    check.visit(t, thisNode, null);
    assertEquals(0, compiler.getErrorManager().getWarningCount());
  }

  @Test
  public void testVisitNonThisNoEffect() {
    Node n = new Node(Token.NUMBER, 0);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToFront(n);
    check.visit(t, n, parent);
    assertEquals(0, compiler.getErrorManager().getWarningCount());
  }

  @Test
  public void testVisitThisWithAssignLhsChildReportsError() {
    // set assignLhsChild via shouldTraverse on lhs
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME);
    lhs.setString("a");
    Node rhs = Node.newNumber(0);
    assignNode.addChildToFront(lhs);
    assignNode.addChildToBack(rhs);
    lhs = assignNode.getFirstChild();
    rhs = lhs.getNext();
    check.shouldTraverse(t, lhs, assignNode); // sets assignLhsChild = lhs

    // now visit a THIS node – should be reported because assignLhsChild != null
    Node thisNode = new Node(Token.THIS);
    thisNode.setSourceFileName("test.js");
    thisNode.setLineno(1);
    thisNode.setCharno(0);
    Node blockParent = new Node(Token.BLOCK);
    blockParent.addChildToFront(thisNode);
    check.visit(t, thisNode, blockParent);
    assertEquals(1, compiler.getErrorManager().getWarningCount());
  }

  @Test
  public void testVisitClearsAssignLhsChild() {
    // set assignLhsChild with lhs1
    Node assign1 = new Node(Token.ASSIGN);
    Node lhs1 = new Node(Token.NAME);
    lhs1.setString("x");
    Node rhs1 = Node.newNumber(0);
    assign1.addChildToFront(lhs1);
    assign1.addChildToBack(rhs1);
    lhs1 = assign1.getFirstChild();
    rhs1 = lhs1.getNext();
    check.shouldTraverse(t, lhs1, assign1); // assignLhsChild = lhs1

    // inner assign should NOT override assignLhsChild
    Node assign2 = new Node(Token.ASSIGN);
    Node lhs2 = new Node(Token.NAME);
    lhs2.setString("y");
    Node rhs2 = Node.newNumber(1);
    assign2.addChildToFront(lhs2);
    assign2.addChildToBack(rhs2);
    lhs2 = assign2.getFirstChild();
    rhs2 = lhs2.getNext();
    check.shouldTraverse(t, lhs2, assign2); // assignLhsChild unchanged

    // visit a THIS node – report because assignLhsChild (lhs1) still set
    Node thisNode1 = new Node(Token.THIS);
    thisNode1.setSourceFileName("test.js");
    thisNode1.setLineno(1);
    thisNode1.setCharno(0);
    Node blockParent = new Node(Token.BLOCK);
    blockParent.addChildToFront(thisNode1);
    check.visit(t, thisNode1, blockParent);
    assertEquals(1, compiler.getErrorManager().getWarningCount());

    // visit the actual assignLhsChild (lhs1) should clear it
    check.visit(t, lhs1, assign1);

    // now another THIS node should NOT be reported
    Node thisNode2 = new Node(Token.THIS);
    thisNode2.setSourceFileName("test.js");
    thisNode2.setLineno(2);
    thisNode2.setCharno(0);
    Node blockParent2 = new Node(Token.BLOCK);
    blockParent2.addChildToFront(thisNode2);
    check.visit(t, thisNode2, blockParent2);
    assertEquals(1, compiler.getErrorManager().getWarningCount()); // no new warning
  }
}