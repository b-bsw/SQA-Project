package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.UnionType;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.jstype.BooleanLiteralSet;

public class TypeInferenceTest {

  private AbstractCompiler compiler;
  private JSTypeRegistry registry;
  private ControlFlowGraph<Node> cfg;
  private ReverseAbstractInterpreter reverseInterpreter;
  private Scope functionScope;
  private Map<String, AssertionFunctionSpec> assertionFunctionsMap;
  private TypeInference inference;

  private Node stringTypeNode;
  private Node numberTypeNode;
  private Node booleanTypeNode;
  private Node voidTypeNode;
  private Node unknownTypeNode;

  @Before
  public void setUp() {
    compiler = new CompilerForTest();
    registry = compiler.getTypeRegistry();

    stringTypeNode = new Node(Token.STRING);
    stringTypeNode.setJSType(registry.getNativeType(STRING_TYPE));

    numberTypeNode = new Node(Token.NUMBER);
    numberTypeNode.setJSType(registry.getNativeType(NUMBER_TYPE));

    booleanTypeNode = new Node(Token.TRUE);
    booleanTypeNode.setJSType(registry.getNativeType(BOOLEAN_TYPE));

    voidTypeNode = new Node(Token.VOID);
    voidTypeNode.setJSType(registry.getNativeType(VOID_TYPE));

    unknownTypeNode = new Node(Token.NAME);
    unknownTypeNode.setJSType(registry.getNativeType(UNKNOWN_TYPE));

    reverseInterpreter = new ReverseAbstractInterpreterForTest(registry);
    functionScope = createTestScope();
    assertionFunctionsMap = new HashMap<String, AssertionFunctionSpec>();
    cfg = createTestCFG();

    inference = new TypeInference(compiler, cfg, reverseInterpreter, functionScope, assertionFunctionsMap);
  }

  @After
  public void tearDown() {
    inference = null;
    compiler = null;
    registry = null;
    cfg = null;
    reverseInterpreter = null;
    functionScope = null;
    assertionFunctionsMap = null;
  }

  private Scope createTestScope() {
    Node root = new Node(Token.BLOCK);
    root.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    return new ScopeForTest(compiler, root);
  }

  private ControlFlowGraph<Node> createTestCFG() {
    Node entryNode = new Node(Token.BLOCK);
    ControlFlowGraph<Node> g = new ControlFlowGraph<Node>(entryNode, true);
    return g;
  }

  @Test
  public void testCreateInitialEstimateLatticeReturnsBottomScope() {
    FlowScope result = inference.createInitialEstimateLattice();
    assertNotNull(result);
    assertEquals(bottomScope(result), result);
  }

  @Test
  public void testCreateEntryLatticeReturnsFunctionScope() {
    FlowScope result = inference.createEntryLattice();
    assertNotNull(result);
  }

  @Test
  public void testFlowThroughNullInputReturnsInput() {
    FlowScope bottom = inference.createInitialEstimateLattice();
    Node n = new Node(Token.NAME, "x");
    FlowScope result = inference.flowThrough(n, bottom);
    assertSame(bottom, result);
  }

  @Test
  public void testFlowThroughWithNameNode() {
    FlowScope input = inference.createEntryLattice();
    Node nameNode = new Node(Token.NAME, "x");
    FlowScope result = inference.flowThrough(nameNode, input);
    assertNotNull(result);
    assertNotSame(input, result);
  }

