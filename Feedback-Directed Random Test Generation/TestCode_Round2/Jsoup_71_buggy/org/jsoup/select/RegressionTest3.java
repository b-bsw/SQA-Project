package org.jsoup.select;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        java.lang.String str2 = isFirstChild0.toString();
        java.lang.String str3 = isFirstChild0.toString();
        java.lang.String str4 = isFirstChild0.toString();
        java.lang.String str5 = isFirstChild0.toString();
        java.lang.String str6 = isFirstChild0.toString();
        java.lang.String str7 = isFirstChild0.toString();
        java.lang.String str8 = isFirstChild0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = isFirstChild0.matches(element9, element10);
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
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:first-child]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:first-child]" + "'", str2, "[:first-child]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsOwn(:matchesown(null))");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":containsOwn(.:containsdata(nth-last-child))");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:contains(nth-child)$=:eq(0)]");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:only-child*=:containsdata(nth-last-child)]", "[[:last-of-type]$=:last-of-type]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:only-child*=:containsdata(nth-last-child)]*=[[:last-of-type]$=:last-of-type]]" + "'", str3, "[[:only-child*=:containsdata(nth-last-child)]*=[[:last-of-type]$=:last-of-type]]");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.getPseudoClass();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isLastOfType0.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-last-of-type" + "'", str2, "nth-last-of-type");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":only-of-type", "[:lt(100)*=:containsown()]");
        attributeWithValueNot2.value = "";
        attributeWithValueNot2.key = ":containsOwn([:only-child*=:containsdata(nth-last-child)])";
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueNot2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsData([[^nth-last-of-type]=:contains(:contains(:last-child))])");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.toString();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        int int6 = isNthChild2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97)" + "'", str4, ":nth-child(97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:nth-last-of-type(97n-1)]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        attributeWithValue2.key = "[:lt(1)=[^[:nth-last-of-type(97n-1)]]]";
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:matches(null)$=:last-child]", "#nth-last-child");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeWithValueMatching2.matches(element12, element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern9);
        org.junit.Assert.assertNull(pattern10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str11, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^=:matches(null)]", "[:nth-last-of-type(97n-1)]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueContaining2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]" + "'", str3, "[[^=:matches(null)]*=[:nth-last-of-type(97n-1)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[^=:matches(null)]" + "'", str4, "[^=:matches(null)]");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:lt(100)*=:containsown()]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:lt(100)*=:containsown()]" + "'", str2, "[:lt(100)*=:containsown()]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-of-type(100n+35)", pattern1);
        attributeWithValueMatching2.key = ":contains([:gt(-1)])";
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, 100);
        java.lang.String str3 = isNthLastChild2.toString();
        int int4 = isNthLastChild2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(100n+100)" + "'", str3, ":nth-last-child(100n+100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = isFirstChild0.matches(element11, element12);
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
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-last-child(10)");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 1);
        indexEquals1.index = (byte) 1;
        java.lang.String str4 = indexEquals1.toString();
        indexEquals1.index = 97;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(1)" + "'", str4, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(97)" + "'", str7, ":eq(97)");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:last-child]", ":last-of-type");
        java.lang.String str3 = attributeWithValueEnding2.value;
        java.lang.String str4 = attributeWithValueEnding2.toString();
        java.lang.String str5 = attributeWithValueEnding2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueEnding2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str4, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str5, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsData(:gt(1))", pattern1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) '#', 0);
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueMatching2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-child(97)", "[nth-of-type]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueNot2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97)!=[nth-of-type]]" + "'", str3, "[:nth-child(97)!=[nth-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-child(97)!=[nth-of-type]]" + "'", str4, "[:nth-child(97)!=[nth-of-type]]");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        int int7 = isLastOfType0.a;
        int int8 = isLastOfType0.b;
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("#hi!");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:matches(null)=hi!]");
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(".nth-last-child", "#:containsData(:gt(32))");
        java.lang.Class<?> wildcardClass3 = attributeWithValueEnding2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", ":last-child");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)$=:last-child]" + "'", str3, "[:matches(null)$=:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:matches(null)$=:last-child]" + "'", str4, "[:matches(null)$=:last-child]");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "[[:last-child]$=:last-of-type]";
        java.lang.String str7 = attributeWithValueMatching2.key;
        java.lang.String str8 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
        java.lang.String str11 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeWithValueMatching2.matches(element12, element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str7, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str8, "[[:last-child]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str11, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[:last-child]$=:last-of-type]");
        java.lang.Class<?> wildcardClass2 = class1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 0, (int) (short) 10);
        java.lang.String str3 = isNthLastOfType2.toString();
        int int4 = isNthLastOfType2.b;
        int int5 = isNthLastOfType2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(10)" + "'", str3, ":nth-last-of-type(10)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":lt(10)");
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-of-type(0)" + "'", str5, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":eq(100)");
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        int int2 = isLastOfType0.b;
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":lt(10)");
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":nth-last-of-type(100n+1)";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]");
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[^nth-last-of-type]=:contains(:contains(:last-child))]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)$=.nth-last-child]", "[.[^:gt(32)]!=hi!]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueStarting2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]" + "'", str3, "[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]" + "'", str4, "[[:matches(null)$=.nth-last-child]^=[.[^:gt(32)]!=hi!]]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 10, (int) (byte) 100);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:lt(-1)=:gt(1)]");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = id1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:lt(-1)=:gt(1)]" + "'", str2, "#[:lt(-1)=:gt(1)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[:lt(-1)=:gt(1)]" + "'", str3, "#[:lt(-1)=:gt(1)]");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 100;
        int int5 = indexGreaterThan1.index;
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:matches(null)$=:last-child]");
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(52, (-1));
        java.lang.String str3 = isNthChild2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(52n-1)" + "'", str3, ":nth-child(52n-1)");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^:gt(32)]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^:gt(32)])" + "'", str2, ":containsOwn([^:gt(32)])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([^:gt(32)])" + "'", str3, ":containsOwn([^:gt(32)])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn([^:gt(32)])" + "'", str4, ":containsOwn([^:gt(32)])");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:nth-last-of-type(97n-1)]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        java.lang.String str7 = isNthOfType2.getPseudoClass();
        java.lang.String str8 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(0)" + "'", str3, ":nth-of-type(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-of-type" + "'", str8, "nth-of-type");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("nth-last-of-type");
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(nth-last-child)", ":containsOwn([nth-last-of-type*=:last-child])");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = matches1.matches(element14, element15);
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
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(".nth-last-child", "#:containsData(:gt(32))");
        attributeWithValueEnding2.key = "#:gt(32)";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueEnding2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', 97);
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":containsOwn([^hi!])");
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:nth-child(97)!=[nth-of-type]]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97)!=[nth-of-type]]" + "'", str3, "[:nth-child(97)!=[nth-of-type]]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:last-child]]");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":only-of-type", "[:lt(100)*=:containsown()]");
        attributeWithValueNot2.key = "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]";
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isNthChild2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(0)", "[nth-child!=:nth-child(97)]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(0)!=[nth-child!=:nth-child(97)]]" + "'", str3, "[:eq(0)!=[nth-child!=:nth-child(97)]]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(".[:only-child!=nth-last-child]");
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 0, (int) (short) 10);
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsdata(nth-last-child)");
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("#");
        java.lang.Class<?> wildcardClass2 = containsOwnText1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":eq(1)");
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        java.lang.String str2 = indexLessThan1.toString();
        java.lang.String str3 = indexLessThan1.toString();
        int int4 = indexLessThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(10)" + "'", str2, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(10)" + "'", str3, ":lt(10)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", pattern1);
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[^=:first-child]");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        java.lang.String str4 = tag1.toString();
        java.lang.String str5 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^=:first-child]" + "'", str2, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^=:first-child]" + "'", str3, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[^=:first-child]" + "'", str4, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^=:first-child]" + "'", str5, "[^=:first-child]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(".#[:nth-child(97)^=.nth-last-child]");
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":matches(null)", "hi!");
        java.lang.String str3 = attributeWithValue2.key;
        attributeWithValue2.key = "[:empty=:matches(null)]";
        java.lang.String str6 = attributeWithValue2.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValue2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[:empty=:matches(null)]=hi!]" + "'", str6, "[[:empty=:matches(null)]=hi!]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-child", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueContaining2.key;
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str4, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str5, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str6, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)!=:nth-of-type(0)]", ":matches(null)");
        java.lang.String str3 = attributeWithValueStarting2.key;
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueStarting2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str3, "[:matches(null)!=:nth-of-type(0)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]" + "'", str4, "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":only-child", ":containsOwn()");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsown()" + "'", str3, ":containsown()");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[:last-child]=:matches(null)]", "nth-last-child");
        java.lang.String str3 = attributeWithValueContaining2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]=:matches(null)]" + "'", str3, "[[:last-child]=:matches(null)]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(".:nth-last-child(97n+97)");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        attributeWithValueMatching2.key = "[[:gt(-1)]^=[:matches(null)$=.nth-last-child]]";
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        java.lang.String str2 = indexLessThan1.toString();
        indexLessThan1.index = 10;
        int int5 = indexLessThan1.index;
        indexLessThan1.index = (byte) 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        java.lang.String str4 = class1.toString();
        java.lang.String str5 = class1.toString();
        java.lang.String str6 = class1.toString();
        java.lang.String str7 = class1.toString();
        java.lang.String str8 = class1.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = class1.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:lt(100)*=:containsown()]");
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 1, 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":lt(-1)", ":nth-of-type(1n+52)");
        java.lang.String str3 = attributeWithValue2.key;
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.String str6 = attributeWithValue2.toString();
        java.lang.String str7 = attributeWithValue2.toString();
        java.lang.String str8 = attributeWithValue2.key;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValue2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str4, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str5, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str6, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str7, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(-1)" + "'", str8, ":lt(-1)");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-child" + "'", str3, ":only-child");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(35, (int) (byte) 0);
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
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, 0);
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        int int2 = indexGreaterThan1.index;
        int int3 = indexGreaterThan1.index;
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(0)" + "'", str4, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(0)" + "'", str5, ":gt(0)");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, (int) 'a');
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
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, 0);
        java.lang.String str3 = isNthOfType2.toString();
        int int4 = isNthOfType2.a;
        int int5 = isNthOfType2.a;
        java.lang.String str6 = isNthOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(0)" + "'", str3, ":nth-of-type(0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-of-type(0)" + "'", str6, ":nth-of-type(0)");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":gt(32)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:gt(32))" + "'", str2, ":containsData(:gt(32))");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("*", "[^nth-last-child]");
        java.lang.String str3 = attributeWithValueNot2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueNot2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^nth-last-child]" + "'", str3, "[^nth-last-child]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":eq(35)");
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsData(:containsdata(:gt(32)))", "[^[:nth-last-of-type(97n-1)]]");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(97);
        int int2 = indexEquals1.index;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:matches(null)$=[[:last-child]$=:last-of-type]]", ".#hi!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(32, (int) (byte) -1);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":lt(100)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:lt(100)]" + "'", str2, "[^:lt(100)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^:lt(100)]" + "'", str3, "[^:lt(100)]");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("nth-of-type");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^nth-of-type]" + "'", str2, "[^nth-of-type]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:last-of-type]", ":contains(nth-child)");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-of-type]$=:contains(nth-child)]" + "'", str3, "[[:last-of-type]$=:contains(nth-child)]");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = indexGreaterThan1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[[:last-child]]=[nth-child!=:nth-child(97)]]");
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":containsData(:gt(32))");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#:containsData(:gt(32))" + "'", str2, "#:containsData(:gt(32))");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:last-child^=[:last-child]]", "[:only-child!=nth-last-child]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isNthLastChild2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":lt(1)", pattern1);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(1)" + "'", str3, ":lt(1)");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(97);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(97)" + "'", str2, ":eq(97)");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.toString();
        java.lang.String str9 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=:first-child]" + "'", str7, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:first-child]" + "'", str8, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[^=:first-child]" + "'", str9, "[^=:first-child]");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(100, (int) 'a');
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 10, (int) 'a');
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(:contains(:last-child))", ":only-of-type");
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":nth-last-child(100n+10)");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:nth-last-child(100n+10)" + "'", str2, ".:nth-last-child(100n+10)");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        java.lang.String str2 = indexEquals1.toString();
        indexEquals1.index = 1;
        java.lang.String str5 = indexEquals1.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(52)" + "'", str2, ":eq(52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(1)" + "'", str5, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":eq(1)" + "'", str6, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(1)" + "'", str7, ":eq(1)");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[.nth-last-child^=hi!]", "[^:gt(-1)]");
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(1);
        indexGreaterThan1.index = 0;
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(0)" + "'", str4, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(0)" + "'", str5, ":gt(0)");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^=:matches(null)]", "[:nth-last-of-type(97n-1)]");
        attributeWithValueContaining2.key = "nth-last-of-type";
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-last-child(97n-1)");
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":lt(0)");
        java.lang.String str2 = tag1.toString();
        java.lang.Class<?> wildcardClass3 = tag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(0)" + "'", str2, ":lt(0)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsData(:containsown())");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:containsdata(:containsown())]" + "'", str2, "[^:containsdata(:containsown())]");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueNot2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!!=nth-last-child]" + "'", str3, "[hi!!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("nth-last-child");
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":lt(97)");
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsData(#hi!)", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:lt(100)^=*]");
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.select.Evaluator.IsEmpty isEmpty0 = new org.jsoup.select.Evaluator.IsEmpty();
        java.lang.String str1 = isEmpty0.toString();
        java.lang.String str2 = isEmpty0.toString();
        java.lang.String str3 = isEmpty0.toString();
        java.lang.String str4 = isEmpty0.toString();
        java.lang.String str5 = isEmpty0.toString();
        java.lang.String str6 = isEmpty0.toString();
        java.lang.String str7 = isEmpty0.toString();
        java.lang.String str8 = isEmpty0.toString();
        java.lang.String str9 = isEmpty0.toString();
        java.lang.String str10 = isEmpty0.toString();
        java.lang.Class<?> wildcardClass11 = isEmpty0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":empty" + "'", str1, ":empty");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":empty" + "'", str2, ":empty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":empty" + "'", str3, ":empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":empty" + "'", str4, ":empty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":empty" + "'", str5, ":empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":empty" + "'", str6, ":empty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":empty" + "'", str7, ":empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":empty" + "'", str8, ":empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":empty" + "'", str9, ":empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":empty" + "'", str10, ":empty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) -1, 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:nth-child(97)!=[nth-of-type]]", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        attributeWithValueNot2.key = "[nth-of-type]";
        java.lang.String str5 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-of-type]" + "'", str5, "[nth-of-type]");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]", ":containsOwn([^=:matches(null)])");
        attributeWithValueStarting2.value = "[:last-of-type]";
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        attributeWithValueMatching2.key = "nth-of-type";
        java.lang.Class<?> wildcardClass11 = attributeWithValueMatching2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[:containsOwn(:eq(52))]]");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) '#', 35);
        java.lang.String str3 = isNthOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(35n+35)" + "'", str3, ":nth-of-type(35n+35)");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) 'a');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isNthLastChild2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:last-of-type]");
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
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        int int7 = isLastOfType0.a;
        int int8 = isLastOfType0.b;
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
        java.lang.String str5 = isNthLastChild2.toString();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(100n+10)" + "'", str5, ":nth-last-child(100n+10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[.^=[:last-child]]");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[.^=[:last-child]]]" + "'", str2, "[[.^=[:last-child]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[.^=[:last-child]]]" + "'", str3, "[[.^=[:last-child]]]");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(".[:lt(100)^=*]");
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("#nth-last-child", "[^.]");
        attributeWithValue2.value = "[^[:nth-last-of-type(97n-1)]]";
        attributeWithValue2.key = ":eq(32)";
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("#nth-last-child", "[^.]");
        attributeWithValue2.value = "[^[:nth-last-of-type(97n-1)]]";
        java.lang.String str5 = attributeWithValue2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValue2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[#nth-last-child=[^[:nth-last-of-type(97n-1)]]]" + "'", str5, "[#nth-last-child=[^[:nth-last-of-type(97n-1)]]]");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        int int7 = isFirstOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("nth-last-child");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        java.lang.Class<?> wildcardClass4 = class1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".nth-last-child" + "'", str2, ".nth-last-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".nth-last-child" + "'", str3, ".nth-last-child");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(:only-child)", ":gt(-1)");
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(".:nth-last-child(97n+97)");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^.:nth-last-child(97n+97)]" + "'", str2, "[^.:nth-last-child(97n+97)]");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^[:nth-last-of-type(97n-1)]]", ":lt(97)");
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]", ":containsData(.nth-last-child)");
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
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.lang.String str9 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern10 = null;
        attributeWithValueMatching2.pattern = pattern10;
        attributeWithValueMatching2.key = ".[^:gt(32)]";
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeWithValueMatching2.matches(element14, element15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]" + "'", str2, "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]" + "'", str3, "[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsData(:containsdata(:gt(32)))");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:containsdata(:gt(32)))" + "'", str2, ":containsData(:containsdata(:gt(32)))");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        int int5 = isLastOfType0.a;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^:lt(100)]", "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
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
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, (int) (byte) 1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 0, 0);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        int int4 = isNthOfType2.b;
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", "[[:last-child]$=:last-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str3, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]$=:last-of-type]" + "'", str4, "[[:last-child]$=:last-of-type]");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isNthLastChild2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, 97);
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("#nth-last-child");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^#nth-last-child]" + "'", str2, "[^#nth-last-child]");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:eq(32)*=.:first-of-type]");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
        java.lang.String str5 = isNthLastChild2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthLastChild2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(100n+10)" + "'", str5, ":nth-last-child(100n+10)");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn(:nth-last-of-type(97n-1))", "[[:last-child^=[:last-child]]]");
        java.lang.String str3 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child^=[:last-child]]]" + "'", str3, "[[:last-child^=[:last-child]]]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-child", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = ":nth-last-child(97n+97)";
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[^=:first-child]*=hi!]");
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
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":matches(null)", "hi!");
        java.lang.String str3 = attributeWithValue2.toString();
        attributeWithValue2.value = ":containsOwn(:gt(97))";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)=hi!]" + "'", str3, "[:matches(null)=hi!]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "#hi!";
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        attributeWithValueMatching2.key = "[*=:last-child]";
        attributeWithValueMatching2.key = ":gt(1)";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, (int) (short) -1);
        int int3 = isNthOfType2.a;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[nth-last-of-type*=:last-child]", "[[:containsOwn(:eq(52))]]");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".:only-of-type", "[:nth-last-of-type(100n+35)]");
        attributeWithValueStarting2.value = "[:gt(-1)*=:first-of-type]";
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[.^=[:last-child]]");
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":containsData(:containsdata(:gt(32)))");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:containsData(:containsdata(:gt(32)))" + "'", str2, ".:containsData(:containsdata(:gt(32)))");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:nth-child(97)!=[nth-of-type]]");
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
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, 100);
        java.lang.String str3 = isNthLastChild2.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(100n+100)" + "'", str3, ":nth-last-child(100n+100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#hi!", ".:first-child");
        attributeWithValueNot2.key = ":containsOwn(:eq(1))";
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-last-of-type*=:only-of-type]");
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
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 1);
        indexLessThan1.index = (short) 100;
        java.lang.String str4 = indexLessThan1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = indexLessThan1.matches(element8, element9);
        java.lang.String str11 = indexLessThan1.toString();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = indexLessThan1.matches(element12, element13);
        int int15 = indexLessThan1.index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(100)" + "'", str4, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":lt(100)" + "'", str11, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":first-of-type", ":contains(nth-last-child)");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:first-of-type*=:contains(nth-last-child)]" + "'", str3, "[:first-of-type*=:contains(nth-last-child)]");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        java.lang.String str8 = indexLessThan1.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = indexLessThan1.matches(element9, element10);
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        boolean boolean14 = indexLessThan1.matches(element12, element13);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = indexLessThan1.matches(element15, element16);
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = indexLessThan1.matches(element18, element19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(-1)" + "'", str8, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[nth-last-of-type*=:eq(1)]", "[^:gt(-1)]");
        attributeWithValueEnding2.value = ":containsOwn(:eq(52))";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueEnding2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 10, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:matches(null)!=:nth-of-type(0)]", ":first-child");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:matches(null)!=:nth-of-type(0)]*=:first-child]" + "'", str3, "[[:matches(null)!=:nth-of-type(0)]*=:first-child]");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        java.lang.String str3 = isRoot0.toString();
        java.lang.String str4 = isRoot0.toString();
        java.lang.String str5 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":root" + "'", str3, ":root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:lt(-1)=:nth-of-type(1n+52)]", ":containsdata([:empty=:matches(null)])");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        indexLessThan1.index = 97;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(100)" + "'", str6, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:containsOwn(:eq(52))]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:containsOwn(:eq(52))]]" + "'", str2, "[[:containsOwn(:eq(52))]]");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:last-child^=[:last-child]]", "[:only-child!=nth-last-child]");
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
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) -1, 32);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains()");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 10, 32);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":contains(:last-child)", "#:last-child");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#:last-child" + "'", str3, "#:last-child");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(".[^nth-last-child]");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        java.lang.String str5 = attributeWithValueStarting2.value;
        attributeWithValueStarting2.key = "[nth-of-type]";
        java.lang.String str8 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-child" + "'", str4, ":last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:last-child]" + "'", str5, "[:last-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[nth-of-type]^=[:last-child]]" + "'", str8, "[[nth-of-type]^=[:last-child]]");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:last-child]$=:last-of-type]");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        java.lang.Class<?> wildcardClass4 = attribute1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[[:last-child]$=:last-of-type]]" + "'", str2, "[[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]$=:last-of-type]]" + "'", str3, "[[[:last-child]$=:last-of-type]]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) (byte) 0);
        int int3 = isNthChild2.a;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsdata(#hi!)", "[[:last-child]]");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueStarting2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=:first-child]" + "'", str7, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-child" + "'", str8, ":first-child");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[nth-child=:last-child]", "[:only-child!=nth-last-child]");
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:gt(-1)*=:first-of-type]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([:gt(-1)*=:first-of-type])" + "'", str2, ":containsOwn([:gt(-1)*=:first-of-type])");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":matches(null)", ":last-child");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)$=:last-child]" + "'", str3, "[:matches(null)$=:last-child]");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":gt(97)");
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-last-of-type*=:eq(1)]", pattern1);
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 0);
        int int2 = indexEquals1.index;
        java.lang.String str3 = indexEquals1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = indexEquals1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(0)" + "'", str3, ":eq(0)");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":gt(32)");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        attributeWithValueMatching2.key = ":lt(-1)";
        java.lang.Class<?> wildcardClass5 = attributeWithValueMatching2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#[:last-child^=[:last-child]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str2, ":contains(#[:last-child^=[:last-child]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str3, ":contains(#[:last-child^=[:last-child]])");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:matches(null)!=:nth-of-type(0)]", ":first-child");
        java.lang.String str3 = attributeWithValueContaining2.key;
        java.lang.Class<?> wildcardClass4 = attributeWithValueContaining2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str3, "[:matches(null)!=:nth-of-type(0)]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":lt(1)", ".#hi!");
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:lt(100)*=:containsown()]", ":nth-of-type(1n+52)");
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-last-of-type(100n+35)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:nth-last-of-type(100n+35))" + "'", str2, ":contains(:nth-last-of-type(100n+35))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(:nth-last-of-type(100n+35))" + "'", str3, ":contains(:nth-last-of-type(100n+35))");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        java.lang.String str10 = isLastOfType0.toString();
        java.lang.Class<?> wildcardClass11 = isLastOfType0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-of-type" + "'", str10, ":last-of-type");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".:only-of-type", "[:nth-last-of-type(100n+35)]");
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("#nth-last-child");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[#nth-last-child]" + "'", str2, "[#nth-last-child]");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#:contains(nth-child)");
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) -1);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(-1)" + "'", str2, ":gt(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(-1)" + "'", str3, ":gt(-1)");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isFirstOfType0.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":only-of-type", "[:lt(100)*=:containsown()]");
        attributeWithValueNot2.value = "";
        attributeWithValueNot2.key = ":containsOwn([:only-child*=:containsdata(nth-last-child)])";
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:containsOwn([:only-child*=:containsdata(nth-last-child)])!=]" + "'", str7, "[:containsOwn([:only-child*=:containsdata(nth-last-child)])!=]");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":containsown([^=:matches(null)])");
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 10, 97);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":containsown([:last-child])");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 100, (int) '#');
        int int3 = isNthLastOfType2.b;
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        java.lang.String str5 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[nth-last-child^=:matchesown(null)]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[nth-last-child^=:matchesown(null)]]" + "'", str2, "[^[nth-last-child^=:matchesown(null)]]");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:eq(32)*=.:first-of-type]", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":lt(-1)", ":nth-of-type(1n+52)");
        java.lang.String str3 = attributeWithValue2.key;
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str4, "[:lt(-1)=:nth-of-type(1n+52)]");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(".[:lt(100)^=*]");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":first-child", ":gt(97)");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 10, (-1));
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:lt(1)!=[[:last-of-type]$=:last-of-type]]");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, 1);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[.[^:gt(32)]!=hi!]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, 97);
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[#nth-last-child=[^[:nth-last-of-type(97n-1)]]]");
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
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        java.lang.Class<?> wildcardClass4 = containsText1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains()" + "'", str2, ":contains()");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains()" + "'", str3, ":contains()");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsData(:containsdata(:gt(32)))");
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
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[[:last-child]]!=[:matches(null)$=:last-child]]", pattern1);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn(:nth-of-type(97n+97))", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        attributeWithValueMatching2.key = "[^:matches(null)]";
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeWithValueMatching2.matches(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:only-child*=:root]", ":containsData(:eq(1))");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":first-of-type", ":contains(nth-last-child)");
        attributeWithValueContaining2.value = "[:only-child*=:containsdata(nth-last-child)]";
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#:contains(nth-last-child)");
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(97)" + "'", str3, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(".nth-last-child", "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]" + "'", str3, "[.nth-last-child$=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[nth-last-child^=:matchesown(null)]", "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]");
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
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":lt(-1)", ":nth-of-type(1n+52)");
        java.lang.String str3 = attributeWithValue2.key;
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.String str6 = attributeWithValue2.toString();
        java.lang.String str7 = attributeWithValue2.toString();
        java.lang.String str8 = attributeWithValue2.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValue2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str4, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str5, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str6, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str7, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str8, "[:lt(-1)=:nth-of-type(1n+52)]");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        indexLessThan1.index = (short) -1;
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', (int) (short) 1);
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
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":gt(-1)", "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]");
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(100n+10)", pattern1);
        attributeWithValueMatching2.key = "[:nth-of-type(1n+52)$=:containsdata()]";
        java.lang.String str5 = attributeWithValueMatching2.key;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-of-type(1n+52)$=:containsdata()]" + "'", str5, "[:nth-of-type(1n+52)$=:containsdata()]");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        java.util.regex.Pattern pattern13 = null;
        attributeWithValueMatching2.pattern = pattern13;
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[:matches(null)$=[[:last-child]$=:last-of-type]]" + "'", str12, "[:matches(null)$=[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        java.lang.String str2 = isRoot0.toString();
        java.lang.String str3 = isRoot0.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = isRoot0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":root" + "'", str2, ":root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":root" + "'", str3, ":root");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":gt(52)");
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
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]", "[^hi!]");
        attributeWithValueContaining2.value = "[#nth-last-child=[:last-child^=[:last-child]]]";
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(".:nth-last-child(100n+10)");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:eq(100)!=[:nth-of-type(1n+52)$=:containsdata()]]", "[hi!!=nth-last-child]");
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".hi!", pattern1);
        attributeWithValueMatching2.key = "[:lt(-1)=:nth-of-type(1n+52)]";
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ".[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str5, "[:lt(-1)=:nth-of-type(1n+52)]");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":nth-of-type(97n+97)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        java.lang.String str5 = indexLessThan1.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = indexLessThan1.matches(element6, element7);
        java.lang.String str9 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(10)" + "'", str5, ":lt(10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(10)" + "'", str9, ":lt(10)");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, (int) (short) 1);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isNthChild2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (int) '#');
        int int3 = isNthLastOfType2.a;
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthLastOfType2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
        java.lang.String str5 = isNthLastChild2.toString();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = isNthLastChild2.calculatePosition(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(100n+10)" + "'", str5, ":nth-last-child(100n+10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#nth-last-child");
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        int int7 = isNthChild2.a;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(1);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        indexGreaterThan1.index = ' ';
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(1)" + "'", str2, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(1)" + "'", str3, ":gt(1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(32)" + "'", str6, ":gt(32)");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:lt(1)!=[[:last-of-type]$=:last-of-type]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        java.lang.String str2 = indexGreaterThan1.toString();
        int int3 = indexGreaterThan1.index;
        java.lang.String str4 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(97)" + "'", str2, ":gt(97)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(97)" + "'", str4, ":gt(97)");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)!=:nth-of-type(0)]", ":matches(null)");
        java.lang.String str3 = attributeWithValueStarting2.key;
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)!=:nth-of-type(0)]" + "'", str3, "[:matches(null)!=:nth-of-type(0)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]" + "'", str4, "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]" + "'", str5, "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-last-child(97n+100)");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.Class<?> wildcardClass3 = tagEndsWith1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-last-child(97n+100)" + "'", str2, ":nth-last-child(97n+100)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) 'a', 1);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-of-type(97n+1)" + "'", str5, ":nth-of-type(97n+1)");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("#:last-child");
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
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("nth-last-of-type");
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
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":only-child");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:only-child)" + "'", str2, ":containsOwn(:only-child)");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":gt(32)");
        java.lang.Class<?> wildcardClass2 = attribute1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 10, 0);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        indexGreaterThan1.index = (byte) 100;
        java.lang.String str4 = indexGreaterThan1.toString();
        java.lang.String str5 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(100)" + "'", str4, ":gt(100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(100)" + "'", str5, ":gt(100)");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":only-child", ":containsOwn([^hi!])");
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        java.lang.String str2 = indexLessThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = indexLessThan1.matches(element3, element4);
        java.lang.String str6 = indexLessThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        int int13 = indexLessThan1.index;
        int int14 = indexLessThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(100)" + "'", str6, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:last-child]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:last-child]" + "'", str2, "#[:last-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[:last-child]" + "'", str3, "#[:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#[:last-child]" + "'", str4, "#[:last-child]");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:lt(100)*=:containsown()]", ":containsOwn()");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.Class<?> wildcardClass4 = attributeWithValueEnding2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(100)*=:containsown()]$=:containsown()]" + "'", str3, "[[:lt(100)*=:containsown()]$=:containsown()]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) '4');
        indexEquals1.index = 35;
        java.lang.String str4 = indexEquals1.toString();
        int int5 = indexEquals1.index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(35)" + "'", str4, ":eq(35)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:matches(null)!=:nth-of-type(0)]");
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((-1), (int) (short) 1);
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
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isLastOfType0.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(52, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = isNthChild2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, (int) (byte) 0);
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
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueStarting2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child^=[:last-child]]" + "'", str3, "[:last-child^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-child" + "'", str4, ":last-child");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-child(10n-1)", "[^.]");
        attributeWithValueNot2.key = ":nth-of-type(97n+1)";
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":gt(10)", pattern1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        java.lang.String str3 = attributeWithValueNot2.key;
        attributeWithValueNot2.key = ":only-child";
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:only-child!=nth-last-child]" + "'", str6, "[:only-child!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:containsOwn(:eq(52))]");
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
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-of-type", "[:last-child^=[:last-child]]");
        attributeWithValueNot2.value = ":containsData(.nth-last-child)";
        java.lang.String str5 = attributeWithValueNot2.key;
        attributeWithValueNot2.key = "#:contains(nth-last-child)";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        int int8 = isFirstOfType0.a;
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) (short) 10);
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
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) '#', (int) (byte) 1);
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
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[:lt(100)*=:containsown()]$=:nth-of-type(1n+52)]", ":eq(-1)");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:contains(nth-last-child)=:containsown([nth-last-of-type*=:last-child])]");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', 97);
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[#nth-last-child=[:last-child^=[:last-child]]]", ":contains([[:lt(100)^=*]=[nth-last-of-type*=:last-child]])");
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
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsData(:containsown())", "[:nth-child(97)^=.nth-last-child]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[:last-child^=[:last-child]]";
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueEnding2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]" + "'", str3, "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(0)" + "'", str2, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("#nth-last-child");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[#nth-last-child]" + "'", str2, "[#nth-last-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#nth-last-child]" + "'", str3, "[#nth-last-child]");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) -1);
        int int2 = indexLessThan1.index;
        java.lang.String str3 = indexLessThan1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        int int7 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsData(:containsown())");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:containsdata(:containsown()))" + "'", str2, ":contains(:containsdata(:containsown()))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(:containsdata(:containsown()))" + "'", str3, ":contains(:containsdata(:containsown()))");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#[:last-child]");
        java.lang.Class<?> wildcardClass2 = tag1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.value = ":first-child";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.toString();
        java.lang.String str9 = attributeWithValueStarting2.value;
        java.lang.String str10 = attributeWithValueStarting2.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[^=:first-child]" + "'", str7, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:first-child]" + "'", str8, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-child" + "'", str9, ":first-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[^=:first-child]" + "'", str10, "[^=:first-child]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[^=:first-child]" + "'", str11, "[^=:first-child]");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("nth-of-type");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(nth-of-type)" + "'", str2, ":contains(nth-of-type)");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 1);
        indexLessThan1.index = (short) 100;
        java.lang.String str4 = indexLessThan1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = indexLessThan1.matches(element8, element9);
        indexLessThan1.index = (byte) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(100)" + "'", str4, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#hi!");
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
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]!=[:gt(-1)]]", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn()", ":containsData([:empty=:matches(null)])");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsown()=:containsdata([:empty=:matches(null)])]" + "'", str3, "[:containsown()=:containsdata([:empty=:matches(null)])]");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[^:gt(-1)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]", "[[nth-of-type]$=:only-of-type]");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsData(.:gt(-1))", "[nth-of-type]");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]", ":contains(:gt(97))");
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[nth-last-child^=:matchesown(null)]", "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]");
        java.lang.String str3 = attributeWithValue2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValue2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]" + "'", str3, "[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsOwn(hi!)");
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
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":first-of-type", ":eq(32)");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.Class<?> wildcardClass4 = attributeWithValue2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:first-of-type=:eq(32)]" + "'", str3, "[:first-of-type=:eq(32)]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^:lt(100)]", "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
        attributeWithValueNot2.value = "[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]";
        java.lang.String str5 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]" + "'", str5, "[[^:lt(100)]!=[[:matches(null)!=:nth-of-type(0)]^=:matches(null)]]");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]!=[:gt(-1)]]", pattern1);
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
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[.^=[:last-child]]]", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 0, (int) (short) 10);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.toString();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-of-type(10)" + "'", str4, ":nth-last-of-type(10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:gt(-1)]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([:gt(-1)])" + "'", str2, ":contains([:gt(-1)])");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, 97);
        java.lang.String str3 = isNthChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:nth-last-of-type(97n-1)]", ":nth-last-of-type(100n+35)");
        java.lang.String str3 = attributeWithValueStarting2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-of-type(100n+35)" + "'", str3, ":nth-last-of-type(100n+35)");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (int) '#');
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:nth-child(97)^=.nth-last-child]", ":eq(1)");
        attributeWithValueEnding2.key = ":root";
        attributeWithValueEnding2.key = "#:contains(nth-last-child)";
        java.lang.String str7 = attributeWithValueEnding2.key;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#:contains(nth-last-child)" + "'", str7, "#:contains(nth-last-child)");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 10);
        java.lang.String str2 = indexEquals1.toString();
        java.lang.String str3 = indexEquals1.toString();
        int int4 = indexEquals1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(10)" + "'", str2, ":eq(10)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(10)" + "'", str3, ":eq(10)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:last-child$=[:last-child^=[:last-child]]]");
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
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(".[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]" + "'", str3, ".[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsData(:containsown())", "[:nth-child(97)^=.nth-last-child]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[:last-child^=[:last-child]]";
        attributeWithValueEnding2.key = "[:matches(null)$=[[:last-child]$=:last-of-type]]";
        java.lang.String str8 = attributeWithValueEnding2.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueEnding2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]" + "'", str3, "[:containsdata(:containsown())$=[:nth-child(97)^=.nth-last-child]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[:matches(null)$=[[:last-child]$=:last-of-type]]$=[:last-child^=[:last-child]]]" + "'", str8, "[[:matches(null)$=[[:last-child]$=:last-of-type]]$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[:last-of-type]$=:last-of-type]");
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
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[:contains(:nth-last-of-type(100n+35))]";
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#hi!", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[^hi!]");
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
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        attributeWithValueMatching2.key = ":lt(-1)";
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.lang.String str8 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
        java.util.regex.Pattern pattern11 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeWithValueMatching2.matches(element12, element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(-1)" + "'", str5, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(-1)" + "'", str8, ":lt(-1)");
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[^:contains(:nth-last-of-type(100n+35))]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":contains(:last-child)");
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("#");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(#)" + "'", str2, ":containsOwn(#)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(#)" + "'", str3, ":containsOwn(#)");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":empty", ":matches(null)");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.toString();
        attributeWithValue2.value = "[[:lt(100)*=:containsown()]$=:containsown()]";
        java.lang.String str8 = attributeWithValue2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:empty=:matches(null)]" + "'", str3, "[:empty=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:empty=:matches(null)]" + "'", str4, "[:empty=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:empty=:matches(null)]" + "'", str5, "[:empty=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[:lt(100)*=:containsown()]$=:containsown()]" + "'", str8, "[[:lt(100)*=:containsown()]$=:containsown()]");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]", "#:last-child");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]" + "'", str3, "[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]" + "'", str4, "[[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]!=#:last-child]");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.toString();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthLastChild2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(100n+10)" + "'", str4, ":nth-last-child(100n+10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(10, 10);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        int int4 = isNthChild2.a;
        int int5 = isNthChild2.a;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsOwn(hi!)", "#.:first-of-type");
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
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("hi!");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(hi!)" + "'", str2, ":containsOwn(hi!)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(hi!)" + "'", str3, ":containsOwn(hi!)");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-last-of-type*=:eq(1)]");
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
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":containsData(:containsown())");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:first-child]", "#[:last-child$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":eq(-1)");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", ":nth-last-child(97n+100)");
        attributeWithValue2.key = "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]";
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = matches1.matches(element15, element16);
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
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:matches(null)!=:nth-of-type(0)]$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-of-type", "[:last-child^=[:last-child]]");
        attributeWithValueNot2.value = ":containsData(.nth-last-child)";
        java.lang.String str5 = attributeWithValueNot2.key;
        java.lang.String str6 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":containsData(.nth-last-child)" + "'", str6, ":containsData(.nth-last-child)");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) 'a');
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = isNthChild2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, 10);
        int int3 = isNthLastChild2.b;
        java.lang.String str4 = isNthLastChild2.toString();
        java.lang.Class<?> wildcardClass5 = isNthLastChild2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(100n+10)" + "'", str4, ":nth-last-child(100n+10)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(".:containsData()");
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
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[^:gt(-1)]", pattern1);
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
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) -1, 0);
        java.lang.String str3 = isNthChild2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(-1n)" + "'", str3, ":nth-child(-1n)");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[nth-last-child^=:matchesown(null)]");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[nth-last-child^=:matchesown(null)]]" + "'", str2, "[^[nth-last-child^=:matchesown(null)]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^[nth-last-child^=:matchesown(null)]]" + "'", str3, "[^[nth-last-child^=:matchesown(null)]]");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":nth-last-child(0)");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) 'a', (int) (byte) -1);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[^=:first-child]*=hi!]");
        java.lang.Class<?> wildcardClass2 = tag1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", "[^hi!]");
        attributeWithValueContaining2.key = "[:last-child^=[:last-child]]";
        attributeWithValueContaining2.key = ":contains([[:lt(100)^=*]=[nth-last-of-type*=:last-child]])";
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(1)", pattern1);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:first-of-type*=.[:only-child!=nth-last-child]]", ":lt(97)");
        java.lang.String str3 = attributeWithValueStarting2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(97)" + "'", str3, ":lt(97)");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:contains(nth-child)$=:eq(0)]", "[^nth-last-of-type]");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str2, ".[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":gt(1)");
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) -1, 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[^:lt(100)]", "[:matches(null)=hi!]");
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(".[[:lt(-1)=:nth-of-type(1n+52)]!=:containsown()]");
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
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, 100);
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
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":contains(nth-child)", "[:last-child]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(nth-child)!=[:last-child]]" + "'", str3, "[:contains(nth-child)!=[:last-child]]");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        int int7 = isLastOfType0.a;
        int int8 = isLastOfType0.b;
        java.lang.String str9 = isLastOfType0.getPseudoClass();
        java.lang.String str10 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-of-type" + "'", str10, ":last-of-type");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", ":first-of-type");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!!=:first-of-type]" + "'", str3, "[hi!!=:first-of-type]");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) ' ');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        int int4 = indexGreaterThan1.index;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = indexGreaterThan1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(32)" + "'", str2, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(32)" + "'", str3, ":gt(32)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) 1);
        java.lang.String str2 = indexGreaterThan1.toString();
        int int3 = indexGreaterThan1.index;
        int int4 = indexGreaterThan1.index;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = indexGreaterThan1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(1)" + "'", str2, ":gt(1)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-child", ":last-child");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child=:last-child]" + "'", str3, "[nth-child=:last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child=:last-child]" + "'", str4, "[nth-child=:last-child]");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("nth-last-child");
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
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(100, (int) (short) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        int int5 = isNthLastChild2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#[:last-child^=[:last-child]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str2, ":contains(#[:last-child^=[:last-child]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str3, ":contains(#[:last-child^=[:last-child]])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(#[:last-child^=[:last-child]])" + "'", str4, ":contains(#[:last-child^=[:last-child]])");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        attributeWithValueMatching2.key = ":lt(-1)";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        java.lang.String str3 = attributeWithValueNot2.key;
        attributeWithValueNot2.key = ":only-child";
        java.lang.String str6 = attributeWithValueNot2.toString();
        java.lang.String str7 = attributeWithValueNot2.key;
        java.lang.String str8 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueNot2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:only-child!=nth-last-child]" + "'", str6, "[:only-child!=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:only-child!=nth-last-child]" + "'", str8, "[:only-child!=nth-last-child]");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = "#hi!";
        java.lang.String str7 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        attributeWithValueMatching2.key = "[[:matches(null)$=.nth-last-child]^=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]";
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#hi!" + "'", str7, "#hi!");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = null;
        attributeWithValueMatching2.pattern = pattern7;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:first-of-type!=:matchesown(null)]", ".");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = indexGreaterThan1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":only-child", ":containsData(nth-last-child)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.toString();
        java.lang.String str6 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.value = "[^nth-last-child]";
        attributeWithValueContaining2.value = ":root";
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeWithValueContaining2.matches(element11, element12);
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
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", ":eq(1)");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueContaining2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(1)" + "'", str3, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-last-of-type*=:eq(1)]" + "'", str4, "[nth-last-of-type*=:eq(1)]");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.Class<?> wildcardClass2 = evaluator1.getClass();
        org.junit.Assert.assertNotNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[nth-last-of-type*=:eq(1)]$=[^:gt(-1)]]", "[^hi!]");
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
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":lt(0)");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(0)" + "'", str2, ":lt(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(0)" + "'", str3, ":lt(0)");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[.[^:gt(32)]!=hi!]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[.[^:gt(32)]!=hi!]" + "'", str2, "#[.[^:gt(32)]!=hi!]");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[:lt(-1)=:nth-of-type(1n+52)]^=:only-child]");
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
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), 97);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":nth-of-type(1n+97)");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[nth-of-type!=:gt(32)]", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:matches(null)$=[[:last-child]$=:last-of-type]]", ":contains(nth-child)");
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsData(:gt(1))", "[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(".[^=:matches(null)]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[^=:matches(null)]" + "'", str2, ".[^=:matches(null)]");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, (int) (byte) 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        int int5 = isNthLastChild2.a;
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        java.lang.String str8 = isNthLastChild2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":nth-last-child(100n)" + "'", str8, ":nth-last-child(100n)");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:gt(-1)^=:matchesown(null)]", ".[:only-child!=nth-last-child]");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":matchesOwn(null)", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsData([[^nth-last-of-type]=:contains(:contains(:last-child))])", "nth-last-child");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 10, (int) '4');
        int int3 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":gt(10)", ":eq(32)");
        java.lang.String str3 = attributeWithValueStarting2.value;
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueStarting2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(32)" + "'", str3, ":eq(32)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:gt(10)^=:eq(32)]" + "'", str4, "[:gt(10)^=:eq(32)]");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#:only-child", ":contains(:containsdata(:containsown()))");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":nth-last-of-type(100n+35)");
        java.lang.String str2 = attribute1.toString();
        java.lang.Class<?> wildcardClass3 = attribute1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:nth-last-of-type(100n+35)]" + "'", str2, "[:nth-last-of-type(100n+35)]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((-1), 0);
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
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":eq(0)");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-child", "[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueContaining2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, "[nth-child*=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) '#', 0);
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
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        java.util.regex.Pattern pattern14 = attributeWithValueMatching2.pattern;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern9);
        org.junit.Assert.assertNull(pattern14);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("#:contains(nth-last-child)", ":contains(:last-child)");
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":matchesOwn(null)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str2, ":containsOwn(:matchesown(null))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str3, ":containsOwn(:matchesown(null))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str4, ":containsOwn(:matchesown(null))");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        int int11 = isLastOfType0.b;
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = isLastOfType0.calculatePosition(element12, element13);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((-1), (int) (short) 100);
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
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[.[^:gt(32)]!=hi!]");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[.[^:gt(32)]!=hi!]" + "'", str2, ".[.[^:gt(32)]!=hi!]");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(10);
        java.lang.String str2 = indexLessThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        boolean boolean5 = indexLessThan1.matches(element3, element4);
        int int6 = indexLessThan1.index;
        int int7 = indexLessThan1.index;
        indexLessThan1.index = (byte) 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(10)" + "'", str2, ":lt(10)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("", "[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:containsData(:containsown())", "[:empty^=.nth-last-child]");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:matches(null)=hi!]");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:containsOwn(:eq(52))]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-last-of-type", ":eq(1)");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.key = ":containsOwn([^hi!])";
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueContaining2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(1)" + "'", str3, ":eq(1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-last-of-type*=:eq(1)]" + "'", str4, "[nth-last-of-type*=:eq(1)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-last-of-type*=:eq(1)]" + "'", str5, "[nth-last-of-type*=:eq(1)]");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":matchesOwn(null)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str2, ":containsOwn(:matchesown(null))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:matchesown(null))" + "'", str3, ":containsOwn(:matchesown(null))");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":lt(-1)", ":nth-of-type(1n+52)");
        java.lang.String str3 = attributeWithValue2.key;
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.String str6 = attributeWithValue2.toString();
        java.lang.String str7 = attributeWithValue2.toString();
        java.lang.String str8 = attributeWithValue2.toString();
        attributeWithValue2.value = "[[nth-child!=:nth-child(97)]*=[nth-last-of-type*=:eq(1)]]";
        java.lang.Class<?> wildcardClass11 = attributeWithValue2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str4, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str5, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str6, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str7, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str8, "[:lt(-1)=:nth-of-type(1n+52)]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:containsdata(:containsdata(:gt(32)))=[:lt(100)*=:containsown()]]", "[:first-of-type!=:matchesown(null)]");
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) ' ');
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(32)" + "'", str2, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(32)" + "'", str3, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(32)" + "'", str4, ":gt(32)");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#:only-child", ":containsOwn(:only-child)");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(100)^=*]", ":contains(nth-last-child)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:lt(100)^=*]^=:contains(nth-last-child)]" + "'", str3, "[[:lt(100)^=*]^=:contains(nth-last-child)]");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-child", ":nth-child(97)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueNot2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child!=:nth-child(97)]" + "'", str3, "[nth-child!=:nth-child(97)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-of-type", ":containsData([:empty=:matches(null)])");
        java.lang.String str3 = attributeWithValueNot2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueNot2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsdata([:empty=:matches(null)])" + "'", str3, ":containsdata([:empty=:matches(null)])");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 10, (-1));
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(10n-1)" + "'", str3, ":nth-child(10n-1)");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        attributeWithValueNot2.key = ":only-child";
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) (short) 100);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":lt(52)", ".[:lt(100)^=*]");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":containsData(nth-last-child)");
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:first-of-type*=.[:only-child!=nth-last-child]]");
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 1, 1);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("", "[:eq(0)!=[nth-child!=:nth-child(97)]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-child(97)", ".nth-last-child");
        java.lang.String str3 = attributeWithValueStarting2.key;
        java.lang.String str4 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(97)" + "'", str3, ":nth-child(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97)" + "'", str4, ":nth-child(97)");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        indexGreaterThan1.index = (byte) 10;
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(10)" + "'", str6, ":gt(10)");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(0)" + "'", str4, ":gt(0)");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        java.lang.String str4 = class1.toString();
        java.lang.String str5 = class1.toString();
        java.lang.String str6 = class1.toString();
        java.lang.String str7 = class1.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = class1.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":eq(100)", ":last-of-type");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, 97);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = isNthChild2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":last-child", "[:last-child]");
        attributeWithValueStarting2.key = "";
        java.lang.String str5 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = ":matches(null)";
        java.lang.String str8 = attributeWithValueStarting2.toString();
        java.lang.String str9 = attributeWithValueStarting2.key;
        attributeWithValueStarting2.key = "";
        attributeWithValueStarting2.key = ":lt(10)";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^=[:last-child]]" + "'", str5, "[^=[:last-child]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[^=:matches(null)]" + "'", str8, "[^=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', (int) (byte) 100);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        java.lang.String str7 = allElements0.toString();
        java.lang.String str8 = allElements0.toString();
        java.lang.String str9 = allElements0.toString();
        java.lang.String str10 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(100);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(100)" + "'", str2, ":gt(100)");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":nth-child(35n+1)");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(97, 97);
        int int3 = isNthLastChild2.b;
        int int4 = isNthLastChild2.b;
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (int) '4');
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
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":nth-child(97n)");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (int) '#');
        int int3 = isNthLastOfType2.a;
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        int int5 = isNthLastOfType2.a;
        java.lang.String str6 = isNthLastOfType2.getPseudoClass();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsOwn(:first-child)");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, (int) (short) 100);
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) -1, (int) (byte) 1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(35, 35);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":nth-last-child(97n+97)");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:nth-last-child(97n+97)]" + "'", str2, "[^:nth-last-child(97n+97)]");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) 'a', (int) (short) 0);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("nth-child");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(nth-child)" + "'", str2, ":containsData(nth-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(nth-child)" + "'", str3, ":containsData(nth-child)");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 0, (int) (short) 1);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(1)" + "'", str4, ":nth-last-child(1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), 97);
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, 10);
        int int3 = isNthOfType2.a;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 10, (int) (byte) -1);
        int int3 = isNthOfType2.a;
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":only-child");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 100);
        java.lang.String str2 = indexLessThan1.toString();
        indexLessThan1.index = 10;
        indexLessThan1.index = '#';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":gt(97)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-child(97n)");
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]", ":containsData(.nth-last-child)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=:containsdata(.nth-last-child)]" + "'", str3, "[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=:containsdata(.nth-last-child)]");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("hi!", "nth-last-child");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.key;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!!=nth-last-child]" + "'", str5, "[hi!!=nth-last-child]");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(97, (int) '#');
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:lt(100)^=*]", ":contains(nth-last-child)");
        attributeWithValueStarting2.value = ":containsOwn([nth-last-of-type*=:last-child])";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueStarting2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[^:lt(-1)]");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":containsOwn(hi!)");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:containsown(hi!))" + "'", str2, ":containsData(:containsown(hi!))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(:containsown(hi!))" + "'", str3, ":containsData(:containsown(hi!))");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-child(10n-1)", "[^.]");
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("#:last-child");
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
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[[:last-child]]*=:containsData(:containsown())]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":lt(100)");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jsoup.select.Evaluator.IsOnlyOfType isOnlyOfType0 = new org.jsoup.select.Evaluator.IsOnlyOfType();
        java.lang.String str1 = isOnlyOfType0.toString();
        java.lang.String str2 = isOnlyOfType0.toString();
        java.lang.String str3 = isOnlyOfType0.toString();
        java.lang.String str4 = isOnlyOfType0.toString();
        java.lang.String str5 = isOnlyOfType0.toString();
        java.lang.String str6 = isOnlyOfType0.toString();
        java.lang.String str7 = isOnlyOfType0.toString();
        java.lang.String str8 = isOnlyOfType0.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = isOnlyOfType0.matches(element9, element10);
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
    }
}

