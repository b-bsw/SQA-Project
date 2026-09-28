package org.jsoup.select;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":first-child", ":gt(35)");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:containsOwn(hi!)]");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":matches(null)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueMatching2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains(:only-child)");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsOwn(:only-child)");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = tag1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:only-child)" + "'", str2, ":containsOwn(:only-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:only-child)" + "'", str3, ":containsOwn(:only-child)");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (int) '4');
        int int3 = isNthOfType2.a;
        int int4 = isNthOfType2.a;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = isNthOfType2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
        java.lang.String str8 = isFirstOfType0.toString();
        java.lang.String str9 = isFirstOfType0.toString();
        java.lang.String str10 = isFirstOfType0.toString();
        java.lang.String str11 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-of-type" + "'", str9, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":first-of-type" + "'", str10, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":first-of-type" + "'", str11, ":first-of-type");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":eq(100)", ":last-of-type");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.key;
        java.lang.String str6 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:eq(100)*=:last-of-type]" + "'", str4, "[:eq(100)*=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(100)" + "'", str5, ":eq(100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:eq(100)*=:last-of-type]" + "'", str6, "[:eq(100)*=:last-of-type]");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) (byte) 100);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 0, 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:eq(-1)=[[:last-child^=[:last-child]]]]");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsData(:containsown())");
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
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[#nth-last-child]*=:containsOwn([:only-child*=:containsdata(nth-last-child)])]");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', (int) '#');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:last-child]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:last-child]" + "'", str2, "[:last-child]");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        int int2 = isFirstOfType0.a;
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        java.lang.String str6 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isFirstOfType0.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[.[^:gt(32)]!=hi!]");
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
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        int int7 = isLastOfType0.a;
        int int8 = isLastOfType0.b;
        java.lang.String str9 = isLastOfType0.toString();
        java.lang.String str10 = isLastOfType0.getPseudoClass();
        java.lang.String str11 = isLastOfType0.getPseudoClass();
        java.lang.String str12 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":last-of-type" + "'", str9, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nth-last-of-type" + "'", str10, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nth-last-of-type" + "'", str11, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":last-of-type" + "'", str12, ":last-of-type");
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        int int7 = isNthChild2.b;
        int int8 = isNthChild2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', (int) (short) 1);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        int int4 = isNthChild2.b;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-of-type(97n+97)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type!=:containsData([:empty=:matches(null)])]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(97n+97)" + "'", str3, ":nth-of-type(97n+97)");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) -1, (int) '4');
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
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":nth-last-child(-1n-1)");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        java.lang.Class<?> wildcardClass4 = tag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-last-child(-1n-1)" + "'", str2, ":nth-last-child(-1n-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(-1n-1)" + "'", str3, ":nth-last-child(-1n-1)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(".:containsData(nth-last-child)");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:containsData(nth-last-child)" + "'", str2, ".:containsData(nth-last-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".:containsData(nth-last-child)" + "'", str3, ".:containsData(nth-last-child)");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]=[nth-child=:last-child]]]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        java.lang.String str6 = indexLessThan1.toString();
        indexLessThan1.index = 100;
        java.lang.String str9 = indexLessThan1.toString();
        int int10 = indexLessThan1.index;
        java.lang.String str11 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(10)" + "'", str6, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(100)" + "'", str9, ":lt(100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":lt(100)" + "'", str11, ":lt(100)");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", ":eq(1)");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-of-type*=:eq(1)]" + "'", str3, "[nth-last-of-type*=:eq(1)]");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = allElements0.matches(element12, element13);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = allElements0.matches(element15, element16);
        java.lang.String str18 = allElements0.toString();
        java.lang.String str19 = allElements0.toString();
        java.lang.String str20 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "*" + "'", str18, "*");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "*" + "'", str19, "*");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "*" + "'", str20, "*");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":gt(-1)", ".#[:nth-child(97)^=.nth-last-child]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)$=.#[:nth-child(97)^=.nth-last-child]]" + "'", str3, "[:gt(-1)$=.#[:nth-child(97)^=.nth-last-child]]");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[nth-last-of-type*=:last-child]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[nth-last-of-type*=:last-child]" + "'", str2, "#[nth-last-of-type*=:last-child]");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]", "[^=:matches(null)]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]!=[^=:matches(null)]]" + "'", str3, "[[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]!=[^=:matches(null)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]" + "'", str4, "[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(".[:lt(100)^=*]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) -1, 52);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:root^=[^=[:last-child]]]", "[[:last-child]=:matches(null)]");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:root^=[^=[:last-child]]]=[[:last-child]=:matches(null)]]" + "'", str3, "[[:root^=[^=[:last-child]]]=[[:last-child]=:matches(null)]]");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^=:first-child]", "hi!");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.value = ".[.nth-last-child$=[:last-child^=[:last-child]]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^=:first-child]*=hi!]" + "'", str3, "[[^=:first-child]*=hi!]");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":gt(0)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(0)" + "'", str2, ":gt(0)");
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-last-of-type(100n+52)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-last-of-type(100n+52)" + "'", str2, ":nth-last-of-type(100n+52)");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[^[:only-child*=:containsdata(nth-last-child)]]]", "[:last-child]");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child]" + "'", str3, "[:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[^[:only-child*=:containsdata(nth-last-child)]]]*=[:last-child]]" + "'", str4, "[[[^[:only-child*=:containsdata(nth-last-child)]]]*=[:last-child]]");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsData(#:last-child)", pattern1);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsown(hi!)");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsown(hi!)" + "'", str2, ":containsown(hi!)");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^.]", pattern1);
        attributeWithValueMatching2.key = "";
        attributeWithValueMatching2.key = ":eq(0)";
        java.util.regex.Pattern pattern7 = attributeWithValueMatching2.pattern;
        java.lang.String str8 = attributeWithValueMatching2.key;
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(0)" + "'", str8, ":eq(0)");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":gt(97)");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:gt(97))" + "'", str2, ":contains(:gt(97))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(:gt(97))" + "'", str3, ":contains(:gt(97))");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-child!=:nth-child(97)]");
        java.lang.String str2 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([nth-child!=:nth-child(97)])" + "'", str2, ":containsData([nth-child!=:nth-child(97)])");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-of-type", pattern1);
        attributeWithValueMatching2.key = ":lt(-1)";
        java.lang.String str5 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(-1)" + "'", str5, ":lt(-1)");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, 10);
        int int3 = isNthChild2.a;
        int int4 = isNthChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":eq(100)", ":last-of-type");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.value = ":containsData([^:lt(100)])";
        java.lang.String str7 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:eq(100)*=:last-of-type]" + "'", str4, "[:eq(100)*=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:eq(100)*=:containsData([^:lt(100)])]" + "'", str7, "[:eq(100)*=:containsData([^:lt(100)])]");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) '#', (int) (short) 0);
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
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(32, (-1));
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) 'a', (int) (byte) 10);
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
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:last-child^=[:last-child]]");
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
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        indexEquals1.index = 35;
        int int4 = indexEquals1.index;
        int int5 = indexEquals1.index;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = indexEquals1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:eq(-1)!=:matches(null)]", pattern1);
        attributeWithValueMatching2.key = "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]";
        attributeWithValueMatching2.key = "[nth-of-type!=:containsdata([:empty=:matches(null)])]";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        indexEquals1.index = (byte) -1;
        indexEquals1.index = (byte) 1;
        java.lang.String str8 = indexEquals1.toString();
        java.lang.String str9 = indexEquals1.toString();
        java.lang.String str10 = indexEquals1.toString();
        indexEquals1.index = (byte) 10;
        java.lang.String str13 = indexEquals1.toString();
        indexEquals1.index = ' ';
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(1)" + "'", str8, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":eq(1)" + "'", str9, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":eq(1)" + "'", str10, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":eq(10)" + "'", str13, ":eq(10)");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.getPseudoClass();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.toString();
        int int5 = isLastOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-last-of-type" + "'", str2, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', (-1));
        int int3 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:gt(1)!=:containsOwn(hi!)]", "[nth-last-of-type]");
        java.lang.String str3 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(1)!=:containsown(hi!)]" + "'", str3, "[:gt(1)!=:containsown(hi!)]");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, (int) (short) 100);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.toString();
        int int7 = isNthLastChild2.b;
        java.lang.String str8 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-last-child(97n+100)" + "'", str6, ":nth-last-child(97n+100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-child" + "'", str8, "nth-last-child");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:eq(-1)!=:matches(null)]", pattern1);
        attributeWithValueMatching2.key = "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]";
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
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[[^[:only-child*=:containsdata(nth-last-child)]]]*=[:last-child]]", "[:only-of-type!=[:lt(100)*=:containsown()]]");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-of-type", pattern1);
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
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) (byte) 100);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (int) '#');
        int int3 = isNthLastOfType2.a;
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        java.lang.String str5 = isNthLastOfType2.getPseudoClass();
        int int6 = isNthLastOfType2.a;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = isNthLastOfType2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        java.lang.String str7 = isNthOfType2.getPseudoClass();
        int int8 = isNthOfType2.a;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = isNthOfType2.calculatePosition(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(0)" + "'", str3, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 1);
        indexLessThan1.index = (short) 100;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        indexLessThan1.index = 97;
        java.lang.String str9 = indexLessThan1.toString();
        int int10 = indexLessThan1.index;
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = indexLessThan1.matches(element11, element12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(97)" + "'", str9, ":lt(97)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".:containsData(nth-last-child)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = ":nth-last-of-type(32n)";
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:nth-last-of-type(100n+35)]", ":lt(1)");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.toString();
        int int8 = isFirstOfType0.b;
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsData(:gt(1))");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 100, 100);
        int int3 = isNthOfType2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[nth-last-of-type]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[nth-last-of-type]" + "'", str2, "#[nth-last-of-type]");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains([:last-child])", "[[:matches(null)$=[[:last-child]$=:last-of-type]]=:matches(null)]");
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":gt(1)", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[[[^nth-last-of-type]=:contains(:contains(:last-child))]]";
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn(:containsown([^:lt(100)]))", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        java.lang.String str3 = attributeWithValueNot2.key;
        attributeWithValueNot2.key = ":only-child";
        java.lang.String str6 = attributeWithValueNot2.toString();
        java.lang.String str7 = attributeWithValueNot2.key;
        java.lang.String str8 = attributeWithValueNot2.toString();
        attributeWithValueNot2.value = "[:lt(1)!=.#hi!]";
        java.lang.String str11 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:only-child!=nth-last-child]" + "'", str6, "[:only-child!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:only-child!=nth-last-child]" + "'", str8, "[:only-child!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[:only-child!=[:lt(1)!=.#hi!]]" + "'", str11, "[:only-child!=[:lt(1)!=.#hi!]]");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(-1)!=:matches(null)]", "#[:last-child^=[:last-child]]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(-1)!=:matches(null)]^=#[:last-child^=[:last-child]]]" + "'", str3, "[[:lt(-1)!=:matches(null)]^=#[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
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
        org.jsoup.nodes.Element element24 = null;
        org.jsoup.nodes.Element element25 = null;
        boolean boolean26 = allElements0.matches(element24, element25);
        org.jsoup.nodes.Element element27 = null;
        org.jsoup.nodes.Element element28 = null;
        boolean boolean29 = allElements0.matches(element27, element28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]" + "'", str2, "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]" + "'", str3, "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[[:empty=:matches(null)]=hi!]]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":lt(1)", ".#hi!");
        java.lang.String str3 = attributeWithValueNot2.toString();
        attributeWithValueNot2.value = "[[^:contains(:nth-last-of-type(100n+35))]=[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]]";
        attributeWithValueNot2.value = "[.nth-last-child^=hi!]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:lt(1)!=.#hi!]" + "'", str3, "[:lt(1)!=.#hi!]");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isFirstOfType0.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.key;
        java.lang.String str4 = attributeWithValueEnding2.key;
        java.lang.String str5 = attributeWithValueEnding2.value;
        java.lang.String str6 = attributeWithValueEnding2.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueEnding2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":matches(null)" + "'", str4, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str5, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str6, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        int int5 = isFirstOfType0.a;
        java.lang.String str6 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isFirstOfType0.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#:contains(nth-last-child)", ":eq(100)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#:contains(nth-last-child)^=:eq(100)]" + "'", str3, "[#:contains(nth-last-child)^=:eq(100)]");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 0);
        int int2 = indexGreaterThan1.index;
        indexGreaterThan1.index = 0;
        java.lang.String str5 = indexGreaterThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(0)" + "'", str5, ":gt(0)");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":containsData(#:last-child)", "[nth-last-of-type*=[[:containsOwn(:eq(52))]]]");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 1, (int) (short) 1);
        int int3 = isNthChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("*");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        java.lang.String str4 = id1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = id1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#*" + "'", str2, "#*");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#*" + "'", str3, "#*");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#*" + "'", str4, "#*");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsOwn([nth-child!=:nth-child(97)])");
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".[^nth-last-child]", pattern1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueMatching2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn([:last-child])", ":gt(100)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsown([:last-child])*=:gt(100)]" + "'", str3, "[:containsown([:last-child])*=:gt(100)]");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
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
        java.lang.String str15 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "*" + "'", str15, "*");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-of-type]");
        java.lang.String str2 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([nth-of-type])" + "'", str2, ":containsData([nth-of-type])");
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, 1);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-last-of-type(32)");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#:contains(nth-child)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(#:contains(nth-child))" + "'", str2, ":contains(#:contains(nth-child))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(#:contains(nth-child))" + "'", str3, ":contains(#:contains(nth-child))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(#:contains(nth-child))" + "'", str4, ":contains(#:contains(nth-child))");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, (int) (byte) 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        int int5 = isNthLastChild2.a;
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        java.lang.String str8 = isNthLastChild2.getPseudoClass();
        java.lang.String str9 = isNthLastChild2.getPseudoClass();
        java.lang.String str10 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-child" + "'", str8, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-child" + "'", str9, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nth-last-child" + "'", str10, "nth-last-child");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) 10);
        java.lang.String str2 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(10)" + "'", str2, ":gt(10)");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-of-type" + "'", str9, "nth-of-type");
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(97, (int) (short) 0);
        int int3 = isNthChild2.b;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
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
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = isRoot0.matches(element15, element16);
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = isRoot0.matches(element18, element19);
        java.lang.String str21 = isRoot0.toString();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.nodes.Element element23 = null;
        boolean boolean24 = isRoot0.matches(element22, element23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":root" + "'", str21, ":root");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:gt(-1)*=:first-of-type]");
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(97, (int) (short) 0);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[.:containsdata()^=#:contains(nth-child)]", ":containsOwn(:nth-last-of-type(97n-1))");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        java.lang.String str6 = indexGreaterThan1.toString();
        int int7 = indexGreaterThan1.index;
        int int8 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(97)" + "'", str5, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(97)" + "'", str6, ":gt(97)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[.[^:gt(32)]$=:containsOwn([^hi!])]", ":containsData([^hi!])");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[^=:first-child]*=hi!]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[^=:first-child]*=hi!]" + "'", str2, "[[^=:first-child]*=hi!]");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:eq(52)!=[:only-child^=:containsown()]]");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = tagEndsWith1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:eq(52)!=[:only-child^=:containsown()]]" + "'", str2, "[:eq(52)!=[:only-child^=:containsown()]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(52)!=[:only-child^=:containsown()]]" + "'", str3, "[:eq(52)!=[:only-child^=:containsown()]]");
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.toString();
        int int9 = isFirstOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.MatchesOwn matchesOwn1 = new org.jsoup.select.Evaluator.MatchesOwn(pattern0);
        java.lang.String str2 = matchesOwn1.toString();
        java.lang.String str3 = matchesOwn1.toString();
        java.lang.String str4 = matchesOwn1.toString();
        java.lang.String str5 = matchesOwn1.toString();
        java.lang.String str6 = matchesOwn1.toString();
        java.lang.String str7 = matchesOwn1.toString();
        java.lang.String str8 = matchesOwn1.toString();
        java.lang.String str9 = matchesOwn1.toString();
        java.lang.String str10 = matchesOwn1.toString();
        java.lang.String str11 = matchesOwn1.toString();
        java.lang.String str12 = matchesOwn1.toString();
        java.lang.String str13 = matchesOwn1.toString();
        java.lang.String str14 = matchesOwn1.toString();
        java.lang.String str15 = matchesOwn1.toString();
        java.lang.String str16 = matchesOwn1.toString();
        java.lang.String str17 = matchesOwn1.toString();
        java.lang.String str18 = matchesOwn1.toString();
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.nodes.Element element20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = matchesOwn1.matches(element19, element20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matchesOwn(null)" + "'", str2, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matchesOwn(null)" + "'", str3, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":matchesOwn(null)" + "'", str4, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":matchesOwn(null)" + "'", str5, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":matchesOwn(null)" + "'", str6, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":matchesOwn(null)" + "'", str7, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":matchesOwn(null)" + "'", str8, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":matchesOwn(null)" + "'", str9, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":matchesOwn(null)" + "'", str10, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":matchesOwn(null)" + "'", str11, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":matchesOwn(null)" + "'", str12, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":matchesOwn(null)" + "'", str13, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":matchesOwn(null)" + "'", str14, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":matchesOwn(null)" + "'", str15, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":matchesOwn(null)" + "'", str16, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":matchesOwn(null)" + "'", str17, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":matchesOwn(null)" + "'", str18, ":matchesOwn(null)");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
        java.lang.String str5 = isNthLastChild2.toString();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        int int7 = isNthLastChild2.b;
        java.lang.String str8 = isNthLastChild2.toString();
        int int9 = isNthLastChild2.b;
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = isNthLastChild2.calculatePosition(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(100n+10)" + "'", str5, ":nth-last-child(100n+10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":nth-last-child(100n+10)" + "'", str8, ":nth-last-child(100n+10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) 'a');
        int int3 = isNthLastChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(100n+10)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[[[:last-child]]*=:containsData(:containsown())]";
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:lt(10)$=[:containsown(:eq(52))]]", "[:nth-last-of-type(1n+35)*=:eq(52)]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(10)$=[:containsown(:eq(52))]]!=[:nth-last-of-type(1n+35)*=:eq(52)]]" + "'", str3, "[[:lt(10)$=[:containsown(:eq(52))]]!=[:nth-last-of-type(1n+35)*=:eq(52)]]");
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[*=:last-child]^=[:containsown([nth-last-of-type*=:last-child])!=:contains(:gt(97))]]");
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":eq(0)", ".[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]");
        attributeWithValueEnding2.key = ":containsData([^hi!])";
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[nth-last-of-type*=[[:containsOwn(:eq(52))]]]");
        java.lang.Class<?> wildcardClass2 = containsText1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        int int6 = isFirstOfType0.b;
        java.lang.String str7 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":nth-child(32n+97)", "[:first-of-type*=:contains(nth-last-child)]");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        java.lang.String str10 = isRoot0.toString();
        java.lang.String str11 = isRoot0.toString();
        java.lang.String str12 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":root" + "'", str10, ":root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":root" + "'", str11, ":root");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":root" + "'", str12, ":root");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(100, (int) (byte) 0);
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
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(32, 0);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains(:nth-last-of-type(100n+35))");
        java.lang.Class<?> wildcardClass2 = class1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        indexLessThan1.index = (byte) 10;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:nth-child(1)$=:containsown([^=:matches(null)])]");
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:last-child]", ":last-of-type");
        java.lang.String str3 = attributeWithValueEnding2.value;
        attributeWithValueEnding2.key = "[:last-of-type]";
        java.lang.String str6 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.key = ".";
        java.lang.String str9 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.key = ":containsdata([:empty=:matches(null)])";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[:last-of-type]$=:last-of-type]" + "'", str6, "[[:last-of-type]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[.$=:last-of-type]" + "'", str9, "[.$=:last-of-type]");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[:matches(null)!=:nth-of-type(0)]*=:first-child]");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[^:contains(:eq(-1))]=[^:contains(:eq(-1))]]", "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
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
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[^:containsdata(:nth-of-type(0))]");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[^:containsdata(:nth-of-type(0))]" + "'", str2, "#[^:containsdata(:nth-of-type(0))]");
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        java.lang.String str8 = indexLessThan1.toString();
        java.lang.String str9 = indexLessThan1.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = indexLessThan1.matches(element13, element14);
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = indexLessThan1.matches(element16, element17);
        int int19 = indexLessThan1.index;
        org.jsoup.nodes.Element element20 = null;
        org.jsoup.nodes.Element element21 = null;
        boolean boolean22 = indexLessThan1.matches(element20, element21);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.nodes.Element element24 = null;
        boolean boolean25 = indexLessThan1.matches(element23, element24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(0)" + "'", str8, ":lt(0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(0)" + "'", str9, ":lt(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) 'a', (int) '#');
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:eq(0)!=[nth-child!=:nth-child(97)]]");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:eq(0)!=[nth-child!=:nth-child(97)]]]" + "'", str2, "[[:eq(0)!=[nth-child!=:nth-child(97)]]]");
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":gt(32)", "[:gt(1)!=:containsOwn(hi!)]");
        attributeWithValueEnding2.key = "[^:gt(97)]";
        java.lang.String str5 = attributeWithValueEnding2.key;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^:gt(97)]" + "'", str5, "[^:gt(97)]");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(".:first-child", "[.nth-last-child!=[:lt(100)^=*]]");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 10, (int) '#');
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.b;
        int int3 = isLastOfType0.a;
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isLastOfType0.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        java.lang.String str4 = allElements0.toString();
        java.lang.String str5 = allElements0.toString();
        java.lang.String str6 = allElements0.toString();
        java.lang.String str7 = allElements0.toString();
        java.lang.String str8 = allElements0.toString();
        java.lang.String str9 = allElements0.toString();
        java.lang.String str10 = allElements0.toString();
        java.lang.String str11 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "*" + "'", str5, "*");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "*" + "'", str6, "*");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[^*]");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^*]" + "'", str2, "[^*]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^*]" + "'", str3, "[^*]");
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, (int) (short) 0);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[#:contains(nth-last-child)$=:eq(1)]", "[.[^=:matches(null)]=[^:containsdata(:containsown())]]");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.getPseudoClass();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-of-type" + "'", str2, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
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
        java.lang.String str15 = isLastChild0.toString();
        java.lang.String str16 = isLastChild0.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":last-child" + "'", str15, ":last-child");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":last-child" + "'", str16, ":last-child");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:first-of-type*=:contains(nth-last-child)]", ".:containsData(nth-last-child)");
        attributeWithValueContaining2.value = ":nth-of-type(10)";
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:eq(52)!=[:only-child^=:containsown()]]");
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]");
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
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
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
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[:matches(null)!=:nth-of-type(0)]*=:first-child]", ":containsData([:empty=:matches(null)])");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(35, (-1));
        int int3 = isNthChild2.b;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains(:nth-of-type(35n+35))");
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
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:matches(null)!=:nth-of-type(0)]", "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
        java.lang.String str3 = attributeWithValue2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValue2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:matches(null)!=:nth-of-type(0)]=[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]]" + "'", str3, "[[:matches(null)!=:nth-of-type(0)]=[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]]");
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:last-child]", ":contains(.nth-last-child)");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]$=:contains(.nth-last-child)]" + "'", str3, "[[:last-child]$=:contains(.nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]$=:contains(.nth-last-child)]" + "'", str4, "[[:last-child]$=:contains(.nth-last-child)]");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        indexEquals1.index = (byte) -1;
        indexEquals1.index = (byte) 1;
        java.lang.String str8 = indexEquals1.toString();
        int int9 = indexEquals1.index;
        java.lang.String str10 = indexEquals1.toString();
        indexEquals1.index = (byte) 0;
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexEquals1.matches(element13, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(1)" + "'", str8, ":eq(1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":eq(1)" + "'", str10, ":eq(1)");
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 1);
        java.lang.String str2 = indexEquals1.toString();
        java.lang.String str3 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(1)" + "'", str2, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(1)" + "'", str3, ":eq(1)");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[.#hi!!=:first-of-type]");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(35, 32);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(35n+32)" + "'", str3, ":nth-last-of-type(35n+32)");
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]", "[:last-child]");
        attributeWithValue2.value = "[[^:lt(100)]*=:contains(nth-child)]";
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(:eq(-1))", "[:lt(-1)!=:matches(null)]");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(:eq(-1))=[:lt(-1)!=:matches(null)]]" + "'", str3, "[:contains(:eq(-1))=[:lt(-1)!=:matches(null)]]");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-of-type(10n+1)");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":eq(1)", "[^[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(1)$=[^[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]]]" + "'", str3, "[:eq(1)$=[^[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:eq(1)$=[^[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]]]" + "'", str4, "[:eq(1)$=[^[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]]]");
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[.:containsdata(nth-last-child)=[:lt(100)*=:containsown()]]");
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        int int5 = isFirstOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]" + "'", str2, "[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:only-child!=nth-last-child]]");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        java.lang.String str4 = tag1.toString();
        java.lang.String str5 = tag1.toString();
        java.lang.String str6 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:only-child!=nth-last-child]]" + "'", str2, "[[:only-child!=nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:only-child!=nth-last-child]]" + "'", str3, "[[:only-child!=nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:only-child!=nth-last-child]]" + "'", str4, "[[:only-child!=nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:only-child!=nth-last-child]]" + "'", str5, "[[:only-child!=nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[:only-child!=nth-last-child]]" + "'", str6, "[[:only-child!=nth-last-child]]");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:containsown([^:gt(32)])*=[nth-of-type]]");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:containsown([^:gt(32)])*=[nth-of-type]]" + "'", str2, ".[:containsown([^:gt(32)])*=[nth-of-type]]");
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[#nth-last-child]");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(:only-child)", ":gt(-1)");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(:only-child)=:gt(-1)]" + "'", str3, "[:contains(:only-child)=:gt(-1)]");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
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
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.nodes.Element element22 = null;
        boolean boolean23 = isRoot0.matches(element21, element22);
        java.lang.String str24 = isRoot0.toString();
        java.lang.String str25 = isRoot0.toString();
        java.lang.String str26 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":root" + "'", str20, ":root");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":root" + "'", str24, ":root");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":root" + "'", str25, ":root");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":root" + "'", str26, ":root");
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":only-child", ":containsData(nth-last-child)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.key = "[[:last-child]]";
        java.lang.String str7 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:only-child*=:containsdata(nth-last-child)]" + "'", str3, "[:only-child*=:containsdata(nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:only-child*=:containsdata(nth-last-child)]" + "'", str4, "[:only-child*=:containsdata(nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[[:last-child]]*=:containsdata(nth-last-child)]" + "'", str7, "[[[:last-child]]*=:containsdata(nth-last-child)]");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 100);
        int int2 = indexEquals1.index;
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(100)" + "'", str3, ":eq(100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(100)" + "'", str4, ":eq(100)");
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("*", "[^nth-last-child]");
        java.lang.String str3 = attributeWithValueNot2.value;
        java.lang.String str4 = attributeWithValueNot2.toString();
        java.lang.String str5 = attributeWithValueNot2.toString();
        java.lang.String str6 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^nth-last-child]" + "'", str3, "[^nth-last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[*!=[^nth-last-child]]" + "'", str4, "[*!=[^nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[*!=[^nth-last-child]]" + "'", str5, "[*!=[^nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "*" + "'", str6, "*");
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(97, (int) (short) 0);
        java.lang.String str3 = isNthChild2.toString();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(97n)" + "'", str3, ":nth-child(97n)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":nth-last-child(97n+97)", ":gt(32)");
        attributeWithValue2.value = ":containsOwn(:eq(97))";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValue2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[^:contains(nth-last-of-type)]");
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(nth-child)", ":eq(0)");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(nth-child)$=:eq(0)]" + "'", str3, "[:contains(nth-child)$=:eq(0)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:contains(nth-child)$=:eq(0)]" + "'", str4, "[:contains(nth-child)$=:eq(0)]");
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        int int2 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueMatching2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("#.:nth-last-child(1)");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[hi!!=nth-last-child]");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) '#', (-1));
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        int int6 = isNthChild2.a;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isNthChild2.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", "#:only-child");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]^=#:only-child]" + "'", str3, "[[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]^=#:only-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]^=#:only-child]" + "'", str4, "[[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]^=#:only-child]");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn([[[:last-child]=:matches(null)]*=nth-last-child])", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str4, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(35);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = indexLessThan1.matches(element8, element9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":matches(null)";
        java.lang.String str8 = attributeWithValueStarting2.toString();
        java.lang.String str9 = attributeWithValueStarting2.key;
        java.lang.String str10 = attributeWithValueStarting2.key;
        java.lang.String str11 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeWithValueStarting2.matches(element12, element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^=[:last-child]]" + "'", str5, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:matches(null)]" + "'", str8, "[^=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[^=:matches(null)]" + "'", str11, "[^=:matches(null)]");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(".:nth-last-child(100n+10)");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        indexGreaterThan1.index = (short) 1;
        java.lang.String str8 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(97)" + "'", str5, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":gt(1)" + "'", str8, ":gt(1)");
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":gt(32)", ":nth-child(52n-1)");
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
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) 'a', (int) (byte) 10);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[.[^:gt(32)]!=hi!]", "#[nth-last-of-type*=[[:containsOwn(:eq(52))]]]");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[nth-child=:last-child]^=[:only-child!=nth-last-child]]");
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
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:containsown([:last-child])]", "[[[:last-child]]*=:containsdata(nth-last-child)]");
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-last-of-type(100n+35)");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        java.lang.String str4 = attribute1.toString();
        java.lang.String str5 = attribute1.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:nth-last-of-type(100n+35)]" + "'", str2, "[:nth-last-of-type(100n+35)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-of-type(100n+35)]" + "'", str3, "[:nth-last-of-type(100n+35)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-last-of-type(100n+35)]" + "'", str4, "[:nth-last-of-type(100n+35)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-last-of-type(100n+35)]" + "'", str5, "[:nth-last-of-type(100n+35)]");
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 10, 0);
        int int3 = isNthLastChild2.b;
        int int4 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        java.lang.String str7 = isNthChild2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":nth-child(97)" + "'", str7, ":nth-child(97)");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn(:first-child)", ":root");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[[[^=:first-child]*=hi!]$=#:contains(nth-last-child)]");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":lt(0)", ":containsData(nth-last-child)");
        attributeWithValueNot2.key = ":nth-last-child(100n+100)";
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":contains(nth-last-child)");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:contains(nth-last-child))" + "'", str2, ":containsOwn(:contains(nth-last-child))");
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(-1)=:nth-of-type(1n+52)]", ":only-child");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        java.lang.String str5 = attributeWithValueStarting2.toString();
        java.lang.String str6 = attributeWithValueStarting2.value;
        java.lang.String str7 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str3, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str4, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str5, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":only-child" + "'", str6, ":only-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str7, "[:lt(-1)=:nth-of-type(1n+52)]");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
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
        java.lang.String str13 = isRoot0.toString();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = isRoot0.matches(element14, element15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":root" + "'", str13, ":root");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 10);
        java.lang.String str2 = indexEquals1.toString();
        java.lang.String str3 = indexEquals1.toString();
        indexEquals1.index = 52;
        java.lang.String str6 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(10)" + "'", str2, ":eq(10)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(10)" + "'", str3, ":eq(10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(52)" + "'", str6, ":eq(52)");
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(35);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        java.lang.String str6 = indexLessThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(35)" + "'", str6, ":lt(35)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:eq(100)*=:containsData([^:lt(100)])]", "[[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]^=#:only-child]");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, 97);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.toString();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        java.lang.String str7 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-child(100n+97)" + "'", str5, ":nth-child(100n+97)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:contains(:eq(-1))$=:contains(:containsown())]", ":containsOwn([^:lt(100)])");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[.#hi!!=:first-of-type]");
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":gt(-1)", ":first-of-type");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)*=:first-of-type]" + "'", str3, "[:gt(-1)*=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:gt(-1)*=:first-of-type]" + "'", str4, "[:gt(-1)*=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:gt(-1)*=:first-of-type]" + "'", str5, "[:gt(-1)*=:first-of-type]");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern7 = attributeWithValueMatching2.pattern;
        java.lang.String str8 = attributeWithValueMatching2.key;
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":eq(100)", ":nth-last-child(100n+100)");
        attributeWithValue2.value = ".#nth-last-child";
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-last-of-type(10n-1)", "#[:containsown(:nth-last-of-type(97n-1))=[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-of-type(10n-1)^=#[:containsown(:nth-last-of-type(97n-1))=[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]]" + "'", str3, "[:nth-last-of-type(10n-1)^=#[:containsown(:nth-last-of-type(97n-1))=[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]]");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.toString();
        int int8 = isNthLastChild2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":nth-last-child(100n+10)" + "'", str7, ":nth-last-child(100n+10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-of-type(100n+1)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueMatching2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(100n+1)" + "'", str3, ":nth-last-of-type(100n+1)");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":lt(100)", ":containsOwn()");
        attributeWithValueContaining2.value = ":contains(#[:last-child^=[:last-child]])";
        java.lang.String str5 = attributeWithValueContaining2.toString();
        java.lang.String str6 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(100)*=:contains(#[:last-child^=[:last-child]])]" + "'", str5, "[:lt(100)*=:contains(#[:last-child^=[:last-child]])]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str6, ":contains(#[:last-child^=[:last-child]])");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[^:root]");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), (int) '#');
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) 'a', 52);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, (int) ' ');
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', 1);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", "[^hi!]");
        java.lang.String str3 = attributeWithValueContaining2.key;
        attributeWithValueContaining2.value = ":contains()";
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueContaining2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]", ":last-child");
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
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^=:matches(null)]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^=:matches(null)])" + "'", str2, ":containsOwn([^=:matches(null)])");
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".:gt(-1)", pattern1);
        java.lang.Class<?> wildcardClass3 = attributeWithValueMatching2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[^.:nth-last-child(97n+97)]");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) 'a', (int) (byte) 0);
        int int3 = isNthChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = isRoot0.matches(element3, element4);
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":root" + "'", str19, ":root");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[:matches(null)$=[[:last-child]$=:last-of-type]]=:matches(null)]", ":only-of-type");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("", "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":contains(nth-child)");
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
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        int int4 = isLastOfType0.b;
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        int int6 = isLastOfType0.a;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isLastOfType0.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        int int5 = isNthOfType2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(0)" + "'", str3, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[.[^:eq(52)]$=[:containsown(:eq(52))=nth-of-type]]");
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("nth-child");
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#*");
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", "[nth-child!=:nth-child(97)]");
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
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) '#');
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(35)" + "'", str2, ":gt(35)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(35)" + "'", str3, ":gt(35)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(35)" + "'", str4, ":gt(35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(35)" + "'", str5, ":gt(35)");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(".:containsData(:containsown())");
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 100;
        int int5 = indexGreaterThan1.index;
        int int6 = indexGreaterThan1.index;
        indexGreaterThan1.index = (short) 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^:lt(100)]", "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^:lt(100)]!=[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]]" + "'", str3, "[[^:lt(100)]!=[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]]");
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":gt(32)");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:gt(32)]" + "'", str2, "[:gt(32)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(32)]" + "'", str3, "[:gt(32)]");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-child", pattern1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueMatching2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.toString();
        int int5 = isNthChild2.a;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        java.lang.String str7 = isNthChild2.getPseudoClass();
        int int8 = isNthChild2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97)" + "'", str4, ":nth-child(97)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isLastOfType0.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        attributeWithValueMatching2.key = ":only-of-type";
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = isRoot0.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = isRoot0.matches(element5, element6);
        java.lang.String str8 = isRoot0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = isRoot0.matches(element9, element10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn([^[nth-last-child^=:matchesown(null)]])");
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
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) -1);
        indexEquals1.index = 0;
        java.lang.String str4 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(0)" + "'", str4, ":eq(0)");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 10, 10);
        int int3 = isNthLastChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(52);
        int int2 = indexEquals1.index;
        int int3 = indexEquals1.index;
        indexEquals1.index = 32;
        java.lang.String str6 = indexEquals1.toString();
        java.lang.String str7 = indexEquals1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(32)" + "'", str6, ":eq(32)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(32)" + "'", str7, ":eq(32)");
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:eq(100)*=:last-of-type]", ":nth-last-child(97)");
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-of-type!=:containsdata([:empty=:matches(null)])]", pattern1);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:gt(32)]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:only-child*=[^nth-last-child]]", "[[nth-child=:last-child]^=[[:last-child]]]");
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[.$=:last-of-type]");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[.$=:last-of-type]" + "'", str2, "#[.$=:last-of-type]");
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":contains(#:nth-child(97))");
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 100);
        java.lang.String str2 = indexEquals1.toString();
        int int3 = indexEquals1.index;
        indexEquals1.index = (byte) -1;
        int int6 = indexEquals1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(100)" + "'", str2, ":eq(100)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".[:only-child!=nth-last-child]", ":containsData(:gt(32))");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.[:only-child!=nth-last-child]^=:containsdata(:gt(32))]" + "'", str3, "[.[:only-child!=nth-last-child]^=:containsdata(:gt(32))]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[.[:only-child!=nth-last-child]^=:containsdata(:gt(32))]" + "'", str4, "[.[:only-child!=nth-last-child]^=:containsdata(:gt(32))]");
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 52);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[^:containsdata([[^nth-last-of-type]=:contains(:contains(:last-child))])]");
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]=[nth-child=:last-child]]]");
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:containsOwn([:only-child*=:containsdata(nth-last-child)])!=]", "[:eq(0)=:nth-child(10n-1)]");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(1, (int) 'a');
        java.lang.String str3 = isNthChild2.toString();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(1n+97)" + "'", str3, ":nth-child(1n+97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:containsData(.[^nth-last-child])]", ":nth-last-child(35n+100)");
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        indexEquals1.index = (byte) -1;
        indexEquals1.index = (byte) 1;
        java.lang.String str8 = indexEquals1.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = indexEquals1.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(1)" + "'", str8, ":eq(1)");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":contains([:gt(-1)])");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#:contains([:gt(-1)])" + "'", str2, "#:contains([:gt(-1)])");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]", "[[:gt(32)]$=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]=[[:gt(32)]$=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]]" + "'", str3, "[[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]=[[:gt(32)]$=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]]");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".:only-of-type", "[[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]=:containsdata(nth-child)]");
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#[.nth-last-child$=[:last-child^=[:last-child]]]", "[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]");
        java.lang.String str3 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[.nth-last-child$=[:last-child^=[:last-child]]]" + "'", str3, "#[.nth-last-child$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:containsOwn(hi!)]");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-last-of-type(100n+1)");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) '#', 52);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:contains(:only-child)^=:containsown(:nth-of-type(97n+97))]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([:contains(:only-child)^=:containsown(:nth-of-type(97n+97))])" + "'", str2, ":containsOwn([:contains(:only-child)^=:containsown(:nth-of-type(97n+97))])");
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) '#', 52);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = isNthLastOfType2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', 52);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^[[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]^=[:containsown(:eq(52))]]]", pattern1);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        java.lang.String str8 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]", "[:gt(-1)]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]!=[:gt(-1)]]" + "'", str3, "[[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]!=[:gt(-1)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]!=[:gt(-1)]]" + "'", str4, "[[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]!=[:gt(-1)]]");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        java.lang.String str8 = indexLessThan1.toString();
        int int9 = indexLessThan1.index;
        java.lang.String str10 = indexLessThan1.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = indexLessThan1.matches(element11, element12);
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = indexLessThan1.matches(element14, element15);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = indexLessThan1.matches(element17, element18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(-1)" + "'", str8, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":lt(-1)" + "'", str10, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
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
        java.lang.String str13 = isFirstChild0.toString();
        java.lang.String str14 = isFirstChild0.toString();
        java.lang.String str15 = isFirstChild0.toString();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = isFirstChild0.matches(element16, element17);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":first-child" + "'", str13, ":first-child");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":first-child" + "'", str14, ":first-child");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":first-child" + "'", str15, ":first-child");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":first-of-type");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:first-of-type]" + "'", str2, "[^:first-of-type]");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[[:last-child]=:matches(null)]*=nth-last-child]", "[[^:contains(:eq(-1))]=[^:contains(:eq(-1))]]");
        attributeWithValue2.key = "[^:lt(-1)]";
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":containsData(nth-child)");
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
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(1);
        indexLessThan1.index = '4';
        int int4 = indexLessThan1.index;
        indexLessThan1.index = 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":gt(0)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[nth-child!=:nth-child(97)]", "[:containsData(:containsown())=[:last-child^=[:last-child]]]");
        java.lang.String str3 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str3, "[nth-child!=:nth-child(97)]");
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":nth-of-type(1n+52)", ":gt(97)");
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
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(10, (-1));
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(10, (int) '#');
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
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
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
        java.lang.String str18 = isRoot0.toString();
        java.lang.String str19 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":root" + "'", str15, ":root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":root" + "'", str17, ":root");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":root" + "'", str18, ":root");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":root" + "'", str19, ":root");
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[nth-last-of-type*=:last-child]", ":nth-of-type(32n+100)");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', 97);
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
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(100);
        java.lang.String str2 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isNthOfType2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":only-of-type", "[:lt(100)*=:containsown()]");
        attributeWithValueNot2.value = "";
        java.lang.String str5 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueNot2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:only-of-type!=]" + "'", str5, "[:only-of-type!=]");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        attributeWithValueMatching2.key = "[^:matches(null)]";
        java.util.regex.Pattern pattern10 = null;
        attributeWithValueMatching2.pattern = pattern10;
        java.util.regex.Pattern pattern12 = attributeWithValueMatching2.pattern;
        java.lang.String str13 = attributeWithValueMatching2.key;
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertNull(pattern12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[^:matches(null)]" + "'", str13, "[^:matches(null)]");
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) (byte) 0);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        int int4 = isNthChild2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.b;
        int int3 = isLastOfType0.b;
        java.lang.String str4 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:first-of-type=:eq(32)]$=[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]]");
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.toString();
        int int8 = isFirstOfType0.a;
        java.lang.String str9 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-of-type" + "'", str9, ":first-of-type");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = isRoot0.matches(element2, element3);
        java.lang.String str5 = isRoot0.toString();
        java.lang.String str6 = isRoot0.toString();
        java.lang.String str7 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[^:containsdata(.:gt(-1))]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
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
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) 1);
        indexGreaterThan1.index = (-1);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":contains(:last-child)");
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 0, (int) '#');
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[:last-child$=[:last-child^=[:last-child]]]!=:eq(10)]", ":contains(nth-child)");
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) ' ');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        java.lang.String str6 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(32)" + "'", str2, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(32)" + "'", str3, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(32)" + "'", str4, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(32)" + "'", str5, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(32)" + "'", str6, ":gt(32)");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":contains(:containsown(#))");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[^:contains(:nth-last-of-type(100n+35))]=[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]]");
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
        int int8 = isFirstOfType0.b;
        java.lang.String str9 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-of-type" + "'", str9, "nth-of-type");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-last-of-type*=:contains()]");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:containsown([:last-child])]");
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[[:last-of-type]$=:last-of-type]=[:lt(-1)=:nth-of-type(1n+52)]]", pattern1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueMatching2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:eq(-1)!=:matches(null)]", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[nth-last-of-type*=:only-of-type]";
        attributeWithValueMatching2.key = "[:last-child^=[[^:gt(-1)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]]";
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:gt(-1)*=:first-of-type]", "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
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
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-of-type(10)", ":lt(1)");
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":eq(35)");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(35)" + "'", str2, ":eq(35)");
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
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
        java.util.regex.Pattern pattern13 = null;
        attributeWithValueMatching2.pattern = pattern13;
        java.util.regex.Pattern pattern15 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = ":containsData(:nth-last-child(97n+100))";
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = attributeWithValueMatching2.matches(element18, element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str11, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertNull(pattern12);
        org.junit.Assert.assertNull(pattern15);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsData(:nth-of-type(0))");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        java.lang.String str4 = tag1.toString();
        java.lang.Class<?> wildcardClass5 = tag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:nth-of-type(0))" + "'", str2, ":containsData(:nth-of-type(0))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(:nth-of-type(0))" + "'", str3, ":containsData(:nth-of-type(0))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsData(:nth-of-type(0))" + "'", str4, ":containsData(:nth-of-type(0))");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^.]", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.lang.String str6 = attributeWithValueMatching2.key;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[^.]" + "'", str6, "[^.]");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(".");
        java.lang.Class<?> wildcardClass2 = attribute1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[:lt(-1)!=:matches(null)]=#[:nth-child(97)^=.nth-last-child]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:lt(-1)!=:matches(null)]=#[:nth-child(97)^=.nth-last-child]]" + "'", str2, "[[:lt(-1)!=:matches(null)]=#[:nth-child(97)^=.nth-last-child]]");
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#[:only-child*=:root]");
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
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]", pattern1);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":contains(:only-child)", "[.#hi!!=:first-of-type]");
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]", ":nth-last-child(100n+10)");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]$=:nth-last-child(100n+10)]" + "'", str3, "[[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]$=:nth-last-child(100n+10)]");
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsData(:containsown())", "[:nth-child(97)^=.nth-last-child]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[:last-child^=[:last-child]]";
        attributeWithValueEnding2.key = "[:matches(null)$=[[:last-child]$=:last-of-type]]";
        java.lang.String str8 = attributeWithValueEnding2.toString();
        java.lang.String str9 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]" + "'", str3, "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[:matches(null)$=[[:last-child]$=:last-of-type]]$=[:last-child^=[:last-child]]]" + "'", str8, "[[:matches(null)$=[[:last-child]$=:last-of-type]]$=[:last-child^=[:last-child]]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[:matches(null)$=[[:last-child]$=:last-of-type]]$=[:last-child^=[:last-child]]]" + "'", str9, "[[:matches(null)$=[[:last-child]$=:last-of-type]]$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[nth-of-type]");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[nth-of-type]]" + "'", str2, "[[nth-of-type]]");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(1, 10);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) 'a');
        indexLessThan1.index = 97;
        java.lang.String str4 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(97)" + "'", str4, ":lt(97)");
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^=:matches(null)]", "[:nth-last-of-type(97n-1)]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.key;
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]" + "'", str3, "[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[^=:matches(null)]" + "'", str4, "[^=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^=:matches(null)]" + "'", str5, "[^=:matches(null)]");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.key = ":lt(97)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:last-child^=[:last-child]]" + "'", str4, "[:last-child^=[:last-child]]");
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) '#', (int) (byte) 1);
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
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^.#hi!]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^.#hi!]" + "'", str3, "[^.#hi!]");
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:only-child*=:root]");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([:only-child*=:root])" + "'", str2, ":contains([:only-child*=:root])");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(97n+97)", pattern1);
        attributeWithValueMatching2.key = "[:only-child^=:containsown()]";
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
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
        org.jsoup.nodes.Element element20 = null;
        org.jsoup.nodes.Element element21 = null;
        boolean boolean22 = isRoot0.matches(element20, element21);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.nodes.Element element24 = null;
        boolean boolean25 = isRoot0.matches(element23, element24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.lang.String str7 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        java.lang.String str9 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]=[^*]]";
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":only-child" + "'", str9, ":only-child");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":eq(-1)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:eq(-1))" + "'", str2, ":contains(:eq(-1))");
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(97, (int) (byte) -1);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":containsData(.nth-last-child)");
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[[nth-last-of-type*=:eq(1)]$=:containsOwn(:eq(52))]");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        int int4 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#[:containsown(:nth-last-of-type(97n-1))=[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]", "*");
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:containsData(:gt(32))]");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsData(#[:eq(100)!=[:nth-of-type(1n+52)$=:containsdata()]])", "[:nth-last-child(-1n)*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
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
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:only-child*=:containsdata(nth-last-child)]");
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
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^:nth-child(35n+1)]");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), (int) 'a');
        java.lang.String str3 = isNthLastOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(-1n+97)" + "'", str3, ":nth-last-of-type(-1n+97)");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":eq(100)", ":last-of-type");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:eq(100)*=:last-of-type]" + "'", str4, "[:eq(100)*=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:eq(100)*=:last-of-type]" + "'", str5, "[:eq(100)*=:last-of-type]");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":contains(.nth-last-child)");
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(32, 1);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        java.lang.String str6 = indexLessThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(10)" + "'", str6, ":lt(10)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(32);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = indexGreaterThan1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(32)" + "'", str2, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(32)" + "'", str3, ":gt(32)");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(52);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(52)" + "'", str2, ":gt(52)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(52)" + "'", str3, ":gt(52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(52)" + "'", str4, ":gt(52)");
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[:matches(null)!=:nth-of-type(0)]=[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".[^.#hi!]", ".#[:last-child^=[:last-child]]");
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":last-child", ":matches(null)");
        attributeWithValueEnding2.value = "[:last-child^=[:last-child]]";
        java.lang.String str5 = attributeWithValueEnding2.toString();
        java.lang.String str6 = attributeWithValueEnding2.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:last-child$=[:last-child^=[:last-child]]]" + "'", str5, "[:last-child$=[:last-child^=[:last-child]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:last-child^=[:last-child]]" + "'", str6, "[:last-child^=[:last-child]]");
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":eq(52)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueMatching2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:lt(-1)!=:matches(null)]", pattern1);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":contains(:containsdata(:containsown()))" + "'", str13, ":contains(:containsdata(:containsown()))");
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":only-of-type", "[:lt(100)*=:containsown()]");
        attributeWithValueNot2.value = "";
        attributeWithValueNot2.key = ":containsOwn([:only-child*=:containsdata(nth-last-child)])";
        attributeWithValueNot2.key = "[.nth-last-child!=[:lt(100)^=*]]";
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:gt(-1)", "[[:last-child]^=[*!=[^nth-last-child]]]");
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(nth-child)", ":eq(0)");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        java.lang.String str5 = attributeWithValueEnding2.value;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueEnding2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(nth-child)$=:eq(0)]" + "'", str3, "[:contains(nth-child)$=:eq(0)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:contains(nth-child)$=:eq(0)]" + "'", str4, "[:contains(nth-child)$=:eq(0)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(0)" + "'", str5, ":eq(0)");
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[.nth-last-child!=[:lt(100)^=*]]");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[.nth-last-child!=[:lt(100)^=*]]]" + "'", str2, "[[.nth-last-child!=[:lt(100)^=*]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[.nth-last-child!=[:lt(100)^=*]]]" + "'", str3, "[[.nth-last-child!=[:lt(100)^=*]]]");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:nth-last-child(97n+100)^=:nth-last-child(97n+100)]", "#[^:contains(:eq(-1))]");
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
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(".:containsData(:gt(1))");
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[:matches(null)=hi!]]", ":containsOwn([^.:nth-last-child(97n+97)])");
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-child", ":nth-child(97)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
        attributeWithValueNot2.value = "[[[:empty=:matches(null)]=hi!]]";
        java.lang.String str7 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str3, "[nth-child!=:nth-child(97)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[nth-child!=[[[:empty=:matches(null)]=hi!]]]" + "'", str7, "[nth-child!=[[[:empty=:matches(null)]=hi!]]]");
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
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
        java.lang.String str15 = isLastChild0.toString();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = isLastChild0.matches(element16, element17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":last-child" + "'", str15, ":last-child");
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]", "[[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]=:nth-last-child(97n+100)]");
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":eq(35)");
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
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":contains(nth-child)");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        java.lang.String str4 = id1.toString();
        java.lang.String str5 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#:contains(nth-child)" + "'", str2, "#:contains(nth-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#:contains(nth-child)" + "'", str3, "#:contains(nth-child)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#:contains(nth-child)" + "'", str4, "#:contains(nth-child)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#:contains(nth-child)" + "'", str5, "#:contains(nth-child)");
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(35, (int) '#');
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
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) -1);
        int int2 = indexEquals1.index;
        java.lang.String str3 = indexEquals1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(-1)" + "'", str3, ":eq(-1)");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[.nth-last-child^=hi!]");
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
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) -1);
        int int2 = indexLessThan1.index;
        indexLessThan1.index = 0;
        int int5 = indexLessThan1.index;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = indexLessThan1.matches(element6, element7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[^[nth-last-child^=:matchesown(null)]]");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[^[nth-last-child^=:matchesown(null)]]]" + "'", str2, "[^[^[nth-last-child^=:matchesown(null)]]]");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        attributeWithValueMatching2.key = "[:contains(:nth-last-of-type(100n+35))]";
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
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = isRoot0.matches(element4, element5);
        java.lang.String str7 = isRoot0.toString();
        java.lang.String str8 = isRoot0.toString();
        java.lang.String str9 = isRoot0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = isRoot0.matches(element10, element11);
        java.lang.String str13 = isRoot0.toString();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = isRoot0.matches(element14, element15);
        java.lang.String str17 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":root" + "'", str13, ":root");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":root" + "'", str17, ":root");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', (int) (short) 1);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        int int4 = isNthChild2.b;
        java.lang.String str5 = isNthChild2.getPseudoClass();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".:containsData(nth-last-child)", pattern1);
        attributeWithValueMatching2.key = ":containsData([^:lt(100)])";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (short) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":contains([:only-child*=:root])");
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[*!=[^nth-last-child]]");
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
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(52, (int) (byte) 0);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(".:containsData(:gt(1))", "[#[:lt(100)*=:containsown()]*=[#nth-last-child=[^[:nth-last-of-type(97n-1)]]]]");
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
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        java.lang.String str1 = isOnlyChild0.toString();
        java.lang.String str2 = isOnlyChild0.toString();
        java.lang.String str3 = isOnlyChild0.toString();
        java.lang.String str4 = isOnlyChild0.toString();
        java.lang.String str5 = isOnlyChild0.toString();
        java.lang.String str6 = isOnlyChild0.toString();
        java.lang.String str7 = isOnlyChild0.toString();
        java.lang.String str8 = isOnlyChild0.toString();
        java.lang.String str9 = isOnlyChild0.toString();
        java.lang.String str10 = isOnlyChild0.toString();
        java.lang.String str11 = isOnlyChild0.toString();
        java.lang.String str12 = isOnlyChild0.toString();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = isOnlyChild0.matches(element13, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-child" + "'", str1, ":only-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":only-child" + "'", str2, ":only-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-child" + "'", str3, ":only-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":only-child" + "'", str4, ":only-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":only-child" + "'", str5, ":only-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":only-child" + "'", str6, ":only-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":only-child" + "'", str8, ":only-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":only-child" + "'", str9, ":only-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":only-child" + "'", str10, ":only-child");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":only-child" + "'", str11, ":only-child");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":only-child" + "'", str12, ":only-child");
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsData(:nth-of-type(0))");
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
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[^=:matches(null)]!=nth-last-child]", pattern1);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":nth-last-child(100n+100)", ":containsOwn([^=:matches(null)])");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]" + "'", str3, "[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]" + "'", str4, "[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]" + "'", str5, "[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]");
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:last-child]]", "[nth-child!=:nth-child(97)]");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.value;
        java.lang.String str5 = attributeWithValue2.toString();
        attributeWithValue2.value = ".:first-of-type";
        java.lang.String str8 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]]=[nth-child!=:nth-child(97)]]" + "'", str3, "[[[:last-child]]=[nth-child!=:nth-child(97)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str4, "[nth-child!=:nth-child(97)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[:last-child]]=[nth-child!=:nth-child(97)]]" + "'", str5, "[[[:last-child]]=[nth-child!=:nth-child(97)]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[[:last-child]]=.:first-of-type]" + "'", str8, "[[[:last-child]]=.:first-of-type]");
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsData()");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:containsdata()]" + "'", str2, "[^:containsdata()]");
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-child(32n+97)", ":containsOwn([[[:last-child]=:matches(null)]*=nth-last-child])");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[[:last-child]$=:last-of-type]]", "[[:last-of-type]$=:contains(nth-child)]");
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
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:last-child]]", "[nth-child!=:nth-child(97)]");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.value;
        java.lang.String str5 = attributeWithValue2.toString();
        attributeWithValue2.value = ".:first-of-type";
        attributeWithValue2.value = "[[:matches(null)$=[[:last-child]$=:last-of-type]]=:matches(null)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]]=[nth-child!=:nth-child(97)]]" + "'", str3, "[[[:last-child]]=[nth-child!=:nth-child(97)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str4, "[nth-child!=:nth-child(97)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[:last-child]]=[nth-child!=:nth-child(97)]]" + "'", str5, "[[[:last-child]]=[nth-child!=:nth-child(97)]]");
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        java.lang.String str4 = attributeStarting1.toString();
        java.lang.String str5 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]" + "'", str2, "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]" + "'", str3, "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]" + "'", str4, "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]" + "'", str5, "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":containsOwn(:containsdata([[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]))", "[[:matches(null)$=.nth-last-child]^=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]");
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:eq(-1)!=:matches(null)]", "[:containsData()]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:eq(-1)!=:matches(null)]*=[:containsdata()]]" + "'", str3, "[[:eq(-1)!=:matches(null)]*=[:containsdata()]]");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(52, (int) (byte) 1);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[hi!!=nth-last-child]$=:containsdata(:nth-of-type(0))]", "nth-last-of-type");
        java.lang.String str3 = attributeWithValueEnding2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) -1);
        java.lang.String str2 = indexEquals1.toString();
        indexEquals1.index = ' ';
        java.lang.String str5 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(-1)" + "'", str2, ":eq(-1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(32)" + "'", str5, ":eq(32)");
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":gt(-1)");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        java.lang.String str4 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:gt(-1)]" + "'", str2, "[^:gt(-1)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^:gt(-1)]" + "'", str3, "[^:gt(-1)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[^:gt(-1)]" + "'", str4, "[^:gt(-1)]");
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 100, (int) (short) 1);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.toString();
        int int5 = isNthLastOfType2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-of-type(100n+1)" + "'", str4, ":nth-last-of-type(100n+1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 100, 0);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(97, (int) (short) 0);
        java.lang.String str3 = isNthChild2.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(97n)" + "'", str3, ":nth-child(97n)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[hi!!=nth-last-child]$=:containsdata(:nth-of-type(0))]");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[[hi!!=nth-last-child]$=:containsdata(:nth-of-type(0))]]" + "'", str2, "[[[hi!!=nth-last-child]$=:containsdata(:nth-of-type(0))]]");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[[:last-child]=:matches(null)]*=nth-last-child]");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[[:last-of-type]$=:last-of-type]=[:lt(-1)=:nth-of-type(1n+52)]]");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        int int2 = indexGreaterThan1.index;
        int int3 = indexGreaterThan1.index;
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(97)" + "'", str5, ":gt(97)");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 10);
        int int2 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:containsdata(:containsown())$=[:last-child^=[:last-child]]]", pattern1);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(100, 35);
        int int3 = isNthChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
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
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = allElements0.matches(element13, element14);
        java.lang.String str16 = allElements0.toString();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = allElements0.matches(element17, element18);
        java.lang.String str20 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "*" + "'", str16, "*");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "*" + "'", str20, "*");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:last-child^=[:last-child]]]");
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
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[[:last-child]=:matches(null)]*=nth-last-child]");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[[[:last-child]=:matches(null)]*=nth-last-child]" + "'", str2, ".[[[:last-child]=:matches(null)]*=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".[[[:last-child]=:matches(null)]*=nth-last-child]" + "'", str3, ".[[[:last-child]=:matches(null)]*=nth-last-child]");
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-child(1)", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-of-type(100n+35)", pattern1);
        attributeWithValueMatching2.key = ":contains([:gt(-1)])";
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
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) 0);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":eq(100)", ":last-of-type");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.value = ":containsOwn([[:last-child]])";
        attributeWithValueContaining2.key = "[:nth-child(97)]";
        java.lang.String str9 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:eq(100)*=:last-of-type]" + "'", str4, "[:eq(100)*=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[:nth-child(97)]*=:containsOwn([[:last-child]])]" + "'", str9, "[[:nth-child(97)]*=:containsOwn([[:last-child]])]");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(100n+10)", pattern1);
        attributeWithValueMatching2.key = "[:nth-of-type(1n+52)$=:containsdata()]";
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":nth-child(1n+97)";
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-of-type(1n+52)$=:containsdata()]" + "'", str5, "[:nth-of-type(1n+52)$=:containsdata()]");
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:contains(:contains(:last-child))^=:gt(32)]");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[:contains(:contains(:last-child))^=:gt(32)]]" + "'", str2, "[^[:contains(:contains(:last-child))^=:gt(32)]]");
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#[:lt(100)*=:containsown()]", ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
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
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:containsown()*=:containsown()]");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:containsown()*=:containsown()]" + "'", str2, ".[:containsown()*=:containsown()]");
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-of-type!=:containsData([:empty=:matches(null)])]");
        java.lang.String str2 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([nth-of-type!=:containsdata([:empty=:matches(null)])])" + "'", str2, ":containsData([nth-of-type!=:containsdata([:empty=:matches(null)])])");
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-of-type(97n+1)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#[:eq(32)*=.:first-of-type]", pattern1);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#:contains(nth-child)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(#:contains(nth-child))" + "'", str2, ":contains(#:contains(nth-child))");
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[#nth-last-child]", "[[nth-of-type!=:eq(1)]^=:containsown([^hi!])]");
        attributeWithValueNot2.key = "[:only-child*=:containsdata(nth-last-child)]";
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
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:lt(100)*=:containsown()]$=[hi!!=nth-last-child]]");
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":last-child");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        java.lang.String str4 = containsText1.toString();
        java.lang.String str5 = containsText1.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = containsText1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:last-child)" + "'", str2, ":contains(:last-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(:last-child)" + "'", str3, ":contains(:last-child)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(:last-child)" + "'", str4, ":contains(:last-child)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":contains(:last-child)" + "'", str5, ":contains(:last-child)");
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsown([^=:matches(null)])", "[[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]!=[^=:matches(null)]]");
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 100);
        java.lang.String str2 = indexGreaterThan1.toString();
        int int3 = indexGreaterThan1.index;
        int int4 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(100)" + "'", str2, ":gt(100)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:nth-last-child(97n+97)", "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
        java.lang.String str3 = attributeWithValue2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]" + "'", str3, "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:gt(32)]");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:gt(32)]" + "'", str2, "[:gt(32)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(32)]" + "'", str3, "[:gt(32)]");
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".hi!", pattern1);
        attributeWithValueMatching2.key = "[:lt(-1)=:nth-of-type(1n+52)]";
        attributeWithValueMatching2.key = "[nth-last-of-type*=:eq(1)]";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(35, 0);
        int int3 = isNthLastOfType2.b;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[[:matches(null)!=:nth-of-type(0)]=[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]]");
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn([:only-child*=:containsdata(nth-last-child)])");
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
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":containsOwn(:containsdata([[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]))");
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("#nth-last-child");
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
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-of-type(97n+97)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:nth-of-type(97n+97)]" + "'", str2, "[:nth-of-type(97n+97)]");
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]=:nth-last-child(97n+100)]", "[[*=:last-child]]");
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:nth-child(97)]*=:containsOwn([[:last-child]])]");
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[[:last-child]$=:last-of-type]=:containsdata(:containsdata(:gt(32)))]");
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, (int) (byte) 10);
        int int3 = isNthOfType2.a;
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.toString();
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        java.lang.String str7 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-of-type(10)" + "'", str5, ":nth-of-type(10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsData(:containsdata(:gt(32)))", "[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsdata(:containsdata(:gt(32)))$=[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]]" + "'", str3, "[:containsdata(:containsdata(:gt(32)))$=[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]]");
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', (int) '4');
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:containsData()]");
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
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[^:contains(:eq(-1))]=[^:contains(:eq(-1))]]");
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":contains(:last-child)");
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":contains(nth-last-of-type)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:contains(nth-last-of-type)]" + "'", str2, "[^:contains(nth-last-of-type)]");
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^[:only-child^=:matchesown(null)]]", pattern1);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[^:nth-child(35n-1)]", ":contains([[:lt(100)^=*]=[nth-last-of-type*=:last-child]])");
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#hi!");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".#hi!" + "'", str2, ".#hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".#hi!" + "'", str3, ".#hi!");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(-1)=:nth-of-type(1n+52)]", ":only-child");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str3, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str4, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str5, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#.:containsData(:containsown())", pattern1);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
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
        java.lang.String str12 = isLastOfType0.getPseudoClass();
        java.lang.Class<?> wildcardClass13 = isLastOfType0.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nth-last-of-type" + "'", str12, "nth-last-of-type");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        attributeWithValueStarting2.key = ".[:only-child!=nth-last-child]";
        java.lang.String str9 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[.[:only-child!=nth-last-child]^=:first-child]" + "'", str9, "[.[:only-child!=nth-last-child]^=:first-child]");
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 1);
        indexLessThan1.index = (short) 100;
        java.lang.String str4 = indexLessThan1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = indexLessThan1.matches(element8, element9);
        int int11 = indexLessThan1.index;
        java.lang.String str12 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(100)" + "'", str4, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":lt(100)" + "'", str12, ":lt(100)");
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 100, (int) ' ');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(52, (int) 'a');
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) (byte) 1);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthOfType2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn(.:containsdata(nth-last-child))");
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
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn(:eq(100))", "[:containsdata(:nth-of-type(0))*=:gt(0)]");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("nth-of-type");
        java.lang.Class<?> wildcardClass2 = containsOwnText1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', (int) (byte) -1);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
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
        java.lang.String str18 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "*" + "'", str18, "*");
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        int int5 = isFirstOfType0.a;
        java.lang.String str6 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isFirstOfType0.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]");
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', (-1));
        java.lang.String str3 = isNthLastChild2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(97n-1)" + "'", str3, ":nth-last-child(97n-1)");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(".:containsData(:gt(1))", "[#[:lt(100)*=:containsown()]*=[#nth-last-child=[^[:nth-last-of-type(97n-1)]]]]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.:containsdata(:gt(1))!=[#[:lt(100)*=:containsown()]*=[#nth-last-child=[^[:nth-last-of-type(97n-1)]]]]]" + "'", str3, "[.:containsdata(:gt(1))!=[#[:lt(100)*=:containsown()]*=[#nth-last-child=[^[:nth-last-of-type(97n-1)]]]]]");
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.getPseudoClass();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        int int4 = isLastOfType0.a;
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-last-of-type" + "'", str2, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":contains()", pattern1);
        attributeWithValueMatching2.key = "[:gt(10)^=:eq(32)]";
        java.lang.String str5 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:gt(10)^=:eq(32)]" + "'", str5, "[:gt(10)^=:eq(32)]");
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:eq(-1)=[[:last-child^=[:last-child]]]]");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":nth-last-child(97n+100)");
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":gt(1)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[#$=[:nth-last-of-type(100n+35)]]";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.lang.String str9 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(1)" + "'", str3, ":gt(1)");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[#$=[:nth-last-of-type(100n+35)]]" + "'", str9, "[#$=[:nth-last-of-type(100n+35)]]");
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:root^=[^=[:last-child]]]");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:root^=[^=[:last-child]]]" + "'", str2, "#[:root^=[^=[:last-child]]]");
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":eq(100)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (int) '4');
        java.lang.String str3 = isNthOfType2.toString();
        int int4 = isNthOfType2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(1n+52)" + "'", str3, ":nth-of-type(1n+52)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(".:matchesown(null)");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(35, (int) '4');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":nth-of-type(10n+97)");
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 100);
        int int2 = indexEquals1.index;
        java.lang.String str3 = indexEquals1.toString();
        indexEquals1.index = '4';
        java.lang.String str6 = indexEquals1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(100)" + "'", str3, ":eq(100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(52)" + "'", str6, ":eq(52)");
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:lt(-1)!=:matches(null)]=#[:nth-child(97)^=.nth-last-child]]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:lt(-1)!=:matches(null)]=#[:nth-child(97)^=.nth-last-child]]" + "'", str2, "[[:lt(-1)!=:matches(null)]=#[:nth-child(97)^=.nth-last-child]]");
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":matchesOwn(null)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueMatching2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matchesown(null)" + "'", str3, ":matchesown(null)");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', (int) 'a');
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#hi!", ":eq(0)");
        java.lang.String str3 = attributeWithValueStarting2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(0)" + "'", str3, ":eq(0)");
    }
}

