package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node4);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node12);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isCall(node18);
        boolean boolean22 = mayBeStringResultPredicate15.apply(node18);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate23 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int24 = com.google.javascript.jscomp.NodeUtil.getCount(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15);
        boolean boolean26 = matchNodeType1.apply(node4);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node29);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate32 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isCall(node35);
        boolean boolean39 = mayBeStringResultPredicate32.apply(node35);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate40 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int41 = com.google.javascript.jscomp.NodeUtil.getCount(node29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.mayBeString(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node29, node44);
        java.lang.String str49 = com.google.javascript.jscomp.NodeUtil.getSourceName(node44);
        boolean boolean50 = matchNodeType1.apply(node44);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction52 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int53 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node44, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node44);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement0 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNull(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean10 = matchShallowStatement0.apply(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        java.lang.String[] strArray12 = new java.lang.String[] { "typeof", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNull(node21);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node21);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node21);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node21);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node21);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "typeof", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayBeString(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean7 = mayBeStringResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node10);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration16 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node20);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node23);
        java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsCall(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node24);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node10, node24, "%=");
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType jSType32 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node24, jSType31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node24);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node24);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNull(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean7 = mayBeStringResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node10);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration16 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNull(node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node20);
        boolean boolean27 = matchDeclaration16.apply(node20);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node20);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor29 = null;
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction30 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node33);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration37 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsType(node33, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration37);
        boolean boolean39 = matchNotFunction30.apply(node33);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node42);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node42);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node42);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node42, abstractCompiler49);
        boolean boolean51 = matchNotFunction30.apply(node42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node20, visitor29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate7 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isCall(node10);
        boolean boolean14 = mayBeStringResultPredicate7.apply(node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsFunction(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node10);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate23 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCall(node26);
        boolean boolean30 = mayBeStringResultPredicate23.apply(node26);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node32);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.containsFunction(node33);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node33);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration39 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node33, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration39);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNull(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node43);
        boolean boolean50 = matchDeclaration39.apply(node43);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.valueCheck(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration39);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node10);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo54 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isForIn(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate1 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCall(node4);
        boolean boolean8 = mayBeStringResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsFunction(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node11);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration17 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node11, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNull(node21);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node21);
        boolean boolean28 = matchDeclaration17.apply(node21);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node21);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node33);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate37 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node40);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate43 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isCall(node46);
        boolean boolean50 = mayBeStringResultPredicate43.apply(node46);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate51 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int52 = com.google.javascript.jscomp.NodeUtil.getCount(node40, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate51);
        int int53 = com.google.javascript.jscomp.NodeUtil.getCount(node33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate37, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate43);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node21, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate37);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isGet(node21);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler8);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        java.lang.String[] strArray10 = new java.lang.String[] { "||", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node2, (java.util.Set<java.lang.String>) strSet11);
        java.lang.Class<?> wildcardClass14 = strSet11.getClass();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "||", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node7);
        boolean boolean10 = matchNotFunction0.apply(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node13, false);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node13, false);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler24);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate1 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCall(node4);
        boolean boolean8 = mayBeStringResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsFunction(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isName(node11);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node11);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node24);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node21, node25);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node30);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNull(node30);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node21, node30);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node21, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isCall(node44);
        boolean boolean48 = mayBeStringResultPredicate41.apply(node44);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node50);
        java.lang.String str52 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.containsFunction(node51);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node44, node51);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node51);
        boolean boolean57 = matchNodeType39.apply(node51);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement58 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node61);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node61);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isNull(node61);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node61);
        boolean boolean68 = matchShallowStatement58.apply(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node61);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node61);
        boolean boolean71 = matchNodeType39.apply(node61);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node11, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node75);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node75);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node75);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node75);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node75);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node81);
        // The following exception was thrown during execution in test generation
        try {
            int int83 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSDocInfo17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNull(node82);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "");
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node4);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node12);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isCall(node18);
        boolean boolean22 = mayBeStringResultPredicate15.apply(node18);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate23 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int24 = com.google.javascript.jscomp.NodeUtil.getCount(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15);
        boolean boolean26 = matchNodeType1.apply(node4);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node29);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate32 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isCall(node35);
        boolean boolean39 = mayBeStringResultPredicate32.apply(node35);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate40 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int41 = com.google.javascript.jscomp.NodeUtil.getCount(node29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.mayBeString(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node29, node44);
        java.lang.String str49 = com.google.javascript.jscomp.NodeUtil.getSourceName(node44);
        boolean boolean50 = matchNodeType1.apply(node44);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node44);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node44);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = mayBeStringResultPredicate5.apply(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isVar(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node17);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getSourceName(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node17);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate1 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCall(node4);
        boolean boolean8 = mayBeStringResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsFunction(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node11);
        boolean boolean16 = booleanResultPredicate0.apply(node4);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate17 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isCall(node20);
        boolean boolean24 = mayBeStringResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsFunction(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node27);
        boolean boolean32 = booleanResultPredicate0.apply(node27);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isNull(node35);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node35);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node35);
        boolean boolean43 = booleanResultPredicate0.apply(node35);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate2 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCall(node5);
        boolean boolean9 = mayBeStringResultPredicate2.apply(node5);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.containsFunction(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node5);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("^", node5);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node23);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate26 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isCall(node29);
        boolean boolean33 = mayBeStringResultPredicate26.apply(node29);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate34 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int35 = com.google.javascript.jscomp.NodeUtil.getCount(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node23);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node23);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("typeof", node23);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isCall(node38);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(codingConvention0, node5, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: VAR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.mayBeString(node14);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayBeString(node14, true);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node14);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8, true);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNull(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node11);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType20 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType20);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isNull(node24);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node24);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isThis(node24);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node24, "instanceof");
        boolean boolean36 = matchNodeType20.apply(node24);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isForIn(node24);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayBeString(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node7);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate9 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node12);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isCall(node18);
        boolean boolean22 = mayBeStringResultPredicate15.apply(node18);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate23 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int24 = com.google.javascript.jscomp.NodeUtil.getCount(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isForIn(node2);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(numbericResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        java.lang.String[] strArray12 = new java.lang.String[] { "typeof", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node20);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate24 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isCall(node27);
        boolean boolean31 = mayBeStringResultPredicate24.apply(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement33 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node27, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement33);
        int int35 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node20, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node38);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isVar(node38);
        boolean boolean44 = matchShallowStatement33.apply(node38);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node46);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node47);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate51 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isCall(node54);
        boolean boolean58 = mayBeStringResultPredicate51.apply(node54);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement60 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node54, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement60);
        int int62 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node47, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement60);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node64);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node65);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node65);
        java.lang.String str70 = com.google.javascript.jscomp.NodeUtil.arrayToString(node65);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node65);
        boolean boolean72 = matchShallowStatement60.apply(node65);
        int int73 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "typeof", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(ternaryValue74);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate1 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node4);
        boolean boolean8 = numbericResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("%=", node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayBeString(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node27);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node35);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate38 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isCall(node41);
        boolean boolean45 = mayBeStringResultPredicate38.apply(node41);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate46 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int47 = com.google.javascript.jscomp.NodeUtil.getCount(node35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node27, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38);
        int int49 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node12, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node17);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection22 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node26);
        java.lang.String[] strArray34 = new java.lang.String[] { "||", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node26, (java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node17, (java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node10, (java.util.Set<java.lang.String>) strSet35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node2, (java.util.Set<java.lang.String>) strSet35);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeCollection22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "||", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate8 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCall(node11);
        boolean boolean15 = mayBeStringResultPredicate8.apply(node11);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node17);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsFunction(node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node18);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration24 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node18, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node31);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsCall(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node32);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node18, node32, "%=");
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node32, "JSCompiler_renameProperty");
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node32);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isConstantName(node32);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isVar(node32);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsCall(node32);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate0 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean7 = numbericResultPredicate0.apply(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = mayBeStringResultPredicate5.apply(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isVar(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node17);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node27);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isNull(node32);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node32);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType41 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node23, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isThis(node45);
        boolean boolean50 = matchNodeType41.apply(node45);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate51 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int52 = com.google.javascript.jscomp.NodeUtil.getCount(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate51);
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getStringValue(node17);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8, true);
        java.lang.Double double15 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node8);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node18);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node25);
        java.lang.String[] strArray35 = new java.lang.String[] { "typeof", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node25, (java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node18, (java.util.Set<java.lang.String>) strSet36);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node8, (java.util.Set<java.lang.String>) strSet36);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(double15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "typeof", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayBeString(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node27);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node35);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate38 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isCall(node41);
        boolean boolean45 = mayBeStringResultPredicate38.apply(node41);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate46 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int47 = com.google.javascript.jscomp.NodeUtil.getCount(node35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node27, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38);
        int int49 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node12, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node2);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsCall(node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node6);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction11 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node16);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node24);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate27 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isCall(node30);
        boolean boolean34 = mayBeStringResultPredicate27.apply(node30);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate35 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int36 = com.google.javascript.jscomp.NodeUtil.getCount(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.containsType(node16, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate27);
        boolean boolean38 = matchNodeType13.apply(node16);
        int int39 = com.google.javascript.jscomp.NodeUtil.getCount(node6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType13);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node6);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node6);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node6);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node6, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = mayBeStringResultPredicate5.apply(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isUndefined(node17);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node28);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNull(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node24, node33);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isNull(node33);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isConstantName(node33);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node33);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType44 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        int int45 = matchNodeType44.type;
        int int46 = matchNodeType44.type;
        int int47 = matchNodeType44.type;
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement48 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement49 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node52);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node52);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isNull(node52);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node52);
        boolean boolean59 = matchShallowStatement49.apply(node52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node52);
        boolean boolean61 = matchShallowStatement48.apply(node52);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.has(node33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement48);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node64);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node65);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate69 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node71);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isCall(node72);
        boolean boolean76 = mayBeStringResultPredicate69.apply(node72);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement78 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node72, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement78);
        int int80 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node65, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement78);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node82);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue84 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node83);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node83);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node83);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isVar(node83);
        boolean boolean89 = matchShallowStatement78.apply(node83);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.has(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement78);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(ternaryValue84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean7 = mayBeStringResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isName(node10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node10);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node20);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node23);
        java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node24);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node29);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNull(node29);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node29);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node20, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate40 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isCall(node43);
        boolean boolean47 = mayBeStringResultPredicate40.apply(node43);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node49);
        java.lang.String str51 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.containsFunction(node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node50);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node50);
        boolean boolean56 = matchNodeType38.apply(node50);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement57 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node59);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node60);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node60);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isNull(node60);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node60);
        boolean boolean67 = matchShallowStatement57.apply(node60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node60);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node60);
        boolean boolean70 = matchNodeType38.apply(node60);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.mayBeString(node10, false);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isGetProp(node10);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLhs(node12, node16);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate19 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node22);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate25 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isCall(node28);
        boolean boolean32 = mayBeStringResultPredicate25.apply(node28);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate33 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.has(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNull(node12);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node12, node39);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLhs(node8, node39);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node39, "");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(numbericResultPredicate19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement8 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node17);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLhs(node14, node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node18);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction23 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType25 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node28);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node36);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate39 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isCall(node42);
        boolean boolean46 = mayBeStringResultPredicate39.apply(node42);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate47 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int48 = com.google.javascript.jscomp.NodeUtil.getCount(node36, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate39, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.containsType(node28, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate39);
        boolean boolean50 = matchNodeType25.apply(node28);
        int int51 = com.google.javascript.jscomp.NodeUtil.getCount(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node18);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node18);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node8);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = mayBeStringResultPredicate5.apply(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node17);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node3);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNull(node15);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean22 = matchShallowStatement12.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate24 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node15, "typeof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "typeof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayBeString(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node7);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "%=");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate18 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isCall(node21);
        boolean boolean25 = mayBeStringResultPredicate18.apply(node21);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsFunction(node28);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node21, node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isName(node28);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection34 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node28);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node37);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isCall(node44);
        boolean boolean48 = mayBeStringResultPredicate41.apply(node44);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement50 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node44, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement50);
        int int52 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node37, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement50);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node28, node37, "%=");
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isVar(node28);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isUndefined(node28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node2, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeCollection34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = mayBeStringResultPredicate5.apply(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node17);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node27);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isNull(node32);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node32);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNull(node32);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node32);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate42 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isCall(node45);
        boolean boolean49 = mayBeStringResultPredicate42.apply(node45);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node51);
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.containsFunction(node52);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node45, node52);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration58 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node52, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.containsType(node32, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node32);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node32);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isForIn(node32);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node17, node32);
        java.lang.String str65 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node17);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((-1));
        org.junit.Assert.assertNotNull(ternaryValue1);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGetProp(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName("||");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isName(node6);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node6, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunction(node6);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(0);
        int int19 = matchNodeType18.type;
        int int20 = matchNodeType18.type;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsType(node6, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node17, node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.containsCall(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node21, abstractCompiler26);
        boolean boolean28 = mayBeStringResultPredicate5.apply(node21);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node30);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node31, false);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node31, "typeof");
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunction(node31);
        boolean boolean40 = mayBeStringResultPredicate5.apply(node31);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.mayBeString(node43);
        boolean boolean47 = mayBeStringResultPredicate5.apply(node43);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement48 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement49 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node52);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node52);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isNull(node52);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node52);
        boolean boolean59 = matchShallowStatement49.apply(node52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node52);
        boolean boolean61 = matchShallowStatement48.apply(node52);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node64);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node64);
        boolean boolean68 = matchShallowStatement48.apply(node64);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isNull(node64);
        boolean boolean70 = mayBeStringResultPredicate5.apply(node64);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node11);
        java.lang.String[] strArray19 = new java.lang.String[] { "||", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node11, (java.util.Set<java.lang.String>) strSet20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "||", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean12 = mayBeStringResultPredicate5.apply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = mayBeStringResultPredicate5.apply(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node17, abstractCompiler20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node17);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node17);
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node17);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate25 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isCall(node28);
        boolean boolean32 = mayBeStringResultPredicate25.apply(node28);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node34);
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsFunction(node35);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node28);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node44);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node44);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node44);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node44);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node54);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node55);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node55);
        java.lang.String[] strArray62 = new java.lang.String[] { "^", "%=" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node55, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node44, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node17, (java.util.Set<java.lang.String>) strSet63);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NEW node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "^", "%=" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNull(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNull(node11);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node11);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node11, node22);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement26 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node30);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNull(node30);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node30);
        boolean boolean37 = matchShallowStatement27.apply(node30);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node30);
        boolean boolean39 = matchShallowStatement26.apply(node30);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node42);
        boolean boolean46 = matchShallowStatement26.apply(node42);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isString(node42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node22, node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }
}

