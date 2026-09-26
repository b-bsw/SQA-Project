package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Predicates;
import com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ReferenceCollectingCallbackTest {

  private AbstractCompiler compiler;
  private Behavior behavior;
  private ReferenceCollectingCallback callback;

  @Before
  public void setUp() {
    compiler = new Compiler();
    behavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t,
          Map<Var, ReferenceCollection> referenceMap) {
      }
    };
    callback = new ReferenceCollectingCallback(compiler, behavior);
  }

  @Test
  public void testBasicBlockProvablyExecutesBefore_SameBlock() {
    BasicBlock block = new BasicBlock(null, new Node(Token.BLOCK));
    assertTrue(block.provablyExecutesBefore(block));
  }

  @Test
  public void testBasicBlockProvablyExecutesBefore_DescendantNotHoisted() {
    BasicBlock parent = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock child = new BasicBlock(parent, new Node(Token.BLOCK));
    assertTrue(parent.provablyExecutesBefore(child));
  }

  @Test
  public void testBasicBlockProvablyExecutesBefore_HoistedBlocks() {
    BasicBlock parent = new BasicBlock(null, new Node(Token.BLOCK));
    Node hoistedRoot = new Node(Token.FUNCTION);
    BasicBlock hoisted = new BasicBlock(parent, hoistedRoot);
    BasicBlock child = new BasicBlock(hoisted, new Node(Token.BLOCK));
    assertFalse(parent.provablyExecutesBefore(child));
  }

  @Test
  public void testBasicBlockProvablyExecutesBefore_Unrelated() {
    BasicBlock block1 = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock block2 = new BasicBlock(null, new Node(Token.BLOCK));
    assertFalse(block1.provablyExecutesBefore(block2));
  }

  @Test
  public void testReferenceCollection_isWellDefined_Empty() {
    ReferenceCollection collection = new ReferenceCollection();
    assertFalse(collection.isWellDefined());
  }

  @Test
  public void testReferenceCollection_isWellDefined_NoInit() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, false));
    assertFalse(collection.isWellDefined());
  }

  @Test
  public void testReferenceCollection_isWellDefined_WithInit() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, true));
    collection.references.add(createBasicRef(false, false));
    assertTrue(collection.isWellDefined());
  }

  @Test
  public void testReferenceCollection_isEscaped_SameScope() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, true));
    collection.references.add(createBasicRef(false, false));
    assertFalse(collection.isEscaped());
  }

  @Test
  public void testReferenceCollection_isEscaped_DifferentScopes() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, true));
    collection.references.add(createBasicRefDifferentScope(false, false));
    assertTrue(collection.isEscaped());
  }

  @Test
  public void testReferenceCollection_getInitializingReference_Decl() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, true));
    Reference init = collection.getInitializingReference();
    assertNotNull(init);
    assertTrue(init.isDeclaration());
  }

  @Test
  public void testReferenceCollection_getInitializingReference_Assignment() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, false));
    collection.references.add(createSimpleAssignmentRef());
    Reference init = collection.getInitializingReference();
    assertNotNull(init);
    assertTrue(init.isSimpleAssignmentToName());
  }

  @Test
  public void testReferenceCollection_getInitializingReference_None() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(false, false));
    collection.references.add(createBasicRef(false, false));
    assertNull(collection.getInitializingReference());
  }

  @Test
  public void testReferenceCollection_isAssignedOnceInLifetime_ZeroAssignments() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(false, false));
    assertFalse(collection.isAssignedOnceInLifetime());
  }

  @Test
  public void testReferenceCollection_isAssignedOnceInLifetime_OneAssignment() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, true));
    assertTrue(collection.isAssignedOnceInLifetime());
  }

  @Test
  public void testReferenceCollection_isAssignedOnceInLifetime_TwoAssignments() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, true));
    collection.references.add(createBasicRef(true, false));
    assertFalse(collection.isAssignedOnceInLifetime());
  }

  @Test
  public void testReferenceCollection_isNeverAssigned_True() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(false, false));
    assertTrue(collection.isNeverAssigned());
  }

  @Test
  public void testReferenceCollection_isNeverAssigned_False() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, false));
    assertFalse(collection.isNeverAssigned());
  }

  @Test
  public void testReferenceCollection_firstReferenceIsAssigningDeclaration_True() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, true));
    assertTrue(collection.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testReferenceCollection_firstReferenceIsAssigningDeclaration_False() {
    ReferenceCollection collection = new ReferenceCollection();
    collection.references.add(createBasicRef(true, false));
    assertFalse(collection.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testReference_isDeclaration_Var() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.VAR, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isDeclaration());
  }

  @Test
  public void testReference_isDeclaration_Function() {
    Node name = new Node(Token.NAME, "f");
    Node parent = new Node(Token.FUNCTION, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isDeclaration());
  }

  @Test
  public void testReference_isDeclaration_Catch() {
    Node name = new Node(Token.NAME, "e");
    Node parent = new Node(Token.CATCH, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isDeclaration());
  }

  @Test
  public void testReference_isDeclaration_LpFunction() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.LP, name);
    Node grandparent = new Node(Token.FUNCTION, parent);
    Reference ref = new Reference(name, parent, grandparent, null, null, null);
    assertTrue(ref.isDeclaration());
  }

  @Test
  public void testReference_isDeclaration_False() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ASSIGN, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertFalse(ref.isDeclaration());
  }

  @Test
  public void testReference_isVarDeclaration_True() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.VAR, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isVarDeclaration());
  }

  @Test
  public void testReference_isVarDeclaration_False() {
    Node name = new Node(Token.NAME, "f");
    Node parent = new Node(Token.FUNCTION, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertFalse(ref.isVarDeclaration());
  }

  @Test
  public void testReference_isInitializingDeclaration_VarWithInit() {
    Node name = new Node(Token.NAME, "x");
    Node init = new Node(Token.NUMBER, 1);
    name.addChildToFront(init);
    Node parent = new Node(Token.VAR, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isInitializingDeclaration());
  }

  @Test
  public void testReference_isInitializingDeclaration_VarWithoutInit() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.VAR, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertFalse(ref.isInitializingDeclaration());
  }

  @Test
  public void testReference_isInitializingDeclaration_Function() {
    Node name = new Node(Token.NAME, "f");
    Node parent = new Node(Token.FUNCTION, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isInitializingDeclaration());
  }

  @Test
  public void testReference_isSimpleAssignmentToName_True() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ASSIGN, name, new Node(Token.NUMBER, 1));
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isSimpleAssignmentToName());
  }

  @Test
  public void testReference_isSimpleAssignmentToName_False() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ASSIGN, new Node(Token.NAME, "y"), name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertFalse(ref.isSimpleAssignmentToName());
  }

  @Test
  public void testReference_isLvalue_VarWithInit() {
    Node name = new Node(Token.NAME, "x");
    name.addChildToFront(new Node(Token.NUMBER, 1));
    Node parent = new Node(Token.VAR, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_isLvalue_VarWithoutInit() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.VAR, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertFalse(ref.isLvalue());
  }

  @Test
  public void testReference_isLvalue_Inc() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.INC, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_isLvalue_Dec() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.DEC, name);
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_isLvalue_AssignmentOp() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ASSIGN, name, new Node(Token.NUMBER, 1));
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_isLvalue_ForInLhs() {
    Node name = new Node(Token.NAME, "x");
    Node forIn = new Node(Token.FOR, name, new Node(Token.NAME, "obj"));
    Reference ref = new Reference(name, forIn, null, null, null, null);
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_isLvalue_ForInVarLhs() {
    Node name = new Node(Token.NAME, "x");
    Node var = new Node(Token.VAR, name);
    Node forIn = new Node(Token.FOR, var, new Node(Token.NAME, "obj"));
    Reference ref = new Reference(name, forIn, null, null, null, null);
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_isLvalue_False() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ADD, name, new Node(Token.NUMBER, 1));
    Reference ref = new Reference(name, parent, null, null, null, null);
    assertFalse(ref.isLvalue());
  }

  @Test
  public void testReference_getAssignedValue_Function() {
    Node name = new Node(Token.NAME, "f");
    Node func = new Node(Token.FUNCTION, name);
    Reference ref = new Reference(name, func, null, null, null, null);
    assertNotNull(ref.getAssignedValue());
  }

  @Test
  public void testReference_getAssignedValue_NonFunction() {
    Node name = new Node(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, new Node(Token.NUMBER, 1));
    Reference ref = new Reference(name, assign, null, null, null, null);
    assertNull(ref.getAssignedValue());
  }

  @Test
  public void testReference_newBleedingFunction() {
    Node name = new Node(Token.NAME, "g");
    Node func = new Node(Token.FUNCTION, name);
    BasicBlock block = new BasicBlock(null, new Node(Token.BLOCK));
    Reference ref = Reference.newBleedingFunction(null, block, func);
    assertNotNull(ref);
    assertEquals(Token.NAME, ref.getNameNode().getType());
  }

  private Reference createBasicRef(boolean isDecl, boolean isInitDecl) {
    Node name = new Node(Token.NAME, "x");
    Node parent;
    if (isDecl) {
      parent = new Node(Token.VAR, name);
      if (isInitDecl) {
        name.addChildToFront(new Node(Token.NUMBER, 1));
      }
    } else {
      parent = new Node(Token.NAME, "x");
    }
    return new Reference(name, parent, null,
        new BasicBlock(null, new Node(Token.BLOCK)), null, null);
  }

  private Reference createSimpleAssignmentRef() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ASSIGN, name, new Node(Token.NUMBER, 1));
    return new Reference(name, parent, null,
        new BasicBlock(null, new Node(Token.BLOCK)), null, null);
  }

  private Reference createBasicRefDifferentScope(boolean isDecl, boolean isInitDecl) {
    Node name = new Node(Token.NAME, "x");
    Node parent;
    if (isDecl) {
      parent = new Node(Token.VAR, name);
      if (isInitDecl) {
        name.addChildToFront(new Node(Token.NUMBER, 1));
      }
    } else {
      parent = new Node(Token.NAME, "x");
    }
    Scope differentScope = new Scope(null, null);
    return new Reference(name, parent, null,
        new BasicBlock(null, new Node(Token.BLOCK)), differentScope, null);
  }
}