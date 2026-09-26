package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class NodeUtilTest {

  // ----- getBooleanValue -----
  @Test
  public void testGetBooleanValueString() {
    Node emptyString = Node.newString("");
    assertFalse(NodeUtil.getBooleanValue(emptyString));
    Node nonEmpty = Node.newString("a");
    assertTrue(NodeUtil.getBooleanValue(nonEmpty));
  }

  @Test
  public void testGetBooleanValueNumber() {
    Node zero = Node.newNumber(0);
    assertFalse(NodeUtil.getBooleanValue(zero));
    Node one = Node.newNumber(1);
    assertTrue(NodeUtil.getBooleanValue(one));
  }

  @Test
  public void testGetBooleanValueNullFalseVoid() {
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.VOID)));
  }

  @Test
  public void testGetBooleanValueName() {
    Node undef = Node.newString(Token.NAME, "undefined");
    assertFalse(NodeUtil.getBooleanValue(undef));
    Node nan = Node.newString(Token.NAME, "NaN");
    assertFalse(NodeUtil.getBooleanValue(nan));
    Node inf = Node.newString(Token.NAME, "Infinity");
    assertTrue(NodeUtil.getBooleanValue(inf));
  }

  @Test
  public void testGetBooleanValueTrueArrayObjectRegexp() {
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValueNonLiteral() {
    NodeUtil.getBooleanValue(new Node(Token.ADD));
  }

  // ----- getStringValue -----
  @Test
  public void testGetStringValueName() {
    Node name = Node.newString(Token.NAME, "foo");
    assertEquals("foo", NodeUtil.getStringValue(name));
  }

  @Test
  public void testGetStringValueString() {
    Node str = Node.newString("hello");
    assertEquals("hello", NodeUtil.getStringValue(str));
  }

  @Test
  public void testGetStringValueNumber() {
    assertEquals("5", NodeUtil.getStringValue(Node.newNumber(5)));
    assertEquals("5.5", NodeUtil.getStringValue(Node.newNumber(5.5)));
    assertEquals("0", NodeUtil.getStringValue(Node.newNumber(0)));
  }

  @Test
  public void testGetStringValueBooleanNullVoid() {
    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
  }

  @Test
  public void testGetStringValueOther() {
    assertNull(NodeUtil.getStringValue(new Node(Token.ADD)));
  }

  // ----- isImmutableValue -----
  @Test
  public void testIsImmutableValueTrue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString("a")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID)));
  }

  @Test
  public void testIsImmutableValueNeg() {
    Node neg = new Node(Token.NEG, Node.newNumber(1));
    assertTrue(NodeUtil.isImmutableValue(neg));
    Node nested = new Node(Token.NEG, new Node(Token.NEG, Node.newNumber(1)));
    assertTrue(NodeUtil.isImmutableValue(nested));
  }

  @Test
  public void testIsImmutableValueName() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "foo")));
  }

  @Test
  public void testIsImmutableValueFalse() {
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.ADD)));
  }

  // ----- isLiteralValue -----
  @Test
  public void testIsLiteralValueImmutable() {
    assertTrue(NodeUtil.isLiteralValue(Node.newString("a")));
  }

  @Test
  public void testIsLiteralValueArrayLitEmpty() {
    Node arr = new Node(Token.ARRAYLIT);
    assertTrue(NodeUtil.isLiteralValue(arr));
  }

  @Test
  public void testIsLiteralValueArrayLitNonLiteralChild() {
    Node arr = new Node(Token.ARRAYLIT);
    arr.addChildToBack(new Node(Token.ADD));
    assertFalse(NodeUtil.isLiteralValue(arr));
  }

  @Test
  public void testIsLiteralValueObjectLit() {
    Node obj = new Node(Token.OBJECTLIT);
    assertTrue(NodeUtil.isLiteralValue(obj));
  }

  @Test
  public void testIsLiteralValueRegexp() {
    assertTrue(NodeUtil.isLiteralValue(new Node(Token.REGEXP)));
  }

  // ----- isValidDefineValue -----
  @Test
  public void testIsValidDefineValueSimple() {
    java.util.Set<String> defines = new java.util.HashSet<>();
    assertTrue(NodeUtil.isValidDefineValue(Node.newString("a"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));
  }

  @Test
  public void testIsValidDefineValueNeg() {
    java.util.Set<String> defines = new java.util.HashSet<>();
    Node neg = new Node(Token.NEG, Node.newNumber(5));
    assertTrue(NodeUtil.isValidDefineValue(neg, defines));
  }

  @Test
  public void testIsValidDefineValueQualifiedNameInDefines() {
    java.util.Set<String> defines = new java.util.HashSet<>();
    defines.add("CONFIG");
    Node name = Node.newString(Token.NAME, "CONFIG");
    assertTrue(NodeUtil.isValidDefineValue(name, defines));
    name = Node.newString(Token.NAME, "OTHER");
    assertFalse(NodeUtil.isValidDefineValue(name, defines));
  }

  @Test
  public void testIsValidDefineValueOther() {
    java.util.Set<String> defines = new java.util.HashSet<>();
    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.ADD), defines));
  }

  // ----- isEmptyBlock -----
  @Test
  public void testIsEmptyBlockBlockWithOnlyEmpty() {
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(block));
  }

  @Test
  public void testIsEmptyBlockBlockWithNonEmpty() {
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(Node.newString("x"));
    assertFalse(NodeUtil.isEmptyBlock(block));
  }

  @Test
  public void testIsEmptyBlockNonBlock() {
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.ADD)));
  }

  // ----- isSimpleOperatorType -----
  @Test
  public void testIsSimpleOperatorTypeTrue() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.BITAND));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.NOT));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.NEG));
  }

  @Test
  public void testIsSimpleOperatorTypeFalse() {
    assertFalse(NodeUtil.isSimpleOperatorType(Token.CALL));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.NEW));
  }

  // ----- mayEffectMutableState / mayHaveSideEffects -----
  @Test
  public void testMayEffectMutableStateThrow() {
    Node n = new Node(Token.THROW);
    assertTrue(NodeUtil.mayEffectMutableState(n));
  }

  @Test
  public void testMayEffectMutableStateNew() {
    Node n = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    assertTrue(NodeUtil.mayEffectMutableState(n));
  }

  @Test
  public void testMayEffectMutableStateNewNoSideEffects() {
    // new Array() is in CONSTRUCTORS_WITHOUT_SIDE_EFFECTS
    Node constructor = Node.newString(Token.NAME, "Array");
    Node n = new Node(Token.NEW, constructor);
    // We must set noSideEffectsCall to false (default) for the node.
    // The method checkForStateChangeHelper checks isNoSideEffectsCall() which is a prop.
    // By default it returns false, so it will go into the constructor check.
    // Since constructor name is "Array", it should break and not return true.
    // Then it will iterate children (none) and return false.
    assertFalse(NodeUtil.mayEffectMutableState(n));
  }

  @Test
  public void testMayEffectMutableStateCall() {
    Node n = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    assertTrue(NodeUtil.mayEffectMutableState(n));
  }

  @Test
  public void testMayEffectMutableStateCallNoSideEffects() {
    Node n = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    n.putBooleanProp(Node.SIDE_EFFECTS_PROP, false); // isNoSideEffectsCall() uses this
    assertFalse(NodeUtil.mayEffectMutableState(n));
  }

  @Test
  public void testMayHaveSideEffects() {
    Node n = new Node(Token.THROW);
    assertTrue(NodeUtil.mayHaveSideEffects(n));
    Node lit = Node.newString("hello");
    assertFalse(NodeUtil.mayHaveSideEffects(lit));
  }

  // ----- constructorCallHasSideEffects -----
  @Test
  public void testConstructorCallHasSideEffectsTrue() {
    Node n = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(n));
  }

  @Test
  public void testConstructorCallHasSideEffectsFalse() {
    Node n = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(n));
  }

  @Test
  public void testConstructorCallHasSideEffectsNoSideEffectsProp() {
    Node n = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
    n.putBooleanProp(Node.SIDE_EFFECTS_PROP, false);
    assertFalse(NodeUtil.constructorCallHasSideEffects(n));
  }

  // ----- functionCallHasSideEffects -----
  @Test
  public void testFunctionCallHasSideEffectsTrue() {
    Node n = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    assertTrue(NodeUtil.functionCallHasSideEffects(n));
  }

  @Test
  public void testFunctionCallHasSideEffectsString() {
    // String() has no side effects
    Node n = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    assertFalse(NodeUtil.functionCallHasSideEffects(n));
  }

  @Test
  public void testFunctionCallHasSideEffectsMath() {
    // Math.foo()
    Node mathObj = Node.newString(Token.NAME, "Math");
    Node prop = Node.newString(Token.STRING, "random");
    Node getprop = new Node(Token.GETPROP, mathObj, prop);
    Node n = new Node(Token.CALL, getprop);
    assertFalse(NodeUtil.functionCallHasSideEffects(n));
  }

  @Test
  public void testFunctionCallHasSideEffectsNoSideEffectsProp() {
    Node n = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    n.putBooleanProp(Node.SIDE_EFFECTS_PROP, false);
    assertFalse(NodeUtil.functionCallHasSideEffects(n));
  }

  // ----- nodeTypeMayHaveSideEffects -----
  @Test
  public void testNodeTypeMayHaveSideEffectsAssignment() {
    Node n = new Node(Token.ASSIGN);
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
  }

  @Test
  public void testNodeTypeMayHaveSideEffectsCall() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.CALL)));
  }

  @Test
  public void testNodeTypeMayHaveSideEffectsNameWithChildren() {
    Node name = Node.newString(Token.NAME, "x");
    name.addChildToBack(Node.newNumber(1)); // like var x = 1
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(name));
  }

  @Test
  public void testNodeTypeMayHaveSideEffectsFalse() {
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(Node.newString("a")));
  }

  // ----- canBeSideEffected -----
  @Test
  public void testCanBeSideEffectedCallNew() {
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL)));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW)));
  }

  @Test
  public void testCanBeSideEffectedNameConstant() {
    Node name = Node.newString(Token.NAME, "CONST");
    assertFalse(NodeUtil.canBeSideEffected(name));
  }

  @Test
  public void testCanBeSideEffectedNameNonConstant() {
    Node name = Node.newString(Token.NAME, "x");
    assertTrue(NodeUtil.canBeSideEffected(name));
  }

  @Test
  public void testCanBeSideEffectedGetProp() {
    Node prop = new Node(Token.GETPROP, Node.newString(Token.NAME, "x"),
                         Node.newString("prop"));
    assertTrue(NodeUtil.canBeSideEffected(prop));
  }

  // ----- precedence -----
  @Test
  public void testPrecedence() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  // ----- isAssignmentOp -----
  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
  }

  // ----- getOpFromAssignmentOp -----
  @Test
  public void testGetOpFromAssignmentOp() {
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    assertEquals(Token.BITAND, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITAND)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOpInvalid() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
  }

  // ----- isExpressionNode, isGet, isGetProp, isName, isNew, isVar -----
  @Test
  public void testIsExpressionNode() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));
  }

  @Test
  public void testIsGet() {
    Node getprop = new Node(Token.GETPROP);
    Node getelem = new Node(Token.GETELEM);
    assertTrue(NodeUtil.isGet(getprop));
    assertTrue(NodeUtil.isGet(getelem));
    assertFalse(NodeUtil.isGet(new Node(Token.NAME)));
  }

  @Test
  public void testIsGetProp() {
    assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));
  }

  @Test
  public void testIsName() {
    assertTrue(NodeUtil.isName(new Node(Token.NAME)));
    assertFalse(NodeUtil.isName(new Node(Token.STRING)));
  }

  @Test
  public void testIsNew() {
    assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
  }

  @Test
  public void testIsVar() {
    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
  }
}