  @Test
  public void testTraverseNameWithValue() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node name = new Node(Token.NAME, "x");
    Node value = new Node(Token.NUMBER, 42);
    value.setJSType(registry.getNativeType(NUMBER_TYPE));
    name.addChildToFront(value);
    scope = inference.traverse(name, scope);
    assertNotNull(scope);
    JSType type = name.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(NUMBER_TYPE)));
  }

  @Test
  public void testTraverseNameWithoutValueUnknownType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node name = new Node(Token.NAME, "undefinedVar");
    scope = inference.traverse(name, scope);
    JSType type = name.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseAssign() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.NAME, "x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    left.setJSType(numType);
    Node right = new Node(Token.NUMBER, 42);
    right.setJSType(numType);
    assign.addChildToFront(left);
    assign.addChildToFront(right);
    scope = inference.traverse(assign, scope);
    JSType resultType = assign.getJSType();
    assertNotNull(resultType);
    assertTrue(resultType.isSubtype(numType));
  }

  @Test
  public void testTraverseNumberLiteralSetsNumberType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node pos = new Node(Token.POS);
    pos.addChildToFront(new Node(Token.NUMBER, 1));
    scope = inference.traverse(pos, scope);
    JSType type = pos.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(NUMBER_TYPE)));
  }

  @Test
  public void testTraverseArrayLiteral() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node arr = new Node(Token.ARRAYLIT);
    arr.addChildToFront(new Node(Token.NUMBER, 1));
    arr.addChildToFront(new Node(Token.STRING, "a"));
    scope = inference.traverse(arr, scope);
    JSType type = arr.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(ARRAY_TYPE)));
  }

  @Test
  public void testTraverseThis() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node thisNode = new Node(Token.THIS, "this");
    scope = inference.traverse(thisNode, scope);
    JSType type = thisNode.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseNot() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node not = new Node(Token.NOT);
    not.addChildToFront(new Node(Token.TRUE));
    scope = inference.traverse(not, scope);
    JSType type = not.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(BOOLEAN_TYPE)));
  }

  @Test
  public void testTraverseEq() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node eq = new Node(Token.EQ);
    eq.addChildToFront(new Node(Token.NUMBER, 1));
    eq.addChildToFront(new Node(Token.NUMBER, 2));
    scope = inference.traverse(eq, scope);
    JSType type = eq.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(BOOLEAN_TYPE)));
  }

  @Test
  public void testTraverseTypeof() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node typeof = new Node(Token.TYPEOF);
    typeof.addChildToFront(new Node(Token.NAME, "x"));
    scope = inference.traverse(typeof, scope);
    JSType type = typeof.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(STRING_TYPE)));
  }

  @Test
  public void testTraverseAddBothStrings() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node add = new Node(Token.ADD);
    Node left = new Node(Token.STRING, "hello");
    left.setJSType(registry.getNativeType(STRING_TYPE));
    Node right = new Node(Token.STRING, "world");
    right.setJSType(registry.getNativeType(STRING_TYPE));
    add.addChildToFront(left);
    add.addChildToFront(right);
    scope = inference.traverse(add, scope);
    JSType type = add.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(STRING_TYPE)));
  }

  @Test
  public void testTraverseAddBothNumbers() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node add = new Node(Token.ADD);
    Node left = new Node(Token.NUMBER, 1);
    left.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node right = new Node(Token.NUMBER, 2);
    right.setJSType(registry.getNativeType(NUMBER_TYPE));
    add.addChildToFront(left);
    add.addChildToFront(right);
    scope = inference.traverse(add, scope);
    JSType type = add.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(NUMBER_TYPE)));
  }

  @Test
  public void testTraverseAddNumberAndString() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node add = new Node(Token.ADD);
    Node left = new Node(Token.NUMBER, 1);
    left.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node right = new Node(Token.STRING, "foo");
    right.setJSType(registry.getNativeType(STRING_TYPE));
    add.addChildToFront(left);
    add.addChildToFront(right);
    scope = inference.traverse(add, scope);
    JSType type = add.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(STRING_TYPE)));
  }

  @Test
  public void testTraverseAddBothUnknown() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node add = new Node(Token.ADD);
    Node left = new Node(Token.NAME, "a");
    left.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node right = new Node(Token.NAME, "b");
    right.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    add.addChildToFront(left);
    add.addChildToFront(right);
    scope = inference.traverse(add, scope);
    JSType type = add.getJSType();
    assertNotNull(type);
    assertTrue(type.isUnknownType());
  }

  @Test
  public void testTraverseAddOneUnknown() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node add = new Node(Token.ADD);
    Node left = new Node(Token.NAME, "a");
    left.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node right = new Node(Token.NUMBER, 1);
    right.setJSType(registry.getNativeType(NUMBER_TYPE));
    add.addChildToFront(left);
    add.addChildToFront(right);
    scope = inference.traverse(add, scope);
    JSType type = add.getJSType();
    assertNotNull(type);
    assertTrue(type.isUnknownType());
  }

  @Test
  public void testTraverseAddNullAndVoid() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node add = new Node(Token.ADD);
    Node left = new Node(Token.NULL);
    left.setJSType(registry.getNativeType(JSTypeNative.NULL_TYPE));
    Node right = new Node(Token.VOID);
    right.setJSType(registry.getNativeType(VOID_TYPE));
    add.addChildToFront(left);
    add.addChildToFront(right);
    scope = inference.traverse(add, scope);
    JSType type = add.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testIsAddedAsNumberWithVoidType() {
    JSType voidType = registry.getNativeType(VOID_TYPE);
    assertTrue(inference.isAddedAsNumber(voidType));
  }

  @Test
  public void testIsAddedAsNumberWithNullType() {
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    assertTrue(inference.isAddedAsNumber(nullType));
  }

  @Test
  public void testIsAddedAsNumberWithBooleanType() {
    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);
    assertTrue(inference.isAddedAsNumber(boolType));
  }

  @Test
  public void testIsAddedAsNumberWithStringType() {
    JSType stringType = registry.getNativeType(STRING_TYPE);
    assertFalse(inference.isAddedAsNumber(stringType));
  }

  @Test
  public void testTraverseHook() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node hook = new Node(Token.HOOK);
    Node cond = new Node(Token.TRUE);
    cond.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Node trueNode = new Node(Token.NUMBER, 1);
    trueNode.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node falseNode = new Node(Token.STRING, "no");
    falseNode.setJSType(registry.getNativeType(STRING_TYPE));
    hook.addChildToFront(cond);
    hook.addChildToFront(trueNode);
    hook.addChildToFront(falseNode);
    scope = inference.traverse(hook, scope);
    JSType type = hook.getJSType();
    assertNotNull(type);
    assertTrue(type.isUnionType());
  }

  @Test
  public void testTraverseHookBothNull() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node hook = new Node(Token.HOOK);
    Node cond = new Node(Token.TRUE);
    cond.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Node trueNode = new Node(Token.NUMBER, 1);
    Node falseNode = new Node(Token.STRING, "no");
    hook.addChildToFront(cond);
    hook.addChildToFront(trueNode);
    hook.addChildToFront(falseNode);
    scope = inference.traverse(hook, scope);
    assertNull(hook.getJSType());
  }

  @Test
  public void testTraverseCallWithFunctionType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node call = new Node(Token.CALL);
    Node target = new Node(Token.NAME, "fn");
    JSType fnType = registry.getNativeType(JSTypeNative.FUNCTION_TYPE);
    if (fnType == null) {
      fnType = registry.getNativeType(UNKNOWN_TYPE);
    }
    target.setJSType(fnType);
    call.addChildToFront(target);
    scope = inference.traverse(call, scope);
    assertNotNull(call.getJSType());
  }

  @Test
  public void testTraverseCallWithCheckedUnknown() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node call = new Node(Token.CALL);
    Node target = new Node(Token.NAME, "fn");
    target.setJSType(registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE));
    call.addChildToFront(target);
    scope = inference.traverse(call, scope);
    JSType result = call.getJSType();
    assertNotNull(result);
    assertTrue(result.isEquivalentTo(registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE)));
  }

  @Test
  public void testTraverseNew() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node newNode = new Node(Token.NEW);
    Node constructor = new Node(Token.NAME, "ctor");
    constructor.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    newNode.addChildToFront(constructor);
    scope = inference.traverse(newNode, scope);
    JSType type = newNode.getJSType();
    assertNotNull(type);
    assertTrue(type.isUnknownType());
  }

  @Test
  public void testTraverseComma() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node comma = new Node(Token.COMMA);
    Node first = new Node(Token.NUMBER, 1);
    first.setJSType(registry.getNativeType(NUMBER_TYPE));
    Node second = new Node(Token.STRING, "last");
    second.setJSType(registry.getNativeType(STRING_TYPE));
    comma.addChildToFront(first);
    comma.addChildToFront(second);
    scope = inference.traverse(comma, scope);
    JSType type = comma.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(STRING_TYPE)));
  }

  @Test
  public void testTraverseParamList() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node paramList = new Node(Token.PARAM_LIST);
    Node param = new Node(Token.NAME, "x");
    param.setJSType(registry.getNativeType(NUMBER_TYPE));
    paramList.addChildToFront(param);
    scope = inference.traverse(paramList, scope);
    JSType type = paramList.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(NUMBER_TYPE)));
  }

  @Test
  public void testTraverseCatchWithJSDoc() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node catchNode = new Node(Token.CATCH);
    Node name = new Node(Token.NAME, "e");
    JSDocInfo info = new JSDocInfo();
    info.setType(registry.getNativeType(STRING_TYPE));
    name.setJSDocInfo(info);
    catchNode.addChildToFront(name);
    scope = inference.traverse(catchNode, scope);
    JSType type = name.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseCatchWithoutJSDoc() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node catchNode = new Node(Token.CATCH);
    Node name = new Node(Token.NAME, "e");
    catchNode.addChildToFront(name);
    scope = inference.traverse(catchNode, scope);
    JSType type = name.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseReturnWithType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node ret = new Node(Token.RETURN);
    Node val = new Node(Token.NUMBER, 42);
    val.setJSType(registry.getNativeType(NUMBER_TYPE));
    ret.addChildToFront(val);
    scope = inference.traverse(ret, scope);
    assertNotNull(scope);
  }

  @Test
  public void testTraverseReturnNullValue() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node ret = new Node(Token.RETURN);
    scope = inference.traverse(ret, scope);
    assertNotNull(scope);
  }

  @Test
  public void testTraverseAnd() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node andNode = new Node(Token.AND);
    Node left = new Node(Token.TRUE);
    left.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Node right = new Node(Token.FALSE);
    right.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    andNode.addChildToFront(left);
    andNode.addChildToFront(right);
    scope = inference.traverse(andNode, scope);
    assertNotNull(scope);
    JSType type = andNode.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseOr() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node orNode = new Node(Token.OR);
    Node left = new Node(Token.TRUE);
    left.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    Node right = new Node(Token.FALSE);
    right.setJSType(registry.getNativeType(BOOLEAN_TYPE));
    orNode.addChildToFront(left);
    orNode.addChildToFront(right);
    scope = inference.traverse(orNode, scope);
    assertNotNull(scope);
    JSType type = orNode.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseGetProp() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    JSType objType = registry.getNativeType(UNKNOWN_TYPE);
    obj.setJSType(objType);
    Node prop = new Node(Token.STRING, "prop");
    prop.setString("prop");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    scope = inference.traverse(getprop, scope);
    JSType type = getprop.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseGetElem() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node getelem = new Node(Token.GETELEM);
    Node obj = new Node(Token.NAME, "arr");
    obj.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node index = new Node(Token.NUMBER, 0);
    index.setJSType(registry.getNativeType(NUMBER_TYPE));
    getelem.addChildToFront(obj);
    getelem.addChildToFront(index);
    scope = inference.traverse(getelem, scope);
    JSType type = getelem.getJSType();
    assertNotNull(type);
  }

  @Test
  public void testTraverseGetPropNullPropertyType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    obj.setJSType(null);
    Node prop = new Node(Token.STRING, "missing");
    prop.setString("missing");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    scope = inference.traverse(getprop, scope);
    JSType type = getprop.getJSType();
    assertNotNull(type);
    assertTrue(type.isUnknownType());
  }

  @Test
  public void testUpdateScopeForTypeChangeName() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node name = new Node(Token.NAME, "x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    inference.updateScopeForTypeChange(scope, name, null, numType);
    assertNotNull(scope.getSlot("x"));
  }

  @Test
  public void testRedeclareSimpleVarWithNullType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node name = new Node(Token.NAME, "y");
    inference.redeclareSimpleVar(scope, name, null);
    assertNotNull(scope.getSlot("y"));
  }

  @Test
  public void testTightenTypesAfterAssertionsNoMatch() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node call = new Node(Token.CALL);
    Node target = new Node(Token.NAME, "nonAssert");
    target.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    call.addChildToFront(target);
    FlowScope result = inference.tightenTypesAfterAssertions(scope, call);
    assertSame(scope, result);
  }

  @Test
  public void testNarrowScopeWithThisNode() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node thisNode = new Node(Token.THIS, "this");
    FlowScope result = inference.narrowScope(scope, thisNode, registry.getNativeType(NUMBER_TYPE));
    assertSame(scope, result);
  }

  @Test
  public void testNarrowScopeWithGetProp() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    obj.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node prop = new Node(Token.STRING, "x");
    prop.setString("x");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    FlowScope result = inference.narrowScope(scope, getprop, registry.getNativeType(NUMBER_TYPE));
    assertNotNull(result);
  }

  @Test
  public void testNarrowScopeWithName() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node name = new Node(Token.NAME, "z");
    FlowScope result = inference.narrowScope(scope, name, registry.getNativeType(NUMBER_TYPE));
    assertNotNull(result);
    assertNotSame(scope, result);
  }

  @Test
  public void testGetBooleanOutcomesLeftOnly() {
    BooleanLiteralSet left = BooleanLiteralSet.TRUE;
    BooleanLiteralSet right = BooleanLiteralSet.FALSE;
    boolean condition = true;
    BooleanLiteralSet result = TypeInference.getBooleanOutcomes(left, right, condition);
    assertNotNull(result);
  }

  @Test
  public void testGetBooleanOutcomesBothFalse() {
    BooleanLiteralSet left = BooleanLiteralSet.FALSE;
    BooleanLiteralSet right = BooleanLiteralSet.FALSE;
    boolean condition = false;
    BooleanLiteralSet result = TypeInference.getBooleanOutcomes(left, right, condition);
    assertNotNull(result);
  }

  @Test
  public void testInferPropertyTypesToMatchConstraintBothNull() {
    TypeInference.inferPropertyTypesToMatchConstraint(null, null);
  }

  @Test
  public void testInferPropertyTypesToMatchConstraintTypeNull() {
    JSType constraint = registry.getNativeType(NUMBER_TYPE);
    TypeInference.inferPropertyTypesToMatchConstraint(null, constraint);
  }

  @Test
  public void testInferPropertyTypesToMatchConstraintConstraintNull() {
    JSType type = registry.getNativeType(NUMBER_TYPE);
    TypeInference.inferPropertyTypesToMatchConstraint(type, null);
  }

  @Test
  public void testInferPropertyTypesToMatchConstraintNormal() {
    JSType type = registry.getNativeType(STRING_TYPE);
    JSType constraint = registry.getNativeType(NUMBER_TYPE);
    TypeInference.inferPropertyTypesToMatchConstraint(type, constraint);
  }

  @Test
  public void testDereferencePointerNotQualifiedName() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node n = new Node(Token.NUMBER, 1);
    FlowScope result = inference.dereferencePointer(n, scope);
    assertSame(scope, result);
  }

  @Test
  public void testEnsurePropertyDeclaredHelperNullOwner() {
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    obj.setJSType(null);
    Node prop = new Node(Token.STRING, "p");
    prop.setString("p");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    boolean result = inference.ensurePropertyDeclaredHelper(getprop, null);
    assertFalse(result);
  }

  @Test
  public void testEnsurePropertyDefinedNullObjectType() {
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    obj.setJSType(null);
    Node prop = new Node(Token.STRING, "p");
    prop.setString("p");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    inference.ensurePropertyDefined(getprop, registry.getNativeType(NUMBER_TYPE));
  }

  @Test
  public void testResolvedTemplateTypeFirstTime() {
    Map<TemplateType, JSType> map = new HashMap<TemplateType, JSType>();
    TemplateType tt = registry.getNativeType(UNKNOWN_TYPE).toMaybeTemplateType();
    if (tt == null) {
      return;
    }
    JSType resolved = registry.getNativeType(NUMBER_TYPE);
    TypeInference.resolvedTemplateType(map, tt, resolved);
    assertSame(resolved, map.get(tt));
  }

  @Test
  public void testResolvedTemplateTypeWithUnknown() {
    Map<TemplateType, JSType> map = new HashMap<TemplateType, JSType>();
    TemplateType tt = registry.getNativeType(UNKNOWN_TYPE).toMaybeTemplateType();
    if (tt == null) {
      return;
    }
    TypeInference.resolvedTemplateType(map, tt, registry.getNativeType(UNKNOWN_TYPE));
    assertNull(map.get(tt));
  }

  @Test
  public void testGetPropertyTypeFromVar() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    obj.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node prop = new Node(Token.STRING, "p");
    prop.setString("p");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    JSType result = inference.getPropertyType(obj.getJSType(), "p", getprop, scope);
    assertNotNull(result);
  }

  @Test
  public void testGetPropertyTypeQualifiedNameInScope() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "SomeClass");
    obj.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node prop = new Node(Token.STRING, "prototype");
    prop.setString("prototype");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    JSType result = inference.getPropertyType(obj.getJSType(), "prototype", getprop, scope);
    assertNotNull(result);
  }

  @Test
  public void testTraverseThrow() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node throwNode = new Node(Token.THROW);
    Node err = new Node(Token.NEW);
    err.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    throwNode.addChildToFront(err);
    scope = inference.traverse(throwNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testTraverseVar() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node varNode = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "x");
    name.setJSType(registry.getNativeType(NUMBER_TYPE));
    varNode.addChildToFront(name);
    scope = inference.traverse(varNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testTraverseExprResultWithGetProp() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    obj.setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node prop = new Node(Token.STRING, "p");
    prop.setString("p");
    getprop.addChildToFront(obj);
    getprop.addChildToFront(prop);
    exprResult.addChildToFront(getprop);
    scope = inference.traverse(exprResult, scope);
    assertNotNull(scope);
  }

  @Test
  public void testTraverseSwitch() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node switchNode = new Node(Token.SWITCH);
    Node cond = new Node(Token.NAME, "x");
    cond.setJSType(registry.getNativeType(NUMBER_TYPE));
    switchNode.addChildToFront(cond);
    scope = inference.traverse(switchNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testTraverseCast() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node cast = new Node(Token.CAST);
    Node inner = new Node(Token.NAME, "x");
    inner.setJSType(registry.getNativeType(NUMBER_TYPE));
    cast.addChildToFront(inner);
    JSDocInfo info = new JSDocInfo();
    info.setType(registry.getNativeType(STRING_TYPE));
    cast.setJSDocInfo(info);
    scope = inference.traverse(cast, scope);
    JSType type = cast.getJSType();
    assertNotNull(type);
    assertTrue(type.isSubtype(registry.getNativeType(STRING_TYPE)));
  }

  @Test
  public void testTraverseCastWithoutJSDoc() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    Node cast = new Node(Token.CAST);
    Node inner = new Node(Token.NAME, "x");
    inner.setJSType(registry.getNativeType(NUMBER_TYPE));
    cast.addChildToFront(inner);
    scope = inference.traverse(cast, scope);
    JSType type = cast.getJSType();
    assertNull(type);
  }

  @Test
  public void testBooleanOutcomePairGetJoinedFlowScopeSame() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    BooleanOutcomePair pair = inference.new BooleanOutcomePair(
        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, scope, scope);
    FlowScope joined = pair.getJoinedFlowScope();
    assertSame(scope, joined);
  }

  @Test
  public void testBooleanOutcomePairGetJoinedFlowScopeDifferent() {
    FlowScope left = inference.createEntryLattice().createChildFlowScope();
    FlowScope right = inference.createEntryLattice().createChildFlowScope();
    BooleanOutcomePair pair = inference.new BooleanOutcomePair(
        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, left, right);
    FlowScope joined = pair.getJoinedFlowScope();
    assertNotNull(joined);
  }

  @Test
  public void testBooleanOutcomePairGetOutcomeScopeAndTrue() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    BooleanOutcomePair pair = inference.new BooleanOutcomePair(
        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, scope, scope);
    FlowScope result = pair.getOutcomeFlowScope(Token.AND, true);
    assertSame(scope, result);
  }

  @Test
  public void testBooleanOutcomePairGetOutcomeScopeOrFalse() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    BooleanOutcomePair pair = inference.new BooleanOutcomePair(
        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, scope, scope);
    FlowScope result = pair.getOutcomeFlowScope(Token.OR, false);
    assertSame(scope, result);
  }

  @Test
  public void testBooleanOutcomePairGetOutcomeScopeJoined() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    BooleanOutcomePair pair = inference.new BooleanOutcomePair(
        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, scope, scope);
    FlowScope result = pair.getOutcomeFlowScope(Token.AND, false);
    assertSame(scope, result);
  }

  @Test
  public void testNewBooleanOutcomePairWithNullType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    BooleanOutcomePair pair = inference.newBooleanOutcomePair(null, scope);
    assertNotNull(pair);
    assertEquals(BooleanLiteralSet.BOTH, pair.toBooleanOutcomes);
  }

  @Test
  public void testNewBooleanOutcomePairWithBooleanSubtype() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);
    BooleanOutcomePair pair = inference.newBooleanOutcomePair(boolType, scope);
    assertNotNull(pair);
    assertEquals(BooleanLiteralSet.BOTH, pair.booleanValues);
  }

  @Test
  public void testNewBooleanOutcomePairWithNonBooleanType() {
    FlowScope scope = inference.createEntryLattice().createChildFlowScope();
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    BooleanOutcomePair pair = inference.newBooleanOutcomePair(numType, scope);
    assertNotNull(pair);
    assertEquals(BooleanLiteralSet.EMPTY, pair.booleanValues);
  }

  @Test
  public void testGetBooleanOutcomePair() {
    FlowScope leftScope = inference.createEntryLattice().createChildFlowScope();
    FlowScope rightScope = inference.createEntryLattice().createChildFlowScope();
    BooleanOutcomePair left = new BooleanOutcomePairForTest(
        BooleanLiteralSet.TRUE, BooleanLiteralSet.TRUE, leftScope, rightScope);
    BooleanOutcomePair right = new BooleanOutcomePairForTest(
        BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, leftScope, rightScope);
    BooleanOutcomePair result = inference.getBooleanOutcomePair(left, right, true);
    assertNotNull(result);
  }

  private FlowScope bottomScope(FlowScope s) {
    return inference.createInitialEstimateLattice();
  }

  private static class BooleanOutcomePairForTest {
    final BooleanLiteralSet toBooleanOutcomes;
    final BooleanLiteralSet booleanValues;
    final FlowScope leftScope;
    final FlowScope rightScope;

    BooleanOutcomePairForTest(
        BooleanLiteralSet toBooleanOutcomes, BooleanLiteralSet booleanValues,
        FlowScope leftScope, FlowScope rightScope) {
      this.toBooleanOutcomes = toBooleanOutcomes;
      this.booleanValues = booleanValues;
      this.leftScope = leftScope;
      this.rightScope = rightScope;
    }
  }
}
