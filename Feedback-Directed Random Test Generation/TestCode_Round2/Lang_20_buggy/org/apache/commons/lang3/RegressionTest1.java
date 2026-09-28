package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "   hi!    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (byte) -1, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih       ", "", "hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih       " + "'", str3, "!ih       ");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", 96, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH       ", "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("       hi!                                                                                          ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!                                                                                          " + "'", str2, "       hi!                                                                                          ");
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                hi!", (java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!ih       !ih       !ih       !ih       !ih       !ih       !ih", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih" + "'", str2, "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih");
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "                                !                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                         hi", "!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi" + "'", str2, "                         hi");
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH" + "'", str1, "IH");
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                         hi!", "   hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!" + "'", str2, "                         hi!");
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "IH", (java.lang.CharSequence) "       HI!                                                                                          ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!IH                         hi!        ", "       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                         hi!        " + "'", str2, "!IH                         hi!        ");
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                !                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                !                             hi!                             hi! " + "'", str1, "                                !                             hi!                             hi! ");
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!", 7, "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!    " + "'", str3, "HI!    ");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("       HI!                                                                                          ", "!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!                                                                                          " + "'", str2, "       HI!                                                                                          ");
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                         hi!", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!" + "'", str2, "                         hi!");
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                HI!                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                             hi!                             hi!" + "'", str1, "HI!                             hi!                             hi!");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!    " + "'", str1, "HI!    ");
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" });
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!" + "'", str2, "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "HI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       hi!", (java.lang.CharSequence) "IH", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", 92, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("####################################################################################################", "!ih       HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                         hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih                         " + "'", str1, "ih                         ");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                      hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str1, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", charSequence1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "IH", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents(" ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " ...                       hi!!ih                                       hi!!ih       hi!!ih       ..." + "'", str1, " ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                !                             hi!                             hi! ", (java.lang.CharSequence) "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!IH       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH       " + "'", str1, "!IH       ");
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("       ...", "                                HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                HI                                HI!                             HI!                             HI! ", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI                                HI!                             HI!                             HI! " + "'", str2, "                                HI                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                HI!                             hi!                             hi! ", (java.lang.CharSequence) "HI!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI                                HI!                             HI!                             HI!" + "'", str1, "HI                                HI!                             HI!                             HI!");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI!                             hi!                             hi! ", "                         hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                             hi!                             hi! " + "'", str2, "HI!                             hi!                             hi! ");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (java.lang.CharSequence) "                                                !IH                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" ...                       hi!!ih                                       hi!!ih       hi!!ih       ...", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ...                       hi!!ih                                       hi!!ih       hi!!ih       ..." + "'", str2, " ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", (java.lang.CharSequence) "HI!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       " + "'", str1, "                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ");
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!!!!!!!!!!!!!!!!!!!!!!", (int) (byte) 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) (byte) 100, (int) (short) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!!!!!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" ", 27, "hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str3, " hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 9, "                                !                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         " + "'", str3, "         ");
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "       HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "...                       hi!!ih                                       hi!!ih       hi!!ih       ...", (java.lang.CharSequence) "       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                       hi!!ih                                       hi!!ih       hi!!ih       ..." + "'", str1, "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih" + "'", str1, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih");
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!!!!!!!!!!!!!!!!!!!!!!!!", "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                HI!                             hi!                             hi! ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("HI!", "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 92 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI" });
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                !                             hi!                             hi! ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "       ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih       ", "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih       " + "'", str2, "!ih       ");
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI!                             hi!                             hi! ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                             hi!                             hi! " + "'", str2, "HI!                             hi!                             hi! ");
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!ih       ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!!!!!!!!!!!!!!!!!!!!!", "HI!                             hi!                             hi! ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!", "         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!", 7, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                       hi!!ih                                       hi!!ih       hi!!ih       ..." + "'", str1, "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!!!!!!!!!!!!!!!!!!!!!!!!!", "                         hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#', (int) (byte) 0, (int) (byte) 1);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                HI!", '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", strArray11, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "                         ", "                         ", "                         ", "                                ", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "                                HI!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                HI!" + "'", str21, "                                HI!");
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                hi!" + "'", str1, "                                hi!");
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                         hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!" + "'", str2, "                         hi!");
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                HI", (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                               ...", "IH", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               ..." + "'", str3, "                               ...");
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       ...", "HI!                             hi!                             hi! ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       ..." });
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI!    ", (java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 96, (int) ' ');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                HI!                             HI!                             HI! ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!                             HI!                             HI! " + "'", str2, "                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                HI                                HI!                             HI!                             HI! ", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                HI!                             HI!                             HI! ", "                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!                             HI!                             HI! " + "'", str2, "                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ih                         ", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                             hi!                                                                    ", (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("####################################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!                             hi!                             hi! ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!!!!!!!!!!!!!!!!!!!!!!!", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!                             hi!                             hi!", 96, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                HI                                HI!                             HI!                             HI! ", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! " + "'", str4, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4", 96, "   hi!           HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4" + "'", str3, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                HI                                HI!                             HI!                             HI! ", (int) '4', "ih                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                HI                                HI!                             HI!                             HI! " + "'", str3, "                                HI                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" ", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                HI!                             HI!                             HI! ", (java.lang.CharSequence) " ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "hI!", "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH" + "'", str3, "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str3, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "                                !                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str3, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4", "                      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4" + "'", str2, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ", (java.lang.CharSequence) "HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "       HI!", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("         ", "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!", "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                         hi!", (java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!ih       !ih       !ih       !ih       !ih       !ih       !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH" + "'", str1, "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH");
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                             hi!", (java.lang.CharSequence) "####################################################################################################", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                HI!", (java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "         ", (java.lang.CharSequence) "HI                                HI!                             HI!                             HI!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str2, "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!" + "'", str2, "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!" + "'", str1, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!");
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ", "         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih       HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih       HI!" + "'", str1, "!ih       HI!");
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", "!ih       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          ", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "                         hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str2, "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!" + "'", str1, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!");
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih" + "'", str1, "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih");
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str1, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "!IH       ", (java.lang.CharSequence) "       HI!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH       ", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH       " });
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str1, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!!!!!!!!!!!!!!!!!!!!!!", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                      hi!", (java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!!!!!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hI!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str2, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########");
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                HI", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI" + "'", str2, "                                HI");
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "!IH       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str3, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (int) '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str3, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI", 0, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI" + "'", str3, "HI");
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str3, "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                HI!                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                hi!                             hi!                             hi! " + "'", str1, "                                hi!                             hi!                             hi! ");
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          ", (int) '4', "       HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       HI!                            HI!           " + "'", str3, "       HI!                            HI!           ");
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                      hi!", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   hi!           HI!", 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!           HI!" + "'", str3, "  hi!           HI!");
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                !IH                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih " + "'", str3, "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       hi!!ih       hi!!ih                                       hi!!ih                       ..." + "'", str1, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       ...", (int) (short) 10, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          ", "       hi!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                !                             hi!                             hi! ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                ", "!", "                             ", "hi", "!", "                             ", "hi", "!", " " });
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str2, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "       HI!                            HI!           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi!                                                                    ", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (int) 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str3, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                hi                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                hi                                HI!                             HI!                             HI!" + "'", str1, "                                hi                                HI!                             HI!                             HI!");
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                !IH                                                 ", "                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH                                                 " + "'", str2, "IH                                                 ");
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!", 13, "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iHHiHI!!iHHi" + "'", str3, "!iHHiHI!!iHHi");
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "       HI!                            HI!           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" });
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih" + "'", str1, "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih");
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!IH       ", (java.lang.CharSequence) "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("IH                                                 ", "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       hi!!ih       hi!!ih                                       hi!!ih                       ..." + "'", str2, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                hi!                             hi!                             hi! ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!    ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!    " + "'", str2, "HI!    ");
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########hi!HI!####################################################################################" + "'", str2, "##########hi!HI!####################################################################################");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...                       hi!!ih                                       hi!!ih       hi!!ih       ...", (int) (byte) 100, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      hi!!ih       ..." + "'", str3, "...      hi!!ih       ...");
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("       HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI!                                                                                          " + "'", str1, "       HI!                                                                                          ");
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...      hi!!ih       ...", "       HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...      hi!!ih       ..." + "'", str2, "...      hi!!ih       ...");
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                             hi!                                                                    ", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        java.lang.CharSequence[] charSequenceArray0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!", "       hi!                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I" });
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   hi!           HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########", (java.lang.CharSequence) "       HI!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                ", "hi", "!!", "ih", "                                       ", "hi", "!!", "ih", "       ", "hi", "!!", "ih", "              ", "hi", "!!", "ih", "       ", "!!!!!!!!!!!!!!!!!!!!!!!!!!", "ih", "       ", "hi", "!" });
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                HI!", 79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" ...                       hi!!ih                                       hi!!ih       hi!!ih       ...", "       HI!", "##########hi!HI!####################################################################################", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " ...                       hi!!ih                                       hi!!ih       hi!!ih       ..." + "'", str4, " ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!", (java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       hi!                                                                                          ", 9, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "       hi!", (java.lang.CharSequence) "!iHHiHI!!iHHi", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                hi                                HI!                             HI!                             HI!", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi                                HI!                             HI!                             HI!" + "'", str2, "                                hi                                HI!                             HI!                             HI!");
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!                             hi!                             hi! ", (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                               ...", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               ..." + "'", str3, "                               ...");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4", (java.lang.CharSequence) "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4" + "'", charSequence2, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", (java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("IH", 13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "       hi!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", (java.lang.CharSequence) "                                HI                                HI!                             HI!                             HI! ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("   hi!           HI!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!           HI!" + "'", str2, "   hi!           HI!");
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########");
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "                         hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str2, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!                             hi!                             hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                             hi!                             hi!" + "'", str2, "HI!                             hi!                             hi!");
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI                                HI!                             HI!                             HI!", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!", " hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!" + "'", str2, "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!");
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                hi!                             hi!                             hi! ", (java.lang.CharSequence) "                             hi!                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   hi!    ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("##########hi!HI!####################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########hi!HI!###################################################################################" + "'", str1, "##########hi!HI!###################################################################################");
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!!!!!!!!!!!!!!!!!!!!!!", (int) (byte) 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!!!!!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...       hi!!ih       hi!!ih                                       hi!!ih                       ...", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       ...", (java.lang.CharSequence) "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ih                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih" + "'", str1, "ih");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!                             hi!                             hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! hi! hi!" + "'", str1, "HI! hi! hi!");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "IH                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", "       hi!", 100);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!", (java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!!!!!!!!!!!!!!!!!!!!!!!", 2, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########", (java.lang.CharSequence) "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "       HI!", (java.lang.CharSequence) "HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                             hi!                             hi!" + "'", str1, "HI!                             hi!                             hi!");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "                         hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                               ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                               ", "..." });
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                               ...", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!!!!!!!!!!!!!!!!!!!!!!!!!", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str4, "!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                HI!                             hi!                             hi! ", "                               ...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...", 6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                HI!                             hi!                             hi! " });
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 96, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "####################################################################################################", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "HI", (java.lang.CharSequence) "                             hi!                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) " ", (java.lang.CharSequence) "       HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + " " + "'", charSequence2, " ");
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                 hi!", "                                hi!                             hi!                             hi! ", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   " + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ");
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!                             hi!                             hi!", "##########hi!HI!###################################################################################", "   hi!           HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                   " + "'", str3, "                                                                   ");
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI", "HI!                             hi!                             hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI" + "'", str3, "HI");
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" hI!hI!hI!hI!hI!hI!hI!hI!hI", (int) '4', "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ", "...      hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" ", "!IH       ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "hi!                         hi!                         hi!                         hi!                                hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih" + "'", str3, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih");
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       " + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ");
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                hi!", (java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...      hi!!ih       ...", "                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      hi!!ih       ..." + "'", str3, "...      hi!!ih       ...");
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih       HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih       HI!" + "'", str1, "!ih       HI!");
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                             hi!                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             hi!                                                                    " + "'", str1, "                             hi!                                                                    ");
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...       hi!!ih       hi!!ih                                       hi!!ih                       ...", "!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       hi!!ih       hi!!ih                                       hi!!ih                       ..." + "'", str2, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!ih       HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       hi!                                                                                          ", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("!IH                         hi!        ", "!!!!!!!!!!!!!!!!!!!!!!!!", 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 98 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "IH                         hi!        " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "IH" });
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", (java.lang.CharSequence) "##########hi!HI!###################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       HI!                                                                                          ", (int) (byte) 10, "       hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       HI!                                                                                          " + "'", str3, "       HI!                                                                                          ");
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", charSequence2, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       HI!                                                                                          ", (java.lang.CharSequence) "       HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                HI                                HI!                             HI!                             HI! ", "                         hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI                                HI!                             HI!                             HI! " + "'", str2, "                                HI                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!                             hi!                             hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             hi!                             hi!" + "'", str2, "                             hi!                             hi!");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                             hi!                             hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             hi!                             hi!" + "'", str1, "                             hi!                             hi!");
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", (java.lang.CharSequence) "!IH       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "##########hi!HI!####################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", (java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                hi!", "!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi" + "'", str2, "                                hi");
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("ih                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih                         " + "'", str1, "ih                         ");
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", (java.lang.CharSequence) "HI!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", (java.lang.CharSequence) "                         hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!!!!!!!!!!!!!!!!!!!!!!", 0, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI" + "'", str4, "HI");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   hi!    ", "!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    " + "'", str2, "   hi!    ");
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                HI!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ih", (java.lang.CharSequence) "HI! hi! hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Threshold must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!                         hi!                         hi!                         hi!                                hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                         hi!                         hi!                         hi!                                hi!" + "'", str2, "hi!                         hi!                         hi!                         hi!                                hi!");
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ", "   hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   " + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       HI!                            HI!           ", " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                             hi!", (java.lang.CharSequence) "                               ...", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                hi!", (java.lang.CharSequence) "HI!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!IH                         hi!        ", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ", (java.lang.CharSequence) "!IH       ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                      hi!", (int) '#', "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhh                      hi!" + "'", str3, "hhhhhhhhhh                      hi!");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                             hi!                             hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                             hi!" + "'", str1, "hi!                             hi!");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                hi!                             hi!                             hi! ", charSequence1, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IH                                                 ", "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH                                                 " + "'", str2, "IH                                                 ");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "####################################################################################################", (java.lang.CharSequence) "   hi!           HI!", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                !IH                                                 ", "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str2, "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!                         hi!                         hi!                         hi!                                hi!", "                                HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("ih                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str3, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########", 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "                                !                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", charSequence2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", charSequence2, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!    " + "'", str1, "   hi!    ");
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI!", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!" + "'", str3, "hI!");
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       hi!", "", (int) (short) 100);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                             hi!                                                                    ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("       hi!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", "   hi!    ", "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       " + "'", str4, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ");
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI                                HI!                             HI!                             HI!", (java.lang.CharSequence) "                                !                             hi!                             hi! ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "IH                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...       hi!!ih       hi!!ih                                       hi!!ih                       ...", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       hi!!ih       hi!!ih                                       hi!!ih                       ..." + "'", str3, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str2, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...      hi!!ih       ...", "####################################################################################################", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      hi!!ih       ..." + "'", str3, "...      hi!!ih       ...");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... hi!!ih hi!!ih hi!!ih ..." + "'", str1, "... hi!!ih hi!!ih hi!!ih ...");
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                hi                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi                                HI!                             HI!                             HI!" + "'", str1, "hi                                HI!                             HI!                             HI!");
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   hi!           HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!HI!" + "'", str1, "hi!HI!");
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!                             hi!                             hi! ", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########");
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!" + "'", str1, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ", (java.lang.CharSequence) "!IH                         hi!        ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!", "hI!hI!hI!hI!hI!hI!hI!hI!hI", "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!", (java.lang.CharSequence) "HI!                             hi!                             hi! ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "", "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       " + "'", str3, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                             hi!                             hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             hi!                             hi!" + "'", str2, "                             hi!                             hi!");
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                             hi!                             hi!", (java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                             hi!                             hi!" + "'", charSequence2, "                             hi!                             hi!");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str2, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                         hi!", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!" + "'", str2, "                         hi!");
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "", (int) (byte) 100, 87);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                hi                                HI!                             HI!                             HI!", (int) '#', "!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi                                HI!                             HI!                             HI!" + "'", str3, "                                hi                                HI!                             HI!                             HI!");
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "   hi!    ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                HI!                             HI!                             HI! ", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                HI!                             HI!                             HI! " + "'", str8, "                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str10, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                HI!                             HI!                             HI! ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       HI!                            HI!           ", (-1), '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       HI!                            HI!           " + "'", str3, "       HI!                            HI!           ");
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH       ", (int) (byte) 10, "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH       " + "'", str3, "!IH       ");
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                             hi!                             hi!", "                               ...", "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             hi!                             hi!" + "'", str3, "                             hi!                             hi!");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "   hi!           HI!", (java.lang.CharSequence) "...      hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!", 6, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "HI                                HI!                             HI!                             HI!", (java.lang.CharSequence) "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!!!!!!!!!!!!!!!!!!!!!!!!!", "                         hi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) 10, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "   hi!    ", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "... hi!!ih hi!!ih hi!!ih ...", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####################################################################################################", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################" + "'", str2, "################################################################################################");
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                   ", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "####################################################################################################", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "       HI!                            HI!           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                 hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 hi!" + "'", str3, "                                                                                                 hi!");
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...", (java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                !                             hi!                             hi! ", (java.lang.CharSequence) "HI!    ", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                               ...", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 hi!", "                                                !IH                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                HI", (java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "       ...", (java.lang.CharSequence) "   hi!    ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "       HI!                                                                                          ", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!                             hi!                             hi! ", " ...                       hi!!ih                                       hi!!ih       hi!!ih       ...", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "                                HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str2, "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!" + "'", str2, "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!HI!", (java.lang.CharSequence) "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", (java.lang.CharSequence) "HI!    ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi                                HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str1, "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########", (java.lang.CharSequence) "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             " + "'", str2, "             ");
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!", "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...      hi!!ih       ...", (java.lang.CharSequence) "                                HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   hi!           HI!", "         ", "HI!                             hi!                             hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!HI!                             hi!                             hi!  HI!" + "'", str3, "   hi!HI!                             hi!                             hi!  HI!");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!", (int) ' ', 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI! hi! hi!" + "'", str1, "hI! hi! hi!");
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                             hi!                             hi!", 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       hi!!ih       hi!!ih                                       hi!!ih                       ..." + "'", str1, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH                         hi!        ", (java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4" + "'", str1, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "          ", (java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...      hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...      hi!!ih       ..." + "'", str1, "...      hi!!ih       ...");
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...      hi!!ih       ...", "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...      hi!!ih       ..." + "'", str2, "...      hi!!ih       ...");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI!", (java.lang.CharSequence) "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hi", "!", "hi", "!!!!!!!!!!!!!!!!!!!!!!!!!!", "hi", "!" });
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "       hi!", (java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                hi!                             hi!                             hi! ", (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                   ", "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                   " + "'", str3, "                                                                   ");
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       hi!" + "'", str1, "       hi!");
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...      hi!!ih       ...", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...      hi!!ih       ..." + "'", str2, "...      hi!!ih       ...");
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "ih                         ", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", 18, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str3, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!", "IH", "           ", "!", "ih", "   ", "##########" });
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" });
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih", "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "             ", 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih" + "'", str4, "!ih");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                HI!", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "             ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                HI!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                HI!" + "'", str6, "                                HI!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########", (java.lang.CharSequence) " hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   hi!           HI!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!           HI!" + "'", str2, "   hi!           HI!");
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!    ", (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                               ...", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                 hi!", 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       hi!", "", (int) (short) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!!!!!!!!!!!!!!!!!!!!!!", (int) (byte) 1);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                      hi!", (java.lang.CharSequence[]) strArray11);
        java.lang.Class<?> wildcardClass13 = strArray11.getClass();
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "       hi!");
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        java.lang.reflect.Type[] typeArray18 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass13, wildcardClass17 };
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(typeArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "!!!!!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str19, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "!iHHiHI!!iHHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                       hi!!ih                                       hi!!ih       hi!!ih       ...", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", 87);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                hi                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                hi                                HI!                             HI!                             HI! " + "'", str1, "                                hi                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny(charSequence1, charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!                             hi!                             hi! ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!                             hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", (java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("!!!!!!!!!!!!!!!!!!!!", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!hi!                             hi!hi!hi!                             hi!hi!" + "'", str4, "HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                ", "hi", "!!", "ih", "                                       ", "hi", "!!", "ih", "       ", "hi", "!!", "ih", "              ", "hi", "!!", "ih", "       ", "!!!!!!!!!!!!!!!!!!!!!!!!!!", "ih", "       ", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                HI!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", "                         hi", "   hi!HI!                             hi!                             hi!  HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  !!                                    !!                                    !!                                    !!                                           !!  " + "'", str3, "  !!                                    !!                                    !!                                    !!                                           !!  ");
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str1, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH                         hi!        ", (java.lang.CharSequence) "                         hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH" + "'", str1, "!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH");
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (java.lang.CharSequence) "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                hi");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                ", "hi" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                             hi!                                                                    ", (java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "...       hi!!ih       hi!!ih                                       hi!!ih                       ...", (java.lang.CharSequence) "HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!hi!                             hi!hi!hi!                             hi!hi!", 31, "       HI!                            HI!           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!hi!                             hi!hi!hi!                             hi!hi!" + "'", str3, "HI!hi!                             hi!hi!hi!                             hi!hi!");
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", (java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "       HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!", "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                         hi!", (java.lang.CharSequence) "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("       HI!                            HI!           ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!                            HI!           " + "'", str2, "       HI!                            HI!           ");
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih       HI!", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str1, "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                !IH                                                 ", (java.lang.CharSequence) "                                                                                                 hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...       hi!!ih       hi!!ih                                       hi!!ih                       ...", 34, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  hi" + "'", str3, "                                  hi");
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##########hi!HI!###################################################################################", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########hi!HI!###################################################################################" + "'", str2, "##########hi!HI!###################################################################################");
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!                             hi!", "hI!hI!hI!hI!hI!hI!hI!hI!hI", "       HI!                            HI!           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                             hi!" + "'", str3, "hi!                             hi!");
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "             ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str1, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", (java.lang.CharSequence) "                                HI!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "  !!                                    !!                                    !!                                    !!                                           !!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                HI!", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!" + "'", str2, "                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!                                HI!");
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH" + "'", str1, "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH");
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                HI                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                         hi!", "HI!hi!                             hi!hi!hi!                             hi!hi!", 39, 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!" + "'", str4, "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                hi!", (java.lang.CharSequence) "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", (java.lang.CharSequence) "                                                !IH                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                             hi!                             hi!", (java.lang.CharSequence) "!ih       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("       HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       hi!" + "'", str1, "       hi!");
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("IH                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hi!hi!hi!hi!hi!hi!" + "'", str1, "HI!hi!hi!hi!hi!hi!hi!");
    }
}

