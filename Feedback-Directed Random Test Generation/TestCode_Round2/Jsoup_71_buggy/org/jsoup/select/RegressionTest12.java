package org.jsoup.select;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#[:last-child$=[:last-child^=[:last-child]]]", ":contains(:nth-last-of-type(100n+35))");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.key;
        attributeWithValueContaining2.value = ":containsData(#nth-last-child)";
        java.lang.String str8 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]" + "'", str3, "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]" + "'", str4, "[#[:last-child$=[:last-child^=[:last-child]]]*=:contains(:nth-last-of-type(100n+35))]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#[:last-child$=[:last-child^=[:last-child]]]" + "'", str5, "#[:last-child$=[:last-child^=[:last-child]]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[#[:last-child$=[:last-child^=[:last-child]]]*=:containsData(#nth-last-child)]" + "'", str8, "[#[:last-child$=[:last-child^=[:last-child]]]*=:containsData(#nth-last-child)]");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
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
        java.lang.String str16 = matches1.toString();
        java.lang.String str17 = matches1.toString();
        java.lang.String str18 = matches1.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":matches(null)" + "'", str16, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":matches(null)" + "'", str17, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":matches(null)" + "'", str18, ":matches(null)");
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:last-child^=[:last-child]]", "[:only-child!=nth-last-child]");
        attributeWithValueStarting2.key = ":nth-last-child(100n+10)";
        attributeWithValueStarting2.value = ".:gt(32)";
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-of-type", "[:last-child^=[:last-child]]");
        attributeWithValueNot2.value = ":containsData(.nth-last-child)";
        java.lang.String str5 = attributeWithValueNot2.key;
        attributeWithValueNot2.key = "[:first-child=[nth-last-of-type*=:last-child]]";
        java.lang.String str8 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[:first-child=[nth-last-of-type*=:last-child]]!=:containsData(.nth-last-child)]" + "'", str8, "[[:first-child=[nth-last-of-type*=:last-child]]!=:containsData(.nth-last-child)]");
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) '4', (int) '4');
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 100, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
        java.lang.String str6 = isNthChild2.getPseudoClass();
        int int7 = isNthChild2.a;
        java.lang.String str8 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = isNthChild2.calculatePosition(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-child" + "'", str8, "nth-child");
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[^[:lt(100)^=*]]");
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
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
        java.lang.String str13 = isOnlyChild0.toString();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = isOnlyChild0.matches(element14, element15);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":only-child" + "'", str13, ":only-child");
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 1, (int) (byte) 100);
        int int3 = isNthChild2.b;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-last-of-type(10n+100)", ".#[:nth-child(97)^=.nth-last-child]");
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-of-type(100n+35)", pattern1);
        attributeWithValueMatching2.key = ":contains([:gt(-1)])";
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) -1, 97);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(52, 97);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[nth-last-of-type*=[[:containsOwn(:eq(52))]]]", "[:only-child^=:matchesown(null)]");
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]^=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", "[#nth-last-child]");
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-last-child(10)");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-last-child(10)" + "'", str2, ":nth-last-child(10)");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) -1, 35);
        int int3 = isNthOfType2.b;
        int int4 = isNthOfType2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":only-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        attributeWithValueMatching2.key = "[[:matches(null)$=.nth-last-child]^=[[:nth-child(97)^=.nth-last-child]^=[:empty=:matches(null)]]]";
        attributeWithValueMatching2.key = "";
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:last-of-type]$=:last-of-type]", "[:lt(-1)=:nth-of-type(1n+52)]");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.key;
        java.lang.String str6 = attributeWithValue2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-of-type]$=:last-of-type]=[:lt(-1)=:nth-of-type(1n+52)]]" + "'", str3, "[[[:last-of-type]$=:last-of-type]=[:lt(-1)=:nth-of-type(1n+52)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[:last-of-type]$=:last-of-type]=[:lt(-1)=:nth-of-type(1n+52)]]" + "'", str4, "[[[:last-of-type]$=:last-of-type]=[:lt(-1)=:nth-of-type(1n+52)]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-of-type]$=:last-of-type]" + "'", str5, "[[:last-of-type]$=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[:lt(-1)=:nth-of-type(1n+52)]" + "'", str6, "[:lt(-1)=:nth-of-type(1n+52)]");
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":lt(1)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(1)" + "'", str3, ":lt(1)");
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-child(100n+10)", pattern1);
        attributeWithValueMatching2.key = "[:nth-of-type(1n+52)$=:containsdata()]";
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":nth-child(1n+97)";
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:nth-of-type(1n+52)$=:containsdata()]" + "'", str5, "[:nth-of-type(1n+52)$=:containsdata()]");
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("nth-last-of-type");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":gt(97)");
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
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsOwn([[[:last-child]=:matches(null)]*=nth-last-child])");
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":contains([[^=:first-child]*=hi!])");
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-last-of-type(32)");
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn(hi!)", ":containsOwn([^:gt(32)])");
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
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 100);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-child(97)", ".nth-last-child");
        java.lang.String str3 = attributeWithValueStarting2.key;
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(97)" + "'", str3, ":nth-child(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-child(97)^=.nth-last-child]" + "'", str4, "[:nth-child(97)^=.nth-last-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-child(97)" + "'", str5, ":nth-child(97)");
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        int int3 = isFirstOfType0.a;
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        int int8 = isFirstOfType0.a;
        int int9 = isFirstOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:matches(null)", ":containsOwn(.nth-last-child)");
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[:nth-child(97)]*=:containsOwn([[:last-child]])]");
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.lang.String str8 = attributeWithValueMatching2.key;
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) ' ');
        indexLessThan1.index = 97;
        java.lang.String str4 = indexLessThan1.toString();
        indexLessThan1.index = 52;
        java.lang.String str7 = indexLessThan1.toString();
        java.lang.String str8 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(97)" + "'", str4, ":lt(97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(52)" + "'", str7, ":lt(52)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(52)" + "'", str8, ":lt(52)");
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[[[:last-child]$=:last-of-type]]");
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[nth-last-child^=:matchesown(null)]=[.#hi!*=[:last-child$=[:last-child^=[:last-child]]]]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("#.#[:nth-child(97)^=.nth-last-child]", "[:first-child$=:lt(-1)]");
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
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.lang.String str5 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":nth-child(100n+97)";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
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
        java.lang.String str12 = isLastOfType0.getPseudoClass();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = isLastOfType0.matches(element13, element14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nth-last-of-type" + "'", str12, "nth-last-of-type");
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#:nth-of-type(35n+35)");
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(:contains(:last-child))", "[:last-child^=[:last-child]]");
        attributeWithValue2.value = "[[:lt(100)*=:containsown()]^=.:containsdata(nth-last-child)]";
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
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[^=:first-child]*=hi!]", "[:only-child*=:containsdata(nth-last-child)]");
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
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[[:last-of-type]$=:contains(nth-child)]");
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
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("#:last-child");
        java.lang.String str2 = attributeStarting1.toString();
        java.lang.String str3 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^#:last-child]" + "'", str2, "[^#:last-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^#:last-child]" + "'", str3, "[^#:last-child]");
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:contains(nth-last-child)!=[^:gt(32)]]", "[^[:first-of-type*=.[:only-child!=nth-last-child]]]");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":root" + "'", str7, ":root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":root" + "'", str15, ":root");
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
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
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[#$=[:nth-last-of-type(100n+35)]]", ":containsData()");
        java.lang.String str3 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#$=[:nth-last-of-type(100n+35)]]" + "'", str3, "[#$=[:nth-last-of-type(100n+35)]]");
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":first-of-type", ":contains(nth-last-child)");
        attributeWithValueContaining2.value = ":containsData([:root^=[^=[:last-child]]])";
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:last-of-type]$=:last-of-type]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([[:last-of-type]$=:last-of-type])" + "'", str2, ":containsOwn([[:last-of-type]$=:last-of-type])");
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(35, (int) (short) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[nth-last-of-type*=:eq(1)]$=:containsOwn(:eq(52))]", "[:first-of-type*=.[:only-child!=nth-last-child]]");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[nth-last-of-type*=:eq(1)]$=:containsown(:eq(52))]=[:first-of-type*=.[:only-child!=nth-last-child]]]" + "'", str3, "[[[nth-last-of-type*=:eq(1)]$=:containsown(:eq(52))]=[:first-of-type*=.[:only-child!=nth-last-child]]]");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
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
        int int12 = indexLessThan1.index;
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = indexLessThan1.matches(element13, element14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(100)" + "'", str6, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(97, (-1));
        int int3 = isNthOfType2.b;
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        int int5 = isNthOfType2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 100, (int) (byte) 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        int int4 = isNthOfType2.a;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":lt(97)");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#:lt(97)" + "'", str2, "#:lt(97)");
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        int int4 = indexGreaterThan1.index;
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(0)" + "'", str5, ":gt(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(0)" + "'", str6, ":gt(0)");
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
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
        java.lang.String str11 = isEmpty0.toString();
        java.lang.String str12 = isEmpty0.toString();
        java.lang.String str13 = isEmpty0.toString();
        java.lang.String str14 = isEmpty0.toString();
        java.lang.String str15 = isEmpty0.toString();
        java.lang.String str16 = isEmpty0.toString();
        java.lang.String str17 = isEmpty0.toString();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = isEmpty0.matches(element18, element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":empty" + "'", str11, ":empty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":empty" + "'", str12, ":empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":empty" + "'", str13, ":empty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":empty" + "'", str14, ":empty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":empty" + "'", str15, ":empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":empty" + "'", str16, ":empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":empty" + "'", str17, ":empty");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[:nth-child(97)^=.nth-last-child]=:only-of-type]");
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
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
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":gt(-1)", ".[.nth-last-child$=[:last-child^=[:last-child]]]");
        java.lang.String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)=.[.nth-last-child$=[:last-child^=[:last-child]]]]" + "'", str3, "[:gt(-1)=.[.nth-last-child$=[:last-child^=[:last-child]]]]");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[[:last-child]]^=:eq(1)]");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]", "[nth-child!=:nth-child(97)]");
        java.lang.String str3 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]" + "'", str3, ".[[:nth-last-of-type(97n-1)]=[[:lt(100)^=*]=[nth-last-of-type*=:last-child]]]");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:gt(-1)!=[:only-child*=:containsdata(nth-last-child)]]");
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":nth-of-type(-1n+97)");
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) -1, 35);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("nth-last-child");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        java.lang.String str4 = containsText1.toString();
        java.lang.String str5 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(nth-last-child)" + "'", str2, ":contains(nth-last-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(nth-last-child)" + "'", str3, ":contains(nth-last-child)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":contains(nth-last-child)" + "'", str4, ":contains(nth-last-child)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":contains(nth-last-child)" + "'", str5, ":contains(nth-last-child)");
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":containsOwn([^:gt(32)])");
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
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
        int int15 = indexLessThan1.index;
        int int16 = indexLessThan1.index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(100)" + "'", str6, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":last-of-type", "[:gt(-1)]");
        attributeWithValueEnding2.key = "";
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":root", "[^=[:last-child]]");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:root^=[^=[:last-child]]]" + "'", str3, "[:root^=[^=[:last-child]]]");
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[*=:last-child]=:contains(nth-child)]");
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-of-type(32n+32)");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":matches(null)", "hi!");
        java.lang.String str3 = attributeWithValue2.key;
        attributeWithValue2.key = "[:empty=:matches(null)]";
        attributeWithValue2.value = ".:gt(-1)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 10, 10);
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
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(97);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(97)" + "'", str8, ":lt(97)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:containsData(nth-last-child)", "[:lt(100)*=:containsown()]");
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
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        int int4 = isLastOfType0.a;
        java.lang.String str5 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) -1, 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.b;
        java.lang.String str5 = isNthLastChild2.toString();
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        java.lang.String str8 = isNthLastChild2.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = isNthLastChild2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(-1n)" + "'", str5, ":nth-last-child(-1n)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":nth-last-child(-1n)" + "'", str8, ":nth-last-child(-1n)");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:lt(0)!=:containsdata(nth-last-child)]");
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("*", "[^nth-last-child]");
        java.lang.String str3 = attributeWithValueNot2.value;
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^nth-last-child]" + "'", str3, "[^nth-last-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*" + "'", str4, "*");
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":lt(52)", "[:last-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:lt(52)$=[:last-of-type]]" + "'", str3, "[:lt(52)$=[:last-of-type]]");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[.nth-last-child$=[:last-child^=[:last-child]]]");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[.nth-last-child$=[:last-child^=[:last-child]]]" + "'", str2, "#[.nth-last-child$=[:last-child^=[:last-child]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[.nth-last-child$=[:last-child^=[:last-child]]]" + "'", str3, "#[.nth-last-child$=[:last-child^=[:last-child]]]");
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
    }
}

