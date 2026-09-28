package org.jsoup.select;

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
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = isLastChild0.matches(element12, element13);
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
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[[:last-child]=:matches(null)]*=nth-last-child]", ":nth-last-of-type(100n+1)");
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
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", "[^hi!]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.Class<?> wildcardClass5 = attributeWithValueContaining2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-of-type*=[^hi!]]" + "'", str3, "[nth-last-of-type*=[^hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-last-of-type*=[^hi!]]" + "'", str4, "[nth-last-of-type*=[^hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        attributeWithValueMatching2.key = ".nth-last-child";
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":empty";
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".nth-last-child" + "'", str5, ".nth-last-child");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "#hi!";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        attributeWithValueMatching2.key = "[*=:last-child]";
        attributeWithValueMatching2.key = ":containsOwn(:eq(97))";
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]");
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
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:last-child]$=:last-of-type]");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        java.lang.String str4 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[[:last-child]$=:last-of-type]]" + "'", str2, "[[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]$=:last-of-type]]" + "'", str3, "[[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[:last-child]$=:last-of-type]]" + "'", str4, "[[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        int int11 = indexLessThan1.index;
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = indexLessThan1.matches(element12, element13);
        java.lang.String str15 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(-1)" + "'", str8, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":lt(-1)" + "'", str10, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":lt(-1)" + "'", str15, ":lt(-1)");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[nth-of-type!=:containsData([:empty=:matches(null)])]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        int int4 = indexEquals1.index;
        indexEquals1.index = (-1);
        java.lang.String str7 = indexEquals1.toString();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(-1)" + "'", str7, ":eq(-1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(-1)" + "'", str8, ":eq(-1)");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":nth-last-child(97n+97)");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[nth-of-type!=:gt(32)]", ":containsData(:contains(:contains(:last-child)))");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[[hi!!=nth-last-child]$=:containsdata(:nth-of-type(0))]^=:lt(100)]");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.lang.String str10 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-of-type" + "'", str8, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-of-type" + "'", str9, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":first-of-type" + "'", str10, ":first-of-type");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)$=[[:last-child]$=:last-of-type]]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".[[[:last-child]=:matches(null)]*=nth-last-child]", "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".hi!", pattern1);
        attributeWithValueMatching2.key = "#:nth-child(10n-1)";
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":nth-last-child(100n+100)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, 1);
        int int3 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, 100);
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
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[^:lt(-1)]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(".[^:gt(32)]");
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
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":nth-last-child(100n+10)", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValue2.toString();
        attributeWithValue2.value = "[[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]=[^*]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-child(100n+10)=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[:nth-last-child(100n+10)=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) (short) 10);
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
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[^=:first-child]*=hi!]", "#:contains(nth-last-child)");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[^=:first-child]*=hi!]$=#:contains(nth-last-child)]" + "'", str3, "[[[^=:first-child]*=hi!]$=#:contains(nth-last-child)]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":matchesown(null)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matchesown(null)" + "'", str2, ":matchesown(null)");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 100, (int) (short) 100);
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
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.key;
        java.lang.Class<?> wildcardClass4 = attributeWithValueEnding2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) '#');
        int int3 = isNthLastOfType2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.lang.String str7 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        java.lang.String str9 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern10 = null;
        attributeWithValueMatching2.pattern = pattern10;
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        attributeWithValueMatching2.key = "#:nth-child(97)";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":only-child" + "'", str9, ":only-child");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[.nth-last-child^=hi!]");
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        java.lang.String str10 = isRoot0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = isRoot0.matches(element11, element12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":root" + "'", str10, ":root");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsData()");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:containsData()]" + "'", str2, "[:containsData()]");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":gt(97)");
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:only-child*=:root]");
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
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":nth-of-type(1n+52)", ":containsData()");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-of-type(1n+52)$=:containsdata()]" + "'", str3, "[:nth-of-type(1n+52)$=:containsdata()]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-of-type(1n+52)$=:containsdata()]" + "'", str4, "[:nth-of-type(1n+52)$=:containsdata()]");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = allElements0.matches(element16, element17);
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.nodes.Element element20 = null;
        boolean boolean21 = allElements0.matches(element19, element20);
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.nodes.Element element23 = null;
        boolean boolean24 = allElements0.matches(element22, element23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[:last-child]]", ":contains(nth-child)");
        java.lang.String str3 = attributeWithValueEnding2.key;
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]]" + "'", str3, "[[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[:last-child]]$=:contains(nth-child)]" + "'", str4, "[[[:last-child]]$=:contains(nth-child)]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("", "[^.#hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 52);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, (int) (short) 0);
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
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]", "[:gt(-1)]");
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-of-type", ":eq(1)");
        java.lang.String str3 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-child(35n+1)");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:nth-child(35n+1))" + "'", str2, ":contains(:nth-child(35n+1))");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(32, (int) '#');
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:lt(100)^=*]");
        java.lang.String str2 = class1.toString();
        java.lang.Class<?> wildcardClass3 = class1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:lt(100)^=*]" + "'", str2, ".[:lt(100)^=*]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        int int4 = indexEquals1.index;
        int int5 = indexEquals1.index;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = "[[:matches(null)=hi!]]";
        attributeWithValueStarting2.value = ":nth-of-type(35n+35)";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=:first-child]" + "'", str7, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:first-child]" + "'", str8, "[^=:first-child]");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = indexLessThan1.matches(element6, element7);
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
        indexLessThan1.index = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":lt(10)" + "'", str18, ":lt(10)");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[nth-last-of-type*=:eq(1)]$=:containsOwn(:eq(52))]");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (int) (byte) 0);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthOfType2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[[:last-child]=:matches(null)]*=nth-last-child]");
        java.lang.String str2 = class1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = class1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[[[:last-child]=:matches(null)]*=nth-last-child]" + "'", str2, ".[[[:last-child]=:matches(null)]*=nth-last-child]");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#hi!");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsData1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(#hi!)" + "'", str2, ":containsData(#hi!)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(#hi!)" + "'", str3, ":containsData(#hi!)");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[^nth-of-type]", "[^:containsdata(:nth-of-type(0))]");
        java.lang.Class<?> wildcardClass3 = attributeWithValueStarting2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) (byte) 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        indexLessThan1.index = 32;
        java.lang.String str7 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(32)" + "'", str7, ":lt(32)");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":lt(-1)", ":nth-of-type(1n+52)");
        java.lang.String str3 = attributeWithValue2.key;
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.String str6 = attributeWithValue2.toString();
        java.lang.String str7 = attributeWithValue2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str4, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str5, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str6, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(-1)" + "'", str7, ":lt(-1)");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 100;
        int int5 = indexGreaterThan1.index;
        java.lang.String str6 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = indexGreaterThan1.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(100)" + "'", str6, ":gt(100)");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jsoup.select.Evaluator.IsOnlyOfType isOnlyOfType0 = new org.jsoup.select.Evaluator.IsOnlyOfType();
        java.lang.String str1 = isOnlyOfType0.toString();
        java.lang.String str2 = isOnlyOfType0.toString();
        java.lang.String str3 = isOnlyOfType0.toString();
        java.lang.String str4 = isOnlyOfType0.toString();
        java.lang.String str5 = isOnlyOfType0.toString();
        java.lang.String str6 = isOnlyOfType0.toString();
        java.lang.String str7 = isOnlyOfType0.toString();
        java.lang.String str8 = isOnlyOfType0.toString();
        java.lang.String str9 = isOnlyOfType0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = isOnlyOfType0.matches(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-of-type" + "'", str1, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":only-of-type" + "'", str2, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-of-type" + "'", str3, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":only-of-type" + "'", str4, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":only-of-type" + "'", str5, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":only-of-type" + "'", str6, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-of-type" + "'", str7, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":only-of-type" + "'", str8, ":only-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":only-of-type" + "'", str9, ":only-of-type");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(100)*=:containsown()]", ".:containsData(nth-last-child)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueStarting2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]" + "'", str3, "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(100)*=:containsown()]" + "'", str4, "[:lt(100)*=:containsown()]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]" + "'", str5, "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) (byte) 100);
        int int3 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, (int) (byte) 10);
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
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
        java.lang.String str2 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = indexGreaterThan1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.value;
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!!=nth-last-child]" + "'", str3, "[hi!!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!!=nth-last-child]" + "'", str5, "[hi!!=nth-last-child]");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!!=nth-last-child]" + "'", str3, "[hi!!=nth-last-child]");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) (byte) 0);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsdata(#hi!)");
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, 97);
        java.lang.Class<?> wildcardClass3 = isNthOfType2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        java.lang.String str14 = allElements0.toString();
        java.lang.String str15 = allElements0.toString();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = allElements0.matches(element16, element17);
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.nodes.Element element20 = null;
        boolean boolean21 = allElements0.matches(element19, element20);
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.nodes.Element element23 = null;
        boolean boolean24 = allElements0.matches(element22, element23);
        org.jsoup.nodes.Element element25 = null;
        org.jsoup.nodes.Element element26 = null;
        boolean boolean27 = allElements0.matches(element25, element26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*" + "'", str14, "*");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "*" + "'", str15, "*");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":gt(1)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:gt(1))" + "'", str2, ":containsData(:gt(1))");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = isFirstChild0.matches(element10, element11);
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
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-of-type(97n+1)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        java.lang.String str17 = isRoot0.toString();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = isRoot0.matches(element18, element19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":root" + "'", str17, ":root");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":lt(10)", "[:lt(-1)=:gt(1)]");
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
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:first-of-type=:eq(32)]", "[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]");
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
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.lang.String str7 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":only-child";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 0);
        int int2 = indexGreaterThan1.index;
        indexGreaterThan1.index = 0;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = indexGreaterThan1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^#nth-last-child]");
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
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]", ":containsData(nth-child)");
        java.lang.String str3 = attributeWithValue2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]" + "'", str3, "[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":matches(null)";
        java.lang.String str8 = attributeWithValueStarting2.toString();
        java.lang.String str9 = attributeWithValueStarting2.key;
        attributeWithValueStarting2.key = "";
        java.lang.String str12 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^=[:last-child]]" + "'", str5, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:matches(null)]" + "'", str8, "[^=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[^=:matches(null)]" + "'", str12, "[^=:matches(null)]");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 1, (int) (short) 1);
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("", ".[:only-child!=nth-last-child]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.lang.String str7 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        java.lang.String str9 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern10 = null;
        attributeWithValueMatching2.pattern = pattern10;
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        attributeWithValueMatching2.key = ":contains(:contains(:last-child))";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertNull(pattern8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":only-child" + "'", str9, ":only-child");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[nth-child!=:nth-child(97)]";
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
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
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertNull(pattern12);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-last-of-type(97n-1)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:nth-last-of-type(97n-1))" + "'", str2, ":containsOwn(:nth-last-of-type(97n-1))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:nth-last-of-type(97n-1))" + "'", str3, ":containsOwn(:nth-last-of-type(97n-1))");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("nth-last-of-type");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-last-of-type" + "'", str2, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = isRoot0.matches(element2, element3);
        java.lang.String str5 = isRoot0.toString();
        java.lang.String str6 = isRoot0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[:lt(100)*=:containsown()]$=:containsown()]", pattern1);
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 1, (int) (byte) 1);
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
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":matchesOwn(null)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str2, ":containsOwn(:matchesown(null))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str3, ":containsOwn(:matchesown(null))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str4, ":containsOwn(:matchesown(null))");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str5, ":containsOwn(:matchesown(null))");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsData([^hi!])", "[[:matches(null)!=:nth-of-type(0)]*=:first-child]");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 100);
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":first-child");
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
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":contains(:contains(:last-child))");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-of-type(1n+52)");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        java.lang.String str4 = tagEndsWith1.toString();
        java.lang.String str5 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-of-type(1n+52)" + "'", str2, ":nth-of-type(1n+52)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(1n+52)" + "'", str3, ":nth-of-type(1n+52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-of-type(1n+52)" + "'", str4, ":nth-of-type(1n+52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-of-type(1n+52)" + "'", str5, ":nth-of-type(1n+52)");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(35, (int) '4');
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
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:lt(100)*=:containsown()]", "[^:nth-last-child(97n+97)]");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.value;
        java.lang.String str9 = attributeWithValueStarting2.key;
        java.lang.String str10 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=:first-child]" + "'", str7, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-child" + "'", str8, ":first-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[^=:first-child]" + "'", str10, "[^=:first-child]");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[:only-child*=:containsdata(nth-last-child)]*=[[:last-of-type]$=:last-of-type]]");
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:containsData(:containsown())", "#nth-last-of-type");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-last-of-type", "[:eq(100)!=[:nth-of-type(1n+52)$=:containsdata()]]");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[[:last-child]$=:last-of-type]]");
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^*]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        attributeWithValueEnding2.value = ".nth-last-child";
        java.lang.String str5 = attributeWithValueEnding2.value;
        java.lang.String str6 = attributeWithValueEnding2.toString();
        java.lang.String str7 = attributeWithValueEnding2.value;
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueEnding2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".nth-last-child" + "'", str5, ".nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:matches(null)$=.nth-last-child]" + "'", str6, "[:matches(null)$=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".nth-last-child" + "'", str7, ".nth-last-child");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".[[[:last-child]=:matches(null)]*=nth-last-child]", "[[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]=[^*]]");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.[[[:last-child]=:matches(null)]*=nth-last-child]=[[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]=[^*]]]" + "'", str3, "[.[[[:last-child]=:matches(null)]*=nth-last-child]=[[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]=[^*]]]");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 100, (int) '#');
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        java.lang.String str5 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[#:contains(nth-last-child)$=:eq(1)]", "[:lt(10)]");
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.lang.String str7 = attributeWithValueMatching2.key;
        java.lang.String str8 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":containsOwn(.:containsdata(nth-last-child))";
        java.util.regex.Pattern pattern11 = attributeWithValueMatching2.pattern;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":only-child" + "'", str8, ":only-child");
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^:lt(100)]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        java.lang.String str4 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^:lt(100)])" + "'", str2, ":containsOwn([^:lt(100)])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([^:lt(100)])" + "'", str3, ":containsOwn([^:lt(100)])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn([^:lt(100)])" + "'", str4, ":containsOwn([^:lt(100)])");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("#[:nth-child(97)^=.nth-last-child]", "#:contains(nth-child)");
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) -1);
        int int2 = indexLessThan1.index;
        java.lang.String str3 = indexLessThan1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        java.lang.String str7 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(-1)" + "'", str7, ":lt(-1)");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-last-of-type(1n+35)", ":eq(52)");
        java.lang.String str3 = attributeWithValueContaining2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueContaining2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(52)" + "'", str3, ":eq(52)");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(".:containsData(:containsdata(:gt(32)))", "[^.]");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, (int) (byte) 100);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.Matches matches1 = new org.jsoup.select.Evaluator.Matches(pattern0);
        java.lang.String str2 = matches1.toString();
        java.lang.String str3 = matches1.toString();
        java.lang.String str4 = matches1.toString();
        java.lang.String str5 = matches1.toString();
        java.lang.String str6 = matches1.toString();
        java.lang.String str7 = matches1.toString();
        java.lang.String str8 = matches1.toString();
        java.lang.String str9 = matches1.toString();
        java.lang.String str10 = matches1.toString();
        java.lang.String str11 = matches1.toString();
        java.lang.String str12 = matches1.toString();
        java.lang.String str13 = matches1.toString();
        java.lang.String str14 = matches1.toString();
        java.lang.String str15 = matches1.toString();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = matches1.matches(element16, element17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matches(null)" + "'", str2, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":matches(null)" + "'", str4, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":matches(null)" + "'", str5, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":matches(null)" + "'", str6, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":matches(null)" + "'", str7, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":matches(null)" + "'", str8, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":matches(null)" + "'", str9, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":matches(null)" + "'", str10, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":matches(null)" + "'", str11, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":matches(null)" + "'", str12, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":matches(null)" + "'", str13, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":matches(null)" + "'", str14, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":matches(null)" + "'", str15, ":matches(null)");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":gt(1)", "[:lt(-1)=:nth-of-type(1n+52)]");
        attributeWithValueNot2.value = ":containsOwn(hi!)";
        java.lang.String str5 = attributeWithValueNot2.toString();
        java.lang.String str6 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:gt(1)!=:containsOwn(hi!)]" + "'", str5, "[:gt(1)!=:containsOwn(hi!)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:gt(1)!=:containsOwn(hi!)]" + "'", str6, "[:gt(1)!=:containsOwn(hi!)]");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.b;
        java.lang.String str3 = isLastOfType0.toString();
        int int4 = isLastOfType0.a;
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-last-of-type" + "'", str2, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".:containsData(nth-last-child)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern7);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsData([^nth-last-of-type])", "[[^nth-last-of-type]=:contains(:contains(:last-child))]");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":matchesOwn(null)");
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
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(97, (int) (short) 1);
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:containsOwn(:eq(52))]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:containsOwn(:eq(52))]" + "'", str2, "#[:containsOwn(:eq(52))]");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:only-child^=:matchesown(null)]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:last-child]", ":last-of-type");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        java.lang.String str5 = attributeWithValueEnding2.toString();
        java.lang.String str6 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str3, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str4, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str5, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str6, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("nth-last-child");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[nth-last-child]" + "'", str2, "[nth-last-child]");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":eq(-1)", "[[:last-child^=[:last-child]]]");
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
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(1);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        int int4 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(1)" + "'", str2, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(1)" + "'", str3, ":gt(1)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[^:contains(:eq(-1))]");
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
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:last-child^=[:last-child]]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([[:last-child^=[:last-child]]])" + "'", str2, ":containsOwn([[:last-child^=[:last-child]]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([[:last-child^=[:last-child]]])" + "'", str3, ":containsOwn([[:last-child^=[:last-child]]])");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(1, (int) (short) 100);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-of-type(0)");
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]", "#[:last-child]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]*=#[:last-child]]" + "'", str3, "[[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]*=#[:last-child]]");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        java.lang.String str6 = isNthOfType2.toString();
        java.lang.String str7 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = isNthOfType2.calculatePosition(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(0)" + "'", str3, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-of-type(0)" + "'", str6, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        attributeWithValueNot2.value = "hi!";
        java.lang.String str5 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!!=hi!]" + "'", str5, "[hi!!=hi!]");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(".[:only-child!=nth-last-child]", ":matchesOwn(null)");
        java.lang.String str3 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matchesown(null)" + "'", str3, ":matchesown(null)");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(".[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) 'a', 0);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("#[:last-child]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^#[:last-child]]" + "'", str2, "[^#[:last-child]]");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:gt(-1)*=:first-of-type]", "[^#[:last-child]]");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-last-of-type(1n+35)");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[nth-last-child^=:matchesown(null)]");
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
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":matches(null)", ":containsData(:gt(32))");
        attributeWithValueStarting2.value = ":eq(0)";
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(0)" + "'", str5, ":eq(0)");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-child(97)", ".nth-last-child");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.key = ":empty";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97)^=.nth-last-child]" + "'", str3, "[:nth-child(97)^=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-child(97)^=.nth-last-child]" + "'", str4, "[:nth-child(97)^=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:empty^=.nth-last-child]" + "'", str7, "[:empty^=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:empty^=.nth-last-child]" + "'", str8, "[:empty^=.nth-last-child]");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:only-child*=:containsdata(nth-last-child)]*=[[:last-of-type]$=:last-of-type]]");
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, 35);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 100, (int) '#');
        java.lang.String str3 = isNthLastOfType2.toString();
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        java.lang.String str5 = isNthLastOfType2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isNthLastOfType2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(100n+35)" + "'", str3, ":nth-last-of-type(100n+35)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-of-type(100n+35)" + "'", str5, ":nth-last-of-type(100n+35)");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        attributeWithValueEnding2.value = ".nth-last-child";
        java.lang.String str5 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = ":nth-child(97)";
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueEnding2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:matches(null)$=.nth-last-child]" + "'", str5, "[:matches(null)$=.nth-last-child]");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":nth-of-type(97n+97)");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:nth-of-type(97n+97)" + "'", str2, ".:nth-of-type(97n+97)");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsData()");
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
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-last-child(97n+100)", "[nth-child!=:nth-child(97)]");
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("#");
        java.lang.String str2 = id1.toString();
        java.lang.Class<?> wildcardClass3 = id1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.lang.String str8 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueMatching2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) -1, 32);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#:contains(nth-child)");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsText1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(#:contains(nth-child))" + "'", str2, ":contains(#:contains(nth-child))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(#:contains(nth-child))" + "'", str3, ":contains(#:contains(nth-child))");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(97);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        indexLessThan1.index = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#:last-child", "[^:eq(32)]");
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#[:last-child^=[:last-child]]");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        java.lang.String str4 = containsText1.toString();
        java.lang.String str5 = containsText1.toString();
        java.lang.String str6 = containsText1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = containsText1.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str2, ":contains(#[:last-child^=[:last-child]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str3, ":contains(#[:last-child^=[:last-child]])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str4, ":contains(#[:last-child^=[:last-child]])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str5, ":contains(#[:last-child^=[:last-child]])");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str6, ":contains(#[:last-child^=[:last-child]])");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '#');
        int int2 = indexEquals1.index;
        java.lang.String str3 = indexEquals1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(35)" + "'", str3, ":eq(35)");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(1);
        java.lang.String str2 = indexLessThan1.toString();
        int int3 = indexLessThan1.index;
        indexLessThan1.index = (short) 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(1)" + "'", str2, ":lt(1)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = isOnlyChild0.matches(element10, element11);
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
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn()", ":containsData([:empty=:matches(null)])");
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
        java.lang.String str8 = isFirstOfType0.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-of-type" + "'", str8, ":first-of-type");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) '#', (-1));
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = isRoot0.matches(element3, element4);
        java.lang.String str6 = isRoot0.toString();
        java.lang.String str7 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":matchesOwn(null)", ".[^:gt(32)]");
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":nth-child(35n+1)", ":nth-last-of-type(100n+1)");
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
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^:lt(100)]", "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
        attributeWithValueNot2.value = "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]";
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(52, 35);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(1);
        indexGreaterThan1.index = 0;
        java.lang.String str4 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = indexGreaterThan1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(0)" + "'", str4, ":gt(0)");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[nth-of-type!=:eq(1)]", ":containsOwn([^hi!])");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[nth-of-type!=:eq(1)]^=:containsown([^hi!])]" + "'", str3, "[[nth-of-type!=:eq(1)]^=:containsown([^hi!])]");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 100, (int) (byte) 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.lang.String str9 = attributeWithValueMatching2.key;
        java.lang.String str10 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":only-child" + "'", str9, ":only-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":only-child" + "'", str10, ":only-child");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:lt(100)*=:containsown()]$=:containsown()]", ":containsdata(nth-last-child)");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(97)" + "'", str5, ":gt(97)");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":eq(1)", "nth-last-child");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(1)=nth-last-child]" + "'", str3, "[:eq(1)=nth-last-child]");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = allElements0.matches(element2, element3);
        java.lang.String str5 = allElements0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = allElements0.matches(element6, element7);
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = allElements0.matches(element9, element10);
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = allElements0.matches(element12, element13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "*" + "'", str5, "*");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsdata(#hi!)");
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
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#[.nth-last-child$=[:last-child^=[:last-child]]]", "[hi!!=hi!]");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        int int3 = isNthLastChild2.b;
        int int4 = isNthLastChild2.b;
        int int5 = isNthLastChild2.b;
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]", "[^=:matches(null)]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]!=[^=:matches(null)]]" + "'", str3, "[[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]!=[^=:matches(null)]]");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":contains()", "[:eq(1)=nth-last-child]");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) (byte) 0);
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":nth-last-child(97n-1)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-last-child(97n-1)" + "'", str2, ":nth-last-child(97n-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(97n-1)" + "'", str3, ":nth-last-child(97n-1)");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 1);
        indexLessThan1.index = '4';
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 10, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":root", "[^=[:last-child]]");
        java.lang.String str3 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueStarting2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^=[:last-child]]" + "'", str3, "[^=[:last-child]]");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        java.lang.String str17 = allElements0.toString();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = allElements0.matches(element18, element19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "*" + "'", str15, "*");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "*" + "'", str16, "*");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "*" + "'", str17, "*");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(".:containsData(:containsown())");
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
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        java.lang.String str8 = indexLessThan1.toString();
        int int9 = indexLessThan1.index;
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(-1)" + "'", str8, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".:eq(32)", "[^hi!]");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.key;
        java.lang.String str6 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:last-child^=[:last-child]]" + "'", str4, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-child" + "'", str5, ":last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:last-child^=[:last-child]]" + "'", str6, "[:last-child^=[:last-child]]");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(1);
        indexLessThan1.index = '4';
        int int4 = indexLessThan1.index;
        java.lang.String str5 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(52)" + "'", str5, ":lt(52)");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        int int4 = isNthOfType2.a;
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthOfType2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(0)" + "'", str3, ":nth-of-type(0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        java.lang.String str3 = isRoot0.toString();
        java.lang.String str4 = isRoot0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = isRoot0.matches(element5, element6);
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = isRoot0.matches(element8, element9);
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = isRoot0.matches(element11, element12);
        java.lang.String str14 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":root" + "'", str3, ":root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":root" + "'", str14, ":root");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueMatching2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[^.#hi!]");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[^.#hi!]" + "'", str2, ".[^.#hi!]");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#*");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#*" + "'", str2, "#*");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(10);
        indexEquals1.index = 0;
        indexEquals1.index = 1;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = indexEquals1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = isRoot0.matches(element3, element4);
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = isRoot0.matches(element6, element7);
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = isRoot0.matches(element9, element10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(100);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^[:nth-last-of-type(97n-1)]]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^[:nth-last-of-type(97n-1)]])" + "'", str2, ":containsOwn([^[:nth-last-of-type(97n-1)]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([^[:nth-last-of-type(97n-1)]])" + "'", str3, ":containsOwn([^[:nth-last-of-type(97n-1)]])");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[:only-child!=nth-last-child]]");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:contains(:contains(:last-child))^=:gt(32)]", "[:eq(1)$=[^[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]]]");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
        java.lang.String str5 = isNthLastChild2.toString();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        java.lang.String str8 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(100n+10)" + "'", str5, ":nth-last-child(100n+10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-child" + "'", str8, "nth-last-child");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[[:last-child]]$=:contains(nth-child)]", ":nth-last-of-type(100n+1)");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":contains(:contains(:last-child))");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        java.lang.String str4 = containsData1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = containsData1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:contains(:contains(:last-child)))" + "'", str2, ":containsData(:contains(:contains(:last-child)))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(:contains(:contains(:last-child)))" + "'", str3, ":containsData(:contains(:contains(:last-child)))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsData(:contains(:contains(:last-child)))" + "'", str4, ":containsData(:contains(:contains(:last-child)))");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[^nth-last-of-type]=:contains(:contains(:last-child))]");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[[^nth-last-of-type]=:contains(:contains(:last-child))]]" + "'", str2, "[[[^nth-last-of-type]=:contains(:contains(:last-child))]]");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]", "#[:eq(100)!=[:nth-of-type(1n+52)$=:containsdata()]]");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^hi!]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        java.lang.String str5 = attributeWithValueStarting2.key;
        java.lang.String str6 = attributeWithValueStarting2.toString();
        java.lang.String str7 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueStarting2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[^=[:last-child]]" + "'", str6, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:last-child]" + "'", str7, "[:last-child]");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) 100);
        java.lang.String str2 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(100)" + "'", str2, ":gt(100)");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("#:gt(32)", "#hi!");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":contains(:eq(-1))");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:eq(-1))" + "'", str2, ":contains(:eq(-1))");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsOwn(hi!)", "#.:first-of-type");
        java.lang.String str3 = attributeWithValueStarting2.key;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueStarting2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsown(hi!)" + "'", str3, ":containsown(hi!)");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[^*]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^*]" + "'", str2, "[^*]");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-last-of-type(100n+52)", "[*=[nth-last-of-type*=:last-child]]");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        int int2 = indexGreaterThan1.index;
        int int3 = indexGreaterThan1.index;
        java.lang.String str4 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = indexGreaterThan1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(0)" + "'", str4, ":gt(0)");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:only-child^=:matchesown(null)]");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[:only-child^=:matchesown(null)]]" + "'", str2, "[^[:only-child^=:matchesown(null)]]");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:nth-child(97)!=[nth-of-type]]");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]");
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
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.lang.String str7 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str7, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":nth-last-of-type(97n-1)");
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
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(".[^=:matches(null)]", ".:containsData(:gt(1))");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(".:containsData(:containsown())");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#.:containsData(:containsown())" + "'", str2, "#.:containsData(:containsown())");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":contains(:nth-of-type(35n+35))", ":nth-of-type(0)");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:only-child*=:root]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:only-child*=:root]" + "'", str3, "[:only-child*=:root]");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":matches(null)", ":nth-of-type(0)");
        attributeWithValueNot2.value = "[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]";
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":gt(1)", "[:lt(-1)=:nth-of-type(1n+52)]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(1)!=[:lt(-1)=:nth-of-type(1n+52)]]" + "'", str3, "[:gt(1)!=[:lt(-1)=:nth-of-type(1n+52)]]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]", ":containsData(.nth-last-child)");
        attributeWithValueStarting2.key = "[:first-child=[nth-last-of-type*=:last-child]]";
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
            int int8 = isFirstOfType0.calculatePosition(element6, element7);
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
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 0, (int) (short) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) -1);
        indexLessThan1.index = 52;
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":contains(nth-of-type)", pattern1);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[^:nth-child(35n+1)]]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(1, 0);
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(1n)" + "'", str4, ":nth-last-child(1n)");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[^:contains(:eq(-1))]");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[^:contains(:eq(-1))]" + "'", str2, "#[^:contains(:eq(-1))]");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[[:last-child]]*=:containsData(:containsown())]");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        java.lang.String str4 = isRoot0.toString();
        java.lang.String str5 = isRoot0.toString();
        java.lang.String str6 = isRoot0.toString();
        java.lang.String str7 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".:containsData(nth-last-child)", pattern1);
        attributeWithValueMatching2.key = "[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]";
        java.lang.String str5 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]" + "'", str5, "[.:containsdata(:containsown())*=[.nth-last-child^=hi!]]");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(".nth-last-child", "[:last-child^=[:last-child]]");
        java.lang.String str3 = attributeWithValueEnding2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueEnding2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.toString();
        java.lang.String str5 = isNthChild2.toString();
        java.lang.String str6 = isNthChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97)" + "'", str4, ":nth-child(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-child(97)" + "'", str5, ":nth-child(97)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":eq(32)");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:eq(32)" + "'", str2, ".:eq(32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".:eq(32)" + "'", str3, ".:eq(32)");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-of-type(10)", "[[:matches(null)^=:containsdata(:gt(32))]]");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 0, (int) (byte) 1);
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        java.lang.String str6 = indexGreaterThan1.toString();
        java.lang.String str7 = indexGreaterThan1.toString();
        int int8 = indexGreaterThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(0)" + "'", str2, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(0)" + "'", str4, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(0)" + "'", str5, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(0)" + "'", str6, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":gt(0)" + "'", str7, ":gt(0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]", "[[:last-child]=:matches(null)]");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        indexEquals1.index = 35;
        indexEquals1.index = (byte) 0;
        java.lang.String str6 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(0)" + "'", str6, ":eq(0)");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]", "[:only-child!=nth-last-child]");
        java.lang.String str3 = attributeWithValueEnding2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]" + "'", str3, "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(nth-child)", ":eq(0)");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(nth-child)$=:eq(0)]" + "'", str3, "[:contains(nth-child)$=:eq(0)]");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(1, (-1));
        int int3 = isNthChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[^=:first-child]*=hi!]", "#:contains(nth-last-child)");
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
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:eq(100)*=:last-of-type]");
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) 0);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) 0);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":lt(97)", ":nth-child(97)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:lt(97)*=:nth-child(97)]" + "'", str3, "[:lt(97)*=:nth-child(97)]");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(:contains(:last-child))", "[:last-child^=[:last-child]]");
        attributeWithValue2.key = ":containsData(:containsown())";
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.Class<?> wildcardClass6 = attributeWithValue2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:containsData(:containsown())=[:last-child^=[:last-child]]]" + "'", str5, "[:containsData(:containsown())=[:last-child^=[:last-child]]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:containsown(:nth-last-of-type(97n-1))=[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]]");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 10, 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":gt(-1)", ":matchesOwn(null)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueStarting2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)^=:matchesown(null)]" + "'", str3, "[:gt(-1)^=:matchesown(null)]");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', (int) (short) 1);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        java.lang.String str6 = attributeWithValueStarting2.toString();
        java.lang.String str7 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueStarting2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^=[:last-child]]" + "'", str5, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[^=[:last-child]]" + "'", str6, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=[:last-child]]" + "'", str7, "[^=[:last-child]]");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(100);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(100)" + "'", str2, ":eq(100)");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":last-child", ":matches(null)");
        java.lang.String str3 = attributeWithValueEnding2.key;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueEnding2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-child" + "'", str3, ":last-child");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(97, (int) (short) 0);
        java.lang.String str3 = isNthChild2.toString();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.a;
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        java.lang.String str7 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:last-child$=[:last-child^=[:last-child]]]", ":eq(10)");
        attributeWithValueNot2.key = "[^:contains(:nth-last-of-type(100n+35))]";
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:lt(100)*=:containsown()]");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:lt(100)*=:containsown()]" + "'", str2, "#[:lt(100)*=:containsown()]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[:lt(100)*=:containsown()]" + "'", str3, "#[:lt(100)*=:containsown()]");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(10);
        java.lang.String str2 = indexLessThan1.toString();
        int int3 = indexLessThan1.index;
        java.lang.String str4 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(10)" + "'", str2, ":lt(10)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(10)" + "'", str4, ":lt(10)");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:last-child^=[:last-child]]");
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
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":eq(52)", pattern1);
        attributeWithValueMatching2.key = "[[:lt(-1)!=:matches(null)]=#[:nth-child(97)^=.nth-last-child]]";
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        indexEquals1.index = (byte) -1;
        java.lang.String str6 = indexEquals1.toString();
        java.lang.String str7 = indexEquals1.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = indexEquals1.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(-1)" + "'", str6, ":eq(-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(-1)" + "'", str7, ":eq(-1)");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (short) 100);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        int int4 = isNthLastOfType2.b;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = isNthLastOfType2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-child" + "'", str3, ":only-child");
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:last-child^=[:last-child]]", "[:only-child!=nth-last-child]");
        java.lang.String str3 = attributeWithValueStarting2.key;
        java.lang.String str4 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]" + "'", str4, "[[:last-child^=[:last-child]]^=[:only-child!=nth-last-child]]");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[:last-child]=:matches(null)]");
        java.lang.Class<?> wildcardClass2 = class1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":matches(null)", "hi!");
        java.lang.String str3 = attributeWithValue2.key;
        attributeWithValue2.value = "[:last-child]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        int int2 = indexLessThan1.index;
        indexLessThan1.index = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', (int) (byte) -1);
        java.lang.String str3 = isNthLastChild2.toString();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(97n-1)" + "'", str3, ":nth-last-child(97n-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":nth-last-child(100n+100)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-last-child(100n+100)" + "'", str2, ":nth-last-child(100n+100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(100n+100)" + "'", str3, ":nth-last-child(100n+100)");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:lt(1)=[^[:nth-last-of-type(97n-1)]]]");
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
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (int) '4');
        int int3 = isNthOfType2.a;
        int int4 = isNthOfType2.a;
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-of-type(1n+52)", "[nth-of-type!=:containsdata([:empty=:matches(null)])]");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(100n+10)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.lang.String str6 = attributeWithValueMatching2.key;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(100n+10)" + "'", str5, ":nth-last-child(100n+10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-last-child(100n+10)" + "'", str6, ":nth-last-child(100n+10)");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(10, (int) (byte) 1);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 0, (int) (short) 1);
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
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) -1);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(-1)" + "'", str2, ":gt(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(-1)" + "'", str3, ":gt(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(-1)" + "'", str4, ":gt(-1)");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:last-child]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        java.lang.String str4 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([:last-child])" + "'", str2, ":containsOwn([:last-child])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([:last-child])" + "'", str3, ":containsOwn([:last-child])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn([:last-child])" + "'", str4, ":containsOwn([:last-child])");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":contains(:last-child)");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        java.lang.String str4 = containsText1.toString();
        java.lang.String str5 = containsText1.toString();
        java.lang.String str6 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:contains(:last-child))" + "'", str2, ":contains(:contains(:last-child))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(:contains(:last-child))" + "'", str3, ":contains(:contains(:last-child))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(:contains(:last-child))" + "'", str4, ":contains(:contains(:last-child))");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":contains(:contains(:last-child))" + "'", str5, ":contains(:contains(:last-child))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":contains(:contains(:last-child))" + "'", str6, ":contains(:contains(:last-child))");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:last-of-type]");
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:root^=[^=[:last-child]]]");
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
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", ":first-of-type");
        attributeWithValueNot2.key = ".#hi!";
        java.lang.String str5 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[.#hi!!=:first-of-type]" + "'", str5, "[.#hi!!=:first-of-type]");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:nth-last-of-type(97n-1)]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValue2.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-last-of-type(97n-1)]" + "'", str4, "[:nth-last-of-type(97n-1)]");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        indexGreaterThan1.index = (short) 100;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = indexGreaterThan1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(-1)=:nth-of-type(1n+52)]", ":only-child");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.value;
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str3, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":only-child" + "'", str4, ":only-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]" + "'", str5, "[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsOwn(:first-child)", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:matches(null)!=:nth-of-type(0)]", ":first-child");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-child" + "'", str3, ":first-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-child" + "'", str4, ":first-child");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[nth-last-of-type*=:eq(1)]", "[^:gt(-1)]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[:root^=[^=[:last-child]]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]" + "'", str3, "[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        java.lang.String str6 = isNthOfType2.toString();
        int int7 = isNthOfType2.a;
        int int8 = isNthOfType2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(0)" + "'", str3, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-of-type(0)" + "'", str6, ":nth-of-type(0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = isRoot0.matches(element16, element17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":root" + "'", str15, ":root");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-last-child(100n+100)");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:nth-last-child(100n+100)]" + "'", str2, "[:nth-last-child(100n+100)]");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[^[:only-child*=:containsdata(nth-last-child)]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[:only-child*=:containsdata(nth-last-child)]]" + "'", str2, "[^[:only-child*=:containsdata(nth-last-child)]]");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.toString();
        int int5 = isNthChild2.a;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        java.lang.String str7 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = isNthChild2.calculatePosition(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97)" + "'", str4, ":nth-child(97)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[[:last-child]=:matches(null)]*=nth-last-child]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([[[:last-child]=:matches(null)]*=nth-last-child])" + "'", str2, ":containsOwn([[[:last-child]=:matches(null)]*=nth-last-child])");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":nth-last-of-type(100n+1)";
        java.lang.String str8 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":nth-last-of-type(100n+1)" + "'", str8, ":nth-last-of-type(100n+1)");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)!=:nth-of-type(0)]", ":matches(null)");
        java.lang.String str3 = attributeWithValueStarting2.key;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueStarting2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str3, "[:matches(null)!=:nth-of-type(0)]");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:contains(nth-last-child)=:containsown([nth-last-of-type*=:last-child])]");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-last-child(97n+100)", "[*!=[^nth-last-child]]");
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
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-of-type" + "'", str9, ":first-of-type");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":matchesown(null)", pattern1);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 1);
        int int2 = indexLessThan1.index;
        java.lang.String str3 = indexLessThan1.toString();
        java.lang.String str4 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(1)" + "'", str3, ":lt(1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(1)" + "'", str4, ":lt(1)");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 0);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(0)" + "'", str2, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 10, 97);
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
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":contains(nth-of-type)", ":containsOwn(:contains(.nth-last-child))");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(".", "[.nth-last-child!=[:lt(100)^=*]]");
        java.lang.String str3 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.nth-last-child!=[:lt(100)^=*]]" + "'", str3, "[.nth-last-child!=[:lt(100)^=*]]");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = isRoot0.matches(element15, element16);
        java.lang.String str18 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":root" + "'", str10, ":root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":root" + "'", str11, ":root");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":root" + "'", str18, ":root");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        attributeWithValueNot2.key = ":only-child";
        java.lang.String str5 = attributeWithValueNot2.toString();
        java.lang.String str6 = attributeWithValueNot2.toString();
        java.lang.String str7 = attributeWithValueNot2.key;
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueNot2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:only-child!=nth-last-child]" + "'", str5, "[:only-child!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:only-child!=nth-last-child]" + "'", str6, "[:only-child!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[nth-last-of-type*=[[:containsOwn(:eq(52))]]]", "[.nth-last-child^=hi!]");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) ' ');
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
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) -1, (int) (short) -1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        java.lang.String str6 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = indexGreaterThan1.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(97)" + "'", str5, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(97)" + "'", str6, ":gt(97)");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-last-child(-1n)", "[:containsown()=:containsdata([:empty=:matches(null)])]");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":eq(1)");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:eq(1))" + "'", str2, ":containsData(:eq(1))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(:eq(1))" + "'", str3, ":containsData(:eq(1))");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) -1, (int) (short) 10);
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
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(100, (int) 'a');
        int int3 = isNthLastChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]=[:last-child]]");
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
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-last-of-type(52n+10)", ":contains(:gt(97))");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str3, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str4, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str5, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str6, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("nth-last-of-type");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^nth-last-of-type]" + "'", str2, "[^nth-last-of-type]");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[^nth-last-of-type]", ":contains(:contains(:last-child))");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^nth-last-of-type]=:contains(:contains(:last-child))]" + "'", str3, "[[^nth-last-of-type]=:contains(:contains(:last-child))]");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:nth-child(97)!=[nth-of-type]]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]" + "'", str4, "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[.nth-last-child^=hi!]^=.:containsdata(:containsown())]");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[.nth-last-child^=hi!]^=.:containsdata(:containsown())]" + "'", str2, "[[.nth-last-child^=hi!]^=.:containsdata(:containsown())]");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) '4');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(52)" + "'", str2, ":gt(52)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(52)" + "'", str3, ":gt(52)");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        attributeWithValueMatching2.key = ":nth-last-child(1)";
        org.junit.Assert.assertNull(pattern9);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, (int) (byte) 10);
        int int3 = isNthLastOfType2.a;
        int int4 = isNthLastOfType2.b;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthLastOfType2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        java.lang.String str7 = isNthOfType2.getPseudoClass();
        int int8 = isNthOfType2.a;
        int int9 = isNthOfType2.a;
        java.lang.String str10 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = isNthOfType2.matches(element11, element12);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nth-of-type" + "'", str10, "nth-of-type");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        attributeWithValueMatching2.key = "";
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        java.lang.String str17 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "*" + "'", str17, "*");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:contains(:contains(:last-child))^=:gt(32)]");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        indexGreaterThan1.index = (byte) 10;
        int int6 = indexGreaterThan1.index;
        java.lang.String str7 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = indexGreaterThan1.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":gt(10)" + "'", str7, ":gt(10)");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.toString();
        int int5 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(97n+97)" + "'", str4, ":nth-last-child(97n+97)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(97)" + "'", str5, ":gt(97)");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        java.lang.String str2 = indexEquals1.toString();
        indexEquals1.index = 1;
        java.lang.String str5 = indexEquals1.toString();
        java.lang.String str6 = indexEquals1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = indexEquals1.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(52)" + "'", str2, ":eq(52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(1)" + "'", str5, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(1)" + "'", str6, ":eq(1)");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 10, (int) 'a');
        int int3 = isNthLastChild2.a;
        int int4 = isNthLastChild2.b;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthLastChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^=:first-child]", pattern1);
        attributeWithValueMatching2.key = ":containsOwn([:gt(-1)*=:first-of-type])";
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(10, 97);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:nth-child(97)!=[nth-of-type]]!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", "[^:matches(null)]");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn()", ":containsOwn()");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsown()*=:containsown()]" + "'", str3, "[:containsown()*=:containsown()]");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn(hi!)");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:containsOwn(hi!)]" + "'", str2, "[:containsOwn(hi!)]");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.a;
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isLastOfType0.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 100);
        java.lang.String str2 = indexEquals1.toString();
        indexEquals1.index = (byte) 0;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = indexEquals1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(100)" + "'", str2, ":eq(100)");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:lt(-1)=:nth-of-type(1n+52)]");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str2, "[:lt(-1)=:nth-of-type(1n+52)]");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:matches(null)!=:nth-of-type(0)]", "[:last-child^=[:last-child]]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[:contains(nth-last-child)=:containsown([nth-last-of-type*=:last-child])]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:matches(null)!=:nth-of-type(0)]$=[:last-child^=[:last-child]]]" + "'", str3, "[[:matches(null)!=:nth-of-type(0)]$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(97n+97)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(".[:only-child!=nth-last-child]");
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
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[^:lt(100)]");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsData1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([^:lt(100)])" + "'", str2, ":containsData([^:lt(100)])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData([^:lt(100)])" + "'", str3, ":containsData([^:lt(100)])");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.Class<?> wildcardClass4 = attributeWithValueMatching2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("", "[:lt(100)*=:contains(#[:last-child^=[:last-child]])]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, (int) (byte) 10);
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
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:matches(null)$=.nth-last-child]");
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
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":contains(nth-last-child)", "[^:gt(32)]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(nth-last-child)!=[^:gt(32)]]" + "'", str3, "[:contains(nth-last-child)!=[^:gt(32)]]");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (int) (short) 1);
        int int3 = isNthOfType2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:lt(-1)=:nth-of-type(1n+52)]", ":containsOwn()");
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
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[.^=[:last-child]]");
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
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#[:nth-child(97)^=.nth-last-child]");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsData(:nth-of-type(0))");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeStarting1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:containsdata(:nth-of-type(0))]" + "'", str2, "[^:containsdata(:nth-of-type(0))]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^:containsdata(:nth-of-type(0))]" + "'", str3, "[^:containsdata(:nth-of-type(0))]");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ".:gt(32)";
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueMatching2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-child" + "'", str5, ":last-child");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":gt(0)");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(0)" + "'", str2, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = isLastOfType0.matches(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.toString();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        java.lang.String str8 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-last-child(100n+10)" + "'", str6, ":nth-last-child(100n+10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-child" + "'", str8, "nth-last-child");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(".:gt(-1)");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsData1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(.:gt(-1))" + "'", str2, ":containsData(.:gt(-1))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(.:gt(-1))" + "'", str3, ":containsData(.:gt(-1))");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":containsOwn([nth-last-of-type*=:last-child])", ":contains(:gt(97))");
        java.lang.String str3 = attributeWithValueNot2.toString();
        attributeWithValueNot2.key = "[:gt(32)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsown([nth-last-of-type*=:last-child])!=:contains(:gt(97))]" + "'", str3, "[:containsown([nth-last-of-type*=:last-child])!=:contains(:gt(97))]");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("#[.[^:gt(32)]!=hi!]");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-child", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueMatching2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("#[:last-child^=[:last-child]]");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]=[^*]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', 100);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(100, (int) (short) 1);
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
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-child(97)", "[nth-of-type]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        attributeWithValueNot2.key = "[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]";
        java.lang.String str6 = attributeWithValueNot2.value;
        java.lang.String str7 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueNot2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97)!=[nth-of-type]]" + "'", str3, "[:nth-child(97)!=[nth-of-type]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-of-type]" + "'", str6, "[nth-of-type]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]" + "'", str7, "[[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]!=[nth-of-type]]");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.getPseudoClass();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-of-type" + "'", str2, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = (short) -1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(0)" + "'", str2, ":gt(0)");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:lt(10)]");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#:containsData(:gt(32))", ":containsOwn([^[nth-last-child^=:matchesown(null)]])");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[[:last-child]]$=:contains(nth-child)]", ":first-child");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#hi!", ".:first-child");
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
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":first-of-type", ".[:only-child!=nth-last-child]");
        attributeWithValueContaining2.value = ":contains(:nth-last-of-type(100n+35))";
        java.lang.String str5 = attributeWithValueContaining2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueContaining2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:first-of-type*=:contains(:nth-last-of-type(100n+35))]" + "'", str5, "[:first-of-type*=:contains(:nth-last-of-type(100n+35))]");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[^[:only-child*=:containsdata(nth-last-child)]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[^[:only-child*=:containsdata(nth-last-child)]]]" + "'", str2, "[[^[:only-child*=:containsdata(nth-last-child)]]]");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":root");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:nth-child(97)!=[nth-of-type]]", "[:lt(1)=[^[:nth-last-of-type(97n-1)]]]");
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
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("nth-last-child", ".:first-of-type");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-child$=.:first-of-type]" + "'", str3, "[nth-last-child$=.:first-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-last-child$=.:first-of-type]" + "'", str4, "[nth-last-child$=.:first-of-type]");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#[:last-child]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:last-child]" + "'", str2, "#[:last-child]");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(:last-child)", "[:eq(-1)!=:matches(null)]");
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
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, 35);
        int int3 = isNthChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":lt(1)", "[^[:nth-last-of-type(97n-1)]]");
        java.lang.String str3 = attributeWithValue2.value;
        java.lang.Class<?> wildcardClass4 = attributeWithValue2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^[:nth-last-of-type(97n-1)]]" + "'", str3, "[^[:nth-last-of-type(97n-1)]]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        int int5 = isLastOfType0.a;
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.getPseudoClass();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = isLastOfType0.calculatePosition(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-of-type", ":gt(32)");
        attributeWithValueNot2.value = "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]";
        java.lang.String str5 = attributeWithValueNot2.toString();
        java.lang.String str6 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-of-type!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str5, "[nth-of-type!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-of-type!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str6, "[nth-of-type!=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:matches(null)$=:last-child]");
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
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[^[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        java.lang.String str3 = isRoot0.toString();
        java.lang.String str4 = isRoot0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = isRoot0.matches(element5, element6);
        java.lang.String str8 = isRoot0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = isRoot0.matches(element9, element10);
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = isRoot0.matches(element12, element13);
        java.lang.String str15 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":root" + "'", str3, ":root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":root" + "'", str15, ":root");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[[:last-child]]=[nth-child!=:nth-child(97)]]");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
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
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(1);
        java.lang.String str2 = indexLessThan1.toString();
        int int3 = indexLessThan1.index;
        indexLessThan1.index = 1;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = indexLessThan1.matches(element6, element7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(1)" + "'", str2, ":lt(1)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn(:nth-last-of-type(97n-1))", "[[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]]");
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
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        int int7 = isNthLastChild2.a;
        int int8 = isNthLastChild2.a;
        java.lang.String str9 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-child" + "'", str9, "nth-last-child");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 52;
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(-1)" + "'", str2, ":gt(-1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(52)" + "'", str5, ":gt(52)");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]", "[^*]");
        attributeWithValue2.value = "";
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        int int5 = isNthLastChild2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 10, (int) ' ');
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
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-of-type(35n+35)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:nth-of-type(35n+35))" + "'", str2, ":contains(:nth-of-type(35n+35))");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[nth-last-of-type*=[^hi!]]", ":eq(52)");
        attributeWithValueContaining2.key = ":contains(#:contains(nth-child))";
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":contains([:gt(-1)])");
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
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, 32);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-last-of-type(100n+35)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:nth-last-of-type(100n+35)]" + "'", str2, "[:nth-last-of-type(100n+35)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-of-type(100n+35)]" + "'", str3, "[:nth-last-of-type(100n+35)]");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-of-type(1n+97)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:nth-of-type(1n+97)]" + "'", str2, "[:nth-of-type(1n+97)]");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":gt(-1)", "[:only-child*=:containsdata(nth-last-child)]");
        java.lang.String str3 = attributeWithValueNot2.value;
        java.lang.String str4 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:only-child*=:containsdata(nth-last-child)]" + "'", str3, "[:only-child*=:containsdata(nth-last-child)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]" + "'", str4, "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:nth-last-child(100n+100)=:containsown([^=:matches(null)])]");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 1, 35);
        int int3 = isNthLastOfType2.b;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isNthLastOfType2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(100)^=*]", ":contains(nth-last-child)");
        attributeWithValueStarting2.value = ":containsOwn([nth-last-of-type*=:last-child])";
        attributeWithValueStarting2.key = "[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]";
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-of-type", pattern1);
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
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((-1), 52);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 1, 32);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":gt(32)", ":contains()");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(32)^=:contains()]" + "'", str3, "[:gt(32)^=:contains()]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:gt(32)^=:contains()]" + "'", str4, "[:gt(32)^=:contains()]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:gt(32)^=:contains()]" + "'", str5, "[:gt(32)^=:contains()]");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("nth-last-of-type");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        java.lang.String str4 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^nth-last-of-type]" + "'", str2, "[^nth-last-of-type]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^nth-last-of-type]" + "'", str3, "[^nth-last-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[^nth-last-of-type]" + "'", str4, "[^nth-last-of-type]");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:containsdata(#hi!)]");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#[:lt(-1)=:gt(1)]");
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
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]", "[:last-child]");
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
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        int int2 = indexGreaterThan1.index;
        java.lang.Class<?> wildcardClass3 = indexGreaterThan1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":nth-last-child(97n+97)");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        java.lang.String str4 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:nth-last-child(97n+97)" + "'", str2, ".:nth-last-child(97n+97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".:nth-last-child(97n+97)" + "'", str3, ".:nth-last-child(97n+97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".:nth-last-child(97n+97)" + "'", str4, ".:nth-last-child(97n+97)");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains([:gt(-1)])");
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
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        indexEquals1.index = 35;
        indexEquals1.index = 'a';
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = indexEquals1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":nth-last-child(100n+10)", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-child(100n+10)=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[:nth-last-child(100n+10)=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":nth-last-of-type(100n+52)");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, 97);
        int int3 = isNthChild2.a;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", ":eq(1)");
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
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":first-of-type", ".[:only-child!=nth-last-child]");
        java.lang.String str3 = attributeWithValueContaining2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]" + "'", str2, "[^[.[^:gt(32)]*=.[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]]]");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:empty=:matches(null)]=hi!]", ":nth-of-type(1n+52)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:empty=:matches(null)]=hi!]!=:nth-of-type(1n+52)]" + "'", str3, "[[[:empty=:matches(null)]=hi!]!=:nth-of-type(1n+52)]");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^hi!]", "[^:nth-last-child(97n+97)]");
        attributeWithValueContaining2.value = ":eq(32)";
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", ":contains(.[:lt(100)^=*])");
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
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        java.lang.String str14 = allElements0.toString();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = allElements0.matches(element15, element16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*" + "'", str14, "*");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        java.lang.String str5 = indexLessThan1.toString();
        java.lang.String str6 = indexLessThan1.toString();
        java.lang.String str7 = indexLessThan1.toString();
        int int8 = indexLessThan1.index;
        java.lang.String str9 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(-1)" + "'", str5, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(-1)" + "'", str6, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(-1)" + "'", str7, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(-1)" + "'", str9, ":lt(-1)");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":nth-of-type(1n+10)");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        java.lang.String str5 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.key = "[:lt(-1)=:gt(1)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str3, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str4, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str5, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-child", ":last-child");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.key;
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.String str6 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child=:last-child]" + "'", str3, "[nth-child=:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-child=:last-child]" + "'", str5, "[nth-child=:last-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-child=:last-child]" + "'", str6, "[nth-child=:last-child]");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) -1);
        int int2 = indexLessThan1.index;
        java.lang.String str3 = indexLessThan1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        java.lang.Class<?> wildcardClass10 = indexLessThan1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(52)", "[:only-child^=:containsown()]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(52)!=[:only-child^=:containsown()]]" + "'", str3, "[:eq(52)!=[:only-child^=:containsown()]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:eq(52)!=[:only-child^=:containsown()]]" + "'", str4, "[:eq(52)!=[:only-child^=:containsown()]]");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[^hi!]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^hi!]" + "'", str2, "[^hi!]");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-child(10n-1)", "[nth-of-type]");
        attributeWithValueNot2.key = "[:only-child^=:containsown()]";
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', 100);
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
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-of-type(97n+1)", pattern1);
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
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.key;
        java.lang.String str4 = attributeWithValueEnding2.key;
        java.lang.String str5 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[:contains(nth-child)$=:eq(0)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":matches(null)" + "'", str4, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str5, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = isFirstOfType0.calculatePosition(element8, element9);
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
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = isLastOfType0.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":matchesOwn(null)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str2, ":containsOwn(:matchesown(null))");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:last-child$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) ' ', (int) (byte) 1);
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
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, 0);
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
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        java.lang.String str3 = isRoot0.toString();
        java.lang.String str4 = isRoot0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = isRoot0.matches(element5, element6);
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":root" + "'", str3, ":root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-last-child(97n+100)", "[[:lt(100)*=:containsown()]$=:containsown()]");
        attributeWithValueStarting2.value = ":nth-last-child(97n+100)";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueStarting2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-last-child(97n+100)^=:nth-last-child(97n+100)]" + "'", str5, "[:nth-last-child(97n+100)^=:nth-last-child(97n+100)]");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-child", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueContaining2.key;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.toString();
        java.lang.String str6 = attributeWithValueContaining2.toString();
        java.lang.String str7 = attributeWithValueContaining2.toString();
        java.lang.String str8 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str4, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str5, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str6, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str7, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str8, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[^=:first-child]", ":gt(97)");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]");
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
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        indexEquals1.index = 'a';
        indexEquals1.index = (byte) -1;
        indexEquals1.index = (byte) 1;
        java.lang.String str8 = indexEquals1.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":eq(1)" + "'", str8, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":eq(1)" + "'", str9, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":eq(1)" + "'", str10, ":eq(1)");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":contains(:last-child)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:last-child)" + "'", str2, ":contains(:last-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(:last-child)" + "'", str3, ":contains(:last-child)");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.b;
        java.lang.String str3 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":gt(97)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) 'a', (int) (byte) -1);
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
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:nth-child(97)!=[nth-of-type]]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
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
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 100, (int) (short) 1);
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
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("#");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 0, (int) (short) 10);
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
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:root^=[^=[:last-child]]]");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":matches(null)", ":containsData(:gt(32))");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.key = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)^=:containsdata(:gt(32))]" + "'", str3, "[:matches(null)^=:containsdata(:gt(32))]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:matches(null)^=:containsdata(:gt(32))]" + "'", str4, "[:matches(null)^=:containsdata(:gt(32))]");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]", "[[:matches(null)!=:nth-of-type(0)]*=:first-child]");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":root";
        attributeWithValueStarting2.value = "[:nth-last-of-type(97n-1)]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=:first-child]" + "'", str7, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:first-child]" + "'", str8, "[^=:first-child]");
    }
}

