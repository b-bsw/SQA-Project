package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hI! 44HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI! 44HI!" + "'", str1, "hI! 44HI!");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i", "Hi!       hi!       hi!    HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   Hi!       hi!       hi!     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i" + "'", str2, "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i");
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "Hi", (java.lang.CharSequence) "...hi!h...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!", "            ", "ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!" + "'", str3, "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###hi!#######hi!##########################    !ih!ih", (java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444aAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "444444aAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "            hIH            hIH", (java.lang.CharSequence) "I!HI!#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444" + "'", str2, "444444");
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444" + "'", str1, "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444");
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ", "  ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "ih");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray8, strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "HI!");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("                                                    ", strArray5, strArray18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                    " + "'", str19, "                                                    ");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##################################################################################################################################################################################################################################################################################" + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ih!ih!ih##################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ih##################################################################################" + "'", str1, "ih!ih!ih##################################################################################");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "I!    HI!HI!    HI!HI!HI!    ", (java.lang.CharSequence) "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!hi!");
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", (java.lang.CharSequence[]) strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ", (java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!#hi!hi!###hi!hi!#", "###################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ", strArray11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!#hi!hi!###hi!hi!#" });
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", "Hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ...", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   ..." });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   ..." + "'", str3, "   ...");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!    ", "hi!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!    ", "hi!");
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!    ", "hi!");
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray12 = new java.lang.reflect.GenericDeclaration[] { wildcardClass3, wildcardClass7, wildcardClass11 };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) genericDeclarationArray12, "...    hi...", (int) (byte) 100, 84);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray12);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) genericDeclarationArray12, "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    " });
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "    " });
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "    " });
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(genericDeclarationArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str13, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str18, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;" + "'", str20, "class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("        #hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aa        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "######################    !ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HI!HI!HI!", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!AAHI!AA");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "         HI ! HI ! HI ! HI ! HI ! H", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa", 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "HI!HI                      !hi!h");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!HI                      !hi!h");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI! HI! H#HI!HI!###HI!HI!#! HI! HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ih!ih!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ih!ih!" + "'", str1, "ih!ih!ih!ih!");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                !i", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa                                !iaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaa                                !iaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       aaaaaaaaaaaaaa  c                                         ", "IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 54, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "Class [Ljava.lang.String;!class [Ljava.lang.String                      ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                           hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI! 44HI! ", (java.lang.CharSequence) "HIhhhh", 965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih!ih                                                                                           ", 263, "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih                                                                                           c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc    " + "'", str3, "ih!ih                                                                                           c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc    ");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                         i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                      ... ! hi ! hi...", "!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 720, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI! !i HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i!hi!#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 71, 345);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 71 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i", "!", "hi", "!#" });
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "#HI!HI!HI!HI!HI!HI!h#ih#ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi! hi                                        hi! hi", "Hhi!#hi...", "HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##", "Hi!       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "class [ljava.lang.string;class [ljava.lang.string;cl");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI ! HI ! HI ! HI ! HI ! H", (java.lang.CharSequence[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i!                                ", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "h!ih!ih                                  !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiii", 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HHI    HI!H", 0, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HHI    HI!H" + "'", str3, "HI!HHI    HI!H");
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!#hi!hi!###hi!hi!#", "hi!              ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", (java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   ", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!#hi!hi!###hi!hi!#" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "   " + "'", str9, "   ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!#hi!hi!###hi!hi!#" + "'", str10, "Hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "i!#hi!hi!###hi!hi!#" });
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!IH!IH    !IH!IH!IH    !IH!IH    !Iclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clHIclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!Iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!Iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls");
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("c  aaaaaaaaaaa###############################################################################", 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c  aaaaaaaaaaa###############################################################################" + "'", str3, "c  aaaaaaaaaaa###############################################################################");
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "H444444444444444444444444444444HI!HI!HI!H...", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                   hi!hi!h", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH       !IH#######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "              hIH            hIH", (java.lang.CharSequence) "                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HI! HI! H#HI!HI!###HI!HI!#! HI! HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                                                                                                                                                                                                                                                  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "    hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", (java.lang.CharSequence) "   hi!       hHI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!#hi!hi!###hi!hi!#", "hi!              ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", (java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   ", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!Hi!a");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!#hi!hi!###hi!hi!#" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "   " + "'", str9, "   ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!#hi!hi!###hi!hi!#" + "'", str10, "Hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!#hi!hi!###hi!hi!#" + "'", str12, "Hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("i!    hi!hi!    hi!hi#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!    HI!HI!    HI!HI#######" + "'", str1, "I!    HI!HI!    HI!HI#######");
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "A", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  ", "###hi!#######hi!##########################    !ih!ih");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!#..." + "'", str2, "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!#...");
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   ###########               iH!IH!IH!I", "###############44###############", "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   ###########               iH!IH!IH!I" + "'", str3, "   ###########               iH!IH!IH!I");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hia!aaahia!aaa", 42, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#############################", "class [ljava.lang.string;class [ljava.lang.string;cl", "hi!hi!    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################" + "'", str3, "#############################");
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", (java.lang.CharSequence) "                                                                                 4444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "Hi!       ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".................................................................................................", "                                !i", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                              ", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "................................................................................................." });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                              " + "'", str10, "                                                                                              ");
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi! hi! h#hi!hi!###hi!hi!#! hi! hi!", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################################################################################################" + "'", str1, "########################################################################################################################");
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "ih!ih!ih##################################################################################", (java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HI!AAHI!AAhi!hi!hi!hi!hi!h", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!h!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str2, "HI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaahia!aaahia!aaahia!aaahia!a", "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahia!aaahia!aaahia!aaahia!a" + "'", str2, "aaahia!aaahia!aaahia!aaahia!a");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!", "44444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!" });
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "              hIH            hIH   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("          hi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hi!hi!h" + "'", str2, "          hi!hi!h");
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "Aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                ######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!#####################################################################", (java.lang.CharSequence) "                                                         i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                      ... ! hi ! hi...", 759);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...IIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI############################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        char[] charArray5 = new char[] { '#', '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###################################", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!#hi!hi!###hi!hi!#", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("             ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!       ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                          HI!       HI!    ...", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "       " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!aaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih!ih!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!iH", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!aaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!aaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("      Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                ######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I", (java.lang.CharSequence) "HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#IH#IH#IH#IH#IH#IH", 455, "4444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#IH" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#IH");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi", (java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str5, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL", (java.lang.CharSequence) "!ih!ih!ih!ih!i                                                                              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL" + "'", charSequence2, "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", "hi!hihI!       HI!       HI!       HIhi!                     HI!       HI!       HI!   ...", "hi                                        hi! hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str3, "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I" });
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("         4                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "         ", "4", "                                                                                                                                                                                                                                                                                                                " });
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   !i", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 14, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 14 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   !i" });
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################..." + "'", str2, "###################################################...");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   ...", 32, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################   ..." + "'", str3, "##########################   ...");
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hii                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", "hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str2, "C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", (java.lang.CharSequence) "###############################################################################################   HI!       !i   HI!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..." });
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi   hi!       hi!       hihi!       hi!       hi! hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi", "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("    c  ##############    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    c  ##############    " + "'", str1, "    c  ##############    ");
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                           444                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "               ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 718);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaa", (java.lang.CharSequence) "...############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", 40, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!!ih" + "'", str3, "!ih!!ih");
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("i!hi!hi!hi!hi!aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!aaaa" + "'", str1, "i!hi!hi!hi!hi!aaaa");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hiH            hiH            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiHhiH" + "'", str1, "hiHhiH");
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("###############################################################################################   HI!       !i   HI!", 75, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 719, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", "                                                                                           hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA" });
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444444444444444444444444444444444444       !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444       !i" + "'", str1, "44444444444444444444444444444444444444444444444444444444444       !i");
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence[]) strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih!ih                          hi!hi!    hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#############    !ih!ihh!", "#!IH!IH###!IH!IH#!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                  HI!                                   ", "hiH            hiH", 54);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                  HI!                                   " });
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray15 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence8, charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih" + "'", str1, "!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI                      !hi!h", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...!       hi!       h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                ######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#####44###############                                                 ", "########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####44###############                                                 " + "'", str2, "#####44###############                                                 ");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    c  aaaaaaaaaaaaaa    ", "       !i", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    c  aaaaaaaaaaaaaa    " + "'", str3, "    c  aaaaaaaaaaaaaa    ");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                           hi!hi!hi!hi!hi!hi                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI             ", 720, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################hI             #################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "################################################################################################################################################################################################################################################################################################################################################################hI             #################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!##################################################################################################################################################################################################################################################################################################################", "!ih!ih         ing;class [ljava.lang.string;class [ljava.lang.string;!ih!ih         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!##################################################################################################################################################################################################################################################################################################################" + "'", str2, "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!##################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...#hi...", "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#hi..." + "'", str2, "...#hi...");
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!ih!ih    !ih!ih!ih    !ih!ih    !iclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clhiclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clhiclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clhiclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls");
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih" + "'", str1, "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih");
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa#################", "Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", "                  HIClass ...                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "c", "[Lj", "v", "ng", "String;c", "[Lj", "v", "ng", "String;c", "[Lj", "v", "ng", "String;", "hi!##hi!##" });
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!HI!#4444444444444444444444444444444444444444444444", (java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   ###########               Ih!ih!ih!i", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            Ih!ih!ih!i" + "'", str2, "            Ih!ih!ih!i");
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!IH!IH!IH!IH!IH!IHH       !IH", 79, 118);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("##########################################################################################################################################################################################################################################################################################################################", "                               ...hi!h...", "HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", (java.lang.CharSequence) "                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", "... ssalC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ssalC" + "'", str2, "... ssalC");
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444", 753);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("i!       44444444444444444444444444444444444444444444444444444444444", "i!hi!hi!######################!ih!ihhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!       44444444444444444444444444444444444444444444444444444444444" + "'", str2, "i!       44444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi         hi!IH!IH                           AAA444444444444444444444444444444444444", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("       Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "i!    hi!hi!   ######################!ih!ihhi! ", (java.lang.CharSequence) "I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                    ", "hi!hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    " + "'", str2, "                                                    ");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("IH!IH!IH!IH!IH!IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IH!IH!IH!IH" + "'", str2, "IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    c  aaaaaaaaaaaaaa  ", "...!#I!HI!#I!HI!#I!HI!#I!HI!#!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "c", "", "aaaaaaaaaaaaaa", "", "" });
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        char[] charArray6 = new char[] { '#', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###################################", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!#hi!hi!###hi!hi!#", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###!ih#######!ih#######!ih#######!ih#######!ih#!ih!ih###!ih#######!ih#######!ih##", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hi!hi!hhi!hi!hhi!hi!hhi!hi!############### ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h", (java.lang.CharSequence) "Hi!       ", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("      hi!hi!  ...", "class ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!" + "'", str2, "hi!hi!");
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", (java.lang.CharSequence) "      hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!", 314);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 " + "'", str2, "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     HI!HI!HI!HI!HI!HI!                            ", "IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "                            " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "     ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "                            " });
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih!ih    !ih!ih!ih    !ih!ih    !iclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clhiclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A", "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ", 314);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih    !ih!ih!ih    !ih!ih    !iclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clhiclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls" + "'", str4, "!ih!ih    !ih!ih!ih    !ih!ih    !iclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clhiclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaa", "        ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaa" });
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   hia!aaahia!aaa", "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ", 727, (int) (byte) 0);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", (java.lang.CharSequence) "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "   ...", (java.lang.CharSequence) "#############################!#############################!#############################!#############################!#############################!#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ng;class [ljava.lang.string;class [ljava.lang.string;!ih!ih", "            Ih!ih!ih!i", "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ng;class [ljava.lang.str!ng;class [ljava.lang.str!ng;i!hi!h" + "'", str3, "ng;class [ljava.lang.str!ng;class [ljava.lang.str!ng;i!hi!h");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa", "                                                                                                                                                                                                                                                                                                                   hi!hi!h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ih!ih!ih!ih", (java.lang.CharSequence) "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "        !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih", (java.lang.CharSequence) "##!ih#######!ih#######!ih###!ih!ih#!ih#######!ih#######!ih#######!ih#######!ih###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h!ih!ih!ih!ih!ih", (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih..." + "'", str3, "h!ih!ih...");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "    c  aaaaaaaaaaaaaa    ###hi!##########################    !ih!ihhi", 310);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hi", 94, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hi" + "'", str3, "hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hi");
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I" + "'", str1, "######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!aahi!aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!", 746);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!" + "'", str2, "#hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi", "###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!aahi!aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                       aaaaaaaaaaaaaa  c                                         ", (java.lang.CharSequence) "ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("C  AAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C  AAAAAAAAAAAAAA" + "'", str2, "C  AAAAAAAAAAAAAA");
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;claHIclass[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;clas" + "'", str1, "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;claHIclass[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;clas");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaa!ih!ih", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "!ih!ih" });
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                        ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:    hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           " + "'", str1, "                                           ");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "hiH hiH              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hiH hiH              " + "'", charSequence2, "hiH hiH              ");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "i!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        char[] charArray6 = new char[] { 'a' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ih!######################    !ih!ihh!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" + "'", str3, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][][] objArray1 = new java.lang.Object[][][][][] { objArray0 };
        java.lang.Object[][][][] objArray2 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][][] objArray3 = new java.lang.Object[][][][][] { objArray2 };
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][][] objArray5 = new java.lang.Object[][][][][] { objArray4 };
        java.lang.Object[][][][] objArray6 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][][] objArray7 = new java.lang.Object[][][][][] { objArray6 };
        java.lang.Object[][][][][][] objArray8 = new java.lang.Object[][][][][][] { objArray1, objArray3, objArray5, objArray7 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(objArray8);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][][][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][][][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][][][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][][][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ", "#############    !ih!ihh!", "hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!", 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      " + "'", str4, "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ");
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              ", "i!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              " + "'", str2, "              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              ");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        char[] charArray4 = new char[] { '#', '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###################################", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h               ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H444444444444444444444444444444HI!HI!HI!H...", 310, "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H444444444444444444444444444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan" + "'", str3, "H444444444444444444444444444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!hihI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                    !IH!IH!IH!IH!IH!", (java.lang.CharSequence) "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         !ih!ih                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                         ", "!", "ih", "!", "ih", "                     " });
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("h!ih!ih...", "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL", 31, 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih");
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("             ", "aaa...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!    hi!hi!   ######################!ih!ihhi!  ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iii..." + "'", str2, "iii...");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  aaaaaaaaaaaaaa  c    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  aaaaaaaaaaaaaa  c    " + "'", str1, "  aaaaaaaaaaaaaa  c    ");
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI         HI!ih!ih                           aaa444444444444444444444444444444444444.String;", "c  ##############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI         HI!ih!ih                           aaa444444444444444444444444444444444444.String;" + "'", str2, "HI!HI!HI!HI!HI!HI         HI!ih!ih                           aaa444444444444444444444444444444444444.String;");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!                                ", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                  " + "'", str2, "hi!                                                                  ");
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                ######################!ih!ih#####################", "                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                ######################!ih!ih#####################" + "'", str2, "                                ######################!ih!ih#####################");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAA...", "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######", "...IIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######" + "'", str2, "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######");
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "i!", (java.lang.CharSequence) "#IH#IH#IH#IH#IH#IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ass [ljava.lang.string;class [ljava.lang.string;!ih!ih       ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ass [ljava.lang.string;class [ljava.lang.string;!ih!ih       " });
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!      hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "###################################");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             hi!hi!                                              ", "Hi!#hi!hi!###hi!hi!#", (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hia!aaahia!aaa", strArray4, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                             ", "", "", "", "", "", "                                              " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hia!aaahia!aaa" + "'", str10, "hia!aaahia!aaa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAA", "###hi!##########################...                                                        ", 67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "... !i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!", "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi! !I hi!", 57, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! !I hi!hi!       hi!       hi!       hi!       hi! hi!" + "'", str3, "hi! !I hi!hi!       hi!       hi!       hi!       hi! hi!");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", str2, "Aaaaaaaaaaaaclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hhi!#hi...", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h", "Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih", 90);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h" });
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A##!ih##!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         HI ! HI ! HI ! HI ! HI ! H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A##!ih##!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                       aaaaaaaaaaaaaa  c                                         ", "                         !ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaaa  c                                         " + "'", str2, "                                       aaaaaaaaaaaaaa  c                                         ");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "Aclss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;hi!##hi!##", (java.lang.CharSequence) "#############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "hi!hi!h", 12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 24, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 24 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" });
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                           hi!hi!", "                           ...#######!ih!ih#####################...                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           hi!hi!" + "'", str2, "                                                                                           hi!hi!");
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "i!hi!", (java.lang.CharSequence) "###    ###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                   ########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", "444444444444444                               i!    hi!hi!    hi!hi#######        444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H", "...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ih!ih!ih!ih!", ";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!                                ", 90, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaai!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaai!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "     HI!HI!HI!HI!HI!HI!                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HIh            HIh            ", 28, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "... !i", (java.lang.CharSequence) "################################################################################################### hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##", "Hi!       ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "class [ljava.lang.string;class [ljava.lang.string;cl");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", '4');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "   hi!    ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!44hi!44", strArray5, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', 0, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!44hi!44" + "'", str11, "hi!44hi!44");
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      hi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i!", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   i!                                   " + "'", str2, "                                   i!                                   ");
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               " + "'", str3, "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ");
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        char[] charArray6 = new char[] { 'a' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ih!######################    !ih!ihh!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############################!#############################!#############################!#############################!#############################!#######", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hihI!       HI!       HI!       HIhi!                     HI!       HI!       HI!   ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                         !ih!ih                     ", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         !ih!ih                     " + "'", str3, "                         !ih!ih                     ");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a           ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a           " + "'", str2, "a           ");
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(".................................................................................................", "aaahia!aaahia!aaahia!aaahia!a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahia!aaahia!aaahia!aaahia!a" + "'", str2, "aaahia!aaahia!aaahia!aaahia!a");
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 ", 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "         4                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hih            hih" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                 " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str8, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hih            hih" });
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#" + "'", str2, "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   HI!       !i   HI!    ", "                                             hi!hi!                     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!       !i   HI!    " + "'", str2, "   HI!       !i   HI!    ");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h", 314, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                         hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h" + "'", str3, "                                                                                                                                                                                                                         hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence5, charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi" + "'", str1, "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih!ih!ih!ih!ih!ih");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "hI! 44HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "Hi!#hi!hi!###hi!hi!#", (java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;cl", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("              hIH            hIH  ", 108, "                                                                                           hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   hIH            hIH                                       " + "'", str3, "                                                   hIH            hIH                                       ");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                       ", (java.lang.CharSequence) "...ih ! ih ! ... #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "!HI!HI!!HI!HI!!HI          hi!hi!h!HI!HI!!HI!HI!!HI.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("######################################################44###############                                                 ", "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################44###############                                                 " + "'", str2, "######################################################44###############                                                 ");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 40, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4hi4!4                                ", (java.lang.CharSequence) "c4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!va.lang.string;class4[ljava.lang.string;class4[ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ", (java.lang.CharSequence) "hi!#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              " + "'", str1, "              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              ");
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!#", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi!#" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!hi!#" + "'", str4, "i!hi!#");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "##", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...444444444", "########### IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444444" + "'", str2, "...444444444");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!I!IHI!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!I!IHI!" + "'", str2, "HI!I!IHI!");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!hi!#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" !ih!ih", "hiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AhiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!", 37);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " !ih!ih" });
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                              ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##", "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##" + "'", str2, "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##");
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!IH!IH!IH!IH!IH!IHhhhhhhhh!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IHHHHHHHHH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IHHHHHHHHH!IH");
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" ", "#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hiH            hiH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "H", "            ", "hi", "H" });
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;claHIclass[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;clas");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H444444444444444444444444444444HI!HI!HI!H...", "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!HI!HI!HIhi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "salc;gnirts.gnal.avajl[ ssalc;gnirt", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ih!ih!ih!ih", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                         HI!HI!HI!HI!HI!H   ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 25 + "'", int20 == 25);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###############################################################################################   hi!       !I   hi!    ", "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#####44###############                                                 ", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!i", (java.lang.CharSequence) "...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   ", "   !i", "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!######", 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   " + "'", str4, "      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   ");
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" !ihhi!hi!######################   !ih!ih    !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !ihhi!hi!######################   !ih!ih    !i" + "'", str1, " !ihhi!hi!######################   !ih!ih    !i");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi! hi!   ", "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!   " + "'", str3, "hi!hi! hi!   ");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "      ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 100, (int) (short) 1);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!            hi!            " + "'", str10, "hi!            hi!            ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!aahi!aa" + "'", str12, "hi!aahi!aa");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444" + "'", str1, "444444");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#####44#############aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#####44##############", "h!ih!ih !ih!ih !ih!ih!ih !ih!ih !i h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####44#############aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#####44##############" + "'", str2, "#####44#############aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#####44##############");
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h", "                                                                                                                                                                                                                       ", 746);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h" });
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("iiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!    hi!hi!   ######################!ih!ihhi! ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!    hi!hi!   ######################!ih!ihhi! " + "'", str2, "i!    hi!hi!   ######################!ih!ihhi! ");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!ih!ih!ih", 82, "H444444444444444444444444444444HI!HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ihH444444444444444444444444444444HI!HI!HI!H...H4444444444444444444444" + "'", str3, "!ih!ih!ih!ih!ihH444444444444444444444444444444HI!HI!HI!H...H4444444444444444444444");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ", (int) ' ', 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!       hi!       hi!" + "'", str3, " hi!       hi!       hi!");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hhi!hi!hhi!hi!hhi!hi!############### ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                                                              ", (java.lang.CharSequence) "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava." });
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444" + "'", str2, "4444444");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!IH!IH!IH!IH!IH!IHh       !ih", "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################" + "'", str2, "############################################################################################################");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("i!hi!hi!######################!ih!ihhi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!######################!ih!ihhi!" + "'", str2, "i!hi!hi!######################!ih!ihhi!");
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ass [ljava.lang.string;class [ljava.lang.string;!ih!ih       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444", (java.lang.CharSequence) "                                  !ih!ih                           aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;" + "'", str1, "class [Ljava.lang.String;");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", (int) (byte) -1, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!...", "                                                   ", 215);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!..." + "'", str3, "hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!...");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", "hi!  hi!  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih" });
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###############################################################################################   HI!       !i   HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################   HI!       !i   HI!" + "'", str1, "###############################################################################################   HI!       !i   HI!");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                              ", "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444", 718);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                              " });
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!", "444444444444444444444444444444444444444444444444hiH            hiH            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!" + "'", str2, "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!");
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI!HI!H", (java.lang.CharSequence) "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!HI!H" + "'", charSequence2, "HI!HI!HI!H");
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ng;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", str2, "ng;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;", (java.lang.CharSequence) "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                 4444444444444444", "             hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string", "Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;", 87);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                 4444444444444444" + "'", str4, "                                                                                 4444444444444444");
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "#####44###############                                                 ", (java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aahi!##hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aahi!##hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 " });
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ", 470);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("######################!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################!ih!ih" + "'", str1, "######################!ih!ih");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ng;clss [Ljv.lng.String;", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           ng;clss [Ljv.lng.String;                           " + "'", str2, "                           ng;clss [Ljv.lng.String;                           ");
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "", (java.lang.CharSequence) "ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;            ", 100, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("      ", "                                             hi!hi!                                              ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#############    !ih!ihh!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH", "###hi!##########################    !ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH" + "'", str2, "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH");
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HIH HIHAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH HIHAAAAAAAAAAAAAAAAAAAA" + "'", str1, "HIH HIHAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H !IH !IH !IH !IH!IH !IH !IH !IH !IH !I", 268);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                     H !IH !IH !IH !IH!IH !IH !IH !IH !IH !I" + "'", str2, "                                                                                                                                                                                                                                     H !IH !IH !IH !IH!IH !IH !IH !IH !IH !I");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl" });
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;            ", "i!h", 118);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Class [Ljava.lang.Str", "ng;class [Ljava.lang.Str", "ng;class [Ljava.lang.Str", "ng;            " });
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!aaaaaaaaaaaaaa", 25, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           " + "'", str2, "                                                                                           ");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("         4                                                                ...", (int) 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         4                                                                ...44444444444444444444" + "'", str3, "         4                                                                ...44444444444444444444");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################!ih!ih", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                          HI!       HI!    ...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!##hi!##h", (java.lang.CharSequence) "               Ih!ih!ih!i", 756);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("iiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                    hi! h#hi!hi!###hi!hi!#! hi! hi!                   ", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!" + "'", str1, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!i!i!i!i", "                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i!i!i" + "'", str2, "!i!i!i!i");
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444" + "'", str2, "4444444");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...", (java.lang.CharSequence) "                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!", 719);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("H ! IH ! IH ! IH ! IH ! IH", "Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", 73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H ! IH ! IH ! IH ! IH ! IH" + "'", str3, "H ! IH ! IH ! IH ! IH ! IH");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ", (java.lang.CharSequence) "hi!            hi!", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih!", "hi!", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                                                                                                 aaa", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih!ih!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    " + "'", str2, "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444Ahi!##hi!##A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444Ahi!##hi!##A" + "'", str1, "444444Ahi!##hi!##A");
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI!...", (java.lang.CharSequence) "hii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "!##hi!##h", (java.lang.CharSequence) "aaaa!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "      hi!hi!  ...", (java.lang.CharSequence) "hi!      hi!       hi!       hihi!       hi!       hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("###################################44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################44444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "###################################44444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "##########################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("            CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             " + "'", str1, "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             ");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                      HI ! HI ! HI ! HI ! HI ! HI !                                      ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                      ", "HI", " ", "!", " ", "HI", " ", "!", " ", "HI", " ", "!", " ", "HI", " ", "!", " ", "HI", " ", "!", " ", "HI", " ", "!", "                                      " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("########### IH!IH!IH!I", "                                                                                                                         Class [Ljava.lang.String;!class [Ljava.lang.String                                                                                                                                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String", 313, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String############################################################################################################" + "'", str3, "###########################################################################################################hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String############################################################################################################");
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ", 0, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!IH!IH!IH!IH!IH!IHhhhhhhhh!ih", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih                                " + "'", str2, "                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih                                ");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("############hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############HI##IH#IH#IH#IHHI##IH#IH#IH#IH" + "'", str1, "############HI##IH#IH#IH#IHHI##IH#IH#IH#IH");
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IH!IH!IH!IH!IH!IHH       !IH####################################################", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IHH#######!IH####################################################" + "'", str3, "!IH!IH!IH!IH!IH!IHH#######!IH####################################################");
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H", (java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "###hi!##########################    !ih!ihhi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!##############################");
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!IH!IH!IH!IH!IH!IH!IH!Iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls", "class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!Iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!Iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls");
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   ", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   " + "'", str3, "      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   ");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("########### IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########### ih!ih!ih!i" + "'", str1, "########### ih!ih!ih!i");
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih!ih!ih!i", 71, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444!ih!ih!ih!ih!i" + "'", str3, "444444444444444444444444444444444444444444444444444444444!ih!ih!ih!ih!i");
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 120, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!            h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!            h" + "'", str1, "Hi!            h");
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    !ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "C                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", 739);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", "#############################!#############################!#############################!#############################!#############################!#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", str2, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "###############44###############                                                 ", (java.lang.CharSequence) "hi!hi!    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###############44###############                                                 " + "'", charSequence2, "###############44###############                                                 ");
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih           " + "'", str2, "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih           ");
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                             HI!HI!                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!" + "'", str1, "HI!HI!");
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "4444444444444444444444444444444444444444", "4444!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", 84);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("      hi!hi!hi!hi!hi!", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "      hi!hi!hi!hi!hi!" + "'", str8, "      hi!hi!hi!hi!hi!");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!HI!HI!#####################################################################", "                                                                                 4444444444444444", "hi!#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                  HIClass ...                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIClass ..." + "'", str1, "HIClass ...");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...                       hi!hi!", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!" + "'", str1, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "######################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###  ...", "HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###", "", "..." });
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi ! hi...", "#############    !ih!ihh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hhi!#hi...", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!#hi..." + "'", str2, "Hhi!#hi...");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", " 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", (java.lang.CharSequence) "!hi!hi!!hi!hi!!hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa#################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 0, 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str4, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HIh HIh", "a           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIh HIh" + "'", str2, "HIh HIh");
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("########### ih!ih!ih!i", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########ih!ih!ih!i" + "'", str2, "###########ih!ih!ih!i");
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!", "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", 65);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", 3);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " ", (java.lang.CharSequence[]) strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hih            hih", (java.lang.CharSequence[]) strArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (java.lang.CharSequence[]) strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                         HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5, strArray12);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4444444                                       ", (java.lang.CharSequence[]) strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "i!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "          " });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                         HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str16, "                         HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                              ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH");
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "HI    ", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih", "       !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih" + "'", str2, "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###################################44444444444444444444444444444444444444444444444444444444444444444", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################44444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "###################################44444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray15 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence8, charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!            hi!            ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "i!4444hi!hi!4444hi!hi#######", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 720);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(charSequence4, charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    !ih!ih", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ", "444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 " + "'", str2, "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!i", 263, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "!i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaai!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaai!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaai!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h!ih!ih!hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h", (java.lang.CharSequence) "HI! !i HI!", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!", "                                       aaaaaaaaaaaaaa  c                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!");
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ", (java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         4                                                                ...44444444444444444444", (java.lang.CharSequence) "HI!#HI!HI!###HI!HI!#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444444444HI!HI!HI!H", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444HI!HI!HI!H" + "'", str2, "444444444444444444444444444444HI!HI!HI!H");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence) "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!ih!ih!  ", (java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;            ", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "HIClass ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            HI!HI!H", charSequence1, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 263, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str4, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Aclss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;hi!##hi!##", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aclss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;hi!##hi!##" + "'", str2, "Aclss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;hi!##hi!##");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!h", "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", 7);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!", (java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "hi!hi!hi!h" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444444hi!hi!hi!h" + "'", str8, "444444hi!hi!hi!h");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("          ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   " + "'", str2, "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ");
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("hi!              ");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "                                                         i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                      ... ! hi ! hi...", 92, 77);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "i!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!h                                             hi!hi!                                                                                           hi!hi!                                                                                           hi!hi!                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "... ! hi ! hi...", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444                                       ", "HIClass ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                                       " + "'", str2, "4444444                                       ");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" 4444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 4444444444444444444444444444444444" + "'", str2, " 4444444444444444444444444444444444");
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ihhi                                               ", "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihhi                                               " + "'", str2, "!ihhi                                               ");
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih           ", (java.lang.CharSequence) "!ih!ih!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("      hi!hi!  ...", (int) (byte) 1, 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     hi!hi!  ..." + "'", str3, "     hi!hi!  ...");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", 345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ih", "HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ih" });
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "   HI!       HI!    ...", (java.lang.CharSequence) "aaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("########### Ih!ih!ih!i", "#########################################################################################################################################################!ih  !ih#########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########### Ih!ih!ih!i" + "'", str2, "########### Ih!ih!ih!i");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                              !ih!ih                                             ", (java.lang.CharSequence) "hI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HIAAAA", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    HIAAAA                     " + "'", str2, "                    HIAAAA                     ");
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###########################################################################################################hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String############################################################################################################", (java.lang.CharSequence) "                                                                                           hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                 ", "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!##################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!#########################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                             ", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             " + "'", str2, "                                                                                             ");
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!hihI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! ..." + "'", str1, "hi!hihI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! ...");
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih ", (java.lang.CharSequence) "C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    !ih!ih", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;!class [Ljava.lang.String                      ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                   HI!HI!HI!HI!HI!H", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!hi!hi!!hi!hi!!hi...", "hi                                        hi! hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("i!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!" + "'", str2, "i!hi!");
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                        ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!", "!ih!ih!ih!ih!ih!ihh       !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...   !ih       !ih       !ih       !ih   !ih!ih !ih       !ih       !ih       !ih       !iH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

