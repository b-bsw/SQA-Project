package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("H !IH !IH !IH !IH!IH !IH !IH !IH !IH !I", 40, 263);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                             i!    hi!hi!    hi!hi#######                              ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                   !ih!ih                          hi!hi!    hi!hi!hi!                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444", 74, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  4444444444444444444444444444444444444444" + "'", str3, "                                  4444444444444444444444444444444444444444");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     " + "'", str2, "                                     ");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("         4                                                                                                                                                                                                                                                                                                                hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i!hi!#");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence1, (java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!#########################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i", "!", "hi", "!#" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 413 + "'", int5 == 413);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!", "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "" });
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih" + "'", str1, "h !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!              ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi", (java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        java.lang.Object[][][] objArray0 = new java.lang.Object[][][] {};
        java.lang.Object[][][] objArray1 = new java.lang.Object[][][] {};
        java.lang.Object[][][] objArray2 = new java.lang.Object[][][] {};
        java.lang.Object[][][] objArray3 = new java.lang.Object[][][] {};
        java.lang.Object[][][] objArray4 = new java.lang.Object[][][] {};
        java.lang.Object[][][] objArray5 = new java.lang.Object[][][] {};
        java.lang.Object[][][][] objArray6 = new java.lang.Object[][][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(objArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[][][]) objArray6);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!ih!ih!ih!ih!ih", "                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!...                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ih");
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   ", "                          Hi! 44hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H" });
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!ih!ih                           aaa444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!i!i!i", (java.lang.CharSequence) "ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!...", 0, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!..." + "'", str3, "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!...");
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HIh HIh");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "i!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4                                                                                           hi!hi!44");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                  HIClass ...                                   ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4", "                                                                                           ", "hi", "!", "hi", "!", "44" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ih!ih                                                                                           ", 118, 470);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("ng;clss [Ljv.lng.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ng;clss [Ljv.lng.String;" + "'", str1, "Ng;clss [Ljv.lng.String;");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", strArray6, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray10, strArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.", (java.lang.CharSequence[]) strArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#HI!HI!HI!HI!HI!HI!h#ih#ih", (java.lang.CharSequence[]) strArray15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!" + "'", str11, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str16, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("######################################################44###############                                                 ", 215, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################################################44###############                                                 " + "'", str3, "#####################################################################################################################################################44###############                                                 ");
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 16, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("###############################################################################################   hi!       !I   hi!    ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################..." + "'", str2, "#############################...");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ", "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("               #####################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               #####################################################################" + "'", str1, "               #####################################################################");
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   ###########               IH!IH!IH!I", "ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!                                ", "i!    hi!hi!    hi!hi!hi!    hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!aaaaaaaaaaaaaa", "hi!hi!h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                                " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "aaaaaaaaaaaaaa" });
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!I!IHI!", "44444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!I!IHI!" + "'", str2, "HI!I!IHI!");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ih" + "'", str1, "i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ih");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "###################################");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             hi!hi!                                              ", "Hi!#hi!hi!###hi!hi!#", (int) (short) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hia!aaahia!aaa", strArray8, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHh       !ih", (java.lang.CharSequence[]) strArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", (java.lang.CharSequence[]) strArray8);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I", strArray1, strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "                                             ", "", "", "", "", "", "                                              " });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hia!aaahia!aaa" + "'", str14, "hia!aaahia!aaa");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I" + "'", str17, "######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!##################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH       !IH!IH!IH", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        char[] charArray10 = new char[] { 'a', '4', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C########### Ih!ih!ih!i", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C########### Ih!ih!ih!i" + "'", str2, "C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C########### Ih!ih!ih!i");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444!ih!ih!ih!ih!i", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!aahi!aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                  ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aa", 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!aaaaaaaaaaaaa", 6, "HI!AAHI!AAhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaaaaaaa" + "'", str3, "hi!aaaaaaaaaaaaa");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##", "i! hi!hi! ########...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##" + "'", str2, "HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##HI!##");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             ", 42, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " [LJAVA." + "'", str3, " [LJAVA.");
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##44444444444444444444444444444444444444444444444444444444444444444444444444444hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##h", "    c  ##############    ", "                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  44444444444444444444444444444444444444444444444444444444444444444444444444444hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  h" + "'", str3, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  44444444444444444444444444444444444444444444444444444444444444444444444444444hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  h");
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("########### ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########### ih!ih!ih!i" + "'", str1, "########### ih!ih!ih!i");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI! HI!HI! HI!HI!HI! HI!HI!" + "'", str1, "HI!HI!HI! HI!HI! HI!HI!HI! HI!HI!");
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("class ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA##!ih##!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!#HI!HI!###HI!HI!#", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!#HI!HI!###HI!HI!#" + "'", str3, "HI!#HI!HI!###HI!HI!#");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!aaaaaaaaaaaaaa", "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##" + "'", str2, "##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a           ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "           " });
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################", (java.lang.CharSequence) "hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
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
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray24);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) wildcardClassArray24);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[]) wildcardClassArray24);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray24);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "class [Ljava.lang.String;" + "'", str28, "class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "class [Ljava.lang.String;" + "'", str29, "class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "class [Ljava.lang.String;" + "'", str30, "class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "class [Ljava.lang.String;" + "'", str31, "class [Ljava.lang.String;");
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                    ", "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        char[] charArray10 = new char[] { 'a', '4', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hiH            hiH            ", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH       !IH#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                      HI ! HI ! HI ! HI ! HI ! HI !                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!       ", 98, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################HI!       " + "'", str3, "########################################################################################HI!       ");
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "############hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!" + "'", str1, "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!");
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                        ", "hi!i!    aaa!ihhi!  aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 37, "                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     " + "'", str3, "                                     ");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                    !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i", (int) (short) 1, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih  !ih", "                                   hi!       hHI!HI!HI!HI!HI!HI!                                    ", "Class [Ljava.lang.String;!class [Ljava.lang.String                      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                          !IH!IH!IH!IH!IH!IHH       !IH!IH!IH", "Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                          !IH!IH!IH!IH!IH!IHH       !IH!IH!IH" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH!IH!IH!IH!IH!IHH       !IH!IH!IH" });
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!            h", (java.lang.CharSequence) "i!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "class[LhI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihh       !ih#######################", 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls", 286, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444" + "'", str2, "44444444444444444444");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("     hi!hi!  ...", "ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!  ..." + "'", str2, "hi!hi!  ...");
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("    c  aaaaaaaaaaaaaa  ", "Class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    c  aaaaaaaaaaaaaa  " + "'", str3, "    c  aaaaaaaaaaaaaa  ");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                             ", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       " + "'", str2, "                       ");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HIh            HIh            ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################", 710);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               " + "'", str2, "               ");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!hi!            hiHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444###################################", 718);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!              ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih!ih                           aaa", (java.lang.CharSequence[]) strArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!    hi!hi!   ######################!ih!ihhi!  ", (java.lang.CharSequence[]) strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!  hi!  ", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!aaaaaaaaaaaaaa" + "'", str11, "hi!aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi", "   !ih!ih       !ih       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih       !ih       !ih      !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                !i", (java.lang.CharSequence) "hi!       hi!    ...", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih" + "'", str1, "ih");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("      ", "HI!HI!HI!HI!HI!H", 91);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "      " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      " + "'", str4, "      ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "      " + "'", str5, "      ");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI############################", "#################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih!######################    !ih!ihh!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "   ###########               Ih!ih!ih!i", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!######################", "!ih!ihh!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                 ih!ih!ih!ih", "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   ", 756);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i", 20, "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i" + "'", str3, "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i");
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##", (java.lang.CharSequence) "i!    hi!hi!   ######################!ih!ihhi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!hi! hiHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!" + "'", str2, "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!");
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I44444", "I!HI!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I44444" + "'", str2, "I44444");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence5, charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         HI ! HI ! HI ! HI ! HI ! H", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence[]) strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ", strArray2, strArray11);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                " + "'", str15, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(charSequence4, charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH!IH!IH       a!aih!IH!IH!IH", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#hi!#Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "!ih!ih ing;class [ljava.lang.string;class [ljava.lang.string;!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44" + "'", str3, "44");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi##ih#ih#ih#ihhi##ih#ih#ih#ih", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##" + "'", str3, "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!", 268);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444Ahi!##hi!##A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444Ahi!##hi!##A" + "'", str1, "444444Ahi!##hi!##A");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH", "...                       hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HI             ", (java.lang.CharSequence) "c aaaaaaaaaaa###############################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI             " + "'", charSequence2, "HI             ");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hiH hiH              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH                                                     ", "         4                                                                ...44444444444444444444", 345);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi! h#hi!hi!###hi!hi!#! hi! hi!", 310, 721);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! h#hi!hi!###hi!hi!#! hi! hi!" + "'", str3, "hi! h#hi!hi!###hi!hi!#! hi! hi!");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "i!    hi!hi!   ######################!ih!ihhi!", (java.lang.CharSequence) "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################hI             #################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################hI             #################################################################################################################################################################################################################################################################################################################################################################" + "'", charSequence2, "################################################################################################################################################################################################################################################################################################################################################################hI             #################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ng;clss [Ljv.lng.String;");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...    HI...");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!#HI!HI!###HI!HI!", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ng;clss", "[Ljv.lng.String;" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ng;clss", "[Ljv.lng.String;" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;", 637, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaClss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaClss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;");
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(charSequence0, (java.lang.CharSequence) "ng;clss [Ljv.lng.String;           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", strArray4, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8, strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, 'a', 70, 5);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaac", strArray13, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 27 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!" + "'", str9, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str14, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    " });
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, (java.lang.CharSequence) "                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################" + "'", str1, "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!hihI!       HI!       HI!       HIhi!                     HI!       HI!       HI!   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 7, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) (byte) 1, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65 out of bounds for length 65");
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
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############HI", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############HI" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############HI");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "!ih!ih!ih!ih!i", (java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!ih!ih!ih!ih!i" + "'", charSequence2, "!ih!ih!ih!ih!i");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   !i", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   !i" });
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("h!ih!ih !ih!ih !ih!ih!ih !ih!ih !i h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH !IH!IH !IH!IH!IH !IH!IH !I H!IH!IH!IH" + "'", str1, "H!IH!IH !IH!IH !IH!IH!IH !IH!IH !I H!IH!IH!IH");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI#HI#HI#HI#HI#HI#", "                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI#HI#HI#HI#HI#" + "'", str3, "HI#HI#HI#HI#HI#HI#");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", "###############################################################################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal", "HI!HI!HI!HI!HI!#####################################################################");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                               hi ! hi...", (java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirthi!hi!hi!hi!hi!h", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirthi!hi!hi!hi!hi!h" + "'", str9, ";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirthi!hi!hi!hi!hi!h");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ...", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   ..." });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################    !ih!ih", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 118, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               " + "'", str3, "                                                                                               ");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "         4                                                                ...", 758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("################", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa" + "'", str2, "aaaaaa");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ", " [LJAVA.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!", (java.lang.CharSequence) "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ", 309);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                               ", "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H444444444444444444444444444444HI!HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H444444444444444444444444444444HI!HI!HI!H..." + "'", str1, "H444444444444444444444444444444HI!HI!HI!H...");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" + "'", str2, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!HI!#4444444444444444444444444444444444444444444444                              ", "i!    hi!hi!   ######################!ih!ihhi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!#4444444444444444444444444444444444444444444444                              " + "'", str2, "I!HI!#4444444444444444444444444444444444444444444444                              ");
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "######################!     ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!       hi!       hi!    HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   Hi!       hi!       hi!     ", 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!       hi!       hi!    HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   Hi!       hi!       hi!     " + "'", str3, "Hi!       hi!       hi!    HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   Hi!       hi!       hi!     ");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!" + "'", str2, "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!");
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AhiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i     " + "'", str2, "    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i     ");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   ", (java.lang.CharSequence) "Hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                              44", (java.lang.CharSequence) "hi!hi!hi!hi!hi!h", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("######################################################44###############                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 93);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "######################################################44###############                                                 " });
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "...    HI...", (java.lang.CharSequence) "HI!HI!HI!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                   ", 9, 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                   " + "'", str3, "          ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                   ");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                     H !IH !IH !IH !IH!IH !IH !IH !IH !IH !I", (java.lang.CharSequence) "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!########################################################################################################################################################################################################################################################################################################################################################", "        ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##        ", 90);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi!");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!                                ", (java.lang.CharSequence[]) strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH!IH!IH!IH!IHh       !ih", strArray12, strArray16);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", 100);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray22, '#');
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        int int32 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray31);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray27, strArray31);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray31);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray31, "hi!hi!hi!hi!hi!");
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray22, strArray31);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", strArray16, strArray31);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray31, "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH                                                     ", 724, 68);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!", strArray6, strArray31);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "!IH!IH!IH!IH!IH!IHh       !ih" + "'", str17, "!IH!IH!IH!IH!IH!IHh       !ih");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "################################################################################################### hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!" + "'", str24, "################################################################################################### hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str37, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", str38, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!hi!" + "'", str43, "hi!hi!");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", (java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihh       !i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "        ", (java.lang.CharSequence) "                  HIClass ...                                   ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hiH hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiHhiH" + "'", str1, "hiHhiH");
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", "AAA...", "class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                " + "'", str3, "    hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi", (java.lang.CharSequence) "!ih!ih         ing;class [ljava.lang.string;class [ljava.lang.string;!ih!ih         ", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("i!    hi!hi!    hi!hi!hi!    hi!hi!  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!  ..." + "'", str2, "i!  ...");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaa...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaa...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ", " !ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!", (java.lang.CharSequence) "H!IH!IH...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!    hi!hi!hi!    hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                         hi4hi4hi4hi4hi4h   ", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi4hi4hi4hi4hi4h                                           " + "'", str2, "                         hi4hi4hi4hi4hi4h                                           ");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!    hi!hi!   ######################!ih!ihhi!  ", 718);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 7, (int) (short) 10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.io.Serializable[]) strArray2);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "44" + "'", str16, "44");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("salc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalcIHalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Salc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalcIHalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc" + "'", str1, "Salc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalcIHalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", (java.lang.CharSequence) "hi!      hi!       hi!       hihi!       hi!       hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################" + "'", str1, "################################");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAA");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", (java.lang.CharSequence) "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi! hi! h#hi!hi!###hi!hi!#! hi! hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    !ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 313);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi! hi! h#hi!hi!###hi!hi!#! hi! hi!" });
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...", (java.lang.CharSequence) "  aaaaaaaaaaaaaa  c    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("             ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444" + "'", str3, "4444444444444");
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#######", (java.lang.CharSequence) "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!", 263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("g.String;class[Ljava.lang.String;class[Ljava.lang.String", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ng.Stringa.lavass[Ljang.String;cla.lavass[Ljag.String;cl" + "'", str2, "ng.Stringa.lavass[Ljang.String;cla.lavass[Ljag.String;cl");
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Ljava.lang.String;class", "[Ljava.lang.String;class", "[Ljava.lang.String;class", "[Ljava.lang.String;" });
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!       HI!       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       HI!       ..." + "'", str1, "HI!       HI!       ...");
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaa", "!IH!IH!IH!IH!IH!IHH#######!IH####################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            " + "'", str1, "            ");
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444", 215, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih4444444444444444444444444444444444444444!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" + "'", str3, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih4444444444444444444444444444444444444444!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "H!IH!IH...", (java.lang.CharSequence) "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!", 719);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...", 721);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls", (java.lang.CharSequence) "########### Ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!HI!#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "###############44###############                                                 ", (java.lang.CharSequence) "Ih!ih!ih!i", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("###    ###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###    ###" + "'", str1, "###    ###");
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi! hi                                        hi! hi", "                       ", "i!       4444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!H44444444444444444444444444444444444444444444444444444444444444", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!H44444444444444444444444444444444444444444444444444444444444444" + "'", str3, "!H44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "        #hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aa        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH", 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH" + "'", str3, "!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##", "Hi!       ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!ih!", 1);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                    ", (java.lang.CharSequence[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...a...", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...a..." + "'", str10, "...a...");
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                        ", "                                                                                                 aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!hi!######################!ih!ihhi!", "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa", (-1));
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 83, 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################", "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach(";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc", strArray4, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 18 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "", "", "######################", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "################################" });
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!hi!#");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl" + "'", str2, "ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("          hi!hi!h", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hi!hi!h" + "'", str2, "          hi!hi!h");
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaa", 0, "ring;class [Ljava.lang.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##!ih#######!ih#######!ih###!ih!ih#!ih#######!ih#######!ih#######!ih#######!ih###", "                                                  ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##!ih#######!ih#######!ih###!ih!ih#!ih#######!ih#######!ih#######!ih#######!ih###" });
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih!ih!ih!ih!ih!ihHHHHHHHH!IH", "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihHHHHHHHH!IH" + "'", str2, "!ih!ih!ih!ih!ih!ihHHHHHHHH!IH");
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih", "", "!ih!ih", "", "!ih!ih", "", "!ih!ih", "", "!ih!ih", "", "!ih!ih", "", "!ih!ih", "", "!ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih" });
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.toString(byteArray1, " ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:  ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###############            ###############", "#########hi!              #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                 ###############44###############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;            ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "###################################");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i" + "'", str8, "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i");
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "   HI!       !i   HI!    ", 59, 633);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   " + "'", str2, "                   ");
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI! 44HI!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iii...", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iii..." + "'", str3, "iii...");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "...ih ! ih ! ... #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...!Hi!Hi!Hi!Hi!Hi!         4                         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", 7, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "iii...", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ng.Stringa.lavass[Ljang.String;cla.lavass[Ljag.String;cl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i!    hi!hi!    hi!hi!hi!    hi!hi!  ", "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ", 82, "!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     !IH!IHAA!" + "'", str3, "     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     !IH!IHAA!");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!IH!IH    !IH!IH!IH    !IH!IH   ", "###################################44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH    !IH!IH!IH    !IH!IH   " + "'", str2, "!IH!IH    !IH!IH!IH    !IH!IH   ");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH!IH    !IH!IH!IH    !IH!IH   ", 40, "                                  HIClass ...                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    !IH!IH    !IH!IH!IH    !IH!IH       " + "'", str3, "    !IH!IH    !IH!IH!IH    !IH!IH       ");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                      class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!HI!HI!!HI!HI!!HI...", "class [ljava.langclass [ljava.lang", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HI!!HI!HI!!HI..." + "'", str3, "!HI!HI!!HI!HI!!HI...");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("ing;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ing;class [ljava.lang.string;class [ljava.lang.string;" + "'", str1, "ing;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI                      !hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                      !hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "HI!HI                      !hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) ";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                  HIClass ...                                   ", "ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl", "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!HIihii!hhh!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!HIihii!hhh!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", 100);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                ######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i", "I!    HI!HI!    HI!HI!HI!    HI!HI!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                ######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i" + "'", str2, "                                ######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i");
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("###!ih#######!ih#######!ih#######!ih#######!ih#!ih!ih###!ih#######!ih#######!ih##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###!ih#######!ih#######!ih#######!ih#######!ih#!ih!ih###!ih#######!ih#######!ih##" + "'", str1, "###!ih#######!ih#######!ih#######!ih#######!ih#!ih!ih###!ih#######!ih#######!ih##");
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("######################    !ih!ih", "                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaClss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################aaaa!ih!ih" + "'", str3, "######################aaaa!ih!ih");
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        char[] charArray9 = new char[] { 'a', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#################", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaahia!aaahia!aaahia!aaahia!a", 470, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#####44#############aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#####44##############", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ", "hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             " });
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI!HI!", "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!" + "'", str2, "HI!HI!");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("      !ih!ih!!ih!ih!!ih   Hi!Hi!a                                                                 ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      !ih!ih!!ih!ih!!ih   Hi!Hi!                                                                 " + "'", str2, "      !ih!ih!!ih!ih!!ih   Hi!Hi!                                                                 ");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!ih!", 1);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!##hi!##", (java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HHI    HI!H", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa", "###hi!##########################    !ih!i");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", strArray10, strArray14);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH!IH    !IH!IH!IH    !IH!IH    !I", "aaaaaaaaaaaaclass.[Ljava.lang.String;class.[Ljava.lang.String;class.[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi.##hi.##");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("!ih!ih!ih!ih!ih!ihh       !ih#######################", strArray14, strArray18);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str11, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "ih!ih!ih!ih!lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str15, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "!IH!IH    !IH!IH!IH    !IH!IH    !I" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!ih!ih!ih!ih!ih!ihh       !ih#######################" + "'", str19, "!ih!ih!ih!ih!ih!ihh       !ih#######################");
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", (java.lang.CharSequence) "                                                                                                                                                                                           class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA" + "'", charSequence2, "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA");
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                     ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     " + "'", str2, "                     ");
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!  hi!", 15, 455);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", str2, "Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "Ih!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!iIh!ih!ih!i", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!######", (java.lang.CharSequence) "    c  aaaaaaaaaaaaaa    ", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi ! hi...", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi ! hi..." });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!I!    AAA!IHHI!  ", "ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 76);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!I!    AAA!IHHI!  " });
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!i!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!i!i" + "'", str1, "!i!i!i");
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence10 = null;
        char[] charArray17 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone(charSequence10, charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!H", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...    hi...", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                 ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("            ", ".................................................................................................");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!    hi!hi!hi!    hi!hi", strArray3, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                 " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "            " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "            " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!    hi!hi!hi!    hi!hi" + "'", str9, "!    hi!hi!hi!    hi!hi");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIi!    hi!hi!   ######################!ih!ihhi!  ", 83, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###hi!#######hi!##########################    !ih!ih", 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hi!#######hi!##########################    !ih!ih" + "'", str3, "###hi!#######hi!##########################    !ih!ih");
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444" + "'", str2, "444444");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.s");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", charSequence2, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HIhhhh", (java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "     HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " });
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("  hi!hi!hi!hi!hi!                                                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaa", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hiaaaaaaaaaaaaaaaaaaaaaaaaa   " + "'", str3, "  hiaaaaaaaaaaaaaaaaaaaaaaaaa   ");
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH!IH    !IH!IH!IH    !IH!IH    !I", "##########################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!IH    !IH!IH!IH    !IH!IH    !I" });
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "...    HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C  aaaaaaaaaaaaaaC  aaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!  hi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str2, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", "hi!       hhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "###################################", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                   ", "                                                    ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH       !IH#######################", (java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!##hi!##");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!#", (java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI         HI!ih!ih                           aaa444444444444444444444444444444444444", 82, "4444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI         HI!ih!ih                           aaa444444444444444444444444444444444444" + "'", str3, "HI!HI!HI!HI!HI!HI         HI!ih!ih                           aaa444444444444444444444444444444444444");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("H444444444444444444444444444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan" + "'", str2, "44444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan");
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ...#######!ih!ih#####################...                           ", 633, "i! hi!hi! ######################!ih!ihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ...#######!ih!ih#####################...                           " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ...#######!ih!ih#####################...                           ");
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI                      !hi!h", (int) (short) 1, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!" + "'", str3, "I!");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!            hi!           ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!...", 70, 215);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl" + "'", str1, "ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl");
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                 ", "hi!hi!                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!i!i!i!i", "hi                                        hi! hi", 30);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!", "                      ", 2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!i!i!i!i" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "!ih!ih!ih!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str9, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "######################aaaa!ih!ih", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!va.lang.string;class4[ljava.lang.string;class4[ljava.lang.string;" + "'", str4, "c4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!va.lang.string;class4[ljava.lang.string;class4[ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   hi!       hHI!HI!HI!HI!HI!HI!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hHI!HI!HI!HI!HI!HI!" + "'", str2, "   hi!       hHI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!    ", "hi!       hhi!hi!hi!hi!hi!hi!", (int) '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!    " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!" });
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!HI!#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!HI!#" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!HI!#");
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH", "44444444444444444444", 286);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!hhi", "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "h", "", "", "", "hi!hi!", "", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aa", 746);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
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
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray62);
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray62);
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
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "#################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!HI                      !hi!h", "aaaaaa!iH", 6, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI aaaaaa!iH          !hi!h" + "'", str4, "HI!HI aaaaaa!iH          !hi!h");
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A##!ih##!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hAH            hAH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A##!ih##!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "A##!ih##!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " !ihhi!hi!######################   !ih!ih    !i", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      ", "hi!  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!i", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("i!                    ", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                    " + "'", str2, "i!                    ");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "  hi!hi!hi!hi!hi!                                                                         ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", (java.lang.CharSequence) "clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        java.lang.CharSequence charSequence9 = null;
        char[] charArray16 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone(charSequence9, charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################!ih!ih", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                          HI!       HI!    ...", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!            hi", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                         !ih!ih                     ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Aclss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;hi!##hi!##", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hiH hiH              ", "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiH hiH              " + "'", str2, "hiH hiH              ");
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI" + "'", str1, "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IhaIhaIhaIhaIhaIhAAaIhAAaIhaIhaIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!Iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih!", "hi!", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "###################################");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", (int) '4', (int) (byte) 10);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih!ih!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ih!ih!" + "'", str6, "!ih!ih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH    !IH!IH!IH    !IH!IH    !IH!IH!IH" + "'", str1, "IH!IH    !IH!IH!IH    !IH!IH    !IH!IH!IH");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!                                ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h", 477, 97);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "                                " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("     HI!HI!HI!HI!HI!HI!                            ", "class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     HI!HI!HI!HI!HI!HI!                            " + "'", str2, "     HI!HI!HI!HI!HI!HI!                            ");
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ', 25, 14);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(objArray0, "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ");
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        char[] charArray8 = new char[] { '#', ' ', '4', '4', '#', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!#HI!HI!###HI!HI!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!hi!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!hi!hi!hi!", 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI", strArray6, strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "                                                                                                                                                                                                                                     h!ih!ih...                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI" + "'", str14, "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                      HI ! HI ! HI ! HI ! HI ! HI !                                      ", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!ihhi!  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#hi!hi!###hi!hi!#", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!444444                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!444444" + "'", str1, "hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!444444");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                 ", 42, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############                 #############" + "'", str3, "############                 #############");
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI! HI! H#HI!HI!###HI!HI!#! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###########################################################################################################hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String############################################################################################################", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String############################################################################################################" + "'", str3, "###########################################################################################################hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String############################################################################################################");
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "!IH!IH!IH!IH!IH!IHH       !IH#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "...IH    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!IH!IH!IH!IH!IH!IHH       !IH", "iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!IH!IH!IH!IH!IH!IHH       !IH" });
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi ! hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi ! hi..." + "'", str1, "Hi ! hi...");
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "###############################################################################################   hi!       !i   hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!IH!IH!IH!IH!IH!IHH       !IH!IH!IH", "   ###########               Ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi ##hi ##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi ##hi ##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!!ih!ih!ih!ihhi!!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!!ih!ih!ih!ihhi!!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!!ih!ih!ih!ihhi!!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;" + "'", str1, "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;");
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("i!hi!", 753, 759);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", 3);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", (java.lang.CharSequence[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("ih!ih                                                                                           c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc    ", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!" + "'", str4, "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "          " });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "          " + "'", str11, "          ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ih!ih                                                                                           c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc    " + "'", str12, "ih!ih                                                                                           c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc    ");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("              hIH            hIH  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIHhIH" + "'", str1, "hIHhIH");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!                                             HI!HI!                                                                                           HI!HI!                                              HI!                                             HI!HI!                                                                                           HI!HI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "                                             ", "HI", "!", "HI", "!", "                                                                                           ", "HI", "!", "HI", "!", "                                              ", "HI", "!", "                                             ", "HI", "!", "HI", "!", "                                                                                           ", "HI", "!", "HI", "!" });
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!hi!#", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaa" + "'", str2, "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaa");
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  hi! !I hi!" + "'", str2, "                  hi! !I hi!");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 25, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################" + "'", str3, "#########################");
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...a...", "aaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...a..." + "'", str2, "...a...");
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                             ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi!hi!hi!hi!hi!   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi!hi!hi!hi!   " + "'", str3, "  hi!hi!hi!hi!hi!   ");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i", "...############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ", 633);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                       !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                       !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI4HI                      44444", "hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      class [Ljava.lang.String;!class [Ljava.lang.String                      i!    hclass [Ljava.lang.String;!class [Ljava.lang.String                      i!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###################################");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###################################" + "'", str4, "###################################");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aaHIa!aHIa!aHIa!aHIa!aHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "classAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;", 80);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "i!    hi!hi!    hi!hi#######", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!ahi!", "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        char[] charArray9 = new char[] { 'a', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   hi!    ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...IH    ...", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        char[] charArray9 = new char[] { 'a', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!aaaaaaaaaaaaaa", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444   !i", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 66 + "'", int14 == 66);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!ih!ih!ih!ih!ih!ihHHHHHHHH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hii                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hii                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str1, "hii                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "             444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                    ", "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###########################################################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ", "#########################################################################################################################################################################################################################################################################################################################################################!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!########################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! " + "'", str2, "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                 ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ..." + "'", str2, "                 ...");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ...#######!ih!ih#####################...                           ", "", "hi!hi!hi!hi!hi!hi         hi!IH!IH                           AAA444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAA", "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                  ", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  " + "'", str2, "                                                  ");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444" + "'", str1, "44444444");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                  HIClass ...                                   ", 40);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  hiaaaaaaaaaaaaaaaaaaaaaaaaa   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!    hi!hi!hi!", "class [ljava.langclass [ljava.lang", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!    hi!hi!hi!" });
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                    ", "hi!hi!hi!hi!hi!hi", "ng;class [ljava.lang.str!ng;class [ljava.lang.str!ng;i!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    " + "'", str3, "                    ");
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ihhi                                               ", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   ###########               Ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hI! 44HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                ######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!IH######################!IH!I");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!ih!", 1);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!##hi!##", (java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HHI    HI!H", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("  ", ' ');
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaac", strArray10, strArray14);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aaaaaaaaaaaaaac" + "'", str16, "aaaaaaaaaaaaaac");
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!#hi!hi!###hi!hi!#", 40);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih!ih!", (java.lang.CharSequence[]) strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hiH            hiH", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi! hi                                        hi! hi");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                    !IH!IH!IH!IH!IH!IHh       !ih                                   ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!AAHI!AA", (int) '4', 310);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                         i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                      ... ! hi ! hi...", (java.lang.CharSequence) "hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa" + "'", str2, "aaaaa");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "               ", (java.lang.CharSequence) "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "class [ljava.langclass [ljava.lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!ih!ih!ih!ih!ih!ihHHHHHHHH!IH", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!i" + "'", str2, "!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#########################################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################################.." + "'", str1, "#########################################################################################################..");
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih", 1, 120);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih" + "'", str3, "ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih!ih  !ih");
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa", "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa" + "'", str2, "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!       hi!       hiaaaaaaaaa");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                             hi!hi!                                              ", (java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH!IH !!IH !IH !IH !IH !IH !IH!IH !I", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "i!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!h                                             hi!hi!                                                                                           hi!hi!                                                                                           hi!hi!                              ", (java.lang.CharSequence) "HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   HI!HI!HI!HI!HI!Hhhi ! hi ! hi ! hi ! hi ! h    HI!HI!HI!HI!HI!H   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H" + "'", str2, "!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "c  ##############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    c  aaaaaaaaaaaaaa    ###hi!##########################    !ih!ihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################..." + "'", str1, "...#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################...");
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                              !ih!ih                                            ", (java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("##########", "                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC", 965, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC" + "'", str3, "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC");
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   hia!aaahia!aaa", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi! ..." + "'", str2, "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi! ...");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!", (java.lang.CharSequence) "                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ", 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                           ", 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", (java.lang.CharSequence) "######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                ###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################                                                                                                                                                                                                                                                                                                 ", (java.lang.CharSequence) "Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih", 313);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...", (java.lang.CharSequence) "ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "iii...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  HI!HI!HI!HI!HI!                                                                         ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!..." + "'", str1, "aaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!...");
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################!ih!ih", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            hi!hi!h", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "!ih!ih" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray14 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone(charSequence7, charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI    ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   !i", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!AAHI!AA", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "     HI!HI!HI!HI!HI!HI!                            ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 727);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HIh            HIh            ", 310, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C########### Ih!ih!ih!i", " !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i", 16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C########### Ih!ih!ih!i" });
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("########################################################################################################################", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################################################" + "'", str3, "########################################################################################################################");
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 630 + "'", int3 == 630);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih", "!ih!ih", "!ih!ih", "!ih!ih", "!ih!ih", "!ih!ih", "!ih!ih", "!ih!ih" });
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       !ih", "hi!hi!hi!hi!hi!hi!", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       !ih" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       !ih" + "'", str4, "       !ih");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       !ih" + "'", str5, "       !ih");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       !ih" + "'", str6, "       !ih");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "  hi!hi!hi!hi!hi!   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str3, "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!aaaaaaaaaaaaaa", "HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("          hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          hi!hi!h" + "'", str1, "          hi!hi!h");
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("i!    hi!hi!    hi!hi!hi!    hi!hi!  ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!    hi!hi!    hi!hi!hi!    hi!hi!  " + "'", str2, "i!    hi!hi!    hi!hi!hi!    hi!hi!  ");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaClss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hI! 44HI!", "    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "I!HI!", (java.lang.CharSequence) "aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                   hi!       hHI!HI!HI!HI!HI!HI!                                      hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!h", "hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   hi!       hHI!HI!HI!HI!HI!HI!                                      hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!h" + "'", str2, "                                   hi!       hHI!HI!HI!HI!HI!HI!                                      hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!h");
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 747 + "'", int2 == 747);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i", 729);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i" + "'", str2, "...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("  ", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#########hi!              #########", 81, "hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi   hi!       hi!       hihi!       hi!       hi! hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       hi!       hihi!       hi!       hi!h#########hi!              #########" + "'", str3, "hi!       hi!       hihi!       hi!       hi!h#########hi!              #########");
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!HI!HI!!HI!HI!!HI...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                    !ih!ih!ih!ih!ih!ihH       !IH                                   ", "44444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    !ih!ih!ih!ih!ih!ihH       !IH                                   " + "'", str2, "                                    !ih!ih!ih!ih!ih!ihH       !IH                                   ");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ", "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!  hi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      " + "'", str3, "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                     ai!ai!ai!ai!ai!aai!ai!ai!ai!ai!HIai!ai!ai!ai!ai!aai!ai!ai!ai!ai!!ai!ai!ai!ai!ai!aai!ai!ai!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" });
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", (java.lang.CharSequence) "IhaIhaIhaIhaIhaIhAAaIhAAaIhaIhaIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH!!IH!", "         4                                                                                                                                                                                                                                                                                                                ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!!IH!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "IH!!IH" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str1, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("         4", "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         4" + "'", str2, "         4");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!  hi!                                ", (java.lang.CharSequence) "Aaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "class ...", (java.lang.CharSequence) "          hi!hi!h          hi!hi!h                                    !i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                  ", "################################################################################################### hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  " + "'", str2, "                                  ");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "c  aaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s[ljv.lng.string;clss[ljv.lng.string;cls" + "'", str2, "s[ljv.lng.string;clss[ljv.lng.string;cls");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", "hi!hi!    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str2, "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            HI!HI!H", "4444###################", 413);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            HI!HI!H" });
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaa                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) " !ih!ih", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "   HI!       HHI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAA");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ih!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih!ih!ih" + "'", str2, "ih!ih!ih!ih");
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", (java.lang.CharSequence) "444444Ahi!##hi!##A", 477);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################!", "444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "######################!" });
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ih!ih!ih!ih!ihH444444444444444444444444444444HI!HI!HI!H...H4444444444444444444444", (java.lang.CharSequence) "IIIIIIIIIIIIIIHi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

