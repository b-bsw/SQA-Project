package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("", "!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray1, "                      hI!                      AAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah", "       HI!#       HI!#       HI!#       HI!#       HI!#       HI!#       HI!#HaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i", "h" });
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                                                                                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                              ...", 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("aaaaaaa...aaaaaaaa...aaaaaaaa..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ", "   HI!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa...aaaaaaaa...aaaaaaaa..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    " + "'", str2, "aaaaaaa...aaaaaaaa...aaaaaaaa..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("....                                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH");
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#', 280, 423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 280 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str4, "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str5, "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI           ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH", "4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44!!!HHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH");
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                 ", "                                                                                                                                                                                                                                                                                                                                                             ################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                            ################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                            ################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("Aaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IH" + "'", str1, "aAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IH");
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("       HI!");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        char[] charArray9 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("", charArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaa                                                                                                          ...", charArray9);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("       hi!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "hi!                      ...");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "       ", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi!                      ...hihi!                      ...!" + "'", str3, "       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi", "!" });
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                                                    ", "AAAAAAAAAAAAAAAAAAAAAAAA!HI!HI!HI!HI!HI!HI", "hI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    " + "'", str3, "                                                                                    ");
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        char[] charArray14 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("", charArray14);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray14);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsNone("", charArray14);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    aaaaaaaaaa", charArray14);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray14);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsAny("       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...", charArray14);
        int int21 = org.apache.commons.lang.StringUtils.indexOfAny("hI!", charArray14);
        int int22 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", charArray14);
        int int23 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444#", charArray14);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsOnly("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 72 + "'", int22 == 72);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 82 + "'", int23 == 82);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("!IH ...", "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH ..." + "'", str2, "!IH ...");
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h..." + "'", str2, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("HI!HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H." + "'", str1, "HI!HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H.");
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 7, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       " + "'", str1, "...       ");
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("hi!                      aaah", "hhhhhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "hi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaahi################################aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###", "##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", 23, 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aA##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###" + "'", str4, "aA##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###");
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 0, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!IH!IH!IH!IH!..." + "'", str3, "H!IH!IH!IH!IH!...");
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!                      aaa", 'a', 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut(" aaah", "444HI!444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("a4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4444444444444444444444444444444444" + "'", str1, "a4444444444444444444444444444444444");
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44!!!HHHHHHH", "   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!", "                    i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i!                 i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaa                                                                                       ", 62, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...          ..." + "'", str3, "...          ...");
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("hi !#########################", "aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("HI!", ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.split("                        hi!                         ", '4');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                        hi!                         " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                        hi!                         " + "'", str8, "                        hi!                         ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                           hi!                             aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           hi!                         " + "'", str9, "                           hi!                             aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           hi!                         ");
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("################################IH", "       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH###################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ###", "                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("I", "Hi!aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("#######...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("   A   HI!       A   HI!       A   HI!       A   HI!       A   HI!       A   HI!       A   HI!    hi!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!#", "hi!#", "hi!#", "hi!#", "hi!#", "hi!#", "hi!#hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("###################################################################################################", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################################################################" + "'", str2, "###################################################################################################");
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI" });
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...aaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444A...4444...4444444444444444444444444444A" + "'", str3, "4444444444444444444444444444A...4444...4444444444444444444444444444A");
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!                      ... ", 107, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                      ... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hi!                      ... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("hi!###################                                                 ...hi!###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!###################                                                 ...hi!##################" + "'", str1, "hi!###################                                                 ...hi!##################");
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("...aaaaaaa", "A   HI!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 ", "#");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 " + "'", str6, "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 " + "'", str7, "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 ");
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                                             hi!", "                                                                                                                                                                     !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             hi!" + "'", str2, "                                                                             hi!");
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi", "                                    hi    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("i!...", "                                                                                                         HI!a                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!..." + "'", str2, "i!...");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("a...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 441, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 372, 276);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "#########################!ih       #########################!ih       #haaAAAAAAAAAAAAAAAAAAAAAAaaa#########################!ih       #########################!ih       ##", "       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                          " + "'", str3, "                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                                                                    i ...", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                       i ..." + "'", str2, "                                                                                                                                                                                                       i ...");
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("444444444444444444444444444                         !IH                        4444444444444444444444444444", "#################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444                         !IH                        4444444444444444444444444444" + "'", str2, "444444444444444444444444444                         !IH                        4444444444444444444444444444");
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("i!                    hi!                      ...h", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ##", "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        char[] charArray14 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("", charArray14);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray14);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsNone("                                                    ", charArray14);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsOnly("                                                   ", charArray14);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsOnly(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ", charArray14);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsNone("HA...", charArray14);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsOnly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", charArray14);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsAny("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", charArray14);
        int int23 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", charArray14);
        int int24 = org.apache.commons.lang.StringUtils.indexOfAnyBut("############################################################################################IH", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 92 + "'", int24 == 92);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hI", "                                                                   ", 20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI" });
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("444HI!4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444hi!4444" + "'", str1, "444hi!4444");
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("IHH", "...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...", 50);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IHH" });
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("HI!", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("hI!#################################################", "###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", "");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray4);
        boolean boolean6 = org.apache.commons.lang.StringUtils.startsWithAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!    ", "Hi!hi!hi!h                                                                                    ...");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                    ", "HI!");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "hi!");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, '4', (int) (byte) 100, (int) (byte) -1);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", 99, 17);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEach("                         !IH                        ", strArray4, strArray7);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAny("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   hi!    " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                    " + "'", str9, "                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                         !IH                        " + "'", str18, "                         !IH                        ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa ", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa ");
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  !!!HHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("                                          ", "!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("################################IHH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", 195, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str4, "#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("##########", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...", 3, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa..." + "'", str3, "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("I!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaaaaa...hi!#########################       hi!", "A   HI!    HI!A   HI!    HI!A   HI!    HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaa...hi", "#########################", "hi" });
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("################################IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################ih" + "'", str1, "################################ih");
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("!ih4444444444444444444444444444444444444444444444444444444444444444444444444444444444444A               h444                      !ih                                         h444                      !ih                                         h444                      !ih                                         ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih4444444444444444444444444444444444444444444444444444444444444444444444444444444444444A               h444                      !ih                                         h444                      !ih                                         h444                      !ih                                         " + "'", str2, "!ih4444444444444444444444444444444444444444444444444444444444444444444444444444444444444A               h444                      !ih                                         h444                      !ih                                         h444                      !ih                                         ");
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                              aaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaa" });
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!                      aaah", "Aaaaaaaaaaaaaaaa          Aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("#####       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaa", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#####", "       ", "hi", "!#########################", "       ", "hi", "!#########################", "       ", "hi", "!#########################", "       ", "hi", "!#########################", "       ", "hi", "!#########################", "       ", "hi", "!#########################", "       ", "hi", "!#########################" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaa" + "'", str6, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaa");
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                    ...", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#', 42, 25);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                    ..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                      HI!                            ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   hi!        ", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "i!...", 280);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                                aaaaaaaaaa", 372);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                     aaaaaaaaaa                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                     aaaaaaaaaa                                                                                                                                                                     ");
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!H", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("####################!ih       #########################!ih       #########################!ih ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!i!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!i!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih" + "'", str2, "!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!i!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih");
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hi!                      ... ");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a', 62, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("   hi!a                                                                                                                                                                                                                                                                                                                                                                               a...a                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   HI!A                                                                                                                                                                                                                                                                                                                                                                               A...A                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "   HI!A                                                                                                                                                                                                                                                                                                                                                                               A...A                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "hi!                      ...h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH");
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444   hi!       ...AAAAAAAAAAAAAA##########################...   hi!   444444444444", "Hi!                      ...h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!...aaaaaaaaaaa", 94, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!...aaaaaaaaaaa" + "'", str3, "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!...aaaaaaaaaaa");
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("       hi!#########################       hi!###################################################IHh                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("          HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######        ", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######        " + "'", str3, "          HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######        ");
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!i!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih", 57, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih    !IH   A!ih    !IH   A!ih  " + "'", str3, "ih    !IH   A!ih    !IH   A!ih  ");
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("                                         hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str1, "hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28, 441);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                                                                   ...", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       ..." + "'", str2, "                       ...");
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444hi!                      ...h", "HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI                                                   ", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI                                                   " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI                                                   ");
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 342, "                                                 hi!                      ...h                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 hi!                      ...h                                                      !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                 hi!                      ...h                                                      " + "'", str3, "                                                 hi!                      ...h                                                      !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                 hi!                      ...h                                                      ");
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                 HI!", strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ', 280, 84);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.split("                         ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hhhhhi!", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "                         " });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhhi!" + "'", str15, "hhhhhi!");
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("Aaaaaaaaaaaaaaaa          Aaaaaaaaaaaaaaaaa", "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("AHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("                                                                                                                                                                                                                                                                                                      ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("hi!                 hi!                 hi!", 0, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!     " + "'", str3, "hi!     ");
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                          ", "                                                                                                 HI!", (int) (short) 100);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray7, "aaaaaaaaaa                                                                                                          ...");
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray7);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("", strArray3, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("...ih!i...", "444hi!4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!                                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ", (int) '4', "HI!...H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    " + "'", str3, "hi!                                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ");
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaa", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("!ih                 !ih                 !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa... 4...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa... 4...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa... 4...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa... 4...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa..." + "'", str2, "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa... 4...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa... 4...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...");
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("...A", "HI!   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hI!", "                                                                                                 HI!", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int6 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "I" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("AAAAAAA...AAAAAAAA...AAAAAAAA..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                    ", "    !!AAAAAAAAAAAAAAAAAAAAAAAAAH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("#######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######..." + "'", str1, "#######...");
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("", "                      hI!                      AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 43, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "AAAAAAAAAAAAAAAAAAAAAAA...", 26);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.split("hi", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 97);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 98);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi", strArray11, strArray16);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEach("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi", strArray4, strArray16);
        java.lang.String[] strArray19 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str6, "      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi" + "'", str12, "hi");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str17, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi" + "'", str18, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" });
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("", "HI!HI!H#######...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("############################################################", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..." + "'", str2, "#...");
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("", "HI! aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI" + "'", str2, "AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI");
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "   AHI!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("Aaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "hi!                      ...hhi!                      ...hhi!                      ...hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...aaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                  " });
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "hi!             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Aaaaaaaaaa...", "hhi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaa..." });
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("...", 172, 372);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...a       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                         " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                         ");
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("HI!HI!HI!HI!HI!HI!HI", "                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaaaaa" + "'", str2, "                                                                                          aaaaaaaaaa");
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("A   HI!    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444", "    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        char[] charArray13 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("", charArray13);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray13);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray13);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray13);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray13);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray13);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsOnly("       HI!", charArray13);
        int int21 = org.apache.commons.lang.StringUtils.indexOfAnyBut("       HI!", charArray13);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                                   !ih                                                 !ih", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("     i!hi!hi!h                                                                                    ...      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("!IhaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    !IhaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!Iha", 342, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaa", 'a', 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! A", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! A" + "'", str2, "A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! A");
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!", "       HI", 84);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!" });
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("i!#########################", "...#################       hiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!########################################IHh", 520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        char[] charArray14 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("", charArray14);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray14);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray14);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray14);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                       ...", charArray14);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ", charArray14);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsAny("                                                                                         ", charArray14);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                    ", charArray14);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsAny("!!!HHHHHHH", charArray14);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsOnly("hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!          ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi", "haaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4!4I4Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################", "##########                                                                                          ");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ", "i!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!", 90);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("!", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 236 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    " });
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                                                              " + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                                                              ");
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("!ih                                                 !ih", "                                                                                                                                                                                                                                                                   !ih                                                 !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                 !ih" + "'", str2, "!ih                                                 !ih");
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("hi !#########################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("HHI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", 130, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("", "#####", "##########HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                HI!                                                 ", "a##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                          aaaaaaaaaa                          ", "!IHhhhhhhhhhhhhhhhhh");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", 46, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                          aaaaaaaaaa                          " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ", 47, "                                                                                                                                                                                                                                                                    i ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  " + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(objArray0, "44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("       .");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "." });
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("IH                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("#########################!ih       ########A...                     ", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ");
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        char[] charArray10 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("", charArray10);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray10);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaa", charArray10);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray10);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !ih                                                 !ih                   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("!IH                                      ", 68, 130);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("       hi!                 hi!                 hi!                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       hi!                 hi!                 hi!                                        " + "'", str1, "       hi!                 hi!                 hi!                                        ");
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", "       HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!", "                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                         HI!                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!    ", "Hi!hi!hi!h                                                                                    ...");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                    ", "HI!");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "hi!");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, '4', (int) (byte) 100, (int) (byte) -1);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", 99, 17);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEach("                         !IH                        ", strArray4, strArray7);
        java.lang.String[] strArray21 = org.apache.commons.lang.StringUtils.split("       ...", "");
        java.lang.String str22 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ", strArray4, strArray21);
        java.lang.String str26 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 73, 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   hi!    " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                    " + "'", str9, "                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                         !IH                        " + "'", str18, "                         !IH                        ");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "       ..." });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!                                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    " + "'", str22, "hi!                                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("444444444444444444444444444444444444444444444444aaaaaa", 441, 22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("", "!HHI!H", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("                           AAAAA AAAAAAAAAAAAAAAA                           ", "HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           AAAAA AAAAAAAAAAAAAAAA                           " + "'", str2, "                           AAAAA AAAAAAAAAAAAAAAA                           ");
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) -1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                   ", "                                         HI                       ...H", "###hi!####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   " + "'", str3, "                                                   ");
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("####IHH", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH" + "'", str2, "####IHH");
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                                                                                                                                    ...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                    ..." + "'", str2, "                                                                                                                                    ...");
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("I!                      ..", "HI!...H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                      " + "'", str2, "I!                      ");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...aaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", 24, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaA...aaaa...aaaaaaaaaaaa" + "'", str3, "aaaaA...aaaa...aaaaaaaaaaaa");
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaa");
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                          HI!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("    I!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    I!  " + "'", str1, "    I!  ");
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "...aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                         aaa                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("aaaaaaaaaa                                      ", "AHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hi!aaa", "Hi!aaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                      hI!                      AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!", '4');
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("################################IHH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("!...!ihih...!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!...!ihih...!ih" + "'", str1, "!...!ihih...!ih");
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iH", 75, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iHaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         " + "'", str4, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iHaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       " + "'", str1, "...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ");
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!" + "'", str1, "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!");
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("a", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                #####################################################################################################################################...", 265, 75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("Aaaaaaaaaaaaaa################################IHh", 109, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("444hi!4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444hi!4444" + "'", str1, "444hi!4444");
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih" + "'", str3, "#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih");
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("a##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("HI", "################                                                    aaaaaaaaaa################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType(" aaah");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '4', 35, 5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "aaah" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "AAAAAAA...AAAAAAAA...AAAAAAAA..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("HI!HI!H...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!H..." + "'", str2, "HI!HI!H...");
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("##########", "hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("hi!###################                                                 ...hi!##################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                            ################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "... HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 5, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("HI!...HIHI!...!", "!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaa...", "...AAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("AaaahAaa", 92, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AaaahAaa####################################################################################" + "'", str3, "AaaahAaa####################################################################################");
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                   ");
        boolean boolean3 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#', 29, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                   " + "'", str5, "                                                   ");
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("aaaaaaaaaaaaa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa ", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("aaaaa aaaaaaaaaaaaaaaa", "!HHI!H", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaa################################IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa################################IH" + "'", str1, "aaaaaaaaaa################################IH");
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "hi!                      aaahhi!                      aaahhi!                      aaahhi!                      aaahhi!                      aaahhi!                      aaahhi!                      aaahhi!                      aaahhi!                      aaah");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("...a...a...a...a...a...a...a...a...a!ih", "##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH", "                                                HI!                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", 34, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  " + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ");
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                            ", "                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                            " });
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("       HI!                 HI!                 HI!         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "       ", "HI", "!", "                 ", "HI", "!", "                 ", "HI", "!", "         " });
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 276);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                                                                                                                                              " + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                                                                                                                                              ");
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! A", 229, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("   A   HI!       A   HI!       A   HI!       A   HI!       A   HI!       A   HI!       A   HI!    hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih    !IH   A       !IH   A       !IH   A       !IH   A       !IH   A       !IH   A       !IH   A   " + "'", str1, "!ih    !IH   A       !IH   A       !IH   A       !IH   A       !IH   A       !IH   A       !IH   A   ");
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aa", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("aaaaaaa..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa.." + "'", str1, "aaaaaaa..");
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa...", 520);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                  ", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                  " });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "444HI!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi");
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa", "hi!                 hi!                 hi!..........................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                 hi!                 hi!.........................................." + "'", str2, "hi!                 hi!                 hi!..........................................");
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                        hi!                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("       hi!#########################       hi!###################################################IHh", "hi!...hihi!...!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("444444444444444444444444444444444444444444444444##################################################", "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                        " + "'", str1, "                                                        ");
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  !!!HHHHHHH", "                                                                                                                                                                                                                               ", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("AAAAAAAAAAAAA", "I!AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAA");
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("4444444444444444444444444444444444444444444444444444444444444444444444444444444444#", 7, 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                      HI!                             ", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("                          ih                                                  ih                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih                                                  ih" + "'", str1, "ih                                                  ih");
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "hi!#########################       hi!####        H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        char[] charArray15 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("", charArray15);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray15);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray15);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray15);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                    ", charArray15);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                       ...", charArray15);
        int int22 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaa                                                                                                          ...", charArray15);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsOnly("...       ", charArray15);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsAny("          ", charArray15);
        boolean boolean25 = org.apache.commons.lang.StringUtils.containsAny("    A   HI!    ", charArray15);
        int int26 = org.apache.commons.lang.StringUtils.indexOfAny("HI                       ...H", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "...aaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!" + "'", str8, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!" + "'", str9, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("HI                       ...H", "i! i! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!i! i! i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...                                                                                    h!ih!ih!i", "aaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("Hi#!########################", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#!########################" + "'", str2, "Hi#!########################");
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("##########################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################" + "'", str1, "##########################################################");
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("a##################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a##################################" + "'", str1, "a##################################");
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa" + "'", str2, "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaa ", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa ");
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("aaaaaaa...hi!#########################       hi!                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" });
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                hi!                                                 ", "###########", 195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                     aaaaa aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                     aaaaa aaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                    aaaaaaaaaa", "   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("hi!                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                      ..." + "'", str1, "hi!                      ...");
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("############################################################################################!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAhaaa!ihhaaa!ihhaaa!ih############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAhaaa!ihhaaa!ihhaaa!ih############################################################################################" + "'", str1, "############################################################################################!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAhaaa!ihhaaa!ihhaaa!ih############################################################################################");
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAA...", "4444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" + "'", str2, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", "...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa" });
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny(" !ih                                                 !ih", "   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("IIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...", "                         ...aaaaaaaaaaaaaa################################IHh                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("     HI!       ...aaaaaaaaaaaaaa####################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!HI!", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaa                   haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                   haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aaaaaaaaaa                   haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "hhH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################" + "'", str1, "Hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444   hi!       ...aaaaaaaaaaaaaa##########################...   hi!   444444444444" + "'", str1, "44444444444   hi!       ...aaaaaaaaaaaaaa##########################...   hi!   444444444444");
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("hi!                      ...hihi!                      ...!");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray1, "i!aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "                      ", "...", "hihi", "!", "                      ", "...!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h", "", "", "...", "hih", "", "", "..." });
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             #####                                                                                                                                   ", "hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ", "...aaaaaaaaaaaaaa################################IH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!", "hi!                      ... hi!                      ... hi!                      ... hi!                      ... hi!                      ... hi!                      ... hi!                      ... hi!                      ... hi!                      ... hi!            ################################IHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!" + "'", str2, "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                     aaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", "!IH   A...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI", "     !IhAaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI");
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("hhhhhi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("AAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "HI!   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA" + "'", str3, "AAAA");
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("                      ...", "!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      ..." + "'", str2, "                      ...");
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("################################ih", 91, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################ih" + "'", str3, "#########################################################################################ih");
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("...ih!i...", "          ##########################                     aaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ##########################                     aaaaa aaaaaaaaaaaaaaaa" + "'", str2, "          ##########################                     aaaaa aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "                 hi!                 hi!                 hi!                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("!hi!hi!h                                                                                    ...", "aaaaA...aaaa...aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("", "    ...aaaaaaaaaaaaaa################################IHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("i!aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                         ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                                                                                    ", "AAAAAAAAAAAAAAAA AAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("...                                                                                                                                                                                                                                                                                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !ih                                                 !ih                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     ");
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!                                                                                                aaaaaaa...", 265, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                            hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!                                                                                                aaaaaaa..." + "'", str3, "                                                            hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!                                                                                                aaaaaaa...");
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H.", "...                                                                                    h!ih!ih!iH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI" + "'", str1, "HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI");
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("!IH   A...", "aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!H", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h..." + "'", str2, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                                                              ", '4', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "H                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str2, "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("HI!                      AAA       ", "aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!##                      AAA       " + "'", str3, "!##                      AAA       ");
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i!                 ", "                                                                                    ...", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i!                 " + "'", str3, "i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i!                 ");
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("####IHH", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "                                                                                              ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 859 + "'", int2 == 859);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("       hi!");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("                                       aaaaaaaaaa", strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("       hi!", "hi!", (int) (byte) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "       hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "       hi!" + "'", str8, "       hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("...                                                                       ...", "AAAAAAAAAAAAAAAA AAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...                                                                       ..." });
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "aa!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######" + "'", str4, "   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######");
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "... HI!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) (byte) -1, 85);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!" + "'", str3, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                 ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                 " + "'", str2, "                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                 ");
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                                                                                                                                              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("             a4444444444444444444444444444444444              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4444444444444444444444444444444444" + "'", str1, "a4444444444444444444444444444444444");
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("Hi!...h", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               Hi!...h                                " + "'", str2, "                               Hi!...h                                ");
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("   ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                 hi!                      ...h                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                 ", "hi", "!", "                      ", "...", "h", "                                                  " });
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("       hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaaaaaaaaaa################################ih", 9, 135);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "hi!" });
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", "I!                      ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa" + "'", str2, "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("                                                                                 hi", "AAAAAA", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                 hi" + "'", str3, "                                                                                 hi");
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        int int1 = org.apache.commons.lang.StringUtils.length("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                         HI!                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                         HI!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                         HI!");
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                      ###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("HI!HI!H...", "                                   4444444hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", 130, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str3, "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("...aaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("HI!HI!H...", 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!H..." + "'", str3, "HI!HI!H...");
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" });
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaaHHHHHHH#########################aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", 970, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " + "'", str3, "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("                                                                                                      !HHI!H                                                                                                      ", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                      !H..." + "'", str2, "                                                                                                      !H...");
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("aa!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!", "aaaaaaa################################                                                    aaaaaaaaaa################################                                                    aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!HHI!H!");
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("   4444444444444444                                                          aaaaaaaaaa    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444                                                          aaaaaaaaaa" + "'", str1, "4444444444444444                                                          aaaaaaaaaa");
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("AaaahAaa", "          ##########################                     aaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                                      HI!                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 265);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("IHH", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IHH" + "'", str6, "IHH");
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "...Ah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("hi!                      ...hihi!        444444444444444444444444444444444444444444444444aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                      ...hihi!        444444444444444444444444444444444444444444444444aaaaaa" + "'", str1, "hi!                      ...hihi!        444444444444444444444444444444444444444444444444aaaaaa");
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("HI!AAAAAAAAAAAAAAAAAAAAAAAA", "4444444444444444444444444444444444444444444444444444444444444444444444444hi!                      ...h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HI!AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, "               HI            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               HI             ", 817, 94);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens(".......", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         HI               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "......." });
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                    ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ", 29);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                        " + "'", str6, "                        ");
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aa", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aa" + "'", str2, "         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aa");
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("Hi!                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!..." + "'", str1, "Hi!...");
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("", "...AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("i!                    hi!                      ...h", "44444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!                    hi!                      ...h" + "'", str4, "i!                    hi!                      ...h");
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        char[] charArray15 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("", charArray15);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray15);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray15);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray15);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray15);
        int int21 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray15);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsOnly("       HI!", charArray15);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsNone("A   HI!    hi!", charArray15);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsNone("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        boolean boolean25 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", charArray15);
        boolean boolean26 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                       I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H               ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("..                                                 ", 70, " HI!HI!HI!HI!HI!HI!HI!H..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HI!HI!HI..                                                  HI!HI!HI!" + "'", str3, " HI!HI!HI..                                                  HI!HI!HI!");
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("               HI               ", "##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("   HI!A                                                                                                                                                                                                                                                                                                                                                                               A...A                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!A                                                          ..." + "'", str2, "   HI!A                                                          ...");
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI", "hi!                      ...");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                                              ");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEach("                         !ih                                                 !ih                   ", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                         !ih                                                 !ih                   " + "'", str7, "                         !ih                                                 !ih                   ");
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("IH", "aaaaaaa..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("aaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih", "...#################       hi!###################################################IHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!...h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "i", "!...", "h" });
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                        !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !" + "'", str1, "!  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !");
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("I! AAAAAAAAAAAAAAAAAAAAAA############################################################################################i!                      ..############################################################################################", "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!...aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I! AAAAAAAAAAAAAAAAAAAAAA############################################################################################i!                      ..############################################################################################" + "'", str2, "I! AAAAAAAAAAAAAAAAAAAAAA############################################################################################i!                      ..############################################################################################");
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!", "HI!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "hi!");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " });
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                                                 HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                            ################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaa                   haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                   haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aaaaaaaaaa                   haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa!IH!IH!IH!IH!..." + "'", str2, "aaaaaaaaaa!IH!IH!IH!IH!...");
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("       hi!");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("", "##########                                                                                          ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa..." + "'", str1, "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("   A", "Hi!aaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   A" + "'", str2, "   A");
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("                                        ", "...aaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." });
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("!hi!hi!hi!hi!hi!hi", 0, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!hi!hi!hi!hi" + "'", str3, "!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("hI!                      AAA", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                     ..." + "'", str2, "hI!                     ...");
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "!ih ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("I!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", 82, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa" + "'", str3, "I!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 294, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                        " + "'", str3, "!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                        ");
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("aaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HaahiaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HaahiaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa!" });
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi", "!IhaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!!IhaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!Iha", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("44444444444444444444444444444                                                              aaaaaa", "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444                                                              aaaaaa" + "'", str2, "44444444444444444444444444444                                                              aaaaaa");
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "                         !ih                                                 !ih                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("I!                      ...", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("#########################################################################################", (int) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################" + "'", str3, "#########################################################################################");
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", 817);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str2, "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("                                                      hi!                             ", " !ih                                                 !ih", "#######...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!    ", "Hi!hi!hi!h                                                                                    ...");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                    ", "HI!");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "hi!");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, '4', (int) (byte) 100, (int) (byte) -1);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", 99, 17);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEach("                         !IH                        ", strArray4, strArray7);
        java.lang.String[] strArray21 = org.apache.commons.lang.StringUtils.split("       ...", "");
        java.lang.String str22 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ", strArray4, strArray21);
        java.lang.String str24 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaaa                                                                                                          ...");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   hi!    " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                    " + "'", str9, "                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                         !IH                        " + "'", str18, "                         !IH                        ");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "       ..." });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!                                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    " + "'", str22, "hi!                                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "   hi!    " + "'", str24, "   hi!    ");
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str1, "   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("          ##########                                                                                                     ", "hi!                      ...hihi!        444444444444444444444444444444444444444444444444aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaAAAAAAAAAAAAAAAAAAAAAAaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaAAAAAAAAAAAAAAAAAAAAAAaaa" });
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                                                                                                                                                                                                                                                        !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !                 ", 85, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                        !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !                 " + "'", str3, "                                                                                                                                                                                                                                                        !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !                 ");
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                   ");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7);
        int int9 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                                              aaaaaa", strArray5, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 52 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI", "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str8, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI" });
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaa...", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa" + "'", str2, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa");
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaa################################IHh");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '#', 24, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 24 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaa", "################################", "IH", "h" });
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("hi!                      ... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                                                                                                                                                                                                                                                    ", "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("I!AAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 1, "aaaaaaa..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "I!AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("...                                             ...                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!                      AAA       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaa                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                   " + "'", str1, "aaaaaaaaaa                   ");
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         !IH                        ", "                                                                                     HI!");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                     HI!HI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa   ", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         !IH                        " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                     HI!HI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa   " + "'", str5, "                     HI!HI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa   ");
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!      " + "'", str2, "   HI!      ");
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("hi HI!HI!HI!HI!HI!HI!HI!H444444444444444", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi HI!HI!HI!HI!HI!HI!HI!H444444444444444" + "'", str2, "hi HI!HI!HI!HI!HI!HI!HI!H444444444444444");
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                      !Haaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hiH                                                                                                      ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                      !H", "!hi!hi!hi!hi!hi!hiH                                                                                                      " });
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "          ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("A   HI!    ", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 13);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("hihihihihihihihihihihihihihihihi", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ");
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("aAAAAAAAAAAAAAAAAAAAAAAAAAAAA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH", 229, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH" + "'", str3, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH");
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "hi#########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("!IhaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!!IhaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!Iha");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("          ", "                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!      ", "...Aaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaa", 171);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("####################################################", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("          ", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaaaaa", "       HI!                 HI!                 HI!          ", 99);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                         hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                                                                          aaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                         hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str10, "                                         hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "HI!...aaaaaaaaaaaaaa##########################...HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                          ", "                                                                   ...", 85);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                 ", "HI!...aaaaaaaaaaaaaa##########################...HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                 " + "'", str2, "                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                 ");
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                         HI!a                                                             ", "#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("   ", "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("a##################################", "aa!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!" + "'", str2, "a!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!");
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!", "aaaaaaaaaa", (int) (short) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!", 0);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray9, '4');
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEach("   HI!    ", strArray5, strArray9);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("                       ...", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "   HI!    " + "'", str13, "   HI!    ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                               ", 503, 172);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                                                                                                                                                                                                                                        !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !  !                 ", "aaaaaaaaaa################################IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 314 + "'", int2 == 314);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("...AAAAAAAAAAAAAA...", 128, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                      hI!                      AAA", 4, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      hI!                      AAA" + "'", str3, "                      hI!                      AAA");
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!                      aaah");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                                                                 hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...                                                                                                                                                                                                                                                                                                                                                                                              ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 23 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "aaah" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "      " });
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "... HI!", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                              ", "##", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAA" });
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                                                hi!                                          ", 54, "HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                hi!                                          " + "'", str3, "                                                hi!                                          ");
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("                                                                                                                                                            I!                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!                      ...hhi!                      ...hhi!                      ...hI", "#...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!                      ", "", "", "hhi!                      ", "", "", "hhi!                      ", "", "", "hI" });
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                                                      hi!                             ", 330, "4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                      hi!                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                                                      hi!                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("HI", "                                                                                         ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI" + "'", str3, "HI");
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("#########################################################################################ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#########################################################################################", "ih" });
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("hi!###################                                                 ...hi!##################", "                                                 hi!                      ...h                                                      !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                 hi!                      ...h                                                      ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   a");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######", 225, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                         HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######                                                                       " + "'", str3, "                                                                         HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######                                                                       ");
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("haaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                                          aaaaaaaaaa               ", 42, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                          aaaaaaaaaa               " + "'", str3, "                                                                          aaaaaaaaaa               ");
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!###########################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aAAAAAAAAAAAAAAAAAAAAAAAAAAAA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH");
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!                      ..", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ".." });
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase(" aaah", "...A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("       hi!", "hi!", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, '4');
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray5, "                                                              ");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "444444444444444444444444444                         !IH                        4444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

