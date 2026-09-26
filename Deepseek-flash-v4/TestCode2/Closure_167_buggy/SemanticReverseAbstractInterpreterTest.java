package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.common.base.Function;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.Visitor;

import org.junit.Before;
import org.junit.Test;

public class SemanticReverseAbstractInterpreterTest {

  private static class TestCodingConvention extends CodingConvention {
    @Override
    public boolean isConstant(String variableName) {
      return false;
    }
  }

  private static class TestJSTypeRegistry extends JSTypeRegistry {
    private JSType unknownType;
    private JSType objectType;
    private ObjectType nativeObjectType;

    public TestJSTypeRegistry() {
      super(null);
      unknownType = createUnknownType();
      objectType = createObjectType();
      nativeObjectType = createNativeObjectType();
    }

    private JSType createUnknownType() {
      return new JSType(this) {
        @Override
        public boolean isUnknownType() {
          return true;
        }
        @Override
        public boolean isObjectType() { return false; }
        @Override
        public boolean isFunctionType() { return false; }
        @Override
        public boolean isUnionType() { return false; }
        @Override
        public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
          return this;
        }
        @Override
        public <T> T visit(Visitor<T> visitor) {
          return visitor.caseUnknownType();
        }
        @Override
        public boolean isSubtype(JSType that) { return false; }
        @Override
        public JSType getGreatestSubtype(JSType that) { return this; }
        @Override
        public JSType getLeastSupertype(JSType that) { return that; }
        @Override
        public TypePair getTypesUnderEquality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderInequality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderShallowEquality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderShallowInequality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public String toString() { return "UnknownType"; }
      };
    }

