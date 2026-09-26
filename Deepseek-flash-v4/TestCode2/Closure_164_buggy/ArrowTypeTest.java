package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ArrowTypeTest {
    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;
    private JSType unknownType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    }

    private Node createParams(JSType... types) {
        Node params = new Node(Token.PARAM_LIST);
        for (JSType type : types) {
            Node param = Node.newString(Token.NAME, "");
            param.setJSType(type);
            params.addChildToBack(param);
        }
        return params;
    }

    @Test
    public void testConstructorDefaults() {
        ArrowType at = new ArrowType(registry, null, null);
        assertNotNull(at.parameters);
        assertNotNull(at.returnType);
        assertFalse(at.returnTypeInferred);
        assertEquals(unknownType, at.returnType);
        assertTrue(at.parameters.getFirstChild().isVarArgs());
    }

    @Test
    public void testConstructorExplicit() {
        Node params = createParams(numberType);
        ArrowType at = new ArrowType(registry, params, stringType, true);
        assertSame(params, at.parameters);
        assertSame(stringType, at.returnType);
        assertTrue(at.returnTypeInferred);
    }

    @Test
    public void testIsSubtypeSelf() {
        ArrowType at = new ArrowType(registry, null, numberType);
        assertTrue(at.isSubtype(at));
    }

    @Test
    public void testIsSubtypeReturnTypeMismatch() {
        ArrowType at1 = new ArrowType(registry, null, numberType);
        ArrowType at2 = new ArrowType(registry, null, stringType);
        assertFalse(at1.isSubtype(at2));
    }

    @Test
    public void testIsSubtypeParamContravariant() {
        Node paramsNum = createParams(numberType);
        Node paramsStr = createParams(stringType);
        ArrowType atNum = new ArrowType(registry, paramsNum, numberType);
        ArrowType atStr = new ArrowType(registry, paramsStr, numberType);
        assertFalse(atStr.isSubtype(atNum));
        assertFalse(atNum.isSubtype(atStr));
    }

    @Test
    public void testIsSubtypeVarargsHandling() {
        ArrowType atVar = new ArrowType(registry, null, numberType);
        Node param = createParams(numberType);
        ArrowType atReq = new ArrowType(registry, param, numberType);
        assertTrue(atVar.isSubtype(atReq));
        assertTrue(atReq.isSubtype(atVar));
    }

    @Test
    public void testHasEqualParametersNull() {
        ArrowType at1 = new ArrowType(registry, null, numberType);
        ArrowType at2 = new ArrowType(registry, null, stringType);
        assertTrue(at1.hasEqualParameters(at2));
    }

    @Test
    public void testHasEqualParametersDifferent() {
        Node params1 = createParams(numberType);
        Node params2 = createParams(stringType);
        ArrowType at1 = new ArrowType(registry, params1, numberType);
        ArrowType at2 = new ArrowType(registry, params2, numberType);
        assertFalse(at1.hasEqualParameters(at2));
    }

    @Test
    public void testIsEquivalentToEqual() {
        ArrowType at1 = new ArrowType(registry, null, numberType);
        ArrowType at2 = new ArrowType(registry, null, numberType);
        assertTrue(at1.isEquivalentTo(at2));
    }

    @Test
    public void testIsEquivalentToDifferentReturn() {
        ArrowType at1 = new ArrowType(registry, null, numberType);
        ArrowType at2 = new ArrowType(registry, null, stringType);
        assertFalse(at1.isEquivalentTo(at2));
    }

    @Test
    public void testHashCodeConsistency() {
        ArrowType at = new ArrowType(registry, null, numberType);
        int hash1 = at.hashCode();
        int hash2 = at.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHasUnknownParamsOrReturn() {
        ArrowType at = new ArrowType(registry, null, unknownType);
        assertTrue(at.hasUnknownParamsOrReturn());
        assertFalse(new ArrowType(registry, null, numberType).hasUnknownParamsOrReturn());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetLeastSupertype() {
        new ArrowType(registry, null, numberType).getLeastSupertype(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetGreatestSubtype() {
        new ArrowType(registry, null, numberType).getGreatestSubtype(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTestForEquality() {
        new ArrowType(registry, null, numberType).testForEquality(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testVisit() {
        new ArrowType(registry, null, numberType).visit(null);
    }

    @Test
    public void testGetPossibleToBooleanOutcomes() {
        assertEquals(BooleanLiteralSet.TRUE,
                     new ArrowType(registry, null, numberType).getPossibleToBooleanOutcomes());
    }
}