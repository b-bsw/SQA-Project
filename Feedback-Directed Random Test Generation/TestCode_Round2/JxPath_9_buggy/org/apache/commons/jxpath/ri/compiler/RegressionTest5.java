package org.apache.commons.jxpath.ri.compiler;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        boolean boolean15 = coreOperationEqual14.isSymmetric();
        int int16 = coreOperationEqual14.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray17 = coreOperationEqual14.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        boolean boolean29 = coreOperationEqual28.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression38, expression39);
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression41, expression42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40, expression42);
        java.lang.String str45 = coreOperationNotEqual44.getSymbol();
        boolean boolean46 = coreOperationEqual24.equal((java.lang.Object) coreOperationNotEqual37, (java.lang.Object) coreOperationNotEqual44);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression50, expression51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, expression51);
        boolean boolean54 = coreOperationEqual49.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        int int63 = coreOperationEqual60.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        int int65 = coreOperationNotEqual44.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression66, expression67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68, expression70);
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression73, expression74);
        boolean boolean76 = coreOperationEqual75.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression78 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression77, expression78);
        org.apache.commons.jxpath.ri.compiler.Expression expression80 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression81 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual82 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression80, expression81);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual79, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual82);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual84 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual83);
        org.apache.commons.jxpath.ri.compiler.Expression expression85 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression86 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression85, expression86);
        boolean boolean88 = coreOperationEqual87.isSymmetric();
        int int89 = coreOperationEqual87.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray90 = coreOperationEqual87.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual91 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual84, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual87);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual92 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual91);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual93 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual94 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual93);
        org.apache.commons.jxpath.ri.EvalContext evalContext95 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = coreOperationEqual93.compute(evalContext95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(expressionArray17);
        org.junit.Assert.assertArrayEquals(expressionArray17, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "!=" + "'", str45, "!=");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertNotNull(expressionArray90);
        org.junit.Assert.assertArrayEquals(expressionArray90, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        java.lang.String str9 = coreOperationNotEqual6.getSymbol();
        java.lang.String str10 = coreOperationNotEqual6.getSymbol();
        java.lang.String str11 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        boolean boolean26 = coreOperationEqual21.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression45, expression46);
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression48, expression49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50);
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression52, expression53);
        boolean boolean55 = coreOperationEqual54.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual58 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression56, expression57);
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression59, expression60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual58, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual61);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62);
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression64, expression65);
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual69 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression67, expression68);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual66, expression68);
        java.lang.String str71 = coreOperationNotEqual70.getSymbol();
        boolean boolean72 = coreOperationEqual50.equal((java.lang.Object) coreOperationNotEqual63, (java.lang.Object) coreOperationNotEqual70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50);
        java.util.Iterator iterator74 = null;
        java.util.Iterator iterator75 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = coreOperationEqual73.findMatch(iterator74, iterator75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!=" + "'", str9, "!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!=" + "'", str10, "!=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!=" + "'", str11, "!=");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "!=" + "'", str71, "!=");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression6, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, expression14);
        boolean boolean17 = coreOperationEqual12.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8);
        java.lang.String str28 = coreOperationNotEqual27.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        boolean boolean32 = coreOperationEqual31.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39);
        java.lang.String str41 = coreOperationNotEqual40.getSymbol();
        int int42 = coreOperationNotEqual40.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual40);
        boolean boolean44 = coreOperationNotEqual27.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = coreOperationNotEqual27.computeValue(evalContext45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "!=" + "'", str28, "!=");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "!=" + "'", str41, "!=");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        int int16 = coreOperationEqual13.getPrecedence();
        java.lang.String str17 = coreOperationEqual13.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray18 = coreOperationEqual13.getArguments();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator20 = coreOperationEqual13.iterate(evalContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertNotNull(expressionArray18);
        org.junit.Assert.assertArrayEquals(expressionArray18, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        boolean boolean35 = coreOperationEqual30.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int44 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int46 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression48, expression49);
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression61, expression62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60, expression62);
        boolean boolean65 = coreOperationEqual60.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression66, expression67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression48, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56);
        java.lang.String str76 = coreOperationNotEqual75.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression78 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression77, expression78);
        boolean boolean80 = coreOperationEqual79.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression81 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression82 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression81, expression82);
        org.apache.commons.jxpath.ri.compiler.Expression expression84 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression85 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual86 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression84, expression85);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual83, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual86);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual88 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual79, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual87);
        java.lang.String str89 = coreOperationNotEqual88.getSymbol();
        int int90 = coreOperationNotEqual88.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual91 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual75, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual88);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual92 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual88);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual93 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual92);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "!=" + "'", str76, "!=");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "!=" + "'", str89, "!=");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        java.lang.String str16 = coreOperationEqual13.getSymbol();
        int int17 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, expression22);
        java.lang.String str25 = coreOperationNotEqual24.getSymbol();
        java.lang.String str26 = coreOperationNotEqual24.getSymbol();
        java.lang.String str27 = coreOperationNotEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual24);
        java.lang.String str29 = coreOperationEqual28.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray30 = coreOperationEqual28.getArguments();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!=" + "'", str25, "!=");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!=" + "'", str27, "!=");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "=" + "'", str29, "=");
        org.junit.Assert.assertNotNull(expressionArray30);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        int int12 = coreOperationEqual10.getPrecedence();
        java.lang.String str13 = coreOperationEqual10.getSymbol();
        java.lang.String str14 = coreOperationEqual10.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray15 = coreOperationEqual10.getArguments();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = coreOperationEqual10.computeValue(evalContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertNotNull(expressionArray15);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression6, expression7);
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11);
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15, expression17);
        boolean boolean20 = coreOperationEqual15.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression3, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11);
        java.lang.String str31 = coreOperationNotEqual30.getSymbol();
        java.lang.String str32 = coreOperationNotEqual30.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = coreOperationEqual2.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "!=" + "'", str31, "!=");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "!=" + "'", str32, "!=");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        java.lang.String str16 = coreOperationEqual13.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        boolean boolean20 = coreOperationEqual19.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, expression35);
        boolean boolean38 = coreOperationEqual33.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual48);
        java.lang.String str50 = coreOperationNotEqual48.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual58 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual48, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual48);
        java.lang.String str60 = coreOperationNotEqual48.getSymbol();
        java.lang.String str61 = coreOperationNotEqual48.getSymbol();
        int int62 = coreOperationNotEqual48.getPrecedence();
        java.lang.String str63 = coreOperationNotEqual48.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = coreOperationNotEqual48.computeValue(evalContext64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "!=" + "'", str50, "!=");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "!=" + "'", str60, "!=");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "!=" + "'", str61, "!=");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "!=" + "'", str63, "!=");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        java.lang.Class<?> wildcardClass28 = coreOperationEqual5.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        boolean boolean14 = coreOperationEqual13.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, expression27);
        java.lang.String str30 = coreOperationNotEqual29.getSymbol();
        boolean boolean31 = coreOperationEqual9.equal((java.lang.Object) coreOperationNotEqual22, (java.lang.Object) coreOperationNotEqual29);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, expression36);
        boolean boolean39 = coreOperationEqual34.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        int int48 = coreOperationEqual45.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray50 = coreOperationNotEqual29.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        boolean boolean54 = coreOperationEqual53.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual61);
        boolean boolean63 = coreOperationNotEqual62.isSymmetric();
        java.lang.String str64 = coreOperationNotEqual62.getSymbol();
        boolean boolean65 = coreOperationNotEqual62.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray66 = coreOperationNotEqual62.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        boolean boolean72 = coreOperationEqual71.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression73, expression74);
        org.apache.commons.jxpath.ri.compiler.Expression expression76 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression76, expression77);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual78);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual79);
        org.apache.commons.jxpath.ri.compiler.Expression expression81 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression82 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression81, expression82);
        boolean boolean84 = coreOperationEqual83.isSymmetric();
        int int85 = coreOperationEqual83.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray86 = coreOperationEqual83.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual80, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual83);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual88 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual68, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual87);
        java.lang.String str89 = coreOperationNotEqual68.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext90 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj91 = coreOperationNotEqual68.computeValue(evalContext90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "!=" + "'", str30, "!=");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(expressionArray50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "!=" + "'", str64, "!=");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(expressionArray66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertNotNull(expressionArray86);
        org.junit.Assert.assertArrayEquals(expressionArray86, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "!=" + "'", str89, "!=");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        java.lang.String str32 = coreOperationNotEqual31.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        java.lang.Object obj34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        java.lang.String str38 = coreOperationEqual37.getSymbol();
        boolean boolean39 = coreOperationNotEqual31.equal(obj34, (java.lang.Object) coreOperationEqual37);
        boolean boolean40 = coreOperationNotEqual31.isSymmetric();
        java.util.Iterator iterator41 = null;
        java.util.Iterator iterator42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = coreOperationNotEqual31.findMatch(iterator41, iterator42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "!=" + "'", str32, "!=");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "=" + "'", str38, "=");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, expression13);
        boolean boolean16 = coreOperationEqual11.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        boolean boolean29 = coreOperationEqual28.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        int int38 = coreOperationEqual36.getPrecedence();
        java.lang.String str39 = coreOperationEqual36.getSymbol();
        java.lang.String str40 = coreOperationEqual36.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray42 = coreOperationEqual36.getArguments();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "=" + "'", str39, "=");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "=" + "'", str40, "=");
        org.junit.Assert.assertNotNull(expressionArray42);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, expression13);
        boolean boolean16 = coreOperationEqual11.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        boolean boolean26 = coreOperationNotEqual6.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        boolean boolean30 = coreOperationEqual29.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        boolean boolean42 = coreOperationEqual41.isSymmetric();
        int int43 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray44 = coreOperationEqual41.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        java.lang.String str47 = coreOperationEqual41.getSymbol();
        java.lang.String str48 = coreOperationEqual41.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = coreOperationEqual41.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(expressionArray44);
        org.junit.Assert.assertArrayEquals(expressionArray44, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "=" + "'", str47, "=");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "=" + "'", str48, "=");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        java.lang.String str9 = coreOperationNotEqual6.getSymbol();
        java.lang.String str10 = coreOperationNotEqual6.getSymbol();
        java.lang.String str11 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        boolean boolean22 = coreOperationEqual21.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, expression35);
        java.lang.String str38 = coreOperationNotEqual37.getSymbol();
        boolean boolean39 = coreOperationEqual17.equal((java.lang.Object) coreOperationNotEqual30, (java.lang.Object) coreOperationNotEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, expression44);
        boolean boolean47 = coreOperationEqual42.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression48, expression49);
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        int int56 = coreOperationEqual53.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual37, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        java.lang.String str58 = coreOperationNotEqual57.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57);
        java.lang.String str60 = coreOperationNotEqual59.getSymbol();
        java.lang.String str61 = coreOperationNotEqual59.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray62 = coreOperationNotEqual59.getArguments();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!=" + "'", str9, "!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!=" + "'", str10, "!=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!=" + "'", str11, "!=");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "!=" + "'", str38, "!=");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "!=" + "'", str58, "!=");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "!=" + "'", str60, "!=");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "!=" + "'", str61, "!=");
        org.junit.Assert.assertNotNull(expressionArray62);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray16 = coreOperationNotEqual15.getArguments();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(expressionArray16);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        boolean boolean22 = coreOperationEqual21.isSymmetric();
        int int23 = coreOperationEqual21.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray24 = coreOperationEqual21.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        boolean boolean30 = coreOperationEqual29.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        boolean boolean42 = coreOperationEqual41.isSymmetric();
        int int43 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray44 = coreOperationEqual41.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        boolean boolean46 = coreOperationNotEqual38.isSymmetric();
        int int47 = coreOperationNotEqual38.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38);
        org.apache.commons.jxpath.ri.EvalContext evalContext49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = coreOperationNotEqual48.computeValue(evalContext49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(expressionArray24);
        org.junit.Assert.assertArrayEquals(expressionArray24, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(expressionArray44);
        org.junit.Assert.assertArrayEquals(expressionArray44, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, expression12);
        java.lang.String str15 = coreOperationNotEqual14.getSymbol();
        java.lang.String str16 = coreOperationNotEqual14.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, expression21);
        boolean boolean24 = coreOperationEqual19.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual14, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression38, expression39);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40);
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        boolean boolean45 = coreOperationEqual44.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression46, expression47);
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression49, expression50);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression57, expression58);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56, expression58);
        java.lang.String str61 = coreOperationNotEqual60.getSymbol();
        boolean boolean62 = coreOperationEqual40.equal((java.lang.Object) coreOperationNotEqual53, (java.lang.Object) coreOperationNotEqual60);
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression63, expression64);
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression66, expression67);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual69 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual65, expression67);
        boolean boolean70 = coreOperationEqual65.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression71, expression72);
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression75 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression74, expression75);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual76);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual65, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual76);
        int int79 = coreOperationEqual76.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual60, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual76);
        int int81 = coreOperationEqual76.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual82 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual76);
        boolean boolean83 = coreOperationEqual76.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray84 = coreOperationEqual76.getArguments();
        boolean boolean85 = coreOperationEqual76.isSymmetric();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = coreOperationEqual76.computeContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!=" + "'", str15, "!=");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!=" + "'", str16, "!=");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "!=" + "'", str61, "!=");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(expressionArray84);
        org.junit.Assert.assertArrayEquals(expressionArray84, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        boolean boolean18 = coreOperationEqual17.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, expression31);
        java.lang.String str34 = coreOperationNotEqual33.getSymbol();
        boolean boolean35 = coreOperationEqual13.equal((java.lang.Object) coreOperationNotEqual26, (java.lang.Object) coreOperationNotEqual33);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, expression40);
        boolean boolean43 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        int int52 = coreOperationEqual49.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual33);
        java.lang.String str55 = coreOperationNotEqual33.getSymbol();
        java.lang.String str56 = coreOperationNotEqual33.getSymbol();
        int int57 = coreOperationNotEqual33.getPrecedence();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "!=" + "'", str34, "!=");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "!=" + "'", str55, "!=");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "!=" + "'", str56, "!=");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        boolean boolean35 = coreOperationEqual30.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int44 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray46 = coreOperationNotEqual25.getArguments();
        java.lang.Class<?> wildcardClass47 = coreOperationNotEqual25.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(expressionArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        boolean boolean22 = coreOperationEqual21.isSymmetric();
        int int23 = coreOperationEqual21.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray24 = coreOperationEqual21.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        java.lang.String str27 = coreOperationEqual2.getSymbol();
        java.lang.String str28 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, expression33);
        java.lang.String str36 = coreOperationNotEqual35.getSymbol();
        java.lang.String str37 = coreOperationNotEqual35.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression38, expression39);
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression41, expression42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40, expression42);
        boolean boolean45 = coreOperationEqual40.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression46, expression47);
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression49, expression50);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual51);
        java.lang.String str55 = coreOperationEqual54.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54);
        java.lang.String str57 = coreOperationEqual54.getSymbol();
        java.lang.String str58 = coreOperationEqual54.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(expressionArray24);
        org.junit.Assert.assertArrayEquals(expressionArray24, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "=" + "'", str27, "=");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "=" + "'", str28, "=");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "!=" + "'", str36, "!=");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "!=" + "'", str37, "!=");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "=" + "'", str55, "=");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "=" + "'", str57, "=");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "=" + "'", str58, "=");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        int int4 = coreOperationEqual2.getPrecedence();
        java.lang.String str5 = coreOperationEqual2.getSymbol();
        java.lang.String str6 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        java.lang.String str10 = coreOperationEqual9.getSymbol();
        int int11 = coreOperationEqual9.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14, expression16);
        boolean boolean19 = coreOperationEqual14.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        int int28 = coreOperationEqual25.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, expression33);
        boolean boolean36 = coreOperationEqual31.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression37, expression38);
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        java.lang.String str45 = coreOperationEqual42.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual46);
        int int48 = coreOperationNotEqual46.getPrecedence();
        java.lang.String str49 = coreOperationNotEqual46.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual46);
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator52 = coreOperationNotEqual46.iterate(evalContext51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "=" + "'", str45, "=");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "!=" + "'", str49, "!=");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        java.lang.String str9 = coreOperationNotEqual6.getSymbol();
        java.lang.String str10 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        java.lang.String str14 = coreOperationEqual13.getSymbol();
        int int15 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, expression20);
        boolean boolean23 = coreOperationEqual18.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        int int32 = coreOperationEqual29.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35, expression37);
        boolean boolean40 = coreOperationEqual35.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression41, expression42);
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual43, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46);
        java.lang.String str49 = coreOperationEqual46.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual50);
        java.lang.String str52 = coreOperationEqual51.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression53, expression54);
        boolean boolean56 = coreOperationEqual55.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression57, expression58);
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression60, expression61);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual55, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63);
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression65, expression66);
        boolean boolean68 = coreOperationEqual67.isSymmetric();
        int int69 = coreOperationEqual67.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray70 = coreOperationEqual67.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual64, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67);
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression72, expression73);
        org.apache.commons.jxpath.ri.compiler.Expression expression75 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression76 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression75, expression76);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual74, expression76);
        boolean boolean79 = coreOperationEqual74.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression80 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression81 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual82 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression80, expression81);
        org.apache.commons.jxpath.ri.compiler.Expression expression83 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression84 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual85 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression83, expression84);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual86 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual82, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual85);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual74, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual85);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual88 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual85);
        boolean boolean89 = coreOperationNotEqual6.equal((java.lang.Object) coreOperationEqual51, (java.lang.Object) coreOperationNotEqual88);
        java.lang.String str90 = coreOperationNotEqual88.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray91 = coreOperationNotEqual88.getArguments();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!=" + "'", str9, "!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!=" + "'", str10, "!=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "=" + "'", str49, "=");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "=" + "'", str52, "=");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(expressionArray70);
        org.junit.Assert.assertArrayEquals(expressionArray70, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "!=" + "'", str90, "!=");
        org.junit.Assert.assertNotNull(expressionArray91);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        java.lang.String str32 = coreOperationNotEqual31.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        int int34 = coreOperationNotEqual31.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31, expression35);
        java.util.Iterator iterator37 = null;
        java.util.Iterator iterator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = coreOperationNotEqual36.findMatch(iterator37, iterator38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "!=" + "'", str32, "!=");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        boolean boolean20 = coreOperationEqual19.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        boolean boolean32 = coreOperationEqual31.isSymmetric();
        int int33 = coreOperationEqual31.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray34 = coreOperationEqual31.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, expression40);
        boolean boolean43 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual52);
        java.lang.String str54 = coreOperationEqual53.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        boolean boolean56 = coreOperationEqual55.isSymmetric();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(expressionArray34);
        org.junit.Assert.assertArrayEquals(expressionArray34, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "=" + "'", str54, "=");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, expression21);
        java.lang.String str24 = coreOperationEqual19.getSymbol();
        boolean boolean25 = coreOperationEqual13.equal((java.lang.Object) 10.0f, (java.lang.Object) str24);
        java.lang.String str26 = coreOperationEqual13.getSymbol();
        boolean boolean27 = coreOperationEqual13.isSymmetric();
        java.lang.String str28 = coreOperationEqual13.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = coreOperationEqual13.computeValue(evalContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "=" + "'", str24, "=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "=" + "'", str26, "=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "=" + "'", str28, "=");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        java.lang.String str19 = coreOperationEqual18.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual15, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18);
        java.lang.String str21 = coreOperationEqual18.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        boolean boolean25 = coreOperationEqual24.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, expression40);
        boolean boolean43 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression26, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34);
        java.lang.String str54 = coreOperationNotEqual53.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual53);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24);
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression57, expression58);
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression60, expression61);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59, expression61);
        boolean boolean64 = coreOperationEqual59.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression65, expression66);
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression68, expression69);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70);
        int int73 = coreOperationNotEqual72.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual72);
        java.lang.String str75 = coreOperationEqual74.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=" + "'", str19, "=");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "=" + "'", str21, "=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "!=" + "'", str54, "!=");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "=" + "'", str75, "=");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, expression19);
        boolean boolean22 = coreOperationEqual17.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        boolean boolean42 = coreOperationEqual41.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression46, expression47);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, expression55);
        java.lang.String str58 = coreOperationNotEqual57.getSymbol();
        boolean boolean59 = coreOperationEqual37.equal((java.lang.Object) coreOperationNotEqual50, (java.lang.Object) coreOperationNotEqual57);
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression60, expression61);
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression63, expression64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62, expression64);
        boolean boolean67 = coreOperationEqual62.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression68, expression69);
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression71, expression72);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        int int76 = coreOperationEqual73.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57);
        java.lang.String str79 = coreOperationNotEqual78.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual78);
        org.apache.commons.jxpath.ri.EvalContext evalContext81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj82 = coreOperationEqual2.computeValue(evalContext81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "!=" + "'", str58, "!=");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "!=" + "'", str79, "!=");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression6, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, expression14);
        boolean boolean17 = coreOperationEqual12.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8);
        java.lang.String str28 = coreOperationNotEqual27.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        boolean boolean32 = coreOperationEqual31.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39);
        java.lang.String str41 = coreOperationNotEqual40.getSymbol();
        int int42 = coreOperationNotEqual40.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual40);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray44 = coreOperationNotEqual43.getArguments();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = coreOperationNotEqual43.computeValue(evalContext45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "!=" + "'", str28, "!=");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "!=" + "'", str41, "!=");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(expressionArray44);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        boolean boolean22 = coreOperationEqual21.isSymmetric();
        int int23 = coreOperationEqual21.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray24 = coreOperationEqual21.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        boolean boolean30 = coreOperationEqual29.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        boolean boolean42 = coreOperationEqual41.isSymmetric();
        int int43 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray44 = coreOperationEqual41.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        boolean boolean46 = coreOperationNotEqual38.isSymmetric();
        int int47 = coreOperationNotEqual38.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38);
        boolean boolean49 = coreOperationNotEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray50 = coreOperationNotEqual38.getArguments();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(expressionArray24);
        org.junit.Assert.assertArrayEquals(expressionArray24, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(expressionArray44);
        org.junit.Assert.assertArrayEquals(expressionArray44, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(expressionArray50);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = coreOperationEqual6.compute(evalContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        int int16 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, expression21);
        boolean boolean24 = coreOperationEqual19.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        java.lang.String str33 = coreOperationEqual30.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        java.lang.String str35 = coreOperationEqual13.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        boolean boolean39 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46);
        boolean boolean48 = coreOperationNotEqual47.isSymmetric();
        boolean boolean51 = coreOperationNotEqual47.equal((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual47);
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = coreOperationEqual52.computeValue(evalContext53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "=" + "'", str33, "=");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "=" + "'", str35, "=");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, expression21);
        java.lang.String str24 = coreOperationEqual19.getSymbol();
        boolean boolean25 = coreOperationEqual13.equal((java.lang.Object) 10.0f, (java.lang.Object) str24);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray26 = coreOperationEqual13.getArguments();
        java.lang.String str27 = coreOperationEqual13.getSymbol();
        boolean boolean28 = coreOperationEqual13.isSymmetric();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "=" + "'", str24, "=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(expressionArray26);
        org.junit.Assert.assertArrayEquals(expressionArray26, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "=" + "'", str27, "=");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        boolean boolean35 = coreOperationEqual30.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int44 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        java.lang.String str46 = coreOperationNotEqual25.getSymbol();
        boolean boolean47 = coreOperationNotEqual25.isSymmetric();
        boolean boolean48 = coreOperationNotEqual25.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = coreOperationNotEqual25.compute(evalContext49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "!=" + "'", str46, "!=");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        java.lang.String str33 = coreOperationNotEqual31.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray34 = coreOperationNotEqual31.getArguments();
        java.lang.String str35 = coreOperationNotEqual31.getSymbol();
        java.lang.String str36 = coreOperationNotEqual31.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "!=" + "'", str33, "!=");
        org.junit.Assert.assertNotNull(expressionArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "!=" + "'", str35, "!=");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "!=" + "'", str36, "!=");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = coreOperationEqual2.computeContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        java.lang.String str16 = coreOperationEqual13.getSymbol();
        java.lang.String str17 = coreOperationEqual13.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, expression22);
        boolean boolean25 = coreOperationEqual20.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, expression35);
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression38, expression39);
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression41, expression42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40, expression42);
        java.lang.String str45 = coreOperationNotEqual44.getSymbol();
        java.lang.String str46 = coreOperationNotEqual44.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression50, expression51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, expression51);
        boolean boolean54 = coreOperationEqual49.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        java.lang.String str64 = coreOperationEqual60.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual69 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression67, expression68);
        boolean boolean70 = coreOperationEqual69.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression71, expression72);
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression75 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression74, expression75);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual76);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual69, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual77);
        boolean boolean79 = coreOperationNotEqual78.isSymmetric();
        boolean boolean82 = coreOperationNotEqual78.equal((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str83 = coreOperationNotEqual78.getSymbol();
        int int84 = coreOperationNotEqual78.getPrecedence();
        java.lang.String str85 = coreOperationNotEqual78.getSymbol();
        int int86 = coreOperationNotEqual78.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual66, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual78);
        java.lang.String str88 = coreOperationNotEqual87.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext89 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator90 = coreOperationNotEqual87.iterate(evalContext89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "!=" + "'", str45, "!=");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "!=" + "'", str46, "!=");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "=" + "'", str64, "=");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "!=" + "'", str83, "!=");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "!=" + "'", str85, "!=");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "!=" + "'", str88, "!=");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        java.lang.String str32 = coreOperationNotEqual31.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        java.lang.Object obj34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        java.lang.String str38 = coreOperationEqual37.getSymbol();
        boolean boolean39 = coreOperationNotEqual31.equal(obj34, (java.lang.Object) coreOperationEqual37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = coreOperationEqual37.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "!=" + "'", str32, "!=");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "=" + "'", str38, "=");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        boolean boolean11 = coreOperationEqual10.isSymmetric();
        int int12 = coreOperationEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray13 = coreOperationEqual10.getArguments();
        java.lang.Class<?> wildcardClass14 = coreOperationEqual10.getClass();
        boolean boolean15 = coreOperationEqual6.equal((java.lang.Object) 0, (java.lang.Object) wildcardClass14);
        int int16 = coreOperationEqual6.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray17 = coreOperationEqual6.getArguments();
        int int18 = coreOperationEqual6.getPrecedence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = coreOperationEqual6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(expressionArray13);
        org.junit.Assert.assertArrayEquals(expressionArray13, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(expressionArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        boolean boolean15 = coreOperationEqual14.isSymmetric();
        int int16 = coreOperationEqual14.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray17 = coreOperationEqual14.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        boolean boolean26 = coreOperationEqual21.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, expression40);
        boolean boolean43 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression52, expression53);
        java.lang.String str55 = coreOperationEqual54.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual51, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual51);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray58 = coreOperationNotEqual35.getArguments();
        java.lang.String str59 = coreOperationNotEqual35.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = coreOperationNotEqual35.computeValue(evalContext60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(expressionArray17);
        org.junit.Assert.assertArrayEquals(expressionArray17, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "=" + "'", str55, "=");
        org.junit.Assert.assertNotNull(expressionArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "!=" + "'", str59, "!=");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        boolean boolean18 = coreOperationEqual17.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, expression31);
        java.lang.String str34 = coreOperationNotEqual33.getSymbol();
        boolean boolean35 = coreOperationEqual13.equal((java.lang.Object) coreOperationNotEqual26, (java.lang.Object) coreOperationNotEqual33);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, expression40);
        boolean boolean43 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        int int52 = coreOperationEqual49.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual33);
        java.lang.String str55 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, expression56);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "!=" + "'", str34, "!=");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "!=" + "'", str55, "!=");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        boolean boolean22 = coreOperationEqual21.isSymmetric();
        int int23 = coreOperationEqual21.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray24 = coreOperationEqual21.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        boolean boolean30 = coreOperationEqual29.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        boolean boolean42 = coreOperationEqual41.isSymmetric();
        int int43 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray44 = coreOperationEqual41.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        boolean boolean46 = coreOperationNotEqual38.isSymmetric();
        int int47 = coreOperationNotEqual38.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38);
        java.lang.String str49 = coreOperationEqual2.getSymbol();
        java.util.Iterator iterator50 = null;
        java.util.Iterator iterator51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = coreOperationEqual2.findMatch(iterator50, iterator51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(expressionArray24);
        org.junit.Assert.assertArrayEquals(expressionArray24, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(expressionArray44);
        org.junit.Assert.assertArrayEquals(expressionArray44, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "=" + "'", str49, "=");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, expression17);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22, expression24);
        java.lang.String str27 = coreOperationNotEqual26.getSymbol();
        java.lang.String str28 = coreOperationNotEqual26.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, expression33);
        boolean boolean36 = coreOperationEqual31.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression37, expression38);
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual26, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        java.lang.String str46 = coreOperationEqual42.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        java.lang.String str48 = coreOperationEqual47.getSymbol();
        boolean boolean49 = coreOperationEqual47.isSymmetric();
        java.lang.String str50 = coreOperationEqual47.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!=" + "'", str27, "!=");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "!=" + "'", str28, "!=");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "=" + "'", str46, "=");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "=" + "'", str48, "=");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "=" + "'", str50, "=");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        boolean boolean35 = coreOperationEqual30.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int44 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        java.lang.String str46 = coreOperationNotEqual25.getSymbol();
        boolean boolean47 = coreOperationNotEqual25.isSymmetric();
        boolean boolean48 = coreOperationNotEqual25.isSymmetric();
        int int49 = coreOperationNotEqual25.getPrecedence();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator51 = coreOperationNotEqual25.iteratePointers(evalContext50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "!=" + "'", str46, "!=");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        java.lang.String str33 = coreOperationNotEqual31.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression37, expression38);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36, expression38);
        boolean boolean41 = coreOperationEqual36.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression45, expression46);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47);
        java.lang.String str50 = coreOperationEqual47.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47);
        int int52 = coreOperationNotEqual51.getPrecedence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "!=" + "'", str33, "!=");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "=" + "'", str50, "=");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        java.lang.String str16 = coreOperationEqual13.getSymbol();
        int int17 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, expression22);
        java.lang.String str25 = coreOperationNotEqual24.getSymbol();
        java.lang.String str26 = coreOperationNotEqual24.getSymbol();
        java.lang.String str27 = coreOperationNotEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual24);
        java.lang.String str29 = coreOperationNotEqual24.getSymbol();
        java.lang.String str30 = coreOperationNotEqual24.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = coreOperationNotEqual24.compute(evalContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!=" + "'", str25, "!=");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!=" + "'", str27, "!=");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "!=" + "'", str29, "!=");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "!=" + "'", str30, "!=");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, expression13);
        boolean boolean16 = coreOperationEqual11.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray26 = coreOperationNotEqual6.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        boolean boolean30 = coreOperationEqual29.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        boolean boolean39 = coreOperationNotEqual38.isSymmetric();
        java.lang.String str40 = coreOperationNotEqual38.getSymbol();
        boolean boolean41 = coreOperationNotEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression46, expression47);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48);
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression50, expression51);
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression53, expression54);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual52, expression54);
        boolean boolean57 = coreOperationEqual52.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression61, expression62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual52, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual52);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48);
        int int68 = coreOperationNotEqual67.getPrecedence();
        java.lang.String str69 = coreOperationNotEqual67.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression70, expression71);
        boolean boolean73 = coreOperationEqual72.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression75 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression74, expression75);
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression78 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression77, expression78);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual76, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual79);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual81 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual72, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual80);
        java.lang.String str82 = coreOperationNotEqual81.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual67, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual81);
        org.apache.commons.jxpath.ri.EvalContext evalContext84 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator85 = coreOperationNotEqual83.iterate(evalContext84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(expressionArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "!=" + "'", str40, "!=");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "!=" + "'", str69, "!=");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "!=" + "'", str82, "!=");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        int int16 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, expression21);
        boolean boolean24 = coreOperationEqual19.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        java.lang.String str33 = coreOperationEqual30.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        boolean boolean38 = coreOperationEqual37.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        boolean boolean50 = coreOperationEqual49.isSymmetric();
        int int51 = coreOperationEqual49.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray52 = coreOperationEqual49.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray54 = coreOperationEqual53.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        java.lang.String str56 = coreOperationNotEqual34.getSymbol();
        java.lang.String str57 = coreOperationNotEqual34.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "=" + "'", str33, "=");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(expressionArray52);
        org.junit.Assert.assertArrayEquals(expressionArray52, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertNotNull(expressionArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "!=" + "'", str56, "!=");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "!=" + "'", str57, "!=");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        java.lang.String str16 = coreOperationEqual13.getSymbol();
        int int17 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, expression22);
        java.lang.String str25 = coreOperationNotEqual24.getSymbol();
        java.lang.String str26 = coreOperationNotEqual24.getSymbol();
        java.lang.String str27 = coreOperationNotEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual24);
        java.lang.String str29 = coreOperationNotEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        boolean boolean33 = coreOperationEqual32.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression37, expression38);
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, expression48);
        boolean boolean51 = coreOperationEqual46.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression52, expression53);
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual58 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        java.lang.String str62 = coreOperationNotEqual61.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual61);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual63);
        org.apache.commons.jxpath.ri.EvalContext evalContext65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator66 = coreOperationNotEqual64.iteratePointers(evalContext65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!=" + "'", str25, "!=");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!=" + "'", str27, "!=");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "!=" + "'", str29, "!=");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "!=" + "'", str62, "!=");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        boolean boolean12 = coreOperationNotEqual11.isSymmetric();
        java.lang.String str13 = coreOperationNotEqual11.getSymbol();
        java.lang.String str14 = coreOperationNotEqual11.getSymbol();
        java.lang.String str15 = coreOperationNotEqual11.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        boolean boolean19 = coreOperationEqual18.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26);
        boolean boolean28 = coreOperationNotEqual27.isSymmetric();
        boolean boolean31 = coreOperationNotEqual27.equal((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual27);
        int int33 = coreOperationNotEqual32.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray34 = coreOperationNotEqual32.getArguments();
        java.lang.String str35 = coreOperationNotEqual32.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!=" + "'", str13, "!=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!=" + "'", str14, "!=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!=" + "'", str15, "!=");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(expressionArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "!=" + "'", str35, "!=");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        boolean boolean14 = coreOperationEqual13.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, expression27);
        java.lang.String str30 = coreOperationNotEqual29.getSymbol();
        boolean boolean31 = coreOperationEqual9.equal((java.lang.Object) coreOperationNotEqual22, (java.lang.Object) coreOperationNotEqual29);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, expression36);
        boolean boolean39 = coreOperationEqual34.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        int int48 = coreOperationEqual45.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray50 = coreOperationNotEqual29.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        boolean boolean54 = coreOperationEqual53.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual61);
        boolean boolean63 = coreOperationNotEqual62.isSymmetric();
        java.lang.String str64 = coreOperationNotEqual62.getSymbol();
        boolean boolean65 = coreOperationNotEqual62.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray66 = coreOperationNotEqual62.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        boolean boolean72 = coreOperationEqual71.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression73, expression74);
        org.apache.commons.jxpath.ri.compiler.Expression expression76 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression76, expression77);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual78);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual79);
        org.apache.commons.jxpath.ri.compiler.Expression expression81 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression82 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression81, expression82);
        boolean boolean84 = coreOperationEqual83.isSymmetric();
        int int85 = coreOperationEqual83.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray86 = coreOperationEqual83.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual80, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual83);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual88 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual68, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual87);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = coreOperationNotEqual68.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "!=" + "'", str30, "!=");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(expressionArray50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "!=" + "'", str64, "!=");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(expressionArray66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertNotNull(expressionArray86);
        org.junit.Assert.assertArrayEquals(expressionArray86, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        int int8 = coreOperationEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression10);
        boolean boolean12 = coreOperationEqual11.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, expression27);
        boolean boolean30 = coreOperationEqual25.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual40);
        java.lang.String str42 = coreOperationNotEqual40.getSymbol();
        java.lang.String str43 = coreOperationNotEqual40.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        boolean boolean47 = coreOperationEqual46.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression48, expression49);
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54);
        boolean boolean56 = coreOperationNotEqual55.isSymmetric();
        boolean boolean59 = coreOperationNotEqual55.equal((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual40, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual55);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray61 = coreOperationNotEqual60.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual60);
        java.lang.String str63 = coreOperationNotEqual60.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = coreOperationNotEqual60.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "!=" + "'", str42, "!=");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "!=" + "'", str43, "!=");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(expressionArray61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "!=" + "'", str63, "!=");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression2 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression2);
        boolean boolean4 = coreOperationEqual3.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, expression19);
        boolean boolean22 = coreOperationEqual17.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual3, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression37, expression38);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36, expression38);
        java.lang.String str41 = coreOperationEqual36.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression45, expression46);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44, expression46);
        java.lang.String str49 = coreOperationNotEqual48.getSymbol();
        java.lang.String str50 = coreOperationNotEqual48.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, expression55);
        boolean boolean58 = coreOperationEqual53.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression59, expression60);
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression62, expression63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual61, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual48, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67);
        int int69 = coreOperationNotEqual68.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual68);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33);
        int int72 = coreOperationEqual33.getPrecedence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "=" + "'", str41, "=");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "!=" + "'", str49, "!=");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "!=" + "'", str50, "!=");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationNotEqual6.getSymbol();
        java.lang.String str8 = coreOperationNotEqual6.getSymbol();
        java.lang.String str9 = coreOperationNotEqual6.getSymbol();
        java.lang.String str10 = coreOperationNotEqual6.getSymbol();
        int int11 = coreOperationNotEqual6.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15, expression17);
        java.lang.String str20 = coreOperationNotEqual19.getSymbol();
        java.lang.String str21 = coreOperationNotEqual19.getSymbol();
        java.lang.String str22 = coreOperationNotEqual19.getSymbol();
        java.lang.String str23 = coreOperationNotEqual19.getSymbol();
        java.lang.String str24 = coreOperationNotEqual19.getSymbol();
        boolean boolean25 = coreOperationNotEqual19.isSymmetric();
        boolean boolean26 = coreOperationNotEqual6.equal((java.lang.Object) '4', (java.lang.Object) coreOperationNotEqual19);
        java.lang.String str27 = coreOperationNotEqual19.getSymbol();
        java.lang.String str28 = coreOperationNotEqual19.getSymbol();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!=" + "'", str7, "!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!=" + "'", str9, "!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!=" + "'", str10, "!=");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "!=" + "'", str20, "!=");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!=" + "'", str21, "!=");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "!=" + "'", str22, "!=");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "!=" + "'", str23, "!=");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "!=" + "'", str24, "!=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!=" + "'", str27, "!=");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "!=" + "'", str28, "!=");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        boolean boolean35 = coreOperationEqual30.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int44 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        java.lang.String str46 = coreOperationNotEqual45.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        boolean boolean50 = coreOperationEqual49.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression57, expression58);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59);
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression61, expression62);
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression64, expression65);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63, expression65);
        boolean boolean68 = coreOperationEqual63.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression72, expression73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual74);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual74);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression51, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59);
        java.lang.String str79 = coreOperationNotEqual78.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual78);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray81 = coreOperationNotEqual80.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual82 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual45, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual80);
        java.lang.String str83 = coreOperationNotEqual80.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray84 = coreOperationNotEqual80.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray85 = coreOperationNotEqual80.getArguments();
        java.util.Iterator iterator86 = null;
        java.util.Iterator iterator87 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = coreOperationNotEqual80.findMatch(iterator86, iterator87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "!=" + "'", str46, "!=");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "!=" + "'", str79, "!=");
        org.junit.Assert.assertNotNull(expressionArray81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "!=" + "'", str83, "!=");
        org.junit.Assert.assertNotNull(expressionArray84);
        org.junit.Assert.assertNotNull(expressionArray85);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        boolean boolean22 = coreOperationEqual21.isSymmetric();
        int int23 = coreOperationEqual21.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray24 = coreOperationEqual21.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        java.lang.String str27 = coreOperationEqual2.getSymbol();
        java.lang.String str28 = coreOperationEqual2.getSymbol();
        boolean boolean29 = coreOperationEqual2.isSymmetric();
        int int30 = coreOperationEqual2.getPrecedence();
        java.util.Iterator iterator31 = null;
        java.lang.Object obj32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = coreOperationEqual2.contains(iterator31, obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(expressionArray24);
        org.junit.Assert.assertArrayEquals(expressionArray24, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "=" + "'", str27, "=");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "=" + "'", str28, "=");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, expression19);
        boolean boolean22 = coreOperationEqual17.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        boolean boolean42 = coreOperationEqual41.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression46, expression47);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, expression55);
        java.lang.String str58 = coreOperationNotEqual57.getSymbol();
        boolean boolean59 = coreOperationEqual37.equal((java.lang.Object) coreOperationNotEqual50, (java.lang.Object) coreOperationNotEqual57);
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression60, expression61);
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression63, expression64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62, expression64);
        boolean boolean67 = coreOperationEqual62.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression68, expression69);
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression71, expression72);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        int int76 = coreOperationEqual73.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57);
        java.lang.String str79 = coreOperationNotEqual78.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual78);
        java.lang.String str81 = coreOperationNotEqual78.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray82 = coreOperationNotEqual78.getArguments();
        java.lang.String str83 = coreOperationNotEqual78.getSymbol();
        java.util.Iterator iterator84 = null;
        java.util.Iterator iterator85 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = coreOperationNotEqual78.findMatch(iterator84, iterator85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "!=" + "'", str58, "!=");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "!=" + "'", str79, "!=");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "!=" + "'", str81, "!=");
        org.junit.Assert.assertNotNull(expressionArray82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "!=" + "'", str83, "!=");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        boolean boolean15 = coreOperationEqual14.isSymmetric();
        int int16 = coreOperationEqual14.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray17 = coreOperationEqual14.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        boolean boolean29 = coreOperationEqual28.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression38, expression39);
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression41, expression42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40, expression42);
        java.lang.String str45 = coreOperationNotEqual44.getSymbol();
        boolean boolean46 = coreOperationEqual24.equal((java.lang.Object) coreOperationNotEqual37, (java.lang.Object) coreOperationNotEqual44);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression50, expression51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, expression51);
        boolean boolean54 = coreOperationEqual49.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        int int63 = coreOperationEqual60.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        int int65 = coreOperationNotEqual44.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression66, expression67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68, expression70);
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression73, expression74);
        boolean boolean76 = coreOperationEqual75.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression78 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression77, expression78);
        org.apache.commons.jxpath.ri.compiler.Expression expression80 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression81 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual82 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression80, expression81);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual79, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual82);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual84 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual83);
        org.apache.commons.jxpath.ri.compiler.Expression expression85 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression86 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression85, expression86);
        boolean boolean88 = coreOperationEqual87.isSymmetric();
        int int89 = coreOperationEqual87.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray90 = coreOperationEqual87.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual91 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual84, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual87);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual92 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual91);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual93 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual94 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual93);
        java.lang.String str95 = coreOperationNotEqual94.getSymbol();
        java.lang.String str96 = coreOperationNotEqual94.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj98 = coreOperationNotEqual94.computeValue(evalContext97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(expressionArray17);
        org.junit.Assert.assertArrayEquals(expressionArray17, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "!=" + "'", str45, "!=");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertNotNull(expressionArray90);
        org.junit.Assert.assertArrayEquals(expressionArray90, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "!=" + "'", str95, "!=");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "!=" + "'", str96, "!=");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        boolean boolean35 = coreOperationEqual30.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int44 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        java.lang.String str46 = coreOperationNotEqual45.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        boolean boolean50 = coreOperationEqual49.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression57, expression58);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59);
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression61, expression62);
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression64, expression65);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63, expression65);
        boolean boolean68 = coreOperationEqual63.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression72, expression73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual74);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual74);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression51, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59);
        java.lang.String str79 = coreOperationNotEqual78.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual78);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray81 = coreOperationNotEqual80.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual82 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual45, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual80);
        java.lang.String str83 = coreOperationNotEqual80.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray84 = coreOperationNotEqual80.getArguments();
        java.lang.String str85 = coreOperationNotEqual80.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "!=" + "'", str46, "!=");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "!=" + "'", str79, "!=");
        org.junit.Assert.assertNotNull(expressionArray81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "!=" + "'", str83, "!=");
        org.junit.Assert.assertNotNull(expressionArray84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "!=" + "'", str85, "!=");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        java.lang.String str33 = coreOperationNotEqual31.getSymbol();
        java.lang.String str34 = coreOperationNotEqual31.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        boolean boolean38 = coreOperationEqual37.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        boolean boolean47 = coreOperationNotEqual46.isSymmetric();
        boolean boolean50 = coreOperationNotEqual46.equal((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual46);
        java.lang.String str52 = coreOperationNotEqual51.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "!=" + "'", str33, "!=");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "!=" + "'", str34, "!=");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "!=" + "'", str52, "!=");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        boolean boolean14 = coreOperationEqual13.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, expression27);
        java.lang.String str30 = coreOperationNotEqual29.getSymbol();
        boolean boolean31 = coreOperationEqual9.equal((java.lang.Object) coreOperationNotEqual22, (java.lang.Object) coreOperationNotEqual29);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, expression36);
        boolean boolean39 = coreOperationEqual34.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        int int48 = coreOperationEqual45.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray50 = coreOperationNotEqual29.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        boolean boolean54 = coreOperationEqual53.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual61);
        boolean boolean63 = coreOperationNotEqual62.isSymmetric();
        java.lang.String str64 = coreOperationNotEqual62.getSymbol();
        boolean boolean65 = coreOperationNotEqual62.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray66 = coreOperationNotEqual62.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        boolean boolean72 = coreOperationEqual71.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression73, expression74);
        org.apache.commons.jxpath.ri.compiler.Expression expression76 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression76, expression77);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual78);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual79);
        org.apache.commons.jxpath.ri.compiler.Expression expression81 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression82 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression81, expression82);
        boolean boolean84 = coreOperationEqual83.isSymmetric();
        int int85 = coreOperationEqual83.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray86 = coreOperationEqual83.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual87 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual80, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual83);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual88 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual68, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual87);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray89 = coreOperationNotEqual68.getArguments();
        boolean boolean90 = coreOperationNotEqual68.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray91 = coreOperationNotEqual68.getArguments();
        int int92 = coreOperationNotEqual68.getPrecedence();
        org.apache.commons.jxpath.ri.EvalContext evalContext93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj94 = coreOperationNotEqual68.computeValue(evalContext93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "!=" + "'", str30, "!=");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(expressionArray50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "!=" + "'", str64, "!=");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(expressionArray66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertNotNull(expressionArray86);
        org.junit.Assert.assertArrayEquals(expressionArray86, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertNotNull(expressionArray89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(expressionArray91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 2 + "'", int92 == 2);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        boolean boolean35 = coreOperationEqual30.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        int int44 = coreOperationEqual41.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41);
        java.lang.String str46 = coreOperationNotEqual25.getSymbol();
        boolean boolean47 = coreOperationNotEqual25.isSymmetric();
        boolean boolean48 = coreOperationNotEqual25.isSymmetric();
        int int49 = coreOperationNotEqual25.getPrecedence();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = coreOperationNotEqual25.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "!=" + "'", str46, "!=");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression6, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, expression14);
        boolean boolean17 = coreOperationEqual12.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8);
        java.lang.String str28 = coreOperationNotEqual27.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        boolean boolean32 = coreOperationEqual31.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39);
        java.lang.String str41 = coreOperationNotEqual40.getSymbol();
        int int42 = coreOperationNotEqual40.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual40);
        boolean boolean44 = coreOperationNotEqual43.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = coreOperationNotEqual43.compute(evalContext45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "!=" + "'", str28, "!=");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "!=" + "'", str41, "!=");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        java.lang.String str19 = coreOperationEqual18.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual15, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18);
        java.lang.String str21 = coreOperationEqual20.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        boolean boolean25 = coreOperationEqual24.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        boolean boolean37 = coreOperationEqual36.isSymmetric();
        int int38 = coreOperationEqual36.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray39 = coreOperationEqual36.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression41, expression42);
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual43, expression45);
        boolean boolean48 = coreOperationEqual43.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression49, expression50);
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression52, expression53);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual51, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual43, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression61, expression62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60, expression62);
        boolean boolean65 = coreOperationEqual60.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression66, expression67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual71);
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression75 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression74, expression75);
        java.lang.String str77 = coreOperationEqual76.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual73, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual76);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual79 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray81 = coreOperationEqual20.getArguments();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = coreOperationEqual20.computeContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=" + "'", str19, "=");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "=" + "'", str21, "=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(expressionArray39);
        org.junit.Assert.assertArrayEquals(expressionArray39, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "=" + "'", str77, "=");
        org.junit.Assert.assertNotNull(expressionArray81);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        boolean boolean12 = coreOperationNotEqual11.isSymmetric();
        boolean boolean15 = coreOperationNotEqual11.equal((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str16 = coreOperationNotEqual11.getSymbol();
        java.lang.String str17 = coreOperationNotEqual11.getSymbol();
        java.lang.Class<?> wildcardClass18 = coreOperationNotEqual11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!=" + "'", str16, "!=");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "!=" + "'", str17, "!=");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        int int16 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, expression21);
        boolean boolean24 = coreOperationEqual19.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        java.lang.String str33 = coreOperationEqual30.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        boolean boolean38 = coreOperationEqual37.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        boolean boolean50 = coreOperationEqual49.isSymmetric();
        int int51 = coreOperationEqual49.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray52 = coreOperationEqual49.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray54 = coreOperationEqual53.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray56 = coreOperationNotEqual34.getArguments();
        boolean boolean57 = coreOperationNotEqual34.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = coreOperationNotEqual34.computeValue(evalContext58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "=" + "'", str33, "=");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(expressionArray52);
        org.junit.Assert.assertArrayEquals(expressionArray52, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertNotNull(expressionArray54);
        org.junit.Assert.assertNotNull(expressionArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        boolean boolean36 = coreOperationEqual35.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression37, expression38);
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual43);
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression45, expression46);
        boolean boolean48 = coreOperationEqual47.isSymmetric();
        int int49 = coreOperationEqual47.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray50 = coreOperationEqual47.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47);
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression52, expression53);
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression55, expression56);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual58 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54, expression56);
        boolean boolean59 = coreOperationEqual54.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression60, expression61);
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression63, expression64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual65);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual54, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual65);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual65);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual69 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual68);
        org.apache.commons.jxpath.ri.EvalContext evalContext70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator71 = coreOperationEqual2.iteratePointers(evalContext70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(expressionArray50);
        org.junit.Assert.assertArrayEquals(expressionArray50, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        java.lang.String str7 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, expression19);
        boolean boolean22 = coreOperationEqual17.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        boolean boolean42 = coreOperationEqual41.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression46, expression47);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, expression55);
        java.lang.String str58 = coreOperationNotEqual57.getSymbol();
        boolean boolean59 = coreOperationEqual37.equal((java.lang.Object) coreOperationNotEqual50, (java.lang.Object) coreOperationNotEqual57);
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression60, expression61);
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression64 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression63, expression64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62, expression64);
        boolean boolean67 = coreOperationEqual62.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression68, expression69);
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression71, expression72);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual62, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        int int76 = coreOperationEqual73.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual73);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual57);
        java.lang.String str79 = coreOperationNotEqual78.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual78);
        org.apache.commons.jxpath.ri.EvalContext evalContext81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator82 = coreOperationEqual2.iterate(evalContext81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "!=" + "'", str58, "!=");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "!=" + "'", str79, "!=");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, expression18);
        boolean boolean21 = coreOperationEqual16.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual12);
        java.lang.String str32 = coreOperationNotEqual31.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual31);
        int int34 = coreOperationNotEqual31.getPrecedence();
        java.lang.String str35 = coreOperationNotEqual31.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "!=" + "'", str32, "!=");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "!=" + "'", str35, "!=");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray28 = coreOperationNotEqual25.getArguments();
        java.lang.String str29 = coreOperationNotEqual25.getSymbol();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(expressionArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "!=" + "'", str29, "!=");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression2 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression2);
        boolean boolean4 = coreOperationEqual3.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual7, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual3, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11);
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        boolean boolean16 = coreOperationEqual15.isSymmetric();
        int int17 = coreOperationEqual15.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray18 = coreOperationEqual15.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray20 = coreOperationEqual19.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray21 = coreOperationEqual19.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = coreOperationEqual19.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(expressionArray18);
        org.junit.Assert.assertArrayEquals(expressionArray18, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertNotNull(expressionArray20);
        org.junit.Assert.assertNotNull(expressionArray21);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        java.lang.String str16 = coreOperationEqual13.getSymbol();
        int int17 = coreOperationEqual13.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression18, expression19);
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual20, expression22);
        java.lang.String str25 = coreOperationNotEqual24.getSymbol();
        java.lang.String str26 = coreOperationNotEqual24.getSymbol();
        java.lang.String str27 = coreOperationNotEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual24);
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        boolean boolean39 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46);
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression48, expression49);
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50, expression52);
        java.lang.String str55 = coreOperationNotEqual54.getSymbol();
        boolean boolean56 = coreOperationEqual34.equal((java.lang.Object) coreOperationNotEqual47, (java.lang.Object) coreOperationNotEqual54);
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression57, expression58);
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression60, expression61);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59, expression61);
        boolean boolean64 = coreOperationEqual59.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression65, expression66);
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression68, expression69);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70);
        int int73 = coreOperationEqual70.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual54, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70);
        java.lang.String str75 = coreOperationNotEqual74.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual74);
        java.lang.Class<?> wildcardClass77 = coreOperationNotEqual76.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!=" + "'", str25, "!=");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!=" + "'", str27, "!=");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "!=" + "'", str55, "!=");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "!=" + "'", str75, "!=");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, expression20);
        boolean boolean23 = coreOperationEqual18.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, expression36);
        boolean boolean39 = coreOperationEqual34.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression43, expression44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual42, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45);
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression48, expression49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual45, expression49);
        java.lang.Class<?> wildcardClass52 = coreOperationEqual45.getClass();
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression53, expression54);
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual58 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression56, expression57);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual55, expression57);
        java.lang.String str60 = coreOperationNotEqual59.getSymbol();
        java.lang.String str61 = coreOperationNotEqual59.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression62, expression63);
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression65, expression66);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual64, expression66);
        boolean boolean69 = coreOperationEqual64.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression70, expression71);
        org.apache.commons.jxpath.ri.compiler.Expression expression73 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression74 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression73, expression74);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual76 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual72, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual64, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual59, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual75);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray79 = coreOperationEqual75.getArguments();
        boolean boolean80 = coreOperationNotEqual31.equal((java.lang.Object) coreOperationEqual45, (java.lang.Object) expressionArray79);
        boolean boolean82 = coreOperationNotEqual15.equal((java.lang.Object) boolean80, (java.lang.Object) 100);
        java.lang.String str83 = coreOperationNotEqual15.getSymbol();
        boolean boolean84 = coreOperationNotEqual15.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = coreOperationNotEqual15.compute(evalContext85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "!=" + "'", str60, "!=");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "!=" + "'", str61, "!=");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(expressionArray79);
        org.junit.Assert.assertArrayEquals(expressionArray79, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "!=" + "'", str83, "!=");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        java.lang.String str19 = coreOperationEqual18.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual15, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18);
        java.lang.String str21 = coreOperationEqual18.getSymbol();
        java.lang.String str22 = coreOperationEqual18.getSymbol();
        int int23 = coreOperationEqual18.getPrecedence();
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = coreOperationEqual18.compute(evalContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=" + "'", str19, "=");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "=" + "'", str21, "=");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "=" + "'", str22, "=");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        boolean boolean10 = coreOperationEqual9.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression14, expression15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual16);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21, expression23);
        java.lang.String str26 = coreOperationNotEqual25.getSymbol();
        boolean boolean27 = coreOperationEqual5.equal((java.lang.Object) coreOperationNotEqual18, (java.lang.Object) coreOperationNotEqual25);
        boolean boolean28 = coreOperationNotEqual25.isSymmetric();
        java.lang.String str29 = coreOperationNotEqual25.getSymbol();
        java.lang.String str30 = coreOperationNotEqual25.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = coreOperationNotEqual25.computeValue(evalContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!=" + "'", str26, "!=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "!=" + "'", str29, "!=");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "!=" + "'", str30, "!=");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression2 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression2);
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual3, expression5);
        java.lang.String str8 = coreOperationNotEqual7.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        boolean boolean19 = coreOperationEqual18.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26);
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression28, expression29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual30, expression32);
        java.lang.String str35 = coreOperationNotEqual34.getSymbol();
        boolean boolean36 = coreOperationEqual14.equal((java.lang.Object) coreOperationNotEqual27, (java.lang.Object) coreOperationNotEqual34);
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression37, expression38);
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression40, expression41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39, expression41);
        boolean boolean44 = coreOperationEqual39.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression45, expression46);
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression48, expression49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual39, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50);
        int int53 = coreOperationEqual50.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual54 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual50);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual7, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual34);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual55);
        java.lang.String str57 = coreOperationEqual55.getSymbol();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!=" + "'", str8, "!=");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "!=" + "'", str35, "!=");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "=" + "'", str57, "=");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        java.lang.String str19 = coreOperationEqual18.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual15, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18);
        java.lang.String str21 = coreOperationEqual18.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        boolean boolean25 = coreOperationEqual24.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.Expression expression29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression29, expression30);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression32, expression33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, expression40);
        boolean boolean43 = coreOperationEqual38.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression44, expression45);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual50 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression26, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual34);
        java.lang.String str54 = coreOperationNotEqual53.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual53);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24);
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        boolean boolean61 = coreOperationEqual60.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression62, expression63);
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression65, expression66);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual64, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual69 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68);
        int int70 = coreOperationEqual68.getPrecedence();
        java.lang.String str71 = coreOperationEqual68.getSymbol();
        boolean boolean72 = coreOperationNotEqual56.equal((java.lang.Object) 1.0f, (java.lang.Object) str71);
        java.lang.String str73 = coreOperationNotEqual56.getSymbol();
        boolean boolean74 = coreOperationNotEqual56.isSymmetric();
        java.lang.String str75 = coreOperationNotEqual56.getSymbol();
        java.lang.String str76 = coreOperationNotEqual56.getSymbol();
        java.lang.String str77 = coreOperationNotEqual56.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray78 = coreOperationNotEqual56.getArguments();
        java.lang.Class<?> wildcardClass79 = coreOperationNotEqual56.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=" + "'", str19, "=");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "=" + "'", str21, "=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "!=" + "'", str54, "!=");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "=" + "'", str71, "=");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "!=" + "'", str73, "!=");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "!=" + "'", str75, "!=");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "!=" + "'", str76, "!=");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "!=" + "'", str77, "!=");
        org.junit.Assert.assertNotNull(expressionArray78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, expression4);
        boolean boolean7 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13);
        java.lang.String str16 = coreOperationEqual13.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        boolean boolean20 = coreOperationEqual19.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression21, expression22);
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual26, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, expression35);
        boolean boolean38 = coreOperationEqual33.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression40 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression39, expression40);
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual41, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual33);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression21, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual19, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual48);
        java.lang.String str50 = coreOperationNotEqual48.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual57 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual58 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual48, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual53);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual48);
        int int60 = coreOperationNotEqual48.getPrecedence();
        java.lang.Class<?> wildcardClass61 = coreOperationNotEqual48.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "!=" + "'", str50, "!=");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        boolean boolean12 = coreOperationNotEqual11.isSymmetric();
        java.lang.String str13 = coreOperationNotEqual11.getSymbol();
        java.lang.String str14 = coreOperationNotEqual11.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray15 = coreOperationNotEqual11.getArguments();
        boolean boolean16 = coreOperationNotEqual11.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression17, expression18);
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression21 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression20, expression21);
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual22, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression27, expression28);
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, expression31);
        boolean boolean34 = coreOperationEqual29.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression35, expression36);
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression38, expression39);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual37, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression17, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25);
        int int45 = coreOperationEqual25.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression46, expression47);
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression49, expression50);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual48, expression50);
        java.lang.String str53 = coreOperationNotEqual52.getSymbol();
        java.lang.String str54 = coreOperationNotEqual52.getSymbol();
        java.lang.String str55 = coreOperationNotEqual52.getSymbol();
        java.lang.String str56 = coreOperationNotEqual52.getSymbol();
        java.lang.String str57 = coreOperationNotEqual52.getSymbol();
        boolean boolean58 = coreOperationNotEqual52.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression60 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression59, expression60);
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression62, expression63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual61, expression63);
        java.lang.String str66 = coreOperationNotEqual65.getSymbol();
        java.lang.String str67 = coreOperationNotEqual65.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression68 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual70 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression68, expression69);
        org.apache.commons.jxpath.ri.compiler.Expression expression71 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression72 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression71, expression72);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual74 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70, expression72);
        boolean boolean75 = coreOperationEqual70.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression76 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression77 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual78 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression76, expression77);
        org.apache.commons.jxpath.ri.compiler.Expression expression79 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression80 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual81 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression79, expression80);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual82 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual78, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual81);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual83 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual70, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual81);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual84 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual65, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual81);
        boolean boolean85 = coreOperationNotEqual65.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual86 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual52, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual65);
        java.lang.Class<?> wildcardClass87 = coreOperationNotEqual86.getClass();
        boolean boolean88 = coreOperationNotEqual11.equal((java.lang.Object) coreOperationEqual25, (java.lang.Object) wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!=" + "'", str13, "!=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!=" + "'", str14, "!=");
        org.junit.Assert.assertNotNull(expressionArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "!=" + "'", str53, "!=");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "!=" + "'", str54, "!=");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "!=" + "'", str55, "!=");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "!=" + "'", str56, "!=");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "!=" + "'", str57, "!=");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "!=" + "'", str66, "!=");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "!=" + "'", str67, "!=");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        java.lang.String str12 = coreOperationNotEqual11.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = coreOperationNotEqual11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!=" + "'", str12, "!=");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        int int4 = coreOperationEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual7, expression9);
        boolean boolean12 = coreOperationEqual7.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression16, expression17);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual7, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18);
        int int21 = coreOperationEqual18.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression25, expression26);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, expression26);
        boolean boolean29 = coreOperationEqual24.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35);
        java.lang.String str38 = coreOperationEqual35.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual39 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual35);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual39);
        boolean boolean41 = coreOperationEqual40.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression43 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression42, expression43);
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression45, expression46);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44, expression46);
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression49, expression50);
        boolean boolean52 = coreOperationEqual51.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression53, expression54);
        org.apache.commons.jxpath.ri.compiler.Expression expression56 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual58 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression56, expression57);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual55, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual58);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual51, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual59);
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression61, expression62);
        boolean boolean64 = coreOperationEqual63.isSymmetric();
        int int65 = coreOperationEqual63.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray66 = coreOperationEqual63.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual60, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual67);
        java.lang.String str69 = coreOperationEqual44.getSymbol();
        java.lang.String str70 = coreOperationEqual44.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual44);
        org.apache.commons.jxpath.ri.EvalContext evalContext72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator73 = coreOperationEqual44.iterate(evalContext72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "=" + "'", str38, "=");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(expressionArray66);
        org.junit.Assert.assertArrayEquals(expressionArray66, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "=" + "'", str69, "=");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "=" + "'", str70, "=");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        boolean boolean3 = coreOperationEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual9);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression12, expression13);
        boolean boolean15 = coreOperationEqual14.isSymmetric();
        int int16 = coreOperationEqual14.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray17 = coreOperationEqual14.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14);
        boolean boolean19 = coreOperationNotEqual11.isSymmetric();
        int int20 = coreOperationNotEqual11.getPrecedence();
        java.lang.String str21 = coreOperationNotEqual11.getSymbol();
        java.lang.String str22 = coreOperationNotEqual11.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression23, expression24);
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression26, expression27);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual25, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28);
        org.apache.commons.jxpath.ri.compiler.Expression expression30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression30, expression31);
        org.apache.commons.jxpath.ri.compiler.Expression expression33 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression33, expression34);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32, expression34);
        boolean boolean37 = coreOperationEqual32.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression38, expression39);
        org.apache.commons.jxpath.ri.compiler.Expression expression41 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression42 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression41, expression42);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual44 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual40, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual43);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual45 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual43);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual32);
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression48 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual49 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression47, expression48);
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual52 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression50, expression51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual49, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression54, expression55);
        boolean boolean57 = coreOperationEqual56.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression59 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression58, expression59);
        org.apache.commons.jxpath.ri.compiler.Expression expression61 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual63 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression61, expression62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual60, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual63);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual56, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual64);
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression66, expression67);
        org.apache.commons.jxpath.ri.compiler.Expression expression69 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression70 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression69, expression70);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual68, expression70);
        java.lang.String str73 = coreOperationNotEqual72.getSymbol();
        boolean boolean74 = coreOperationEqual52.equal((java.lang.Object) coreOperationNotEqual65, (java.lang.Object) coreOperationNotEqual72);
        org.apache.commons.jxpath.ri.compiler.Expression expression75 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression76 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression75, expression76);
        org.apache.commons.jxpath.ri.compiler.Expression expression78 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression79 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual80 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression78, expression79);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual81 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual77, expression79);
        boolean boolean82 = coreOperationEqual77.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression83 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression84 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual85 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression83, expression84);
        org.apache.commons.jxpath.ri.compiler.Expression expression86 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression87 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual88 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression86, expression87);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual89 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual85, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual88);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual90 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual77, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual88);
        int int91 = coreOperationEqual88.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual92 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual72, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual88);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual93 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual28, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual72);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray94 = coreOperationNotEqual93.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual95 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationNotEqual93);
        java.lang.String str96 = coreOperationNotEqual95.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator98 = coreOperationNotEqual95.iteratePointers(evalContext97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(expressionArray17);
        org.junit.Assert.assertArrayEquals(expressionArray17, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!=" + "'", str21, "!=");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "!=" + "'", str22, "!=");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "!=" + "'", str73, "!=");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertNotNull(expressionArray94);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "!=" + "'", str96, "!=");
    }
}