    private JSType createObjectType() {
      return new JSType(this) {
        @Override
        public boolean isUnknownType() { return false; }
        @Override
        public boolean isObjectType() { return true; }
        @Override
        public boolean isFunctionType() { return false; }
        @Override
        public boolean isUnionType() { return false; }
        @Override
        public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
          return this;
        }
        @Override
        public <T> T visit(Visitor<T> visitor) {
          return visitor.caseObjectType((ObjectType) this);
        }
        @Override
        public boolean isSubtype(JSType that) { return false; }
        @Override
        public JSType getGreatestSubtype(JSType that) { return this; }
        @Override
        public JSType getLeastSupertype(JSType that) { return this; }
        @Override
        public TypePair getTypesUnderEquality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderInequality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderShallowEquality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderShallowInequality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public String toString() { return "ObjectType"; }
      };
    }

    private ObjectType createNativeObjectType() {
      return new ObjectType(this) {
        @Override
        public boolean isUnknownType() { return true; }
        @Override
        public boolean isObjectType() { return true; }
        @Override
        public boolean isFunctionType() { return false; }
        @Override
        public boolean isUnionType() { return false; }
        @Override
        public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
          return this;
        }
        @Override
        public <T> T visit(Visitor<T> visitor) {
          return visitor.caseObjectType(this);
        }
        @Override
        public boolean isSubtype(JSType that) { return false; }
        @Override
        public JSType getGreatestSubtype(JSType that) { return this; }
        @Override
        public JSType getLeastSupertype(JSType that) { return this; }
        @Override
        public TypePair getTypesUnderEquality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderInequality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderShallowEquality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public TypePair getTypesUnderShallowInequality(JSType that) {
          return new TypePair(this, that);
        }
        @Override
        public String toString() { return "NativeObjectType"; }
        @Override
        public boolean hasProperty(String name) { return false; }
        @Override
        public String getQualifiedName() { return "testObj"; }
      };
    }

    @Override
    public JSType getNativeType(JSTypeNative type) {
      if (type == JSTypeNative.UNKNOWN_TYPE) {
        return unknownType;
      }
      return objectType;
    }

    @Override
    public ObjectType getNativeObjectType(JSTypeNative type) {
      return nativeObjectType;
    }
  }

  private static class TestFlowScope implements FlowScope {
    private StaticSlot<JSType> slot;
    private FlowScope parent;

    public TestFlowScope(FlowScope parent) {
      this.parent = parent;
    }

    public void setSlot(StaticSlot<JSType> slot) {
      this.slot = slot;
    }

    @Override
    public FlowScope createChildFlowScope() {
      TestFlowScope child = new TestFlowScope(this);
      return child;
    }

    @Override
    public StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope) {
      return slot;
    }

    @Override
    public StaticSlot<JSType> getSlot(String name) {
      if (slot != null && slot.getName().equals(name)) {
        return slot;
      }
      return null;
    }

    @Override
    public void inferSlotType(String name, JSType type) {
      // stub
    }

    @Override
    public void inferQualifiedSlot(Node node, String qualifiedName, JSType type1, JSType type2) {
      // stub
    }

    @Override
    public void declareNameInScope(Node node, JSType type) {
      // stub
    }
  }

  private static class TestStaticSlot implements StaticSlot<JSType> {
    private final String name;
    private final JSType type;

    TestStaticSlot(String name, JSType type) {
      this.name = name;
      this.type = type;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public JSType getType() {
      return type;
    }

    @Override
    public boolean isTypeInferred() {
      return true;
    }
  }

  private SemanticReverseAbstractInterpreter interpreter;
  private TestJSTypeRegistry registry;
  private TestCodingConvention convention;

  @Before
  public void setUp() {
    convention = new TestCodingConvention();
    registry = new TestJSTypeRegistry();
    interpreter = new SemanticReverseAbstractInterpreter(convention, registry) {
      @Override
      protected JSType getTypeIfRefinable(Node node, FlowScope scope) {
        // For testing, return a simple type if node has a JSType set
        JSType type = node.getJSType();
        if (type != null && !type.isUnknownType()) {
          return type;
        }
        return null;
      }

      @Override
      protected FlowScope firstPreciserScopeKnowingConditionOutcome(
          Node condition, FlowScope blindScope, boolean outcome) {
        // Simple delegation to the method under test for stub
        return getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
      }

      @Override
      protected FlowScope nextPreciserScopeKnowingConditionOutcome(
          Node condition, FlowScope blindScope, boolean outcome) {
        return blindScope;
      }

      @Override
      protected void declareNameInScope(FlowScope scope, Node node, JSType type) {
        // stub
      }

      @Override
      protected JSType getRestrictedWithoutUndefined(JSType type) {
        return type;
      }

      @Override
      protected JSType getRestrictedWithoutNull(JSType type) {
        return type;
      }

      @Override
      protected JSType getRestrictedByTypeOfResult(JSType type, String value, boolean resultEqualsValue) {
        // Stub: return same type for simplicity
        return type;
      }

      @Override
      protected FlowScope caseNameOrGetProp(Node name, FlowScope blindScope, boolean outcome) {
        return blindScope;
      }

      @Override
      protected FlowScope caseTypeOf(Node node, JSType type, String value,
          boolean resultEqualsValue, FlowScope blindScope) {
        return blindScope;
      }

      @Override
      protected FlowScope caseEquality(Node left, Node right, FlowScope blindScope,
          Function<TypePair, TypePair> merging) {
        return blindScope;
      }

      @Override
      protected FlowScope caseAndOrNotShortCircuiting(Node left, Node right,
          FlowScope blindScope, boolean condition) {
        return blindScope;
      }

      @Override
      protected FlowScope caseAndOrMaybeShortCircuiting(Node left, Node right,
          FlowScope blindScope, boolean condition) {
        return blindScope;
      }

      @Override
      protected FlowScope caseInstanceOf(Node left, Node right, FlowScope blindScope,
          boolean outcome) {
        return blindScope;
      }

      @Override
      protected FlowScope caseIn(Node object, String propertyName, FlowScope blindScope) {
        return blindScope;
      }

      @Override
      protected FlowScope maybeRestrictName(
          FlowScope blindScope, Node node, JSType originalType, JSType restrictedType) {
        return blindScope;
      }

      @Override
      protected FlowScope maybeRestrictTwoNames(
          FlowScope blindScope,
          Node left, boolean leftIsRefineable, JSType restrictedLeftType,
          Node right, boolean rightIsRefineable, JSType restrictedRightType) {
        return blindScope;
      }
    };
  }

  @Test
  public void testTypeOfEQ_True() {
    // Simulate: typeof x == "string" when outcome=true
    Node condition = new Node(Token.EQ);
    Node typeOfNode = new Node(Token.TYPEOF);
    Node operand = new Node(Token.NAME, "x");
    Node stringNode = Node.newString("string");
    typeOfNode.addChildToFront(operand);
    condition.addChildToFront(typeOfNode);
    condition.addChildToBack(stringNode);
    // Set types on nodes
    JSType type = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    operand.setJSType(type);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testNotOperator() {
    // Simulate: !x
    Node condition = new Node(Token.NOT);
    Node inner = new Node(Token.NAME, "x");
    JSType type = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    inner.setJSType(type);
    condition.addChildToFront(inner);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    // Should delegate to firstPreciserScopeKnowingConditionOutcome with !outcome = true
    assertNotNull(result);
  }

  @Test
  public void testAndOperator_True() {
    Node condition = new Node(Token.AND);
    Node left = new Node(Token.NAME, "a");
    Node right = new Node(Token.NAME, "b");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    // caseAndOrNotShortCircuiting is called
    assertNotNull(result);
  }

  @Test
  public void testOrOperator_True() {
    Node condition = new Node(Token.OR);
    Node left = new Node(Token.NAME, "a");
    Node right = new Node(Token.NAME, "b");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    // caseAndOrMaybeShortCircuiting is called
    assertNotNull(result);
  }

  @Test
  public void testOrOperator_False() {
    Node condition = new Node(Token.OR);
    Node left = new Node(Token.NAME, "a");
    Node right = new Node(Token.NAME, "b");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    // caseAndOrNotShortCircuiting is called
    assertNotNull(result);
  }

  @Test
  public void testEquality_EQ_True() {
    Node condition = new Node(Token.EQ);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testStrictEquality_SHEQ_False() {
    Node condition = new Node(Token.SHEQ);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testInequality_NE_True() {
    Node condition = new Node(Token.NE);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testStrictInequality_SHNE_False() {
    Node condition = new Node(Token.SHNE);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testInstanceOf_True() {
    Node condition = new Node(Token.INSTANCEOF);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testInOperator_TrueWithString() {
    Node condition = new Node(Token.IN);
    Node left = Node.newString("prop");
    Node right = new Node(Token.NAME, "obj");
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testCaseOperator_True() {
    // Simulate a case statement: switch(x) { case "val": ... }
    Node switchParent = new Node(Token.SWITCH);
    Node switchCondition = new Node(Token.NAME, "x");
    switchParent.addChildToFront(switchCondition);

    Node caseNode = new Node(Token.CASE);
    Node caseValue = Node.newString("val");
    caseNode.addChildToFront(caseValue);
    switchParent.addChildToBack(caseNode);

    switchCondition.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    caseValue.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testCaseOperator_False() {
    Node switchParent = new Node(Token.SWITCH);
    Node switchCondition = new Node(Token.NAME, "x");
    switchParent.addChildToFront(switchCondition);

    Node caseNode = new Node(Token.CASE);
    Node caseValue = Node.newString("val");
    caseNode.addChildToFront(caseValue);
    switchParent.addChildToBack(caseNode);

    switchCondition.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    caseValue.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testLessThan_True() {
    Node condition = new Node(Token.LT);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testGreaterThanOrEqual_False() {
    Node condition = new Node(Token.GE);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    // For false outcome of GE, it falls through to nextPreciserScopeKnowingConditionOutcome (blindScope)
    assertSame(blindScope, result);
  }

  @Test
  public void testAssignOperator() {
    Node assign = new Node(Token.ASSIGN);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NAME, "y");
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    assign.addChildToFront(left);
    assign.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(assign, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testNameNode_Refinable() {
    Node name = new Node(Token.NAME, "x");
    JSType type = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    name.setJSType(type);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(name, blindScope, true);
    // caseNameOrGetProp stub returns blindScope
    assertSame(blindScope, result);
  }

  @Test
  public void testNameNode_NonRefinable() {
    Node name = new Node(Token.NAME, "x");
    // No type set -> getTypeIfRefinable returns null -> goes to nextPreciserScopeKnowingConditionOutcome
    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(name, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testGetPropNode() {
    Node getprop = new Node(Token.GETPROP);
    Node obj = new Node(Token.NAME, "obj");
    Node prop = Node.newString("prop");
    getprop.addChildToFront(obj);
    getprop.addChildToBack(prop);
    obj.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(getprop, blindScope, false);
    assertSame(blindScope, result);
  }

  @Test
  public void testDefaultCase_UnknownOperator() {
    Node condition = new Node(Token.DELPROP);
    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    // Falls through to nextPreciserScopeKnowingConditionOutcome which returns blindScope
    assertSame(blindScope, result);
  }

  @Test
  public void testNullCondition() {
    try {
      interpreter.getPreciserScopeKnowingConditionOutcome(null, new TestFlowScope(null), true);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testNullBlindScope() {
    Node condition = new Node(Token.NAME, "x");
    try {
      interpreter.getPreciserScopeKnowingConditionOutcome(condition, null, true);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testTypeOfWithLeftStringAndRightTypeOf() {
    Node condition = new Node(Token.EQ);
    Node left = Node.newString("string");
    Node right = new Node(Token.TYPEOF);
    Node operand = new Node(Token.NAME, "x");
    right.addChildToFront(operand);
    left.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    operand.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    condition.addChildToFront(left);
    condition.addChildToBack(right);

    TestFlowScope blindScope = new TestFlowScope(null);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }
}