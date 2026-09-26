package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableMap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;

import org.junit.Before;
import org.junit.Test;

public class ClosureReverseAbstractInterpreterTest {

    private JSTypeRegistry registry;
    private CodingConvention convention;
    private ClosureReverseAbstractInterpreter interpreter;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
        convention = new CodingConvention();
        interpreter = new ClosureReverseAbstractInterpreter(convention, registry);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_nullCondition() {
        Node condition = new Node(Token.CALL);
        condition.addChildToFront(new Node(Token.NAME, "test"));
        FlowScope blindScope = new FlowScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_nonCallCondition() {
        Node condition = new Node(Token.NAME, "x");
        FlowScope blindScope = new FlowScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_callWithTwoChildren() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isArray");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isArrayTrue() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isArray");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), inferredType);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isArrayFalse() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isArray");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertNull(inferredType);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isArrayWithNullTypeTrue() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isArray");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", null);
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), inferredType);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isObjectTrue() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isObject");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isObjectFalse() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isObject");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isDefTrue() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isDef");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.UNDEFINED_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertNull(inferredType);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isNullFalse() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isNull");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.NULL_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertNotNull(inferredType);
    }

    @Test
    public void testRestrictParameterWithNullOutcome() {
        Node param = new Node(Token.NAME, "x");
        JSType type = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", type);
        Map<String, Function<TypeRestriction, JSType>> restricters = InterpreterReflections.getRestricters();
        Function<TypeRestriction, JSType> restricter = restricters.get("isString");
        FlowScope result = interpreter.restrictParameter(param, type, blindScope, restricter, false);
        assertNotNull(result);
        assertNull(result.getSlot("x"));
    }

    @Test
    public void testRestrictParameterWithNullInputType() {
        Node param = new Node(Token.NAME, "x");
        JSType type = null;
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        Map<String, Function<TypeRestriction, JSType>> restricters = InterpreterReflections.getRestricters();
        Function<TypeRestriction, JSType> restricter = restricters.get("isString");
        FlowScope result = interpreter.restrictParameter(param, type, blindScope, restricter, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_nonGoogFunction() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "other");
        Node right = new Node(Token.STRING, "isDefined");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isArrayWithObjectSubtype() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isArray");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), inferredType);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isArrayFalseNotArray() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isArray");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), inferredType);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isDefAndNotNullTrue() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isDefAndNotNull");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), inferredType);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_isDefAndNotNullFalseWithUndefined() {
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME, "goog");
        Node right = new Node(Token.STRING, "isDefAndNotNull");
        callee.addChildToFront(left);
        callee.addChildToFront(right);
        condition.addChildToFront(callee);
        Node param = new Node(Token.NAME, "x");
        param.setString("x");
        condition.addChildToFront(param);
        FlowScope blindScope = new FlowScope();
        blindScope = blindScope.createChildFlowScope();
        blindScope.inferSlotType("x", registry.getNativeType(JSTypeNative.UNDEFINED_TYPE));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        assertNotNull(result);
        JSType inferredType = result.getSlot("x").getType();
        // outcome false: getRestrictedWithoutUndefined(getRestrictedWithoutNull(type))? outcome false returns null
        assertNull(inferredType);
    }
}