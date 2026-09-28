package org.jsoup.select;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":containsData(#[:eq(100)!=[:nth-of-type(1n+52)$=:containsdata()]])");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, 10);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":gt(100)");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(100)" + "'", str2, ":gt(100)");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(:eq(-1))", ":contains(:containsown())");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(:eq(-1))$=:contains(:containsown())]" + "'", str3, "[:contains(:eq(-1))$=:contains(:containsown())]");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":eq(97)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:only-child*=:containsdata(nth-last-child)]");
        java.lang.String str2 = containsOwnText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsOwnText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([:only-child*=:containsdata(nth-last-child)])" + "'", str2, ":containsOwn([:only-child*=:containsdata(nth-last-child)])");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        int int2 = isFirstOfType0.a;
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        int int6 = isFirstOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        indexEquals1.index = (byte) 0;
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":contains(:nth-last-of-type(100n+35))");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        java.lang.String str4 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:contains(:nth-last-of-type(100n+35))]" + "'", str2, "[:contains(:nth-last-of-type(100n+35))]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(:nth-last-of-type(100n+35))]" + "'", str3, "[:contains(:nth-last-of-type(100n+35))]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:contains(:nth-last-of-type(100n+35))]" + "'", str4, "[:contains(:nth-last-of-type(100n+35))]");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:last-child]]");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:last-child]]" + "'", str2, "[[:last-child]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]]" + "'", str3, "[[:last-child]]");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":lt(100)", ":contains([:lt(-1)=:nth-of-type(1n+52)])");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsown([:last-child])");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:containsown([:last-child])]" + "'", str2, "[:containsown([:last-child])]");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        int int5 = isFirstOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[.[^:gt(32)]!=hi!]");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tag1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[.[^:gt(32)]!=hi!]" + "'", str2, "[.[^:gt(32)]!=hi!]");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("nth-last-child", ":matchesOwn(null)");
        java.lang.String str3 = attributeWithValueStarting2.key;
        java.lang.String str4 = attributeWithValueStarting2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":matchesown(null)" + "'", str4, ":matchesown(null)");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.toString();
        java.lang.String str9 = isFirstOfType0.toString();
        java.lang.String str10 = isFirstOfType0.toString();
        java.lang.String str11 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-of-type" + "'", str9, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":first-of-type" + "'", str10, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":first-of-type" + "'", str11, ":first-of-type");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        java.lang.String str4 = allElements0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = allElements0.matches(element5, element6);
        java.lang.String str8 = allElements0.toString();
        java.lang.String str9 = allElements0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = allElements0.matches(element10, element11);
        java.lang.String str13 = allElements0.toString();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = allElements0.matches(element14, element15);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = allElements0.matches(element17, element18);
        java.lang.String str20 = allElements0.toString();
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.nodes.Element element22 = null;
        boolean boolean23 = allElements0.matches(element21, element22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "*" + "'", str20, "*");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[^.#hi!]");
        java.lang.Class<?> wildcardClass2 = evaluator1.getClass();
        org.junit.Assert.assertNotNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsData(:eq(1))");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:containsData(:eq(1))]" + "'", str2, "[:containsData(:eq(1))]");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[^:contains(:nth-last-of-type(100n+35))]]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([[^:contains(:nth-last-of-type(100n+35))]])" + "'", str2, ":containsOwn([[^:contains(:nth-last-of-type(100n+35))]])");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-last-of-type(1n+35)", ":eq(52)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-of-type(1n+35)*=:eq(52)]" + "'", str3, "[:nth-last-of-type(1n+35)*=:eq(52)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-last-of-type(1n+35)*=:eq(52)]" + "'", str4, "[:nth-last-of-type(1n+35)*=:eq(52)]");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=:containsdata(.nth-last-child)]");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":nth-last-of-type(10n+100)");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), (int) 'a');
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.Class<?> wildcardClass4 = isNthLastChild2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) 'a', (int) (short) 0);
        int int3 = isNthOfType2.b;
        int int4 = isNthOfType2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:root^=[^=[:last-child]]]");
        java.lang.String str2 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([:root^=[^=[:last-child]]])" + "'", str2, ":containsData([:root^=[^=[:last-child]]])");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:root^=[^=[:last-child]]]");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        java.lang.String str5 = attributeWithValueStarting2.key;
        java.lang.String str6 = attributeWithValueStarting2.toString();
        java.lang.String str7 = attributeWithValueStarting2.value;
        java.lang.String str8 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.key = ":containsData(#hi!)";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[^=[:last-child]]" + "'", str6, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:last-child]" + "'", str7, "[:last-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=[:last-child]]" + "'", str8, "[^=[:last-child]]");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[:matches(null)^=:containsdata(:gt(32))]]");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[[:matches(null)^=:containsdata(:gt(32))]]]" + "'", str2, "[^[[:matches(null)^=:containsdata(:gt(32))]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^[[:matches(null)^=:containsdata(:gt(32))]]]" + "'", str3, "[^[[:matches(null)^=:containsdata(:gt(32))]]]");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(97);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        java.lang.String str5 = indexLessThan1.toString();
        int int6 = indexLessThan1.index;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(97)" + "'", str5, ":lt(97)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.getPseudoClass();
        java.lang.String str9 = isLastOfType0.getPseudoClass();
        java.lang.String str10 = isLastOfType0.getPseudoClass();
        java.lang.String str11 = isLastOfType0.getPseudoClass();
        java.lang.String str12 = isLastOfType0.toString();
        java.lang.String str13 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nth-last-of-type" + "'", str10, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nth-last-of-type" + "'", str11, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":last-of-type" + "'", str12, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":last-of-type" + "'", str13, ":last-of-type");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-last-child(100n+100)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsOwnText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        java.lang.String str2 = indexEquals1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = indexEquals1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(52)" + "'", str2, ":eq(52)");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        java.lang.String str2 = indexLessThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = indexLessThan1.matches(element3, element4);
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = indexLessThan1.matches(element6, element7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains([nth-last-of-type*=:last-child])", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:contains(nth-last-child)!=[^:gt(32)]]");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:contains(nth-last-child)!=[^:gt(32)]]" + "'", str2, ".[:contains(nth-last-child)!=[^:gt(32)]]");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        indexEquals1.index = 35;
        java.lang.String str4 = indexEquals1.toString();
        java.lang.String str5 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(35)" + "'", str4, ":eq(35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(35)" + "'", str5, ":eq(35)");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (-1));
        int int3 = isNthLastOfType2.a;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.toString();
        java.lang.String str9 = isFirstOfType0.getPseudoClass();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = isFirstOfType0.calculatePosition(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-of-type" + "'", str9, "nth-of-type");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        int int4 = isFirstOfType0.a;
        java.lang.String str5 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isFirstOfType0.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        java.lang.String str4 = isRoot0.toString();
        java.lang.String str5 = isRoot0.toString();
        java.lang.String str6 = isRoot0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        java.lang.String str10 = isRoot0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = isRoot0.matches(element11, element12);
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = isRoot0.matches(element14, element15);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = isRoot0.matches(element17, element18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":root" + "'", str10, ":root");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[^:root]$=:last-child]", ":containsOwn(.#[:nth-child(97)^=.nth-last-child])");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attributeStarting1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:only-child*=:containsdata(nth-last-child)]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        java.lang.String str4 = containsOwnText1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = containsOwnText1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([:only-child*=:containsdata(nth-last-child)])" + "'", str2, ":containsOwn([:only-child*=:containsdata(nth-last-child)])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([:only-child*=:containsdata(nth-last-child)])" + "'", str3, ":containsOwn([:only-child*=:containsdata(nth-last-child)])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn([:only-child*=:containsdata(nth-last-child)])" + "'", str4, ":containsOwn([:only-child*=:containsdata(nth-last-child)])");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.toString();
        java.lang.String str9 = attributeWithValueStarting2.value;
        java.lang.String str10 = attributeWithValueStarting2.toString();
        java.lang.String str11 = attributeWithValueStarting2.toString();
        java.lang.String str12 = attributeWithValueStarting2.toString();
        java.lang.String str13 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":containsOwn([nth-last-of-type*=:last-child])";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=:first-child]" + "'", str7, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:first-child]" + "'", str8, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-child" + "'", str9, ":first-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[^=:first-child]" + "'", str10, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[^=:first-child]" + "'", str11, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[^=:first-child]" + "'", str12, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[^=:first-child]" + "'", str13, "[^=:first-child]");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:contains(nth-last-child)!=[^:gt(32)]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = class1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) '4', (-1));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[^nth-of-type]", "[#:containsData(:gt(32))]");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("#:only-of-type");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsData(:containsown())", "[[hi!!=nth-last-child]$=:containsdata(:nth-of-type(0))]");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        java.lang.String str9 = isLastOfType0.getPseudoClass();
        int int10 = isLastOfType0.a;
        java.lang.String str11 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nth-last-of-type" + "'", str11, "nth-last-of-type");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.toString();
        int int5 = isNthChild2.a;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        int int7 = isNthChild2.a;
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = isNthChild2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97)" + "'", str4, ":nth-child(97)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsown(hi!)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueMatching2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 1);
        indexEquals1.index = (byte) 1;
        java.lang.String str4 = indexEquals1.toString();
        int int5 = indexEquals1.index;
        int int6 = indexEquals1.index;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = indexEquals1.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(1)" + "'", str4, ":eq(1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(".:containsData(:containsown())", "[.nth-last-child^=hi!]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueContaining2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]" + "'", str3, "[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsown(:first-child)", pattern1);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:eq(52)!=[:only-child^=:containsown()]]");
        java.lang.String str2 = tagEndsWith1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tagEndsWith1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:eq(52)!=[:only-child^=:containsown()]]" + "'", str2, "[:eq(52)!=[:only-child^=:containsown()]]");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) -1, 32);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:gt(1)!=[:lt(-1)=:nth-of-type(1n+52)]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = evaluator1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((-1), (int) (short) 1);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.util.regex.Pattern pattern9 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern10 = null;
        attributeWithValueMatching2.pattern = pattern10;
        java.util.regex.Pattern pattern12 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeWithValueMatching2.matches(element13, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern9);
        org.junit.Assert.assertNull(pattern12);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) ' ');
        int int2 = indexGreaterThan1.index;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(100)^=*]", ":contains(nth-last-child)");
        attributeWithValueStarting2.value = ":containsOwn([nth-last-of-type*=:last-child])";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:lt(100)^=*]^=:containsOwn([nth-last-of-type*=:last-child])]" + "'", str5, "[[:lt(100)^=*]^=:containsOwn([nth-last-of-type*=:last-child])]");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.b;
        int int3 = isLastOfType0.b;
        java.lang.String str4 = isLastOfType0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isLastOfType0.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:containsown(:nth-last-of-type(97n-1))=[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]", ".[^.]");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = isRoot0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = isRoot0.matches(element10, element11);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = isRoot0.matches(element13, element14);
        java.lang.String str16 = isRoot0.toString();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = isRoot0.matches(element17, element18);
        java.lang.String str20 = isRoot0.toString();
        java.lang.String str21 = isRoot0.toString();
        java.lang.String str22 = isRoot0.toString();
        java.lang.String str23 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":root" + "'", str20, ":root");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":root" + "'", str21, ":root");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":root" + "'", str22, ":root");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":root" + "'", str23, ":root");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(10, 52);
        int int3 = isNthOfType2.b;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 100, (int) (byte) 10);
        java.lang.String str3 = isNthLastOfType2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(100n+10)" + "'", str3, ":nth-last-of-type(100n+10)");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:containsData(:containsown())=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        java.lang.String str4 = allElements0.toString();
        java.lang.String str5 = allElements0.toString();
        java.lang.String str6 = allElements0.toString();
        java.lang.String str7 = allElements0.toString();
        java.lang.String str8 = allElements0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = allElements0.matches(element9, element10);
        java.lang.String str12 = allElements0.toString();
        java.lang.String str13 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "*" + "'", str5, "*");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "*" + "'", str6, "*");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = isLastOfType0.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[nth-of-type]^=[:last-child]]");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 1, 0);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isNthLastOfType2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        int int3 = isNthOfType2.a;
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        java.lang.String str7 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]]", "[[:lt(100)^=*]^=:contains(nth-last-child)]");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        java.lang.String str2 = indexLessThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = indexLessThan1.matches(element3, element4);
        java.lang.String str6 = indexLessThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        indexLessThan1.index = (short) 100;
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = indexLessThan1.matches(element12, element13);
        java.lang.String str15 = indexLessThan1.toString();
        indexLessThan1.index = '4';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(100)" + "'", str6, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":lt(100)" + "'", str15, ":lt(100)");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-of-type", pattern1);
        attributeWithValueMatching2.key = ":last-child";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.lang.String str7 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[:only-child!=nth-last-child]";
        java.util.regex.Pattern pattern10 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[:eq(100)!=[:nth-of-type(1n+52)$=:containsdata()]]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-child" + "'", str7, ":last-child");
        org.junit.Assert.assertNull(pattern10);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-child", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueContaining2.key;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.key = ":nth-last-child(-1n)";
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueContaining2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str4, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 10, 52);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":only-child", ":containsData(nth-last-child)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.toString();
        java.lang.String str6 = attributeWithValueContaining2.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueContaining2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:only-child*=:containsdata(nth-last-child)]" + "'", str3, "[:only-child*=:containsdata(nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:only-child*=:containsdata(nth-last-child)]" + "'", str4, "[:only-child*=:containsdata(nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:only-child*=:containsdata(nth-last-child)]" + "'", str5, "[:only-child*=:containsdata(nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:only-child*=:containsdata(nth-last-child)]" + "'", str6, "[:only-child*=:containsdata(nth-last-child)]");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#hi!");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        java.lang.String str4 = containsData1.toString();
        java.lang.String str5 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(#hi!)" + "'", str2, ":containsData(#hi!)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(#hi!)" + "'", str3, ":containsData(#hi!)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsData(#hi!)" + "'", str4, ":containsData(#hi!)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":containsData(#hi!)" + "'", str5, ":containsData(#hi!)");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
        java.lang.String str8 = isFirstOfType0.getPseudoClass();
        java.lang.String str9 = isFirstOfType0.toString();
        java.lang.String str10 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-of-type" + "'", str8, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-of-type" + "'", str9, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nth-of-type" + "'", str10, "nth-of-type");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:lt(-1)=[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([:lt(-1)=[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]])" + "'", str2, ":containsOwn([:lt(-1)=[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]])");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]", ":nth-last-child(35n)");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(nth-of-type)", "[hi!!=:first-of-type]");
        java.lang.String str3 = attributeWithValue2.value;
        java.lang.String str4 = attributeWithValue2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!!=:first-of-type]" + "'", str3, "[hi!!=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(nth-of-type)" + "'", str4, ":contains(nth-of-type)");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:containsdata(#hi!)=#[:last-child$=[:last-child^=[:last-child]]]]");
        java.lang.Class<?> wildcardClass2 = evaluator1.getClass();
        org.junit.Assert.assertNotNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":matches(null)", ":nth-of-type(0)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
        java.lang.String str5 = attributeWithValueNot2.toString();
        java.lang.String str6 = attributeWithValueNot2.toString();
        java.lang.String str7 = attributeWithValueNot2.toString();
        java.lang.String str8 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str3, "[:matches(null)!=:nth-of-type(0)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":matches(null)" + "'", str4, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str5, "[:matches(null)!=:nth-of-type(0)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str6, "[:matches(null)!=:nth-of-type(0)]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str7, "[:matches(null)!=:nth-of-type(0)]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":nth-of-type(0)" + "'", str8, ":nth-of-type(0)");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("#[:last-child$=[:last-child^=[:last-child]]]");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[#[:last-child$=[:last-child^=[:last-child]]]]" + "'", str2, "[#[:last-child$=[:last-child^=[:last-child]]]]");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        java.lang.String str2 = indexEquals1.toString();
        java.lang.String str3 = indexEquals1.toString();
        java.lang.String str4 = indexEquals1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = indexEquals1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(0)" + "'", str2, ":eq(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(0)" + "'", str3, ":eq(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(0)" + "'", str4, ":eq(0)");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]", ":containsOwn([^=:matches(null)])");
        attributeWithValueStarting2.key = ":nth-of-type(97n+97)";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-of-type(97n+97)^=:containsown([^=:matches(null)])]" + "'", str5, "[:nth-of-type(97n+97)^=:containsown([^=:matches(null)])]");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = indexEquals1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(100);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        java.lang.String str8 = indexLessThan1.toString();
        int int9 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(100)" + "'", str8, ":lt(100)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
        java.lang.String str11 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern12 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "";
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str11, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertNull(pattern12);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:nth-last-child(10n+97)*=[:contains(:contains(:last-child))^=:gt(32)]]");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 100, 0);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:eq(-1)!=:matches(null)]", pattern1);
        attributeWithValueMatching2.key = "[:first-of-type=:eq(32)]";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) -1);
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 1;
        int int5 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(-1)" + "'", str2, ":gt(-1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        java.lang.String str4 = isRoot0.toString();
        java.lang.String str5 = isRoot0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = isRoot0.matches(element6, element7);
        java.lang.String str9 = isRoot0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = isRoot0.matches(element10, element11);
        java.lang.String str13 = isRoot0.toString();
        java.lang.String str14 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":root" + "'", str13, ":root");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":root" + "'", str14, ":root");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#[.[^:gt(32)]!=hi!]");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[[:last-child]]^=:eq(1)]", "[:containsown()*=:containsown()]");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) (byte) -1);
        int int3 = isNthChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", ":matches(null)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
        attributeWithValueNot2.key = ":containsData(:contains(:eq(1)))";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(-1)!=:matches(null)]" + "'", str3, "[:eq(-1)!=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(-1)" + "'", str4, ":eq(-1)");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        attributeWithValueMatching2.key = "[[:last-child]]";
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[^:root]$=:last-child]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[nth-of-type!=:eq(1)]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[nth-last-child^=:matchesown(null)]]", "[[:matches(null)$=[[:last-child]$=:last-of-type]]=:matches(null)]");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[^[:nth-last-child(100n+100)]]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:nth-child(97)^=.nth-last-child]", ":only-of-type");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.value;
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.String str6 = attributeWithValue2.toString();
        attributeWithValue2.key = "[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:nth-child(97)^=.nth-last-child]=:only-of-type]" + "'", str3, "[[:nth-child(97)^=.nth-last-child]=:only-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":only-of-type" + "'", str4, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:nth-child(97)^=.nth-last-child]=:only-of-type]" + "'", str5, "[[:nth-child(97)^=.nth-last-child]=:only-of-type]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[:nth-child(97)^=.nth-last-child]=:only-of-type]" + "'", str6, "[[:nth-child(97)^=.nth-last-child]=:only-of-type]");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) 'a', (int) (byte) 0);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', (int) (short) 100);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tag1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]" + "'", str2, "[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":lt(52)");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-last-of-type(32n)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(100)*=:containsown()]", "[:last-child^=[:last-child]]");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 10, (int) (short) -1);
        int int3 = isNthOfType2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", ":eq(1)");
        attributeWithValueContaining2.key = ":containsOwn(:eq(1))";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueContaining2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[:containsOwn(:eq(52))]]", pattern1);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 0, (-1));
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":lt(52)", "[:last-of-type]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueEnding2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        java.lang.String str2 = isFirstChild0.toString();
        java.lang.String str3 = isFirstChild0.toString();
        java.lang.String str4 = isFirstChild0.toString();
        java.lang.String str5 = isFirstChild0.toString();
        java.lang.String str6 = isFirstChild0.toString();
        java.lang.String str7 = isFirstChild0.toString();
        java.lang.String str8 = isFirstChild0.toString();
        java.lang.String str9 = isFirstChild0.toString();
        java.lang.String str10 = isFirstChild0.toString();
        java.lang.String str11 = isFirstChild0.toString();
        java.lang.String str12 = isFirstChild0.toString();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = isFirstChild0.matches(element13, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-child" + "'", str2, ":first-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-child" + "'", str3, ":first-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-child" + "'", str4, ":first-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-child" + "'", str5, ":first-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-child" + "'", str6, ":first-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-child" + "'", str7, ":first-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-child" + "'", str8, ":first-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-child" + "'", str9, ":first-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":first-child" + "'", str10, ":first-child");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":first-child" + "'", str11, ":first-child");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":first-child" + "'", str12, ":first-child");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-of-type(1n+10)");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:nth-of-type(1n+10))" + "'", str2, ":contains(:nth-of-type(1n+10))");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        indexEquals1.index = (byte) -1;
        java.lang.String str6 = indexEquals1.toString();
        java.lang.String str7 = indexEquals1.toString();
        java.lang.String str8 = indexEquals1.toString();
        indexEquals1.index = (byte) -1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(-1)" + "'", str6, ":eq(-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(-1)" + "'", str7, ":eq(-1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(-1)" + "'", str8, ":eq(-1)");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(".#[:nth-child(97)^=.nth-last-child]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(.#[:nth-child(97)^=.nth-last-child])" + "'", str2, ":containsOwn(.#[:nth-child(97)^=.nth-last-child])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(.#[:nth-child(97)^=.nth-last-child])" + "'", str3, ":containsOwn(.#[:nth-child(97)^=.nth-last-child])");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[^=:first-child]*=hi!]", "#[:lt(100)*=:containsown()]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueStarting2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isLastOfType0.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:nth-child(97)^=.nth-last-child]");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":contains([:gt(-1)])", "[:gt(32)]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueNot2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]])" + "'", str2, ":contains([:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]])");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":gt(100)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tag1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-of-type", "[hi!$=[nth-of-type!=:containsdata([:empty=:matches(null)])]]");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[:empty=:matches(null)]=hi!]", "[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueContaining2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#[:lt(100)*=:containsown()]", ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
        attributeWithValueStarting2.key = "[^hi!]";
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[^=:first-child]*=hi!]", "[[:last-child]$=:contains(.nth-last-child)]");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 10, (-1));
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthChild2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("nth-child");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", ":last-child");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.toString();
        java.lang.String str6 = attributeWithValueContaining2.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueContaining2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str3, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str4, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str5, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str6, "[nth-last-of-type*=:last-child]");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":contains(nth-of-type)");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:last-child]$=:last-of-type]", ":containsData(:containsdata(:gt(32)))");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]$=:last-of-type]=:containsdata(:containsdata(:gt(32)))]" + "'", str3, "[[[:last-child]$=:last-of-type]=:containsdata(:containsdata(:gt(32)))]");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) '#');
        int int2 = indexGreaterThan1.index;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:last-child]", "[*!=[^nth-last-child]]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":nth-last-child(100n+100)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]^=[*!=[^nth-last-child]]]" + "'", str3, "[[:last-child]^=[*!=[^nth-last-child]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]^=[*!=[^nth-last-child]]]" + "'", str4, "[[:last-child]^=[*!=[^nth-last-child]]]");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":eq(-1)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = id1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:last-child]]", "[:matches(null)$=:last-child]");
        java.lang.String str3 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)$=:last-child]" + "'", str3, "[:matches(null)$=:last-child]");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":gt(32)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsData1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) -1, 52);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        java.lang.String str9 = isLastOfType0.getPseudoClass();
        java.lang.String str10 = isLastOfType0.toString();
        java.lang.String str11 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-of-type" + "'", str10, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":last-of-type" + "'", str11, ":last-of-type");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":empty", ":lt(97)");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueStarting2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:eq(-1)!=:matches(null)]", pattern1);
        attributeWithValueMatching2.key = "[:first-of-type=:eq(32)]";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        attributeWithValueMatching2.key = "[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]";
        attributeWithValueMatching2.key = ":nth-child(10n-1)";
        java.lang.String str11 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":nth-child(10n-1)" + "'", str11, ":nth-child(10n-1)");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":contains(:nth-of-type(1n+10))");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attributeStarting1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (-1));
        int int3 = isNthLastOfType2.a;
        java.lang.String str4 = isNthLastOfType2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-of-type(10n-1)" + "'", str4, ":nth-last-of-type(10n-1)");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', (int) (short) 1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthChild2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.getPseudoClass();
        int int9 = isFirstOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-of-type" + "'", str8, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isLastOfType0.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[^[nth-last-child^=:matchesown(null)]]";
        attributeWithValueMatching2.key = "[nth-of-type!=:eq(1)]";
        attributeWithValueMatching2.key = ":nth-child(97)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-child" + "'", str3, ":only-child");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 1, 0);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(52, 52);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 10, 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[nth-of-type]", ":only-of-type");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[^[:empty^=.nth-last-child]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[nth-of-type]$=:only-of-type]" + "'", str3, "[[nth-of-type]$=:only-of-type]");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(nth-last-of-type)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-of-type!=:gt(32)]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "";
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueMatching2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-of-type!=:gt(32)]" + "'", str3, "[nth-of-type!=:gt(32)]");
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:nth-last-child(-1n)*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", "[hi!!=nth-last-child]");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(97, (int) (short) 1);
        int int3 = isNthLastOfType2.a;
        java.lang.String str4 = isNthLastOfType2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-of-type(97n+1)" + "'", str4, ":nth-last-of-type(97n+1)");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:matchesown(null)=:nth-last-of-type(97n-1)]");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[[:gt(-1)]^=[:matches(null)$=.nth-last-child]]");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":contains(.[:lt(100)^=*])", "[:first-of-type*=.[:only-child!=nth-last-child]]");
        attributeWithValueContaining2.key = "[^:gt(-1)]";
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsOwn([^nth-last-of-type])");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:containsown([^nth-last-of-type])]" + "'", str2, "[^:containsown([^nth-last-of-type])]");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(100n+10)", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(100n+10)" + "'", str5, ":nth-last-child(100n+10)");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        java.lang.String str5 = attributeWithValueStarting2.value;
        attributeWithValueStarting2.key = "[nth-of-type]";
        java.lang.Class<?> wildcardClass8 = attributeWithValueStarting2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-child" + "'", str4, ":last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:last-child]" + "'", str5, "[:last-child]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(1, 1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        java.lang.String str9 = isLastOfType0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = isLastOfType0.calculatePosition(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":last-of-type" + "'", str9, ":last-of-type");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[:matches(null)!=:nth-of-type(0)]$=[:last-child^=[:last-child]]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsData(:eq(100))", "[:gt(-1)^=:matchesown(null)]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueContaining2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-last-of-type]");
        java.lang.String str2 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([nth-last-of-type])" + "'", str2, ":containsData([nth-last-of-type])");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("#[.[^:gt(32)]!=hi!]");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.toString();
        int int5 = isNthLastChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(100n+10)" + "'", str4, ":nth-last-child(100n+10)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:only-of-type!=[:lt(100)*=:containsown()]]");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("hi!", "[nth-of-type!=:containsData([:empty=:matches(null)])]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueEnding2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!$=[nth-of-type!=:containsdata([:empty=:matches(null)])]]" + "'", str3, "[hi!$=[nth-of-type!=:containsdata([:empty=:matches(null)])]]");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((-1), (int) (short) 10);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":matches(null)";
        java.lang.String str8 = attributeWithValueStarting2.toString();
        java.lang.String str9 = attributeWithValueStarting2.key;
        attributeWithValueStarting2.value = "[[nth-of-type!=:containsData([:empty=:matches(null)])]$=.nth-last-child]";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^=[:last-child]]" + "'", str5, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:matches(null)]" + "'", str8, "[^=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(1);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        indexGreaterThan1.index = ' ';
        java.lang.String str6 = indexGreaterThan1.toString();
        int int7 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(1)" + "'", str2, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(1)" + "'", str3, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(32)" + "'", str6, ":gt(32)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(1, 0);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#[:matches(null)^=:containsdata(:gt(32))]", ":containsown([:last-child])");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.Class<?> wildcardClass4 = attributeWithValueStarting2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#[:matches(null)^=:containsdata(:gt(32))]^=:containsown([:last-child])]" + "'", str3, "[#[:matches(null)^=:containsdata(:gt(32))]^=:containsown([:last-child])]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) ' ', 52);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "#hi!";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        attributeWithValueMatching2.key = "[*=:last-child]";
        attributeWithValueMatching2.key = ":contains(:containsdata(:containsown()))";
        attributeWithValueMatching2.key = "";
        java.util.regex.Pattern pattern15 = null;
        attributeWithValueMatching2.pattern = pattern15;
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("#[.nth-last-child$=[:last-child^=[:last-child]]]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#[:last-child$=[:last-child^=[:last-child]]]", ":contains(#)");
        attributeWithValueContaining2.key = ":contains(nth-of-type)";
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:gt(-1)*=:first-of-type]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tagEndsWith1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-child", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str4, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[*=:last-child]]", pattern1);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.jsoup.select.Evaluator.IsLastChild isLastChild0 = new org.jsoup.select.Evaluator.IsLastChild();
        java.lang.String str1 = isLastChild0.toString();
        java.lang.String str2 = isLastChild0.toString();
        java.lang.String str3 = isLastChild0.toString();
        java.lang.String str4 = isLastChild0.toString();
        java.lang.String str5 = isLastChild0.toString();
        java.lang.String str6 = isLastChild0.toString();
        java.lang.String str7 = isLastChild0.toString();
        java.lang.String str8 = isLastChild0.toString();
        java.lang.String str9 = isLastChild0.toString();
        java.lang.String str10 = isLastChild0.toString();
        java.lang.String str11 = isLastChild0.toString();
        java.lang.String str12 = isLastChild0.toString();
        java.lang.String str13 = isLastChild0.toString();
        java.lang.String str14 = isLastChild0.toString();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = isLastChild0.matches(element15, element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-child" + "'", str1, ":last-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-child" + "'", str2, ":last-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-child" + "'", str3, ":last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-child" + "'", str4, ":last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-child" + "'", str5, ":last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-child" + "'", str6, ":last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-child" + "'", str7, ":last-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-child" + "'", str8, ":last-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":last-child" + "'", str9, ":last-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-child" + "'", str10, ":last-child");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":last-child" + "'", str11, ":last-child");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":last-child" + "'", str12, ":last-child");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":last-child" + "'", str13, ":last-child");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":last-child" + "'", str14, ":last-child");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        int int4 = indexEquals1.index;
        indexEquals1.index = (-1);
        indexEquals1.index = '#';
        java.lang.String str9 = indexEquals1.toString();
        java.lang.String str10 = indexEquals1.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = indexEquals1.matches(element11, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":eq(35)" + "'", str9, ":eq(35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":eq(35)" + "'", str10, ":eq(35)");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":containsData(#hi!)");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) (byte) 0);
        int int3 = isNthChild2.a;
        int int4 = isNthChild2.b;
        java.lang.String str5 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(10, (int) 'a');
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(".:nth-last-child(1)");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#.:nth-last-child(1)" + "'", str2, "#.:nth-last-child(1)");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        int int4 = isLastOfType0.a;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isLastOfType0.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[^[:containsown(:eq(52))]]");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, 0);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        int int4 = isNthOfType2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^[nth-last-child^=:matchesown(null)]]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        java.lang.String str4 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^[nth-last-child^=:matchesown(null)]])" + "'", str2, ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([^[nth-last-child^=:matchesown(null)]])" + "'", str3, ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn([^[nth-last-child^=:matchesown(null)]])" + "'", str4, ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^:containsdata(#hi!)]", pattern1);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(".nth-last-child");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        java.lang.String str4 = containsData1.toString();
        java.lang.String str5 = containsData1.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = containsData1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(.nth-last-child)" + "'", str2, ":containsData(.nth-last-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(.nth-last-child)" + "'", str3, ":containsData(.nth-last-child)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsData(.nth-last-child)" + "'", str4, ":containsData(.nth-last-child)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":containsData(.nth-last-child)" + "'", str5, ":containsData(.nth-last-child)");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:first-child=[nth-last-of-type*=:last-child]]", "[^[:first-of-type*=.[:only-child!=nth-last-child]]]");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.toString();
        java.lang.String str5 = isNthChild2.toString();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        java.lang.String str7 = isNthChild2.getPseudoClass();
        int int8 = isNthChild2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97)" + "'", str4, ":nth-child(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-child(97)" + "'", str5, ":nth-child(97)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:nth-last-child(0)^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", ":containsOwn([[^:contains(:nth-last-of-type(100n+35))]])");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(1);
        java.lang.String str2 = indexLessThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = indexLessThan1.matches(element3, element4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(1)" + "'", str2, ":lt(1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.a;
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 1);
        indexLessThan1.index = (short) 100;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        indexLessThan1.index = 97;
        java.lang.String str9 = indexLessThan1.toString();
        indexLessThan1.index = (byte) 10;
        java.lang.String str12 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(97)" + "'", str9, ":lt(97)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":lt(10)" + "'", str12, ":lt(10)");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 0, (int) (short) 10);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.toString();
        java.lang.String str5 = isNthLastOfType2.getPseudoClass();
        java.lang.String str6 = isNthLastOfType2.getPseudoClass();
        java.lang.String str7 = isNthLastOfType2.getPseudoClass();
        java.lang.String str8 = isNthLastOfType2.toString();
        int int9 = isNthLastOfType2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-of-type(10)" + "'", str4, ":nth-last-of-type(10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":nth-last-of-type(10)" + "'", str8, ":nth-last-of-type(10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsData(:containsdata(:gt(32)))", "[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueEnding2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        java.lang.String str5 = indexLessThan1.toString();
        int int6 = indexLessThan1.index;
        java.lang.String str7 = indexLessThan1.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = indexLessThan1.matches(element8, element9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(10)" + "'", str5, ":lt(10)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(10)" + "'", str7, ":lt(10)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:last-child]$=:last-of-type]");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[[:last-child]$=:last-of-type]]" + "'", str2, "[[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]$=:last-of-type]]" + "'", str3, "[[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(100, 52);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsOwn([[:last-child^=[:last-child]]])");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.lang.String str6 = attributeWithValueMatching2.key;
        java.lang.String str7 = attributeWithValueMatching2.key;
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) '4', (int) (byte) 10);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)$=.nth-last-child]", "[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]");
        java.lang.String str3 = attributeWithValueStarting2.value;
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]" + "'", str3, "[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:matches(null)$=.nth-last-child]^=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]" + "'", str4, "[[:matches(null)$=.nth-last-child]^=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 0, (int) 'a');
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(35, (int) (short) 100);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:lt(1)!=.#hi!]", "[:eq(1)=nth-last-child]");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[:last-child]=:matches(null)]", "nth-last-child");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[:last-child]=:matches(null)]*=nth-last-child]" + "'", str4, "[[[:last-child]=:matches(null)]*=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-child]=:matches(null)]" + "'", str5, "[[:last-child]=:matches(null)]");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) '#', (int) 'a');
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-child(52n-1)");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:nth-child(52n-1))" + "'", str2, ":contains(:nth-child(52n-1))");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        java.lang.String str4 = isRoot0.toString();
        java.lang.String str5 = isRoot0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = isRoot0.matches(element6, element7);
        java.lang.String str9 = isRoot0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = isRoot0.matches(element10, element11);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = isRoot0.matches(element13, element14);
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = isRoot0.matches(element16, element17);
        java.lang.String str19 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":root" + "'", str19, ":root");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(100, (int) (short) 100);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":containsData(#[:eq(100)!=[:nth-of-type(1n+52)$=:containsdata()]])");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsData(#hi!)", "#[:last-child$=[:last-child^=[:last-child]]]");
        java.lang.String str3 = attributeWithValue2.key;
        java.lang.String str4 = attributeWithValue2.toString();
        attributeWithValue2.value = ".:gt(-1)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsdata(#hi!)" + "'", str3, ":containsdata(#hi!)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:containsdata(#hi!)=#[:last-child$=[:last-child^=[:last-child]]]]" + "'", str4, "[:containsdata(#hi!)=#[:last-child$=[:last-child^=[:last-child]]]]");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), 97);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[^[:only-child*=:containsdata(nth-last-child)]]]", "[:first-child]");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:only-child*=:containsdata(nth-last-child)]");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        java.lang.String str4 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[:only-child*=:containsdata(nth-last-child)]]" + "'", str2, "[^[:only-child*=:containsdata(nth-last-child)]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^[:only-child*=:containsdata(nth-last-child)]]" + "'", str3, "[^[:only-child*=:containsdata(nth-last-child)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[^[:only-child*=:containsdata(nth-last-child)]]" + "'", str4, "[^[:only-child*=:containsdata(nth-last-child)]]");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(".:containsData(:containsdata(:gt(32)))");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".:containsData()", "#:contains(nth-child)");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueStarting2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":lt(100)");
        java.lang.String str2 = attributeStarting1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeStarting1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:lt(100)]" + "'", str2, "[^:lt(100)]");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[*!=[^nth-last-child]]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([*!=[^nth-last-child]])" + "'", str2, ":containsOwn([*!=[^nth-last-child]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([*!=[^nth-last-child]])" + "'", str3, ":containsOwn([*!=[^nth-last-child]])");
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("", "[:only-of-type!=]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.key = "[:first-of-type*=.[:only-child!=nth-last-child]]";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[:first-of-type*=.[:only-child!=nth-last-child]]^=[:last-child]]" + "'", str7, "[[:first-of-type*=.[:only-child!=nth-last-child]]^=[:last-child]]");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(".[[hi!!=nth-last-child]$=:containsdata(:nth-of-type(0))]");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:eq(1)=nth-last-child]");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(100, 0);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 10, (int) ' ');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        indexEquals1.index = (byte) -1;
        indexEquals1.index = (byte) 1;
        java.lang.String str8 = indexEquals1.toString();
        java.lang.String str9 = indexEquals1.toString();
        java.lang.String str10 = indexEquals1.toString();
        indexEquals1.index = (byte) 10;
        java.lang.String str13 = indexEquals1.toString();
        int int14 = indexEquals1.index;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(1)" + "'", str8, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":eq(1)" + "'", str9, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":eq(1)" + "'", str10, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":eq(10)" + "'", str13, ":eq(10)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:first-of-type*=.[:only-child!=nth-last-child]]");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[:last-child]]", ":nth-last-of-type(100n+35)");
        java.lang.String str3 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]]" + "'", str3, "[[:last-child]]");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:nth-child(97)^=.nth-last-child]", ":eq(1)");
        attributeWithValueEnding2.value = ":nth-last-of-type(97n-1)";
        java.lang.String str5 = attributeWithValueEnding2.key;
        java.lang.String str6 = attributeWithValueEnding2.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-child(97)^=.nth-last-child]" + "'", str5, "[:nth-child(97)^=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-last-of-type(97n-1)" + "'", str6, ":nth-last-of-type(97n-1)");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[.#hi!!=:first-of-type]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = evaluator1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:contains(nth-child)$=:eq(0)]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = class1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        java.lang.String str4 = allElements0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = allElements0.matches(element5, element6);
        java.lang.String str8 = allElements0.toString();
        java.lang.String str9 = allElements0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = allElements0.matches(element10, element11);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = allElements0.matches(element13, element14);
        java.lang.String str16 = allElements0.toString();
        java.lang.String str17 = allElements0.toString();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = allElements0.matches(element18, element19);
        java.lang.String str21 = allElements0.toString();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.nodes.Element element23 = null;
        boolean boolean24 = allElements0.matches(element22, element23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "*" + "'", str16, "*");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "*" + "'", str17, "*");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "*" + "'", str21, "*");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":eq(32)", ".:first-of-type");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueContaining2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[.nth-last-child!=[:lt(100)^=*]]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[.nth-last-child!=[:lt(100)^=*]]" + "'", str2, "[.nth-last-child!=[:lt(100)^=*]]");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[nth-child!=:nth-child(97)]");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tag1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str2, "[nth-child!=:nth-child(97)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str3, "[nth-child!=:nth-child(97)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str4, "[nth-child!=:nth-child(97)]");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:first-of-type=:eq(32)]$=[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]]");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.util.regex.Pattern pattern9 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern10 = attributeWithValueMatching2.pattern;
        java.lang.String str11 = attributeWithValueMatching2.key;
        java.lang.String str12 = attributeWithValueMatching2.key;
        java.lang.String str13 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[hi!!=nth-last-child]";
        java.util.regex.Pattern pattern16 = null;
        attributeWithValueMatching2.pattern = pattern16;
        org.junit.Assert.assertNull(pattern9);
        org.junit.Assert.assertNull(pattern10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str11, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str12, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str13, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        java.lang.String str9 = isLastOfType0.getPseudoClass();
        java.lang.String str10 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-of-type" + "'", str10, ":last-of-type");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(100);
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 0;
        indexGreaterThan1.index = 1;
        int int7 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(100)" + "'", str2, ":gt(100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) (byte) 100);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthLastChild2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]" + "'", str2, "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]" + "'", str3, "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 0, (int) ' ');
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", ":last-child");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.key;
        java.lang.String str5 = attributeWithValueContaining2.toString();
        java.lang.String str6 = attributeWithValueContaining2.toString();
        java.lang.String str7 = attributeWithValueContaining2.toString();
        java.lang.String str8 = attributeWithValueContaining2.toString();
        java.lang.String str9 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str3, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str5, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str6, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str7, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str8, "[nth-last-of-type*=:last-child]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[nth-last-of-type*=:last-child]" + "'", str9, "[nth-last-of-type*=:last-child]");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^.]", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isLastOfType0.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        java.lang.String str9 = isLastOfType0.toString();
        java.lang.String str10 = isLastOfType0.toString();
        java.lang.String str11 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":last-of-type" + "'", str9, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-of-type" + "'", str10, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nth-last-of-type" + "'", str11, "nth-last-of-type");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.lang.String str7 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[:matches(null)$=.nth-last-child]";
        attributeWithValueMatching2.key = ":root";
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str7, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(35, 32);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[#[:nth-child(97)^=.nth-last-child]^=:nth-last-of-type(100n+35)]");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("#:gt(32)");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[#:gt(32)]" + "'", str2, "[#:gt(32)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#:gt(32)]" + "'", str3, "[#:gt(32)]");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:last-of-type]", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthChild2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#[:last-child$=[:last-child^=[:last-child]]]", pattern1);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]", ":contains(nth-child)");
        java.lang.String str3 = attributeWithValueContaining2.key;
        java.lang.String str4 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]" + "'", str3, "[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(nth-child)" + "'", str4, ":contains(nth-child)");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:last-child]]", "[:lt(-1)!=:matches(null)]");
        java.lang.String str3 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]]" + "'", str3, "[[:last-child]]");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(35, (int) ' ');
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^:nth-child(35n-1)]");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(".[:lt(100)^=*]", ":containsOwn([:only-child*=:containsdata(nth-last-child)])");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueEnding2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.[:lt(100)^=*]$=:containsown([:only-child*=:containsdata(nth-last-child)])]" + "'", str3, "[.[:lt(100)^=*]$=:containsown([:only-child*=:containsdata(nth-last-child)])]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[.[:lt(100)^=*]$=:containsown([:only-child*=:containsdata(nth-last-child)])]" + "'", str4, "[.[:lt(100)^=*]$=:containsown([:only-child*=:containsdata(nth-last-child)])]");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:last-child]]", "[:matches(null)$=:last-child]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueNot2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]]!=[:matches(null)$=:last-child]]" + "'", str3, "[[[:last-child]]!=[:matches(null)$=:last-child]]");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[^:contains(:eq(-1))]");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tag1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:contains(:eq(-1))]" + "'", str2, "[^:contains(:eq(-1))]");
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(:contains([[:lt(100)^=*]=[nth-last-of-type*=:last-child]]))", ".:nth-last-child(100n+10)");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[nth-child!=:nth-child(97)]", "#[.[^:gt(32)]!=hi!]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueStarting2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        java.lang.String str2 = indexLessThan1.toString();
        indexLessThan1.index = 10;
        indexLessThan1.index = (byte) -1;
        indexLessThan1.index = '4';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":gt(-1)", ":matchesOwn(null)");
        attributeWithValueStarting2.key = ":only-child";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.key = "[#.:first-of-type]";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:only-child^=:matchesown(null)]" + "'", str5, "[:only-child^=:matchesown(null)]");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":first-of-type", ":matchesOwn(null)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:first-of-type!=:matchesown(null)]" + "'", str3, "[:first-of-type!=:matchesown(null)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:first-of-type!=:matchesown(null)]" + "'", str4, "[:first-of-type!=:matchesown(null)]");
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[^[:only-child*=:containsdata(nth-last-child)]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tagEndsWith1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[^=:first-child]*=hi!]", "#:contains(nth-last-child)");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.key = "#[:last-child^=[:last-child]]";
        attributeWithValueEnding2.key = "[^=:matches(null)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[^=:first-child]*=hi!]$=#:contains(nth-last-child)]" + "'", str3, "[[[^=:first-child]*=hi!]$=#:contains(nth-last-child)]");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) -1, 0);
        int int3 = isNthChild2.a;
        int int4 = isNthChild2.a;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-of-type", "[:last-child^=[:last-child]]");
        java.lang.String str3 = attributeWithValueNot2.key;
        java.lang.String str4 = attributeWithValueNot2.toString();
        attributeWithValueNot2.value = "[[:matches(null)$=[[:last-child]$=:last-of-type]]$=[:last-child^=[:last-child]]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-of-type!=[:last-child^=[:last-child]]]" + "'", str4, "[nth-of-type!=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^:gt(32)]", pattern1);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = isNthLastChild2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":nth-last-child(100n+10)" + "'", str7, ":nth-last-child(100n+10)");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', (int) (short) 0);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":nth-last-child(10)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = id1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        attributeWithValueMatching2.key = "[:containsOwn([:only-child*=:containsdata(nth-last-child)])!=]";
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeWithValueMatching2.matches(element11, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(35, (int) (byte) -1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.a;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthLastChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:lt(100)*=:containsown()]");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) '#', (int) (short) -1);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[^:gt(-1)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]", "[[:last-of-type]!=#*]");
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) '#', (int) (short) 100);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("*");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsData1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-of-type(10n+97)");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^[nth-last-child^=:matchesown(null)]]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsOwnText1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^[nth-last-child^=:matchesown(null)]])" + "'", str2, ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([^[nth-last-child^=:matchesown(null)]])" + "'", str3, ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = isNthLastChild2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 1, 0);
        int int3 = isNthLastChild2.a;
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[^:root]$=:last-child]");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        java.lang.String str4 = containsText1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = containsText1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([[^:root]$=:last-child])" + "'", str2, ":contains([[^:root]$=:last-child])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains([[^:root]$=:last-child])" + "'", str3, ":contains([[^:root]$=:last-child])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains([[^:root]$=:last-child])" + "'", str4, ":contains([[^:root]$=:last-child])");
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        java.lang.String str1 = isOnlyChild0.toString();
        java.lang.String str2 = isOnlyChild0.toString();
        java.lang.String str3 = isOnlyChild0.toString();
        java.lang.String str4 = isOnlyChild0.toString();
        java.lang.String str5 = isOnlyChild0.toString();
        java.lang.String str6 = isOnlyChild0.toString();
        java.lang.String str7 = isOnlyChild0.toString();
        java.lang.Class<?> wildcardClass8 = isOnlyChild0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-child" + "'", str1, ":only-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":only-child" + "'", str2, ":only-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-child" + "'", str3, ":only-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":only-child" + "'", str4, ":only-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":only-child" + "'", str5, ":only-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":only-child" + "'", str6, ":only-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("#:contains(nth-last-child)", ":contains(:last-child)");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueEnding2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#:contains(nth-last-child)$=:contains(:last-child)]" + "'", str3, "[#:contains(nth-last-child)$=:contains(:last-child)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#:contains(nth-last-child)" + "'", str4, "#:contains(nth-last-child)");
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":containsOwn(.nth-last-child)");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":nth-last-child(1)");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        attributeWithValueNot2.key = ":only-child";
        attributeWithValueNot2.value = "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]";
        java.lang.String str7 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]" + "'", str7, "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(nth-child)", ":contains(:gt(97))");
        attributeWithValue2.value = ".[^nth-last-child]";
        attributeWithValue2.value = "[[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]!=[^=:matches(null)]]";
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        attributeWithValueNot2.value = "hi!";
        attributeWithValueNot2.key = ".[^:gt(32)]";
        java.lang.String str7 = attributeWithValueNot2.value;
        java.lang.String str8 = attributeWithValueNot2.key;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueNot2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".[^:gt(32)]" + "'", str8, ".[^:gt(32)]");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.b;
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        int int6 = isLastOfType0.a;
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":contains(:containsown(#))");
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:last-child]^=[*!=[^nth-last-child]]]");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#:gt(32)", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[^hi!]");
        java.lang.String str2 = containsData1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsData1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([^hi!])" + "'", str2, ":containsData([^hi!])");
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":lt(1)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "#:gt(32)";
        attributeWithValueMatching2.key = "[^[:only-child^=:matchesown(null)]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(1)" + "'", str3, ":lt(1)");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#[:nth-child(97)^=.nth-last-child]", ".:containsData(nth-last-child)");
        attributeWithValueStarting2.value = ":nth-last-of-type(100n+35)";
        attributeWithValueStarting2.key = ":nth-of-type(35n)";
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":containsOwn([nth-last-of-type*=:last-child])", ":contains(:gt(97))");
        attributeWithValueNot2.value = "[#[:nth-child(97)^=.nth-last-child]^=:nth-last-of-type(100n+35)]";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueNot2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = allElements0.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = allElements0.matches(element5, element6);
        java.lang.String str8 = allElements0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":gt(1)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(1)" + "'", str3, ":gt(1)");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 1);
        indexLessThan1.index = (short) 100;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        indexLessThan1.index = 97;
        java.lang.String str9 = indexLessThan1.toString();
        indexLessThan1.index = ' ';
        java.lang.String str12 = indexLessThan1.toString();
        java.lang.String str13 = indexLessThan1.toString();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = indexLessThan1.matches(element14, element15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(97)" + "'", str9, ":lt(97)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":lt(32)" + "'", str12, ":lt(32)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":lt(32)" + "'", str13, ":lt(32)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) ' ');
        java.lang.Class<?> wildcardClass2 = indexGreaterThan1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:nth-child(97)^=.nth-last-child]", ":only-of-type");
        java.lang.String str3 = attributeWithValue2.key;
        java.lang.String str4 = attributeWithValue2.toString();
        attributeWithValue2.value = "[^[:only-child^=:matchesown(null)]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97)^=.nth-last-child]" + "'", str3, "[:nth-child(97)^=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:nth-child(97)^=.nth-last-child]=:only-of-type]" + "'", str4, "[[:nth-child(97)^=.nth-last-child]=:only-of-type]");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(".hi!");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 100);
        int int3 = isNthLastChild2.b;
        int int4 = isNthLastChild2.a;
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isNthLastChild2.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        indexLessThan1.index = 97;
        java.lang.String str10 = indexLessThan1.toString();
        int int11 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":lt(97)" + "'", str10, ":lt(97)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:lt(1)!=.#hi!]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = evaluator1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:only-child^=:containsown()]", ":nth-of-type(1n+52)");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:only-child^=:containsown()]=:nth-of-type(1n+52)]" + "'", str3, "[[:only-child^=:containsown()]=:nth-of-type(1n+52)]");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        attributeWithValueMatching2.key = "[^hi!]";
        java.lang.String str9 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern10 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[^hi!]" + "'", str9, "[^hi!]");
        org.junit.Assert.assertNull(pattern10);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 0, 35);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[:lt(100)^=*]$=:nth-of-type(1n+52)]");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-last-child(97n-1)", "nth-of-type");
        attributeWithValueContaining2.key = "[[:lt(100)*=:containsown()]$=[hi!!=nth-last-child]]";
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^[:nth-last-of-type(97n-1)]]", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#[:last-child$=[:last-child^=[:last-child]]]", ":contains(:nth-last-of-type(100n+35))");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.key;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueContaining2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]" + "'", str3, "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]" + "'", str4, "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#[:last-child$=[:last-child^=[:last-child]]]" + "'", str5, "#[:last-child$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":contains([[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)])");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(1, (int) 'a');
        int int3 = isNthChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:first-child$=:lt(-1)]", "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.toString();
        java.lang.String str9 = isFirstOfType0.getPseudoClass();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = isFirstOfType0.calculatePosition(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-of-type" + "'", str9, "nth-of-type");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^.:nth-last-child(97n+97)]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^.:nth-last-child(97n+97)])" + "'", str2, ":containsOwn([^.:nth-last-child(97n+97)])");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:containsdata()^=[^nth-last-child]]");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[:containsdata()^=[^nth-last-child]]]" + "'", str2, "[^[:containsdata()^=[^nth-last-child]]]");
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = isRoot0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        java.lang.String str10 = isRoot0.toString();
        java.lang.String str11 = isRoot0.toString();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = isRoot0.matches(element12, element13);
        java.lang.String str15 = isRoot0.toString();
        java.lang.String str16 = isRoot0.toString();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = isRoot0.matches(element17, element18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":root" + "'", str10, ":root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":root" + "'", str11, ":root");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":root" + "'", str15, ":root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:lt(1)=[^[:nth-last-of-type(97n-1)]]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsData([[:matches(null)^=:containsdata(:gt(32))]])", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.toString();
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        java.lang.String str7 = isNthOfType2.getPseudoClass();
        int int8 = isNthOfType2.b;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = isNthOfType2.calculatePosition(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-of-type(0)" + "'", str5, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":nth-child(10n-1)", ":containsOwn(nth-of-type)");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, (int) (byte) 10);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        java.lang.String str5 = isNthLastOfType2.getPseudoClass();
        java.lang.String str6 = isNthLastOfType2.getPseudoClass();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isNthLastOfType2.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsdata(#hi!)", ".:containsData(:containsown())");
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:lt(100)^=*]^=:contains(nth-last-child)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) -1);
        int int2 = indexGreaterThan1.index;
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = indexGreaterThan1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^[:containsown(:eq(52))]]", "[[:matches(null)!=:nth-of-type(0)]$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        java.lang.String str7 = allElements0.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = allElements0.matches(element8, element9);
        java.lang.String str11 = allElements0.toString();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = allElements0.matches(element12, element13);
        java.lang.String str15 = allElements0.toString();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = allElements0.matches(element16, element17);
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.nodes.Element element20 = null;
        boolean boolean21 = allElements0.matches(element19, element20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "*" + "'", str15, "*");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[:only-child*=:containsdata(nth-last-child)]*=[[:last-of-type]$=:last-of-type]]", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":gt(-1)", ":first-of-type");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.key;
        java.lang.String str6 = attributeWithValueContaining2.toString();
        java.lang.String str7 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)*=:first-of-type]" + "'", str3, "[:gt(-1)*=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:gt(-1)*=:first-of-type]" + "'", str4, "[:gt(-1)*=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(-1)" + "'", str5, ":gt(-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:gt(-1)*=:first-of-type]" + "'", str6, "[:gt(-1)*=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:gt(-1)*=:first-of-type]" + "'", str7, "[:gt(-1)*=:first-of-type]");
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":contains([[:lt(100)^=*]=[nth-last-of-type*=:last-child]])", "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[#nth-last-child]");
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^:root]", ":lt(0)");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueContaining2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:containsOwn(:eq(52))]");
        java.lang.String str2 = attributeStarting1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeStarting1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[:containsown(:eq(52))]]" + "'", str2, "[^[:containsown(:eq(52))]]");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 0, 0);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]", "[[[:empty=:matches(null)]=hi!]!=:nth-of-type(1n+52)]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValue2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.toString();
        java.lang.String str9 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-of-type" + "'", str9, ":first-of-type");
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) -1);
        java.lang.String str2 = indexEquals1.toString();
        indexEquals1.index = (short) 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(-1)" + "'", str2, ":eq(-1)");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":matches(null)", ":containsData(:gt(32))");
        attributeWithValueStarting2.value = ":eq(0)";
        java.lang.Class<?> wildcardClass5 = attributeWithValueStarting2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":nth-child(97n)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = class1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("", ":containsdata(#hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:containsOwn([:only-child*=:containsdata(nth-last-child)])!=]", "[:eq(100)*=.:first-of-type]");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[^[:nth-last-of-type(97n-1)]]");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(1, (int) 'a');
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(32, 52);
        int int3 = isNthOfType2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:nth-child(97)^=.nth-last-child]", ":only-of-type");
        java.lang.String str3 = attributeWithValue2.key;
        java.lang.String str4 = attributeWithValue2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValue2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97)^=.nth-last-child]" + "'", str3, "[:nth-child(97)^=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-child(97)^=.nth-last-child]" + "'", str4, "[:nth-child(97)^=.nth-last-child]");
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 100);
        int int3 = isNthLastChild2.b;
        int int4 = isNthLastChild2.a;
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isNthLastChild2.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        java.lang.String str5 = attributeWithValueStarting2.value;
        java.lang.String str6 = attributeWithValueStarting2.toString();
        java.lang.String str7 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-child" + "'", str4, ":last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:last-child]" + "'", str5, "[:last-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:last-child^=[:last-child]]" + "'", str6, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:last-child^=[:last-child]]" + "'", str7, "[:last-child^=[:last-child]]");
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(1);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = indexGreaterThan1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(1)" + "'", str2, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(1)" + "'", str3, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(1)" + "'", str4, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(1)" + "'", str5, ":gt(1)");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^=:first-child]", pattern1);
        attributeWithValueMatching2.key = "[:nth-of-type(1n+52)$=:containsdata()]";
        attributeWithValueMatching2.key = "[.#hi!!=:first-of-type]";
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[.^=[:last-child]]");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[.^=[:last-child]]" + "'", str2, ".[.^=[:last-child]]");
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":eq(52)", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":first-of-type", ".[:only-child!=nth-last-child]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.value;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueContaining2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:first-of-type*=.[:only-child!=nth-last-child]]" + "'", str3, "[:first-of-type*=.[:only-child!=nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".[:only-child!=nth-last-child]" + "'", str4, ".[:only-child!=nth-last-child]");
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[:matches(null)$=[[:last-child]$=:last-of-type]]$=:containsOwn(:nth-last-of-type(97n-1))]", ":containsData(nth-last-child)");
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:only-child*=:root]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":lt(-1)", ".");
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) 'a', (int) (byte) -1);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        java.lang.String str5 = isNthLastOfType2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthLastOfType2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = isRoot0.matches(element3, element4);
        java.lang.String str6 = isRoot0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = isRoot0.matches(element10, element11);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = isRoot0.matches(element13, element14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) '#');
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "#hi!";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        attributeWithValueMatching2.key = "[*=:last-child]";
        java.util.regex.Pattern pattern11 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = ":nth-child(52n-1)";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-of-type(100n+35)", pattern1);
        attributeWithValueMatching2.key = ":contains([:gt(-1)])";
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.lang.String str6 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueMatching2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":contains([:gt(-1)])" + "'", str6, ":contains([:gt(-1)])");
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-of-type!=:gt(32)]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = ".:containsdata(nth-last-child)";
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueMatching2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-of-type!=:gt(32)]" + "'", str3, "[nth-of-type!=:gt(32)]");
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[#$=[:nth-last-of-type(100n+35)]]", ":containsData()");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[#$=[:nth-last-of-type(100n+35)]]!=:containsdata()]" + "'", str3, "[[#$=[:nth-last-of-type(100n+35)]]!=:containsdata()]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[#$=[:nth-last-of-type(100n+35)]]" + "'", str4, "[#$=[:nth-last-of-type(100n+35)]]");
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-child", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueMatching2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        int int4 = isNthChild2.a;
        java.lang.String str5 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(0);
        java.lang.String str2 = indexEquals1.toString();
        java.lang.String str3 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(0)" + "'", str2, ":eq(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(0)" + "'", str3, ":eq(0)");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.toString();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isNthLastChild2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(97n+97)" + "'", str4, ":nth-last-child(97n+97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]");
        java.lang.String str2 = id1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = id1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]" + "'", str2, "#[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]");
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        indexGreaterThan1.index = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:nth-child(97)!=[nth-of-type]]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        attributeWithValueNot2.key = "[nth-of-type]";
        java.lang.String str5 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[nth-of-type]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str5, "[[nth-of-type]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = isRoot0.matches(element4, element5);
        java.lang.String str7 = isRoot0.toString();
        java.lang.String str8 = isRoot0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = isRoot0.matches(element9, element10);
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = isRoot0.matches(element12, element13);
        java.lang.String str15 = isRoot0.toString();
        java.lang.String str16 = isRoot0.toString();
        java.lang.String str17 = isRoot0.toString();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = isRoot0.matches(element18, element19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":root" + "'", str15, ":root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":root" + "'", str17, ":root");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        java.lang.String str5 = indexLessThan1.toString();
        java.lang.String str6 = indexLessThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        java.lang.String str10 = indexLessThan1.toString();
        indexLessThan1.index = (byte) 1;
        java.lang.String str13 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(-1)" + "'", str5, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(-1)" + "'", str6, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":lt(-1)" + "'", str10, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":lt(1)" + "'", str13, ":lt(1)");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("", ":containsOwn([[^:contains(:nth-last-of-type(100n+35))]])");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        java.lang.String str2 = indexLessThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = indexLessThan1.matches(element3, element4);
        java.lang.String str6 = indexLessThan1.toString();
        indexLessThan1.index = (short) -1;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = indexLessThan1.matches(element9, element10);
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = indexLessThan1.matches(element12, element13);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = indexLessThan1.matches(element15, element16);
        java.lang.String str18 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(100)" + "'", str6, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":lt(-1)" + "'", str18, ":lt(-1)");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":containsOwn(#)");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (-1));
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:lt(100)^=*]");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        java.lang.String str4 = tagEndsWith1.toString();
        java.lang.String str5 = tagEndsWith1.toString();
        java.lang.String str6 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:lt(100)^=*]" + "'", str2, "[:lt(100)^=*]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:lt(100)^=*]" + "'", str3, "[:lt(100)^=*]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(100)^=*]" + "'", str4, "[:lt(100)^=*]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(100)^=*]" + "'", str5, "[:lt(100)^=*]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:lt(100)^=*]" + "'", str6, "[:lt(100)^=*]");
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("#:contains(nth-last-child)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attributeStarting1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(32, (int) ' ');
        java.lang.String str3 = isNthOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(32n+32)" + "'", str3, ":nth-of-type(32n+32)");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]^=[:containsown(:eq(52))]]");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]^=[:containsown(:eq(52))]]]" + "'", str2, "[^[[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]^=[:containsown(:eq(52))]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^[[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]^=[:containsown(:eq(52))]]]" + "'", str3, "[^[[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]^=[:containsown(:eq(52))]]]");
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 1, 0);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((-1), 10);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isFirstOfType0.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("", ":nth-last-child(35n+100)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":eq(32)", "#:nth-last-child(97n+97)");
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]", "[[nth-last-child^=:matchesown(null)]]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]!=[[nth-last-child^=:matchesown(null)]]]" + "'", str3, "[[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]!=[[nth-last-child^=:matchesown(null)]]]");
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 10, (int) 'a');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:lt(1)=[^[:nth-last-of-type(97n-1)]]]");
        java.lang.String str2 = attribute1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:lt(1)=[^[:nth-last-of-type(97n-1)]]]]" + "'", str2, "[[:lt(1)=[^[:nth-last-of-type(97n-1)]]]]");
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:nth-child(1)$=[:eq(100)*=:last-of-type]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsData1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":lt(10)", "[:containsOwn(:eq(52))]");
        java.lang.String str3 = attributeWithValueEnding2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsown(:eq(52))]" + "'", str3, "[:containsown(:eq(52))]");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 100;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = indexGreaterThan1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":containsData([[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]])");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:containsdata([[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]))" + "'", str2, ":containsOwn(:containsdata([[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]))");
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":nth-child(1)", ":containsown([^=:matches(null)])");
        java.lang.String str3 = attributeWithValueEnding2.key;
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(1)" + "'", str3, ":nth-child(1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-child(1)$=:containsown([^=:matches(null)])]" + "'", str4, "[:nth-child(1)$=:containsown([^=:matches(null)])]");
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-last-child(97n+97)", ":containsData(:containsown())");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 10, (int) (short) -1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        java.lang.String str7 = allElements0.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = allElements0.matches(element8, element9);
        java.lang.String str11 = allElements0.toString();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = allElements0.matches(element12, element13);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = allElements0.matches(element15, element16);
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = allElements0.matches(element18, element19);
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.nodes.Element element22 = null;
        boolean boolean23 = allElements0.matches(element21, element22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsData([[^nth-last-of-type]=:contains(:contains(:last-child))])");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:containsdata([[^nth-last-of-type]=:contains(:contains(:last-child))])]" + "'", str2, "[^:containsdata([[^nth-last-of-type]=:contains(:contains(:last-child))])]");
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, 100);
        java.lang.String str3 = isNthLastOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(-1n+100)" + "'", str3, ":nth-last-of-type(-1n+100)");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, (int) (short) 1);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":lt(1)", ".:containsData(:containsown())");
        attributeWithValueStarting2.key = ":containsData(:gt(1))";
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, (int) ' ');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) (byte) 1);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthLastChild2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "#hi!";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        attributeWithValueMatching2.key = "[*=:last-child]";
        attributeWithValueMatching2.key = ":contains(:containsdata(:containsown()))";
        java.lang.String str13 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[.[:only-child!=nth-last-child]*=:matchesown(null)]";
        attributeWithValueMatching2.key = "[:lt(1)!=.#hi!]";
        java.util.regex.Pattern pattern18 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":contains(:containsdata(:containsown()))" + "'", str13, ":contains(:containsdata(:containsown()))");
        org.junit.Assert.assertNull(pattern18);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), (int) (byte) 0);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":contains(:nth-child(35n+1))");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(97);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        indexLessThan1.index = 10;
        java.lang.String str7 = indexLessThan1.toString();
        indexLessThan1.index = (-1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(10)" + "'", str7, ":lt(10)");
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#[:matches(null)^=:containsdata(:gt(32))]", ":containsown([:last-child])");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":containsData(:eq(1))";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#[:matches(null)^=:containsdata(:gt(32))]^=:containsown([:last-child])]" + "'", str3, "[#[:matches(null)^=:containsdata(:gt(32))]^=:containsown([:last-child])]");
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        java.lang.String str6 = indexLessThan1.toString();
        indexLessThan1.index = 100;
        int int9 = indexLessThan1.index;
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(10)" + "'", str6, ":lt(10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:containsown(hi!)=:containsown([^:gt(32)])]");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[[:only-child!=nth-last-child]]");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (short) 100);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthLastOfType2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":eq(100)");
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:only-child!=nth-last-child]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:only-child!=nth-last-child]" + "'", str2, "[:only-child!=nth-last-child]");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":containsOwn([nth-last-of-type*=:last-child])", ":contains(:gt(97))");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueNot2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsown([nth-last-of-type*=:last-child])!=:contains(:gt(97))]" + "'", str3, "[:containsown([nth-last-of-type*=:last-child])!=:contains(:gt(97))]");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[^=:first-child]*=hi!]");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([[^=:first-child]*=hi!])" + "'", str2, ":contains([[^=:first-child]*=hi!])");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        indexLessThan1.index = 32;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        int int7 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^:containsdata(:containsown())]", "[:nth-last-child(100n+100)]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueNot2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 10, (int) 'a');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(-1)=:nth-of-type(1n+52)]", ":only-child");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        java.lang.String str5 = attributeWithValueStarting2.toString();
        java.lang.String str6 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueStarting2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str3, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str4, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str5, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":only-child" + "'", str6, ":only-child");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', 97);
        java.lang.String str3 = isNthChild2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(32n+97)" + "'", str3, ":nth-child(32n+97)");
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]" + "'", str2, "[^[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]");
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        java.lang.String str4 = allElements0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = allElements0.matches(element5, element6);
        java.lang.String str8 = allElements0.toString();
        java.lang.String str9 = allElements0.toString();
        java.lang.String str10 = allElements0.toString();
        java.lang.String str11 = allElements0.toString();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = allElements0.matches(element12, element13);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = allElements0.matches(element15, element16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[^nth-last-of-type]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:last-child]", ":last-of-type");
        java.lang.String str3 = attributeWithValueEnding2.value;
        java.lang.String str4 = attributeWithValueEnding2.toString();
        java.lang.String str5 = attributeWithValueEnding2.toString();
        java.lang.String str6 = attributeWithValueEnding2.toString();
        java.lang.String str7 = attributeWithValueEnding2.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueEnding2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str4, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str5, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str6, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str7, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("", "[:contains(:only-child)^=:containsown(:nth-of-type(97n+97))]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:matches(null)$=:last-child]", "#nth-last-child");
        attributeWithValueContaining2.value = "[[^:contains(:eq(-1))]=[^:contains(:eq(-1))]]";
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)$=.nth-last-child]", "[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = "#:gt(32)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:matches(null)$=.nth-last-child]^=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]" + "'", str3, "[[:matches(null)$=.nth-last-child]^=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(100)^=*]", ":contains(nth-last-child)");
        attributeWithValueStarting2.value = ":containsOwn([nth-last-of-type*=:last-child])";
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":containsOwn([nth-last-of-type*=:last-child])" + "'", str5, ":containsOwn([nth-last-of-type*=:last-child])");
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[^:root]$=:last-child]");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        java.lang.String str4 = containsText1.toString();
        java.lang.String str5 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([[^:root]$=:last-child])" + "'", str2, ":contains([[^:root]$=:last-child])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains([[^:root]$=:last-child])" + "'", str3, ":contains([[^:root]$=:last-child])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains([[^:root]$=:last-child])" + "'", str4, ":contains([[^:root]$=:last-child])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":contains([[^:root]$=:last-child])" + "'", str5, ":contains([[^:root]$=:last-child])");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 100, (int) ' ');
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthChild2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 1, (-1));
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":nth-of-type(97n+1)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = id1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(".[^:gt(32)]");
        java.lang.String str2 = tagEndsWith1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tagEndsWith1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[^:gt(32)]" + "'", str2, ".[^:gt(32)]");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]=[nth-child=:last-child]]");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-last-child(0)", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-child(0)^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[:nth-last-child(0)^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-last-child(0)^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str4, "[:nth-last-child(0)^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]" + "'", str5, "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 1, 35);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":nth-child(-1n)");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":nth-child(97n)");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#:nth-child(97n)" + "'", str2, "#:nth-child(97n)");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":matches(null)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = class1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        indexEquals1.index = 35;
        indexEquals1.index = 'a';
        java.lang.String str6 = indexEquals1.toString();
        java.lang.String str7 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(97)" + "'", str6, ":eq(97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(97)" + "'", str7, ":eq(97)");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:containsData(nth-last-child)", "[[nth-of-type!=:eq(1)]^=:containsown([^hi!])]");
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-last-child^=:matchesown(null)]", pattern1);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        int int7 = isLastOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
        java.lang.String str8 = isFirstOfType0.getPseudoClass();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = isFirstOfType0.calculatePosition(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-of-type" + "'", str8, "nth-of-type");
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        java.lang.String str4 = allElements0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = allElements0.matches(element5, element6);
        java.lang.String str8 = allElements0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = allElements0.matches(element9, element10);
        java.lang.String str12 = allElements0.toString();
        java.lang.String str13 = allElements0.toString();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = allElements0.matches(element14, element15);
        java.lang.String str17 = allElements0.toString();
        java.lang.String str18 = allElements0.toString();
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.nodes.Element element20 = null;
        boolean boolean21 = allElements0.matches(element19, element20);
        java.lang.String str22 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "*" + "'", str17, "*");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "*" + "'", str18, "*");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "*" + "'", str22, "*");
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsData(nth-child)", pattern1);
        attributeWithValueMatching2.key = ".[^:gt(32)]";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("nth-last-child", ":matchesOwn(null)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.key = "[[^nth-last-of-type]=:contains(:contains(:last-child))]";
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueStarting2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-child^=:matchesown(null)]" + "'", str3, "[nth-last-child^=:matchesown(null)]");
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (short) 1);
        int int3 = isNthLastChild2.a;
        int int4 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:nth-last-of-type(100n+35)]", "[^:lt(100)]");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 100);
        int int3 = isNthLastChild2.b;
        int int4 = isNthLastChild2.a;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthLastChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[:first-of-type=:eq(32)]$=[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".:containsData(:containsdata(:gt(32)))", pattern1);
        attributeWithValueMatching2.key = ".#hi!";
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "nth-last-child";
        attributeWithValueMatching2.key = "[:matches(null)$=[[:last-child]$=:last-of-type]]";
        java.lang.String str12 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "";
        java.util.regex.Pattern pattern15 = null;
        attributeWithValueMatching2.pattern = pattern15;
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str12, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]", pattern1);
        attributeWithValueMatching2.key = "[[[:last-of-type]$=:last-of-type]=[:lt(-1)=:nth-of-type(1n+52)]]";
        attributeWithValueMatching2.key = "[:first-child]";
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(97, 97);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isFirstOfType0.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) (byte) 1);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.toString();
        java.lang.String str5 = isNthOfType2.toString();
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isNthOfType2.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-of-type(-1n+1)" + "'", str4, ":nth-of-type(-1n+1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-of-type(-1n+1)" + "'", str5, ":nth-of-type(-1n+1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        java.lang.String str7 = allElements0.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = allElements0.matches(element8, element9);
        java.lang.String str11 = allElements0.toString();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = allElements0.matches(element12, element13);
        java.lang.String str15 = allElements0.toString();
        java.lang.String str16 = allElements0.toString();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = allElements0.matches(element17, element18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "*" + "'", str15, "*");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "*" + "'", str16, "*");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[nth-child!=:nth-child(97)]", "[:containsData(:containsown())=[:last-child^=[:last-child]]]");
        java.lang.String str3 = attributeWithValueStarting2.value;
        attributeWithValueStarting2.value = "[[:nth-child(97)!=[nth-of-type]]!=[^[:nth-last-of-type(97n-1)]]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsdata(:containsown())=[:last-child^=[:last-child]]]" + "'", str3, "[:containsdata(:containsown())=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        attributeWithValueMatching2.key = "[^=:first-child]";
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[:nth-child(97)^=.nth-last-child]$=:eq(1)]", ":gt(52)");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]", ":last-child");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValue2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]=:last-child]" + "'", str3, "[[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]=:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]=:last-child]" + "'", str4, "[[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]=:last-child]");
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^:gt(32)]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        java.lang.String str4 = containsOwnText1.toString();
        java.lang.String str5 = containsOwnText1.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = containsOwnText1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^:gt(32)])" + "'", str2, ":containsOwn([^:gt(32)])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([^:gt(32)])" + "'", str3, ":containsOwn([^:gt(32)])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn([^:gt(32)])" + "'", str4, ":containsOwn([^:gt(32)])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":containsOwn([^:gt(32)])" + "'", str5, ":containsOwn([^:gt(32)])");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isNthLastChild2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }
}

