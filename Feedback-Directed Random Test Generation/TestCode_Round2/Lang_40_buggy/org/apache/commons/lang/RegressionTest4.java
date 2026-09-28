package org.apache.commons.lang;

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                          ", "                                                                                                 HI!", (int) (short) 100);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray6, "aaaaaaaaaa                                                                                                          ...");
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray6);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEach(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ", strArray2, strArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.startsWithAny(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  " + "'", str10, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "A   HI!    hi!A   HI!    hi!A   HI!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "A   HI!    ", (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                   ", "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                                                  ", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        int int1 = org.apache.commons.lang.StringUtils.length("IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 970 + "'", int1 == 970);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator(" ", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 90);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " " });
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, '#', 48, 25);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("...       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "       " });
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.." + "'", str2, "                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah", "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                   ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                   " });
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        char[] charArray11 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("", charArray11);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray11);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("", charArray11);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    aaaaaaaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("       hi!", charArray11);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsNone("       ...", charArray11);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAnyBut("               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str2, "###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                hi!                                                 ", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA       HI!#########################       HI!###################################################IHH", "###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaa################################ihh", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("A...", "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                                   ", "hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 280 + "'", int2 == 280);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("hi!                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                      ..." + "'", str1, "hi!                      ...");
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        int int1 = org.apache.commons.lang.StringUtils.length("444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("##########                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                                                                          " + "'", str1, "##########                                                                                          ");
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    " + "'", str3, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                        HI!                         ", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("Hi!hi!hi!h                                                                                    ...", "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("          ", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str1, "###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("", "       HI!", "hI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("       ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("444444444", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "aaa", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444" + "'", str4, "444444444");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("hI", "A##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("    ...aaaaaaaaaaaaaa##########################...", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ...aaaaaaaaaaaaaa##########################..." + "'", str2, "    ...aaaaaaaaaaaaaa##########################...");
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("A##################################", "A##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("    ...aaaaaaaaaaaaaa################################IHh", "", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    ...aaaaaaaaaaaaaa################################IHh" + "'", str4, "    ...aaaaaaaaaaaaaa################################IHh");
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("                       ...", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("hi!                      ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("                                               ...", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               ..." + "'", str2, "                                               ...");
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("444444444444444444444444444444444444444444444444                                                  ", "##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("##########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##########" });
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("hi!                      ...h", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         hi!                      ...h" + "'", str2, "                                         hi!                      ...h");
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("i!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!" + "'", str1, "i!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!");
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("                                                          aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("               HI               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.." + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("hi!aaaaaaaaaaaaaaaaaaaaaaaa", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hi!aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaa                                                                                          ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                                                                                          " + "'", str2, "aaaaaaaaaa                                                                                          ");
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("", "i!                      ...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("#", "A", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("Hi!hi!hi!h                                                                                    ...", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!h                                                                                    ..." + "'", str2, "Hi!hi!hi!h                                                                                    ...");
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaa                                                                                                          ...", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        int int1 = org.apache.commons.lang.StringUtils.length("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                 hi!", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                 hi!" });
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str1, "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("i!                      ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                      .." + "'", str1, "i!                      ..");
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                       ...", "!HI!HI!H  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa..." + "'", str3, "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("", "                                                                                              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("i!                      ...", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!                      ..." + "'", str3, "i!                      ...");
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAA...", 43, "aaaaaaaaaaaaaa################################IHh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAA...aaaaaaaaaaaaaa###" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAA...aaaaaaaaaaaaaa###");
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("#########", "###################################################", 94, 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "############################################################" + "'", str4, "############################################################");
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("A   HI!    hi!A   HI!    hi!A   HI!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("hI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI" + "'", str1, "hI");
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                           ", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 280);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                           " });
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa", "                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str2, "aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("444444444", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444" + "'", str2, "444444444");
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("       hi!                      ...hihi!                      ...!", "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                    ", "                                                HI!                                                 ", 970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###", "444444444444444444444444444444444444444444444444                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###");
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                                                                                    ", "", "!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah", "                                               ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                                   ", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("hi!aaaaaaaaaaaaaaaaaaaaaaaa", 'a', 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   HI!    ", "####################################################", (-1));
        int int5 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("   hi!    ", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   HI!    " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.repeat("   HI!   ", "    ...aaaaaaaaaaaaaa##########################...", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   " + "'", str3, "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   ");
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                                       aaaaaaaaaa", "                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str1, "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        char[] charArray9 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("", charArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray9);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray9);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa..." + "'", str2, "aaaaaaa...");
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("444444444444444444444444444444444444444444444444                                                  ", "                                                 ..", "###################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444##################################################" + "'", str3, "444444444444444444444444444444444444444444444444##################################################");
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("       hi!                      ...hihi!                      ...!", 94, "                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     hi!                      ...hihi!                      ...!              " + "'", str3, "                     hi!                      ...hihi!                      ...!              ");
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !", "A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("               HI               ", 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               HI               " + "'", str3, "               HI               ");
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI");
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("hI!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("Hi!                      aaah", "    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("i!                      ..", "###########       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "                                                HI!                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " + "'", str2, "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("          ", "                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("                                                                                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                    ..." + "'", str1, "                                                                                    ...");
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI", "444444444444444444444444444444444444444444444444                                                  ", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("hi!                      ...", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaaaaa...", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa..." + "'", str2, "aaaaaaa...");
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("                                                           ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                           " + "'", str2, "                                                           ");
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ", 7, "       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH " + "'", str3, "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ");
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("", "                                                                                       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "i!                    hi!                      ...h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                    hi!                      ...h" + "'", str2, "i!                    hi!                      ...h");
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("...aaaaaaaaaaaaaa################################IHh", "aaaaaaaaaa                                                                                                          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        int int3 = org.apache.commons.lang.StringUtils.indexOf(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("      ", "...aaaaaaa", "...aaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaaaaaa################################ihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("", "                                                                                              ...", 970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                 ..", 32, "A   HI!    hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 .." + "'", str3, "                                                 ..");
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa" });
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################" + "'", str2, "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################");
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa" + "'", str2, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa");
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.split("hi!", '4');
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "   HI!    ", 0, (int) (byte) 1);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String[] strArray15 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                   ", "                                                    ");
        java.lang.String str16 = org.apache.commons.lang.StringUtils.replaceEach("                                                    ", strArray7, strArray15);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.replaceEach("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray2, strArray15);
        java.lang.String str19 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "                                                   " });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                    " + "'", str16, "                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str17, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("       HI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("444444444444444444444444444444444444444444444444", "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA." + "'", str2, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("                       ...", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   ..." + "'", str2, "                                                                   ...");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "444444444444444444444444444444444444444444444444                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("   HI!    ", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("aaa", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "HI!", "", "", "", "" });
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("   hi!    ", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi!                      aaa", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "aaaaaaaaaaaaaa################################ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("                                                              ", "    ...aaaaaaaaaaaaaa##########################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("         ", '4');
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "       HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         " + "'", str4, "         ");
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                                              ", "   hi!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("hI", 7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("    ...aaaaaaaaaaaaaa##########################...", "AAAAAAAAAAAAAAAAAAAAAAA...aaaaaaaaaaaaaa###", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("          ", 62, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ####################################################" + "'", str3, "          ####################################################");
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("##########", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("#########################################################################################", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 62);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   ", "hi", "!" });
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("                                                                                              ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaaaaaa################################IHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("       hi!#########################", "...                                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!#########################" + "'", str2, "       hi!#########################");
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("Hi!                      aaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray2 = null;
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceEach("                                                                                       ...", strArray1, strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       ..." + "'", str3, "                                                                                       ...");
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                                                           aaaaaaaaa", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                           aaaaaaaaa" + "'", str2, "                                                           aaaaaaaaa");
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("####################################################", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     ####################################################     " + "'", str2, "     ####################################################     ");
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaa", "IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIII", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa" + "'", str3, "aaa");
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   ", 84, "          ####################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######" + "'", str3, "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######");
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi", "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!", "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444", "!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 26, "aaaaaaaaaaaaaa################################ihh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                                                                                       ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       ..." + "'", str2, "                                                                                       ...");
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("                                         hi!                      ...h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("                                                                                                                                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "                                       aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("HI", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("                             ", "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             " + "'", str2, "                             ");
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                 ..", "          ", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         .." });
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaa ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa ");
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                 ..", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...", 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!                      ...h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", ' ', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################" + "'", str1, "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################");
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("   HI!   ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!", "...hihi!", "...!" });
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi", 97, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi");
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                    " + "'", str1, "                                                                                    ");
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "                                                                                                    ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "################################IHh");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", 0, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str3, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" });
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("A   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa", '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", "                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh", "       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("                                                 ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("Hi!                      ...h", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      ...h" + "'", str2, "                      ...h");
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("###################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("             a4444444444444444444444444444444444              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4444444444444444444444444444444444" + "'", str1, "a4444444444444444444444444444444444");
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("A...", 50, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "A   HI!    hi!", (int) (short) 0);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                    ", "                                                   ", (int) (short) 10);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                                                                 HI!", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "                                           " });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                        HI!                         ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                        ", "HI", "!", "                         " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ", 52, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               " + "'", str3, "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ");
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                    aaaaaaaaaa", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                    aaaaaaaaaa" });
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          ####################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi");
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                                                           aaaaaaaaaa", 62, "i!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                           aaaaaaaaaa" + "'", str3, "                                                           aaaaaaaaaa");
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str2, "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByCharacterType("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strArray3, strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("    ...", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       ", "hi", "!", "aaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str5, "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", "", "HI!", "", "", "", "" });
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("i!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!..." + "'", str1, "i!...");
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "i!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("Hi!                      aaah", "!ih    !IH   A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("...       ", "       hi!                      ...hihi!                      ...!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!HHHHHHH" + "'", str3, "!!!HHHHHHH");
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "                        HI!                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!", '4');
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                    ...", "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 50);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEach("a4444444444444444444444444444444444", strArray4, strArray8);
        int int10 = org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "                                                                                    ..." });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a4444444444444444444444444444444444" + "'", str9, "a4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa", "aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa" + "'", str1, "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!", "aaaaaaaaaa", (int) (short) 1);
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray5, strArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaa                                                                                                          ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaa################################ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 62, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByCharacterType("    ...");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray3);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    ", "..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi");
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("                         !IH                        ", "                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("     ####################################################     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" });
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 32);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "hi", 32, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " + "'", str2, "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("!aaaaaaaaaaaaaaaaaaaaaaaaa", (-1), "!ih    !IH   A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh", "       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh");
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                   ", "                                                    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEach("hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "A", "HI!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                   " });
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("...                                             ...", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        " + "'", str3, "hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ");
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "#");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        int int2 = org.apache.commons.lang.StringUtils.indexOf(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", "       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        char[] charArray6 = new char[] { 'a', 'a', '4' };
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray6);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsAny("                                                                                       ...", charArray6);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("   HI!   ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    " + "'", str2, "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("Hi!                      aaah", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("!aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa ", "i!                      ..", 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("Hi!hi!hi!h                                                                                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!h                                                                                    ..." + "'", str1, "Hi!hi!hi!h                                                                                    ...");
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        H" + "'", str2, "        H");
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaa ", "!IH!IH!IH!                                                                                    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                    aaaaaaaaaa", 94, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################                                                    aaaaaaaaaa################" + "'", str3, "################                                                    aaaaaaaaaa################");
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                    ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                                                         ", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("                                                HI!                                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "                         !IH                        ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" });
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("...", 42, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str2, "aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("                                                HI!                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("aaaaaaaaaa                                                                                       ", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                                                                                       " + "'", str2, "aaaaaaaaaa                                                                                       ");
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("HI!", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 265);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI" });
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", 43);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a', 48, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("A   HI!    ", "##########", "                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   HI!    " + "'", str3, "A   HI!    ");
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("                                                   ", "aaaaaaaaaaaaaa################################ih", "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("HA...", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 99, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("################                                                    aaaaaaaaaa################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################                                                    aaaaaaaaaa################" + "'", str1, "################                                                    aaaaaaaaaa################");
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("       hi!                      ...hihi!                      ...!", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                         ", "                                                           aaaaaaaaaa", 62);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         " });
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("", 88, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("       hi!#########################       hi!###################################################IHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("                                                           aaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("", "       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("                                                                                                                                     ...", "hi!                      aaa", "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 128);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                     ..." + "'", str4, "                                                                                                                                     ...");
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                                                                                    ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    " + "'", str2, "                                                                                    ");
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##########", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", 314, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str3, "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("hi!", '4');
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "   HI!    ", 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', 265, 314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 265 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("444444444", "       hi!                      ...hihi!                      ...!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("", "aaaaaaaaaa                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("                                                 ...", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa", "AAAAAAAAAAAAAAAAAAAAAAA...aaaaaaaaaaaaaa###");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!                      ...", 29, "       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                      ... " + "'", str3, "hi!                      ... ");
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                    aaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.replaceEach("    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                    ", "aaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("hi!                      ...h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!", "...h" });
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", "", "HI!", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...HI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!..." + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...HI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "", 280);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" });
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("hi!aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "Hi!hi!hi!h                                                                                    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, "                                                                                                   ", (int) (short) 10, 88);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("   HI!    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ###", "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 330 + "'", int2 == 330);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 52, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...IH!I..." + "'", str3, "...IH!I...");
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("       hi!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!" + "'", str3, "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!");
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("a", '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("aaaaaaaaaaaaaa################################ihh", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 97, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    " + "'", str3, "#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        char[] charArray8 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("", charArray8);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("                                                    ", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("                                                                                    ...", "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    ..." + "'", str2, "                                                                                    ...");
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "                                               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 " + "'", str1, "                                                 ");
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!", 'a');
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("       hi!#########################       hi!###################################################IHh", "aaaaaaaaaa                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                                      " + "'", str2, "aaaaaaaaaa                                      ");
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", "                                                    aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 62);
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("                                                              ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("##########                                                                                          ", "      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("      ", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("HI!", strArray4, strArray7);
        int int9 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray7);
        java.lang.Class<?> wildcardClass10 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("hi!", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   ", "          ####################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                   " });
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        char[] charArray11 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("", charArray11);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray11);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("   hi!    ", charArray11);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", charArray11);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsOnly("                                                 ...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        java.lang.String[] strArray0 = null;
        int int1 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("A   HI!    ", 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                        hi!                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("   hi!    ", "       hi!#########################", 10);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ###", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "", "", "", " " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "                                                    aaaaaaaaaa");
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                        hi!                         ", strArray2);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 70, 49);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################", "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", "#########", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                                              ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!", "                                                 ", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!" + "'", str3, "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!");
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        int int1 = org.apache.commons.lang.StringUtils.length("                                                          aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 68 + "'", int1 == 68);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 3, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" });
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                                           aaaaaaaaaa", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("A##################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!", "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "################                                                    aaaaaaaaaa################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str2, "                                                                                                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                                                  ", "                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAA...aaaaaaaaaaaaaa###", "444444444444                       ...444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("                        hi!                         ", "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hi!                         " + "'", str2, "                        hi!                         ");
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!", "HI!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 26, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ..." + "'", str1, "       ...");
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("################################IHh", "####################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "HA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", "hi!", 49);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA." });
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                              " + "'", str1, "                                                              ");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!                      aaa", "         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ..." + "'", str2, "       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...");
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh", "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaa################################IHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaa################################IHh" + "'", str1, "aaaaaaaaaaaaaa################################IHh");
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                               ...", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               ..." + "'", str3, "                                               ...");
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("       ...", (int) 'a', 280);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("####################################################", "aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("    ...aaaaaaaaaaaaaa##########################...", "!HI!HI!H  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ...aaaaaaaaaaaaaa##########################..." + "'", str2, "    ...aaaaaaaaaaaaaa##########################...");
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                                                                                                    ", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa");
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("#", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("###################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("...aaaaaaaaaaaaaa################################IHh", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                                   ", "                      ...h", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                   " });
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "                                                          aaaaaaaaaa", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                          ", "                                                                                                 HI!", (int) (short) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "aaaaaaaaaa                                                                                                          ...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                 hi!", (int) (short) -1, 314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 91");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444444444444444444444444444", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("!!!HHHHHHH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", (int) (short) 100, 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaa                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaa                                                                                                          ...", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "HI!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("i!                      ...", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                i!                      ..." + "'", str2, "                i!                      ...");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 0, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str3, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("        H", 51, "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!#########################       hi!####        H" + "'", str3, "hi!#########################       hi!####        H");
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("", "                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                     ...", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                    ..." + "'", str2, "                                                                                                                                    ...");
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!" + "'", str2, "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!");
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("                                         hi!                      ...h", "                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         hi!                      ...h" + "'", str2, "                                         hi!                      ...h");
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("", "                                                   ", (int) (byte) 1, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                   " + "'", str4, "                                                   ");
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("i!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", "                                                          aaaaaaaaaa                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################" + "'", str3, "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################");
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        int int1 = org.apache.commons.lang.StringUtils.length("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("...                                             ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "                                                                                                                                    ...", 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("HA...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######" + "'", str2, "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######");
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                      aaah", "..", 88);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                      aaah" });
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                        hi!                         ", "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("A   HI!    ", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A   HI!    " + "'", str2, "    A   HI!    ");
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                           aaaaaaaaaa", '#', 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("################################IHh", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                                                          aaaaaaaaaa", "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaa ", "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaa################################ihh", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa################################ihh" + "'", str2, "aaaaaaaaaaaaaa################################ihh");
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIII", "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIIIIIIIIIIHI!IIIIIIIIII");
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                 HI!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I    " + "'", str2, "    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I    ");
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("A   HI!    hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   HI!    hi!" + "'", str2, "A   HI!    hi!");
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("hi!aaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hi!aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("A##################################", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("    ...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ..." + "'", str2, "    ...");
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaaaaa", "                                       aaaaaaaaaa", 62);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("!IH!IH!IH!                                                                                    ...", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                   ", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("...       ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                                                                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("!!!HHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                     ...", 96, "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                     ..." + "'", str3, "                                                                                                                                     ...");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("!!!HHHHHHH", "        H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

