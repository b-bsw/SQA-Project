package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.DataFlowAnalysis.BooleanOutcomePair;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.Visitor;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class TypeInferenceTest {

  private AbstractCompiler compiler;
  private JSTypeRegistry registry;
  private ControlFlowGraph<Node> cfg;
  private ReverseAbstractInterpreter reverseInterpreter;
  private Scope functionScope;
  private Map<String, AssertionFunctionSpec> assertionFunctionsMap;
  private TypeInference inference;

  @Before
  public void setUp() {
    compiler = new TestAbstractCompiler();
    registry = compiler.getTypeRegistry();
    cfg = new TestControlFlowGraph();
    reverseInterpreter = new TestReverseAbstractInterpreter(registry);
    functionScope = new TestScope(registry);
    assertionFunctionsMap = Maps.newHashMap();
    inference = new TypeInference(compiler, cfg, reverseInterpreter,
        functionScope, assertionFunctionsMap);
  }

  @After
  public void tearDown() {
    inference = null;
  }

  @Test
  public void testCreateInitialEstimateLattice() {
    FlowScope bottom = inference.createInitialEstimateLattice();
    Assert.assertNotNull(bottom);
  }

  @Test
  public void testCreateEntryLattice() {
    FlowScope entry = inference.createEntryLattice();
    Assert.assertNotNull(entry);
  }

  @Test
  public void testFlowThroughWithBottomScope() {
    FlowScope result = inference.flowThrough(new TestNode(Token.NAME), inference.createInitialEstimateLattice());
    Assert.assertNotNull(result);
  }

  @Test
  public void testFlowThroughNormal() {
    FlowScope entry = inference.createEntryLattice();
    Node nameNode = new TestNode(Token.NAME);
    FlowScope result = inference.flowThrough(nameNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseNameWithValue() {
    Node nameNode = new TestNode(Token.NAME);
    nameNode.setString("x");
    Node value = new TestNode(Token.NUMBER);
    value.setJSType(registry.getNativeType(NUMBER_TYPE));
    nameNode.addChild(value);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(nameNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseNameWithoutValueInScope() {
    Node nameNode = new TestNode(Token.NAME);
    nameNode.setString("x");
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(nameNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseAssign() {
    Node assign = new TestNode(Token.ASSIGN);
    Node left = new TestNode(Token.NAME);
    left.setString("x");
    Node right = new TestNode(Token.NUMBER);
    right.setJSType(registry.getNativeType(NUMBER_TYPE));
    assign.addChild(left);
    assign.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(assign, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseAddStringBoth() {
    Node add = new TestNode(Token.ADD);
    Node left = new TestNode(Token.STRING);
    left.setJSType(registry.getNativeType(STRING_TYPE));
    Node right = new TestNode(Token.STRING);
    right.setJSType(registry.getNativeType(STRING_TYPE));
    add.addChild(left);
    add.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(add, entry);
    JSType result = add.getJSType();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isStringType());
  }

  @Test
  public void testTraverseAddNumberBoth() {
    Node add = new TestNode(Token.ADD);
    Node left = new TestNode(Token.NUMBER);
    left.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node right = new TestNode(Token.NUMBER);
    right.setJSType(registry.getNativeType(NUMBER_TYPE));
    add.addChild(left);
    add.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(add, entry);
    JSType result = add.getJSType();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isNumberType() || result.isUnionType());
  }

  @Test
  public void testTraverseAddUnknown() {
    Node add = new TestNode(Token.ADD);
    Node left = new TestNode(Token.NUMBER);
    left.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node right = new TestNode(Token.NUMBER);
    right.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    add.addChild(left);
    add.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(add, entry);
    JSType result = add.getJSType();
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseAddNullLeft() {
    Node add = new TestNode(Token.ADD);
    Node left = new TestNode(Token.NUMBER);
    left.setJSType(null);
    Node right = new TestNode(Token.NUMBER);
    right.setJSType(registry.getNativeType(NUMBER_TYPE));
    add.addChild(left);
    add.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(add, entry);
    JSType result = add.getJSType();
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseCallFunctionType() {
    Node call = new TestNode(Token.CALL);
    Node left = new TestNode(Token.NAME);
    Node fnNode = new TestNode(Token.FUNCTION);
    left.setJSType(registry.createFunctionType(
        registry.getNativeType(STRING_TYPE), Lists.<Node>newArrayList()));
    left.addChild(fnNode);
    call.addChild(left);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(call, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseCallCheckedUnknown() {
    Node call = new TestNode(Token.CALL);
    Node left = new TestNode(Token.NAME);
    left.setJSType(registry.getNativeType(CHECKED_UNKNOWN_TYPE));
    call.addChild(left);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(call, entry);
    Assert.assertNotNull(result);
    Assert.assertEquals(registry.getNativeType(CHECKED_UNKNOWN_TYPE), call.getJSType());
  }

  @Test
  public void testTraverseHook() {
    Node hook = new TestNode(Token.HOOK);
    Node cond = new TestNode(Token.TRUE);
    cond.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Node trueNode = new TestNode(Token.NUMBER);
    trueNode.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node falseNode = new TestNode(Token.STRING);
    falseNode.setJSType(registry.getNativeType(STRING_TYPE));
    hook.addChild(cond);
    hook.addChild(trueNode);
    hook.addChild(falseNode);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(hook, entry);
    JSType result = hook.getJSType();
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseAnd() {
    Node andNode = new TestNode(Token.AND);
    Node left = new TestNode(Token.TRUE);
    left.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Node right = new TestNode(Token.TRUE);
    right.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    andNode.addChild(left);
    andNode.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(andNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseOr() {
    Node orNode = new TestNode(Token.OR);
    Node left = new TestNode(Token.TRUE);
    left.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Node right = new TestNode(Token.TRUE);
    right.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    orNode.addChild(left);
    orNode.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(orNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseNewConstructor() {
    Node newExpr = new TestNode(Token.NEW);
    Node constructor = new TestNode(Token.NAME);
    constructor.setString("Object");
    FunctionType ctorType = registry.createConstructorType(
        Lists.<Node>newArrayList(), registry.getNativeType(UNKNOWN_TYPE));
    constructor.setJSType(ctorType);
    newExpr.addChild(constructor);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(newExpr, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseNewUnknownConstructor() {
    Node newExpr = new TestNode(Token.NEW);
    Node constructor = new TestNode(Token.NAME);
    constructor.setString("UnknownThing");
    constructor.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    newExpr.addChild(constructor);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(newExpr, entry);
    Assert.assertNotNull(result);
    Assert.assertEquals(registry.getNativeType(UNKNOWN_TYPE), newExpr.getJSType());
  }

  @Test
  public void testTraverseNewNullConstructorType() {
    Node newExpr = new TestNode(Token.NEW);
    Node constructor = new TestNode(Token.NAME);
    constructor.setString("NullTypeThing");
    constructor.setJSType(null);
    newExpr.addChild(constructor);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(newExpr, entry);
    Assert.assertNotNull(result);
    Assert.assertNull(newExpr.getJSType());
  }

  @Test
  public void testTraverseObjectLiteralNullType() {
    Node objLit = new TestNode(Token.OBJECTLIT);
    objLit.setJSType(null);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(objLit, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseArrayLiteral() {
    Node arr = new TestNode(Token.ARRAYLIT);
    Node elem = new TestNode(Token.NUMBER);
    elem.setJSType(registry.getNativeType(NUMBER_TYPE));
    arr.addChild(elem);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(arr, entry);
    JSType result = arr.getJSType();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isArrayType() || result.isUnknownType());
  }

  @Test
  public void testTraverseReturnWithFunctionType() {
    Node ret = new TestNode(Token.RETURN);
    Node retValue = new TestNode(Token.NUMBER);
    retValue.setJSType(registry.getNativeType(NUMBER_TYPE));
    ret.addChild(retValue);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(ret, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseReturnNullValue() {
    Node ret = new TestNode(Token.RETURN);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(ret, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseCatchWithJSDoc() {
    Node catchNode = new TestNode(Token.CATCH);
    Node name = new TestNode(Token.NAME);
    name.setString("e");
    JSDocInfo info = new JSDocInfo();
    info.setType(registry.createNativeTypeReference("string"));
    name.setJSDocInfo(info);
    catchNode.addChild(name);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(catchNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseCatchWithoutJSDoc() {
    Node catchNode = new TestNode(Token.CATCH);
    Node name = new TestNode(Token.NAME);
    name.setString("e");
    catchNode.addChild(name);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(catchNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseGetProp() {
    Node getProp = new TestNode(Token.GETPROP);
    Node obj = new TestNode(Token.NAME);
    obj.setString("obj");
    obj.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node prop = new TestNode(Token.STRING);
    prop.setString("propName");
    getProp.addChild(obj);
    getProp.addChild(prop);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(getProp, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseGetElem() {
    Node getElem = new TestNode(Token.GETELEM);
    Node obj = new TestNode(Token.NAME);
    obj.setString("arr");
    obj.setJSType(registry.getNativeType(ARRAY_TYPE));
    Node index = new TestNode(Token.NUMBER);
    index.setJSType(registry.getNativeType(NUMBER_TYPE));
    getElem.addChild(obj);
    getElem.addChild(index);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(getElem, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraversePos() {
    Node pos = new TestNode(Token.POS);
    Node child = new TestNode(Token.NUMBER);
    child.setJSType(registry.getNativeType(NUMBER_TYPE));
    pos.addChild(child);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(pos, entry);
    JSType result = pos.getJSType();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isNumberType() || result.isUnknownType());
  }

  @Test
  public void testTraverseNeg() {
    Node neg = new TestNode(Token.NEG);
    Node child = new TestNode(Token.NUMBER);
    child.setJSType(registry.getNativeType(NUMBER_TYPE));
    neg.addChild(child);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(neg, entry);
    JSType result = neg.getJSType();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isNumberType() || result.isUnknownType());
  }

  @Test
  public void testTraverseThis() {
    Node thisNode = new TestNode(Token.THIS);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(thisNode, entry);
    JSType result = thisNode.getJSType();
    Assert.assertNotNull(result);
  }

  @Test
  public void testTraverseTypeof() {
    Node typeof = new TestNode(Token.TYPEOF);
    Node child = new TestNode(Token.NAME);
    child.setString("x");
    child.setJSType(registry.getNativeType(STRING_TYPE));
    typeof.addChild(child);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(typeof, entry);
    JSType result = typeof.getJSType();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isStringType() || result.isUnknownType());
  }

  @Test
  public void testBooleanOpsSetBooleanType() {
    int[] booleanTokens = {Token.LT, Token.LE, Token.GT, Token.GE, Token.NOT,
        Token.EQ, Token.NE, Token.SHEQ, Token.SHNE, Token.INSTANCEOF, Token.IN,
        Token.DELPROP};
    for (int tok : booleanTokens) {
      Node n = new TestNode(tok);
      Node left = new TestNode(Token.NUMBER);
      left.setJSType(registry.getNativeType(NUMBER_TYPE));
      Node right = new TestNode(Token.NUMBER);
      right.setJSType(registry.getNativeType(NUMBER_TYPE));
      n.addChild(left);
      n.addChild(right);
      FlowScope entry = inference.createEntryLattice();
      inference.flowThrough(n, entry);
      JSType result = n.getJSType();
      Assert.assertNotNull("No type set for token " + tok, result);
    }
  }

  @Test
  public void testCommaOp() {
    Node comma = new TestNode(Token.COMMA);
    Node left = new TestNode(Token.NUMBER);
    left.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node right = new TestNode(Token.STRING);
    right.setJSType(registry.getNativeType(STRING_TYPE));
    comma.addChild(left);
    comma.addChild(right);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(comma, entry);
    JSType result = comma.getJSType();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isStringType() || result.isUnionType() || result.isUnknownType());
  }

  @Test
  public void testParamList() {
    Node paramList = new TestNode(Token.PARAM_LIST);
    Node param = new TestNode(Token.NAME);
    param.setString("x");
    param.setJSType(registry.getNativeType(NUMBER_TYPE));
    paramList.addChild(param);
    FlowScope entry = inference.createEntryLattice();
    inference.flowThrough(paramList, entry);
    JSType result = paramList.getJSType();
    Assert.assertNotNull(result);
  }

  @Test
  public void testSwitch() {
    Node switchNode = new TestNode(Token.SWITCH);
    Node condition = new TestNode(Token.NAME);
    condition.setString("x");
    condition.setJSType(registry.getNativeType(NUMBER_TYPE));
    switchNode.addChild(condition);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(switchNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testVar() {
    Node varNode = new TestNode(Token.VAR);
    Node name = new TestNode(Token.NAME);
    name.setString("x");
    Node init = new TestNode(Token.NUMBER);
    init.setJSType(registry.getNativeType(NUMBER_TYPE));
    varNode.addChild(name);
    name.addChild(init);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(varNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testThrow() {
    Node throwNode = new TestNode(Token.THROW);
    Node err = new TestNode(Token.NAME);
    err.setString("e");
    err.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    throwNode.addChild(err);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(throwNode, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testExprResultGetProp() {
    Node expr = new TestNode(Token.EXPR_RESULT);
    Node getProp = new TestNode(Token.GETPROP);
    Node obj = new TestNode(Token.NAME);
    obj.setJSType(registry.createObjectType("TestObj", registry.getNativeType(UNKNOWN_TYPE)));
    Node prop = new TestNode(Token.STRING);
    prop.setString("p");
    getProp.addChild(obj);
    getProp.addChild(prop);
    expr.addChild(getProp);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(expr, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testCastWithJSDocInfo() {
    Node cast = new TestNode(Token.CAST);
    Node child = new TestNode(Token.NUMBER);
    child.setJSType(registry.getNativeType(NUMBER_TYPE));
    cast.addChild(child);
    JSDocInfo info = new JSDocInfo();
    info.setType(registry.createNativeTypeReference("string"));
    cast.setJSDocInfo(info);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(cast, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testCastWithoutJSDocInfo() {
    Node cast = new TestNode(Token.CAST);
    Node child = new TestNode(Token.NUMBER);
    child.setJSType(registry.getNativeType(NUMBER_TYPE));
    cast.addChild(child);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(cast, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testTightenTypesAfterAssertionsNullSpec() {
    Node call = new TestNode(Token.CALL);
    Node left = new TestNode(Token.NAME);
    left.setString("assertDefined");
    left.setJSType(registry.createFunctionType(
        registry.getNativeType(UNKNOWN_TYPE), Lists.<Node>newArrayList()));
    left.setQualifiedName("assertDefined");
    Node param = new TestNode(Token.NAME);
    param.setString("x");
    param.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    call.addChild(left);
    call.addChild(param);
    FlowScope entry = inference.createEntryLattice();
    FlowScope result = inference.flowThrough(call, entry);
    Assert.assertNotNull(result);
  }

  @Test
  public void testIsAddedAsNumberWithVoid() {
    JSType voidType = registry.getNativeType(VOID_TYPE);
    Assert.assertTrue(inference.isAddedAsNumber(voidType));
  }

  @Test
  public void testIsAddedAsNumberWithNull() {
    JSType nullType = registry.getNativeType(NULL_TYPE);
    Assert.assertTrue(inference.isAddedAsNumber(nullType));
  }

  @Test
  public void testIsAddedAsNumberWithBoolean() {
    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);
    Assert.assertTrue(inference.isAddedAsNumber(boolType));
  }

  @Test
  public void testIsAddedAsNumberWithNumber() {
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    Assert.assertTrue(inference.isAddedAsNumber(numType));
  }

  @Test
  public void testIsAddedAsNumberWithString() {
    JSType strType = registry.getNativeType(STRING_TYPE);
    Assert.assertFalse(inference.isAddedAsNumber(strType));
  }

  @Test
  public void testGetJSTypeReturnsUnknownOnNull() {
    Node n = new TestNode(Token.NUMBER);
    n.setJSType(null);
    Assert.assertEquals(registry.getNativeType(UNKNOWN_TYPE), inference.getJSType(n));
  }

  @Test
  public void testGetJSTypeReturnsActualType() {
    Node n = new TestNode(Token.NUMBER);
    n.setJSType(registry.getNativeType(NUMBER_TYPE));
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE), inference.getJSType(n));
  }

  @Test
  public void testGetNativeType() {
    JSType result = inference.getNativeType(NUMBER_TYPE);
    Assert.assertNotNull(result);
    Assert.assertEquals(registry.getNativeType(NUMBER_TYPE), result);
  }

  @Test
  public void testBranchedFlowThroughOnTrue() {
    Node source = new TestNode(Token.IF);
    FlowScope entry = inference.createEntryLattice();
    List<FlowScope> scopes = inference.branchedFlowThrough(source, entry);
    Assert.assertNotNull(scopes);
    Assert.assertTrue(scopes.size() >= 2);
  }
}
