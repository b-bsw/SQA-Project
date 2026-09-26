package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.StaticScope;

public class ArrowTypeTest {

    private TestRegistry registry;
    private ArrowType defaultArrow;

    @Before
    public void setUp() {
        registry = new TestRegistry();
        defaultArrow = new ArrowType(registry, null, null);
    }

    // ---------- Inner helper types ----------
    private static class TestRegistry extends JSTypeRegistry {
        @Override
        public Node createParametersWithVarArgs(JSType type) {
            Node param = new Node(0);
            param.setJSType(type);
            Node list = new Node(0);
            list.addChildToFront(param);
            return list;
        }

        @Override
        public JSType getNativeType(JSTypeNative nativeType) {
            SimpleJSType result = new SimpleJSType(this, "native");
            result.setUnknownType(true);
            return result;
        }
    }

    private static class SimpleJSType extends JSType {
        private final String name;
        private boolean unknownType = false;
        private boolean hasTemplate = false;
        private SimpleJSType superType;

        SimpleJSType(JSTypeRegistry registry, String name) {
            super(registry);
            this.name = name;
        }

        void setSuperType(SimpleJSType superType) { this.superType = superType; }
        void setUnknownType(boolean unknown) { this.unknownType = unknown; }
        void setHasTemplate(boolean has) { this.hasTemplate = has; }

        @Override
        public boolean isSubtype(JSType that) {
            if (that instanceof SimpleJSType) {
                SimpleJSType o = (SimpleJSType) that;
                if (this.name.equals(o.name)) return true;
                if (superType != null) return superType.isSubtype(that);
            }
            return false;
        }

        @Override
        public TernaryValue testForEquality(JSType that) {
            throw new UnsupportedOperationException();
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            throw new UnsupportedOperationException();
        }

        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
            return this;
        }

        @Override
        public boolean isUnknownType() {
            return unknownType;
        }

        @Override
        public boolean hasAnyTemplate() {
            return hasTemplate;
        }

        @Override
        public boolean checkEquivalenceHelper(JSType that, boolean tolerateUnknowns) {
            if (that instanceof SimpleJSType) {
                return this.name.equals(((SimpleJSType) that).name);
            }
            return false;
        }

        @Override
        public JSType getLeastSupertype(JSType that) {
            throw new UnsupportedOperationException();
        }

        @Override
        public JSType getGreatestSubtype(JSType that) {
            throw new UnsupportedOperationException();
        }

