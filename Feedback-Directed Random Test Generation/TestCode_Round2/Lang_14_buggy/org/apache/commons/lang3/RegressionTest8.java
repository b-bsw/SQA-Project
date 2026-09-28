package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "######################    !ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "hi!            hi!            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", "hi!                                ", "#######", 73);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", str4, "aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) ' ', 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string", (java.lang.CharSequence) "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("          hi!hi!h", 739);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            hi!hi!h" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            hi!hi!h");
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", (java.lang.CharSequence) "         4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       !ihhi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "...#######!ih!ih#####################...", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", (java.lang.CharSequence) "###hi!##########################    !ih!ih", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("   hi!       hHI!HI!HI!HI!HI!HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               Ih!ih!ih!i", (java.lang.CharSequence) "hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!...", "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!..." + "'", str2, "hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!...");
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!", 1, "#!IH!IH###!IH!IH#!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 141, 753);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hiH            hiH  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ", 5, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      " + "'", str3, "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!", "i!hi!#");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "I", "HI", "HI" });
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih", (java.lang.CharSequence) "hi!", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi!ahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 91 + "'", int2 == 91);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...    hi...", (java.lang.CharSequence) "                                                                                                 ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ih", "   hi!    ", (-1));
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i!h", "#############################!#############################!#############################!#############################!#############################!#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!h" + "'", str2, "i!h");
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ");
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!                                ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "############hi##ih#ih#ih#ihhi##ih#ih#ih#ih", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HIh            HIh            ", (java.lang.CharSequence) "                               ", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;" + "'", str1, "Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;");
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#" + "'", str2, "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ", "########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###hi!##########################    !ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ", "HI!HI!HI!HIhi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            " });
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("!iH", "hi!44hi!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "                                                                        ", (int) (short) 1);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.s", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I!HI!#", (int) '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!#4444444444444444444444444444444444444444444444" + "'", str3, "I!HI!#4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "    c  aaaaaaaaaaaaaa  ", "Hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("      ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ", "                                             hi!hi!                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI! HI! H#HI!HI!###HI!HI!#! HI! HI!", 40, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", 31, "               Ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   " + "'", str3, "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ");
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                        ", "!H44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                        " + "'", str2, "                                                                        ");
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;            ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                     ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444444444444444444444444444###################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444", "###################################" });
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIh            HIh", "                    hi! h#hi!hi!###hi!hi!#! hi! hi!                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hiH            hiH            ", 78, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hiH            hiH            " + "'", str3, "444444444444444444444444444444444444444444444444hiH            hiH            ");
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "ih!ih!ih!ih!", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Hi!       ", (java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Hi!       " + "'", charSequence2, "Hi!       ");
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi! hi! h#hi!hi!###hi!hi!#! hi! hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", " ", "hi", "!", " ", "h", "#", "hi", "!", "hi", "!###", "hi", "!", "hi", "!#!", " ", "hi", "!", " ", "hi", "!" });
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi! 44hi! ", (java.lang.CharSequence) "hhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "        ...    hi...         ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                   hi!hi!h", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                   hi!hi!h" + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                   hi!hi!h");
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!", (java.lang.CharSequence) "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444", 68, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAA");
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "444444444444444444444444444444444444444444444444hiH            hiH            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ih!######################    !ih!ihh!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "44444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "#hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aa", (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ih", "!######################", "    ", "!", "ih", "!", "ihh", "!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih", "!######################", "    ", "!", "ih", "!", "ihh", "!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##", 14, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... ! hi ! hi..." + "'", str3, "... ! hi ! hi...");
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI             ", (java.lang.CharSequence) "hiH            hiH            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaa", "Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#" + "'", str2, "Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                        ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("          hi!hi!h", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hi!hi!h" + "'", str2, "          hi!hi!h");
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!!ih!ih!ih!ihhi!!ih!ih!ih!ih", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih!ih!ih!ihhi!!ih!ih!ih!ih" + "'", str2, "hi!!ih!ih!ih!ihhi!!ih!ih!ih!ih");
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "Hi!       ", (java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!iH", 80, 758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ", 720);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", "hi! 44hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  " + "'", str1, "                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  ");
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hi! hi!    ", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!    ", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       hHI!HI!HI!HI!HI!HI!", "!IH!IH!IH!IH!IH!IHhhhhhhhh!ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "       ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ihhi                                               ", (java.lang.CharSequence) "         4                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                             ", 77, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!h");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444444444444444444444444444HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 720, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "c  aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###################################", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!#hi!hi!###hi!hi!#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###############            ###############", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!ih!", 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                    ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!", "                                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!ih!ih!ih!" });
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##########", "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    " + "'", str2, "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ");
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH", (java.lang.CharSequence) "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str1, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A");
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("I!HI!#4444444444444444444444444444444444444444444444", "###############            ###############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!#4444444444444444444444444444444444444444444444" + "'", str2, "I!HI!#4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                              !ih!ih                                             ", (java.lang.CharSequence) "ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                               i!    hi!hi!    hi!hi#######        ", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         i!    hi!hi!    hi!hi#######                                   " + "'", str2, "                                                         i!    hi!hi!    hi!hi#######                                   ");
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiH hiH" + "'", str1, "hiH hiH");
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "########################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("       !i", "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !i" + "'", str2, "       !i");
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI!", "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HI!" });
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#", "                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#" + "'", str2, "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#");
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H" });
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "###    ###", (java.lang.CharSequence) "########################################################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###    ###" + "'", charSequence2, "###    ###");
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(".................................................................................................", "                           ...#######!ih!ih#####################...                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................................................................................................." + "'", str2, ".................................................................................................");
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!       hhi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaa", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa" + "'", str2, "aaaaa");
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI ! HI ! HI ! HI ! HI ! H", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI ! HI..." + "'", str2, "HI ! HI...");
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "                                   hi!       hHI!HI!HI!HI!HI!HI!                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!", 98, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i!hi!#", 120, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence) "hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass14 = strArray13.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass24 = strArray23.getClass();
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass34 = strArray33.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass44 = strArray43.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass54 = strArray53.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        java.lang.Class[][] classArray61 = new java.lang.Class[6][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray62 = (java.lang.Class<?>[][]) classArray61;
        wildcardClassArray62[0] = wildcardClassArray7;
        wildcardClassArray62[1] = wildcardClassArray17;
        wildcardClassArray62[2] = wildcardClassArray27;
        wildcardClassArray62[3] = wildcardClassArray37;
        wildcardClassArray62[4] = wildcardClassArray47;
        wildcardClassArray62[5] = wildcardClassArray57;
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray62);
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.AnnotatedElement[][]) wildcardClassArray62);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertArrayEquals(classArray6, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("i!hi!#", "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!#" + "'", str2, "i!hi!#");
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "ih", (java.lang.CharSequence) "###############################################################################################   HI!       !i   HI!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "I!HI!#4444444444444444444444444444444444444444444444", (java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH!IH!IH!IH!IH!IHH       !IH####################################################", 32, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IHH       !IH####################################################" + "'", str3, "!IH!IH!IH!IH!IH!IHH       !IH####################################################");
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                      class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!    hi!hi!   ######################!ih!ihhi!  ");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", strArray2, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!", "", "", "", "hi!hi!", "", "", "######################!ih!ihhi!", "", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!" + "'", str10, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!" + "'", str11, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!#hi!hi!###hi!hi!#", 40);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl", (int) '#', 5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaa...", 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444!ih!ih" + "'", str1, "4444!ih!ih");
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", 17, (int) (byte) 10);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                        ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI ! HI ! HI ! HI ! HI ! H", "                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI ! HI ! HI ! HI ! HI ! H" + "'", str2, "HI ! HI ! HI ! HI ! HI ! H");
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                               ", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################" + "'", str1, "#####################################################################");
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                   hi!       hHI!HI!HI!HI!HI!HI!                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       hHI!HI!HI!HI!HI!HI!" + "'", str1, "hi!       hHI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##########", (int) ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################" + "'", str3, "################################");
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(".................................................................................................", "!IH!IH    !IH!IH!IH    !IH!IH    !I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("##", "                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ihhi                                               ", (java.lang.CharSequence) "   hi!       hi!    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "HI!HI!HI!HI!HI!", (int) (byte) 1, 314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 63 out of bounds for length 63");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                  HI!                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  HI!                                   " + "'", str2, "                                  HI!                                   ");
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!ahi!", (java.lang.CharSequence) "hi!       hhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI! !i HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!            hi!            ", "#hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aa", 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!            hi!            " + "'", str3, "hi!            hi!            ");
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 286, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a", (int) (short) -1, "                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a" + "'", str3, "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a");
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "######################!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH", "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                   hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!h" + "'", str1, "hi!hi!h");
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!IH !IH !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih" + "'", str1, "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###################################", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444" });
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "      ", (java.lang.CharSequence) "###hi!##########################...", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   hi!       hHI!HI!HI!HI!HI!HI!", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hHI!HI!HI!HI!HI!HI!" + "'", str2, "   hi!       hHI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", "                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H" + "'", str2, "hI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("######################    !ih!ih", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "######################    !ih!ih" });
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!ih!ih                           aaa444444444444444444444444444444444444", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hiH            hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hih            hih" + "'", str1, "hih            hih");
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "HI!#HI!HI!###HI!HI!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("i!hi!#", "AAAAAAAAAAAA", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!#" + "'", str3, "i!hi!#");
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(charSequence0, (java.lang.CharSequence) "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h!ih!ih!ih!ih!ih!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h!ih!ih!ih!ih!ih!" });
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              " + "'", str2, "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ");
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "!hi!hi!!hi!hi!!hi...", (java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihh       !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("               ", "    c  ##############    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c  ##############    " + "'", str2, "c  ##############    ");
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            ", (java.lang.CharSequence) "!ih!ih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!            hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!            hi!" + "'", str2, "hi!            hi!");
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...#hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#hi..." + "'", str1, "...#hi...");
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        char[] charArray4 = new char[] { '#', '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###################################", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!ihhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                   ", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                               " + "'", str2, "                                                                               ");
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("i!    hi!hi!   ######################!ih!ihhi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!    hi!hi!   ######################!ih!ihhi! " + "'", str1, "i!    hi!hi!   ######################!ih!ihhi! ");
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, 34, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 719);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ihh       !ih", "     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih", "ih", "ih", "ih", "ih", "ihh", "ih" });
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!    hi!hi!hi!    ", (int) '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaahi!hi!    hi!hi!hi!    aaaaaa" + "'", str3, "aaaaaahi!hi!    hi!hi!hi!    aaaaaa");
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ih!ih!ih!ih!", "        ...    hi...         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("###hi!##########################...                                                        ", "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hi!##########################...                                                        " + "'", str3, "###hi!##########################...                                                        ");
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!            hi!            ", (int) (short) 0, "!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!            hi!            " + "'", str3, "hi!            hi!            ");
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi##ih#ih#ih#ihhi##ih#ih#ih#ih", (java.lang.CharSequence) "Hi!       ", 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ..." + "'", str3, "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!            hi!            ", 0, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ", "...      !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      " + "'", str2, "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!            hi", (java.lang.CharSequence) "                             ", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Threshold must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("############hi##ih#ih#ih#ihhi##ih#ih#ih#ih", "HI!HI!HI!HI!HI!HI!", 35, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#HI!HI!HI!HI!HI!HI!h#ih#ih" + "'", str4, "#HI!HI!HI!HI!HI!HI!h#ih#ih");
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (int) (short) 1, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", (java.lang.CharSequence) "Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   hia!aaahia!aaa", 72, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                       ", (java.lang.CharSequence) "          hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!              ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "C                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", "         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1), 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI ! HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi ! hi..." + "'", str1, "hi ! hi...");
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       !ih", "hi!hi!hi!hi!hi!hi!", 3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "       !ih" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       !ih" + "'", str5, "       !ih");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "       !ih" + "'", str7, "       !ih");
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            ", "HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            " });
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Hi!Hi!a", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!HI!HI!!HI!HI!!HI...", "", "!HI!HI!!HI!HI!!HI          hi!hi!h!HI!HI!!HI!HI!!HI.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#####################################################################", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   #####################################################################" + "'", str2, "   #####################################################################");
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!", (java.lang.CharSequence) "            hIH            hIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih!" });
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hi!       ", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4                                                                                           hi!hi!44", 23, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4                                                                                           hi!hi!44" + "'", str3, "4                                                                                           hi!hi!44");
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                hi!hi!h", (int) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                hi!hi!h" + "'", str3, "                                                                                hi!hi!h");
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("i!    hi!hi!    hi!hi!hi!    hi!hi", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!    hi!hi!hi!    hi!hi" + "'", str2, "!    hi!hi!hi!    hi!hi");
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL", 73, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 42 + "'", int3 == 42);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   hi!       hHI!HI!HI!HI!HI!HI!", 0, "                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!       hHI!HI!HI!HI!HI!HI!" + "'", str3, "   hi!       hHI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "444444444444444444444444444444HI!HI!HI!H", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444444444444444444444444HI!HI!HI!H" + "'", charSequence2, "444444444444444444444444444444HI!HI!HI!H");
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " ", 753);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH", (java.lang.CharSequence) "44444444444444444444444", 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hiH            hiH            ", "hi!                                ", "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", "44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    " + "'", str2, "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ");
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444444444444444444444444HI!HI!HI!H", "HI ! HI...", "    c  ##############    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", (int) '#', "Hi! 44hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str3, "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "         4                                                                                                                                                                                                                                                                                                                ", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                !i", (java.lang.CharSequence) "hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH!IH    !IH!IH!IH    !IH!IH    !I", 14, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH    !IH!IH!IH    !IH!IH    !I" + "'", str3, "!IH!IH    !IH!IH!IH    !IH!IH    !I");
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", (java.lang.CharSequence) "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "hi!              ", (java.lang.CharSequence) "                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444444444444444444444444444444HI!HI!HI!H", (java.lang.CharSequence) "    c  ##############    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################################", "################################################################################################### hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################################" + "'", str2, "HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################################");
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "  hi!hi!hi!hi!hi!   ", (java.lang.CharSequence) "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", (java.lang.CharSequence) "44444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!            hi", (java.lang.CharSequence) "...    hi...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!            hi" + "'", charSequence2, "hi!            hi");
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi##ih#ih#ih#ihhi##ih#ih#ih#ih" + "'", str1, "hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!", "!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!" + "'", str2, "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!");
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "#hi!hi!###hi!hi!#", (java.lang.CharSequence) "Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "i!hi!hi!######################!ih!ihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...    HI...", (java.lang.CharSequence) "hi!ahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "Ih!ih!ih!i", (java.lang.CharSequence) "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!                                ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hI", "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!aaaaaaaaaaaaaa", 758, 6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!HI!HI!HI!", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaa", "                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa" + "'", str2, "aaaaa");
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi! hi! h#hi!hi!###hi!hi!#! hi! hi!", (int) ' ', 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ih!ih!ih!ih!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "###hi!##########################    !ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ih!ih!" + "'", str3, "ih!ih!ih!ih!");
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", (java.lang.CharSequence) "hi!       hhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HI!HI!HI!HI!#####################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!ih!ih!ih!ih!ih", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ih");
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("... ! hi ! hi...", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "!", "hi", "!", "hi..." });
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("salc;gnirts.gnal.avajl[ ssalc;gnirt", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", (java.lang.CharSequence) "hI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ", "!hi!hi!!hi!hi!!hi...", "C  AAAAAAAAAAAAAA", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       " + "'", str4, "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ");
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih!ih                           aaa444444444444444444444444444444444444", "hi!hi!    hi!hi!hi!    ", (int) ' ', 720);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih                          hi!hi!    hi!hi!hi!    " + "'", str4, "!ih!ih                          hi!hi!    hi!hi!hi!    ");
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hi!Hi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!a" + "'", str1, "Hi!Hi!a");
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################", (java.lang.CharSequence) "hi!ahi!", 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A" + "'", str1, "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!", "Hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " hi! h#hi!hi!###hi!hi!#! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                           hi!hi!", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;", (java.lang.CharSequence) "444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("C  AAAAAAAAAAAAAA", "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C  AAAAAAAAAAAAAA" + "'", str2, "C  AAAAAAAAAAAAAA");
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI!HI!HI!HI!#####################################################################", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "                                                                                                 aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               #####################################################################" + "'", str3, "               #####################################################################");
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("   hi!       hi!    ...", "   HI!    ", "HI!HI!HI!HIhi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", 9);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ..." + "'", str6, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", (java.lang.CharSequence) "4444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ..." + "'", str2, "                 ...");
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#########################################################################################################...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HI!HI!HI", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI" + "'", str2, "HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ihhi                                               ", "!IH!IH!IH!IH!IH!IHhhhhhhhh!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hii", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                 ", ".................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("######################    !ih!ih", "#####################################################################!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                  !ih!ih                           aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                   hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "I!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!HI!HI!!HI!HI!!HI          hi!hi!h!HI!HI!!HI!HI!!HI.", 78, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HI!!HI!HI!!HI          hi!hi!h!HI!HI!!HI!HI!!HI." + "'", str3, "!HI!HI!!HI!HI!!HI          hi!hi!h!HI!HI!!HI!HI!!HI.");
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "######################    !ih!ih");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class ..." + "'", str2, "Class ...");
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#############################!#############################!#############################!#############################!#############################!#######", "HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", "...#hi...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "...IH    ...", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hia!aaahia!aaa", "                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ", "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!aaaaaaaaaaaaaa", "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!aaaaaaaaaaaaaa" + "'", str2, "hi!aaaaaaaaaaaaaa");
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("h", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h               " + "'", str2, "h               ");
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", (java.lang.CharSequence) "############hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi##ih#ih#ih#ihhi##ih#ih#ih#ih", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi##ih#ih#ih#ihhi##ih#ih#ih#ih" + "'", str3, "hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    c  aaaaaaaaaaaaaa    ", 69, "###hi!##########################    !ih!ihhi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!##############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    c  aaaaaaaaaaaaaa    ###hi!##########################    !ih!ihhi" + "'", str3, "    c  aaaaaaaaaaaaaa    ###hi!##########################    !ih!ihhi");
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!              ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(charSequence4, charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;!class [Ljava.lang.String                      ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEach("class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i", strArray1, strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i" + "'", str4, "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 756);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", "#hi!hi!###hi!hi!#");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!hi!hi!hi!hi!   ", "#hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  hi!hi!hi!hi!hi!   " });
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", 83, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h" + "'", str1, "hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!    hi!hi!hi!    ", "               ", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!", (java.lang.CharSequence) "######################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!H", "                                ######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i", "!ih!ih!ih!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                      class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ", 39, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hiH            hiH  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HiH            hiH  ..." + "'", str1, "HiH            hiH  ...");
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI    ", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI    " + "'", str2, "HI    ");
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 7, (int) (short) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) '#', 1);
        java.lang.Class<?> wildcardClass21 = strArray2.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray24, 'a', 7, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "44" + "'", str16, "44");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "class [Ljava.lang.String;" + "'", str27, "class [Ljava.lang.String;");
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI! !i HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", (java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "HIh            HIh", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", "ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! " + "'", str2, "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...#######!ih!ih#####################...", "Hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class [Ljava.lang.String;!class [Ljava.lang.String", "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class [Ljava.lang.Str", "ng;", "class [Ljava.lang.Str", "ng" });
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2, genericDeclarationArray3 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray0, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray1, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray2, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray3, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("class [Ljava.lang.String;", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;");
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", "aaaaaaaaaaaaclass.[Ljava.lang.String;class.[Ljava.lang.String;class.[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi.##hi.##", "444444444444444444444444444444444444444444444444hiH            hiH            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        java.lang.CharSequence[] charSequenceArray0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hiH hiH", 108, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " hi! h#hi!hi!###hi!hi!#! hi! hi!", (java.lang.CharSequence) "HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###" + "'", str1, "hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###");
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.s", (java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "i!    hi!hi!   ######################!ih!ihhi! ", (java.lang.CharSequence) "hiH            hiH  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!..." + "'", str2, "HI!HI!HI!...");
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!h", 758, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################i!h##########################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "#########################################################################################################################################################################################################################################################################################################################################################################################i!h##########################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih!ih!ih!ih!", 34, "hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ih!ih!hi!hi!hi!hi!hi!hi!aaaa" + "'", str3, "ih!ih!ih!ih!hi!hi!hi!hi!hi!hi!aaaa");
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Hi!#hi!hi!###hi!hi!#", "hI! 44HI! ", "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!#hi!hi!###hi!hi!#" + "'", str3, "Hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI ! HI...", "hi!  hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI ! HI..." + "'", str2, "HI ! HI...");
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal", "HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal" + "'", str2, "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal");
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) "   HI!       !i   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih" + "'", str1, "ih");
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray8, strArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence[]) strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ", strArray3, strArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                " + "'", str16, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Class ...", "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class ..." + "'", str2, "Class ...");
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", "##########", 72);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ..." + "'", str1, "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!" + "'", str2, "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!");
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "ih", "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#########################################################################################################...", "", "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########################################################################################################..." + "'", str4, "#########################################################################################################...");
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hiH            hiH", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiH            hiH" + "'", str3, "hiH            hiH");
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                     HI!HI!HI!HI!HI!HI!                                     ", "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!########################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas", 40, "Hi! 44hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas" + "'", str3, "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!i!    aaa!ihhi!  ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A", (java.lang.CharSequence) "   ...", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!HI!HI!", (java.lang.CharSequence) "iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118 + "'", int2 == 118);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h", "                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h" + "'", str2, "         i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!    ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHh       !ih", "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", "                                                                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                        ", "i!    hi!hi!    hi!hi!hi!    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", "I44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 17, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi! 44hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! 44hi!" + "'", str1, "Hi! 44hi!");
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                 ", "hi ! hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hii", "       a!aih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hii" + "'", str2, "hii");
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                    ", 720);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "    c  aaaaaaaaaaaaaa    ", (java.lang.CharSequence) "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   hia!aaahia!aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  hi!hi!hi!hi!hi!   ", "#####################################################################!ih!ih!ih!ih!ih", 4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  hi!hi!hi!hi!hi!   " });
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 753);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", "", 94, 118);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ..." + "'", str4, "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          hi!hi!h", 77, 118);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          hi!hi!h" + "'", str3, "          hi!hi!h");
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!   " + "'", str1, "hi!hi!   ");
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hi", "", "HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hi" + "'", str3, "hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hi");
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi ! hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi ! hi..." + "'", str1, "hi ! hi...");
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "        ...    hi...         ", (java.lang.CharSequence) "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "               #####################################################################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                     " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        char[] charArray9 = new char[] { 'a', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                 ", "######################!ih!ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                 " + "'", str3, "                                                                                 ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                 " + "'", str6, "                                                                                 ");
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HHI    HI!H", (int) (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HHI    HI!H" + "'", str3, "HI!HHI    HI!H");
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "               #####################################################################", (java.lang.CharSequence) "       a!aih", 719);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("######################!     ", "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a", "...!       hi!       h...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clHIclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls" + "'", str2, "clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clHIclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls");
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "    c  ##############    ", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "!i", (java.lang.CharSequence) "I44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!              ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#######", "HI ! HI ! HI ! HI ! HI ! H", "444444444444444444444444444444HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######" + "'", str3, "#######");
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   HI!       HI!    ...", (java.lang.CharSequence) "C  AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!aaaaaaaaaaaaaa", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aclss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;hi!##hi!##" + "'", str2, "Aclss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;hi!##hi!##");
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("salc;gnirts.gnal.avajl[ ssalc;gnirt", "                                                                                                 aaa", 73);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "salc;gnirts.gnal.avajl[ ssalc;gnirt" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "salc;gnirts.gnal.avajl[ ssalc;gnirt" + "'", str4, "salc;gnirts.gnal.avajl[ ssalc;gnirt");
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("               Ih!ih!ih!i", "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "      ");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                       ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!            hi!            " + "'", str10, "hi!            hi!            ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###hi!##########################    !ih!i", 68, 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("###############            ###############", "      Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############            ###############" + "'", str2, "###############            ###############");
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", (java.lang.CharSequence) "44444444444444444444", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "  ", (java.lang.CharSequence) "HI!HI!HI!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!##hi!##", "                                             hi!hi!                                              ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "##", "", "", "##" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!#HI!HI!###HI!HI!#", "!ih!ih                           aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HHI    HI!H", "hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HHI    HI!H" + "'", str2, "HI!HHI    HI!H");
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", (int) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!" + "'", str3, "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!");
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("i!                                ", "###hi!##########################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hi!##########################..." + "'", str2, "###hi!##########################...");
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...", 0, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ", "44444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               " + "'", str2, "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ");
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", "I!HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             " + "'", str3, "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ");
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih!ih!ih!ih!ih!ihh       !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ihh       !i" + "'", str1, "!ih!ih!ih!ih!ih!ihh       !i");
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ", "aaaaaaaaaa", "                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      HI ! HI ! HI ! HI ! HI ! HI !                                      " + "'", str3, "                                      HI ! HI ! HI ! HI ! HI ! HI !                                      ");
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas" + "'", str1, "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!ih!ih                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih" + "'", str1, "!ih!ih");
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                        ", (java.lang.CharSequence) "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###hi!##########################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hi!##########################..." + "'", str1, "###hi!##########################...");
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", "...#hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ..." + "'", str2, "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "         i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "   hi!       hHI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi##ih#ih#ih#ihhi##ih#ih#ih#ih", "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi##ih#ih#ih#ihhi##ih#ih#ih#ih" + "'", str2, "hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a", "                                !i", 28);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!", 81, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aHIa", "aHIa", "aHIa", "aHIa", "aHIa", "aHIa", "a" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#########################################################################################################...", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################..." + "'", str3, "#########################################################################################################...");
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("            hIH            hIH", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            hIH            hIH" + "'", str2, "            hIH            hIH");
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("   HI!       HI!    ...", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas" + "'", str1, "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "i!hi!hi!h", (java.lang.CharSequence) "!##hi!##h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI! HI! H#HI!HI!###HI!HI!#! HI! HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("   !i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "   ", "!", "i" });
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "        ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##        ", 68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "C  AAAAAAAAAAAAAA", (java.lang.CharSequence) "Hi! 44hi!", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...IH    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...IH    ..." + "'", str1, "...IH    ...");
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("I!    HI!HI!    HI!HI!HI!    HI!HI!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!    HI!HI!    HI!HI!HI!    HI!HI!" + "'", str1, "I!    HI!HI!    HI!HI!HI!    HI!HI!");
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("               ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("################################", "Hi!Hi!a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih                                  !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih" + "'", str1, "h!ih!ih                                  !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih");
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               ", (java.lang.CharSequence) "hi!aahi!aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                     HI!HI!HI!HI!HI!HI!                                     ", "hi!i!    aaa!ihhi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                 aaa", (java.lang.CharSequence) "                                     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                 aaa" + "'", charSequence2, "                                                                                                 aaa");
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI!HI                      !hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        java.lang.String[] strArray3 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray7 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray11 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray15 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray19 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[][]) strArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[][]) strArray20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(strArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[][]) strArray20);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", (java.lang.CharSequence) "hiH            hiH            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################", "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#######", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi ! hi...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!    hi!hi!   ######################!ih!ihhi! ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!    hi!hi!   ", "!ih!ihhi! " });
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("i!    hi!hi!    hi!hi!hi!    hi!hi!", "!ih!ih!ih!ih!i", 724);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    ", "    ", "    " });
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string" + "'", str1, "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string");
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a           ", "aaaaaaaaaaaaclass.[Ljava.lang.String;class.[Ljava.lang.String;class.[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi.##hi.##", "...    HI...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a           " + "'", str3, "a           ");
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 468 + "'", int2 == 468);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                  ", "!ih!ih!ih!ih!ih!ihh       !ih", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }
}

