package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.lang.WordUtils wordUtils0 = new org.apache.commons.lang.WordUtils();
        java.lang.Class<?> wildcardClass1 = wordUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        char[] charArray7 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.Class<?> wildcardClass9 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (short) 100, "hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hI!", (int) (short) -1, (int) (short) 100, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hI!", (int) (short) 0, 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (-1), "h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhih!" + "'", str4, "hhih!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) '4', 10, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) '#', "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) (short) 1, "hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hI!", (int) ' ', (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) (short) 1, "hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhih!", (int) (short) -1, "hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhih!" + "'", str4, "hhih!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hI!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) 'a', "h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhih!" + "'", str4, "Hhih!");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhih!" + "'", str1, "hhih!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIH!" + "'", str1, "HHIH!");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", 10, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (short) 0, (int) (short) 100, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhih!", (int) '4', "Hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhih!" + "'", str4, "hhih!");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hI!", 0, "HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) 'a', "HHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHIH!", (int) (byte) -1, "hI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str4, "HhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHIH!", (int) ' ', "hI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHIH!" + "'", str4, "HHIH!");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHIH!" + "'", str1, "hHIH!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        char[] charArray8 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhih!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhih!" + "'", str2, "hhih!");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhih!" + "'", str2, "Hhih!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHIH!" + "'", str1, "hHIH!");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIH!" + "'", str1, "HHIH!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhih!" + "'", str1, "hhih!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhih!" + "'", str1, "hhih!");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!" + "'", str7, "hI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        char[] charArray8 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhih!" + "'", str10, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) '4', "hHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhih!" + "'", str4, "Hhih!");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHIH!", (int) (byte) 10, "HHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHIH!" + "'", str4, "HHIH!");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        char[] charArray8 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHIH!", 10, (-1), "HHIH!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", 0, "hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!ihi!!" + "'", str4, "Hhi!ihi!!");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!IhI!HhI!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str2, "HhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhih!" + "'", str12, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) 'a', "hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!IHI!!" + "'", str1, "hHI!IHI!!");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!IhI!HhI!!", 0, "hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str4, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", (int) '4', "Hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (short) 0, (int) (byte) 10, "Hhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str1, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) (short) 0, "h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str4, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", (int) (byte) 100, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str4, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str17, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhih!" + "'", str2, "Hhih!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", (-1), "H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str2, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", (int) (short) 10, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", 10, "Hhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) '4', 0, "HhI!HhI!IhI!HhI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1, "Hhi!ihi!!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!IHI!!", (int) (byte) 100, 100, "HHIH!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str22, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (int) (short) 1, "Hhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str4, "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!IhI!HhI!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str2, "hhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!HhI!IhI!HhI!!", (int) (byte) 0, (int) ' ', "Hhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str4, "HhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) ' ', "Hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str4, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (-1), 100, "HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!IHI!!" + "'", str2, "hHI!IHI!!");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (byte) 10, (int) (short) -1, "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhih!", 100, (int) (short) 10, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str1, "hhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) (byte) 10, (int) (byte) -1, "Hhi!ihi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str2, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHIH!", (int) '#', (int) (byte) 100, "Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (-1), "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!IHI!!" + "'", str1, "hHI!IHI!!");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHIH!" + "'", str1, "hHIH!");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhih!", 100, (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str2, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", (int) 'a', "hHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        char[] charArray7 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass9 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!ihi!!", (int) (byte) 1, "Hhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) -1, (int) (byte) -1, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!" + "'", str6, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str1, "HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!IhI!HhI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str18, "hhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hi!", (int) 'a', 0, "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!ihi!!" + "'", str22, "hhi!ihi!!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!ihi!!", (int) (byte) 0, (int) (byte) 100, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!ihi!!" + "'", str4, "Hhi!ihi!!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 0, (int) (byte) 10, "HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhHHIH!" + "'", str4, "hHhhhih!hhHHIH!");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHIH!HHhhih!" + "'", str1, "HhHHHIH!HHhhih!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) 'a', (int) '4', "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHhhih!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHIH!HHhhih!" + "'", str2, "HhHHHIH!HHhhih!");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!IHI!!", (-1), "hHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str4, "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (-1), "Hhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHIH!" + "'", str4, "hHIH!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!ihi!!", (int) (byte) -1, (int) (byte) 100, "hHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!ihi!!" + "'", str4, "Hhi!ihi!!");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHIH!", (-1), (int) ' ', "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHIH!" + "'", str4, "HHIH!");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) '4', "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str4, "HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (short) 0, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhih!" + "'", str12, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) (short) 100, (int) '4', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhih!" + "'", str2, "Hhih!");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhih!" + "'", str14, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray17);
        java.lang.Class<?> wildcardClass29 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!ihi!!" + "'", str28, "Hhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1, "Hhi!ihi!!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str17, "HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str2, "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hi!", 0, (-1), "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", (int) (short) 100, 0, "Hhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (short) 100, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1, "Hhi!ihi!!");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", 10, "hhI!HhI!IhI!HhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!IHI!!" + "'", str1, "HHI!IHI!!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!hHi!iHi!hHi!!" + "'", str1, "hHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!ihi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!ihi!!" + "'", str2, "Hhi!ihi!!");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", 100, (int) (byte) 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", (int) (short) 10, "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) '4', (int) (short) 100, "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) '#', (int) ' ', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!ihi!!" + "'", str2, "Hhi!ihi!!");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (byte) -1, (int) (byte) 0, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", (-1), (int) 'a', "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str4, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str15, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHIH!", (int) (byte) 1, (int) (byte) 100, "HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHIH!" + "'", str4, "hHIH!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) 'a', (int) (byte) -1, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHIH!", 0, (int) (byte) 0, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!ihi!!" + "'", str4, "hhi!ihi!!");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str2, "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!ihi!!" + "'", str1, "hhi!ihi!!");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!ihi!!", 10, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!ihi!!" + "'", str4, "Hhi!ihi!!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!IHI!!" + "'", str1, "HHI!IHI!!");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhHHIH!", 100, (int) (short) -1, "hHhhhih!hhHHIH!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 15");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!IhI!HhI!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str2, "HhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!HhI!IhI!HhI!!", (int) (byte) 1, (int) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!Ih" + "'", str4, "HhI!HhI!Ih");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", (int) (short) 1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", 100, (int) (short) 10, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 10, (int) ' ', "hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", 0, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!ihi!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HI!", 100, "Hhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str2, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str2, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) (short) 10, 100, "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!ihi!!" + "'", str21, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) 'a', (int) (byte) 1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!Ih", (int) (short) 10, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!Ih" + "'", str4, "HhI!HhI!Ih");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) (short) 100, "HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray17);
        java.lang.Class<?> wildcardClass29 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhih!" + "'", str26, "hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhih!" + "'", str28, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHIH!" + "'", str2, "hHIH!");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHhhih!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHIH!HHhhih!" + "'", str2, "HhHHHIH!HHhhih!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!hHi!iHi!hHi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str2, "HHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) (byte) 100, (int) 'a', "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 47");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhih!" + "'", str27, "hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!ihi!!" + "'", str29, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str14, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhHHIH!", (-1), "hHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str4, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!hHi!iHi!hHi!!", (int) 'a', (int) ' ', "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 17");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhHHIH!", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str19, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhih!" + "'", str20, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!hHi!iHi!hHi!!", 10, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str4, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str1, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str1, "hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHIH!" + "'", str2, "hHIH!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) (short) -1, 100, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str4, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!IhI!HhI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str2, "hhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str1, "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 1, "HHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str1, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str2, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhih!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhih!" + "'", str2, "Hhih!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!ihi!!", (int) (short) 100, "HHi!hHi!iHi!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!ihi!!" + "'", str4, "hhi!ihi!!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHIH!" + "'", str2, "hHIH!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str2, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str2, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str22, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", (int) '#', "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (short) 0, "hI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str30, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", 1, "HhI!HhI!Ih", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) (short) 10, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!IhI!HhI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str2, "hhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhHHIH!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhih!hhHHIH!" + "'", str2, "hHhhhih!hhHHIH!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str2, "hHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", 10, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) 'a', "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) '#', (int) 'a', "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str24, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!IHI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!IHI!!" + "'", str2, "hHI!IHI!!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray17);
        java.lang.Class<?> wildcardClass29 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHIH!" + "'", str27, "HHIH!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hi!", (int) (short) 1, (int) '#', "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1, "Hhi!ihi!!");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 1, "hhI!HhI!IhI!HhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHhhih!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHIH!HHhhih!" + "'", str2, "HhHHHIH!HHhhih!");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str18, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhih!" + "'", str25, "hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!HhI!Ih" + "'", str1, "HhI!HhI!Ih");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!ihi!!" + "'", str1, "hhi!ihi!!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHI!HHI!!", (int) (short) 100, (int) (byte) 10, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 17");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) (short) -1, 1, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", (int) (byte) -1, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str4, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) ' ', (int) (byte) 10, "HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1, "Hhi!ihi!!");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhHHIH!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhhih!hhHHIH!" + "'", str2, "hHhhhih!hhHHIH!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!ihi!!", 10, 0, "hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!ihi!!" + "'", str29, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str30, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str1, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str1, "HhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str1, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihi!hhi!!", (int) (short) 1, (int) (byte) 100, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ih" + "'", str1, "Hhi!hhi!ih");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str2, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!Ih", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HhI!Ih" + "'", str2, "HhI!HhI!Ih");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        char[] charArray8 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhih!" + "'", str10, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hI!" + "'", str22, "hI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str23, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHIH!" + "'", str24, "hHIH!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str25, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str26, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("h", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", (int) (short) 0, (int) (short) 1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str2, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str1, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (byte) 1, (int) (short) -1, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) '#', "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str24, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str26, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str19, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHIH!" + "'", str1, "hHHHHIH!HHHHIH!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!Ih", (int) (short) 10, "h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!Ih" + "'", str4, "HhI!HhI!Ih");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str11, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhih!" + "'", str12, "Hhih!");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!hHi!iHi!hHi!!" + "'", str1, "hHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str12, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str2, "hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhih!" + "'", str11, "Hhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", 0, (int) (byte) 10, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", (int) 'a', (int) (byte) 1, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (byte) -1, (int) (short) 0, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str4, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", 0, (int) (short) 1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!ihi!!", (int) (short) 1, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!ihi!!" + "'", str4, "Hhi!ihi!!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhi!ihi!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) (short) 10, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str4, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hI!" + "'", str22, "hI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str23, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHIH!" + "'", str24, "hHIH!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str25, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str26, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str16, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) '#', (int) ' ', "hHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (short) 1, (int) (short) 10, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str4, "Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str19, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str21, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str22, "HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHIH!", (int) (short) 0, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHIH!" + "'", str4, "hHHHHIH!HHHHIH!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("H", charArray17);
        java.lang.Class<?> wildcardClass29 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str27, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!ihi!!" + "'", str2, "Hhi!ihi!!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhih!hhhhhih!hihhhih!hhhhhih!h!", 0, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str4, "hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ih" + "'", str1, "hhi!hhi!ih");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str2, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!ihi!!" + "'", str1, "Hhi!ihi!!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhih!" + "'", str2, "Hhih!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str21, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHIH!" + "'", str22, "hHIH!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str2, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHIH!" + "'", str7, "HHIH!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str8, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str18, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str19, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhih!" + "'", str2, "Hhih!");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str2, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", (int) (short) 10, (int) (short) 0, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str4, "Hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHIH!", 10, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) (short) 100, (int) (byte) 100, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", (int) (short) 10, "Hhi!hhi!ih", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str4, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str8, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHIH!HHhhih!" + "'", str1, "hhHHHIH!HHhhih!");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", (int) (short) 0, "hI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str2, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhih!" + "'", str2, "Hhih!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str1, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str1, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }
}