        @Override
        public String toString() {
            return name;
        }
    }

    // ---------- Helper methods ----------
    private Node createParamList(JSType... paramTypes) {
        Node list = new Node(0);
        for (JSType type : paramTypes) {
            Node param = new Node(0);
            param.setJSType(type);
            list.addChildToFront(param);
        }
        return list;
    }

    private Node createVarArgParam(JSType paramType) {
        Node param = new Node(0);
        param.setJSType(paramType);
        param.setVarArgs(true);
        Node list = new Node(0);
        list.addChildToFront(param);
        return list;
    }

    private Node createOptionalParam(JSType paramType) {
        Node param = new Node(0);
        param.setJSType(paramType);
        param.setOptionalArg(true);
        Node list = new Node(0);
        list.addChildToFront(param);
        return list;
    }

    // ---------- Constructor tests ----------
    @Test
    public void testConstructorNullParamsAndReturn() {
        assertNotNull(defaultArrow.parameters);
        assertNotNull(defaultArrow.returnType);
        assertTrue(defaultArrow.returnType.isUnknownType());
        assertFalse(defaultArrow.returnTypeInferred);
    }

    @Test
    public void testConstructorWithProvidedParamsAndReturn() {
        SimpleJSType numType = new SimpleJSType(registry, "number");
        Node params = createParamList(numType);
        SimpleJSType retType = new SimpleJSType(registry, "void");
        ArrowType arrow = new ArrowType(registry, params, retType, true);
        assertSame(params, arrow.parameters);
        assertSame(retType, arrow.returnType);
        assertTrue(arrow.returnTypeInferred);
    }

    // ---------- isSubtype tests ----------
    @Test
    public void testIsSubtypeNotArrowType() {
        JSType other = new SimpleJSType(registry, "other");
        assertFalse(defaultArrow.isSubtype(other));
    }

    @Test
    public void testIsSubtypeCovariantReturnSuccess() {
        SimpleJSType retSub = new SimpleJSType(registry, "sub");
        SimpleJSType retSuper = new SimpleJSType(registry, "super");
        retSub.setSuperType(retSuper);

        ArrowType subArrow = new ArrowType(registry, createParamList(), retSub);
        ArrowType superArrow = new ArrowType(registry, createParamList(), retSuper);
        assertTrue(subArrow.isSubtype(superArrow));
    }

    @Test
    public void testIsSubtypeCovariantReturnFail() {
        SimpleJSType retA = new SimpleJSType(registry, "A");
        SimpleJSType retB = new SimpleJSType(registry, "B");
        // no subtype relation
        ArrowType arrowA = new ArrowType(registry, createParamList(), retA);
        ArrowType arrowB = new ArrowType(registry, createParamList(), retB);
        assertFalse(arrowA.isSubtype(arrowB));
    }

    @Test
    public void testIsSubtypeContravariantParamsSuccess() {
        SimpleJSType paramSuper = new SimpleJSType(registry, "paramSuper");
        SimpleJSType paramSub = new SimpleJSType(registry, "paramSub");
        paramSub.setSuperType(paramSuper);
        SimpleJSType ret = new SimpleJSType(registry, "ret");

        Node thisParams = createParamList(paramSuper);
        Node thatParams = createParamList(paramSub);
        ArrowType thisArrow = new ArrowType(registry, thisParams, ret);
        ArrowType thatArrow = new ArrowType(registry, thatParams, ret);
        assertTrue(thisArrow.isSubtype(thatArrow));
    }

    @Test
    public void testIsSubtypeContravariantParamsFail() {
        SimpleJSType paramA = new SimpleJSType(registry, "A");
        SimpleJSType paramB = new SimpleJSType(registry, "B");
        SimpleJSType ret = new SimpleJSType(registry, "ret");

        Node thisParams = createParamList(paramA);
        Node thatParams = createParamList(paramB);
        ArrowType thisArrow = new ArrowType(registry, thisParams, ret);
        ArrowType thatArrow = new ArrowType(registry, thatParams, ret);
        assertFalse(thisArrow.isSubtype(thatArrow));
    }

    @Test
    public void testIsSubtypeMissingRequiredArgument() {
        SimpleJSType paramType = new SimpleJSType(registry, "req");
        SimpleJSType ret = new SimpleJSType(registry, "ret");

        Node thisParams = createParamList(paramType);
        Node thatParams = new Node(0); // no children
        ArrowType thisArrow = new ArrowType(registry, thisParams, ret);
        ArrowType thatArrow = new ArrowType(registry, thatParams, ret);
        assertFalse(thisArrow.isSubtype(thatArrow)); // this has required param, that none
    }

    @Test
    public void testIsSubtypeBothVarArgs() {
        SimpleJSType typeA = new SimpleJSType(registry, "A");
        SimpleJSType typeB = new SimpleJSType(registry, "B");

        Node thisParams = createVarArgParam(typeA);
        Node thatParams = createVarArgParam(typeB);
        ArrowType thisArrow = new ArrowType(registry, thisParams, typeA);
        ArrowType thatArrow = new ArrowType(registry, thatParams, typeB);
        assertTrue(thisArrow.isSubtype(thatArrow)); // both var_args -> skip further
    }

    @Test
    public void testIsSubtypeVarArgsIsTopFunctionTrue() {
        SimpleJSType ret = new SimpleJSType(registry, "ret");
        // this has required param, that is var_args with unknown type (top function)
        Node thisParams = createParamList(ret);
        Node thatParams = createVarArgParam(null); // paramType null
        ArrowType thisArrow = new ArrowType(registry, thisParams, ret);
        ArrowType thatArrow = new ArrowType(registry, thatParams, ret);
        assertTrue(thisArrow.isSubtype(thatArrow)); // isTopFunction true
    }

    @Test
    public void testIsSubtypeVarArgsIsTopFunctionFalse() {
        SimpleJSType ret = new SimpleJSType(registry, "ret");
        SimpleJSType concreteType = new SimpleJSType(registry, "concrete");
        // that param is var_args and concrete type -> not top
        Node thisParams = createParamList(ret);
        Node thatParams = createVarArgParam(concreteType);
        ArrowType thisArrow = new ArrowType(registry, thisParams, ret);
        ArrowType thatArrow = new ArrowType(registry, thatParams, ret);
        assertFalse(thisArrow.isSubtype(thatArrow));
    }

    // ---------- hasEqualParameters tests ----------
    @Test
    public void testHasEqualParametersBothEmpty() {
        ArrowType a1 = new ArrowType(registry, createParamList(), new SimpleJSType(registry, "X"));
        ArrowType a2 = new ArrowType(registry, createParamList(), new SimpleJSType(registry, "Y"));
        assertTrue(a1.hasEqualParameters(a2, false));
    }

    @Test
    public void testHasEqualParametersSameTypes() {
        SimpleJSType type1 = new SimpleJSType(registry, "num");
        SimpleJSType type2 = new SimpleJSType(registry, "num");
        ArrowType a1 = new ArrowType(registry, createParamList(type1), new SimpleJSType(registry, "X"));
        ArrowType a2 = new ArrowType(registry, createParamList(type2), new SimpleJSType(registry, "Y"));
        assertTrue(a1.hasEqualParameters(a2, false));
    }

    @Test
    public void testHasEqualParametersDifferentTypes() {
        SimpleJSType typeA = new SimpleJSType(registry, "A");
        SimpleJSType typeB = new SimpleJSType(registry, "B");
        ArrowType a1 = new ArrowType(registry, createParamList(typeA), new SimpleJSType(registry, "X"));
        ArrowType a2 = new ArrowType(registry, createParamList(typeB), new SimpleJSType(registry, "Y"));
        assertFalse(a1.hasEqualParameters(a2, false));
    }

    @Test
    public void testHasEqualParametersOneParamNull() {
        ArrowType a1 = new ArrowType(registry, createParamList(new SimpleJSType(registry, "X")), new SimpleJSType(registry, "R"));
        ArrowType a2 = new ArrowType(registry, createParamList(), new SimpleJSType(registry, "R"));
        assertFalse(a1.hasEqualParameters(a2, false));
    }

    // ---------- checkArrowEquivalenceHelper tests ----------
    @Test
    public void testCheckArrowEquivalenceHelperTrue() {
        SimpleJSType ret = new SimpleJSType(registry, "ret");
        ArrowType a1 = new ArrowType(registry, createParamList(ret), ret);
        ArrowType a2 = new ArrowType(registry, createParamList(ret), ret);
        assertTrue(a1.checkArrowEquivalenceHelper(a2, false));
    }

    @Test
    public void testCheckArrowEquivalenceHelperFalseReturnType() {
        SimpleJSType ret1 = new SimpleJSType(registry, "ret1");
        SimpleJSType ret2 = new SimpleJSType(registry, "ret2");
        ArrowType a1 = new ArrowType(registry, createParamList(ret1), ret1);
        ArrowType a2 = new ArrowType(registry, createParamList(ret1), ret2);
        assertFalse(a1.checkArrowEquivalenceHelper(a2, false));
    }

    // ---------- hashCode test ----------
    @Test
    public void testHashCodeConsistency() {
        ArrowType arrow1 = new ArrowType(registry, createParamList(), new SimpleJSType(registry, "X"));
        ArrowType arrow2 = new ArrowType(registry, createParamList(), new SimpleJSType(registry, "X"));
        assertEquals(arrow1.hashCode(), arrow2.hashCode());
    }

    // ---------- getPossibleToBooleanOutcomes ----------
    @Test
    public void testGetPossibleToBooleanOutcomes() {
        assertEquals(BooleanLiteralSet.TRUE, defaultArrow.getPossibleToBooleanOutcomes());
    }

    // ---------- hasUnknownParamsOrReturn tests ----------
    @Test
    public void testHasUnknownParamsOrReturnDefault() {
        // default constructor creates unknown parameters and unknown return
        assertTrue(defaultArrow.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturnAllKnown() {
        SimpleJSType known = new SimpleJSType(registry, "known");
        Node params = createParamList(known);
        ArrowType arrow = new ArrowType(registry, params, known);
        assertFalse(arrow.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturnUnknownParam() {
        SimpleJSType known = new SimpleJSType(registry, "known");
        SimpleJSType unknown = new SimpleJSType(registry, "unknown");
        unknown.setUnknownType(true);
        Node params = createParamList(known, unknown);
        ArrowType arrow = new ArrowType(registry, params, known);
        assertTrue(arrow.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturnUnknownReturn() {
        SimpleJSType known = new SimpleJSType(registry, "known");
        SimpleJSType unknown = new SimpleJSType(registry, "unknown");
        unknown.setUnknownType(true);
        ArrowType arrow = new ArrowType(registry, createParamList(known), unknown);
        assertTrue(arrow.hasUnknownParamsOrReturn());
    }

    // ---------- hasAnyTemplateInternal tests ----------
    @Test
    public void testHasAnyTemplateInternalTrueFromReturn() {
        SimpleJSType returnType = new SimpleJSType(registry, "template");
        returnType.setHasTemplate(true);
        ArrowType arrow = new ArrowType(registry, createParamList(), returnType);
        assertTrue(arrow.hasAnyTemplateInternal());
    }

    @Test
    public void testHasAnyTemplateInternalTrueFromParam() {
        SimpleJSType paramType = new SimpleJSType(registry, "template");
        paramType.setHasTemplate(true);
        SimpleJSType ret = new SimpleJSType(registry, "plain");
        ArrowType arrow = new ArrowType(registry, createParamList(paramType), ret);
        assertTrue(arrow.hasAnyTemplateInternal());
    }

    @Test
    public void testHasAnyTemplateInternalFalse() {
        SimpleJSType ret = new SimpleJSType(registry, "plain");
        SimpleJSType param = new SimpleJSType(registry, "plain");
        ArrowType arrow = new ArrowType(registry, createParamList(param), ret);
        assertFalse(arrow.hasAnyTemplateInternal());
    }

    // ---------- toStringHelper test ----------
    @Test
    public void testToStringHelper() {
        assertEquals("[ArrowType]", defaultArrow.toStringHelper(false));
    }

    // ---------- resolveInternal test ----------
    @Test
    public void testResolveInternal() {
        SimpleJSType ret = new SimpleJSType(registry, "resolved");
        ArrowType arrow = new ArrowType(registry, createParamList(ret), ret);
        // should return this without error
        assertSame(arrow, arrow.resolveInternal(null, null));
    }

    // ---------- Unsupported operations ----------
    @Test(expected = UnsupportedOperationException.class)
    public void testGetLeastSupertypeThrows() {
        defaultArrow.getLeastSupertype(defaultArrow);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetGreatestSubtypeThrows() {
        defaultArrow.getGreatestSubtype(defaultArrow);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTestForEqualityThrows() {
        defaultArrow.testForEquality(defaultArrow);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testVisitThrows() {
        defaultArrow.visit(null);
    }
}